package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C4662r;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.d */
public class C4924d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f13113a;

    /* renamed from: b */
    public final /* synthetic */ long f13114b;

    /* renamed from: c */
    public final /* synthetic */ long f13115c;

    /* renamed from: d */
    public final /* synthetic */ IOException f13116d;

    /* renamed from: e */
    public final /* synthetic */ C4926f.C4927a f13117e;

    public C4924d(C4926f.C4927a aVar, C5000j jVar, int i, int i2, C4869i iVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f13117e = aVar;
        this.f13113a = obj;
        this.f13114b = j;
        this.f13115c = j2;
        this.f13116d = iOException;
    }

    public void run() {
        C4926f.C4927a aVar = this.f13117e;
        C4926f fVar = aVar.f13122b;
        C4926f.C4927a.m15085a(aVar, this.f13114b);
        C4926f.C4927a.m15085a(this.f13117e, this.f13115c);
        IAlog.m16699a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", ((C4662r) fVar).mo24981b(), this.f13116d);
    }
}
