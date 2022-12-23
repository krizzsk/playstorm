package com.saypromo.base;

import com.saypromo.SPAdManager;
import com.saypromo.core.device.AdvertisingId;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.properties.ClientProperties;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SPBaseManager {
    public static int ConnectionTimeout = 10;
    public static int EventConnectionTimeout = 5;
    public static int RequestTimeout = 30;
    static String SayPromoBaseUrl = "https://api.saypromo.net/ad/request";

    public static String GetURL(String str, String str2, String str3) {
        return ConfigurateURL(SayPromoBaseUrl, str2, str3);
    }

    public static String GetDebugUrl(String str, String str2, String str3) {
        return ConfigurateURL(str, str2, str3);
    }

    private static String ConfigurateURL(String str, String str2, String str3) {
        try {
            return ((((((((((((((((("" + str) + "?appKey=" + str2) + "&place=" + str3) + "&idfa=" + AdvertisingId.getAdvertisingTrackingId()) + "&idfv=" + Device.getAndroidId()) + "&os=android") + "&os_version=" + Device.getApiLevel()) + "&os_build=" + Device.getBuildId()) + "&device=" + Device.getManufacturer() + "+" + Device.getModel()) + "&locale=" + Locale.getDefault()) + "&width=" + Device.getScreenWidth()) + "&height=" + Device.getScreenHeight()) + "&time=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())) + "&lat=" + (AdvertisingId.getLimitedAdTracking() ? 1 : 0)) + "&bundle=" + ClientProperties.getAppName()) + "&appVersion=" + ClientProperties.getAppVersion()) + "&version=" + SPAdManager.InternalVersion).replaceAll(" ", "+");
        } catch (Exception e) {
            DeviceLog.error("SayPromo", e.getLocalizedMessage());
            return "";
        }
    }
}
