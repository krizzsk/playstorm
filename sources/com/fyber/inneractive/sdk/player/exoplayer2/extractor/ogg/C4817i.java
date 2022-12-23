package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i */
public final class C4817i {

    /* renamed from: a */
    public final byte[] f12587a;

    /* renamed from: b */
    public final int f12588b;

    /* renamed from: c */
    public int f12589c;

    /* renamed from: d */
    public int f12590d;

    public C4817i(byte[] bArr) {
        this.f12587a = bArr;
        this.f12588b = bArr.length;
    }

    /* renamed from: a */
    public boolean mo25291a() {
        boolean z = (((this.f12587a[this.f12589c] & 255) >> this.f12590d) & 1) == 1;
        mo25292b(1);
        return z;
    }

    /* renamed from: b */
    public void mo25292b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f12589c + i3;
        this.f12589c = i4;
        int i5 = this.f12590d + (i - (i3 * 8));
        this.f12590d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f12589c = i4 + 1;
            this.f12590d = i5 - 8;
        }
        int i6 = this.f12589c;
        if (i6 < 0 || (i6 >= (i2 = this.f12588b) && !(i6 == i2 && this.f12590d == 0))) {
            z = false;
        }
        C5023a.m15304b(z);
    }

    /* renamed from: a */
    public int mo25290a(int i) {
        int i2 = this.f12589c;
        int min = Math.min(i, 8 - this.f12590d);
        int i3 = i2 + 1;
        int i4 = ((this.f12587a[i2] & 255) >> this.f12590d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f12587a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo25292b(i);
        return i5;
    }
}
