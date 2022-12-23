package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d */
public final class C5130d {

    /* renamed from: a */
    public static final Class<?> f13734a;

    /* renamed from: b */
    public static final boolean f13735b;

    /* renamed from: a */
    public static boolean m15540a() {
        return f13734a != null && !f13735b;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f13734a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f13735b = cls2 != null;
    }
}
