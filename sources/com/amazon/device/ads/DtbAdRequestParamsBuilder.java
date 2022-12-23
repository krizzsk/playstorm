package com.amazon.device.ads;

import android.content.Context;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class DtbAdRequestParamsBuilder {
    private final String LOG_TAG = DtbAdRequestParamsBuilder.class.getSimpleName();

    DtbAdRequestParamsBuilder() {
    }

    public HashMap<String, Object> getParams(Context context, List<DTBAdSize> list, Map<String, String> map, boolean z) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(getCommonParams(context));
        hashMap.putAll(getSlotParams(list));
        hashMap.putAll(getCustomParams(map));
        hashMap.putAll(getCustomAttributeParams(z));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, Object> getCommonParams(Context context) {
        String locationParam;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isDTBMobile", "true");
        hashMap.put("appId", AdRegistration.getAppKey());
        hashMap.put("adsdk", DtbCommonUtils.getSDKVersion());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            hashMap.put("idfa", idfa);
        }
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut != null) {
            hashMap.put("oo", Boolean.toString(optOut.booleanValue()));
        }
        JSONObject paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
        if (paramsJson != null) {
            hashMap.put("dinfo", paramsJson);
        }
        String userAgentString = DtbDeviceData.getDeviceDataInstance().getUserAgentString();
        if (userAgentString != null) {
            hashMap.put("ua", userAgentString);
        }
        hashMap.put("pkg", DtbPackageNativeData.getPackageNativeDataInstance(context).getParamsJson());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            hashMap.put("ad-id", adId);
        }
        if (AdRegistration.isTestMode()) {
            hashMap.put("isTest", "true");
        }
        if (AdRegistration.isLocationEnabled() && (locationParam = new DtbGeoLocation().getLocationParam()) != null && !locationParam.isEmpty()) {
            hashMap.put("geoloc", locationParam);
        }
        return hashMap;
    }

    private HashMap<String, Object> getSlotParams(List<DTBAdSize> list) {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 1;
            for (DTBAdSize next : list) {
                JSONObject jSONObject = new JSONObject();
                if (next.isInterstitialAd()) {
                    jSONObject.put("sz", "interstitial");
                } else {
                    jSONObject.put("sz", next.getWidth() + "x" + next.getHeight());
                }
                jSONObject.put("slot", next.getSlotUUID());
                int i2 = i + 1;
                jSONObject.put("slotId", i);
                JSONArray jSONArray2 = new JSONArray();
                if (C11591.$SwitchMap$com$amazon$device$ads$AdType[next.getDTBAdType().ordinal()] != 1) {
                    jSONArray2.put(AdType.DISPLAY.toString());
                } else {
                    jSONArray2.put(AdType.VIDEO.toString());
                }
                jSONObject.put("supportedMediaTypes", jSONArray2);
                if (next.getPubSettings() != null) {
                    jSONObject.put("ps", next.getPubSettings());
                }
                jSONArray.put(jSONObject);
                i = i2;
            }
            hashMap.put("slots", jSONArray);
        } catch (JSONException unused) {
            DtbLog.warn(this.LOG_TAG, "Error constructing slot parameters");
        }
        return hashMap;
    }

    /* renamed from: com.amazon.device.ads.DtbAdRequestParamsBuilder$1 */
    static /* synthetic */ class C11591 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private HashMap<String, Object> getCustomParams(Map<String, String> map) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (map != null) {
            for (String next : map.keySet()) {
                hashMap.put(next, map.get(next));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void addOmidPartnerNameAndPartnerVersionToBidRequest() {
        if (AdRegistration.getCustomDictionary() == null) {
            DtbLog.info(this.LOG_TAG, "Custom Dictionary Not found");
            return;
        }
        try {
            if (AdRegistration.getCustomDictionary().containsKey("mediationName") && DTBAdNetwork.valueOf(AdRegistration.getCustomDictionary().get("mediationName")).isMediation()) {
                AdRegistration.addCustomAttribute("omidPartnerName", DTBMetricsConfiguration.getClientConfigVal("partner_name", "Amazon1", "om_sdk_feature"));
                AdRegistration.addCustomAttribute("omidPartnerVersion", DtbCommonUtils.getSDKVersion());
            }
        } catch (RuntimeException e) {
            DtbLog.error(this.LOG_TAG, "Failed to set OM SDK Partner Name and Version in Bid Request");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to set OM SDK Partner Name and Version in Bid Request", e);
        }
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, Object> getCustomAttributeParams(boolean z) {
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject pJTemplate = DtbSharedPreferences.getInstance().getPJTemplate();
        JSONObject jSONObject = new JSONObject();
        addOmidPartnerNameAndPartnerVersionToBidRequest();
        addCurrentEnvironmentToCustomAtt();
        AdRegistration.addCustomAttribute("autoRefresh", String.valueOf(z));
        Iterator<String> keys = pJTemplate.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (pJTemplate.get(next) instanceof String) {
                    String str = AdRegistration.getCustomDictionary().get(pJTemplate.getString(next));
                    if (!DtbCommonUtils.isNullOrEmpty(str)) {
                        jSONObject.put(next, str);
                    }
                } else if (pJTemplate.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = pJTemplate.getJSONObject(next);
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (jSONObject2.get(next2) instanceof String) {
                            String str2 = AdRegistration.getCustomDictionary().get(jSONObject2.getString(next2));
                            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                                jSONObject3.put(next2, str2);
                            }
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject.put(next, jSONObject3);
                    }
                }
            } catch (Exception unused) {
                DtbLog.warn(this.LOG_TAG, "Error when constructing custom attribute parameters");
            }
        }
        if (jSONObject.length() > 0) {
            hashMap.put("pj", jSONObject);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void addCurrentEnvironmentToCustomAtt() {
        String str;
        Map hashMap = new HashMap();
        if (AdRegistration.getCustomDictionary() != null) {
            hashMap = AdRegistration.getCustomDictionary();
        }
        if (!hashMap.containsKey("framework")) {
            try {
                Class.forName("com.unity3d.player.UnityPlayerActivity");
                DtbLog.debug(this.LOG_TAG, "SDK used in Unity environment");
                str = TapjoyConstants.TJC_PLUGIN_UNITY;
            } catch (ClassNotFoundException unused) {
                DtbLog.debug(this.LOG_TAG, "SDK used in native Android environment");
                str = "native";
            }
            AdRegistration.addCustomAttribute("framework", str);
        }
    }
}
