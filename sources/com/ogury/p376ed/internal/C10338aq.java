package com.ogury.p376ed.internal;

import android.app.Activity;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aq */
public final class C10338aq implements C10334am {

    /* renamed from: a */
    private final FrameLayout f26203a;

    /* renamed from: b */
    private final Activity f26204b;

    /* renamed from: c */
    private final C10334am f26205c;

    public C10338aq(FrameLayout frameLayout, Activity activity, C10334am amVar) {
        C10765mq.m32773b(activity, "interstitialActivity");
        C10765mq.m32773b(amVar, "closeCommandInCollapsedMode");
        this.f26203a = frameLayout;
        this.f26204b = activity;
        this.f26205c = amVar;
    }

    /* renamed from: a */
    public final void mo67001a(C10546g gVar, C10318aj ajVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        if (ajVar.mo67034c()) {
            this.f26204b.finish();
            return;
        }
        gVar.mo67454a();
        gVar.setupDrag(false);
        gVar.mo67458c();
        FrameLayout frameLayout = this.f26203a;
        if (frameLayout != null) {
            frameLayout.addView(gVar);
        }
        ajVar.mo67038g();
        this.f26204b.finish();
        ajVar.mo67030b(this.f26205c);
        ajVar.mo67023a((C10334am) new C10305aa());
    }
}
