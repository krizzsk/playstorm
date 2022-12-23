package com.ogury.p376ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ar */
public final class C10339ar implements C10334am {

    /* renamed from: a */
    private final C10316ai f26206a;

    /* renamed from: b */
    private final Activity f26207b;

    /* renamed from: c */
    private final C10334am f26208c;

    /* renamed from: d */
    private final boolean f26209d;

    /* renamed from: e */
    private final String f26210e;

    /* renamed from: f */
    private final C10369bp f26211f;

    private C10339ar(C10316ai aiVar, Activity activity, C10334am amVar, boolean z, String str, C10369bp bpVar) {
        C10765mq.m32773b(activity, "interstitialActivity");
        C10765mq.m32773b(amVar, "closeCommandInCollapsedMode");
        C10765mq.m32773b(str, "adUnitId");
        C10765mq.m32773b(bpVar, "lastPositionManager");
        this.f26206a = aiVar;
        this.f26207b = activity;
        this.f26208c = amVar;
        this.f26209d = z;
        this.f26210e = str;
        this.f26211f = bpVar;
    }

    public /* synthetic */ C10339ar(C10316ai aiVar, Activity activity, C10334am amVar, boolean z, String str) {
        this(aiVar, activity, amVar, z, str, C10369bp.f26259a);
    }

    /* renamed from: a */
    public final void mo67001a(C10546g gVar, C10318aj ajVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        gVar.mo67455a(C10369bp.m31379a(this.f26210e, gVar));
        gVar.mo67454a();
        gVar.setupDrag(this.f26209d);
        C10316ai aiVar = this.f26206a;
        if (aiVar != null) {
            aiVar.mo67018a(gVar);
        }
        ajVar.mo67038g();
        this.f26207b.finish();
        ajVar.mo67030b(this.f26208c);
        ajVar.mo67023a((C10334am) new C10341at());
    }
}
