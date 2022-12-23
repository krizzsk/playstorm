package com.ogury.p376ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.eh */
public final class C10489eh implements C10488eg {

    /* renamed from: a */
    private final C10514fa f26515a;

    /* renamed from: b */
    private final C10510ez f26516b;

    /* renamed from: c */
    private final C10500er f26517c;

    /* renamed from: d */
    private final C10430dc f26518d;

    /* renamed from: e */
    private final C10542fx f26519e;

    /* renamed from: f */
    private final C10530fm f26520f;

    /* renamed from: h */
    public final String mo67279h() {
        return "4.2.0";
    }

    public C10489eh(C10514fa faVar, C10510ez ezVar, C10531fn fnVar, C10500er erVar, C10430dc dcVar, C10542fx fxVar) {
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(erVar, "omidSdkChecker");
        C10765mq.m32773b(dcVar, "extraAdConfiguration");
        C10765mq.m32773b(fxVar, "coreWrapper");
        this.f26515a = faVar;
        this.f26516b = ezVar;
        this.f26517c = erVar;
        this.f26518d = dcVar;
        this.f26519e = fxVar;
        C10530fm a = C10531fn.m32005a(faVar.mo67355a());
        if (a != null) {
            this.f26520f = a;
            return;
        }
        throw new IllegalStateException("Profig must not be null");
    }

    /* renamed from: f */
    public final int mo67277f() {
        return this.f26516b.mo67342k();
    }

    /* renamed from: g */
    public final int mo67278g() {
        return this.f26516b.mo67343l();
    }

    /* renamed from: a */
    public final String mo67272a() {
        return this.f26516b.mo67341j();
    }

    /* renamed from: b */
    public final String mo67273b() {
        return this.f26516b.mo67338g();
    }

    /* renamed from: c */
    public final String mo67274c() {
        return this.f26515a.mo67359d();
    }

    /* renamed from: d */
    public final String mo67275d() {
        return this.f26515a.mo67357b();
    }

    /* renamed from: e */
    public final boolean mo67276e() {
        return this.f26520f.mo67420c() && C10500er.m31827a();
    }

    /* renamed from: i */
    public final float mo67280i() {
        return this.f26516b.mo67346o();
    }

    /* renamed from: j */
    public final Boolean mo67281j() {
        return C10430dc.m31546a("IS_CHILD_UNDER_COPPA");
    }

    /* renamed from: k */
    public final Boolean mo67282k() {
        return C10430dc.m31546a("IS_UNDER_AGE_OF_GDPR_CONSENT");
    }

    /* renamed from: l */
    public final String mo67283l() {
        return C10430dc.m31550b("AD_CONTENT_THRESHOLD");
    }

    /* renamed from: m */
    public final String mo67284m() {
        return this.f26519e.mo67452c();
    }

    /* renamed from: n */
    public final String mo67285n() {
        return this.f26515a.mo67364i();
    }
}
