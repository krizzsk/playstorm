package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.a */
public final class C4714a implements C4767m {

    /* renamed from: a */
    public final long[] f11865a;

    /* renamed from: b */
    public final long[] f11866b;

    /* renamed from: c */
    public final long f11867c;

    public C4714a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11865a = jArr;
        this.f11866b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f11867c = jArr2[i] + jArr3[i];
            return;
        }
        this.f11867c = 0;
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        return this.f11865a[C5049u.m15396b(this.f11866b, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return true;
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f11867c;
    }
}
