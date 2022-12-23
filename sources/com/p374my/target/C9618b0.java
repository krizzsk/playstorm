package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;

/* renamed from: com.my.target.b0 */
public final class C9618b0 extends C9615b<C10029x2> {

    /* renamed from: f */
    public final C10029x2 f23652f;

    /* renamed from: com.my.target.b0$b */
    public interface C9620b extends C9615b.C9617b<C10029x2> {
    }

    /* renamed from: com.my.target.b0$c */
    public static class C9621c implements C9615b.C9616a<C10029x2> {
        public C9621c() {
        }

        /* renamed from: a */
        public C9670e mo63568a() {
            return C9670e.m27877a();
        }

        /* renamed from: b */
        public boolean mo63569b() {
            return false;
        }

        /* renamed from: c */
        public C9653d<C10029x2> mo63570c() {
            return C9654d0.m27808a();
        }

        /* renamed from: d */
        public C9635c<C10029x2> mo63571d() {
            return C9636c0.m27716a();
        }
    }

    public C9618b0(C9596a aVar, C9822l3.C9823a aVar2, C10029x2 x2Var) {
        super(new C9621c(), aVar, aVar2);
        this.f23652f = x2Var;
    }

    /* renamed from: a */
    public static C9615b<C10029x2> m27645a(C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9618b0(aVar, aVar2, (C10029x2) null);
    }

    /* renamed from: a */
    public static C9615b<C10029x2> m27646a(C10029x2 x2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9618b0(aVar, aVar2, x2Var);
    }

    /* renamed from: d */
    public C10029x2 mo63561a(C9822l3 l3Var, Context context) {
        C10029x2 x2Var = this.f23652f;
        return (C10029x2) (x2Var != null ? mo63563a(x2Var, context) : super.mo63561a(l3Var, context));
    }
}
