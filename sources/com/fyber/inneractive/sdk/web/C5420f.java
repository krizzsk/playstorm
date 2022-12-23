package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.web.f */
public class C5420f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5407d f14368a;

    public C5420f(C5407d dVar) {
        this.f14368a = dVar;
    }

    public void run() {
        C5407d dVar = this.f14368a;
        if (dVar.f14326G == null) {
            try {
                IAlog.m16699a("%sregistering orientation broadcast receiver", IAlog.m16696a((Object) dVar));
                this.f14368a.f14326G = new C5407d.C5416i();
                if (this.f14368a.mo26554g() != null) {
                    C5407d dVar2 = this.f14368a;
                    C5407d<T>.i iVar = dVar2.f14326G;
                    Context g = dVar2.mo26554g();
                    C5407d dVar3 = C5407d.this;
                    dVar3.getClass();
                    IAlog.m16699a("%sregister screen broadcast receiver", IAlog.m16696a((Object) dVar3));
                    iVar.f14362a = g;
                    g.registerReceiver(iVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            } catch (Exception e) {
                C5407d dVar4 = this.f14368a;
                dVar4.getClass();
                IAlog.m16703e("%sfailed registering orientation broadcast recevier", IAlog.m16696a((Object) dVar4));
                if (IAlog.f14137a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }
}
