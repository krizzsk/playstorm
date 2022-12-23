package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p048c.C1860e;

/* renamed from: com.applovin.impl.sdk.utils.p */
public final class C2084p {

    /* renamed from: a */
    private final C1959m f4080a;

    /* renamed from: b */
    private String f4081b;

    /* renamed from: c */
    private final String f4082c;

    /* renamed from: d */
    private final String f4083d;

    public C2084p(C1959m mVar) {
        this.f4080a = mVar;
        this.f4082c = m5011a(C1859d.f3346g, (String) C1860e.m4046b(C1859d.f3345f, null, mVar.mo14297L()));
        this.f4083d = m5011a(C1859d.f3347h, (String) mVar.mo14311a(C1857b.f3067X));
        mo14756a(m5013d());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.c.d, com.applovin.impl.sdk.c.d<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m5011a(com.applovin.impl.sdk.p048c.C1859d<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            com.applovin.impl.sdk.m r0 = r2.f4080a
            android.content.Context r0 = r0.mo14297L()
            r1 = 0
            java.lang.Object r0 = com.applovin.impl.sdk.p048c.C1860e.m4046b(r3, r1, (android.content.Context) r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0029:
            com.applovin.impl.sdk.m r0 = r2.f4080a
            android.content.Context r0 = r0.mo14297L()
            com.applovin.impl.sdk.p048c.C1860e.m4044a(r3, r4, (android.content.Context) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2084p.m5011a(com.applovin.impl.sdk.c.d, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m5012a(C1959m mVar) {
        String str = (String) mVar.mo14312a(C1859d.f3348i);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        mVar.mo14318a(C1859d.f3348i, valueOf);
        return valueOf;
    }

    /* renamed from: d */
    private String m5013d() {
        if (!((Boolean) this.f4080a.mo14311a(C1857b.f3278dy)).booleanValue()) {
            this.f4080a.mo14346b(C1859d.f3344e);
        }
        String str = (String) this.f4080a.mo14312a(C1859d.f3344e);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C2092v.m5047a()) {
            C2092v A = this.f4080a.mo14286A();
            A.mo14789b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    /* renamed from: a */
    public String mo14755a() {
        return this.f4081b;
    }

    /* renamed from: a */
    public void mo14756a(String str) {
        if (((Boolean) this.f4080a.mo14311a(C1857b.f3278dy)).booleanValue()) {
            this.f4080a.mo14318a(C1859d.f3344e, str);
        }
        this.f4081b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", mo14758c());
        this.f4080a.mo14334ag().mo14257a(bundle, "user_info");
    }

    /* renamed from: b */
    public String mo14757b() {
        return this.f4082c;
    }

    /* renamed from: c */
    public String mo14758c() {
        return this.f4083d;
    }
}
