package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.a */
public class C4917a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f13089a;

    /* renamed from: b */
    public final /* synthetic */ long f13090b;

    /* renamed from: c */
    public final /* synthetic */ long f13091c;

    /* renamed from: d */
    public final /* synthetic */ C4926f.C4927a f13092d;

    public C4917a(C4926f.C4927a aVar, C5000j jVar, int i, int i2, C4869i iVar, int i3, Object obj, long j, long j2, long j3) {
        this.f13092d = aVar;
        this.f13089a = obj;
        this.f13090b = j;
        this.f13091c = j2;
    }

    public void run() {
        C4926f.C4927a aVar = this.f13092d;
        C4926f fVar = aVar.f13122b;
        C4926f.C4927a.m15085a(aVar, this.f13090b);
        C4926f.C4927a.m15085a(this.f13092d, this.f13091c);
        IAlog.m16699a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", ((C4662r) fVar).mo24981b());
    }
}
