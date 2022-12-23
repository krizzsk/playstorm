package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ig */
final class C11764ig extends C11747hy implements C11697gz {

    /* renamed from: a */
    public static final C11444bc<C11764ig> f28659a = new C11444bc<C11764ig>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            bhVar.mo72223h();
            String str = "";
            String str2 = str;
            while (bhVar.mo72225j()) {
                String l = bhVar.mo72227l();
                if ("campaign_id".equals(l)) {
                    str = bhVar.mo72213c("");
                } else if ("product_id".equals(l)) {
                    str2 = bhVar.mo72213c("");
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return new C11764ig(str, str2);
        }
    };

    /* renamed from: b */
    private final String f28660b;

    /* renamed from: c */
    private final String f28661c;

    C11764ig(String str, String str2) {
        this.f28660b = str;
        this.f28661c = str2;
    }

    /* renamed from: a */
    public final String mo72584a() {
        return this.f28660b;
    }

    /* renamed from: b */
    public final String mo72585b() {
        return this.f28661c;
    }
}
