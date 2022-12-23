package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a */
public abstract class C4920a implements C5015x.C5018c {

    /* renamed from: a */
    public final C5000j f13101a;

    /* renamed from: b */
    public final int f13102b;

    /* renamed from: c */
    public final C4869i f13103c;

    /* renamed from: d */
    public final int f13104d;

    /* renamed from: e */
    public final Object f13105e;

    /* renamed from: f */
    public final long f13106f;

    /* renamed from: g */
    public final long f13107g;

    /* renamed from: h */
    public final C4996g f13108h;

    public C4920a(C4996g gVar, C5000j jVar, int i, C4869i iVar, int i2, Object obj, long j, long j2) {
        this.f13108h = (C4996g) C5023a.m15300a(gVar);
        this.f13101a = (C5000j) C5023a.m15300a(jVar);
        this.f13102b = i;
        this.f13103c = iVar;
        this.f13104d = i2;
        this.f13105e = obj;
        this.f13106f = j;
        this.f13107g = j2;
    }

    /* renamed from: c */
    public abstract long mo25187c();
}
