package com.fyber.inneractive.sdk.p189dv;

import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.p189dv.banner.C4355b;
import com.fyber.inneractive.sdk.response.C5291e;
import com.google.android.gms.ads.AdRequest;

/* renamed from: com.fyber.inneractive.sdk.dv.a */
public abstract class C4350a<T> extends C4419j<C4363f> {

    /* renamed from: g */
    public C4360d f10754g;

    /* renamed from: h */
    public C4355b f10755h;

    /* renamed from: i */
    public T f10756i;

    public C4350a(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar);
        mo24592a(fVar);
    }

    /* renamed from: a */
    public void mo24365a() {
        this.f10754g = null;
        this.f10756i = null;
    }

    /* renamed from: c */
    public C5291e mo24367c() {
        return (C4363f) this.f10914b;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        this.f10754g = dVar;
    }
}
