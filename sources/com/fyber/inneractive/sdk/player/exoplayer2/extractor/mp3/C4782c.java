package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4780b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c */
public final class C4782c implements C4780b.C4781a {

    /* renamed from: a */
    public final long[] f12277a;

    /* renamed from: b */
    public final long[] f12278b;

    /* renamed from: c */
    public final long f12279c;

    public C4782c(long[] jArr, long[] jArr2, long j) {
        this.f12277a = jArr;
        this.f12278b = jArr2;
        this.f12279c = j;
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        return this.f12278b[C5049u.m15396b(this.f12277a, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return true;
    }

    /* renamed from: b */
    public long mo25257b(long j) {
        return this.f12277a[C5049u.m15396b(this.f12278b, j, true, true)];
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f12279c;
    }
}
