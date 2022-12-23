package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.he */
public final class C11705he {
    /* renamed from: a */
    public static String m33963a(String str) {
        String trim;
        if (str == null || str.length() == 0 || (trim = str.trim()) == null || trim.length() == 0) {
            return null;
        }
        return trim;
    }

    /* renamed from: b */
    public static String m33965b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim;
    }

    /* renamed from: a */
    public static String m33964a(String str, String str2, String str3) {
        if (str == null) {
            C11710hg.m33976a(str2, str3, "must not be null");
            return null;
        } else if (str.length() == 0) {
            C11710hg.m33976a(str2, str3, "must not be empty");
            return null;
        } else {
            String trim = str.trim();
            if (trim.length() != 0) {
                return trim;
            }
            C11710hg.m33976a(str2, str3, "must not be blank");
            return null;
        }
    }
}
