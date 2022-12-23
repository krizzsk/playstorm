package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.inmobi.media.hx */
/* compiled from: PrefDao */
public final class C6241hx {

    /* renamed from: a */
    private final C6216hf f15802a;

    public C6241hx(Context context, String str) {
        this.f15802a = C6216hf.m18493a(context, str);
    }

    /* renamed from: a */
    public final void mo35450a(String str, String str2) {
        this.f15802a.mo35416a(str, str2);
    }

    /* renamed from: b */
    public final void mo35455b(String str, String str2) {
        this.f15802a.mo35416a(str, str2);
        mo35449a(System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public final void mo35451a(String str, Set<String> set) {
        SharedPreferences.Editor edit = this.f15802a.f15750a.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo35452a(String str, boolean z) {
        this.f15802a.mo35417a(str, z);
    }

    /* renamed from: a */
    public final Set<String> mo35448a(String str) {
        return this.f15802a.f15750a.getStringSet(str, (Set) null);
    }

    /* renamed from: b */
    public final String mo35453b(String str) {
        return this.f15802a.mo35419b(str);
    }

    /* renamed from: c */
    public final Boolean mo35456c(String str) {
        if (this.f15802a.mo35422d(str)) {
            return Boolean.valueOf(this.f15802a.mo35420b(str, true));
        }
        return null;
    }

    /* renamed from: a */
    public final long mo35447a() {
        return this.f15802a.mo35418b("last_ts", 0);
    }

    /* renamed from: a */
    public final void mo35449a(long j) {
        this.f15802a.mo35415a("last_ts", j);
    }

    /* renamed from: d */
    public final boolean mo35457d(String str) {
        return this.f15802a.mo35422d(str);
    }

    /* renamed from: e */
    public final boolean mo35458e(String str) {
        return this.f15802a.mo35423e(str);
    }

    /* renamed from: b */
    public final void mo35454b() {
        SharedPreferences.Editor edit = this.f15802a.f15750a.edit();
        edit.clear();
        edit.apply();
    }
}
