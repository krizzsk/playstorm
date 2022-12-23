package com.saypromo.base;

import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.saypromo.SPAdManager;
import com.saypromo.core.device.AdvertisingId;
import com.saypromo.core.device.Device;
import com.saypromo.core.properties.ClientProperties;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class AdToken {
    public String appId;
    public String bundle;
    public String device_name;
    public String device_os;
    public int height;
    public String idfa;
    public String idfv;
    public String locale;

    /* renamed from: os */
    public String f27123os;
    public String placeId;
    public int version;
    public int width;

    public String GenerateToken(String str, String str2) {
        try {
            this.appId = str;
            this.placeId = str2;
            this.version = SPAdManager.InternalVersion;
            this.bundle = ClientProperties.getAppName();
            this.f27123os = "android";
            this.idfa = AdvertisingId.getAdvertisingTrackingId();
            this.idfv = Device.getAndroidId();
            this.locale = "" + Locale.getDefault();
            this.device_name = Device.getManufacturer() + "+" + Device.getModel();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(Device.getBuildId());
            this.device_os = sb.toString();
            this.width = Device.getScreenWidth();
            this.height = Device.getScreenHeight();
            return Base64.encodeToString(toJSON().getBytes(), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.APP_KEY, this.appId);
            jSONObject.put("place_Id", this.placeId);
            jSONObject.put("version", this.version);
            jSONObject.put(TJAdUnitConstants.String.BUNDLE, this.bundle);
            jSONObject.put("os", this.f27123os);
            jSONObject.put("idfa", this.idfa);
            jSONObject.put("idfv", this.idfv);
            jSONObject.put("locale", this.locale);
            jSONObject.put(TapjoyConstants.TJC_DEVICE_NAME, this.device_name);
            jSONObject.put("device_os", this.device_os);
            jSONObject.put("width", this.width);
            jSONObject.put("height", this.height);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
