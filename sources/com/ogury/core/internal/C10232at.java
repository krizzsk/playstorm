package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.at */
/* compiled from: CharJVM.kt */
class C10232at {
    /* renamed from: a */
    public static boolean m31049a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
