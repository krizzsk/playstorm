package com.ogury.p376ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.fs */
public final class C10536fs {

    /* renamed from: a */
    private final C10514fa f26650a;

    /* renamed from: b */
    private final C10510ez f26651b;

    /* renamed from: c */
    private final C10542fx f26652c;

    /* renamed from: d */
    private final C10430dc f26653d;

    /* renamed from: e */
    private final boolean f26654e;

    public C10536fs(C10514fa faVar, C10510ez ezVar, C10542fx fxVar, C10430dc dcVar, boolean z) {
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(fxVar, "coreWrapper");
        C10765mq.m32773b(dcVar, "extraAdConfiguration");
        this.f26650a = faVar;
        this.f26651b = ezVar;
        this.f26652c = fxVar;
        this.f26653d = dcVar;
        this.f26654e = z;
    }

    /* renamed from: a */
    public final C10535fr mo67449a() {
        return new C10535fr(this.f26650a.mo67357b(), "4.2.0", this.f26651b.mo67345n(), C10510ez.m31865f(), this.f26654e ? this.f26652c.mo67450a().getId() : null, this.f26652c.mo67452c(), C10430dc.m31546a("IS_CHILD_UNDER_COPPA"), C10430dc.m31546a("IS_UNDER_AGE_OF_GDPR_CONSENT"), C10430dc.m31550b("AD_CONTENT_THRESHOLD"), this.f26652c.mo67453d(), (byte) 0);
    }
}
