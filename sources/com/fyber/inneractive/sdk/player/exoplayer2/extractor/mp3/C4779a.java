package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4780b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a */
public final class C4779a implements C4780b.C4781a {

    /* renamed from: a */
    public final long f12259a;

    /* renamed from: b */
    public final int f12260b;

    /* renamed from: c */
    public final long f12261c;

    public C4779a(long j, int i, long j2) {
        long j3;
        this.f12259a = j;
        this.f12260b = i;
        if (j2 == -1) {
            j3 = -9223372036854775807L;
        } else {
            j3 = mo25257b(j2);
        }
        this.f12261c = j3;
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return this.f12261c != -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo25257b(long j) {
        return ((Math.max(0, j - this.f12259a) * 1000000) * 8) / ((long) this.f12260b);
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f12261c;
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        long j2 = this.f12261c;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        int i = C5049u.f13471a;
        return this.f12259a + ((Math.max(0, Math.min(j, j2)) * ((long) this.f12260b)) / 8000000);
    }
}
