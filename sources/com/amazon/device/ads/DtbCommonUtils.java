package com.amazon.device.ads;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONException;
import org.json.JSONObject;

public class DtbCommonUtils {
    private static String sdkFlavor;

    private DtbCommonUtils() {
    }

    static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static String getURLEncodedString(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (UnsupportedEncodingException unused) {
            DtbLog.debugError("Unable to url encode :" + str);
            return str;
        }
    }

    static String getSDKMRAIDVersion() {
        String sDKFlavor = getSDKFlavor();
        if (sDKFlavor == null) {
            return "aps-android";
        }
        return "aps-android-" + sDKFlavor;
    }

    static String getSDKVersion() {
        String sDKFlavor = getSDKFlavor();
        if (sDKFlavor == null) {
            return "aps-android-9.5.0";
        }
        return "aps-android-9.5.0-" + sDKFlavor;
    }

    static String getSDKFlavor() {
        String str = sdkFlavor;
        if (str != null) {
            return str;
        }
        String[] strArr = AdRegistration.serverlessMarkers;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = strArr[i];
            try {
                Class.forName(str2);
                if (str2.contains("admob")) {
                    sdkFlavor = "admob";
                } else if (str2.contains("mopub")) {
                    sdkFlavor = "mopub";
                } else if (str2.contains("applovin")) {
                    sdkFlavor = "MAX";
                }
            } catch (Exception unused) {
                i++;
            }
        }
        Map<String, String> customDictionary = AdRegistration.getCustomDictionary();
        if (!isNullOrEmpty((Map) customDictionary)) {
            String str3 = customDictionary.get("mediationName");
            if (!isNullOrEmpty(str3)) {
                sdkFlavor = str3;
            }
        }
        return sdkFlavor;
    }

    static boolean isOnMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            DtbLog.debugError("Exception parsing the integer from string:" + str);
            return i;
        }
    }

    static Bundle getApplicationBundle() throws PackageManager.NameNotFoundException {
        if (AdRegistration.getContext() != null) {
            return AdRegistration.getContext().getPackageManager().getApplicationInfo(AdRegistration.getContext().getPackageName(), 128).metaData;
        }
        throw new IllegalStateException("Application Context can't be null");
    }

    static InputStream getResourceAsStream(String str) {
        return DtbCommonUtils.class.getResourceAsStream(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }

    static boolean isNullOrEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    static boolean isNullOrEmpty(List list) {
        return list == null || list.size() == 0;
    }

    static boolean isNullOrWhiteSpace(String str) {
        return isNullOrEmpty(str) || str.trim().equals("");
    }

    static long getMilliSeconds(String str) {
        return Long.parseLong(str) * 1000;
    }

    static boolean isActivityDestroyed(Activity activity) {
        return Build.VERSION.SDK_INT > 16 && activity.isDestroyed();
    }

    static String getParamsAsJsonString(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : map.keySet()) {
            jSONObject.put(next, map.get(next));
        }
        return jSONObject.toString();
    }

    static String exceptionToString(Exception exc) {
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            return "";
        }
        return "(" + localizedMessage + ")";
    }

    static String getStringFieldValue(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            if (declaredField.isAccessible()) {
                return (String) declaredField.get((Object) null);
            }
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (NoSuchFieldException unused) {
            DtbLog.debug("Field:" + str2 + " does not exist");
            return null;
        } catch (SecurityException unused2) {
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (IllegalArgumentException e) {
            DtbLog.debug("Illegal Argument exception:" + e.getMessage());
            return null;
        } catch (IllegalAccessException e2) {
            DtbLog.debug("Illegal Access exception:" + e2.getMessage());
            return null;
        } catch (ClassNotFoundException unused3) {
            DtbLog.debug("Class not found:" + str);
            return null;
        }
    }

    static Integer getIntegerFieldValue(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            if (declaredField.isAccessible()) {
                return (Integer) declaredField.get((Object) null);
            }
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (NoSuchFieldException unused) {
            DtbLog.debug("Field:" + str2 + " does not exist");
            return null;
        } catch (SecurityException unused2) {
            DtbLog.debug("Field:" + str2 + " is not accessable");
            return null;
        } catch (IllegalArgumentException e) {
            DtbLog.debug("Illegal Argument exception:" + e.getMessage());
            return null;
        } catch (IllegalAccessException e2) {
            DtbLog.debug("Illegal Access exception:" + e2.getMessage());
            return null;
        } catch (ClassNotFoundException unused3) {
            DtbLog.debug("Class notFound:" + str);
            return null;
        }
    }

    static class APIVersion {
        public int majorVersion = 0;
        public int minorVersion = 0;

        APIVersion() {
        }
    }

    static APIVersion getAPIVersion(String str) {
        APIVersion aPIVersion = new APIVersion();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : str;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "0";
            try {
                aPIVersion.majorVersion = Integer.parseInt(nextToken);
                aPIVersion.minorVersion = Integer.parseInt(nextToken2);
            } catch (NumberFormatException unused) {
                DtbLog.warn("Invalid API version:" + str);
            }
        }
        return aPIVersion;
    }

    static boolean isNetworkConnected() {
        NetworkCapabilities networkCapabilities;
        if (AdRegistration.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AdRegistration.getContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            if (Build.VERSION.SDK_INT < 23) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (!activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 0)) {
                        return false;
                    }
                    return true;
                }
            } else {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                    if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1)) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    static String getHostNameFromUrl(String str) {
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            str = "https://" + str;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception unused) {
            DtbLog.error(String.format("The url %s that is passed for parsing is invalid. Please check the URL", new Object[0]));
            return null;
        }
    }

    static DTBAdRequest createAutoRefreshAdLoader(DTBAdRequest dTBAdRequest) {
        DTBAdRequest dTBAdRequest2 = new DTBAdRequest();
        if (!isNullOrEmpty((List) dTBAdRequest.getAdSizes())) {
            dTBAdRequest2.setAdSizes(dTBAdRequest.getAdSizes());
        }
        if (!isNullOrEmpty(dTBAdRequest.getSlotGroupName())) {
            dTBAdRequest2.setSlotGroup(dTBAdRequest.getSlotGroupName());
        }
        if (!isNullOrEmpty((Map) dTBAdRequest.getCustomTargets())) {
            dTBAdRequest2.setCustomTargets(dTBAdRequest.getCustomTargets());
        }
        dTBAdRequest2.setRefreshFlag(true);
        return dTBAdRequest2;
    }

    static Bundle initializeEmptyBundle() {
        return new Bundle();
    }
}
