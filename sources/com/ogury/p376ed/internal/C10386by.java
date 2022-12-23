package com.ogury.p376ed.internal;

import android.app.Application;
import com.ogury.p376ed.internal.C10318aj;

/* renamed from: com.ogury.ed.internal.by */
public final class C10386by {

    /* renamed from: a */
    private final C10337ap f26312a;

    public C10386by(C10337ap apVar) {
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        this.f26312a = apVar;
    }

    /* renamed from: a */
    public final C10318aj mo67137a(Application application, C10546g gVar) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(gVar, "adLayout");
        return new C10318aj.C10319a(application, gVar, new C10336ao(C10491ej.OVERLAY_THUMBNAIL, this.f26312a), false).mo67073p();
    }
}
