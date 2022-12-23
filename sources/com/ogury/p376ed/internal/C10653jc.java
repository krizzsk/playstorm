package com.ogury.p376ed.internal;

import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.jc */
public final class C10653jc implements C10656je {

    /* renamed from: a */
    private final C10510ez f26890a;

    /* renamed from: b */
    private final C10656je f26891b;

    /* renamed from: c */
    private final C10483eb f26892c;

    public C10653jc(C10510ez ezVar, C10656je jeVar, C10483eb ebVar) {
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(jeVar, "orientationChangedCommand");
        C10765mq.m32773b(ebVar, "ad");
        this.f26890a = ezVar;
        this.f26891b = jeVar;
        this.f26892c = ebVar;
    }

    /* renamed from: a */
    public final void mo67681a(C10580hb hbVar) {
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        C10660jh a = hbVar.mo67518a();
        int a2 = C10556gi.m32086a(a.getWidth());
        int a3 = C10556gi.m32086a(a.getHeight());
        int a4 = C10556gi.m32085a(a.getX());
        int a5 = C10556gi.m32085a(a.getY());
        this.f26891b.mo67681a(hbVar);
        hbVar.mo67523a(C10494el.m31815a(this.f26892c) ? "interstitial" : TJAdUnitConstants.String.INLINE);
        hbVar.mo67526a(false);
        hbVar.mo67519a(this.f26890a.mo67344m());
        hbVar.mo67528b();
        hbVar.mo67521a(a2, a3, a4, a5);
        hbVar.mo67530b(a2, a3, a4, a5);
        hbVar.mo67535c(a2, a3, a4, a5);
        hbVar.mo67534c(a2, a3);
        hbVar.mo67531b("default");
    }
}
