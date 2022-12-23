package com.amazon.device.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazon.aps.shared.APSAnalytics;
import com.inmobi.sdk.InMobiSdk;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

class DtbDeviceRegistration {
    private static final String LOG_TAG = DtbDeviceRegistration.class.getName();
    private static String amznAdId;
    private static String appId;
    private static DtbDeviceRegistration dtbDeviceRegistrationInstance = null;
    private final DtbMetrics metrics = new DtbMetrics();

    public static void verifyRegistration() {
        if (dtbDeviceRegistrationInstance == null) {
            dtbDeviceRegistrationInstance = new DtbDeviceRegistration();
        }
        DtbThreadService.getInstance().execute($$Lambda$DtbDeviceRegistration$EkGC29OSMK3P7G5K9dq1OtmHY.INSTANCE);
    }

    private DtbDeviceRegistration() {
        DtbLog.debug("Running the initialization in background thread.");
        initializeAds();
    }

    /* access modifiers changed from: private */
    public synchronized void initializeAds() {
        DtbMetric dtbMetric;
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = DtbSharedPreferences.getInstance().getSisLastCheckIn().longValue();
        if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
            long j = currentTimeMillis - longValue;
            if (j <= 86400000) {
                DtbLog.debug("SIS call not required, last registration duration:" + j + ", expiration:" + 86400000);
                return;
            }
        }
        if (!DtbCommonUtils.isNetworkConnected()) {
            DtbLog.debug("Network is not available");
            return;
        }
        appId = AdRegistration.getAppKey();
        if (DtbCommonUtils.isOnMainThread()) {
            DtbLog.error(LOG_TAG, "Unable to fetch advertising identifier information on main thread.");
            return;
        }
        new DtbAdvertisingInfo();
        DtbDebugProperties.getInstance();
        registerConfig(appId);
        String sisEndpoint = DtbSharedPreferences.getInstance().getSisEndpoint();
        if (sisEndpoint.startsWith("null")) {
            DtbLog.debug("SIS is not ready");
            return;
        }
        StringBuilder sb = new StringBuilder(DtbDebugProperties.getSISUrl(sisEndpoint));
        boolean z = false;
        if (longValue == 0) {
            DtbLog.info(LOG_TAG, "Trying to register ad id..");
            sb.append("/generate_did");
        } else {
            DtbLog.info(LOG_TAG, "Trying to update ad id..");
            sb.append("/update_dev_info");
            z = true;
        }
        HashMap<String, Object> buildSISParams = buildSISParams(appId);
        DtbMetric dtbMetric2 = null;
        try {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(sb.toString());
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.setParams(buildSISParams);
            dtbHttpClient.enableQueryParams();
            if (z) {
                dtbMetric = DtbMetric.SIS_LATENCY_UPDATE_DEVICE_INFO;
            } else {
                dtbMetric = DtbMetric.SIS_LATENCY_REGISTER_EVENT;
            }
            dtbMetric2 = dtbMetric;
            this.metrics.startTimer(dtbMetric2);
            dtbHttpClient.executePOST(60000);
            this.metrics.stopTimer(dtbMetric2);
            if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                JSONObject jSONObject = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
                DtbSharedPreferences.getInstance().setIsSisRegisterationSuccessful(isRegistrationRequestSuccessful(jSONObject));
                if (DtbSharedPreferences.getInstance().getIsSisRegisterationSuccessful()) {
                    if (dtbMetric2 != null) {
                        this.metrics.resetMetric(dtbMetric2);
                    }
                    pingSis(sisEndpoint, appId);
                    return;
                }
                DtbLog.info(LOG_TAG, "ad id failed registration: " + jSONObject.toString());
                throw new Exception("ad id failed registration: ");
            }
            DtbLog.debug("No response from sis call.");
            throw new Exception("SIS Response is null");
        } catch (JSONException e) {
            DtbLog.error("JSON error parsing return from SIS: " + e.getMessage());
            if (dtbMetric2 != null) {
                this.metrics.resetMetric(dtbMetric2);
            }
        } catch (Exception e2) {
            try {
                DtbLog.error("Error registering device for ads:" + e2.toString());
            } finally {
                if (dtbMetric2 != null) {
                    this.metrics.resetMetric(dtbMetric2);
                }
            }
        }
    }

    private void pingSis(String str, String str2) {
        if (System.currentTimeMillis() - DtbSharedPreferences.getInstance().getSisLastPing() >= 2592000000L) {
            String adId = DtbSharedPreferences.getInstance().getAdId();
            if (adId == null || adId.isEmpty()) {
                DtbLog.info("error retrieving ad id, cancelling sis ping");
                return;
            }
            try {
                if (!DtbCommonUtils.isNetworkConnected()) {
                    DtbLog.debug("Network is not available");
                    return;
                }
                DtbHttpClient dtbHttpClient = new DtbHttpClient(str + "/ping");
                dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                HashMap hashMap = new HashMap();
                hashMap.put("appId", str2);
                hashMap.put(Creative.AD_ID, adId);
                Context context = AdRegistration.getContext();
                if (context != null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Object obj = defaultSharedPreferences.contains(CmpApiConstants.IABTCF_GDPR_APPLIES) ? defaultSharedPreferences.getAll().get(CmpApiConstants.IABTCF_GDPR_APPLIES) : null;
                    String string = defaultSharedPreferences.getString(CmpApiConstants.IABTCF_TC_STRING, (String) null);
                    if (obj != null) {
                        try {
                            if (obj instanceof Integer) {
                                if (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0) {
                                    hashMap.put("gdpr", obj);
                                }
                            }
                            if ((!(obj instanceof String) || !((String) obj).equals("1")) && !((String) obj).equals("0")) {
                                DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                            } else {
                                hashMap.put("gdpr", obj);
                            }
                        } catch (ClassCastException unused) {
                            DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                        }
                    }
                    if (string != null) {
                        hashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                    }
                }
                String encodedNonIABString = AdRegistration.getEncodedNonIABString();
                if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
                    hashMap.put("gdpr_custom", encodedNonIABString);
                }
                dtbHttpClient.setParams(hashMap);
                dtbHttpClient.executeGET(60000);
                if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                    JSONObject jSONObject = (JSONObject) new JSONTokener(dtbHttpClient.getResponse()).nextValue();
                    if (!isPingRequestSuccessful(jSONObject)) {
                        String str3 = LOG_TAG;
                        DtbLog.info(str3, "sis ping failed failed registration: " + jSONObject.toString());
                        throw new Exception("sis ping failed registration: ");
                    }
                    return;
                }
                DtbLog.debug("No response from sis ping.");
                throw new Exception("Ping SIS Response is null");
            } catch (Exception e) {
                DtbLog.error("Error pinging sis: " + e.toString());
            }
        }
    }

    private boolean registerConfig(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = currentTimeMillis - DtbSharedPreferences.getInstance().getConfigLastCheckIn().longValue();
        long configTtl = DtbSharedPreferences.getInstance().getConfigTtl();
        DtbLog.debug("Config last checkin duration: " + longValue + ", Expiration: " + configTtl);
        boolean z = false;
        if (longValue <= 172800000) {
            DtbLog.debug("No config refresh required");
            return false;
        } else if (!DtbCommonUtils.isNetworkConnected()) {
            DtbLog.debug("Network is not available");
            return false;
        } else {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(DtbDebugProperties.getConfigHostName("mads.amazon-adsystem.com") + "/msdk/getConfig");
            dtbHttpClient.addHeader("Accept", "application/json");
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.setParams(buildConfigInfoParams(str));
            try {
                this.metrics.startTimer(DtbMetric.CONFIG_DOWNLOAD_LATENCY);
                dtbHttpClient.executeGET(60000);
                this.metrics.stopTimer(DtbMetric.CONFIG_DOWNLOAD_LATENCY);
                if (!DtbCommonUtils.isNullOrEmpty(dtbHttpClient.getResponse())) {
                    z = parseRegisterConfigResponse(dtbHttpClient.getResponse(), currentTimeMillis, false);
                    try {
                        DTBMetricsConfiguration.getInstance().loadMobileClientConfig();
                        double intValue = (double) (((float) DTBMetricsConfiguration.getClientConfigVal("sampling_rate", DTBMetricsConfiguration.ANALYTIC_PIXEL_DEFAULT_VALUE.intValue(), "analytics").intValue()) / 100.0f);
                        String clientConfigVal = DTBMetricsConfiguration.getClientConfigVal("url", "", "analytics");
                        String clientConfigVal2 = DTBMetricsConfiguration.getClientConfigVal(TapjoyConstants.TJC_API_KEY, "", "analytics");
                        if (!APSAnalytics.isInitialized()) {
                            APSAnalytics.init(AdRegistration.getContext());
                        }
                        APSAnalytics.setSamplingRate((int) intValue);
                        APSAnalytics.setHttpUrl(clientConfigVal);
                        APSAnalytics.setApiKey(clientConfigVal2);
                    } catch (RuntimeException e) {
                        DtbLog.warn("Error when reading client config file for APSAndroidShared library" + e.toString());
                    }
                    return z;
                }
                throw new Exception("Config Response is null");
            } catch (Exception e2) {
                DtbLog.error("Error fetching DTB config: " + e2.toString());
            }
        }
    }

    private boolean parseRegisterConfigResponse(String str, long j, boolean z) throws Exception {
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (jSONObject.has("pj")) {
            DtbSharedPreferences.getInstance().savePJTemplate(jSONObject.getJSONObject("pj"));
        } else {
            DtbSharedPreferences.getInstance().removePJTemplate();
        }
        if (jSONObject.has(DtbDebugProperties.AAX_HOSTNAME) || jSONObject.has("sisURL")) {
            if (jSONObject.has(DtbDebugProperties.AAX_HOSTNAME)) {
                DtbSharedPreferences.getInstance().saveAaxHostname(jSONObject.getString(DtbDebugProperties.AAX_HOSTNAME));
            }
            if (jSONObject.has("sisURL")) {
                z = DtbSharedPreferences.getInstance().saveSisEndpoint(jSONObject.getString("sisURL"));
            }
            if (jSONObject.has("ttl")) {
                DtbSharedPreferences.getInstance().saveConfigTtl(DtbCommonUtils.getMilliSeconds(jSONObject.getString("ttl")));
            }
            if (jSONObject.has("bidTimeout")) {
                DtbSharedPreferences.getInstance().saveBidTimeout(Integer.valueOf(jSONObject.getInt("bidTimeout")));
            } else {
                DtbSharedPreferences.getInstance().removeBidTimeout();
            }
            DtbSharedPreferences.getInstance().saveConfigLastCheckIn(j);
            DtbLog.info(LOG_TAG, "ad configuration loaded successfully.");
            return z;
        }
        String str2 = LOG_TAG;
        DtbLog.info(str2, "ad configuration failed load: " + jSONObject.toString());
        throw new Exception("ad configuration failed load");
    }

    private static String convertBooleanToFlag(Boolean bool) {
        return (bool != null && bool.booleanValue()) ? "1" : "0";
    }

    private HashMap<String, Object> buildSISParams(String str) {
        HashMap<String, Object> hashMap = new HashMap<>(DtbDeviceData.getDeviceDataInstance().getDeviceParams());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            hashMap.put(Creative.AD_ID, adId);
        }
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            hashMap.put("idfa", idfa);
        }
        hashMap.put("oo", convertBooleanToFlag(optOut));
        if (str != null) {
            hashMap.put("appId", str);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            hashMap.put("pkg", paramsJson);
        }
        Context context = AdRegistration.getContext();
        if (context != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Object obj = defaultSharedPreferences.contains(CmpApiConstants.IABTCF_GDPR_APPLIES) ? defaultSharedPreferences.getAll().get(CmpApiConstants.IABTCF_GDPR_APPLIES) : null;
            String string = defaultSharedPreferences.getString(CmpApiConstants.IABTCF_TC_STRING, (String) null);
            if (obj != null) {
                try {
                    if (obj instanceof Integer) {
                        if (((Integer) obj).intValue() == 1 || ((Integer) obj).intValue() == 0) {
                            hashMap.put("gdpr", obj);
                        }
                    }
                    if ((!(obj instanceof String) || !((String) obj).equals("1")) && !((String) obj).equals("0")) {
                        DtbLog.info("IABTCF_gdprApplies should be a 1 or 0 as per IAB guideline");
                    } else {
                        hashMap.put("gdpr", obj);
                    }
                } catch (ClassCastException unused) {
                    DtbLog.info("IABTCF_gdprApplies should be a number as per IAB guideline");
                }
            }
            if (string != null) {
                hashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
            }
        }
        String encodedNonIABString = AdRegistration.getEncodedNonIABString();
        if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABString)) {
            hashMap.put("gdpr_custom", encodedNonIABString);
        }
        return hashMap;
    }

    private HashMap<String, Object> buildConfigInfoParams(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("appId", str);
        hashMap.put("sdkVer", DtbCommonUtils.getSDKVersion());
        hashMap.put("fp", "false");
        hashMap.put("testMode", Boolean.toString(AdRegistration.isTestMode()));
        JSONObject paramsJsonGetSafe = DtbDeviceData.getDeviceDataInstance().getParamsJsonGetSafe();
        if (paramsJsonGetSafe != null) {
            hashMap.put("dinfo", paramsJsonGetSafe);
        }
        JSONObject paramsJson = DtbPackageNativeData.getPackageNativeDataInstance(AdRegistration.getContext()).getParamsJson();
        if (paramsJson != null) {
            hashMap.put("pkg", paramsJson);
        }
        if (AdRegistration.getCustomDictionary() != null && AdRegistration.getCustomDictionary().containsKey("mediationName")) {
            String str2 = AdRegistration.getCustomDictionary().get("mediationName");
            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                hashMap.put("mediationName", str2);
            }
        }
        if (Math.random() <= ((double) (((float) DTBMetricsConfiguration.getClientConfigVal("distribution_pixel", DTBMetricsConfiguration.DISTRIBUTION_PIXEL_DEFAULT_VALUE.intValue(), "sample_rates").intValue()) / 100.0f))) {
            String sDKDistributionPlace = AdRegistration.getSDKDistributionPlace();
            if (!DtbCommonUtils.isNullOrEmpty(sDKDistributionPlace)) {
                hashMap.put("distribution", sDKDistributionPlace);
            }
        }
        return hashMap;
    }

    private boolean isRegistrationRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rcode")) {
            return false;
        }
        DtbSharedPreferences.getInstance().saveSisLastCheckIn(System.currentTimeMillis());
        if (jSONObject.getInt("rcode") != 1 || !jSONObject.has(Creative.AD_ID)) {
            if (jSONObject.getInt("rcode") != 103) {
                if (jSONObject.getInt("rcode") != 101 || !jSONObject.has("msg")) {
                    return false;
                }
                if (jSONObject.optInt("msg") != 103 && !"need at least one native id in parameter".equals(jSONObject.get("msg"))) {
                    return false;
                }
            }
            DtbSharedPreferences.getInstance().removeAdid();
            DtbLog.debug("No ad-id returned");
            return true;
        }
        String string = jSONObject.getString(Creative.AD_ID);
        if (jSONObject.has("idChanged") && jSONObject.getBoolean("idChanged")) {
            DtbLog.info(LOG_TAG, "ad id has changed, updating..");
            this.metrics.incrementMetric(DtbMetric.SIS_COUNTER_IDENTIFIED_DEVICE_CHANGED);
        }
        DtbSharedPreferences.getInstance().saveAdId(string);
        DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
        return true;
    }

    private boolean isPingRequestSuccessful(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rcode")) {
            return false;
        }
        if (jSONObject.getInt("rcode") == 1) {
            DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
            DtbLog.info(LOG_TAG, "ad id is registered or updated successfully.");
            return true;
        } else if (jSONObject.getInt("rcode") != 103 && (jSONObject.getInt("rcode") != 101 || !jSONObject.has("msg") || jSONObject.getInt("msg") != 103)) {
            return false;
        } else {
            DtbSharedPreferences.getInstance().saveSisLastPing(System.currentTimeMillis());
            DtbLog.info("gdpr consent not granted");
            return true;
        }
    }
}
