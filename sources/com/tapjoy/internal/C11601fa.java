package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.fa */
public enum C11601fa implements C11574eo {
    APP(0),
    CAMPAIGN(1),
    CUSTOM(2),
    USAGES(3);
    

    /* renamed from: e */
    public static final C11556el<C11601fa> f28107e = null;

    /* renamed from: f */
    private final int f28109f;

    static {
        f28107e = new C11602a();
    }

    private C11601fa(int i) {
        this.f28109f = i;
    }

    /* renamed from: a */
    public static C11601fa m33748a(int i) {
        if (i == 0) {
            return APP;
        }
        if (i == 1) {
            return CAMPAIGN;
        }
        if (i == 2) {
            return CUSTOM;
        }
        if (i != 3) {
            return null;
        }
        return USAGES;
    }

    /* renamed from: a */
    public final int mo72372a() {
        return this.f28109f;
    }

    /* renamed from: com.tapjoy.internal.fa$a */
    static final class C11602a extends C11550eh<C11601fa> {
        C11602a() {
            super(C11601fa.class);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C11574eo mo72343a(int i) {
            return C11601fa.m33748a(i);
        }
    }
}
