package com.saypromo.core.device;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.properties.ClientProperties;
import java.sql.Timestamp;

public class Device {
    private static String _saykitUnityIDFV;

    public static String getVersionName() {
        return "10.3.48";
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static void SetSayKitUnityIDFV(String str) {
        _saykitUnityIDFV = str;
    }

    public static String getAndroidId() {
        try {
            if (_saykitUnityIDFV == null || _saykitUnityIDFV.length() <= 0) {
                return Settings.Secure.getString(ClientProperties.getApplicationContext().getContentResolver(), "android_id");
            }
            return _saykitUnityIDFV;
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching androidId", e);
            return null;
        }
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static int getScreenDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static boolean isAppInstalled(String str) {
        if (ClientProperties.getApplicationContext() != null) {
            try {
                PackageInfo packageInfo = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
                if (packageInfo == null || packageInfo.packageName == null || !str.equals(packageInfo.packageName)) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static int getStreamVolume(int i) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static long getTimestampInMillis() {
        return new Timestamp(System.currentTimeMillis()).getTime();
    }

    public static String getBuildId() {
        return Build.ID;
    }
}
