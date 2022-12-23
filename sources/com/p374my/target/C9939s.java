package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;

/* renamed from: com.my.target.s */
public final class C9939s extends C9615b<C9997v2> {

    /* renamed from: f */
    public final C9997v2 f24616f;

    /* renamed from: g */
    public final String f24617g;

    /* renamed from: com.my.target.s$a */
    public static class C9940a implements C9615b.C9616a<C9997v2> {
        /* renamed from: a */
        public C9670e mo63568a() {
            return C9994v.m29519b();
        }

        /* renamed from: b */
        public boolean mo63569b() {
            return false;
        }

        /* renamed from: c */
        public C9653d<C9997v2> mo63570c() {
            return C9979u.m29398a();
        }

        /* renamed from: d */
        public C9635c<C9997v2> mo63571d() {
            return C9958t.m29276a();
        }
    }

    /* renamed from: com.my.target.s$b */
    public interface C9941b extends C9615b.C9617b<C9997v2> {
    }

    public C9939s(C9596a aVar, C9822l3.C9823a aVar2, C9997v2 v2Var, String str) {
        super(new C9940a(), aVar, aVar2);
        this.f24616f = v2Var;
        this.f24617g = str;
    }

    /* renamed from: a */
    public static C9615b<C9997v2> m29175a(C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9939s(aVar, aVar2, (C9997v2) null, (String) null);
    }

    /* renamed from: a */
    public static C9615b<C9997v2> m29176a(C9997v2 v2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9939s(aVar, aVar2, v2Var, (String) null);
    }

    /* renamed from: a */
    public static C9615b<C9997v2> m29177a(String str, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9939s(aVar, aVar2, (C9997v2) null, str);
    }

    /* renamed from: d */
    public C9997v2 mo63561a(C9822l3 l3Var, Context context) {
        C9916q2 a;
        if (this.f24617g != null) {
            a = mo63563a(this.f23647a.mo63571d().mo63651a(this.f24617g, C9915q1.m29023b(""), this.f24616f, this.f23648b, this.f23649c, l3Var, context), context);
        } else {
            C9997v2 v2Var = this.f24616f;
            a = v2Var != null ? mo63563a(v2Var, context) : super.mo63561a(l3Var, context);
        }
        return (C9997v2) a;
    }
}
