package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class TapjoyAppSettings {
    public static final String TAG = TapjoyAppSettings.class.getSimpleName();

    /* renamed from: b */
    private static TapjoyAppSettings f27486b;

    /* renamed from: a */
    String f27487a;

    /* renamed from: c */
    private Context f27488c;

    /* renamed from: d */
    private SharedPreferences f27489d;

    private TapjoyAppSettings(Context context) {
        this.f27488c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        this.f27489d = sharedPreferences;
        String string = sharedPreferences.getString(TapjoyConstants.PREF_LOG_LEVEL, (String) null);
        this.f27487a = string;
        if (!TextUtils.isEmpty(string)) {
            String str = TAG;
            TapjoyLog.m33194d(str, "restoreLoggingLevel from sharedPref -- loggingLevel=" + this.f27487a);
            TapjoyLog.m33193a(this.f27487a, true);
        }
    }

    public static TapjoyAppSettings getInstance() {
        return f27486b;
    }

    public static void init(Context context) {
        TapjoyLog.m33194d(TAG, "initializing app settings");
        f27486b = new TapjoyAppSettings(context);
    }

    public void saveLoggingLevel(String str) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.m33194d(TAG, "saveLoggingLevel -- server logging level is NULL or Empty string");
            return;
        }
        String str2 = TAG;
        TapjoyLog.m33194d(str2, "saveLoggingLevel -- currentLevel=" + this.f27487a + ";newLevel=" + str);
        if (TextUtils.isEmpty(this.f27487a) || !this.f27487a.equals(str)) {
            SharedPreferences.Editor edit = this.f27489d.edit();
            edit.putString(TapjoyConstants.PREF_LOG_LEVEL, str);
            edit.apply();
            this.f27487a = str;
            TapjoyLog.m33193a(str, true);
        }
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging set to '");
        sb.append(str);
        sb.append("'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m33197i(str3, sb.toString());
    }

    public void clearLoggingLevel() {
        SharedPreferences.Editor edit = this.f27489d.edit();
        edit.remove(TapjoyConstants.PREF_LOG_LEVEL);
        edit.apply();
        this.f27487a = null;
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging 'Disabled'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m33197i(str, sb.toString());
        TapjoyLog.setDebugEnabled(isLoggingEnabled);
    }

    public void saveConnectResultAndParams(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = this.f27489d.edit();
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, str);
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, str2);
            if (j >= 0) {
                edit.putLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, j);
            } else {
                edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            }
            TapjoyLog.m33197i(TAG, "Stored connect result");
            edit.apply();
        }
    }

    public void removeConnectResult() {
        if (this.f27489d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null) != null) {
            SharedPreferences.Editor edit = this.f27489d.edit();
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            TapjoyLog.m33197i(TAG, "Removed connect result");
            edit.apply();
        }
    }

    public String getConnectResult(String str, long j) {
        String string = this.f27489d.getString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, (String) null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str) && str.equals(this.f27489d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null))) {
            long j2 = this.f27489d.getLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, -1);
            if (j2 < 0 || j2 >= j) {
                return string;
            }
        }
        return null;
    }
}
