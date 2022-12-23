package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C4343w;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C5291e;

/* renamed from: com.fyber.inneractive.sdk.flow.j */
public abstract class C4419j<T extends C5291e> {

    /* renamed from: a */
    public InneractiveAdRequest f10913a;

    /* renamed from: b */
    public T f10914b;

    /* renamed from: c */
    public C4309s f10915c;

    /* renamed from: d */
    public final C4346z f10916d;

    /* renamed from: e */
    public boolean f10917e = false;

    /* renamed from: f */
    public boolean f10918f = false;

    public C4419j(C4346z zVar, C4309s sVar) {
        this.f10916d = zVar;
        this.f10915c = sVar;
    }

    /* renamed from: a */
    public abstract void mo24365a();

    /* renamed from: a */
    public void mo24592a(T t) {
        this.f10914b = t;
    }

    /* renamed from: b */
    public C4309s mo24593b() {
        return this.f10915c;
    }

    /* renamed from: c */
    public T mo24367c() {
        return this.f10914b;
    }

    /* renamed from: d */
    public boolean mo24373d() {
        C4343w wVar = ((C4345y) this.f10916d).f10749e;
        return false;
    }

    /* renamed from: e */
    public abstract boolean mo24368e();

    public abstract boolean isVideoAd();

    /* renamed from: a */
    public void mo24591a(InneractiveAdRequest inneractiveAdRequest) {
        this.f10913a = inneractiveAdRequest;
    }
}
