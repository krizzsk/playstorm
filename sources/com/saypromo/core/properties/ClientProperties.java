package com.saypromo.core.properties;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import com.saypromo.core.log.DeviceLog;

public class ClientProperties {
    private static Activity _activity;
    private static Context _applicationContext;

    public static void setActivity(Activity activity) {
        _activity = activity;
    }

    public static Context getApplicationContext() {
        return _applicationContext;
    }

    public static void setApplicationContext(Context context) {
        _applicationContext = context;
    }

    public static String getAppName() {
        return _applicationContext.getPackageName();
    }

    public static String getAppVersion() {
        try {
            return getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            DeviceLog.exception("Error getting package info", e);
            return null;
        }
    }
}
