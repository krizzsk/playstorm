package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gt */
public final class C11691gt {
    /* renamed from: a */
    private static <X extends Throwable> void m33930a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            try {
                throw ((Throwable) cls.cast(th));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static void m33931b(Throwable th) {
        m33930a(th, Error.class);
        m33930a(th, RuntimeException.class);
    }

    /* renamed from: a */
    public static RuntimeException m33929a(Throwable th) {
        m33931b((Throwable) C11689gr.m33925a(th));
        throw new RuntimeException(th);
    }
}
