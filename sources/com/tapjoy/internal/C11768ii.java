package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tapjoy.internal.ii */
final class C11768ii extends C11747hy implements C11699ha {

    /* renamed from: a */
    public static final C11444bc<C11768ii> f28668a = new C11444bc<C11768ii>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            bhVar.mo72223h();
            String str = null;
            String str2 = null;
            int i = 1;
            String str3 = null;
            while (bhVar.mo72225j()) {
                String l = bhVar.mo72227l();
                if ("id".equals(l)) {
                    str = bhVar.mo72228m();
                } else if ("name".equals(l)) {
                    str3 = bhVar.mo72228m();
                } else if (FirebaseAnalytics.Param.QUANTITY.equals(l)) {
                    i = bhVar.mo72233r();
                } else if ("token".equals(l)) {
                    str2 = bhVar.mo72228m();
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return new C11768ii(str, str3, i, str2);
        }
    };

    /* renamed from: b */
    private final String f28669b;

    /* renamed from: c */
    private final String f28670c;

    /* renamed from: d */
    private final int f28671d;

    /* renamed from: e */
    private final String f28672e;

    C11768ii(String str, String str2, int i, String str3) {
        this.f28669b = str;
        this.f28670c = str2;
        this.f28671d = i;
        this.f28672e = str3;
    }

    /* renamed from: a */
    public final String mo72586a() {
        return this.f28669b;
    }

    /* renamed from: b */
    public final String mo72587b() {
        return this.f28670c;
    }

    /* renamed from: c */
    public final int mo72588c() {
        return this.f28671d;
    }

    /* renamed from: d */
    public final String mo72589d() {
        return this.f28672e;
    }
}
