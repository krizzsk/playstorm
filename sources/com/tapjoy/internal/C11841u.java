package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.u */
public final class C11841u {

    /* renamed from: a */
    private static String f28933a = "pool.ntp.org";

    /* renamed from: b */
    private static long f28934b = 20000;

    /* renamed from: c */
    private static volatile boolean f28935c = false;

    /* renamed from: d */
    private static volatile String f28936d;

    /* renamed from: e */
    private static volatile long f28937e;

    /* renamed from: f */
    private static volatile long f28938f;

    /* renamed from: g */
    private static volatile long f28939g;

    /* renamed from: h */
    private static volatile long f28940h;

    /* renamed from: i */
    private static volatile long f28941i;

    static {
        m34408a(false, "System", System.currentTimeMillis(), SystemClock.elapsedRealtime(), Long.MAX_VALUE);
    }

    /* renamed from: a */
    private static synchronized void m34408a(boolean z, String str, long j, long j2, long j3) {
        synchronized (C11841u.class) {
            f28935c = z;
            f28936d = str;
            f28937e = j;
            f28938f = j2;
            f28939g = j3;
            f28940h = f28937e - f28938f;
            f28941i = (SystemClock.elapsedRealtime() + f28940h) - System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static boolean m34409a() {
        String str = f28933a;
        long j = f28934b;
        C11692gu guVar = new C11692gu();
        if (!guVar.mo72582a(str, (int) j)) {
            return false;
        }
        m34408a(true, "SNTP", guVar.f28437a, guVar.f28438b, guVar.f28439c / 2);
        return true;
    }

    /* renamed from: b */
    public static long m34410b() {
        return SystemClock.elapsedRealtime() + f28940h;
    }

    /* renamed from: a */
    public static long m34407a(long j) {
        return j + f28940h;
    }

    /* renamed from: c */
    public static boolean m34411c() {
        return f28935c;
    }
}
