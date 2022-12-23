package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.mt */
public final class C10768mt {

    /* renamed from: a */
    private static final C10769mu f27004a;

    /* renamed from: b */
    private static final C10790nm[] f27005b = new C10790nm[0];

    static {
        C10769mu muVar = null;
        try {
            muVar = (C10769mu) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (muVar == null) {
            muVar = new C10769mu();
        }
        f27004a = muVar;
    }

    /* renamed from: a */
    public static C10791nn m32778a(Class cls) {
        return C10769mu.m32783a(cls, "");
    }

    /* renamed from: b */
    public static C10790nm m32781b(Class cls) {
        return C10769mu.m32782a(cls);
    }

    /* renamed from: a */
    public static String m32780a(C10766mr mrVar) {
        return C10769mu.m32786a(mrVar);
    }

    /* renamed from: a */
    public static C10792no m32779a(C10763mo moVar) {
        return C10769mu.m32784a(moVar);
    }
}
