package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gl */
public final class C11682gl {

    /* renamed from: a */
    public static final C11682gl f28426a = new C11682gl(0, 0, 0, 0.0d);

    /* renamed from: b */
    public final long f28427b;

    /* renamed from: c */
    public final long f28428c;

    /* renamed from: d */
    public final double f28429d;

    /* renamed from: e */
    public long f28430e;

    /* renamed from: f */
    private final long f28431f;

    public C11682gl(long j, long j2, long j3, double d) {
        this.f28431f = j;
        this.f28427b = j2;
        this.f28428c = j3;
        this.f28429d = d;
        this.f28430e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11682gl glVar = (C11682gl) obj;
            return this.f28431f == glVar.f28431f && this.f28427b == glVar.f28427b && this.f28428c == glVar.f28428c && this.f28429d == glVar.f28429d && this.f28430e == glVar.f28430e;
        }
    }
}
