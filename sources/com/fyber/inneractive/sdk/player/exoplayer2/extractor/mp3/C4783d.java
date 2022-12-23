package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4780b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d */
public final class C4783d implements C4780b.C4781a {

    /* renamed from: a */
    public final long f12280a;

    /* renamed from: b */
    public final long f12281b;

    /* renamed from: c */
    public final long f12282c;

    /* renamed from: d */
    public final long[] f12283d;

    /* renamed from: e */
    public final long f12284e;

    /* renamed from: f */
    public final int f12285f;

    public C4783d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f12280a = j;
        this.f12281b = j2;
        this.f12282c = j3;
        this.f12283d = jArr;
        this.f12284e = j4;
        this.f12285f = i;
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return this.f12283d != null;
    }

    /* renamed from: b */
    public long mo25257b(long j) {
        long j2;
        long j3;
        long j4 = 0;
        if (mo25130a()) {
            long j5 = this.f12280a;
            if (j >= j5) {
                double d = (((double) (j - j5)) * 256.0d) / ((double) this.f12284e);
                int b = C5049u.m15396b(this.f12283d, (long) d, true, false) + 1;
                long j6 = this.f12281b;
                long j7 = (((long) b) * j6) / 100;
                if (b == 0) {
                    j2 = 0;
                } else {
                    j2 = this.f12283d[b - 1];
                }
                if (b == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f12283d[b];
                }
                long j8 = (j6 * ((long) (b + 1))) / 100;
                if (j3 != j2) {
                    j4 = (long) ((((double) (j8 - j7)) * (d - ((double) j2))) / ((double) (j3 - j2)));
                }
                return j7 + j4;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f12281b;
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        long j2;
        if (!mo25130a()) {
            return this.f12280a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f12281b);
        float f2 = 0.0f;
        float f3 = 256.0f;
        if (f > 0.0f) {
            if (f >= 100.0f) {
                f2 = 256.0f;
            } else {
                int i = (int) f;
                if (i != 0) {
                    f2 = (float) this.f12283d[i - 1];
                }
                if (i < 99) {
                    f3 = (float) this.f12283d[i];
                }
                f2 += (f3 - f2) * (f - ((float) i));
            }
        }
        long round = Math.round(((double) f2) * 0.00390625d * ((double) this.f12284e));
        long j3 = this.f12280a;
        long j4 = round + j3;
        long j5 = this.f12282c;
        if (j5 != -1) {
            j2 = j5 - 1;
        } else {
            j2 = ((j3 - ((long) this.f12285f)) + this.f12284e) - 1;
        }
        return Math.min(j4, j2);
    }
}
