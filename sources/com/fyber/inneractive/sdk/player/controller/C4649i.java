package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.i */
public class C4649i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4640g f11602a;

    public C4649i(C4640g gVar) {
        this.f11602a = gVar;
    }

    public void run() {
        try {
            List<C4640g.C4646f> list = this.f11602a.f11580b;
            if (list != null) {
                for (C4640g.C4646f e : list) {
                    e.mo24916e();
                }
            }
        } catch (Exception e2) {
            if (IAlog.f14137a <= 3) {
                C4640g gVar = this.f11602a;
                gVar.getClass();
                IAlog.m16699a("%sonDrawnToSurface callback threw an exception!", IAlog.m16696a((Object) gVar));
                e2.printStackTrace();
            }
        }
    }
}
