package com.bytedance.sdk.component.p104b.p105a;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.k */
/* compiled from: Request */
public abstract class C2816k {

    /* renamed from: a */
    public C2813i f6352a;

    /* renamed from: a */
    public abstract Object mo17581a();

    /* renamed from: b */
    public abstract C2807f mo17583b();

    /* renamed from: c */
    public abstract String mo17584c();

    /* renamed from: d */
    public abstract Map<String, List<String>> mo17585d();

    /* renamed from: e */
    public abstract C2781a mo17586e();

    /* renamed from: f */
    public C2819l mo17587f() {
        return null;
    }

    /* renamed from: a */
    public void mo17582a(C2813i iVar) {
        this.f6352a = iVar;
    }

    /* renamed from: g */
    public C2817a mo17588g() {
        return new C2817a(this);
    }

    /* renamed from: com.bytedance.sdk.component.b.a.k$a */
    /* compiled from: Request */
    public static class C2817a {

        /* renamed from: a */
        C2781a f6353a;

        /* renamed from: b */
        Map<String, List<String>> f6354b;

        /* renamed from: c */
        C2807f f6355c;

        /* renamed from: d */
        String f6356d;

        /* renamed from: e */
        Object f6357e;

        /* renamed from: f */
        C2819l f6358f;

        public C2817a() {
            this.f6354b = new HashMap();
        }

        /* renamed from: a */
        public C2817a mo17590a(C2781a aVar) {
            this.f6353a = aVar;
            return this;
        }

        C2817a(C2816k kVar) {
            this.f6355c = kVar.mo17583b();
            this.f6356d = kVar.mo17584c();
            this.f6354b = kVar.mo17585d();
            this.f6357e = kVar.mo17581a();
            this.f6358f = kVar.mo17587f();
            this.f6353a = kVar.mo17586e();
        }

        /* renamed from: a */
        public C2817a mo17593a(Object obj) {
            this.f6357e = obj;
            return this;
        }

        /* renamed from: a */
        public C2817a mo17594a(String str) {
            return mo17591a(C2807f.m7700c(str));
        }

        /* renamed from: a */
        public C2817a mo17591a(C2807f fVar) {
            this.f6355c = fVar;
            return this;
        }

        /* renamed from: a */
        public C2817a mo17595a(String str, String str2) {
            return mo17596b(str, str2);
        }

        /* renamed from: b */
        public C2817a mo17596b(String str, String str2) {
            if (!this.f6354b.containsKey(str)) {
                this.f6354b.put(str, new ArrayList());
            }
            this.f6354b.get(str).add(str2);
            return this;
        }

        /* renamed from: a */
        public C2817a mo17589a() {
            return m7746a(ShareTarget.METHOD_GET, (C2819l) null);
        }

        /* renamed from: a */
        private C2817a m7746a(String str, C2819l lVar) {
            this.f6356d = str;
            this.f6358f = lVar;
            return this;
        }

        /* renamed from: a */
        public C2817a mo17592a(C2819l lVar) {
            return m7746a(ShareTarget.METHOD_POST, lVar);
        }

        /* renamed from: b */
        public C2816k mo17597b() {
            return new C2816k() {
                public String toString() {
                    return "";
                }

                /* renamed from: a */
                public Object mo17581a() {
                    return C2817a.this.f6357e;
                }

                /* renamed from: b */
                public C2807f mo17583b() {
                    return C2817a.this.f6355c;
                }

                /* renamed from: c */
                public String mo17584c() {
                    return C2817a.this.f6356d;
                }

                /* renamed from: d */
                public Map mo17585d() {
                    return C2817a.this.f6354b;
                }

                /* renamed from: e */
                public C2781a mo17586e() {
                    return C2817a.this.f6353a;
                }

                /* renamed from: f */
                public C2819l mo17587f() {
                    return C2817a.this.f6358f;
                }
            };
        }
    }
}
