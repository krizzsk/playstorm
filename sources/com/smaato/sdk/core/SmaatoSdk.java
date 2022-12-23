package com.smaato.sdk.core;

import android.app.Application;
import android.location.LocationManager;
import android.util.Log;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.AppConfigChecker;
import com.smaato.sdk.core.framework.CoreModuleLoaderInterface;
import com.smaato.sdk.core.framework.SdkInitialisationObserver;
import com.smaato.sdk.core.framework.SimpleModuleInterface;
import com.smaato.sdk.core.init.BaseDiRegistryUtils;
import com.smaato.sdk.core.init.BaseModuleValidationUtils;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.p378ad.GeoInfo;
import com.smaato.sdk.core.p378ad.RequestInfoProvider;
import com.smaato.sdk.core.p378ad.UserInfo;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import org.json.JSONException;
import org.json.JSONObject;

public final class SmaatoSdk {
    public static final String KEY_AUDIT_FLAGS = "audit";
    public static final String KEY_DEEPLINK = "deeplinking";
    public static final String KEY_FCID = "fcid";
    public static final String KEY_GDPR_APPLICABLE = "gdpr";
    public static final String KEY_GDPR_CONSENT = "gdpr_cs";
    public static final String KEY_GEO_LOCATION = "geo";
    public static final String KEY_LGPD_APPLICABLE = "lgpd";
    public static final String KEY_LGPD_CONSENT = "lgpdConsentEnabled";
    public static final String KEY_SDK_VERSION = "sdkVersion";
    private static volatile SmaatoInstance instance;

    public static String getVersion() {
        return "21.8.3";
    }

    private SmaatoSdk() {
    }

    public static void init(Application application, String str) {
        init(application, Config.builder().build(), str);
    }

    public static void init(Application application, Config config, String str) {
        ClassLoader classLoader = application.getClassLoader();
        init(application, ServiceLoader.load(SimpleModuleInterface.class, classLoader), ServiceLoader.load(CoreModuleLoaderInterface.class, classLoader), ServiceLoader.load(SdkInitialisationObserver.class, classLoader), str, config, true);
    }

