package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DTBMetricsConfiguration {
    static final String ANALYTICS_KEY_NAME = "analytics";
    static final Integer ANALYTIC_PIXEL_DEFAULT_VALUE = 1;
    static final String API_KEY_ANALYTICS_KEY_NAME = "api_key";
    static final String CONFIG_DIR = "config";
    static final String CONFIG_WITH_JSON = "aps_mobile_client_config.json";
    static final String CREATIVE_TEMPLATES_KEY_NAME = "creative";
    static final Integer DISTRIBUTION_PIXEL_DEFAULT_VALUE = 1;
    static final String DISTRIBUTION_PIXEL_SAMPLE_RATE_KEY_NAME = "distribution_pixel";
    private static final String LOG_TAG = DTBMetricsConfiguration.class.getSimpleName();
    static final String OM_SDK_CONFIGURABLE_PARTNER_KEY_NAME = "partner_name";
    static final String OM_SDK_DENIED_VERSION_KEY_NAME = "denied_version_list";
    static final String OM_SDK_FEATURE_ENABLE_KEY_NAME = "feature_enabled";
    static final String OM_SDK_FEATURE_KEY_NAME = "om_sdk_feature";
    static final String SAMPLE_RATES_KEY_NAME = "sample_rates";
    static final String SAMPLING_RATE_ANALYTICS_KEY_NAME = "sampling_rate";
    static final String SPP_FLAG_DEFAULT_VALUE = "leq";
    static final String SPP_FLAG_KEY_NAME = "spp_flag";
    static final String TEMPLATES_KEY_NAME = "templates";
    static final String URL_ANALYTICS_KEY_NAME = "url";
    static final Integer WRAPPING_PIXEL_DEFAULT_VALUE = 5;
    static final String WRAPPING_PIXEL_SAMPLE_RATE_KEY_NAME = "wrapping_pixel";
    private static DTBMetricsConfiguration theInstance;
    private JSONObject configuration;

    public static synchronized DTBMetricsConfiguration getInstance() {
        DTBMetricsConfiguration dTBMetricsConfiguration;
        synchronized (DTBMetricsConfiguration.class) {
            if (theInstance == null) {
                theInstance = new DTBMetricsConfiguration();
            }
            dTBMetricsConfiguration = theInstance;
        }
        return dTBMetricsConfiguration;
    }

    private DTBMetricsConfiguration() {
        loadMobileClientConfig();
    }

    /* access modifiers changed from: protected */
    public void loadMobileClientConfig() {
        DTBAdUtil.createDirIfDoesNotExist(CONFIG_DIR);
        loadConfiguration();
        DtbThreadService.getInstance().execute(new Runnable() {
            public final void run() {
                DTBMetricsConfiguration.this.lambda$loadMobileClientConfig$0$DTBMetricsConfiguration();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public synchronized void loadConfiguration() {
        try {
            String workingDirContent = getWorkingDirContent();
            if (workingDirContent == null) {
                workingDirContent = DTBAdUtil.loadFromAssets(CONFIG_WITH_JSON);
            }
            this.configuration = new JSONObject(workingDirContent);
        } catch (IOException unused) {
        } catch (JSONException unused2) {
            DtbLog.error("Invalid configuration");
        }
        return;
    }

    /* access modifiers changed from: private */
    /* renamed from: loadConfigurationFromWeb */
    public void lambda$loadMobileClientConfig$0$DTBMetricsConfiguration() {
        try {
            DtbHttpClient dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost(CONFIG_WITH_JSON) + CONFIG_WITH_JSON);
            dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
            dtbHttpClient.executeGET(60000);
            if (dtbHttpClient.getResponseCode() == 200) {
                String response = dtbHttpClient.getResponse();
                File filesDir = AdRegistration.getContext().getFilesDir();
                File createTempFile = File.createTempFile("temp", "json", filesDir);
                FileWriter fileWriter = new FileWriter(createTempFile);
                fileWriter.write(response);
                fileWriter.close();
                File file = new File(filesDir.getAbsolutePath() + "/" + CONFIG_DIR + "/" + CONFIG_WITH_JSON);
                if (file.exists()) {
                    file.delete();
                }
                if (!createTempFile.renameTo(file)) {
                    DtbLog.error("Rename failed");
                }
                loadConfiguration();
                return;
            }
            throw new RuntimeException("resource aps_mobile_client_config.json not available");
        } catch (Exception e) {
            DtbLog.error("Error loading configuration:" + e.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean isTypeEnabled(String str) {
        if (this.configuration != null) {
            try {
                JSONObject jSONObject = this.configuration.getJSONObject("metrics");
                if (jSONObject.has(str)) {
                    return jSONObject.getBoolean(str);
                }
            } catch (JSONException unused) {
                DtbLog.error("Unable to get metrics from configuration");
            }
        }
        return false;
    }

    private JSONObject getConfigParams(String str) {
        if (!this.configuration.has(str)) {
            return null;
        }
        try {
            return this.configuration.getJSONObject(str);
        } catch (JSONException unused) {
            DtbLog.error("Unable to get" + str + "from configuration");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String getConfigVal(String str) {
        if (!this.configuration.has(str)) {
            return null;
        }
        try {
            return this.configuration.getString(str);
        } catch (JSONException unused) {
            DtbLog.error("Unable to get" + str + "from configuration");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.amazon.device.ads.DtbLog.warn("Unable to get" + r4 + "for " + r2 + " from configuration. Using default value");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer getClientConfigVal(java.lang.String r2, int r3, java.lang.String r4) {
        /*
            com.amazon.device.ads.DTBMetricsConfiguration r0 = getInstance()     // Catch:{ RuntimeException -> 0x003b }
            org.json.JSONObject r0 = r0.getConfigParams(r4)     // Catch:{ RuntimeException -> 0x003b }
            if (r0 == 0) goto L_0x004a
            boolean r1 = r0.has(r2)     // Catch:{ Exception -> 0x0019 }
            if (r1 == 0) goto L_0x004a
            int r0 = r0.getInt(r2)     // Catch:{ Exception -> 0x0019 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0019 }
            return r2
        L_0x0019:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x003b }
            r0.<init>()     // Catch:{ RuntimeException -> 0x003b }
            java.lang.String r1 = "Unable to get"
            r0.append(r1)     // Catch:{ RuntimeException -> 0x003b }
            r0.append(r4)     // Catch:{ RuntimeException -> 0x003b }
            java.lang.String r4 = "for "
            r0.append(r4)     // Catch:{ RuntimeException -> 0x003b }
            r0.append(r2)     // Catch:{ RuntimeException -> 0x003b }
            java.lang.String r2 = " from configuration. Using default value"
            r0.append(r2)     // Catch:{ RuntimeException -> 0x003b }
            java.lang.String r2 = r0.toString()     // Catch:{ RuntimeException -> 0x003b }
            com.amazon.device.ads.DtbLog.warn(r2)     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x004a
        L_0x003b:
            r2 = move-exception
            java.lang.String r4 = LOG_TAG
            java.lang.String r0 = "Fail to execute getClientConfigVal method"
            com.amazon.device.ads.DtbLog.error(r4, r0)
            com.amazon.aps.shared.analytics.APSEventSeverity r4 = com.amazon.aps.shared.analytics.APSEventSeverity.ERROR
            com.amazon.aps.shared.analytics.APSEventType r1 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            com.amazon.aps.shared.APSAnalytics.logEvent(r4, r1, r0, r2)
        L_0x004a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricsConfiguration.getClientConfigVal(java.lang.String, int, java.lang.String):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.amazon.device.ads.DtbLog.warn("Unable to get" + r4 + "for " + r2 + " from configuration. Using default value");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getClientConfigVal(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            com.amazon.device.ads.DTBMetricsConfiguration r0 = getInstance()     // Catch:{ RuntimeException -> 0x0037 }
            org.json.JSONObject r0 = r0.getConfigParams(r4)     // Catch:{ RuntimeException -> 0x0037 }
            if (r0 == 0) goto L_0x0046
            boolean r1 = r0.has(r2)     // Catch:{ Exception -> 0x0015 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0015 }
            return r2
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0037 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r1 = "Unable to get"
            r0.append(r1)     // Catch:{ RuntimeException -> 0x0037 }
            r0.append(r4)     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r4 = "for "
            r0.append(r4)     // Catch:{ RuntimeException -> 0x0037 }
            r0.append(r2)     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r2 = " from configuration. Using default value"
            r0.append(r2)     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r2 = r0.toString()     // Catch:{ RuntimeException -> 0x0037 }
            com.amazon.device.ads.DtbLog.warn(r2)     // Catch:{ RuntimeException -> 0x0037 }
            goto L_0x0046
        L_0x0037:
            r2 = move-exception
            java.lang.String r4 = LOG_TAG
            java.lang.String r0 = "Fail to execute getClientConfigVal method"
            com.amazon.device.ads.DtbLog.error(r4, r0)
            com.amazon.aps.shared.analytics.APSEventSeverity r4 = com.amazon.aps.shared.analytics.APSEventSeverity.ERROR
            com.amazon.aps.shared.analytics.APSEventType r1 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            com.amazon.aps.shared.APSAnalytics.logEvent(r4, r1, r0, r2)
        L_0x0046:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricsConfiguration.getClientConfigVal(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String getClientConfigVal(String str, String str2) {
        try {
            String configVal = getInstance().getConfigVal(str2);
            if (!DtbCommonUtils.isNullOrEmpty(configVal)) {
                return configVal;
            }
            return str;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute getClientConfigVal method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getClientConfigVal method", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.amazon.device.ads.DtbLog.warn("Unable to get sample rates for " + r3 + " from configuration. Using default value");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer getAnalyticsParams(java.lang.String r3, int r4) {
        /*
            com.amazon.device.ads.DTBMetricsConfiguration r0 = getInstance()     // Catch:{ RuntimeException -> 0x0035 }
            java.lang.String r1 = "analytics"
            org.json.JSONObject r0 = r0.getConfigParams(r1)     // Catch:{ RuntimeException -> 0x0035 }
            if (r0 == 0) goto L_0x0044
            boolean r1 = r0.has(r3)     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0044
            int r0 = r0.getInt(r3)     // Catch:{ Exception -> 0x001b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x001b }
            return r3
        L_0x001b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0035 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0035 }
            java.lang.String r1 = "Unable to get sample rates for "
            r0.append(r1)     // Catch:{ RuntimeException -> 0x0035 }
            r0.append(r3)     // Catch:{ RuntimeException -> 0x0035 }
            java.lang.String r3 = " from configuration. Using default value"
            r0.append(r3)     // Catch:{ RuntimeException -> 0x0035 }
            java.lang.String r3 = r0.toString()     // Catch:{ RuntimeException -> 0x0035 }
            com.amazon.device.ads.DtbLog.warn(r3)     // Catch:{ RuntimeException -> 0x0035 }
            goto L_0x0044
        L_0x0035:
            r3 = move-exception
            java.lang.String r0 = LOG_TAG
            java.lang.String r1 = "Fail to execute getSampleRateForPixel method"
            com.amazon.device.ads.DtbLog.error(r0, r1)
            com.amazon.aps.shared.analytics.APSEventSeverity r0 = com.amazon.aps.shared.analytics.APSEventSeverity.ERROR
            com.amazon.aps.shared.analytics.APSEventType r2 = com.amazon.aps.shared.analytics.APSEventType.EXCEPTION
            com.amazon.aps.shared.APSAnalytics.logEvent(r0, r2, r1, r3)
        L_0x0044:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricsConfiguration.getAnalyticsParams(java.lang.String, int):java.lang.Integer");
    }

    public static List<String> getDeniedOmSdkVersionList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject configParams = getInstance().getConfigParams(OM_SDK_FEATURE_KEY_NAME);
            if (configParams != null) {
                try {
                    if (configParams.has(str)) {
                        JSONArray jSONArray = configParams.getJSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            Object obj = jSONArray.get(i);
                            if (obj instanceof String) {
                                arrayList.add(obj.toString());
                            }
                        }
                    }
                } catch (JSONException e) {
                    DtbLog.warn("Unable to get denied om sdk Version list for " + str + " from configuration. Using default value as empty list");
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getOMSDKVersionList method", e);
                }
            }
        } catch (RuntimeException e2) {
            DtbLog.error(LOG_TAG, "Fail to execute getOMSDKVersionList method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getOMSDKVersionList method", e2);
        }
        return arrayList;
    }

    private String getWorkingDirContent() throws IOException {
        return DTBAdUtil.loadFile(CONFIG_WITH_JSON, CONFIG_DIR);
    }
}
