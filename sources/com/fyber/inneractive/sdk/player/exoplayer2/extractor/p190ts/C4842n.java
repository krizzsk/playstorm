package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n */
public final class C4842n {

    /* renamed from: a */
    public final int f12777a;

    /* renamed from: b */
    public boolean f12778b;

    /* renamed from: c */
    public boolean f12779c;

    /* renamed from: d */
    public byte[] f12780d;

    /* renamed from: e */
    public int f12781e;

    public C4842n(int i, int i2) {
        this.f12777a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f12780d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo25309a() {
        this.f12778b = false;
        this.f12779c = false;
    }

    /* renamed from: b */
    public void mo25312b(int i) {
        boolean z = true;
        C5023a.m15304b(!this.f12778b);
        if (i != this.f12777a) {
            z = false;
        }
        this.f12778b = z;
        if (z) {
            this.f12781e = 3;
            this.f12779c = false;
        }
    }

    /* renamed from: a */
    public void mo25310a(byte[] bArr, int i, int i2) {
        if (this.f12778b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f12780d;
            int length = bArr2.length;
            int i4 = this.f12781e + i3;
            if (length < i4) {
                this.f12780d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f12780d, this.f12781e, i3);
            this.f12781e += i3;
        }
    }

    /* renamed from: a */
    public boolean mo25311a(int i) {
        if (!this.f12778b) {
            return false;
        }
        this.f12781e -= i;
        this.f12778b = false;
        this.f12779c = true;
        return true;
    }
}
