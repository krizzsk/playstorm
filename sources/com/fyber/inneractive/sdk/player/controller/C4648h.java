package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.h */
public class C4648h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f11600a;

    /* renamed from: b */
    public final /* synthetic */ C4640g f11601b;

    public C4648h(C4640g gVar, boolean z) {
        this.f11601b = gVar;
        this.f11600a = z;
    }

    public void run() {
        C4640g gVar = this.f11601b;
        if (!gVar.f11585g) {
            try {
                List<C4640g.C4646f> list = gVar.f11580b;
                if (list != null) {
                    for (C4640g.C4646f e : list) {
                        e.mo24798e(this.f11600a);
                    }
                }
            } catch (Exception unused) {
                if (IAlog.f14137a <= 3) {
                    C4640g gVar2 = this.f11601b;
                    gVar2.getClass();
                    IAlog.m16699a("%sonPlayerError callback threw an exception!", IAlog.m16696a((Object) gVar2));
                }
            }
        }
    }
}
