package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.b */
public class C4918b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f13093a;

    /* renamed from: b */
    public final /* synthetic */ long f13094b;

    /* renamed from: c */
    public final /* synthetic */ long f13095c;

    /* renamed from: d */
    public final /* synthetic */ C4926f.C4927a f13096d;

    public C4918b(C4926f.C4927a aVar, C5000j jVar, int i, int i2, C4869i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f13096d = aVar;
        this.f13093a = obj;
        this.f13094b = j;
        this.f13095c = j2;
    }

    public void run() {
        C4926f.C4927a aVar = this.f13096d;
        C4926f fVar = aVar.f13122b;
        C4926f.C4927a.m15085a(aVar, this.f13094b);
        C4926f.C4927a.m15085a(this.f13096d, this.f13095c);
        IAlog.m16699a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", ((C4662r) fVar).mo24981b());
    }
}
