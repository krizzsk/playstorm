package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.k */
public class C4420k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4421l f10919a;

    public C4420k(C4421l lVar) {
        this.f10919a = lVar;
    }

    public void run() {
        C4421l lVar = this.f10919a;
        lVar.getClass();
        IAlog.m16699a("%sRe-enabling clicks, grace period has passed", IAlog.m16696a((Object) lVar));
        boolean unused = this.f10919a.f10928i = true;
        this.f10919a.f10929j = null;
    }
}
