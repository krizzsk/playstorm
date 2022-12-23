package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.f */
public final class C5029f {

    /* renamed from: a */
    public int f13421a;

    /* renamed from: b */
    public long[] f13422b;

    public C5029f(int i) {
        this.f13422b = new long[i];
    }

    /* renamed from: a */
    public void mo25582a(long j) {
        int i = this.f13421a;
        long[] jArr = this.f13422b;
        if (i == jArr.length) {
            this.f13422b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f13422b;
        int i2 = this.f13421a;
        this.f13421a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: a */
    public long mo25581a(int i) {
        if (i >= 0 && i < this.f13421a) {
            return this.f13422b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f13421a);
    }
}
