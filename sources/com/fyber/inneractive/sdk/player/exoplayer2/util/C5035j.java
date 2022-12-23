package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.j */
public final class C5035j {

    /* renamed from: a */
    public byte[] f13440a;

    /* renamed from: b */
    public int f13441b;

    /* renamed from: c */
    public int f13442c;

    /* renamed from: d */
    public int f13443d;

    public C5035j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* renamed from: a */
    public int mo25583a(int i) {
        int i2;
        this.f13442c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f13442c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f13442c = i4;
            byte[] bArr = this.f13440a;
            int i5 = this.f13441b;
            this.f13441b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f13440a;
        int i6 = this.f13441b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13442c = 0;
            this.f13441b = i6 + 1;
        }
        mo25584a();
        return i7;
    }

    /* renamed from: b */
    public void mo25585b(int i) {
        int i2 = i / 8;
        this.f13441b = i2;
        this.f13442c = i - (i2 * 8);
        mo25584a();
    }

    /* renamed from: c */
    public void mo25587c(int i) {
        int i2 = i / 8;
        int i3 = this.f13441b + i2;
        this.f13441b = i3;
        int i4 = this.f13442c + (i - (i2 * 8));
        this.f13442c = i4;
        if (i4 > 7) {
            this.f13441b = i3 + 1;
            this.f13442c = i4 - 8;
        }
        mo25584a();
    }

    public C5035j(byte[] bArr, int i) {
        this.f13440a = bArr;
        this.f13443d = i;
    }

    /* renamed from: b */
    public boolean mo25586b() {
        byte[] bArr = this.f13440a;
        int i = this.f13441b;
        byte b = bArr[i];
        int i2 = this.f13442c;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.f13442c = i3;
        if (i3 == 8) {
            this.f13442c = 0;
            this.f13441b = i + 1;
        }
        mo25584a();
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13443d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25584a() {
        /*
            r2 = this;
            int r0 = r2.f13441b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13443d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13442c
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
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j.mo25584a():void");
    }
}
