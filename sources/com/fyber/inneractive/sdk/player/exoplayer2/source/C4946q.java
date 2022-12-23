package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.q */
public final class C4946q extends C4913p {

    /* renamed from: g */
    public static final Object f13188g = new Object();

    /* renamed from: b */
    public final long f13189b;

    /* renamed from: c */
    public final long f13190c;

    /* renamed from: d */
    public final long f13191d;

    /* renamed from: e */
    public final long f13192e;

    /* renamed from: f */
    public final boolean f13193f;

    public C4946q(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: a */
    public int mo25457a() {
        return 1;
    }

    /* renamed from: a */
    public C4913p.C4916c mo25461a(int i, C4913p.C4916c cVar, boolean z, long j) {
        C5023a.m15299a(i, 0, 1);
        Object obj = z ? f13188g : null;
        long j2 = this.f13192e;
        boolean z2 = this.f13193f;
        if (z2) {
            j2 += j;
            if (j2 > this.f13190c) {
                j2 = -9223372036854775807L;
            }
        }
        long j3 = this.f13190c;
        long j4 = this.f13191d;
        cVar.f13082a = obj;
        cVar.f13083b = z2;
        cVar.f13086e = j2;
        cVar.f13087f = j3;
        cVar.f13084c = 0;
        cVar.f13085d = 0;
        cVar.f13088g = j4;
        return cVar;
    }

    /* renamed from: b */
    public int mo25462b() {
        return 1;
    }

    public C4946q(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f13189b = j;
        this.f13190c = j2;
        this.f13191d = j3;
        this.f13192e = j4;
        this.f13193f = z2;
    }

    /* renamed from: a */
    public C4913p.C4915b mo25459a(int i, C4913p.C4915b bVar, boolean z) {
        C5023a.m15299a(i, 0, 1);
        Object obj = z ? f13188g : null;
        long j = this.f13189b;
        bVar.f13077a = obj;
        bVar.f13078b = obj;
        bVar.f13079c = 0;
        bVar.f13080d = j;
        bVar.f13081e = -this.f13191d;
        return bVar;
    }

    /* renamed from: a */
    public int mo25458a(Object obj) {
        return f13188g.equals(obj) ? 0 : -1;
    }
}
