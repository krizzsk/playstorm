package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.inmobi.media.hf */
/* compiled from: KeyValueStore */
public final class C6216hf {

    /* renamed from: b */
    private static HashMap<String, C6216hf> f15748b = new HashMap<>();

    /* renamed from: c */
    private static final Object f15749c = new Object();

    /* renamed from: a */
    public SharedPreferences f15750a;

    private C6216hf(Context context, String str) {
        this.f15750a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public static String m18494a(String str) {
        return "com.im.keyValueStore.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static C6216hf m18493a(Context context, String str) {
        String a = m18494a(str);
        C6216hf hfVar = f15748b.get(a);
        if (hfVar != null) {
            return hfVar;
        }
        synchronized (f15749c) {
            C6216hf hfVar2 = f15748b.get(a);
            if (hfVar2 != null) {
                return hfVar2;
            }
            C6216hf hfVar3 = new C6216hf(context, a);
            f15748b.put(a, hfVar3);
            return hfVar3;
        }
    }

    /* renamed from: a */
    public final void mo35416a(String str, String str2) {
        SharedPreferences.Editor edit = this.f15750a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: b */
    public final String mo35419b(String str) {
        return this.f15750a.getString(str, (String) null);
    }

    /* renamed from: a */
    public final void mo35414a(String str, int i) {
        SharedPreferences.Editor edit = this.f15750a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: c */
    public final int mo35421c(String str) {
        return this.f15750a.getInt(str, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo35415a(String str, long j) {
        SharedPreferences.Editor edit = this.f15750a.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: b */
    public final long mo35418b(String str, long j) {
        return this.f15750a.getLong(str, j);
    }

    /* renamed from: a */
    public final void mo35417a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f15750a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo35420b(String str, boolean z) {
        return this.f15750a.getBoolean(str, z);
    }

    /* renamed from: d */
    public final boolean mo35422d(String str) {
        return this.f15750a.contains(str);
    }

    /* renamed from: e */
    public final boolean mo35423e(String str) {
        if (!mo35422d(str)) {
            return false;
        }
        SharedPreferences.Editor edit = this.f15750a.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }
}
