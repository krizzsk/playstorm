package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.inmobi.media.hp */
/* compiled from: SdkInfo */
public final class C6228hp {

    /* renamed from: a */
    private static String f15782a = "dir";

    /* renamed from: b */
    private static String f15783b;

    /* renamed from: b */
    public static String m18574b() {
        return "10.0.7";
    }

    /* renamed from: c */
    public static String m18577c() {
        return "2.0";
    }

    /* renamed from: d */
    public static String m18578d() {
        return "android";
    }

    /* renamed from: e */
    public static String m18579e() {
        return "https://www.inmobi.com/products/sdk/#downloads";
    }

    /* renamed from: a */
    public static String m18569a() {
        String str = "pr-SAND-" + m18574b() + "-20220525";
        if (TextUtils.isEmpty("")) {
            return str;
        }
        return str + "-" + "";
    }

    /* renamed from: a */
    public static String m18570a(Context context) {
        return C6216hf.m18493a(context, "sdk_version_store").mo35419b("sdk_version");
    }

    /* renamed from: a */
    public static void m18571a(Context context, String str) {
        C6216hf.m18493a(context, "sdk_version_store").mo35416a("sdk_version", str);
    }

    /* renamed from: b */
    public static boolean m18576b(Context context) {
        return C6216hf.m18493a(context, "sdk_version_store").mo35420b("db_deletion_failed", false);
    }

    /* renamed from: a */
    public static void m18572a(Context context, boolean z) {
        C6216hf.m18493a(context, "sdk_version_store").mo35417a("db_deletion_failed", z);
    }

    /* renamed from: a */
    public static void m18573a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f15782a = str;
        }
    }

    /* renamed from: b */
    public static void m18575b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f15783b = str;
        }
    }

    /* renamed from: f */
    public static String m18580f() {
        return f15783b;
    }

    /* renamed from: g */
    public static String m18581g() {
        return f15782a;
    }
}
