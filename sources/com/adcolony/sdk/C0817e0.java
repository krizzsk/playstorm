package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e0 */
class C0817e0 {

    /* renamed from: c */
    static C0817e0 f428c = new C0817e0(3, true);

    /* renamed from: d */
    static C0817e0 f429d = new C0817e0(2, false);

    /* renamed from: e */
    static C0817e0 f430e = new C0817e0(2, true);

    /* renamed from: f */
    static C0817e0 f431f = new C0817e0(1, false);

    /* renamed from: g */
    static C0817e0 f432g = new C0817e0(1, true);

    /* renamed from: h */
    static C0817e0 f433h = new C0817e0(0, false);

    /* renamed from: i */
    static C0817e0 f434i = new C0817e0(0, true);

    /* renamed from: a */
    private final int f435a;

    /* renamed from: b */
    private final boolean f436b;

    /* renamed from: com.adcolony.sdk.e0$a */
    static class C0818a {

        /* renamed from: a */
        StringBuilder f437a = new StringBuilder();

        C0818a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0818a mo10684a(String str) {
            this.f437a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0818a mo10683a(Object obj) {
            if (obj != null) {
                this.f437a.append(obj.toString());
            } else {
                this.f437a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0818a mo10682a(int i) {
            this.f437a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10685a(C0817e0 e0Var) {
            e0Var.m448a(this.f437a.toString());
        }
    }

    static {
        new C0817e0(3, false);
    }

    C0817e0(int i, boolean z) {
        this.f435a = i;
        this.f436b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m448a(String str) {
        C0714a.m136b().mo10846q().mo10761a(this.f435a, str, this.f436b);
    }
}
