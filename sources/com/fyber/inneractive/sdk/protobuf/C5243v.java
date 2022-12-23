package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.v */
public enum C5243v {
    DOUBLE_LIST_PACKED(35, r4, r8),
    SINT64_LIST_PACKED(48, r4, r12);
    

    /* renamed from: e */
    public static final C5243v[] f13944e = null;

    /* renamed from: a */
    public final int f13946a;

    /* renamed from: b */
    public final C5244a f13947b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.v$a */
    public enum C5244a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a */
        public final boolean f13953a;

        /* access modifiers changed from: public */
        C5244a(boolean z) {
            this.f13953a = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        C5243v[] values = values();
        f13944e = new C5243v[values.length];
        for (C5243v vVar : values) {
            f13944e[vVar.f13946a] = vVar;
        }
    }

    /* access modifiers changed from: public */
    C5243v(int i, C5244a aVar, C5123b0 b0Var) {
        this.f13946a = i;
        this.f13947b = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            b0Var.getClass();
        } else if (ordinal == 3) {
            b0Var.getClass();
        }
        if (aVar == C5244a.SCALAR) {
            b0Var.ordinal();
        }
    }
}
