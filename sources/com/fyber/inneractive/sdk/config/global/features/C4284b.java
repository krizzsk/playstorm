package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4477a;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.b */
public class C4284b extends C4287e {

    /* renamed from: e */
    public C4477a f10624e;

    public C4284b() {
        super("cta_locale");
    }

    /* renamed from: b */
    public C4287e mo24308b() {
        C4284b bVar = new C4284b();
        mo24312a((C4287e) bVar);
        return bVar;
    }

    /* renamed from: e */
    public void mo24309e(String str) {
        if (!TextUtils.isEmpty(str) && this.f10624e == null) {
            String a = mo24311a("install_" + str, (String) null);
            String a2 = mo24311a("skip_ad_" + str, (String) null);
            this.f10624e = new C4477a(a, a2, mo24311a("skip_in_" + str, (String) null));
        }
    }
}
