package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.y */
public class C5389y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5390z f14270a;

    public C5389y(C5390z zVar) {
        this.f14270a = zVar;
    }

    public void run() {
        this.f14270a.getClass();
        IAlog.m16699a("%sSampling timeout reached! unregistering location request listeners", "Location Manager: ");
        C5390z zVar = this.f14270a;
        zVar.mo26495a(zVar.f14276f);
        C5390z zVar2 = this.f14270a;
        zVar2.mo26495a(zVar2.f14275e);
        C5390z zVar3 = this.f14270a;
        zVar3.f14276f = null;
        zVar3.f14275e = null;
    }
}
