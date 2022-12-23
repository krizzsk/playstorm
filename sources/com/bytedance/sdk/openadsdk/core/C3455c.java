package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;

/* renamed from: com.bytedance.sdk.openadsdk.core.c */
/* compiled from: AdPreference */
public class C3455c {

    /* renamed from: a */
    private static volatile C3455c f8385a;

    /* renamed from: b */
    private final SharedPreferences f8386b;

    private C3455c(Context context) {
        this.f8386b = context.getSharedPreferences("ttopenadsdk", 0);
    }

    /* renamed from: a */
    public static C3455c m10351a(Context context) {
        Class<C3455c> cls = C3455c.class;
        if (f8385a == null) {
            synchronized (cls) {
                if (f8385a == null) {
                    f8385a = new C3455c(context);
                }
            }
        }
        return f8385a;
    }

    /* renamed from: a */
    public void mo19455a(String str, int i) {
        if (C3953b.m12901c()) {
            C3966a.m12969a("ttopenadsdk", str, Integer.valueOf(i));
        } else {
            this.f8386b.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: a */
    public void mo19456a(String str, long j) {
        if (C3953b.m12901c()) {
            C3966a.m12970a("ttopenadsdk", str, Long.valueOf(j));
        } else {
            this.f8386b.edit().putLong(str, j).apply();
        }
    }

    /* renamed from: a */
    public void mo19457a(String str, String str2) {
        if (C3953b.m12901c()) {
            C3966a.m12971a("ttopenadsdk", str, str2);
        } else {
            this.f8386b.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public void mo19458a(String str, boolean z) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("ttopenadsdk", str, Boolean.valueOf(z));
        } else {
            this.f8386b.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: b */
    public int mo19459b(String str, int i) {
        return C3953b.m12901c() ? C3966a.m12962a("ttopenadsdk", str, i) : this.f8386b.getInt(str, i);
    }

    /* renamed from: b */
    public Long mo19460b(String str, long j) {
        return Long.valueOf(C3953b.m12901c() ? C3966a.m12963a("ttopenadsdk", str, j) : this.f8386b.getLong(str, j));
    }

    /* renamed from: b */
    public String mo19461b(String str, String str2) {
        return C3953b.m12901c() ? C3966a.m12977b("ttopenadsdk", str, str2) : this.f8386b.getString(str, str2);
    }

    /* renamed from: b */
    public boolean mo19462b(String str, boolean z) {
        return C3953b.m12901c() ? C3966a.m12974a("ttopenadsdk", str, z) : this.f8386b.getBoolean(str, z);
    }
}
