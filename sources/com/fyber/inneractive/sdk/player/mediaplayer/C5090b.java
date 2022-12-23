package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.b */
public class C5090b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13615a;

    /* renamed from: b */
    public final /* synthetic */ C5076a f13616b;

    public C5090b(C5076a aVar, int i) {
        this.f13616b = aVar;
        this.f13615a = i;
    }

    public void run() {
        C5076a aVar = this.f13616b;
        int i = this.f13615a;
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.seekTo(i);
        IAlog.m16702d(c + "timelog: " + "seekTo" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
