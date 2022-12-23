package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.utils.u */
/* compiled from: SPUtils */
public class C2985u {

    /* renamed from: a */
    private static Map<String, C2985u> f6753a = new HashMap();

    /* renamed from: b */
    private SharedPreferences f6754b;

    /* renamed from: a */
    public static C2985u m8442a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        C2985u uVar = f6753a.get(str);
        if (uVar != null) {
            return uVar;
        }
        C2985u uVar2 = new C2985u(str, context);
        f6753a.put(str, uVar2);
        return uVar2;
    }

    private C2985u(String str, Context context) {
        if (context != null) {
            this.f6754b = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public void mo17903a(String str, String str2) {
        try {
            this.f6754b.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String mo17899a(String str) {
        try {
            return mo17910b(str, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo17910b(String str, String str2) {
        try {
            return this.f6754b.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public void mo17901a(String str, int i) {
        try {
            this.f6754b.edit().putInt(str, i).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public int mo17907b(String str) {
        return mo17908b(str, -1);
    }

    /* renamed from: b */
    public int mo17908b(String str, int i) {
        try {
            return this.f6754b.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo17902a(String str, long j) {
        try {
            this.f6754b.edit().putLong(str, j).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long mo17909b(String str, long j) {
        try {
            return this.f6754b.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: a */
    public void mo17900a(String str, float f) {
        try {
            this.f6754b.edit().putFloat(str, f).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public float mo17906b(String str, float f) {
        try {
            return this.f6754b.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    /* renamed from: a */
    public void mo17905a(String str, boolean z) {
        try {
            this.f6754b.edit().putBoolean(str, z).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo17912b(String str, boolean z) {
        try {
            return this.f6754b.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public void mo17904a(String str, Set<String> set) {
        try {
            this.f6754b.edit().putStringSet(str, set).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public Set<String> mo17911b(String str, Set<String> set) {
        try {
            return this.f6754b.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    /* renamed from: c */
    public void mo17913c(String str) {
        try {
            this.f6754b.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
