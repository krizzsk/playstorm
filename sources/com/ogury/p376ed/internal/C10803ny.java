package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.ny */
class C10803ny extends C10802nx {
    /* renamed from: a */
    public static final boolean m32817a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
