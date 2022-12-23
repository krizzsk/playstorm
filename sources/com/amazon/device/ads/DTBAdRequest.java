package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbMetrics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DTBAdRequest implements DTBAdLoader {
    private static final String AAX_VIDEO_INVENTORY_TYPE = "inventoryType";
    private static final String AAX_VIDEO_SKIP_AFTER = "skipAfter";
    private static final int DEFAULT_RERESH_DURATION = 60;
    private static final String LOG_TAG = DTBAdRequest.class.getSimpleName();
    private static final int MIN_REFRESH_DURATION = 20;
    private static final String[] MRAID_VALID_VERSIONS = {"1.0", "2.0", MraidEnvironmentProperties.VERSION};
    private static final long WEEK = 604800000;
    static JSONArray mRaidArray = null;
    private static JSONArray mRaidCustomArray = null;
    private static boolean mRaidDefined = false;
    private volatile AdError adError = null;
    private DTBAdResponse adResponse;
    private final List<DTBAdSize> adSizes = new ArrayList();
    private DTBAdCallback callback;
    private Context context;
    private final Map<String, String> customTargets = new HashMap();
    private boolean isAutoRefresh = false;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private final Runnable mRefreshRunnable = new Runnable() {
        public final void run() {
            DTBAdRequest.this.lambda$new$0$DTBAdRequest();
        }
    };
    private int refreshDuration = 0;
    private boolean refreshFlag = false;
    private boolean requestHasBeenUsed = false;
    private final Map<String, String> sizeSlotUUIDMap = new HashMap();
    private String slotGroup = null;
    private boolean submitMetrics = true;

    /* access modifiers changed from: protected */
    public String getFullyQuaifiedMoPUBClassName() {
        return "com.mopub.common.MoPub";
    }

    /* access modifiers changed from: protected */
    public void onRequestFormed(HashMap<String, Object> hashMap) {
    }

    public DTBAdRequest(Context context2) {
        if (context2 != null) {
            try {
                if (!AdRegistration.isInitialized()) {
                    DtbLog.warn("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
                    return;
                }
                if (AdRegistration.getContext() == null) {
                    AdRegistration.setContext(context2);
                }
                this.context = context2;
                if (!mRaidDefined) {
                    defineMraid();
                }
            } catch (RuntimeException e) {
                DtbLog.error(LOG_TAG, "Fail to initialize DTBAdRequest class with context argument");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdRequest class with context argument", e);
            }
        } else {
            throw new IllegalArgumentException("unable to initialize ad request with null app context");
        }
    }

    public DTBAdRequest() {
        try {
            if (!AdRegistration.isInitialized()) {
                DtbLog.warn("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
                return;
            }
            if (this.context == null) {
                this.context = AdRegistration.getContext();
            }
            if (!mRaidDefined) {
                defineMraid();
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdRequest class");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdRequest class", e);
        }
    }

    static void resetMraid() {
        mRaidArray = null;
        mRaidDefined = false;
    }

    static void setMRAIDSupportedVersions(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            mRaidCustomArray = new JSONArray();
            List asList = Arrays.asList(MRAID_VALID_VERSIONS);
            for (String str : strArr) {
                if (str == null) {
                    DtbLog.error(LOG_TAG, "null custom version supplied");
                } else {
                    if (!asList.contains(str)) {
                        DtbLog.warn(LOG_TAG, "custom version \"" + str + "\" is not valid");
                    }
                    mRaidCustomArray.put(str);
                }
            }
        }
        resetMraid();
    }

    /* access modifiers changed from: protected */
    public String[] dfpCandidateList() {
        return new String[]{"com.google.android.gms.common.GoogleApiAvailability", "com.google.android.gms.common.GoogleApiAvailabilityLight", "com.google.android.gms.common.GooglePlayServicesUtil", "com.google.android.gms.common.GooglePlayServicesUtilLight"};
    }

    /* access modifiers changed from: protected */
    public void defineMraid() {
        String stringFieldValue = DtbCommonUtils.getStringFieldValue(getFullyQuaifiedMoPUBClassName(), "SDK_VERSION");
        if (stringFieldValue != null) {
            DtbLog.debug("MOPUB VERSION:" + stringFieldValue);
        } else {
            DtbLog.debug("MOPUB VERSION NOT FOUND");
        }
        DtbCommonUtils.APIVersion aPIVersion = DtbCommonUtils.getAPIVersion(stringFieldValue);
        Integer num = null;
        DtbCommonUtils.APIVersion aPIVersion2 = new DtbCommonUtils.APIVersion();
        for (String str : dfpCandidateList()) {
            if (num != null) {
                break;
            }
            num = DtbCommonUtils.getIntegerFieldValue(str, "GOOGLE_PLAY_SERVICES_VERSION_CODE");
        }
        if (num == null) {
            for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
                num = DtbCommonUtils.getIntegerFieldValue("com.google.android.gms.common.zz" + c, "GOOGLE_PLAY_SERVICES_VERSION_CODE");
                if (num != null) {
                    break;
                }
            }
        }
        if (num != null) {
            int intValue = num.intValue() / 1000;
            aPIVersion2.minorVersion = (intValue % 1000) / 100;
            aPIVersion2.majorVersion = intValue / 1000;
            DtbLog.debug("Google DFP major version:" + aPIVersion2.majorVersion + "minor version:" + aPIVersion2.minorVersion);
        } else {
            DtbLog.debug("Not able to identify Google DFP version");
        }
        mRaidDefined = true;
        int i = C11511.$SwitchMap$com$amazon$device$ads$MRAIDPolicy[AdRegistration.getMRAIDPolicy().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        mRaidArray = mRaidCustomArray;
                    }
                } else if (stringFieldValue != null) {
                    useMoPUB(aPIVersion);
                }
            } else if (num != null) {
                useDFP(aPIVersion2);
            }
        } else if (!isServerless()) {
            if (stringFieldValue != null) {
                useMoPUB(aPIVersion);
            } else if (num != null) {
                useDFP(aPIVersion2);
            }
        }
    }

    /* renamed from: com.amazon.device.ads.DTBAdRequest$1 */
    static /* synthetic */ class C11511 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MRAIDPolicy;

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
                com.amazon.device.ads.MRAIDPolicy[] r0 = com.amazon.device.ads.MRAIDPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy = r0
                com.amazon.device.ads.MRAIDPolicy r1 = com.amazon.device.ads.MRAIDPolicy.AUTO_DETECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MRAIDPolicy     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.MRAIDPolicy r1 = com.amazon.device.ads.MRAIDPolicy.DFP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MRAIDPolicy     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.MRAIDPolicy r1 = com.amazon.device.ads.MRAIDPolicy.MOPUB     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MRAIDPolicy     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.MRAIDPolicy r1 = com.amazon.device.ads.MRAIDPolicy.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MRAIDPolicy     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.MRAIDPolicy r1 = com.amazon.device.ads.MRAIDPolicy.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdRequest.C11511.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public boolean isServerless() {
        String[] serverlessMarkers = AdRegistration.getServerlessMarkers();
        int length = serverlessMarkers.length;
        int i = 0;
        while (i < length) {
            try {
                Class.forName(serverlessMarkers[i]);
                JSONArray jSONArray = new JSONArray();
                mRaidArray = jSONArray;
                jSONArray.put("1.0");
                mRaidArray.put("2.0");
                mRaidArray.put(MraidEnvironmentProperties.VERSION);
                return true;
            } catch (Exception unused) {
                i++;
            }
        }
        return false;
    }

    private void useMoPUB(DtbCommonUtils.APIVersion aPIVersion) {
        if (aPIVersion.majorVersion > 0) {
            JSONArray jSONArray = new JSONArray();
            mRaidArray = jSONArray;
            jSONArray.put("1.0");
            if ((aPIVersion.majorVersion >= 3 && aPIVersion.minorVersion >= 3) || aPIVersion.majorVersion > 3) {
                mRaidArray.put("2.0");
            }
        }
    }

    private void useDFP(DtbCommonUtils.APIVersion aPIVersion) {
        if (aPIVersion.majorVersion > 0) {
            JSONArray jSONArray = new JSONArray();
            mRaidArray = jSONArray;
            jSONArray.put("1.0");
            if ((aPIVersion.majorVersion == 7 && aPIVersion.minorVersion >= 8) || aPIVersion.majorVersion > 7) {
                mRaidArray.put("2.0");
            }
            if (aPIVersion.majorVersion >= 15) {
                mRaidArray.put(MraidEnvironmentProperties.VERSION);
            }
        }
    }

    public void setSizes(DTBAdSize... dTBAdSizeArr) throws IllegalArgumentException {
        this.adSizes.clear();
        String str = LOG_TAG;
        DtbLog.info(str, "Setting " + dTBAdSizeArr.length + " AdSize(s) to the ad request.");
        int length = dTBAdSizeArr.length;
        int i = 0;
        while (i < length) {
            DTBAdSize dTBAdSize = dTBAdSizeArr[i];
            if (dTBAdSize != null) {
                this.adSizes.add(dTBAdSize);
                i++;
            } else {
                throw new IllegalArgumentException("DTBAdSize cannot be null.");
            }
        }
    }

    public void putCustomTarget(String str, String str2) {
        try {
            this.customTargets.put(str, str2);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute putCustomTarget method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute putCustomTarget method", e);
        }
    }

    public void setSlotGroup(String str) {
        this.slotGroup = str;
    }

    public String getSlotGroupName() {
        return this.slotGroup;
    }

    /* access modifiers changed from: package-private */
    public void setAdSizes(List<DTBAdSize> list) {
        this.adSizes.clear();
        for (DTBAdSize next : list) {
            if (next != null) {
                this.adSizes.add(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<DTBAdSize> getAdSizes() {
        return this.adSizes;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getCustomTargets() {
        return this.customTargets;
    }

    /* access modifiers changed from: package-private */
    public void setCustomTargets(Map<String, String> map) {
        this.customTargets.clear();
        for (Map.Entry next : map.entrySet()) {
            this.customTargets.put(next.getKey(), next.getValue());
        }
    }

    public void setRefreshFlag(boolean z) {
        this.refreshFlag = z;
    }

    /* access modifiers changed from: package-private */
    public void recycle() {
        this.requestHasBeenUsed = false;
    }

    private void loadAd(DTBAdCallback dTBAdCallback, String str) throws DTBLoadException {
        AdRegistration.SlotGroup slotGroup2 = AdRegistration.getSlotGroup(this.slotGroup);
        if (slotGroup2 != null) {
            DTBAdSize sizeBySlotUUID = slotGroup2.getSizeBySlotUUID(str);
            if (sizeBySlotUUID != null) {
                setSizes(sizeBySlotUUID);
                loadAd(dTBAdCallback);
                return;
            }
            throw new DTBLoadException("Slot group does not contain requested slotUUID");
        }
        throw new DTBLoadException("Slot group is not found");
    }

    private void loadAd(DTBAdCallback dTBAdCallback, int i, int i2) throws DTBLoadException {
        loadAd(dTBAdCallback, i, i2, AdType.DISPLAY);
    }

    private void loadAd(DTBAdCallback dTBAdCallback, int i, int i2, AdType adType) throws DTBLoadException {
        AdRegistration.SlotGroup slotGroup2 = AdRegistration.getSlotGroup(this.slotGroup);
        if (slotGroup2 != null) {
            DTBAdSize sizeByWidthHeightType = slotGroup2.getSizeByWidthHeightType(i, i2, adType);
            if (sizeByWidthHeightType != null) {
                setSizes(sizeByWidthHeightType);
                loadAd(dTBAdCallback);
                return;
            }
            throw new DTBLoadException("Slot group does not contain required size of a given type");
        }
        throw new DTBLoadException("Slot group is not found");
    }

    public void loadSmartBanner(DTBAdCallback dTBAdCallback) throws DTBLoadException {
        try {
            int i = 320;
            int i2 = 50;
            if (DtbDeviceDataRetriever.isTablet()) {
                i = 728;
                i2 = 90;
            }
            loadAd(dTBAdCallback, i, i2);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute loadSmartBanner method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute loadSmartBanner method", e);
        }
    }

    public void loadAd(DTBAdCallback dTBAdCallback) {
        try {
            this.callback = dTBAdCallback;
            if (this.adSizes.size() <= 0) {
                throw new IllegalArgumentException("Please set at least one ad size in the request.");
            } else if (this.requestHasBeenUsed) {
                DtbLog.error(LOG_TAG, "This ad request object is already used for loading an ad. Please create a new instance to load the Ad.");
            } else {
                this.requestHasBeenUsed = true;
                DtbDeviceRegistration.verifyRegistration();
                for (DTBAdSize next : this.adSizes) {
                    Map<String, String> map = this.sizeSlotUUIDMap;
                    map.put(next.getWidth() + "x" + next.getHeight(), next.getSlotUUID());
                }
                try {
                    if (this.mHandlerThread == null && this.isAutoRefresh && this.refreshDuration > 0) {
                        HandlerThread handlerThread = new HandlerThread("DtbHandlerThread");
                        this.mHandlerThread = handlerThread;
                        handlerThread.start();
                        this.mHandler = new Handler(this.mHandlerThread.getLooper());
                    }
                    internalLoadAd();
                } catch (Exception e) {
                    DtbLog.error(LOG_TAG, "Unknown exception occured in DTB ad call.");
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unknown exception occured in DTB ad call.", e);
                }
            }
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute loadAd method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute loadAd method", e2);
        }
    }

    public void setAutoRefresh() {
        try {
            this.isAutoRefresh = true;
            setRefreshDuration(60);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute setAutoRefresh method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setAutoRefresh method", e);
        }
    }

    public void setAutoRefresh(int i) {
        try {
            this.isAutoRefresh = true;
            setRefreshDuration(i);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute setAutoRefresh method with seconds argument");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setAutoRefresh method with seconds argument", e);
        }
    }

    public void pauseAutoRefresh() {
        this.isAutoRefresh = false;
        this.refreshFlag = false;
    }

    public void resumeAutoRefresh() {
        try {
            setAutoRefresh(this.refreshDuration);
            lambda$new$0$DTBAdRequest();
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute resumeAutoRefresh method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute resumeAutoRefresh method", e);
        }
    }

    public int getRefreshDuration() {
        return this.refreshDuration;
    }

    private void setRefreshDuration(int i) {
        if (i < 20) {
            DtbLog.warn(LOG_TAG, "Defaulting auto refresh duration to 60 seconds.");
            this.refreshDuration = 60;
            return;
        }
        this.refreshDuration = i;
    }

    public void stop() {
        try {
            stopAutoRefresh();
            if (this.mHandlerThread != null) {
                this.mHandlerThread.quit();
                DtbLog.debug("Stopping DTB auto refresh");
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute stop method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute stop method", e);
        }
    }

    private void internalLoadAd() {
        DtbLog.debug("Loading DTB ad.");
        DtbThreadService.getInstance().execute(new Runnable() {
            public final void run() {
                DTBAdRequest.this.lambda$internalLoadAd$1$DTBAdRequest();
            }
        });
        DtbLog.debug("Dispatched the loadAd task on a background thread.");
    }

    public /* synthetic */ void lambda$internalLoadAd$1$DTBAdRequest() {
        DtbLog.info("Fetching DTB ad.");
        try {
            loadAdRequest();
            DtbLog.debug("DTB Ad call is complete");
        } catch (Exception unused) {
            DtbLog.error(LOG_TAG, "Unknown exception in DTB ad call process.");
        }
    }

    private void stopAutoRefresh() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.refreshFlag = false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: refreshAd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$new$0$DTBAdRequest() {
        /*
            r3 = this;
            boolean r0 = r3.isAutoRefresh
            if (r0 == 0) goto L_0x003e
            int r0 = r3.refreshDuration
            if (r0 <= 0) goto L_0x003e
            r0 = 0
            android.content.Context r1 = r3.context
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0027
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L_0x001e
            boolean r1 = com.amazon.device.ads.DtbCommonUtils.isActivityDestroyed(r0)
            if (r1 == 0) goto L_0x0027
        L_0x001e:
            java.lang.String r0 = "Stopping DTB auto refresh..."
            com.amazon.device.ads.DtbLog.info(r0)
            r3.stop()
            return
        L_0x0027:
            r1 = 1
            r3.refreshFlag = r1
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "Skipping DTB auto refresh...activity not in focus"
            com.amazon.device.ads.DtbLog.debug(r0)
            r3.scheduleAdRefreshIfEnabled()
            goto L_0x003e
        L_0x003b:
            r3.internalLoadAd()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdRequest.lambda$new$0$DTBAdRequest():void");
    }

    private void scheduleAdRefreshIfEnabled() {
        if (this.isAutoRefresh && this.refreshDuration > 0) {
            stopAutoRefresh();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mRefreshRunnable, ((long) this.refreshDuration) * 1000);
            }
        }
    }

    private void addGDPRParameters(Map<String, Object> map) {
        Context context2 = this.context;
        if (context2 != null) {
            addGDPRParametersFromPreferences(map, PreferenceManager.getDefaultSharedPreferences(context2));
        }
    }

    /* access modifiers changed from: protected */
    public void addGDPRParametersFromPreferences(Map<String, Object> map, SharedPreferences sharedPreferences) {
        JSONObject jSONObject = null;
        String string = sharedPreferences.getString("IABConsent_SubjectToGDPR", (String) null);
        Object obj = sharedPreferences.contains(CmpApiConstants.IABTCF_GDPR_APPLIES) ? sharedPreferences.getAll().get(CmpApiConstants.IABTCF_GDPR_APPLIES) : null;
        String string2 = sharedPreferences.getString("IABConsent_ConsentString", (String) null);
        String string3 = sharedPreferences.getString(CmpApiConstants.IABTCF_TC_STRING, (String) null);
        String encodedNonIABString = AdRegistration.getEncodedNonIABString();
        if (string3 != null || string2 != null) {
            jSONObject = new JSONObject();
            if (string3 != null) {
                jSONObject.put("c", string3);
            } else if (string2 != null) {
                jSONObject.put("c", string2);
            }
        } else if (encodedNonIABString != null) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("c", encodedNonIABString);
            } catch (JSONException unused) {
                DtbLog.error("INVALID JSON formed for GDPR clause");
                return;
            }
        }
        if (!(string == null && obj == null)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (obj != null) {
                try {
                    if ((obj instanceof Integer) && (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0)) {
                        jSONObject.put("e", obj);
                    } else if ((!(obj instanceof String) || !((String) obj).equals("1")) && !((String) obj).equals("0")) {
                        DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                    } else {
                        jSONObject.put("e", obj);
                    }
                } catch (ClassCastException unused2) {
                    DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                }
            } else if (string != null) {
                jSONObject.put("e", string);
            }
        }
        if (jSONObject != null && jSONObject.length() != 0) {
            map.put("gdpr", jSONObject);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        com.amazon.device.ads.DtbLog.debug("Malformed kvp value from ad response: " + r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02f2, code lost:
        com.amazon.device.ads.DtbLog.debug("Internal error occurred in ad call: " + r0.getMessage());
        r1.adError = createAdError(com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR, "Internal error occurred in ad call.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02f1 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:16:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0048 A[EDGE_INSN: B:99:0x0048->B:10:0x0048 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAdRequest() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "inventoryType"
            java.lang.String r3 = "crid"
            java.lang.String r4 = "skipAfter"
            java.lang.String r5 = "i"
            java.lang.String r6 = "kvp"
            java.lang.String r7 = "v"
            java.lang.String r0 = "ads"
            java.lang.String r8 = "instrPixelURL"
            java.lang.String r9 = "Ad call did not complete successfully."
            java.lang.String r10 = "application/json"
            java.lang.String r11 = "errorCode"
            boolean r12 = r1.isAutoRefresh
            if (r12 == 0) goto L_0x0048
            java.util.List<com.amazon.device.ads.DTBAdSize> r12 = r1.adSizes
            java.util.Iterator r12 = r12.iterator()
        L_0x0022:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0048
            java.lang.Object r13 = r12.next()
            com.amazon.device.ads.DTBAdSize r13 = (com.amazon.device.ads.DTBAdSize) r13
            com.amazon.device.ads.AdType r14 = r13.getDTBAdType()
            com.amazon.device.ads.AdType r15 = com.amazon.device.ads.AdType.INTERSTITIAL
            if (r14 == r15) goto L_0x003e
            com.amazon.device.ads.AdType r13 = r13.getDTBAdType()
            com.amazon.device.ads.AdType r14 = com.amazon.device.ads.AdType.VIDEO
            if (r13 != r14) goto L_0x0022
        L_0x003e:
            r12 = 0
            r1.isAutoRefresh = r12
            r1.refreshFlag = r12
            java.lang.String r12 = "Autorefresh could not be used for interstitial or video"
            com.amazon.device.ads.DtbLog.warn(r12)
        L_0x0048:
            com.amazon.device.ads.DtbMetrics r12 = new com.amazon.device.ads.DtbMetrics
            r12.<init>()
            com.amazon.device.ads.DtbAdRequestParamsBuilder r13 = new com.amazon.device.ads.DtbAdRequestParamsBuilder
            r13.<init>()
            android.content.Context r14 = r1.context
            java.util.List<com.amazon.device.ads.DTBAdSize> r15 = r1.adSizes
            r16 = r9
            java.util.Map<java.lang.String, java.lang.String> r9 = r1.customTargets
            r17 = r3
            boolean r3 = r1.refreshFlag
            java.util.HashMap r3 = r13.getParams(r14, r15, r9, r3)
            r1.addGDPRParameters(r3)
            r1.addMraidParameters(r3)
            com.amazon.device.ads.DtbSharedPreferences r9 = com.amazon.device.ads.DtbSharedPreferences.getInstance()
            java.lang.String r9 = r9.getAaxHostname()
            java.lang.String r9 = com.amazon.device.ads.DtbDebugProperties.getAaxHostName(r9)
            java.util.List<com.amazon.device.ads.DTBAdSize> r13 = r1.adSizes
            java.util.Iterator r13 = r13.iterator()
        L_0x007a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x009f
            java.lang.Object r14 = r13.next()
            com.amazon.device.ads.DTBAdSize r14 = (com.amazon.device.ads.DTBAdSize) r14
            com.amazon.device.ads.AdType r15 = com.amazon.device.ads.AdType.VIDEO
            com.amazon.device.ads.AdType r14 = r14.getDTBAdType()
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x007a
            com.amazon.device.ads.DtbSharedPreferences r9 = com.amazon.device.ads.DtbSharedPreferences.getInstance()
            java.lang.String r9 = r9.getRoute53EnabledCNAME()
            java.lang.String r9 = com.amazon.device.ads.DtbDebugProperties.getRoute53EnabledCNAME(r9)
            goto L_0x007a
        L_0x009f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.<init>()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.append(r9)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r15 = "/e/msdk/ads"
            r14.append(r15)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = r14.toString()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = com.amazon.device.ads.DtbDebugProperties.getEncodedUrlParams()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            int r14 = r14.length()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r14 <= 0) goto L_0x00cb
            r14 = 63
            r13.append(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = com.amazon.device.ads.DtbDebugProperties.getEncodedUrlParams()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r13.append(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x00cb:
            com.amazon.device.ads.DtbHttpClient r14 = new com.amazon.device.ads.DtbHttpClient     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r13 = r13.toString()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.<init>(r13)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r13 = 1
            boolean r15 = com.amazon.device.ads.DtbDebugProperties.getIsSecure(r13)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.setUseSecure(r15)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r15 = "Accept"
            r14.addHeader(r15, r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r15 = "Content-Type"
            r14.addHeader(r15, r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.setParams(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.onRequestFormed(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbMetric r3 = com.amazon.device.ads.DtbMetric.AAX_BID_TIME     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.startTimer(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbSharedPreferences r3 = com.amazon.device.ads.DtbSharedPreferences.getInstance()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            int r3 = r3.getBidTimeout()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.executePOST(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r3 = "Ad call completed."
            com.amazon.device.ads.DtbLog.debug(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r3 = r14.getResponse()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r3 = com.amazon.device.ads.DtbCommonUtils.isNullOrEmpty((java.lang.String) r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r3 != 0) goto L_0x02da
            com.amazon.device.ads.DtbMetric r3 = com.amazon.device.ads.DtbMetric.AAX_BID_TIME     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.stopTimer(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            org.json.JSONTokener r3 = new org.json.JSONTokener     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r10 = r14.getResponse()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.Object r3 = r3.nextValue()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r3 == 0) goto L_0x0135
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r10.<init>()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r15 = "Bid Response:"
            r10.append(r15)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r10.append(r3)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbLog.debug(r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0135:
            if (r3 == 0) goto L_0x02c7
            int r10 = r14.getResponseCode()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r10 != r14) goto L_0x02c7
            boolean r10 = r3.has(r8)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r10 == 0) goto L_0x014c
            java.lang.String r8 = r3.getString(r8)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.setInstPxlUrl(r8)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x014c:
            boolean r8 = r3.has(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r8 == 0) goto L_0x0290
            java.lang.String r8 = r3.getString(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r10 = "200"
            boolean r8 = r8.equals(r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r8 == 0) goto L_0x0290
            boolean r8 = r3.has(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r8 == 0) goto L_0x0290
            org.json.JSONObject r3 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBAdResponse r0 = new com.amazon.device.ads.DTBAdResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.<init>()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adResponse = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBAdRequest r8 = com.amazon.device.ads.DtbCommonUtils.createAutoRefreshAdLoader(r18)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.setAdLoader(r8)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.setHostName(r9)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 <= 0) goto L_0x027a
            java.util.Iterator r8 = r3.keys()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0185:
            boolean r0 = r8.hasNext()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x0256
            java.lang.Object r0 = r8.next()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            org.json.JSONObject r10 = r3.getJSONObject(r9)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r11 = "b"
            java.lang.String r11 = r10.getString(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.setBidId(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r0 = r10.has(r7)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x01da
            boolean r0 = r10.getBoolean(r7)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x01da
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.setVideo(r13)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r0 = r10.has(r4)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r10.opt(r4)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r11 = r0 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r11 == 0) goto L_0x01cb
            com.amazon.device.ads.DTBAdResponse r11 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r11.setVideoSkipAfterDurationInSeconds(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x01cb:
            boolean r0 = r10.has(r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x01da
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r11 = r10.getString(r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.setVideoInventoryType(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x01da:
            boolean r0 = r10.has(r6)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x0203
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x01ea, Exception -> 0x02f1 }
            org.json.JSONObject r11 = r10.getJSONObject(r6)     // Catch:{ JSONException -> 0x01ea, Exception -> 0x02f1 }
            r0.setKvpDictionary(r11)     // Catch:{ JSONException -> 0x01ea, Exception -> 0x02f1 }
            goto L_0x0203
        L_0x01ea:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r11.<init>()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = "Malformed kvp value from ad response: "
            r11.append(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r11.append(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r0 = r11.toString()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0203:
            java.lang.String r0 = "sz"
            java.lang.String r0 = r10.getString(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r11 = r10.has(r5)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r11 == 0) goto L_0x0218
            com.amazon.device.ads.DTBAdResponse r11 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = r10.getString(r5)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r11.setImpressionUrl(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0218:
            r11 = r17
            boolean r14 = r10.has(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r14 == 0) goto L_0x0229
            com.amazon.device.ads.DTBAdResponse r14 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.setCrid(r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0229:
            com.amazon.device.ads.AdType r10 = com.amazon.device.ads.AdType.DISPLAY     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r14 = "9999x9999"
            boolean r14 = r14.equals(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r14 == 0) goto L_0x0236
            com.amazon.device.ads.AdType r10 = com.amazon.device.ads.AdType.INTERSTITIAL     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x0240
        L_0x0236:
            com.amazon.device.ads.DTBAdResponse r14 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r14 = r14.isVideo()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r14 == 0) goto L_0x0240
            com.amazon.device.ads.AdType r10 = com.amazon.device.ads.AdType.VIDEO     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0240:
            com.amazon.device.ads.DtbPricePoint r14 = new com.amazon.device.ads.DtbPricePoint     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.util.Map<java.lang.String, java.lang.String> r15 = r1.sizeSlotUUIDMap     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.Object r15 = r15.get(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r14.<init>(r9, r0, r15, r10)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r0.putPricePoint(r14)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r17 = r11
            goto L_0x0185
        L_0x0256:
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.NO_ERROR     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "Ad loaded successfully."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            boolean r0 = com.amazon.device.ads.AdRegistration.hasAdapters()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x0273
            com.amazon.device.ads.DTBAdResponse r0 = r1.adResponse     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r0 = r0.getBidId()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DTBBidInspector r2 = com.amazon.device.ads.DTBBidInspector.getInstance()     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r2.addBid(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x0273:
            java.lang.String r0 = "Ad call response successfully processed."
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x0338
        L_0x027a:
            java.lang.String r0 = "No pricepoint returned from ad server"
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbMetric r0 = com.amazon.device.ads.DtbMetric.AAX_PUNTED     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.incrementMetric(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.NO_FILL     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "No pricepoint returned from ad server."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x0338
        L_0x0290:
            boolean r0 = r3.has(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x02b2
            java.lang.String r0 = r3.getString(r11)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "400"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            if (r0 == 0) goto L_0x02b2
            java.lang.String r0 = "Ad Server punted due to invalid request."
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.REQUEST_ERROR     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "Invalid request passed to AdServer."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x02c1
        L_0x02b2:
            java.lang.String r0 = "No ad returned from ad server"
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.NO_FILL     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "No Ad returned by AdServer."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x02c1:
            com.amazon.device.ads.DtbMetric r0 = com.amazon.device.ads.DtbMetric.AAX_PUNTED     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.incrementMetric(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x0338
        L_0x02c7:
            com.amazon.device.ads.DtbLog.debug(r16)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.NETWORK_ERROR     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r2 = r16
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.DtbMetric r0 = com.amazon.device.ads.DtbMetric.AAX_NETWORK_FAILURE     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r12.incrementMetric(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            goto L_0x0338
        L_0x02da:
            java.lang.String r0 = "No response from Ad call."
            com.amazon.device.ads.DtbLog.debug(r0)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "Response is null."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            r1.adError = r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            java.lang.String r2 = "Response is null"
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
            throw r0     // Catch:{ JSONException -> 0x0315, Exception -> 0x02f1 }
        L_0x02f1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Internal error occurred in ad call: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amazon.device.ads.DtbLog.debug(r0)
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR
            java.lang.String r2 = "Internal error occurred in ad call."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)
            r1.adError = r0
            goto L_0x0338
        L_0x0315:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Malformed response from ad call: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.amazon.device.ads.DtbLog.debug(r0)
            com.amazon.device.ads.AdError$ErrorCode r0 = com.amazon.device.ads.AdError.ErrorCode.INTERNAL_ERROR
            java.lang.String r2 = "Malformed response from ad call."
            com.amazon.device.ads.AdError r0 = r1.createAdError(r0, r2)
            r1.adError = r0
        L_0x0338:
            com.amazon.device.ads.AdError r0 = r1.adError
            if (r0 != 0) goto L_0x0341
            java.lang.String r0 = "UNEXPECTED ERROR in ad call !!"
            com.amazon.device.ads.DtbLog.debug(r0)
        L_0x0341:
            r1.triggerCallBack(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdRequest.loadAdRequest():void");
    }

    private AdError createAdError(AdError.ErrorCode errorCode, String str) {
        AdError adError2 = new AdError(errorCode, str);
        adError2.setAdLoader(DtbCommonUtils.createAutoRefreshAdLoader(this));
        return adError2;
    }

    private void triggerCallBack(DtbMetrics dtbMetrics) {
        scheduleAdRefreshIfEnabled();
        DtbLog.info(LOG_TAG, "Forwarding the error handling to view on main thread.");
        DtbThreadService.executeOnMainThread(new Runnable(dtbMetrics) {
            public final /* synthetic */ DtbMetrics f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DTBAdRequest.this.lambda$triggerCallBack$2$DTBAdRequest(this.f$1);
            }
        });
        if (this.submitMetrics) {
            DtbMetrics.Submitter.INSTANCE.submitMetrics(dtbMetrics);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: executeCallback */
    public void lambda$triggerCallBack$2$DTBAdRequest(DtbMetrics dtbMetrics) {
        WrapperReport detectWrapper;
        if (this.callback == null) {
            DtbLog.error("No callback -DTBAdCallback- provided to loadAd() to handle success or failure.");
        } else if (this.adError == null || this.adError.getCode() != AdError.ErrorCode.NO_ERROR) {
            DtbLog.debug("Invoking onFailure() callback with errorCode: " + this.adError.getCode() + "[" + this.adError.getMessage() + "]");
            this.callback.onFailure(this.adError);
        } else {
            DtbLog.debug("Invoking onSuccess() callback for pricepoints: [" + this.adResponse.getDefaultPricePoints() + "]");
            this.callback.onSuccess(this.adResponse);
            DtbLog.debug("Performing SDK wrapping detection. Will submit a report if needed.");
            if (wrapperDetectionNeeded() && (detectWrapper = detectWrapper(this.callback)) != null) {
                if (Math.random() <= ((double) (((float) DTBMetricsConfiguration.getClientConfigVal("wrapping_pixel", DTBMetricsConfiguration.WRAPPING_PIXEL_DEFAULT_VALUE.intValue(), "sample_rates").intValue()) / 100.0f))) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("expected_package", detectWrapper.expectedPackage);
                    hashMap.put("wrapper_package", detectWrapper.wrapperPackage);
                    DTBMetricsProcessor.getInstance().submitErrorReport("alert_sdk_wrapping_v2", hashMap, DTBMetricReport.addBid((String) null, DtbCommonUtils.getHostNameFromUrl(dtbMetrics.getInstPxlUrl())));
                }
            }
        }
    }

    private void addMraidParameters(Map<String, Object> map) {
        JSONArray jSONArray = mRaidArray;
        if (jSONArray != null && jSONArray.length() > 0) {
            map.put(CampaignEx.JSON_KEY_MRAID, mRaidArray);
        }
    }

    class WrapperReport {
        String expectedPackage;
        String wrapperPackage;

        WrapperReport() {
        }
    }

    private WrapperReport detectWrapper(Object obj) {
        Context applicationContext = AdRegistration.getContext().getApplicationContext();
        try {
            String name = obj.getClass().getPackage().getName();
            String str = applicationContext.getApplicationInfo().packageName;
            StringTokenizer stringTokenizer = new StringTokenizer(name, ".");
            StringTokenizer stringTokenizer2 = new StringTokenizer(str, ".");
            if (stringTokenizer.countTokens() < 2 || stringTokenizer2.countTokens() < 2) {
                WrapperReport wrapperReport = new WrapperReport();
                wrapperReport.expectedPackage = str;
                wrapperReport.wrapperPackage = name;
                return wrapperReport;
            }
            for (int i = 0; i < 2; i++) {
                if (!stringTokenizer.nextToken().equals(stringTokenizer2.nextToken())) {
                    WrapperReport wrapperReport2 = new WrapperReport();
                    wrapperReport2.expectedPackage = name;
                    wrapperReport2.wrapperPackage = str;
                    return wrapperReport2;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean wrapperDetectionNeeded() {
        DtbSharedPreferences instance = DtbSharedPreferences.getInstance();
        Long wrapperDetectionLastPing = instance.getWrapperDetectionLastPing();
        long time = new Date().getTime();
        boolean z = true;
        if (wrapperDetectionLastPing != null && time - wrapperDetectionLastPing.longValue() <= WEEK) {
            z = false;
        }
        if (z) {
            instance.saveWrapperDetectionLastPing(time);
        }
        return z;
    }
}
