package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;

/* renamed from: com.my.target.o */
public final class C9870o extends C9615b<C9963t2> {

    /* renamed from: f */
    public final C9963t2 f24408f;

    /* renamed from: com.my.target.o$b */
    public static class C9872b implements C9615b.C9616a<C9963t2> {
        public C9872b() {
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
        public C9653d<C9963t2> mo63570c() {
            return C9913q.m29009a();
        }

        /* renamed from: d */
        public C9635c<C9963t2> mo63571d() {
            return C9890p.m28936a();
        }
    }

    /* renamed from: com.my.target.o$c */
    public interface C9873c extends C9615b.C9617b<C9963t2> {
    }

    public C9870o(C9596a aVar, C9822l3.C9823a aVar2, C9963t2 t2Var) {
        super(new C9872b(), aVar, aVar2);
        this.f24408f = t2Var;
    }

    /* renamed from: a */
    public static C9615b<C9963t2> m28854a(C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9870o(aVar, aVar2, (C9963t2) null);
    }

    /* renamed from: a */
    public static C9615b<C9963t2> m28855a(C9963t2 t2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9870o(aVar, aVar2, t2Var);
    }

    /* renamed from: d */
    public C9963t2 mo63561a(C9822l3 l3Var, Context context) {
        C9963t2 t2Var = this.f24408f;
        return (C9963t2) (t2Var != null ? mo63563a(t2Var, context) : super.mo63561a(l3Var, context));
    }
}
