package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.player.controller.C4660q;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.renderers.i */
public class C5279i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5276h f14014a;

    public C5279i(C5276h hVar) {
        this.f14014a = hVar;
    }

    public void run() {
        C5276h hVar = this.f14014a;
        if (hVar.f14009t != null) {
            boolean unused = hVar.getClass();
            C5276h hVar2 = this.f14014a;
            hVar2.getClass();
            IAlog.m16699a("%sIdle state reached!", IAlog.m16696a((Object) hVar2));
            C4660q qVar = this.f14014a.f14002m;
            if (qVar != null) {
                qVar.mo24926b(true);
            }
            this.f14014a.f14009t = null;
        }
    }
}
