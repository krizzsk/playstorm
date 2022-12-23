package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.e */
public class C4925e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f13118a;

    /* renamed from: b */
    public final /* synthetic */ long f13119b;

    /* renamed from: c */
    public final /* synthetic */ C4926f.C4927a f13120c;

    public C4925e(C4926f.C4927a aVar, int i, C4869i iVar, int i2, Object obj, long j) {
        this.f13120c = aVar;
        this.f13118a = obj;
        this.f13119b = j;
    }

    public void run() {
        C4926f.C4927a aVar = this.f13120c;
        C4926f fVar = aVar.f13122b;
        C4926f.C4927a.m15085a(aVar, this.f13119b);
        IAlog.m16699a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", ((C4662r) fVar).mo24981b());
    }
}
