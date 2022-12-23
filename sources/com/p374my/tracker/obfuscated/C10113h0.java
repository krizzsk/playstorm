package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.h0 */
public final class C10113h0 {
    /* renamed from: a */
    public static boolean m30080a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return "Xiaomi".equalsIgnoreCase(str) || "Meizu".equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public static boolean m30081a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
