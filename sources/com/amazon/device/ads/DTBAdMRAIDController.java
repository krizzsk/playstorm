package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.amazon.device.ads.SDKUtilities;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class DTBAdMRAIDController implements DTBActivityListener {
    static final String LOG_TAG = DTBAdMRAIDController.class.getSimpleName();
    static final String MRAID_CLOSE = "window.mraid.close();";
    private static final String MRAID_READY = "window.mraidBridge.event.ready();";
    DTBAdView adView;
    LinearLayout closeIndicatorRegion;
    DTBMRAIDCloseButtonListener customButtonListener;
    private DtbOmSdkSessionManager dtbOmSdkSessionManager;
    private boolean isTwoPartExpand = false;
    private boolean jsReady = false;
    private Rect lastRect;
    private MraidExposure lastReportedExposure;
    private int lastReportedSizeChangeHeight = -1;
    private int lastReportedSizeChangeWidth = -1;
    private Boolean lastViewabilityState;
    private boolean loadReportSubmitted;
    boolean pageLoaded = false;
    protected MraidStateType state = MraidStateType.LOADING;
    protected boolean useCustomClose = false;

    /* access modifiers changed from: package-private */
    public void closeExpandedPartTwo() {
    }

    /* access modifiers changed from: protected */
    public abstract void expand(Map<String, Object> map);

    /* access modifiers changed from: protected */
    public String getPlacementType() {
        return "";
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* access modifiers changed from: protected */
    public void onAdClicked() {
    }

    /* access modifiers changed from: protected */
    public abstract void onAdLeftApplication();

    /* access modifiers changed from: protected */
    public void onAdOpened(DTBAdView dTBAdView) {
    }

    /* access modifiers changed from: protected */
    public void onAdRemoved() {
    }

    /* access modifiers changed from: protected */
    public abstract void onMRAIDClose();

    /* access modifiers changed from: protected */
    public abstract void onPageLoad();

    /* access modifiers changed from: protected */
    public abstract void onResize(Map<String, Object> map);

    /* access modifiers changed from: protected */
    public void onVideoCompleted() {
    }

    /* access modifiers changed from: package-private */
    public void passLoadError() {
    }

    static {
        MraidCommand.registerCommand(MraidOpenCommand.getMraidName(), MraidOpenCommand.class);
        MraidCommand.registerCommand(MraidCloseCommand.getMraidName(), MraidCloseCommand.class);
        MraidCommand.registerCommand(MraidUnloadCommand.getMraidName(), MraidUnloadCommand.class);
        MraidCommand.registerCommand(MraidResizeCommand.getMraidName(), MraidResizeCommand.class);
        MraidCommand.registerCommand(MraidExpandCommand.getMraidName(), MraidExpandCommand.class);
        MraidCommand.registerCommand(MraidUseCustomCloseCommand.getMraidName(), MraidUseCustomCloseCommand.class);
        MraidCommand.registerCommand(MraidJSReadyCommand.getMraidName(), MraidJSReadyCommand.class);
        MraidCommand.registerCommand(MraidFirePixelCommand.getMraidName(), MraidFirePixelCommand.class);
    }

    /* access modifiers changed from: protected */
    public DTBAdView getAdView() {
        return this.adView;
    }

    /* access modifiers changed from: package-private */
    public void setCustomButtonListener(DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener) {
        this.customButtonListener = dTBMRAIDCloseButtonListener;
    }

    DTBAdMRAIDController(DTBAdView dTBAdView) {
        this.adView = dTBAdView;
        this.dtbOmSdkSessionManager = DtbOmSdkSessionManager.getNewInstance();
    }

    /* access modifiers changed from: package-private */
    public DtbOmSdkSessionManager getDtbOmSdkSessionManager() {
        return this.dtbOmSdkSessionManager;
    }

    public void setUseCustomClose(boolean z) {
        DtbLog.debug("Set useCustomClose to " + z);
        this.useCustomClose = z;
        commandCompleted("useCustomClose");
        DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener = this.customButtonListener;
        if (dTBMRAIDCloseButtonListener != null) {
            dTBMRAIDCloseButtonListener.useCustomButtonUpdated();
        }
    }

    /* access modifiers changed from: package-private */
    public void onLoadError(String str, int i) {
        onLoadError();
    }

    /* access modifiers changed from: protected */
    public void onLoadError() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null) {
            DTBMetricsProcessor.getInstance().submitSimpleReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_FAILURE);
        }
        passLoadError();
    }

    /* access modifiers changed from: protected */
    public void createLoadReport() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null && !this.loadReportSubmitted) {
            DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_LATENCY, (int) (new Date().getTime() - this.adView.getStartTime()));
            this.loadReportSubmitted = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void prepareMraid() throws JSONException {
        createLoadReport();
        this.pageLoaded = true;
        fireMaxSizeEvent();
        fireScreenSizeEvent();
        if (getAdView().isVisible()) {
            setCurrentPositionProperty();
        }
        fireMRAIDSupports();
        firePlacementType();
        setCurrentAppOrientation();
        setState(getInitialStateType());
        fireMRAIDReadyEvent();
        if (AdRegistration.isTestMode()) {
            evaluateJavascript("window.mraidBridge.service.debug('enable');");
        }
    }

    /* access modifiers changed from: protected */
    public MraidStateType getInitialStateType() {
        return MraidStateType.DEFAULT;
    }

    private JSONObject formProperties(MraidProperty[] mraidPropertyArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (MraidProperty formJSON : mraidPropertyArr) {
            formJSON.formJSON(jSONObject);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public void setCurrentAppOrientation() throws JSONException {
        int determineSimpleOrientation = DisplayUtils.determineSimpleOrientation();
        String str = determineSimpleOrientation != 1 ? determineSimpleOrientation != 2 ? "unspecified" : "landscape" : "portrait";
        boolean isRotationLocked = DisplayUtils.isRotationLocked();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", str);
        jSONObject.put("locked", isRotationLocked);
        evaluateJavascriptMethod("window.mraidBridge.property.setCurrentAppOrientation", jSONObject);
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return getAdView().getContext();
    }

    /* access modifiers changed from: package-private */
    public void setCurrentPositionProperty() {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], (float) getAdView().getWidth(), (float) getAdView().getHeight());
        }
    }

    /* access modifiers changed from: package-private */
    public void setCurrentPositionProperty(float f, float f2) {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setCurrentPositionProperty(int i, int i2, float f, float f2) {
        if (this.pageLoaded) {
            evaluateJavascript(String.format("window.mraidBridge.property.setCurrentPosition({'xPos':%.1f, 'yPos':%.1f, 'width': %.1f, 'height': %.1f});", new Object[]{Float.valueOf((float) DTBAdUtil.pixelsToDeviceIndependenPixels(i)), Float.valueOf((float) DTBAdUtil.pixelsToDeviceIndependenPixels(i2)), Float.valueOf((float) DTBAdUtil.pixelsToDeviceIndependenPixels((int) f)), Float.valueOf((float) DTBAdUtil.pixelsToDeviceIndependenPixels((int) f2))}));
        }
    }

    private void fireMaxSizeEvent() {
        SDKUtilities.SimpleSize maxSize = DTBAdUtil.getMaxSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setMaxSize({'width':%d, 'height':%d});", new Object[]{Integer.valueOf(maxSize.getWidth()), Integer.valueOf(maxSize.getHeight())}));
    }

    /* access modifiers changed from: package-private */
    public void fireScreenSizeEvent() {
        SDKUtilities.SimpleSize screenSize = DTBAdUtil.getScreenSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setScreenSize({'width':%d, 'height':%d});", new Object[]{Integer.valueOf(screenSize.getWidth()), Integer.valueOf(screenSize.getHeight())}));
    }

    /* access modifiers changed from: package-private */
    public void fireViewableChange(boolean z) {
        Boolean bool = this.lastViewabilityState;
        if (bool == null || bool.booleanValue() != z) {
            if (this.jsReady) {
                fireEnforcedViewableChange(z);
            }
            this.lastViewabilityState = Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void fireEnforcedViewableChange(boolean z) {
        Object[] objArr = new Object[1];
        objArr[0] = z ? "true" : "false";
        evaluateJavascript(String.format("window.mraidBridge.event.viewableChange(%s);", objArr));
    }

    /* access modifiers changed from: protected */
    public void firePlacementType() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getPlacementType());
        evaluateJavascriptMethod("window.mraidBridge.property.setPlacementType", jSONObject);
    }

    /* access modifiers changed from: protected */
    public void fireMRAIDSupports() {
        evaluateJavascriptMethod("window.mraidBridge.property.setSupports", MraidProperty.SUPPORTS_PROPERTY.getData());
    }

    /* access modifiers changed from: package-private */
    public void fireErrorEvent(String str, String str2) {
        evaluateJavascript(String.format("window.mraidBridge.event.error('%s','%s');", new Object[]{str2, str}));
    }

    private void evaluateJavascriptMethod(String str, JSONObject jSONObject) {
        evaluateJavascript(String.format(str + "(%s);", new Object[]{jSONObject.toString()}));
    }

    /* access modifiers changed from: protected */
    public void evaluateJavascript(String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "MRAID Evaluate JSScript:" + str);
        new Handler(Looper.getMainLooper()).post(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DTBAdMRAIDController.this.lambda$evaluateJavascript$0$DTBAdMRAIDController(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$evaluateJavascript$0$DTBAdMRAIDController(final String str) {
        if (getAdView() != null) {
            getAdView().evaluateJavascript(str, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    if (str != null && !"null".equals(str)) {
                        String str2 = DTBAdMRAIDController.LOG_TAG;
                        DtbLog.debug(str2, "Value received:" + str + " for script " + str);
                    }
                }
            });
        }
    }

    /* renamed from: com.amazon.device.ads.DTBAdMRAIDController$2 */
    static /* synthetic */ class C11502 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.amazon.device.ads.MraidStateType[] r0 = com.amazon.device.ads.MraidStateType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$MraidStateType = r0
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.RESIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.HIDDEN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDController.C11502.<clinit>():void");
        }
    }

    private MraidProperty getCurrentStateProperty() {
        int i = C11502.$SwitchMap$com$amazon$device$ads$MraidStateType[this.state.ordinal()];
        if (i == 1) {
            return MraidProperty.STATE_LOADING_PROPERTY;
        }
        if (i == 2) {
            return MraidProperty.STATE_DEFAULT_PROPERTY;
        }
        if (i == 3) {
            return MraidProperty.STATE_RESIZED_PROPERTY;
        }
        if (i == 4) {
            return MraidProperty.STATE_EXPANDED_PROPERTY;
        }
        if (i != 5) {
            return MraidProperty.STATE_DEFAULT_PROPERTY;
        }
        return MraidProperty.STATE_HIDDEN_PROPERTY;
    }

    /* access modifiers changed from: package-private */
    public void fireStateChangeEvent() {
        try {
            JSONObject formProperties = formProperties(new MraidProperty[]{getCurrentStateProperty()});
            String str = LOG_TAG;
            DtbLog.debug(str, "State was changed to " + formProperties.toString() + " for controller " + this);
            evaluateJavascript(String.format("window.mraidBridge.event.stateChange(%s);", new Object[]{formProperties.toString()}));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    class MraidExposure {
        int percent;
        Rect rect;

        MraidExposure(int i, Rect rect2) {
            this.percent = i;
            this.rect = new Rect(rect2);
        }
    }

    /* access modifiers changed from: package-private */
    public void fireExposureChange(int i, Rect rect) {
        int i2 = rect.right;
        int i3 = rect.left;
        int i4 = rect.bottom;
        int i5 = rect.top;
        if (this.jsReady) {
            fireEnforcedExposureChange(i, rect);
        } else {
            this.lastReportedExposure = new MraidExposure(i, rect);
        }
    }

    private void fireEnforcedExposureChange(int i, Rect rect) {
        evaluateJavascript(String.format("window.mraidBridge.event.exposureChange(%d, { x:%d, y:%d, width:%d, height: %d}, null);", new Object[]{Integer.valueOf(i), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.top)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.right - rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.bottom - rect.top))}));
    }

    /* access modifiers changed from: package-private */
    public void fireSizeChange(int i, int i2) {
        if (this.lastReportedSizeChangeWidth != i || this.lastReportedSizeChangeHeight != i2) {
            this.lastReportedSizeChangeWidth = i;
            this.lastReportedSizeChangeHeight = i2;
            if (this.jsReady) {
                fireEnforcedSizeChange(i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void fireEnforcedSizeChange(int i, int i2) {
        evaluateJavascript(String.format("window.mraidBridge.event.sizeChange(%d, %d);", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    public void fireMRAIDReadyEvent() {
        evaluateJavascript(MRAID_READY);
    }

    /* access modifiers changed from: package-private */
    public void onPositionChanged(Rect rect) {
        Rect rect2 = this.lastRect;
        if (rect2 == null || !rect2.equals(rect)) {
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            Rect rect3 = this.lastRect;
            boolean z = true;
            if (rect3 != null) {
                int i3 = rect3.right - this.lastRect.left;
                int i4 = this.lastRect.bottom - this.lastRect.top;
                if (Math.abs(i3 - i) <= 1 && Math.abs(i4 - i2) <= 1) {
                    z = false;
                }
            }
            setCurrentPositionProperty();
            if (z) {
                fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i), DTBAdUtil.pixelsToDeviceIndependenPixels(i2));
            }
            this.lastRect = rect;
        }
    }

    /* access modifiers changed from: package-private */
    public void setState(MraidStateType mraidStateType) {
        this.state = mraidStateType;
        if (mraidStateType == MraidStateType.HIDDEN) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    DTBAdMRAIDController.this.lambda$setState$1$DTBAdMRAIDController();
                }
            });
        }
        fireStateChangeEvent();
    }

    public /* synthetic */ void lambda$setState$1$DTBAdMRAIDController() {
        DTBAdView adView2 = getAdView();
        if (adView2 != null) {
            adView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDUnload() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBAdMRAIDController.this.lambda$onMRAIDUnload$2$DTBAdMRAIDController();
            }
        });
    }

    public /* synthetic */ void lambda$onMRAIDUnload$2$DTBAdMRAIDController() {
        getAdView().loadUrl("about:blank");
    }

    /* access modifiers changed from: package-private */
    public void commandCompleted(String str) {
        evaluateJavascript(String.format("window.mraidBridge.service.acknowledgement('%s');", new Object[]{str}));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0192 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openUrl(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invalid url "
            java.lang.String r1 = "open"
            com.amazon.device.ads.DTBAdView r2 = r8.adView
            android.content.Context r2 = r2.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x01af }
            java.lang.String r4 = r3.getScheme()
            java.lang.String r5 = "amazonmobile"
            boolean r4 = r5.equals(r4)
            java.lang.String r5 = "android.intent.action.VIEW"
            if (r4 == 0) goto L_0x0096
            java.lang.String r4 = r3.getHost()
            java.lang.String r6 = "intent"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0096
            java.lang.String r0 = "intent="
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r2 = 1
            if (r0 <= r2) goto L_0x01ab
            r0 = 0
            r3 = r2
        L_0x0038:
            int r4 = r9.length
            if (r3 >= r4) goto L_0x01ab
            r0 = r9[r3]     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            java.lang.String r4 = "&"
            int r4 = r0.lastIndexOf(r4)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            int r6 = r0.length()     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            int r6 = r6 - r2
            if (r4 != r6) goto L_0x0054
            r4 = 0
            int r6 = r0.length()     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            int r6 = r6 - r2
            java.lang.String r0 = r0.substring(r4, r6)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
        L_0x0054:
            java.lang.String r4 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r4)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            android.net.Uri r6 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            r4.<init>(r5, r6)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            android.content.Context r6 = r8.getContext()     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            r6.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            r8.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0075, UnsupportedEncodingException -> 0x006f }
            goto L_0x01ab
        L_0x006f:
            java.lang.String r4 = "Unsupported encoding"
            com.amazon.device.ads.DtbLog.debug(r4)
            goto L_0x0093
        L_0x0075:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Intent:"
            r4.append(r6)
            r4.append(r0)
            java.lang.String r6 = " not found."
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.amazon.device.ads.DtbLog.debug(r4)
            java.lang.String r4 = "requested activity not found"
            r8.fireErrorEvent(r1, r4)
        L_0x0093:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0096:
            java.lang.String r4 = r3.getScheme()
            java.lang.String r6 = "com.amazon.mobile.shopping"
            boolean r4 = r6.equals(r4)
            java.lang.String r6 = "current activity from AdRegistration not found"
            java.lang.String r7 = "Current activity from AdRegistration not found"
            if (r4 == 0) goto L_0x0110
            java.lang.String r0 = "com.amazon.mShop.android.shopping"
            android.content.Intent r0 = r2.getLaunchIntentForPackage(r0)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            if (r0 == 0) goto L_0x00be
            android.content.Intent r9 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r9.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r9.setData(r3)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            android.app.Activity r0 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r0.startActivity(r9)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            goto L_0x00f3
        L_0x00be:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r0.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r0.setData(r3)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            java.lang.String r2 = "products/"
            int r2 = r9.indexOf(r2)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            if (r2 <= 0) goto L_0x00f3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            java.lang.String r4 = "https://www.amazon.com/dp/"
            r3.append(r4)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            int r2 = r2 + 9
            java.lang.String r9 = r9.substring(r2)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r3.append(r9)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            java.lang.String r9 = r3.toString()     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r0.setData(r9)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            android.app.Activity r9 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            r9.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
        L_0x00f3:
            r8.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0102, NullPointerException -> 0x00f8 }
            goto L_0x01ab
        L_0x00f8:
            java.lang.String r9 = LOG_TAG
            com.amazon.device.ads.DtbLog.debug(r9, r7)
            r8.fireErrorEvent(r1, r6)
            goto L_0x01ab
        L_0x0102:
            java.lang.String r9 = LOG_TAG
            java.lang.String r0 = "Activity not found com.amazon.mobile.shopping"
            com.amazon.device.ads.DtbLog.debug(r9, r0)
            java.lang.String r9 = "mshop activity not found"
            r8.fireErrorEvent(r1, r9)
            goto L_0x01ab
        L_0x0110:
            java.lang.String r2 = r3.getScheme()
            java.lang.String r4 = "market"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0176
            java.lang.String r2 = r3.getScheme()
            java.lang.String r4 = "amzn"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0129
            goto L_0x0176
        L_0x0129:
            java.lang.String r2 = r3.getScheme()
            if (r2 != 0) goto L_0x0144
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "https:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.net.Uri r3 = android.net.Uri.parse(r2)
        L_0x0144:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)     // Catch:{ Exception -> 0x0159 }
            android.content.Context r3 = r8.getContext()     // Catch:{ Exception -> 0x0159 }
            r3.startActivity(r2)     // Catch:{ Exception -> 0x0159 }
            r8.onAdLeftApplication()     // Catch:{ Exception -> 0x0159 }
            goto L_0x01ab
        L_0x0159:
            r2 = move-exception
            java.lang.String r3 = LOG_TAG
            java.lang.String r2 = r2.getMessage()
            com.amazon.device.ads.DtbLog.error(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r8.fireErrorEvent(r1, r9)
            goto L_0x01ab
        L_0x0176:
            android.content.Intent r9 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            r9.<init>(r5)     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            r9.setData(r3)     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            android.app.Activity r0 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            r0.startActivity(r9)     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            r8.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0192, NullPointerException -> 0x0189 }
            goto L_0x01ab
        L_0x0189:
            java.lang.String r9 = LOG_TAG
            com.amazon.device.ads.DtbLog.debug(r9, r7)
            r8.fireErrorEvent(r1, r6)
            goto L_0x01ab
        L_0x0192:
            com.amazon.device.ads.DTBAdUtil.directAppStoreLinkToBrowser(r8, r3)     // Catch:{ ActivityNotFoundException -> 0x019f, NullPointerException -> 0x0196 }
            goto L_0x01ab
        L_0x0196:
            java.lang.String r9 = LOG_TAG
            com.amazon.device.ads.DtbLog.debug(r9, r7)
            r8.fireErrorEvent(r1, r6)
            goto L_0x01ab
        L_0x019f:
            java.lang.String r9 = LOG_TAG
            java.lang.String r0 = "App stores and browsers not found"
            com.amazon.device.ads.DtbLog.debug(r9, r0)
            java.lang.String r9 = "app stores and browsers not found"
            r8.fireErrorEvent(r1, r9)
        L_0x01ab:
            r8.commandCompleted(r1)
            return
        L_0x01af:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r8.fireErrorEvent(r1, r9)
            r8.commandCompleted(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDController.openUrl(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void removeCloseIndicator() {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
        }
    }

    /* access modifiers changed from: package-private */
    public void addCloseIndicator(int i, int i2) {
        removeCloseIndicator();
        addCloseIndicator(i, i2, false);
    }

    /* access modifiers changed from: protected */
    public void addCloseIndicator(int i, int i2, boolean z) {
        removeCloseIndicator();
        addCloseIndicator(i, i2, (View.OnTouchListener) null, z);
    }

    /* access modifiers changed from: protected */
    public void setCloseIndicatorContent(View.OnTouchListener onTouchListener) {
        this.closeIndicatorRegion.setBackgroundColor(0);
        this.closeIndicatorRegion.setId(C1164R.C1166id.mraid_close_indicator);
        ImageView imageView = new ImageView(getAdView().getContext());
        imageView.setId(C1164R.C1166id.mraid_close_indicator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.closeIndicatorRegion.addView(imageView, layoutParams);
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().addFriendlyObstruction(this.closeIndicatorRegion.findViewById(C1164R.C1166id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
        }
        imageView.setImageDrawable(AppCompatResources.getDrawable(getAdView().getContext(), C1164R.C1165drawable.mraid_close));
        if (onTouchListener != null) {
            this.closeIndicatorRegion.setOnTouchListener(onTouchListener);
        } else {
            this.closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return DTBAdMRAIDController.this.lambda$setCloseIndicatorContent$3$DTBAdMRAIDController(view, motionEvent);
                }
            });
        }
    }

    public /* synthetic */ boolean lambda$setCloseIndicatorContent$3$DTBAdMRAIDController(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        evaluateJavascript(MRAID_CLOSE);
        ((ViewGroup) view.getParent()).removeView(view);
        this.closeIndicatorRegion = null;
        return true;
    }

    /* access modifiers changed from: protected */
    public void createContentIndicator() {
        LinearLayout linearLayout = new LinearLayout(getAdView().getContext());
        this.closeIndicatorRegion = linearLayout;
        linearLayout.setVisibility(this.useCustomClose ? 4 : 0);
        this.closeIndicatorRegion.setOrientation(1);
    }

    /* access modifiers changed from: protected */
    public void addCloseIndicator(int i, int i2, View.OnTouchListener onTouchListener, boolean z) {
        createContentIndicator();
        DTBAdUtil.getRootView(getAdView()).addView(this.closeIndicatorRegion, DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setX((float) (i - DTBAdUtil.sizeToDevicePixels(50)));
        this.closeIndicatorRegion.setY((float) i2);
        setCloseIndicatorContent(onTouchListener);
    }

    /* access modifiers changed from: package-private */
    public boolean isTwoPartExpand() {
        return this.isTwoPartExpand;
    }

    /* access modifiers changed from: package-private */
    public void setTwoPartExpand(boolean z) {
        this.isTwoPartExpand = z;
    }

    /* access modifiers changed from: package-private */
    public void jsReady() {
        int i;
        commandCompleted("jsready");
        this.jsReady = true;
        Boolean bool = this.lastViewabilityState;
        if (bool != null) {
            fireEnforcedViewableChange(bool.booleanValue());
        }
        MraidExposure mraidExposure = this.lastReportedExposure;
        if (mraidExposure != null) {
            fireEnforcedExposureChange(mraidExposure.percent, this.lastReportedExposure.rect);
        }
        int i2 = this.lastReportedSizeChangeWidth;
        if (i2 > 0 && (i = this.lastReportedSizeChangeHeight) > 0) {
            fireEnforcedSizeChange(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void onViewabilityChanged(boolean z) {
        DtbLog.debug("SET MRAID Visible " + z);
        fireViewableChange(z);
    }

    /* access modifiers changed from: protected */
    public void impressionFired() {
        if (!getAdView().isVideo() && getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().impressionOccured();
        }
        commandCompleted(MraidFirePixelCommand.getMraidName());
    }
}
