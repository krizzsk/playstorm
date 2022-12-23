package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gs */
public final class C11690gs {
    /* renamed from: a */
    public static String m33926a(@Nullable String str) {
        return str == null ? "" : str;
    }

    @Nullable
    /* renamed from: b */
    public static String m33927b(@Nullable String str) {
        if (m33928c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m33928c(@Nullable String str) {
        return str == null || str.length() == 0;
    }
}
