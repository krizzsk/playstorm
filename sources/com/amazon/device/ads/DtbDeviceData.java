package com.amazon.device.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

final class DtbDeviceData {
    private static final String DEFAULT_USER_AGENT = "Android";
    private static final String LOG_TAG = DtbDeviceData.class.getSimpleName();
    private static DtbDeviceData deviceDataInstance = null;
    private boolean bad_mac = false;
    private boolean bad_serial = false;
    private boolean bad_udid = false;
    private JSONObject deviceInfoJson = new JSONObject();
    private HashMap<String, Object> deviceParams = new HashMap<>();
    private String orientation = null;
    private String screenSize = null;
    private String sha1_mac = null;
    private String sha1_serial = null;
    private String sha1_udid = null;

    /* renamed from: ua */
    private String f915ua = null;

    public static DtbDeviceData getDeviceDataInstance() {
        if (AdRegistration.getContext() != null) {
            if (deviceDataInstance == null) {
                if (AdRegistration.getContext() != null) {
                    deviceDataInstance = new DtbDeviceData(AdRegistration.getContext());
                } else {
                    DtbLog.debugError("Invalid intialization of Device Data. Context is null");
                    throw new IllegalArgumentException("Invalid intialization of Device Data. Context is null");
                }
            }
            return deviceDataInstance;
        }
        DtbLog.debugError("unable to initialize advertising info without setting app context");
        throw new IllegalArgumentException("unable to initialize advertising info without setting app context");
    }

    public JSONObject getParamsJson() {
        try {
            getOrientation();
            placeProperty(this.orientation, "orientation");
            getScreenSize();
            placeProperty(this.screenSize, "screenSize");
        } catch (Exception e) {
            DtbLog.error("Error:" + e);
        }
        return this.deviceInfoJson;
    }

    public JSONObject getParamsJsonGetSafe() {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = this.deviceInfoJson.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = this.deviceInfoJson.get(next);
                if (obj instanceof String) {
                    jSONObject.put(next, URLEncoder.encode((String) obj, "UTF-8"));
                }
            } catch (Exception unused) {
                DtbLog.error("Error converting to JsonGetSafe");
            }
        }
        return jSONObject;
    }

    public HashMap<String, Object> getDeviceParams() {
        if (!this.deviceParams.containsKey("ua") || (this.deviceParams.containsKey("ua") && this.deviceParams.get("ua").equals("Android"))) {
            getUserAgent();
            buildDeviceParams();
        }
        return this.deviceParams;
    }

    private DtbDeviceData(Context context) {
        getOrientation();
        getScreenSize();
        getDeviceInfoJson();
        getUserAgent();
        buildDeviceParams();
    }

    private void buildDeviceParams() {
        this.deviceParams.put("dt", "android");
        this.deviceParams.put(TapjoyConstants.TJC_APP_PLACEMENT, TapjoyConstants.TJC_APP_PLACEMENT);
        this.deviceParams.put(AuthenticationTokenClaims.JSON_KEY_AUD, "3p");
        String str = this.f915ua;
        if (str != null) {
            this.deviceParams.put("ua", str);
        }
        this.deviceParams.put("sdkVer", DtbCommonUtils.getSDKVersion());
        JSONObject jSONObject = this.deviceInfoJson;
        if (jSONObject != null) {
            this.deviceParams.put("dinfo", jSONObject);
        }
    }

    private void getDeviceInfoJson() {
        float f;
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.DEVICE;
        String country = Locale.getDefault().getCountry();
        String language = Locale.getDefault().getLanguage();
        String connectionType = getConnectionType();
        int screenPpi = getScreenPpi();
        TelephonyManager telephonyManager = (TelephonyManager) AdRegistration.getContext().getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        if (!str2.equals("motorola") || !str.equals("MB502")) {
            f = getDisplayMetrics().scaledDensity;
        } else {
            f = 1.0f;
        }
        String f2 = Float.toString(f);
        try {
            placeProperty("Android", "os");
            placeProperty(str, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            placeProperty(str2, "make");
            placeProperty(str4, "hwv");
            placeProperty(str3, "osVersion");
            placeProperty(country, UserDataStore.COUNTRY);
            placeProperty(networkOperatorName, "carrier");
            placeProperty(language, "language");
            placeProperty(this.screenSize, "screenSize");
            placeProperty(f2, "scalingFactor");
            placeProperty(Integer.toString(screenPpi), "ppi");
            placeProperty(this.orientation, "orientation");
            placeProperty(connectionType, "connectionType");
        } catch (JSONException unused) {
            DtbLog.error(LOG_TAG, "JSONException while producing deviceInfoJson");
        } catch (UnsupportedEncodingException unused2) {
            DtbLog.error(LOG_TAG, "Unsupported encoding");
        }
    }

    /* access modifiers changed from: package-private */
    public void placeProperty(String str, String str2) throws JSONException, UnsupportedEncodingException {
        if (str != null && !str.isEmpty()) {
            this.deviceInfoJson.put(str2, str);
        }
    }

    private String generateSha1Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(str.getBytes());
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b & 255) | 256).substring(1));
        }
        return sb.toString();
    }

    private void getUserAgent() {
        try {
            this.f915ua = WebSettings.getDefaultUserAgent(AdRegistration.getContext());
        } catch (Exception unused) {
            DtbLog.info("Unable to Get User Agent, Setting it to default");
            this.f915ua = "Android";
        }
    }

    /* access modifiers changed from: package-private */
    public String getUserAgentString() {
        return this.f915ua;
    }

    /* access modifiers changed from: package-private */
    public String getConnectionType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "0";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return Integer.toString(activeNetworkInfo.getSubtype());
        }
        if (type == 1) {
            return "Wifi";
        }
        if (type != 6) {
            return "0";
        }
        return "13";
    }

    private void getScreenSize() {
        this.screenSize = DtbDeviceDataRetriever.getScreenSize(new DisplayMetrics(), this.orientation);
    }

    private void getOrientation() {
        this.orientation = DtbDeviceDataRetriever.getOrientation(AdRegistration.getContext());
    }

    private int getScreenPpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        return (int) (Math.sqrt(Math.pow((double) displayMetrics.widthPixels, 2.0d) + Math.pow((double) displayMetrics.heightPixels, 2.0d)) / Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)));
    }

    private DisplayMetrics getDisplayMetrics() {
        return AdRegistration.getContext().getResources().getDisplayMetrics();
    }
}
