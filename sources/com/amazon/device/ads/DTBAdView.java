package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ScrollView;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.tapjoy.TJAdUnitConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DTBAdView extends WebView {
    public static final String AMAZON_AD_INFO = "amazon_ad_info";
    static final String AMAZON_BRIDGE = "amzn_bridge";
    public static final String BID_HTML = "bid_html_template";
    public static final String BID_IDENTIFIER = "bid_identifier";
    private static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true};";
    private static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true};";
    public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
    public static final String EXPECTED_HEIGHT = "expected_height";
    public static final String EXPECTED_WIDTH = "expected_width";
    public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
    static final String LOG_TAG = DTBAdView.class.getSimpleName();
    static final String MRAID_IDENTIFIER = "MRAID_ENV";
    public static final String REQUEST_QUEUE = "amazon_request_queue";
    public static final String SMARTBANNER_STATE = "smart_banner_state";
    public static final String START_LOAD_TIME = "start_load_time";
    public static final String VIDEO = "video_flag";
    static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";
    static final String VIDEO_EVENT_JSON_SUBTYPE = "subtype";
    static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";
    private String bidId;
    /* access modifiers changed from: private */
    public DTBAdMRAIDController controller;
    private String dtbAdInterstitialId;
    private int exposurePercent;
    ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;
    ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private String hostname;
    private boolean ignoreDetachment;
    private boolean isFirstDisplay;
    private boolean isVideo;
    private boolean isVisible;
    private boolean localOnly;
    ViewTreeObserver.OnScrollChangedListener scrollChangeListener;
    private boolean scrollEnabled;
    private long startTime;
    DTBAdViewSupportClient supportClient;
    private long timeClicked;
    private long timePressed;
    private WebBridge webBridge;

    public DTBAdView(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            this.controller = new DTBAdMRAIDInterstitialController(this, dTBAdInterstitialListener);
            commonInit();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdInterstitialListener");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdInterstitialListener", e);
        }
    }

    public DTBAdView(Context context, DTBAdBannerListener dTBAdBannerListener) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            this.controller = new DTBAdMRAIDBannerController(this, dTBAdBannerListener);
            commonInit();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdBannerListener");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdBannerListener", e);
        }
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener) {
        this(context, dTBAdExpandedListener, 0);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener, int i) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = new DTBAdMRAIDExpandedController(this);
            this.controller = dTBAdMRAIDExpandedController;
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.findControllerByIndex(i));
            dTBAdExpandedListener.onCreateExpandedController((DTBAdMRAIDExpandedController) this.controller);
            commonInit();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdExpandedListener");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdExpandedListener", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setIgnoreDetachment() {
        this.ignoreDetachment = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusChangeListener);
            DTBAdMRAIDController controller2 = getController();
            if (controller2 != null && controller2.getDtbOmSdkSessionManager() != null) {
                controller2.getDtbOmSdkSessionManager().stopOmAdSession();
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute onDetachedFromWindow method in DTBAdView class");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onDetachedFromWindow method in DTBAdView class", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusChangeListener);
            getViewTreeObserver().addOnScrollChangedListener(this.scrollChangeListener);
            DTBAdMRAIDController controller2 = getController();
            if (controller2 != null) {
                controller2.onAdOpened(this);
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute onAttachedToWindow method in DTBAdView class");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onAttachedToWindow method in DTBAdView class", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void cleanup() {
        removeJavascriptInterface(AMAZON_BRIDGE);
        if (this.controller.getDtbOmSdkSessionManager() != null) {
            this.controller.getDtbOmSdkSessionManager().stopOmAdSession();
        }
        this.controller.adView = null;
        this.controller.customButtonListener = null;
        this.controller = null;
    }

    private void commonInit() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAppCacheEnabled(true);
        getSettings().setAllowFileAccess(false);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (AdRegistration.isTestMode() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        getSettings().setBlockNetworkImage(false);
        DTBAdViewSupportClient dTBAdViewSupportClient = new DTBAdViewSupportClient(getContext(), this.controller);
        this.supportClient = dTBAdViewSupportClient;
        setWebViewClient(dTBAdViewSupportClient);
        setScrollEnabled(false);
        WebBridge webBridge2 = new WebBridge();
        this.webBridge = webBridge2;
        addJavascriptInterface(webBridge2, AMAZON_BRIDGE);
        WebResourceService.init();
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                DTBAdView.this.verifyIsVisible();
            }
        };
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() {
            public void onGlobalFocusChanged(View view, View view2) {
                DTBAdView.this.verifyIsVisible();
            }
        };
        this.scrollChangeListener = new ViewTreeObserver.OnScrollChangedListener() {
            public void onScrollChanged() {
                DTBAdView.this.verifyIsVisible();
            }
        };
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DTBAdView.this.lambda$commonInit$0$DTBAdView(view, motionEvent);
            }
        });
    }

    public /* synthetic */ boolean lambda$commonInit$0$DTBAdView(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        long time = new Date().getTime();
        if (action == 0) {
            this.timePressed = time;
            return false;
        } else if (action != 1) {
            this.timePressed = 0;
            return false;
        } else if (time - this.timeClicked < 1000) {
            return false;
        } else {
            if (time - this.timePressed < 500) {
                this.timeClicked = time;
                this.controller.onAdClicked();
            }
            this.timePressed = 0;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isVisible() {
        return this.isVisible;
    }

    private void loadLocalFile(String str, StringBuilder sb) {
        if (!this.localOnly) {
            try {
                String loadFile = WebResourceService.getInstance().loadFile(str);
                if (loadFile != null) {
                    sb.append("<script>");
                    sb.append(loadFile);
                    sb.append("</script>");
                    return;
                }
            } catch (Exception unused) {
                DtbLog.error(LOG_TAG, "Failed to read local file");
            }
        }
        sb.append("<script>");
        try {
            AssetManager assets = getContext().getAssets();
            InputStream open = assets.open(str + ".js");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine.trim());
                sb.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (Exception unused2) {
            DtbLog.error("Error reading file:" + str);
        }
        sb.append("</script>");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isFirstDisplay) {
            if (DTBTimeTrace.getInstance() != null && AdRegistration.isTestMode()) {
                DTBTimeTrace.getInstance().addPhase(DTBTimeTrace.TIMETRACE_AD_DISPLAY_SUCCEEDED);
                DTBTimeTrace.getInstance().logTrace();
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.controller;
            if (dTBAdMRAIDController instanceof DTBAdViewDisplayListener) {
                ((DTBAdViewDisplayListener) dTBAdMRAIDController).onInitialDisplay();
            }
            this.isFirstDisplay = false;
        }
    }

    /* access modifiers changed from: private */
    public void verifyIsVisible() {
        if (getParent() != null && getVisibility() == 0) {
            Activity currentActivity = AdRegistration.getCurrentActivity();
            if (currentActivity != null) {
                ViewGroup viewGroup = (ViewGroup) currentActivity.findViewById(16908290);
                if (viewGroup != null) {
                    int[] iArr = new int[2];
                    viewGroup.getLocationInWindow(iArr);
                    Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
                    int[] iArr2 = new int[2];
                    getLocationInWindow(iArr2);
                    Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
                    if (rect.contains(rect2) || Rect.intersects(rect, rect2)) {
                        ScrollView scrollViewParent = getScrollViewParent();
                        if (scrollViewParent != null) {
                            int[] iArr3 = new int[2];
                            scrollViewParent.getLocationInWindow(iArr3);
                            Rect rect3 = new Rect(iArr3[0], iArr3[1], iArr3[0] + scrollViewParent.getWidth(), iArr3[1] + scrollViewParent.getHeight());
                            if (!Rect.intersects(rect2, rect3) && this.isVisible) {
                                DTBAdMRAIDController dTBAdMRAIDController = this.controller;
                                if (dTBAdMRAIDController != null) {
                                    dTBAdMRAIDController.onViewabilityChanged(false);
                                }
                                setIsVisible(false);
                                DtbLog.debug("SET MRAID Visible false because of scroll ");
                            } else if (Rect.intersects(rect2, rect3) && !this.isVisible) {
                                DTBAdMRAIDController dTBAdMRAIDController2 = this.controller;
                                if (dTBAdMRAIDController2 != null) {
                                    dTBAdMRAIDController2.onViewabilityChanged(true);
                                }
                                setIsVisible(true);
                                DtbLog.debug("SET MRAID Visible true because of scroll ");
                            }
                        } else {
                            DTBAdMRAIDController dTBAdMRAIDController3 = this.controller;
                            if (dTBAdMRAIDController3 != null && !this.isVisible) {
                                dTBAdMRAIDController3.onViewabilityChanged(true);
                            }
                            setIsVisible(true);
                        }
                    } else if (this.isVisible) {
                        DTBAdMRAIDController dTBAdMRAIDController4 = this.controller;
                        if (dTBAdMRAIDController4 != null) {
                            dTBAdMRAIDController4.onViewabilityChanged(false);
                        }
                        setIsVisible(false);
                        DtbLog.debug("SET MRAID Visible false because of root");
                    }
                    if (this.isVisible) {
                        computeExposure();
                    }
                } else if (this.isVisible) {
                    DTBAdMRAIDController dTBAdMRAIDController5 = this.controller;
                    if (dTBAdMRAIDController5 != null) {
                        dTBAdMRAIDController5.onViewabilityChanged(false);
                    }
                    setIsVisible(false);
                }
            } else if (this.isVisible) {
                DTBAdMRAIDController dTBAdMRAIDController6 = this.controller;
                if (dTBAdMRAIDController6 != null) {
                    dTBAdMRAIDController6.onViewabilityChanged(false);
                }
                setIsVisible(false);
            }
        } else if (this.isVisible) {
            DTBAdMRAIDController dTBAdMRAIDController7 = this.controller;
            if (dTBAdMRAIDController7 != null) {
                dTBAdMRAIDController7.onViewabilityChanged(false);
            }
            setIsVisible(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void computeExposure() {
        computeExposure(false);
    }

    /* access modifiers changed from: package-private */
    public void computeExposure(boolean z) {
        ScrollView scrollViewParent = getScrollViewParent();
        if (scrollViewParent != null) {
            computeExposureInScrollView(scrollViewParent, z);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + getWidth(), iArr[1] + getHeight());
        if (this.controller != null) {
            computeExposureInRootView(z);
            this.controller.onPositionChanged(rect);
        }
    }

    /* access modifiers changed from: package-private */
    public void computeExposureInRootView() {
        computeExposureInRootView(false);
    }

    /* access modifiers changed from: package-private */
    public void computeExposureInRootView(boolean z) {
        ViewGroup viewGroup;
        View view = (View) getParent();
        Activity activity = view != null ? DTBAdUtil.getActivity(view) : DTBAdUtil.getActivity(this);
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null) {
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
            float width = (float) (getWidth() * getHeight());
            if (rect2.intersect(rect)) {
                int i = (int) (((((double) ((float) ((rect2.right - rect2.left) * (rect2.bottom - rect2.top)))) * 100.0d) / ((double) width)) + 0.5d);
                if (i != this.exposurePercent || z) {
                    this.exposurePercent = i;
                    this.controller.fireExposureChange(i, rect2);
                }
            } else if (this.exposurePercent != 0 || z) {
                this.exposurePercent = 0;
                rect2.top = rect2.bottom;
                this.controller.fireExposureChange(this.exposurePercent, rect2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public long getStartTime() {
        return this.startTime;
    }

    private ScrollView getScrollViewParent() {
        View view = this;
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            if (parent instanceof ScrollView) {
                return (ScrollView) parent;
            }
            view = (View) parent;
        }
    }

    private void computeExposureInScrollView(ScrollView scrollView, boolean z) {
        ViewGroup viewGroup;
        Activity activity = DTBAdUtil.getActivity((View) getParent());
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null) {
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int i = 0;
            Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
            int[] iArr2 = new int[2];
            getLocationInWindow(iArr2);
            float width = (float) (getWidth() * getHeight());
            Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
            if (scrollView == null) {
                rect2.intersect(rect);
            } else {
                int[] iArr3 = new int[2];
                scrollView.getLocationInWindow(iArr3);
                Rect rect3 = new Rect(iArr3[0], iArr3[1], iArr3[0] + scrollView.getWidth(), iArr3[1] + scrollView.getHeight());
                rect3.intersect(rect);
                rect2.intersect(rect3);
            }
            float f = (float) ((rect2.right - rect2.left) * (rect2.bottom - rect2.top));
            if (width != 0.0f) {
                i = (int) ((f * 100.0f) / width);
            }
            if (i != this.exposurePercent || z) {
                this.exposurePercent = i;
                this.controller.fireExposureChange(i, rect2);
                this.controller.setCurrentPositionProperty();
            }
        }
    }

    private void setIsVisible(boolean z) {
        this.isVisible = z;
        if (!z) {
            this.exposurePercent = -1;
            DTBAdMRAIDController dTBAdMRAIDController = this.controller;
            if (dTBAdMRAIDController != null) {
                dTBAdMRAIDController.fireExposureChange(0, new Rect(0, 0, 0, 0));
            }
        }
    }

    public void fetchAd(Map<String, Object> map) {
        fetchAd((String) null, map);
    }

    public void fetchAd(String str, Map<String, Object> map) {
        try {
            Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value instanceof String) {
                    initializeEmptyBundle.putString((String) next.getKey(), (String) value);
                } else if (value instanceof Boolean) {
                    initializeEmptyBundle.putBoolean((String) next.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    initializeEmptyBundle.putInt((String) next.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    initializeEmptyBundle.putLong((String) next.getKey(), ((Long) value).longValue());
                }
            }
            fetchAd(str, initializeEmptyBundle);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with map bundle");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with map bundle", e);
        }
    }

    /* access modifiers changed from: package-private */
    public String getBidId() {
        return this.bidId;
    }

    /* access modifiers changed from: package-private */
    public String getHostname() {
        return this.hostname;
    }

    /* access modifiers changed from: package-private */
    public boolean isVideo() {
        return this.isVideo;
    }

    public void fetchAd(String str) {
        fetchAd(str, (Bundle) null);
    }

    public void fetchAd(Bundle bundle) {
        fetchAd((String) null, bundle);
    }

    public void fetchAd(String str, Bundle bundle) {
        if (str == null) {
            try {
                str = bundle.getString(BID_HTML, (String) null);
            } catch (RuntimeException e) {
                DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with bundle", e);
                return;
            }
        }
        if (bundle != null && (this.controller instanceof DTBAdMRAIDBannerController)) {
            DTBAdBannerListener dTBAdBannerListener = ((DTBAdMRAIDBannerController) this.controller).bannerListener;
            int i = bundle.getInt(EXPECTED_WIDTH, 0);
            int i2 = bundle.getInt(EXPECTED_HEIGHT, 0);
            if (i2 > 0 && i > 0 && (dTBAdBannerListener instanceof DTBExpectedSizeProvider)) {
                DTBExpectedSizeProvider dTBExpectedSizeProvider = (DTBExpectedSizeProvider) dTBAdBannerListener;
                dTBExpectedSizeProvider.setExpectedWidth(i);
                dTBExpectedSizeProvider.setExpectedHeight(i2);
            }
        }
        if (bundle != null) {
            this.bidId = bundle.getString(BID_IDENTIFIER);
            this.hostname = bundle.getString(HOSTNAME_IDENTIFIER);
            this.isVideo = bundle.getBoolean(VIDEO);
        }
        this.startTime = new Date().getTime();
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html><html><head>");
        sb.append("<script>");
        sb.append(getEnvironment(bundle));
        sb.append("</script>");
        loadLocalFile("aps-mraid", sb);
        loadLocalFile("dtb-m", sb);
        if (DtbOmSdkSessionManager.getFeatureEnableFlag()) {
            loadLocalFile("omsdk-v1", sb);
        }
        sb.append("</head>");
        sb.append("<body style='margin:0;padding:0;'>");
        sb.append(str);
        sb.append("</body></html>");
        loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb.toString(), "text/html", "UTF-8", (String) null);
    }

    public void fetchAdWithLocation(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<script>");
            sb.append(getEnvironment((Bundle) null));
            sb.append("</script>");
            loadLocalFile("aps-mraid", sb);
            sb.append("<script>");
            sb.append("window.location=\"");
            sb.append(str);
            sb.append("\";");
            sb.append("</script>");
            loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb.toString(), "text/html", "UTF-8", (String) null);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAdWithLocation method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAdWithLocation method", e);
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    class WebBridge {
        Exception execException;

        WebBridge() {
        }

        /* access modifiers changed from: package-private */
        public Exception getExecutionException() {
            return this.execException;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("type")) {
                    String string = jSONObject.getString("type");
                    if (NotificationCompat.CATEGORY_SERVICE.equals(string)) {
                        handleServiceCall(jSONObject);
                    } else if (CampaignEx.JSON_KEY_MRAID.equals(string)) {
                        handleMraidCommand(jSONObject);
                    } else if (DTBAdView.VIDEO_EVENT_JS_COMMAND_TYPE.equals(string)) {
                        handleVideoEvent(jSONObject);
                    }
                } else {
                    DtbLog.error("Unrecognized bridge call");
                }
            } catch (JSONException e) {
                String str2 = DTBAdView.LOG_TAG;
                DtbLog.debug(str2, "JSON conversion failed:" + e);
            }
        }

        /* access modifiers changed from: package-private */
        public void handleVideoEvent(JSONObject jSONObject) throws JSONException {
            if (DTBAdView.VIDEO_COMPLETE_EVENT.equals(jSONObject.getString(DTBAdView.VIDEO_EVENT_JSON_SUBTYPE)) && DTBAdView.this.controller != null) {
                DTBAdView.this.controller.onVideoCompleted();
            }
        }

        /* access modifiers changed from: package-private */
        public void handleServiceCall(JSONObject jSONObject) throws JSONException {
            if ("log".equals(jSONObject.getString(DTBAdView.VIDEO_EVENT_JSON_SUBTYPE))) {
                logFromJavasScript(jSONObject.getJSONObject(TJAdUnitConstants.String.ARGUMENTS).getString("message"));
            }
        }

        /* access modifiers changed from: package-private */
        public void handleMraidCommand(JSONObject jSONObject) throws JSONException {
            this.execException = null;
            String string = jSONObject.getString(DTBAdView.VIDEO_EVENT_JSON_SUBTYPE);
            Class<MraidCommand> findMraidCommandByName = MraidCommand.findMraidCommandByName(string);
            if (findMraidCommandByName == null) {
                DtbLog.error("MRAID Command:" + string + " is not found");
                DTBAdMRAIDController access$100 = DTBAdView.this.controller;
                access$100.fireErrorEvent(string, string + " is not supported");
                DTBAdView.this.controller.commandCompleted(string);
                return;
            }
            try {
                MraidCommand newInstance = findMraidCommandByName.newInstance();
                String str = DTBAdView.LOG_TAG;
                DtbLog.debug(str, "execute command " + newInstance.getName());
                newInstance.execute(jSONObject.getJSONObject(TJAdUnitConstants.String.ARGUMENTS), DTBAdView.this.controller);
            } catch (JSONException e) {
                throw e;
            } catch (Exception e2) {
                this.execException = e2;
                DtbLog.debug("Error execution command " + string + " " + e2.getLocalizedMessage());
            }
        }

        private void logFromJavasScript(String str) {
            DtbLog.debug("mraid:JSNative", str);
        }

        /* access modifiers changed from: package-private */
        public void echo(JSONObject jSONObject) {
            try {
                Integer valueOf = Integer.valueOf(jSONObject.getInt("promiseId"));
                new Handler(Looper.getMainLooper()).post(new Runnable(String.format("window.promiseResolve(%d, '%s');", new Object[]{valueOf, jSONObject.getJSONObject(TJAdUnitConstants.String.ARGUMENTS).getString("greeting") + " Returned"})) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        DTBAdView.WebBridge.this.lambda$echo$0$DTBAdView$WebBridge(this.f$1);
                    }
                });
            } catch (JSONException e) {
                String str = DTBAdView.LOG_TAG;
                DtbLog.debug(str, "JSON conversion failed:" + e);
            }
        }

        public /* synthetic */ void lambda$echo$0$DTBAdView$WebBridge(String str) {
            DTBAdView.this.evaluateJavascript(str, (ValueCallback<String>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public String getEnvironment(Bundle bundle) {
        Bundle bundle2 = bundle;
        String string = bundle2 != null ? bundle2.getString(AMAZON_AD_INFO) : null;
        Context context = getContext();
        String str = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (DtbCommonUtils.isNullOrEmpty(idfa)) {
            idfa = "unknown";
        }
        boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut == null) {
            optOut = false;
        }
        if (string == null) {
            return String.format(ENV_TEMPLATE, new Object[]{MraidEnvironmentProperties.VERSION, DtbCommonUtils.getSDKMRAIDVersion(), "9.5.0", str, idfa, optOut, false});
        }
        return String.format(ENV_TEMPLATE_INFO, new Object[]{MraidEnvironmentProperties.VERSION, DtbCommonUtils.getSDKMRAIDVersion(), "9.5.0", str, idfa, optOut, false, string});
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.scrollEnabled) {
            super.onScrollChanged(i, i2, i4, i3);
        } else {
            scrollTo(0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public DTBAdMRAIDController getController() {
        return this.controller;
    }

    /* access modifiers changed from: package-private */
    public void setScrollEnabled(boolean z) {
        this.scrollEnabled = z;
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public void finalize() {
        try {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusChangeListener);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute finalize method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finalize method", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdRemoved() {
        if (this.controller.getDtbOmSdkSessionManager() != null) {
            this.controller.getDtbOmSdkSessionManager().stopOmAdSession();
        }
        this.controller.onAdRemoved();
    }

    /* access modifiers changed from: package-private */
    public void setInterstitialId(String str) {
        this.dtbAdInterstitialId = str;
    }

    /* access modifiers changed from: package-private */
    public String getDtbAdInterstitialId() {
        return this.dtbAdInterstitialId;
    }
}
