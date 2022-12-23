package com.ogury.p376ed.internal;

import android.app.Application;
import com.ogury.p376ed.internal.C10318aj;

/* renamed from: com.ogury.ed.internal.z */
public final class C10844z {

    /* renamed from: a */
    private final C10337ap f27077a;

    public C10844z(C10337ap apVar) {
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        this.f27077a = apVar;
    }

    /* renamed from: a */
    public final C10318aj mo67900a(Application application, C10546g gVar) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(gVar, "adLayout");
        C10309ae aeVar = new C10309ae(gVar);
        C10318aj.C10319a aVar = new C10318aj.C10319a(application, gVar, new C10336ao(C10491ej.SMALL_BANNER, this.f27077a), false);
        aVar.mo67058a(aeVar);
        return aVar.mo67073p();
    }
}
