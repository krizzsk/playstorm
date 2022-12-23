package com.ogury.p376ed.internal;

import android.app.Activity;
import android.content.Context;
import com.ogury.p376ed.internal.C10396cg;

/* renamed from: com.ogury.ed.internal.bx */
public final class C10385bx {

    /* renamed from: a */
    private final C10393cd f26308a;

    /* renamed from: b */
    private final C10403ck f26309b;

    /* renamed from: c */
    private final C10404cl f26310c;

    /* renamed from: d */
    private final C10531fn f26311d;

    public C10385bx(C10393cd cdVar, C10403ck ckVar, C10404cl clVar, C10531fn fnVar) {
        C10765mq.m32773b(cdVar, "publisherActivityFilter");
        C10765mq.m32773b(ckVar, "publisherFragmentFilter");
        C10765mq.m32773b(clVar, "supportLibraryChecker");
        C10765mq.m32773b(fnVar, "profigGateway");
        this.f26308a = cdVar;
        this.f26309b = ckVar;
        this.f26310c = clVar;
        this.f26311d = fnVar;
    }

    public /* synthetic */ C10385bx(C10393cd cdVar, C10403ck ckVar) {
        this(cdVar, ckVar, C10404cl.f26341a, C10531fn.f26635a);
    }

    /* renamed from: a */
    public final C10384bw mo67136a(Activity activity, C10546g gVar, C10318aj ajVar) {
        C10524fh fhVar;
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        C10378bu buVar = new C10378bu(gVar, ajVar);
        C10530fm a = C10531fn.m32005a((Context) activity);
        C10526fj fjVar = null;
        if (a == null) {
            fhVar = null;
        } else {
            fhVar = a.mo67439n();
        }
        if (fhVar == null) {
            fhVar = new C10524fh();
        }
        if (a != null) {
            fjVar = a.mo67440o();
        }
        if (fjVar == null) {
            fjVar = new C10526fj();
        }
        new C10368bo();
        C10371bq a2 = C10368bo.m31377a(activity, this.f26308a, fhVar);
        C10396cg.C10397a aVar = C10396cg.f26325a;
        C10396cg a3 = C10396cg.C10397a.m31466a(activity, fjVar, this.f26309b);
        if (this.f26309b.mo67159c() || !fjVar.mo67389a()) {
            return new C10372br(activity, buVar, a2);
        }
        if (C10404cl.m31488a()) {
            return new C10400cj(activity, buVar, new C10399ci(a3));
        }
        C10548ga gaVar = C10548ga.f26676a;
        C10548ga.m32072a("Fragment filter defined for thumbnail but no fragment dependency found. Only AndroidX is supported");
        return new C10372br(activity, buVar, a2);
    }
}
