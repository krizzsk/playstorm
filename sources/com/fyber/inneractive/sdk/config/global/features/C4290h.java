package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.h */
public class C4290h extends C4287e {
    public C4290h() {
        super("omsdk");
    }

    /* renamed from: b */
    public C4287e mo24308b() {
        C4290h hVar = new C4290h();
        mo24312a((C4287e) hVar);
        return hVar;
    }

    /* renamed from: c */
    public boolean mo24318c() {
        boolean a = mo24313a("enable", false);
        IAlog.m16699a("OMSDK AB %s", String.valueOf(a));
        return a;
    }
}