    static void init(Application application, Iterable<SimpleModuleInterface> iterable, Iterable<CoreModuleLoaderInterface> iterable2, Iterable<SdkInitialisationObserver> iterable3, String str, Config config, boolean z) {
        Objects.requireNonNull(application, "Parameter application cannot be null for SmaatoSdk::init");
        Objects.requireNonNull(str, "Parameter publisherId cannot be null for SmaatoSdk::init");
        if (!str.isEmpty()) {
            if (instance == null) {
                synchronized (SmaatoSdk.class) {
                    if (instance == null) {
                        if (config == null) {
                            config = Config.builder().build();
                            Log.w(LogDomain.CORE.name(), String.format("null config parameter is ignored, a default config is used instead (logLevel: %s, httpsOnly: %b)", new Object[]{config.getConsoleLogLevel(), Boolean.valueOf(config.isHttpsOnly())}));
                        }
                        Config config2 = config;
                        List<SimpleModuleInterface> validModuleInterfaces = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), iterable);
                        List<CoreModuleLoaderInterface> validModuleInterfaces2 = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), iterable2);
                        ArrayList arrayList = new ArrayList();
                        for (CoreModuleLoaderInterface next : validModuleInterfaces2) {
                            next.setApplication(application);
                            arrayList.add(next.getExpectedManifestEntries());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(BaseDiRegistryUtils.getDiOfModules(validModuleInterfaces));
                        arrayList2.addAll(BaseDiRegistryUtils.getDiOfModules(validModuleInterfaces2));
                        SmaatoInstance smaatoInstance = new SmaatoInstance(application, config2, arrayList2, arrayList, str);
                        if (!z || isAppConfiguredProperly(smaatoInstance)) {
                            try {
                                smaatoInstance.getDiConstructor().get(AppBackgroundDetector.class);
                                smaatoInstance.getDiConstructor().get(ConnectionStatusWatcher.class);
                            } catch (Exception e) {
                                Log.e("SmaatoSd", "Error when instantiating AppBackgroundDetector and ConnectionStatusWatcher", e);
                            }
                            instance = smaatoInstance;
                        } else {
                            return;
                        }
                    }
                }
            }
            for (SdkInitialisationObserver onInitialised : iterable3) {
                onInitialised.onInitialised();
            }
            return;
        }
        throw new IllegalArgumentException("Parameter publisherId cannot be empty for SmaatoSdk::init");
    }

    static void init(SmaatoInstance smaatoInstance) {
        instance = smaatoInstance;
    }

    private static boolean isAppConfiguredProperly(SmaatoInstance smaatoInstance) {
        DiConstructor diConstructor = smaatoInstance.getDiConstructor();
        boolean isAppConfiguredProperly = ((AppConfigChecker) diConstructor.get(AppConfigChecker.class)).check().isAppConfiguredProperly();
        if (!isAppConfiguredProperly) {
            ((Logger) diConstructor.get(Logger.class)).error(LogDomain.CORE, "Cannot initialize SmaatoSdk. Check specific reason(s) in the error/warning message(s) above.", new Object[0]);
        }
        return isAppConfiguredProperly;
    }

    public static String getKeywords() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getKeywords();
    }

    public static void setKeywords(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setKeywords(str);
        }
    }

    public static String getSearchQuery() {
        return (String) Objects.transformOrNull(getInitializedSmaatoInstance(), $$Lambda$riTQVy3CKV6gs8rNZyikdi3CTnI.INSTANCE);
    }

    public static void setSearchQuery(String str) {
        Objects.onNotNull(getInitializedSmaatoInstance(), new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((SmaatoInstance) obj).setSearchQuery(this.f$0);
            }
        });
    }

    public static Gender getGender() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getGender();
    }

    public static void setGender(Gender gender) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setGender(gender);
        }
    }

    public static Integer getAge() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getAge();
    }

    public static void setAge(Integer num) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setAge(num);
        }
    }

    public static LatLng getLatLng() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getLatLng();
    }

    public static void setLatLng(LatLng latLng) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            if (latLng == null || latLng.isValid()) {
                initializedSmaatoInstance.setLatLng(latLng);
                return;
            }
            String name = LogDomain.CORE.name();
            Log.e(name, "Provided location is invalid and will be discarded: " + latLng);
            initializedSmaatoInstance.setLatLng((LatLng) null);
        }
    }

    public static boolean isGPSEnabled() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isGPSEnabled();
    }

    public static void setGPSEnabled(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setGPSEnabled(z);
        }
    }

    public static Boolean isLGPDConsentEnabled() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            return initializedSmaatoInstance.isLgpdConsentEnabled();
        }
        return null;
    }

    public static void setLgpdConsentEnabled(Boolean bool) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setLgpdConsentEnabled(bool);
        }
    }

    public static String getPublisherId() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getPublisherId();
    }

    public static String getRegion() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getRegion();
    }

    public static void setRegion(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setRegion(str);
        }
    }

    public static String getZip() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getZip();
    }

    public static void setZip(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setZip(str);
        }
    }

    public static void setUnityVersion(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setUnityVersion(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ JSONException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String collectSignals(android.content.Context r8) {
        /*
            com.smaato.sdk.core.gdpr.IabCmpV2DataStorage r0 = new com.smaato.sdk.core.gdpr.IabCmpV2DataStorage
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r8)
            r0.<init>(r1)
            com.smaato.sdk.core.gdpr.SubjectToGdpr r1 = r0.getSubjectToGdpr()
            java.lang.String r0 = r0.getConsentString()
            com.smaato.sdk.core.SmaatoInstance r2 = getInitializedSmaatoInstance()
            r3 = 0
            if (r2 == 0) goto L_0x0025
            com.smaato.sdk.core.di.DiConstructor r4 = r2.getDiConstructor()
            java.lang.Class<com.smaato.sdk.core.lgpd.SomaLgpdDataSource> r5 = com.smaato.sdk.core.lgpd.SomaLgpdDataSource.class
            java.lang.Object r4 = r4.get(r5)
            com.smaato.sdk.core.lgpd.SomaLgpdDataSource r4 = (com.smaato.sdk.core.lgpd.SomaLgpdDataSource) r4
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            if (r4 == 0) goto L_0x002c
            com.smaato.sdk.core.lgpd.SomaLgpdData r3 = r4.getSomaLgpdData()
        L_0x002c:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "deeplinking"
            r6 = 1
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r5 = "sdkVersion"
            java.lang.String r7 = getVersion()     // Catch:{ JSONException -> 0x00a4 }
            r4.put(r5, r7)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r5 = "fcid"
            com.smaato.sdk.core.util.UUIDProvider r7 = new com.smaato.sdk.core.util.UUIDProvider     // Catch:{ JSONException -> 0x00a4 }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r8 = r7.getUuid()     // Catch:{ JSONException -> 0x00a4 }
            r4.put(r5, r8)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r8 = "gdpr"
            com.smaato.sdk.core.gdpr.SubjectToGdpr r5 = com.smaato.sdk.core.gdpr.SubjectToGdpr.CMP_GDPR_ENABLED     // Catch:{ JSONException -> 0x00a4 }
            r7 = 0
            if (r1 != r5) goto L_0x0057
            r1 = r6
            goto L_0x0058
        L_0x0057:
            r1 = r7
        L_0x0058:
            r4.put(r8, r1)     // Catch:{ JSONException -> 0x00a4 }
            boolean r8 = r0.isEmpty()     // Catch:{ JSONException -> 0x00a4 }
            if (r8 != 0) goto L_0x0066
            java.lang.String r8 = "gdpr_cs"
            r4.put(r8, r0)     // Catch:{ JSONException -> 0x00a4 }
        L_0x0066:
            java.lang.String r8 = "lgpd"
            if (r3 == 0) goto L_0x0071
            boolean r0 = r3.isLgpdEnabled()     // Catch:{ JSONException -> 0x00a4 }
            if (r0 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r6 = r7
        L_0x0072:
            r4.put(r8, r6)     // Catch:{ JSONException -> 0x00a4 }
            org.json.JSONObject r8 = getGeoLocationJson()     // Catch:{ JSONException -> 0x00a4 }
            org.json.JSONObject r0 = getAuditJsonObject()     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r1 = "lgpdConsentEnabled"
            if (r2 == 0) goto L_0x0094
            java.lang.Boolean r3 = r2.isLgpdConsentEnabled()     // Catch:{ JSONException -> 0x00a4 }
            if (r3 != 0) goto L_0x0088
            goto L_0x0094
        L_0x0088:
            java.lang.Boolean r2 = r2.isLgpdConsentEnabled()     // Catch:{ JSONException -> 0x00a4 }
            boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x00a4 }
            r4.put(r1, r2)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x0097
        L_0x0094:
            r4.put(r1, r7)     // Catch:{ JSONException -> 0x00a4 }
        L_0x0097:
            if (r8 == 0) goto L_0x009e
            java.lang.String r1 = "geo"
            r4.put(r1, r8)     // Catch:{ JSONException -> 0x00a4 }
        L_0x009e:
            java.lang.String r8 = "audit"
            r4.put(r8, r0)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00b3
        L_0x00a4:
            r8 = move-exception
            r8.printStackTrace()
            com.smaato.sdk.core.log.LogDomain r0 = com.smaato.sdk.core.log.LogDomain.CORE
            java.lang.String r0 = r0.name()
            java.lang.String r1 = "Collect signal Json Parsing exception"
            android.util.Log.e(r0, r1, r8)
        L_0x00b3:
            java.lang.String r8 = r4.toString()
            java.lang.String r0 = "\""
            java.lang.String r1 = "\\\""
            java.lang.String r8 = r8.replace(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.SmaatoSdk.collectSignals(android.content.Context):java.lang.String");
    }

    public static String getLanguage() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getLanguage();
    }

    public static void setLanguage(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setLanguage(str);
        }
    }

    public static boolean getCoppa() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.getCoppa();
    }

    public static void setCoppa(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setCoppa(z);
        }
    }

    public static boolean isWatermarkEnabled() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isWatermarkEnabled();
    }

    public static void setWatermarkEnabled(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setWatermarkEnabled(z);
        }
    }

    public static String getUsPrivacyString() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return "";
        }
        return initializedSmaatoInstance.getUsPrivacyString();
    }

    public static boolean isCompanionAdSkippable() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isCompanionAdSkippable();
    }

    public static void setIsCompanionAdSkippable(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.setIsCompanionAdSkippable(z);
        }
    }

    public static AdContentRating getAdContentRating() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.getAdContentRating();
    }

    public static String getUnityVersion() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return "";
        }
        return initializedSmaatoInstance.getUnityVersion();
    }

    public static ExtensionConfiguration getExtensionConfiguration(Class<? extends ExtensionConfiguration> cls) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        for (ExtensionConfiguration next : initializedSmaatoInstance.getExtensionConfigurations()) {
            if (cls.isInstance(next)) {
                return next;
            }
        }
        return null;
    }

    private static SmaatoInstance getInitializedSmaatoInstance() {
        SmaatoInstance smaatoInstance = instance;
        if (smaatoInstance != null) {
            return smaatoInstance;
        }
        Log.e(LogDomain.CORE.name(), "SmaatoSdk.init() should be called first.");
        return null;
    }

    private static JSONObject getGeoLocationJson() {
        GeoInfo geoInfo;
        try {
            SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
            if (initializedSmaatoInstance == null || (geoInfo = ((RequestInfoProvider) initializedSmaatoInstance.getDiConstructor().get(RequestInfoProvider.class)).getGeoInfo((UserInfo) null)) == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", Integer.parseInt(geoInfo.getGeoType().toString()));
            jSONObject.put("lat", geoInfo.getLatLng().getLatitude());
            jSONObject.put("lon", geoInfo.getLatLng().getLongitude());
            if (getRegion() != null && !getRegion().isEmpty()) {
                jSONObject.put("region", getRegion());
            }
            if (getZip() != null && !getZip().isEmpty()) {
                jSONObject.put("zip", getZip());
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject getAuditJsonObject() {
        AppMetaData appMetaData;
        JSONObject jSONObject = new JSONObject();
        try {
            SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
            LocationManager locationManager = null;
            if (initializedSmaatoInstance != null) {
                locationManager = (LocationManager) initializedSmaatoInstance.getDiConstructor().get(LocationManager.class);
                appMetaData = (AppMetaData) initializedSmaatoInstance.getDiConstructor().get(AppMetaData.class);
            } else {
                appMetaData = null;
            }
            Config build = Config.builder().build();
            jSONObject.put("gpsEnabled", isGPSEnabled() ? 1 : 0);
            jSONObject.put("requireCoppaCompliantAds", getCoppa() ? 1 : 0);
            int i = 0;
            jSONObject.put("locationServicesEnabled", (locationManager == null || !locationManager.isProviderEnabled("gps")) ? 0 : 1);
            if (appMetaData != null && (appMetaData.isPermissionGranted("android.permission.ACCESS_FINE_LOCATION") || appMetaData.isPermissionGranted("android.permission.ACCESS_COARSE_LOCATION"))) {
                i = 1;
            }
            jSONObject.put("userAuthorisedLocation", i);
            jSONObject.put("httpsOnly", build.isHttpsOnly() ? 1 : 0);
            jSONObject.put("sessionTrackingEnabled", build.sessionTrackingDisabled() ^ true ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    static void reset() {
        instance = null;
    }
}
