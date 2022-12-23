package com.amazon.device.ads;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKUtilities {
    static final String BID_HTML_TEMPLATE = "<div style=\"display:inline-block\"><div id=\"__dtbAd__\" style=\"overflow:hidden;\"><!--Placeholder for the Ad --></div><script type=\"text/javascript\">amzn.dtb.loadAd(\"%s\", \"%s\", \"%s\", %s, {isv: %s, dc: \"%s\", skipafter: %s, vtype: \"%s\"});</script></div>";
    private static final String LOG_TAG = SDKUtilities.class.getSimpleName();
    private static String amznDebugStateFlag = "false";

    public static String getBidInfo(DTBAdResponse dTBAdResponse) {
        List list;
        Map<String, List<String>> map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            if (dTBAdResponse.getDTBAds().size() == 0) {
                return "";
            }
            if (dTBAdResponse.isVideo()) {
                map = dTBAdResponse.getVideoAdsRequestCustomParamsAsList();
                list = map.get(DTBAdLoader.A9_VID_KEY);
            } else {
                map = dTBAdResponse.getDefaultDisplayAdsRequestCustomParams();
                list = map.get(DTBAdLoader.A9_BID_ID_KEY);
            }
            if (!DtbCommonUtils.isNullOrEmpty(list)) {
                str = (String) list.get(0);
            } else {
                str = "";
            }
            List list2 = map.get(DTBAdLoader.A9_HOST_KEY);
            if (!DtbCommonUtils.isNullOrEmpty(list2)) {
                str2 = (String) list2.get(0);
            } else {
                str2 = "";
            }
            List list3 = map.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            if (!DtbCommonUtils.isNullOrEmpty(list3)) {
                str3 = (String) list3.get(0);
            } else {
                str3 = "";
            }
            Map<String, List<String>> kvpDictionary = dTBAdResponse.getKvpDictionary();
            if (!kvpDictionary.containsKey("dc") || kvpDictionary.get("dc").size() == 0) {
                str4 = "";
            } else {
                str4 = (String) kvpDictionary.get("dc").get(0);
            }
            if (!DtbCommonUtils.isNullOrEmpty(dTBAdResponse.getVideoInventoryType())) {
                str5 = dTBAdResponse.getVideoInventoryType();
            } else {
                str5 = "";
            }
            return String.format(DTBMetricsConfiguration.getClientConfigVal(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, BID_HTML_TEMPLATE, "templates"), new Object[]{str3, str, str2, amznDebugStateFlag, Boolean.valueOf(dTBAdResponse.isVideo()), str4, dTBAdResponse.getVideoSkipAfterDurationInSeconds(), str5});
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute getBidInfo method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getBidInfo method", e);
            return "";
        }
    }

    public static String getPricePoint(DTBAdResponse dTBAdResponse) {
        Map<String, List<String>> map;
        try {
            if (dTBAdResponse.isVideo()) {
                map = dTBAdResponse.getVideoAdsRequestCustomParamsAsList();
            } else {
                map = dTBAdResponse.getDefaultDisplayAdsRequestCustomParams();
            }
            List list = map.get(DTBAdLoader.A9_PRICE_POINTS_KEY);
            if (list == null || list.size() <= 0) {
                return "";
            }
            return (String) list.get(0);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute getPricePoint method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute getPricePoint method", e);
            return "";
        }
    }

    static int getWidth(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getWidth();
    }

    static int getHeight(DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getDTBAds().size() == 0) {
            return -1;
        }
        return dTBAdResponse.getDTBAds().get(0).getHeight();
    }

    public static boolean isTelSupported() {
        try {
            if ((Build.VERSION.SDK_INT < 23 || AdRegistration.getContext().checkSelfPermission("android.permission.CALL_PHONE") == 0) && ((TelephonyManager) AdRegistration.getContext().getSystemService("phone")).getPhoneType() != 0) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute isTelSupported method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isTelSupported method", e);
            return false;
        }
    }

    protected static Map<String, Object> convertJSONObjectToMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                hashMap.put(next, convertJSONObjectToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                hashMap.put(next, convertJSONArrayToList((JSONArray) obj));
            } else {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    protected static List<Object> convertJSONArrayToList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = convertJSONArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = convertJSONObjectToMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Deprecated
    public static boolean isEmulator() {
        try {
            String str = Build.FINGERPRINT;
            String str2 = Build.MODEL;
            String str3 = Build.MANUFACTURER;
            if (str.startsWith("generic") || str.startsWith("unknown") || str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || str3.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute isEmulator method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute isEmulator method", e);
            return false;
        }
    }

    public static class SimpleSize {
        int height;
        int width;

        public int getWidth() {
            return this.width;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public SimpleSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    static void setAmznDebugStateFlagValue(String str) {
        amznDebugStateFlag = str;
    }
}
