package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.i */
public final class C9741i extends C9615b<C9945s2> {

    /* renamed from: f */
    public final List<C9915q1> f24018f;

    /* renamed from: g */
    public final C10008v8 f24019g;

    /* renamed from: h */
    public Runnable f24020h;

    /* renamed from: com.my.target.i$b */
    public static class C9743b implements C9615b.C9616a<C9945s2> {
        public C9743b() {
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
        public C9653d<C9945s2> mo63570c() {
            return C9788k.m28416a();
        }

        /* renamed from: d */
        public C9635c<C9945s2> mo63571d() {
            return C9765j.m28309a();
        }
    }

    /* renamed from: com.my.target.i$c */
    public interface C9744c extends C9615b.C9617b<C9945s2> {
    }

    public C9741i(C9596a aVar, C9822l3.C9823a aVar2, int i) {
        this((List<C9915q1>) null, aVar, aVar2, i);
    }

    public C9741i(List<C9915q1> list, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        super(new C9743b(), aVar, aVar2);
        this.f24018f = list;
        this.f24019g = C10008v8.m29579a(i * 1000);
    }

    /* renamed from: a */
    public static C9615b<C9945s2> m28170a(C9596a aVar, C9822l3.C9823a aVar2, int i) {
        return new C9741i(aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C9615b<C9945s2> m28171a(C9915q1 q1Var, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(q1Var);
        return new C9741i(arrayList, aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C9615b<C9945s2> m28172a(List<C9915q1> list, C9596a aVar, C9822l3.C9823a aVar2, int i) {
        return new C9741i(list, aVar, aVar2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28173c(C9822l3 l3Var, Context context) {
        this.f24019g.mo65626b(this.f24020h);
        mo63566a(null, "ad loading timeout", l3Var, context);
    }

    /* renamed from: b */
    public C9615b<C9945s2> mo63567b(C9822l3 l3Var, Context context) {
        if (this.f24020h == null) {
            this.f24020h = new Runnable(l3Var, context) {
                public final /* synthetic */ C9822l3 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9741i.this.m28173c(this.f$1, this.f$2);
                }
            };
        }
        this.f24019g.mo65624a(this.f24020h);
        return super.mo63567b(l3Var, context);
    }

    /* renamed from: d */
    public C9945s2 mo63561a(C9822l3 l3Var, Context context) {
        C9916q2 a;
        if (this.f24018f != null) {
            a = mo63563a((C9945s2) mo63564a(this.f24018f, null, this.f23647a.mo63571d(), C9676e3.m27900d(), l3Var, context), context);
        } else {
            a = super.mo63561a(l3Var, context);
        }
        return (C9945s2) a;
    }
}
