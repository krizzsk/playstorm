package com.ogury.p376ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.bu */
public final class C10378bu {

    /* renamed from: a */
    private final C10546g f26287a;

    /* renamed from: b */
    private final C10318aj f26288b;

    /* renamed from: c */
    private final C10831s f26289c;

    private C10378bu(C10546g gVar, C10318aj ajVar, C10831s sVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        C10765mq.m32773b(sVar, "oguryAds");
        this.f26287a = gVar;
        this.f26288b = ajVar;
        this.f26289c = sVar;
    }

    public /* synthetic */ C10378bu(C10546g gVar, C10318aj ajVar) {
        this(gVar, ajVar, C10831s.f27048a);
    }

    /* renamed from: a */
    public final void mo67120a(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        if (C10831s.m32879c() && this.f26287a.getParent() == null && this.f26288b.mo67040i()) {
            C10831s.m32875a(true);
            C10546g gVar = this.f26287a;
            activity.addContentView(gVar, gVar.getLayoutParams());
            m31411b(activity);
        }
    }

    /* renamed from: b */
    private final void m31411b(Activity activity) {
        if (activity.hasWindowFocus()) {
            this.f26288b.mo67047p();
        } else {
            this.f26288b.mo67046o();
        }
    }

    /* renamed from: a */
    public final void mo67119a() {
        if (this.f26287a.getParent() != null && !this.f26288b.mo67052u()) {
            this.f26288b.mo67046o();
            this.f26287a.mo67454a();
        }
    }
}
