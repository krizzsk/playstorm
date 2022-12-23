package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.af */
public final class C10312af implements C10830r {

    /* renamed from: a */
    public static final C10313a f26123a = new C10313a((byte) 0);

    /* renamed from: b */
    private final C10469dv f26124b;

    /* renamed from: c */
    private final C10586hg f26125c;

    /* renamed from: d */
    private final C10445di f26126d;

    /* renamed from: e */
    private boolean f26127e;

    /* renamed from: f */
    private C10483eb f26128f;

    /* renamed from: g */
    private C10829q f26129g;

    private C10312af(C10469dv dvVar, C10586hg hgVar, C10445di diVar) {
        C10765mq.m32773b(dvVar, "presageApi");
        C10765mq.m32773b(hgVar, "mraidEventBus");
        C10765mq.m32773b(diVar, "measurementsEventLogger");
        this.f26124b = dvVar;
        this.f26125c = hgVar;
        this.f26126d = diVar;
    }

    /* renamed from: a */
    public final void mo67011a(C10483eb ebVar) {
        this.f26128f = ebVar;
    }

    /* renamed from: a */
    public final void mo67012a(C10829q qVar) {
        if (qVar != null) {
            qVar.mo67006a(this);
        }
        this.f26129g = qVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10312af(Context context) {
        this(C10470dw.m31662a(context), C10586hg.f26712a, C10445di.f26411a);
        C10765mq.m32773b(context, "context");
        C10470dw dwVar = C10470dw.f26453a;
    }

    /* renamed from: com.ogury.ed.internal.af$a */
    public static final class C10313a {
        public /* synthetic */ C10313a(byte b) {
            this();
        }

        private C10313a() {
        }
    }

    /* renamed from: b */
    private final void m31164b(C10483eb ebVar) {
        if (ebVar.mo67231e().length() > 0) {
            this.f26124b.mo67207a(ebVar.mo67231e());
        } else {
            C10445di.m31608a((C10444dh) new C10455dl("shown", ebVar));
        }
        C10586hg.m32203a(new C10585hf(ebVar.mo67222b(), "adDisplayed"));
        if (ebVar.mo67266y().mo67306a() && ebVar.mo67266y().mo67307b() == C10497eo.IMPRESSION_SOURCE_SDK) {
            C10586hg.m32203a(new C10585hf(ebVar.mo67222b(), "adImpression"));
        }
    }

    /* renamed from: a */
    public final void mo67010a(float f) {
        C10483eb ebVar = this.f26128f;
        if (ebVar != null && !this.f26127e && f >= 50.0f) {
            this.f26127e = true;
            C10765mq.m32765a("new impression: ", (Object) ebVar.mo67237g());
            C10829q qVar = this.f26129g;
            if (qVar != null) {
                qVar.mo67006a((C10830r) null);
            }
            m31164b(ebVar);
        }
    }
}
