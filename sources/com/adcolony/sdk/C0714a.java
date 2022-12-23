package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import com.adcolony.sdk.C0817e0;

/* renamed from: com.adcolony.sdk.a */
class C0714a {

    /* renamed from: a */
    private static Context f176a = null;

    /* renamed from: b */
    private static C0857k f177b = null;

    /* renamed from: c */
    static boolean f178c = false;

    /* renamed from: d */
    static boolean f179d = false;

    /* renamed from: e */
    static boolean f180e = false;

    /* renamed from: a */
    static void m133a(AdColonyAppOptions adColonyAppOptions) {
        f180e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    /* renamed from: b */
    static C0857k m136b() {
        if (!m139d()) {
            Context a = m129a();
            if (a == null) {
                return new C0857k();
            }
            f177b = new C0857k();
            f177b.mo10819a(new AdColonyAppOptions().mo10319a(C0764c0.m336h(C0764c0.m331c(a.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), "appId")), false);
        }
        return f177b;
    }

    /* renamed from: c */
    static boolean m138c() {
        return f176a != null;
    }

    /* renamed from: d */
    static boolean m139d() {
        return f177b != null;
    }

    /* renamed from: e */
    static boolean m140e() {
        return f178c;
    }

    /* renamed from: f */
    static void m141f() {
        m136b().mo10847r().mo10794j();
    }

    /* renamed from: a */
    static void m132a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m131a((!z || !(context instanceof Activity)) ? context : ((Activity) context).getApplication());
        f179d = true;
        if (f177b == null) {
            f177b = new C0857k();
            adColonyAppOptions.mo10322b(context);
            f177b.mo10819a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo10322b(context);
            f177b.mo10818a(adColonyAppOptions);
        }
        m133a(adColonyAppOptions);
        C0934q n = f177b.mo10843n();
        n.mo10966a(context);
        n.mo10973b(context);
        new C0817e0.C0818a().mo10684a("Configuring AdColony").mo10685a(C0817e0.f429d);
        f177b.mo10828c(false);
        f177b.mo10853x().mo11058g(false);
        f177b.mo10831d(true);
        f177b.mo10853x().mo11051c(false);
        f177b.mo10853x().mo11053d(true);
    }

    /* renamed from: b */
    static void m137b(String str, C0856j0 j0Var) {
        m136b().mo10847r().mo10784b(str, j0Var);
    }

    /* renamed from: a */
    static void m131a(Context context) {
        f176a = context;
    }

    /* renamed from: a */
    static Context m129a() {
        return f176a;
    }

    /* renamed from: a */
    static void m135a(String str, C0856j0 j0Var) {
        m136b().mo10847r().mo10783a(str, j0Var);
    }

    /* renamed from: a */
    static C0856j0 m130a(String str, C0856j0 j0Var, boolean z) {
        m136b().mo10847r().mo10783a(str, j0Var);
        return j0Var;
    }

    /* renamed from: a */
    static void m134a(String str, C0823f1 f1Var) {
        if (f1Var == null) {
            f1Var = C0764c0.m322b();
        }
        C0764c0.m319a(f1Var, "m_type", str);
        m136b().mo10847r().mo10788c(f1Var);
    }
}
