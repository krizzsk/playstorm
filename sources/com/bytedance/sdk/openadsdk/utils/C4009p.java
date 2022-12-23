package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;

/* renamed from: com.bytedance.sdk.openadsdk.utils.p */
/* compiled from: SpAdUtile */
public class C4009p {
    /* renamed from: f */
    private static String m13162f() {
        return "sp_last_ad_show_cache_show_ad";
    }

    /* renamed from: e */
    private static Context m13161e() {
        return C3578m.m11231a();
    }

    /* renamed from: a */
    private static SharedPreferences m13155a(String str) {
        try {
            if (m13161e() != null) {
                return m13161e().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m13156a() {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12977b(m13162f(), "material_data", (String) null);
            }
            SharedPreferences a = m13155a(m13162f());
            if (a != null) {
                return a.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m13158b() {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12977b(m13162f(), "show_ad_tag", (String) null);
            }
            SharedPreferences a = m13155a(m13162f());
            if (a != null) {
                return a.getString("show_ad_tag", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static long m13159c() {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12963a(m13162f(), "show_time", 0);
            }
            SharedPreferences a = m13155a(m13162f());
            if (a != null) {
                return a.getLong("show_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m13157a(String str, String str2) {
        try {
            if (C3953b.m12901c()) {
                C3966a.m12970a(m13162f(), "show_time", Long.valueOf(System.currentTimeMillis()));
                C3966a.m12971a(m13162f(), "material_data", str);
                C3966a.m12971a(m13162f(), "show_ad_tag", str2);
                return;
            }
            SharedPreferences a = m13155a(m13162f());
            if (a != null) {
                a.edit().putLong("show_time", System.currentTimeMillis()).putString("material_data", str).putString("show_ad_tag", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static void m13160d() {
        try {
            if (C3953b.m12901c()) {
                C3966a.m12965a(m13162f());
                return;
            }
            SharedPreferences a = m13155a(m13162f());
            if (a != null) {
                a.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }
}
