package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.my.tracker.obfuscated.s0 */
public final class C10169s0 {
    /* renamed from: a */
    public static <T> T m30422a(Context context, String str, Class<T> cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            C10175u0.m30441a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    /* renamed from: a */
    public static String m30423a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            C10175u0.m30440a("SystemUtils: value in system properties is null for " + str);
            return null;
        } catch (Throwable th) {
            C10175u0.m30441a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
    }
}
