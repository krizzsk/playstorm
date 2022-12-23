package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.f */
/* compiled from: Exceptions.kt */
public class C10276f {
    /* renamed from: a */
    public static boolean m31125a(String str) {
        C10219ai.m31036b(str, "className");
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
