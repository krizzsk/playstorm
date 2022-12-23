package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.TapjoyUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.gh */
public final class C11675gh {

    /* renamed from: d */
    private static final C11675gh f28397d;

    /* renamed from: e */
    private static C11675gh f28398e;

    /* renamed from: a */
    public String f28399a = null;

    /* renamed from: b */
    public String f28400b = null;

    /* renamed from: c */
    public boolean f28401c = false;

    /* renamed from: f */
    private Boolean f28402f = null;

    /* renamed from: g */
    private Boolean f28403g = null;

    /* renamed from: h */
    private Context f28404h;

    static {
        C11675gh ghVar = new C11675gh();
        f28397d = ghVar;
        f28398e = ghVar;
    }

    /* renamed from: a */
    public static C11675gh m33868a() {
        return f28398e;
    }

    /* renamed from: a */
    public final synchronized void mo72554a(Context context) {
        if (context != null) {
            if (this.f28404h == null) {
                this.f28404h = context;
            }
        }
        C11675gh ghVar = f28398e;
        if (ghVar.f28404h != null) {
            SharedPreferences sharedPreferences = ghVar.f28404h.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            if (ghVar.f28402f == null && sharedPreferences.contains("gdpr")) {
                ghVar.f28402f = Boolean.valueOf(sharedPreferences.getBoolean("gdpr", false));
            }
            if (ghVar.f28399a == null) {
                ghVar.f28399a = sharedPreferences.getString("cgdpr", "");
            }
            if (ghVar.f28403g == null && sharedPreferences.contains("below_consent_age")) {
                ghVar.f28403g = Boolean.valueOf(sharedPreferences.getBoolean("below_consent_age", false));
            }
            if (ghVar.f28400b == null) {
                ghVar.f28400b = sharedPreferences.getString("us_privacy", "");
            }
        }
        if (this.f28401c) {
            this.f28401c = false;
            C11675gh ghVar2 = f28398e;
            if (ghVar2.f28404h != null) {
                if (ghVar2.f28402f != null) {
                    ghVar2.m33869d();
                }
                if (ghVar2.f28399a != null) {
                    ghVar2.m33870e();
                }
                if (ghVar2.f28403g != null) {
                    ghVar2.m33871f();
                }
                if (ghVar2.f28400b != null) {
                    ghVar2.mo72559c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72556a(boolean z) {
        this.f28402f = Boolean.valueOf(z);
        if (!m33869d()) {
            this.f28401c = true;
        }
    }

    /* renamed from: a */
    public final void mo72555a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f28399a = str;
            if (!m33870e()) {
                this.f28401c = true;
            }
        }
    }

    /* renamed from: d */
    private boolean m33869d() {
        Context context = this.f28404h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("gdpr", this.f28402f.booleanValue());
        edit.apply();
        return true;
    }

    /* renamed from: e */
    private boolean m33870e() {
        Context context = this.f28404h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("cgdpr", this.f28399a);
        edit.apply();
        return true;
    }

    /* renamed from: b */
    public final Map<String, String> mo72557b() {
        String str;
        HashMap hashMap = new HashMap();
        Boolean bool = this.f28402f;
        String str2 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "0";
            }
            TapjoyUtil.safePut(hashMap, "gdpr", str, true);
        }
        if (!TextUtils.isEmpty(this.f28399a)) {
            TapjoyUtil.safePut(hashMap, "cgdpr", this.f28399a, true);
        }
        Boolean bool2 = this.f28403g;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "0";
            }
            TapjoyUtil.safePut(hashMap, "below_consent_age", str2, true);
        }
        if (!TextUtils.isEmpty(this.f28400b)) {
            TapjoyUtil.safePut(hashMap, "us_privacy", this.f28400b, true);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo72558b(boolean z) {
        this.f28403g = Boolean.valueOf(z);
        if (!m33871f()) {
            this.f28401c = true;
        }
    }

    /* renamed from: f */
    private boolean m33871f() {
        Context context = this.f28404h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("below_consent_age", this.f28403g.booleanValue());
        edit.apply();
        return true;
    }

    /* renamed from: c */
    public final boolean mo72559c() {
        Context context = this.f28404h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("us_privacy", this.f28400b);
        edit.apply();
        return true;
    }
}
