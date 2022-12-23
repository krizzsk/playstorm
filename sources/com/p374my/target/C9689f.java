package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f */
public final class C9689f extends C9615b<C9930r2> {

    /* renamed from: f */
    public final List<C9915q1> f23857f;

    /* renamed from: g */
    public final C10008v8 f23858g;

    /* renamed from: h */
    public Runnable f23859h;

    /* renamed from: com.my.target.f$b */
    public static class C9691b implements C9615b.C9616a<C9930r2> {
        public C9691b() {
        }

        /* renamed from: a */
        public C9670e mo63568a() {
            return C9670e.m27877a();
        }

        /* renamed from: b */
        public boolean mo63569b() {
            return true;
        }

        /* renamed from: c */
        public C9653d<C9930r2> mo63570c() {
            return C9729h.m28112a();
        }

        /* renamed from: d */
        public C9635c<C9930r2> mo63571d() {
            return C9706g.m28043a();
        }
    }

    /* renamed from: com.my.target.f$c */
    public interface C9692c extends C9615b.C9617b<C9930r2> {
    }

    public C9689f(C9596a aVar, C9822l3.C9823a aVar2, int i) {
        this((List<C9915q1>) null, aVar, aVar2, i);
    }

    public C9689f(List<C9915q1> list, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        super(new C9691b(), aVar, aVar2);
        this.f23857f = list;
        this.f23858g = C10008v8.m29579a(i * 1000);
    }

    /* renamed from: a */
    public static C9615b<C9930r2> m27967a(C9596a aVar, C9822l3.C9823a aVar2, int i) {
        return new C9689f(aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C9615b<C9930r2> m27968a(C9915q1 q1Var, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(q1Var);
        return new C9689f(arrayList, aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C9615b<C9930r2> m27969a(List<C9915q1> list, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        return new C9689f(list, aVar, aVar2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27970c(C9822l3 l3Var, Context context) {
        this.f23858g.mo65626b(this.f23859h);
        mo63566a(null, "ad loading timeout", l3Var, context);
    }

    /* renamed from: b */
    public C9615b<C9930r2> mo63567b(C9822l3 l3Var, Context context) {
        if (this.f23859h == null) {
            this.f23859h = new Runnable(l3Var, context) {
                public final /* synthetic */ C9822l3 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9689f.this.m27970c(this.f$1, this.f$2);
                }
            };
        }
        this.f23858g.mo65624a(this.f23859h);
        return super.mo63567b(l3Var, context);
    }

    /* renamed from: d */
    public C9930r2 mo63561a(C9822l3 l3Var, Context context) {
        C9916q2 a;
        if (this.f23857f != null) {
            a = mo63563a((C9930r2) mo63564a(this.f23857f, null, this.f23647a.mo63571d(), C9676e3.m27900d(), l3Var, context), context);
        } else {
            a = super.mo63561a(l3Var, context);
        }
        return (C9930r2) a;
    }
}
