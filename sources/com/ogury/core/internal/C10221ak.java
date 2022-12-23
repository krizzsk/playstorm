package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.ak */
/* compiled from: Reflection */
public final class C10221ak {

    /* renamed from: a */
    private static final C10218ah f25995a;

    static {
        C10218ah ahVar = null;
        try {
            ahVar = (C10218ah) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ahVar == null) {
            ahVar = new C10218ah();
        }
        f25995a = ahVar;
    }

    /* renamed from: a */
    public static String m31037a(C10220aj ajVar) {
        return f25995a.mo66779a(ajVar);
    }
}
