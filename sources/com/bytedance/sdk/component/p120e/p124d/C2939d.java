package com.bytedance.sdk.component.p120e.p124d;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.e.d.d */
/* compiled from: NLogger */
public class C2939d {

    /* renamed from: a */
    private static boolean f6676a = false;

    /* renamed from: b */
    private static int f6677b = 4;

    /* renamed from: a */
    public static void m8273a(String str) {
        m8274a("NetLog", str);
    }

    /* renamed from: a */
    public static void m8274a(String str, String str2) {
        if (f6676a && str2 != null && f6677b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m8275b(String str, String str2) {
        if (f6676a && str2 != null && f6677b <= 4) {
            Log.i(str, str2);
        }
    }
}
