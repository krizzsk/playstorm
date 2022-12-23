package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9822l3;

/* renamed from: com.my.target.w */
public final class C10009w extends C9615b<C10016w2> {

    /* renamed from: com.my.target.w$b */
    public static class C10011b implements C9615b.C9616a<C10016w2> {
        public C10011b() {
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
        public C9653d<C10016w2> mo63570c() {
            return C10040y.m29727a();
        }

        /* renamed from: d */
        public C9635c<C10016w2> mo63571d() {
            return C10024x.m29666a();
        }
    }

    /* renamed from: com.my.target.w$c */
    public interface C10012c extends C9615b.C9617b<C10016w2> {
    }

    public C10009w(C9596a aVar, C9822l3.C9823a aVar2) {
        super(new C10011b(), aVar, aVar2);
    }

    /* renamed from: a */
    public static C9615b<C10016w2> m29584a(C9596a aVar, C9822l3.C9823a aVar2) {
        return new C10009w(aVar, aVar2);
    }

    /* renamed from: a */
    public String mo63565a(C9915q1 q1Var, C9676e3 e3Var, Context context) {
        if (this.f23648b.getCachePeriod() > 0) {
            C9672e0.m27882a("NativeAppwallAdFactory: check cached data");
            String str = null;
            C9740h8 a = C9740h8.m28156a(context);
            if (a != null) {
                str = a.mo64194a(this.f23648b.getSlotId(), this.f23648b.getCachePeriod());
            }
            if (str != null) {
                C9672e0.m27882a("NativeAppwallAdFactory: cached data loaded successfully");
                q1Var.mo65247a(true);
                return str;
            }
            C9672e0.m27882a("NativeAppwallAdFactory: no cached data");
        }
        return super.mo63565a(q1Var, e3Var, context);
    }
}
