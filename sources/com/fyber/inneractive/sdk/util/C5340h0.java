package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.h0 */
public class C5340h0 {

    /* renamed from: a */
    public transient C5341a[] f14196a;

    /* renamed from: b */
    public transient int f14197b;

    /* renamed from: c */
    public int f14198c;

    /* renamed from: com.fyber.inneractive.sdk.util.h0$a */
    public static class C5341a {

        /* renamed from: a */
        public int f14199a;

        /* renamed from: b */
        public Object f14200b;

        /* renamed from: c */
        public C5341a f14201c;

        public C5341a(int i, int i2, Object obj, C5341a aVar) {
            this.f14199a = i;
            this.f14200b = obj;
            this.f14201c = aVar;
        }
    }

    public C5340h0() {
        this(20, 0.75f);
    }

    public C5340h0(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        } else if (f > 0.0f) {
            i = i == 0 ? 1 : i;
            this.f14196a = new C5341a[i];
            this.f14198c = (int) (((float) i) * f);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
    }
}
