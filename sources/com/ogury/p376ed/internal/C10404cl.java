package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.cl */
public final class C10404cl {

    /* renamed from: a */
    public static final C10404cl f26341a = new C10404cl();

    private C10404cl() {
    }

    /* renamed from: a */
    public static boolean m31488a() {
        return m31489a("androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    private static boolean m31489a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
