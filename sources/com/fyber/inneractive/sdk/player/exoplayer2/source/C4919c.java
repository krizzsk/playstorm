package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.c */
public class C4919c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f13097a;

    /* renamed from: b */
    public final /* synthetic */ long f13098b;

    /* renamed from: c */
    public final /* synthetic */ long f13099c;

    /* renamed from: d */
    public final /* synthetic */ C4926f.C4927a f13100d;

    public C4919c(C4926f.C4927a aVar, C5000j jVar, int i, int i2, C4869i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f13100d = aVar;
        this.f13097a = obj;
        this.f13098b = j;
        this.f13099c = j2;
    }

    public void run() {
        C4926f.C4927a aVar = this.f13100d;
        C4926f fVar = aVar.f13122b;
        C4926f.C4927a.m15085a(aVar, this.f13098b);
        C4926f.C4927a.m15085a(this.f13100d, this.f13099c);
        IAlog.m16699a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", ((C4662r) fVar).mo24981b());
    }
}
