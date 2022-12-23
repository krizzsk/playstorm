package com.ironsource.mediationsdk.model;

/* renamed from: com.ironsource.mediationsdk.model.k */
public final class C6701k {

    /* renamed from: a */
    public boolean f17518a;

    /* renamed from: b */
    public boolean f17519b;

    /* renamed from: c */
    public boolean f17520c;

    /* renamed from: d */
    public C6703l f17521d;

    /* renamed from: e */
    public int f17522e;

    /* renamed from: f */
    public int f17523f;

    /* renamed from: com.ironsource.mediationsdk.model.k$a */
    public static class C6702a {

        /* renamed from: a */
        public boolean f17524a = true;

        /* renamed from: b */
        private boolean f17525b = false;

        /* renamed from: c */
        private boolean f17526c = false;

        /* renamed from: d */
        private C6703l f17527d = null;

        /* renamed from: e */
        private int f17528e = 0;

        /* renamed from: f */
        private int f17529f = 0;

        /* renamed from: a */
        public final C6702a mo36822a(boolean z, int i) {
            this.f17526c = z;
            this.f17529f = i;
            return this;
        }

        /* renamed from: a */
        public final C6702a mo36823a(boolean z, C6703l lVar, int i) {
            this.f17525b = z;
            if (lVar == null) {
                lVar = C6703l.PER_DAY;
            }
            this.f17527d = lVar;
            this.f17528e = i;
            return this;
        }

        /* renamed from: a */
        public final C6701k mo36824a() {
            return new C6701k(this.f17524a, this.f17525b, this.f17526c, this.f17527d, this.f17528e, this.f17529f, (byte) 0);
        }
    }

    private C6701k(boolean z, boolean z2, boolean z3, C6703l lVar, int i, int i2) {
        this.f17518a = z;
        this.f17519b = z2;
        this.f17520c = z3;
        this.f17521d = lVar;
        this.f17522e = i;
        this.f17523f = i2;
    }

    /* synthetic */ C6701k(boolean z, boolean z2, boolean z3, C6703l lVar, int i, int i2, byte b) {
        this(z, z2, z3, lVar, i, i2);
    }
}
