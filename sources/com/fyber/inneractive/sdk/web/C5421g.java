package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.g */
public class C5421g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5407d f14369a;

    public C5421g(C5407d dVar) {
        this.f14369a = dVar;
    }

    public void run() {
        try {
            C5407d dVar = this.f14369a;
            if (dVar.f14326G != null) {
                IAlog.m16699a("%sunregistering orientation broadcast receiver", IAlog.m16696a((Object) dVar));
                this.f14369a.f14326G.mo26566a();
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f14369a.f14326G = null;
    }
}
