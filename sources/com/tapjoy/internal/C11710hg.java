package com.tapjoy.internal;

import android.os.Looper;

/* renamed from: com.tapjoy.internal.hg */
public final class C11710hg {

    /* renamed from: a */
    public static boolean f28464a;

    /* renamed from: a */
    public static void m33975a(String str) {
        if (f28464a) {
            C11845w.m34413a(4, "Tapjoy", str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public static void m33977a(String str, Object... objArr) {
        if (f28464a) {
            C11845w.m34414a(4, "Tapjoy", str, objArr);
        }
    }

    /* renamed from: b */
    public static void m33980b(String str) {
        if (f28464a) {
            C11845w.m34415a("Tapjoy", str);
        }
    }

    /* renamed from: b */
    public static void m33981b(String str, Object... objArr) {
        if (f28464a) {
            C11845w.m34416a("Tapjoy", str, objArr);
        }
    }

    /* renamed from: a */
    public static void m33976a(String str, String str2, String str3) {
        if (f28464a) {
            C11845w.m34416a("Tapjoy", "{}: {} {}", str, str2, str3);
        }
    }

    /* renamed from: a */
    public static boolean m33978a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        if (!f28464a) {
            return false;
        }
        m33980b(str);
        return false;
    }

    /* renamed from: a */
    public static boolean m33979a(boolean z, String str) {
        if (!f28464a || z) {
            return z;
        }
        m33980b(str);
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    static boolean m33982c(String str) {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        return m33979a(z, str + ": Must be called on the main/ui thread");
    }

    /* renamed from: d */
    static void m33983d(String str) {
        if (f28464a) {
            m33980b(str + ": Should be called after initializing the SDK");
        }
    }

    /* renamed from: e */
    static void m33984e(String str) {
        if (f28464a) {
            m33980b(str + ": Should be called after initializing the SDK");
        }
    }
}
