package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.j */
/* compiled from: SpCache */
class C3368j {

    /* renamed from: a */
    private String f8052a;

    /* renamed from: b */
    private Context f8053b;

    C3368j(Context context, String str) {
        this.f8053b = context;
        this.f8052a = TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: b */
    private Context m10001b() {
        Context context = this.f8053b;
        return context == null ? C3578m.m11231a() : context;
    }

    /* renamed from: f */
    private SharedPreferences m10004f(String str) {
        try {
            if (m10001b() != null) {
                return m10001b().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: g */
    private String m10005g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.f8052a + "_cache_" + str;
    }

    /* renamed from: c */
    private String m10002c() {
        return this.f8052a + "_adslot";
    }

    /* renamed from: d */
    private String m10003d() {
        return this.f8052a + "_adslot_preload";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo19228a(String str) {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12977b(m10005g(str), "material_data", (String) null);
            }
            SharedPreferences f = m10004f(m10005g(str));
            if (f != null) {
                return f.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo19231b(String str) {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12963a(m10005g(str), "create_time", 0);
            }
            SharedPreferences f = m10004f(m10005g(str));
            if (f != null) {
                return f.getLong("create_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo19233c(String str) {
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12974a(m10005g(str), "has_played", true);
            }
            SharedPreferences f = m10004f(m10005g(str));
            if (f != null) {
                return f.getBoolean("has_played", true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19230a(String str, String str2) {
        try {
            if (C3953b.m12901c()) {
                C3966a.m12967a(m10005g(str), "has_played", (Boolean) false);
                C3966a.m12970a(m10005g(str), "create_time", Long.valueOf(System.currentTimeMillis()));
                C3966a.m12971a(m10005g(str), "material_data", str2);
                return;
            }
            SharedPreferences f = m10004f(m10005g(str));
            if (f != null) {
                f.edit().putBoolean("has_played", false).putLong("create_time", System.currentTimeMillis()).putString("material_data", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19234d(String str) {
        try {
            if (C3953b.m12901c()) {
                C3966a.m12965a(m10005g(str));
                return;
            }
            SharedPreferences f = m10004f(m10005g(str));
            if (f != null) {
                f.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AdSlot mo19235e(String str) {
        String str2;
        try {
            if (C3953b.m12901c()) {
                str2 = C3966a.m12977b(m10002c(), str, (String) null);
            } else {
                SharedPreferences f = m10004f(m10002c());
                str2 = f != null ? f.getString(str, (String) null) : null;
            }
            return AdSlot.getSlot(str2 != null ? new JSONObject(str2) : null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19229a(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C3953b.m12901c()) {
                        C3966a.m12971a(m10002c(), adSlot.getCodeId(), jSONObject);
                        return;
                    }
                    SharedPreferences f = m10004f(m10002c());
                    if (f != null) {
                        f.edit().putString(adSlot.getCodeId(), jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19232b(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C3953b.m12901c()) {
                        C3966a.m12971a(m10003d(), "preload_data", jSONObject);
                        return;
                    }
                    SharedPreferences f = m10004f(m10003d());
                    if (f != null) {
                        f.edit().putString("preload_data", jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdSlot mo19227a() {
        String str;
        try {
            if (C3953b.m12901c()) {
                str = C3966a.m12977b(m10003d(), "preload_data", (String) null);
                C3966a.m12965a(m10003d());
            } else {
                SharedPreferences f = m10004f(m10003d());
                if (f != null) {
                    String string = f.getString("preload_data", (String) null);
                    f.edit().clear().apply();
                    str = string;
                } else {
                    str = null;
                }
            }
            return AdSlot.getSlot(str != null ? new JSONObject(str) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
