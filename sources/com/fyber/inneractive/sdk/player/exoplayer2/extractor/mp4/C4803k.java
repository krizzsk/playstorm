package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k */
public final class C4803k {

    /* renamed from: a */
    public final int f12529a;

    /* renamed from: b */
    public final long[] f12530b;

    /* renamed from: c */
    public final int[] f12531c;

    /* renamed from: d */
    public final int f12532d;

    /* renamed from: e */
    public final long[] f12533e;

    /* renamed from: f */
    public final int[] f12534f;

    public C4803k(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        C5023a.m15302a(iArr.length == jArr2.length);
        C5023a.m15302a(jArr.length == jArr2.length);
        C5023a.m15302a(iArr2.length != jArr2.length ? false : z);
        this.f12530b = jArr;
        this.f12531c = iArr;
        this.f12532d = i;
        this.f12533e = jArr2;
        this.f12534f = iArr2;
        this.f12529a = jArr.length;
    }

    /* renamed from: a */
    public int mo25274a(long j) {
        for (int b = C5049u.m15396b(this.f12533e, j, true, false); b >= 0; b--) {
            if ((this.f12534f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo25275b(long j) {
        for (int a = C5049u.m15387a(this.f12533e, j, true, false); a < this.f12533e.length; a++) {
            if ((this.f12534f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
