package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.vungle.warren.model.Cookie;

/* renamed from: com.my.tracker.obfuscated.k0 */
public final class C10121k0 {

    /* renamed from: b */
    private static volatile C10121k0 f25231b;

    /* renamed from: a */
    private final SharedPreferences f25232a;

    private C10121k0(SharedPreferences sharedPreferences) {
        this.f25232a = sharedPreferences;
    }

    /* renamed from: a */
    public static C10121k0 m30104a(Context context) {
        C10121k0 k0Var = f25231b;
        if (k0Var == null) {
            synchronized (C10121k0.class) {
                k0Var = f25231b;
                if (k0Var == null) {
                    k0Var = new C10121k0(context.getSharedPreferences("mytracker_prefs", 0));
                    f25231b = k0Var;
                }
            }
        }
        return k0Var;
    }

    /* renamed from: a */
    public String mo66178a() {
        return mo66189c("appVersion");
    }

    /* renamed from: a */
    public void mo66179a(int i) {
        mo66181a("appSetIdScope", (long) i);
    }

    /* renamed from: a */
    public void mo66180a(long j) {
        mo66181a("installTimestamp", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66181a(String str, long j) {
        try {
            this.f25232a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            C10175u0.m30441a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66182a(String str, String str2) {
        try {
            this.f25232a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            C10175u0.m30441a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66183a(String str, boolean z) {
        try {
            this.f25232a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            C10175u0.m30441a("PrefsCache error: ", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo66184a(String str) {
        try {
            return this.f25232a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo66185b(String str) {
        try {
            return this.f25232a.getLong(str, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public String mo66186b() {
        return mo66189c("appId");
    }

    /* renamed from: b */
    public void mo66187b(long j) {
        mo66181a("lastUpdateTimestamp", j);
    }

    /* renamed from: c */
    public String mo66188c() {
        return mo66189c(Cookie.APP_SET_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo66189c(String str) {
        try {
            return this.f25232a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public void mo66190c(long j) {
        mo66181a("lastStopTimeStampSec", j);
    }

    /* renamed from: d */
    public String mo66191d() {
        return mo66189c("appVersionName");
    }

    /* renamed from: d */
    public void mo66192d(String str) {
        mo66182a("appVersion", str);
    }

    /* renamed from: e */
    public String mo66193e() {
        return mo66189c("appsHash");
    }

    /* renamed from: e */
    public void mo66194e(String str) {
        mo66182a("appId", str);
    }

    /* renamed from: f */
    public String mo66195f() {
        return mo66189c("attribution");
    }

    /* renamed from: f */
    public void mo66196f(String str) {
        mo66182a(Cookie.APP_SET_ID, str);
    }

    /* renamed from: g */
    public String mo66197g() {
        return mo66189c("firebaseAppInstanceId");
    }

    /* renamed from: g */
    public void mo66198g(String str) {
        mo66182a("appVersionName", str);
    }

    /* renamed from: h */
    public long mo66199h() {
        return mo66185b("installTimestamp");
    }

    /* renamed from: h */
    public void mo66200h(String str) {
        mo66182a("appsHash", str);
    }

    /* renamed from: i */
    public String mo66201i() {
        return mo66189c("instanceId");
    }

    /* renamed from: i */
    public void mo66202i(String str) {
        mo66182a("attribution", str);
    }

    /* renamed from: j */
    public long mo66203j() {
        return mo66185b("lastUpdateTimestamp");
    }

    /* renamed from: j */
    public void mo66204j(String str) {
        mo66182a("firebaseAppInstanceId", str);
    }

    /* renamed from: k */
    public String mo66205k() {
        return mo66189c("mac");
    }

    /* renamed from: k */
    public void mo66206k(String str) {
        mo66182a("instanceId", str);
    }

    /* renamed from: l */
    public String mo66207l() {
        return mo66189c("referrer");
    }

    /* renamed from: l */
    public void mo66208l(String str) {
        mo66182a("mac", str);
    }

    /* renamed from: m */
    public long mo66209m() {
        long b = mo66185b("lastStopTimeStampSec");
        mo66181a("lastStopTimeStampSec", 0);
        return b;
    }

    /* renamed from: m */
    public void mo66210m(String str) {
        mo66182a("referrer", str);
    }

    /* renamed from: n */
    public boolean mo66211n() {
        return mo66184a("apiReferrerSent");
    }

    /* renamed from: o */
    public boolean mo66212o() {
        return mo66184a("preinstallRead");
    }

    /* renamed from: p */
    public boolean mo66213p() {
        return mo66184a("referrerSent");
    }

    /* renamed from: q */
    public void mo66214q() {
        mo66183a("apiReferrerSent", true);
    }

    /* renamed from: r */
    public void mo66215r() {
        mo66183a("preinstallRead", true);
    }

    /* renamed from: s */
    public void mo66216s() {
        mo66183a("referrerSent", true);
    }
}
