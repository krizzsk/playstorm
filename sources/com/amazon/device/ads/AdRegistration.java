package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class AdRegistration {
    /* access modifiers changed from: private */
    public static final String LOGTAG = AdRegistration.class.getSimpleName();
    private static Map<String, DTBCacheData> adMobRequestIdMap = new HashMap();
    private static AdRegistration adRegistrationInstance = null;
    private static CMPFlavor cmpFlavor;
    private static boolean consentStringDirty;
    private static ConsentStatus currentConsentStatus;
    private static String currentVendorListString;
    private static Map<String, String> customDictionary;
    private static HashMap<String, SlotGroup> groups;
    private static boolean isOmSdkActivated;
    private static String lastSeenNonIABEncodedConsentString;
    private static boolean locationEnabled = false;
    private static String mAppKey;
    private static Context mContext;
    static MRAIDPolicy mraidPolicy = MRAIDPolicy.AUTO_DETECT;
    static List<String> providersProprietaryKeys;
    private static String sdkDistributionPlace;
    static String[] serverlessMarkers = {"com.amazon.admob_adapter.APSAdMobCustomBannerEvent", "com.amazon.mopub_adapter.APSMopubCustomBannerEvent", "com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter"};
    private static boolean testMode = false;
    private ActivityMonitor activityMonitor;
    private EventDistributor eventDistributor = new EventDistributor();
    private Set<AdProvider> providers = new HashSet();

    public enum CMPFlavor {
        CMP_NOT_DEFINED,
        GOOGLE_CMP,
        MOPUB_CMP,
        ADMOB_CMP
    }

    public enum ConsentStatus {
        CONSENT_NOT_DEFINED,
        EXPLICIT_YES,
        EXPLICIT_NO,
        UNKNOWN
    }

    private ActivityMonitor getActivityMonitor() {
        return this.activityMonitor;
    }

    private void setActivityMonitor(ActivityMonitor activityMonitor2) {
        this.activityMonitor = activityMonitor2;
    }

    static Activity getCurrentActivity() {
        return adRegistrationInstance.getActivityMonitor().getCurrentActivity();
    }

    public static void addProvider(AdProvider adProvider) {
        if (adRegistrationInstance != null) {
            Class<?> cls = adProvider.getClass();
            for (AdProvider adProvider2 : adRegistrationInstance.providers) {
                if (adProvider2.getClass().equals(cls)) {
                    return;
                }
            }
            adRegistrationInstance.providers.add(adProvider);
            appendProprietaryProviderKeys(adProvider.getProprietaryKeys());
            return;
        }
        throw new IllegalStateException("Instance must be initialized prior to adding providers");
    }

    @Deprecated
    public static EventDistributor getEventDistributer() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.eventDistributor;
        }
        throw new IllegalStateException("Instance must be initialized prior using getEventDistributer API");
    }

    public static Set<AdProvider> getAdProviders() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.providers;
        }
        return null;
    }

    static void appendProprietaryProviderKeys(String[] strArr) {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        for (String add : strArr) {
            providersProprietaryKeys.add(add);
        }
    }

    public static List<String> getProprietaryProviderKeys() {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        return providersProprietaryKeys;
    }

    private AdRegistration(String str, Context context) throws IllegalArgumentException {
        if (context == null || str == null || "".equals(str.trim())) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameters.", illegalArgumentException);
            throw illegalArgumentException;
        }
        try {
            Class.forName("com.amazon.aps.shared.APSAnalytics");
            mAppKey = str;
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            APSAnalytics.init(applicationContext);
            DtbSharedPreferences createInstance = DtbSharedPreferences.createInstance();
            context.checkCallingOrSelfPermission("android.permission.INTERNET");
            if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                DtbLog.error(LOGTAG, "Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
            }
            String versionInUse = createInstance.getVersionInUse();
            if (versionInUse == null || DtbCommonUtils.isNullOrEmpty(versionInUse)) {
                createInstance.setVersionInUse("9.5.0");
                createInstance.setGooglePlayServicesUnavailable(false);
            }
            isOmSdkActivated = DtbOmSdkSessionManager.activateOMSDK(mContext);
            String str2 = LOGTAG;
            DtbLog.info(str2, "OM SDK Activation Status :" + isOmSdkActivated);
            currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
            cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
            consentStringDirty = false;
            customDictionary = new HashMap();
            JSONObject loadJsonFromAsset = DTBAdUtil.loadJsonFromAsset("aps_distribution_marker.json");
            if (loadJsonFromAsset != null) {
                try {
                    sdkDistributionPlace = loadJsonFromAsset.getString("distribution");
                } catch (Exception unused) {
                    DtbLog.warn("Unable to get distribution place value");
                }
            }
        } catch (ClassNotFoundException unused2) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Missing APSAndroidShared SDK. Please import the APSAndroidShared SDK to your project. For further details, please refer to our Android SDK documentation.");
            DtbLog.fatal(LOGTAG, "Missing APSAndroidShared SDK. Please import the APSAndroidShared SDK to your project. For further details, please refer to our Android SDK documentation.", illegalArgumentException2);
            throw illegalArgumentException2;
        }
    }

    public static String getAppKey() {
        return mAppKey;
    }

    public static boolean isInitialized() {
        return adRegistrationInstance != null;
    }

    public static AdRegistration getInstance(String str, Context context) throws IllegalArgumentException {
        if (!isInitialized()) {
            adRegistrationInstance = new AdRegistration(str, context);
            DTBMetricsConfiguration.getInstance();
        } else if (str != null && !str.equals(mAppKey)) {
            mAppKey = str;
            DtbSharedPreferences.createInstance();
        }
        adRegistrationInstance.setActivityMonitor(new ActivityMonitor(context));
        return adRegistrationInstance;
    }

    @Deprecated
    public static void setAppKey(String str) throws IllegalArgumentException {
        if (!isInitialized()) {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        } else if (!DtbCommonUtils.isNullOrEmpty(str)) {
            mAppKey = str;
            DtbSharedPreferences.createInstance();
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:appKey for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:appKey.", illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    @Deprecated
    public static void setContext(Context context) {
        if (context != null) {
            mContext = context.getApplicationContext();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:context for initialization.");
        DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:context.", illegalArgumentException);
        throw illegalArgumentException;
    }

    static Context getContext() {
        return mContext;
    }

    public static void setMRAIDPolicy(MRAIDPolicy mRAIDPolicy) {
        mraidPolicy = mRAIDPolicy;
        DTBAdRequest.resetMraid();
    }

    public static MRAIDPolicy getMRAIDPolicy() {
        return mraidPolicy;
    }

    public static void setMRAIDSupportedVersions(String[] strArr) {
        DTBAdRequest.setMRAIDSupportedVersions(strArr);
    }

    public static void enableLogging(boolean z) {
        if (z) {
            try {
                DtbLog.setLogLevel(DTBLogLevel.All);
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute enableLogging method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method", e);
            }
        } else {
            DtbLog.setLogLevel(DTBLogLevel.Error);
        }
    }

    public static void enableLogging(boolean z, DTBLogLevel dTBLogLevel) {
        if (z) {
            try {
                DtbLog.setLogLevel(dTBLogLevel);
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute enableLogging method with logLevel argument");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableLogging method with logLevel argument", e);
            }
        } else {
            DtbLog.setLogLevel(DTBLogLevel.Error);
        }
    }

    public static void enableTesting(boolean z) {
        if (!z) {
            try {
                testMode = false;
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute enableTesting method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute enableTesting method", e);
            }
        } else if (!DTBAdUtil.isInstalledFromAppStore(mContext)) {
            testMode = z;
            DtbLog.enableCallerInfo(z);
        }
    }

    public static boolean isTestMode() {
        return testMode;
    }

    public static void useGeoLocation(boolean z) {
        locationEnabled = z;
    }

    public static boolean isLocationEnabled() {
        return locationEnabled;
    }

    public static String getVersion() {
        return DtbCommonUtils.getSDKVersion();
    }

    static String getSDKDistributionPlace() {
        return sdkDistributionPlace;
    }

    static String[] getServerlessMarkers() {
        return serverlessMarkers;
    }

    @Deprecated
    public static void setServerlessMarkers(String[] strArr) {
        serverlessMarkers = strArr;
    }

    public static class SlotGroup {
        String name;
        Set<DTBAdSize> slots;

        public SlotGroup(String str) {
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                this.name = str;
                this.slots = new HashSet();
                return;
            }
            throw new IllegalArgumentException("Slot Group name cannot be null or empty");
        }

        public void addSlot(DTBAdSize dTBAdSize) {
            try {
                for (DTBAdSize next : this.slots) {
                    if (next.getWidth() == dTBAdSize.getWidth() && next.getHeight() == dTBAdSize.getHeight() && next.getDTBAdType() == dTBAdSize.getDTBAdType()) {
                        return;
                    }
                }
                this.slots.add(dTBAdSize);
            } catch (RuntimeException e) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute addSlot method in SlotGroup class");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlot method in SlotGroup class", e);
            }
        }

        /* access modifiers changed from: package-private */
        public DTBAdSize getSizeBySlotUUID(String str) {
            for (DTBAdSize next : this.slots) {
                if (next.getSlotUUID().equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public DTBAdSize getSizeByWidthAndHeight(int i, int i2) {
            return getSizeByWidthHeightType(i, i2, AdType.DISPLAY);
        }

        public DTBAdSize getSizeByWidthHeightType(int i, int i2, AdType adType) {
            try {
                for (DTBAdSize next : this.slots) {
                    if (next.getHeight() == i2 && next.getWidth() == i && next.getDTBAdType() == adType) {
                        return next;
                    }
                }
                return null;
            } catch (RuntimeException e) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeByWidthHeightType method in SlotGroup class");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByWidthHeightType method in SlotGroup class", e);
                return null;
            }
        }

        public DTBAdSize getSizeByBannerType(DTBBannerType dTBBannerType) {
            try {
                int i = C11471.$SwitchMap$com$amazon$device$ads$DTBBannerType[dTBBannerType.ordinal()];
                if (i == 1) {
                    return getSizeByWidthAndHeight(320, 50);
                }
                if (i != 2) {
                    return null;
                }
                return getSizeByWidthAndHeight(728, 90);
            } catch (RuntimeException e) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeByBannerType method in SlotGroup class");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeByBannerType method in SlotGroup class", e);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotType(DTBSlotType dTBSlotType) {
            try {
                int i = C11471.$SwitchMap$com$amazon$device$ads$DTBSlotType[dTBSlotType.ordinal()];
                int i2 = 50;
                int i3 = 320;
                if (i == 1) {
                    return getSizeByWidthAndHeight(320, 50);
                }
                if (i == 2) {
                    return getSizeByWidthAndHeight(300, 250);
                }
                if (i == 3) {
                    return getSizeByWidthAndHeight(728, 90);
                }
                if (i != 4) {
                    return null;
                }
                if (DtbDeviceDataRetriever.isTablet()) {
                    i2 = 90;
                    i3 = 728;
                }
                return getSizeByWidthAndHeight(i3, i2);
            } catch (RuntimeException e) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeBySlotType method in SlotGroup class");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSizeBySlotType method in SlotGroup class", e);
                return null;
            }
        }
    }

    /* renamed from: com.amazon.device.ads.AdRegistration$1 */
    static /* synthetic */ class C11471 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBBannerType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBSlotType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.amazon.device.ads.DTBSlotType[] r0 = com.amazon.device.ads.DTBSlotType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$DTBSlotType = r0
                r1 = 1
                com.amazon.device.ads.DTBSlotType r2 = com.amazon.device.ads.DTBSlotType.SLOT_320_50     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$amazon$device$ads$DTBSlotType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.DTBSlotType r3 = com.amazon.device.ads.DTBSlotType.SLOT_300_250     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = $SwitchMap$com$amazon$device$ads$DTBSlotType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.DTBSlotType r3 = com.amazon.device.ads.DTBSlotType.SLOT_728_90     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = $SwitchMap$com$amazon$device$ads$DTBSlotType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.DTBSlotType r3 = com.amazon.device.ads.DTBSlotType.SLOT_SMART     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.amazon.device.ads.DTBBannerType[] r2 = com.amazon.device.ads.DTBBannerType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$amazon$device$ads$DTBBannerType = r2
                com.amazon.device.ads.DTBBannerType r3 = com.amazon.device.ads.DTBBannerType.PHONE_BANNER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = $SwitchMap$com$amazon$device$ads$DTBBannerType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.amazon.device.ads.DTBBannerType r2 = com.amazon.device.ads.DTBBannerType.TABLET_BANNER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdRegistration.C11471.<clinit>():void");
        }
    }

    public static void addSlotGroup(SlotGroup slotGroup) {
        try {
            if (groups == null) {
                groups = new HashMap<>();
            }
            groups.put(slotGroup.name, slotGroup);
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to execute addSlotGroup method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute addSlotGroup method", e);
        }
    }

    public static SlotGroup getSlotGroup(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (groups != null) {
                return groups.get(str);
            }
            return null;
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to execute getSlotGroup method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSlotGroup method", e);
            return null;
        }
    }

    static boolean hasAdapters() {
        String[] strArr = serverlessMarkers;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                Class.forName(strArr[i]);
                return true;
            } catch (Exception unused) {
                i++;
            }
        }
        return false;
    }

    public static boolean isConsentStatusUnknown() {
        try {
            return currentConsentStatus == ConsentStatus.CONSENT_NOT_DEFINED || currentConsentStatus == ConsentStatus.UNKNOWN || DtbSharedPreferences.getInstance().getVendorList() == null;
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to execute isConsentStatusUnknown method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isConsentStatusUnknown method", e);
            return true;
        }
    }

    static ConsentStatus getConsentStatus() {
        if (isInitialized()) {
            String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
            if (consentStatus == null) {
                return currentConsentStatus;
            }
            return ConsentStatus.valueOf(consentStatus);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    static CMPFlavor getCMPFlavor() {
        if (isInitialized()) {
            String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
            if (cMPFlavor == null) {
                return cmpFlavor;
            }
            return CMPFlavor.valueOf(cMPFlavor);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void setVendorList(List<Integer> list) {
        if (!isInitialized()) {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        } else if (list == null) {
            try {
                DtbLog.error(LOGTAG, "Set vendor list failed due to invalid vendor list parameters with value null.");
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute setVendorList method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setVendorList method", e);
            }
        } else {
            String stringFromVendorList = getStringFromVendorList(list);
            if (currentVendorListString == null || !currentVendorListString.equals(stringFromVendorList)) {
                consentStringDirty = true;
                currentVendorListString = stringFromVendorList;
                DtbSharedPreferences.getInstance().saveVendorList(stringFromVendorList);
            }
        }
    }

    public static void setConsentStatus(ConsentStatus consentStatus) {
        if (isInitialized()) {
            try {
                if (consentStatus == ConsentStatus.CONSENT_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set consent status failed due to invalid consent status parameters. Not allowed to set consent not defined.");
                } else if (currentConsentStatus == null || currentConsentStatus != consentStatus) {
                    consentStringDirty = true;
                    currentConsentStatus = consentStatus;
                    DtbSharedPreferences.getInstance().saveConsentStatus(consentStatus.name());
                }
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute setConsentStatus method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setConsentStatus method", e);
            }
        } else {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
    }

    public static void setCMPFlavor(CMPFlavor cMPFlavor) {
        if (isInitialized()) {
            try {
                if (cMPFlavor == CMPFlavor.CMP_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set cmp type failed due to invalid cmp type parameters. Not allowed to set cmp type to not defined.");
                } else if (cmpFlavor == null || cmpFlavor != cMPFlavor) {
                    consentStringDirty = true;
                    cmpFlavor = cMPFlavor;
                    DtbSharedPreferences.getInstance().saveCMPFlavor(cMPFlavor.name());
                }
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute setCMPFlavor method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute setCMPFlavor method", e);
            }
        } else {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
    }

    static String getEncodedNonIABString() {
        String str;
        if (!consentStringDirty) {
            return lastSeenNonIABEncodedConsentString;
        }
        String vendorList = DtbSharedPreferences.getInstance().getVendorList();
        String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
        String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
        if (vendorList == null && consentStatus == null && cMPFlavor == null) {
            str = "";
        } else {
            str = DTBGDPREncoder.getEncodedNonIABConsentString(getVendorListFromString(vendorList));
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                DtbSharedPreferences.getInstance().saveNonIABCustomConsent(str);
            }
        }
        consentStringDirty = false;
        lastSeenNonIABEncodedConsentString = str;
        return str;
    }

    public static void resetNonIAB() {
        try {
            DtbSharedPreferences.getInstance().removeCMPFlavor();
            DtbSharedPreferences.getInstance().removeConsentStatus();
            DtbSharedPreferences.getInstance().removeVendorList();
            DtbSharedPreferences.getInstance().removeNonIABCustomConsent();
            currentVendorListString = null;
            currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
            cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = null;
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to execute resetNonIAB method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute resetNonIAB method", e);
        }
    }

    private static String getStringFromVendorList(List<Integer> list) {
        return list.toString();
    }

    private static List<Integer> getVendorListFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 2) {
            for (String trim : str.substring(1, str.length() - 1).split(",")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(trim.trim())));
            }
        }
        return arrayList;
    }

    public static void setAdNetworkInfo(DTBAdNetworkInfo dTBAdNetworkInfo) {
        try {
            addCustomAttribute("mediationName", dTBAdNetworkInfo.getAdNetworkName());
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Fail to add mediation name to the custom attribute");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addCustomAttribute method", e);
        }
    }

    public static void addCustomAttribute(String str, String str2) {
        if (isInitialized()) {
            try {
                if (customDictionary == null) {
                    customDictionary = new HashMap();
                }
                customDictionary.put(str, str2);
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute addCustomAttribute method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addCustomAttribute method", e);
            }
        } else {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
    }

    public static void removeCustomAttribute(String str) {
        if (isInitialized()) {
            try {
                if (!DtbCommonUtils.isNullOrEmpty((Map) customDictionary)) {
                    customDictionary.remove(str);
                }
            } catch (RuntimeException e) {
                DtbLog.error(LOGTAG, "Fail to execute removeCustomAttribute method");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute removeCustomAttribute method", e);
            }
        } else {
            throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
        }
    }

    static Map<String, String> getCustomDictionary() {
        return customDictionary;
    }

    public static Map<String, DTBCacheData> getAdMobCacheData() {
        return adMobRequestIdMap;
    }

    public static DTBCacheData getAdMobCache(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str) || adMobRequestIdMap == null) {
            return null;
        }
        removeExpiredAdMobCache();
        return adMobRequestIdMap.get(str);
    }

    public static void addAdMobCache(String str, DTBCacheData dTBCacheData) {
        if (adMobRequestIdMap == null) {
            adMobRequestIdMap = new HashMap();
        }
        removeExpiredAdMobCache();
        synchronized (adMobRequestIdMap) {
            adMobRequestIdMap.put(str, dTBCacheData);
        }
    }

    public static void removeAdMobCache(String str) {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                adMobRequestIdMap.remove(str);
            }
        }
    }

    static void removeExpiredAdMobCache() {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                long time = new Date().getTime();
                Iterator<Map.Entry<String, DTBCacheData>> it = adMobRequestIdMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (time - ((DTBCacheData) it.next().getValue()).getResponseTimeStamp() > 300000) {
                        it.remove();
                    }
                }
            }
        }
    }
}
