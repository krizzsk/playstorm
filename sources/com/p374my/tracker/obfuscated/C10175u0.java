package com.p374my.tracker.obfuscated;

import android.util.Log;

/* renamed from: com.my.tracker.obfuscated.u0 */
public final class C10175u0 {

    /* renamed from: a */
    private static volatile boolean f25477a = false;

    /* renamed from: a */
    public static void m30440a(String str) {
        if (f25477a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    /* renamed from: a */
    public static void m30441a(String str, Throwable th) {
        if (f25477a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th);
        }
    }

    /* renamed from: a */
    public static void m30442a(boolean z) {
        f25477a = z;
    }

    /* renamed from: a */
    public static boolean m30443a() {
        return f25477a;
    }

    /* renamed from: b */
    public static void m30444b(String str) {
        if (f25477a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    /* renamed from: b */
    public static void m30445b(String str, Throwable th) {
        if (f25477a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }

    /* renamed from: c */
    public static void m30446c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTracker]", str);
    }
}
