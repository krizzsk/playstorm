package com.p374my.target;

import android.content.Context;
import android.os.Looper;
import com.p374my.target.C9822l3;
import com.p374my.target.C9916q2;
import java.util.List;

/* renamed from: com.my.target.b */
public abstract class C9615b<T extends C9916q2> {

    /* renamed from: a */
    public final C9616a<T> f23647a;

    /* renamed from: b */
    public final C9596a f23648b;

    /* renamed from: c */
    public final C9822l3.C9823a f23649c;

    /* renamed from: d */
    public String f23650d;

    /* renamed from: e */
    public C9617b<T> f23651e;

    /* renamed from: com.my.target.b$a */
    public interface C9616a<T extends C9916q2> {
        /* renamed from: a */
        C9670e mo63568a();

        /* renamed from: b */
        boolean mo63569b();

        /* renamed from: c */
        C9653d<T> mo63570c();

        /* renamed from: d */
        C9635c<T> mo63571d();
    }

    /* renamed from: com.my.target.b$b */
    public interface C9617b<T extends C9916q2> {
        /* renamed from: a */
        void mo63321a(T t, String str);
    }

    public C9615b(C9616a<T> aVar, C9596a aVar2, C9822l3.C9823a aVar3) {
        this.f23647a = aVar;
        this.f23648b = aVar2;
        this.f23649c = aVar3;
    }

    /* renamed from: a */
    public static void m27628a(C9822l3 l3Var, int i, long j) {
        l3Var.mo64674a(i, System.currentTimeMillis() - j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27629a(C9916q2 q2Var, String str) {
        C9617b<T> bVar = this.f23651e;
        if (bVar != null) {
            bVar.mo63321a(q2Var, str);
            this.f23651e = null;
        }
    }

    /* renamed from: b */
    public static long m27630b(C9822l3 l3Var, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        l3Var.mo64677b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27631c(C9822l3 l3Var, Context context) {
        mo63566a(mo63561a(l3Var, context), this.f23650d, l3Var, context);
    }

    /* renamed from: a */
    public final C9615b<T> mo63560a(C9617b<T> bVar) {
        this.f23651e = bVar;
        return this;
    }

    /* renamed from: a */
    public T mo63561a(C9822l3 l3Var, Context context) {
        C9822l3 l3Var2;
        Context context2;
        C9822l3 l3Var3 = l3Var;
        Context context3 = context;
        C9851m8.m28751a(context);
        C9670e a = this.f23647a.mo63568a();
        C9754i5.m28266c().mo64273a(l3Var3);
        C9915q1 a2 = a.mo63916a(this.f23648b, context3);
        C9676e3 d = C9676e3.m27900d();
        l3Var.mo64676b();
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = mo63565a(a2, d, context3);
        long b = m27630b(l3Var3, 1, currentTimeMillis);
        if (a3 == null) {
            return null;
        }
        C9635c<T> d2 = this.f23647a.mo63571d();
        T a4 = d2.mo63651a(a3, a2, null, this.f23648b, this.f23649c, l3Var, context);
        m27630b(l3Var3, 2, b);
        if (this.f23647a.mo63569b()) {
            context2 = context3;
            l3Var2 = l3Var3;
            a4 = mo63564a((List<C9915q1>) a2.mo65288w(), a4, d2, d, l3Var, context);
        } else {
            context2 = context3;
            l3Var2 = l3Var3;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        T a5 = mo63563a(a4, context2);
        m27630b(l3Var2, 3, currentTimeMillis2);
        return a5;
    }

    /* renamed from: a */
    public T mo63562a(C9915q1 q1Var, T t, C9635c<T> cVar, C9676e3 e3Var, C9822l3 l3Var, Context context) {
        C9915q1 q1Var2;
        Context context2;
        int i;
        T t2;
        C9915q1 q1Var3 = q1Var;
        C9822l3 l3Var2 = l3Var;
        Context context3 = context;
        long currentTimeMillis = System.currentTimeMillis();
        e3Var.mo64164b(q1Var3.f24532b, (String) null, context3);
        m27628a(l3Var2, 1, currentTimeMillis);
        if (!e3Var.mo64165c()) {
            return t;
        }
        C10039x8.m29720c((List<C9626b3>) q1Var3.mo65239a("serviceRequested"), context3);
        int i2 = 0;
        int a = t != null ? t.mo65292a() : 0;
        String str = (String) e3Var.mo64163b();
        if (str != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            T a2 = cVar.mo63651a(str, q1Var, t, this.f23648b, this.f23649c, l3Var, context);
            m27628a(l3Var2, 2, currentTimeMillis2);
            i = a;
            context2 = context3;
            q1Var2 = q1Var3;
            t2 = mo63564a((List<C9915q1>) q1Var.mo65288w(), a2, cVar, e3Var, l3Var, context);
        } else {
            i = a;
            context2 = context3;
            q1Var2 = q1Var3;
            t2 = t;
        }
        if (t2 != null) {
            i2 = t2.mo65292a();
        }
        if (i != i2) {
            return t2;
        }
        C10039x8.m29720c((List<C9626b3>) q1Var2.mo65239a("serviceAnswerEmpty"), context2);
        C9915q1 q = q1Var.mo65282q();
        return q != null ? mo63562a(q, t2, cVar, e3Var, l3Var, context) : t2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r2.f23647a.mo63570c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo63563a(T r3, android.content.Context r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0010
            com.my.target.b$a<T> r0 = r2.f23647a
            com.my.target.d r0 = r0.mo63570c()
            if (r0 == 0) goto L_0x0010
            com.my.target.a r1 = r2.f23648b
            com.my.target.q2 r3 = r0.mo63851a(r3, r1, r4)
        L_0x0010:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9615b.mo63563a(com.my.target.q2, android.content.Context):com.my.target.q2");
    }

    /* renamed from: a */
    public T mo63564a(List<C9915q1> list, T t, C9635c<T> cVar, C9676e3 e3Var, C9822l3 l3Var, Context context) {
        if (list.size() <= 0) {
            return t;
        }
        T t2 = t;
        for (C9915q1 a : list) {
            t2 = mo63562a(a, t2, cVar, e3Var, l3Var, context);
        }
        return t2;
    }

    /* renamed from: a */
    public String mo63565a(C9915q1 q1Var, C9676e3 e3Var, Context context) {
        e3Var.mo64164b(q1Var.f24532b, q1Var.f24531a, context);
        if (e3Var.mo64165c()) {
            return (String) e3Var.mo64163b();
        }
        this.f23650d = e3Var.mo64162a();
        return null;
    }

    /* renamed from: a */
    public void mo63566a(T t, String str, C9822l3 l3Var, Context context) {
        l3Var.mo64678b(context);
        if (this.f23651e != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f23651e.mo63321a(t, str);
                this.f23651e = null;
                return;
            }
            C9693f0.m27983c(new Runnable(t, str) {
                public final /* synthetic */ C9916q2 f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C9615b.this.m27629a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public C9615b<T> mo63567b(C9822l3 l3Var, Context context) {
        C9693f0.m27979a(new Runnable(l3Var, context.getApplicationContext()) {
            public final /* synthetic */ C9822l3 f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9615b.this.m27631c(this.f$1, this.f$2);
            }
        });
        return this;
    }
}
