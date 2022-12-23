package com.mbridge.msdk.foundation.same.report.p314c;

/* renamed from: com.mbridge.msdk.foundation.same.report.c.a */
/* compiled from: LogFileController */
public class C8525a {

    /* renamed from: a */
    public static final String f20663a = C8525a.class.getSimpleName();

    /* renamed from: b */
    private static C8525a f20664b = null;

    private C8525a() {
    }

    /* renamed from: a */
    public static synchronized C8525a m24643a() {
        C8525a aVar;
        synchronized (C8525a.class) {
            if (f20664b == null) {
                f20664b = new C8525a();
            }
            aVar = f20664b;
        }
        return aVar;
    }
}
