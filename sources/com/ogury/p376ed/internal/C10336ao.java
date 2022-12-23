package com.ogury.p376ed.internal;

import android.view.ViewParent;
import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C11286Ad;

/* renamed from: com.ogury.ed.internal.ao */
public final class C10336ao implements C10334am {

    /* renamed from: a */
    private final C10491ej f26200a;

    /* renamed from: b */
    private final C10337ap f26201b;

    /* renamed from: c */
    private final C10344aw f26202c;

    private C10336ao(C10491ej ejVar, C10337ap apVar, C10344aw awVar) {
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        C10765mq.m32773b(awVar, "expandCacheStore");
        this.f26200a = ejVar;
        this.f26201b = apVar;
        this.f26202c = awVar;
    }

    public /* synthetic */ C10336ao(C10491ej ejVar, C10337ap apVar) {
        this(ejVar, apVar, C10344aw.f26217a);
    }

    /* renamed from: a */
    public final void mo67001a(C10546g gVar, C10318aj ajVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        ViewParent parent = gVar.getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            gVar.mo67454a();
            ajVar.mo67039h();
            ajVar.mo67046o();
            gVar.setupDrag(false);
            if (this.f26200a.mo67291e()) {
                gVar.setLeft(0);
                gVar.setTop(0);
            }
            String a = C10344aw.m31301a(new C10343av(this.f26200a, frameLayout, gVar, ajVar));
            C10483eb f = ajVar.mo67037f();
            if (f != null) {
                this.f26201b.mo67081a(ajVar.mo67021a(), a, f, ajVar.mo67036e());
            }
        }
    }
}
