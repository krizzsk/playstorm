package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.x */
public class C4585x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4532b0 f11394a;

    /* renamed from: b */
    public final /* synthetic */ C4581w f11395b;

    public C4585x(C4581w wVar, C4532b0 b0Var) {
        this.f11395b = wVar;
        this.f11394a = b0Var;
    }

    public void run() {
        IAlog.m16699a("retrying network request", new Object[0]);
        this.f11395b.mo24781c(this.f11394a);
    }
}
