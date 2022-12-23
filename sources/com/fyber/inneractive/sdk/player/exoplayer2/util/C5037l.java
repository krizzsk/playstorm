package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.l */
public final class C5037l {

    /* renamed from: a */
    public byte[] f13447a;

    /* renamed from: b */
    public int f13448b;

    /* renamed from: c */
    public int f13449c;

    /* renamed from: d */
    public int f13450d;

    public C5037l(byte[] bArr, int i, int i2) {
        mo25616a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo25616a(byte[] bArr, int i, int i2) {
        this.f13447a = bArr;
        this.f13449c = i;
        this.f13448b = i2;
        this.f13450d = 0;
        mo25615a();
    }

    /* renamed from: b */
    public int mo25618b(int i) {
        int i2;
        int i3;
        this.f13450d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f13450d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f13450d = i5;
            byte[] bArr = this.f13447a;
            int i6 = this.f13449c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo25621c(i6 + 1)) {
                i3 = 1;
            }
            this.f13449c = i6 + i3;
        }
        byte[] bArr2 = this.f13447a;
        int i7 = this.f13449c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13450d = 0;
            if (!mo25621c(i7 + 1)) {
                i3 = 1;
            }
            this.f13449c = i7 + i3;
        }
        mo25615a();
        return i8;
    }

    /* renamed from: c */
    public boolean mo25620c() {
        boolean z = (this.f13447a[this.f13449c] & (128 >> this.f13450d)) != 0;
        mo25625f();
        return z;
    }

    /* renamed from: d */
    public void mo25623d(int i) {
        int i2 = this.f13449c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13449c = i4;
        int i5 = this.f13450d + (i - (i3 * 8));
        this.f13450d = i5;
        if (i5 > 7) {
            this.f13449c = i4 + 1;
            this.f13450d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13449c) {
                mo25615a();
                return;
            } else if (mo25621c(i2)) {
                this.f13449c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public int mo25624e() {
        int d = mo25622d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: f */
    public void mo25625f() {
        int i = 1;
        int i2 = this.f13450d + 1;
        this.f13450d = i2;
        if (i2 == 8) {
            this.f13450d = 0;
            int i3 = this.f13449c;
            if (mo25621c(i3 + 1)) {
                i = 2;
            }
            this.f13449c = i3 + i;
        }
        mo25615a();
    }

    /* renamed from: c */
    public final boolean mo25621c(int i) {
        if (2 <= i && i < this.f13448b) {
            byte[] bArr = this.f13447a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: a */
    public boolean mo25617a(int i) {
        int i2 = this.f13449c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13450d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13448b) {
                int i6 = this.f13448b;
            } else if (mo25621c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f13448b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo25619b() {
        int i = this.f13449c;
        int i2 = this.f13450d;
        int i3 = 0;
        while (this.f13449c < this.f13448b && !mo25620c()) {
            i3++;
        }
        boolean z = this.f13449c == this.f13448b;
        this.f13449c = i;
        this.f13450d = i2;
        if (z || !mo25617a((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo25622d() {
        int i = 0;
        int i2 = 0;
        while (!mo25620c()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo25618b(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13448b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25615a() {
        /*
            r2 = this;
            int r0 = r2.f13449c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13448b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13450d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C5037l.mo25615a():void");
    }
}
