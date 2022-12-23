package com.apm.insight.p023l;

import android.util.Log;
import com.apm.insight.C1240h;

/* renamed from: com.apm.insight.l.q */
public final class C1311q {
    /* renamed from: a */
    public static void m1870a(Object obj) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m1871a(String str) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    /* renamed from: a */
    public static void m1872a(String str, Object obj) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* renamed from: a */
    public static void m1873a(String str, Object obj, Throwable th) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }

    /* renamed from: a */
    public static void m1874a(String str, Throwable th) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.e("npth", str + " NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static void m1875a(Throwable th) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: b */
    public static void m1876b(Object obj) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m1877b(Throwable th) {
        if (C1240h.m1560i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }
}
