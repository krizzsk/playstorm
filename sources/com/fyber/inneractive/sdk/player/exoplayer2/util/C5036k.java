package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.k */
public final class C5036k {

    /* renamed from: a */
    public byte[] f13444a;

    /* renamed from: b */
    public int f13445b;

    /* renamed from: c */
    public int f13446c;

    public C5036k() {
    }

    /* renamed from: a */
    public void mo25591a(byte[] bArr, int i) {
        this.f13444a = bArr;
        this.f13446c = i;
        this.f13445b = 0;
    }

    /* renamed from: b */
    public int mo25593b() {
        byte[] bArr = this.f13444a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public void mo25596c(int i) {
        mo25591a(mo25593b() < i ? new byte[i] : this.f13444a, i);
    }

    /* renamed from: d */
    public void mo25598d(int i) {
        C5023a.m15302a(i >= 0 && i <= this.f13444a.length);
        this.f13446c = i;
    }

    /* renamed from: e */
    public void mo25600e(int i) {
        C5023a.m15302a(i >= 0 && i <= this.f13446c);
        this.f13445b = i;
    }

    /* renamed from: f */
    public void mo25602f(int i) {
        mo25600e(this.f13445b + i);
    }

    /* renamed from: g */
    public int mo25603g() {
        int e = mo25599e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    /* renamed from: h */
    public int mo25604h() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        this.f13445b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: i */
    public long mo25605i() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = i2 + 1;
        this.f13445b = i3;
        int i4 = i3 + 1;
        this.f13445b = i4;
        int i5 = i4 + 1;
        this.f13445b = i5;
        int i6 = i5 + 1;
        this.f13445b = i6;
        int i7 = i6 + 1;
        this.f13445b = i7;
        int i8 = i7 + 1;
        this.f13445b = i8;
        this.f13445b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: j */
    public String mo25606j() {
        if (mo25588a() == 0) {
            return null;
        }
        int i = this.f13445b;
        while (i < this.f13446c && this.f13444a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f13444a;
        int i2 = this.f13445b;
        String str = new String(bArr, i2, i - i2);
        this.f13445b = i;
        if (i < this.f13446c) {
            this.f13445b = i + 1;
        }
        return str;
    }

    /* renamed from: k */
    public int mo25607k() {
        return (mo25608l() << 21) | (mo25608l() << 14) | (mo25608l() << 7) | mo25608l();
    }

    /* renamed from: l */
    public int mo25608l() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        this.f13445b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: m */
    public long mo25609m() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = i2 + 1;
        this.f13445b = i3;
        int i4 = i3 + 1;
        this.f13445b = i4;
        this.f13445b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public int mo25610n() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f13445b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f13445b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: o */
    public int mo25611o() {
        int c = mo25595c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Top bit not zero: " + c);
    }

    /* renamed from: p */
    public long mo25612p() {
        long i = mo25605i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    /* renamed from: q */
    public int mo25613q() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        this.f13445b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: r */
    public void mo25614r() {
        this.f13445b = 0;
        this.f13446c = 0;
    }

    public C5036k(int i) {
        this.f13444a = new byte[i];
        this.f13446c = i;
    }

    /* renamed from: b */
    public String mo25594b(int i) {
        String str = new String(this.f13444a, this.f13445b, i, Charset.defaultCharset());
        this.f13445b += i;
        return str;
    }

    /* renamed from: c */
    public int mo25595c() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f13445b = i4;
        byte b = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f13445b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f13445b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: f */
    public long mo25601f() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = i2 + 1;
        this.f13445b = i3;
        int i4 = i3 + 1;
        this.f13445b = i4;
        this.f13445b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: d */
    public String mo25597d() {
        if (mo25588a() == 0) {
            return null;
        }
        int i = this.f13445b;
        while (i < this.f13446c && !C5049u.m15397b((int) this.f13444a[i])) {
            i++;
        }
        int i2 = this.f13445b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f13444a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f13445b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f13444a;
        int i3 = this.f13445b;
        String str = new String(bArr2, i3, i - i3);
        this.f13445b = i;
        int i4 = this.f13446c;
        if (i == i4) {
            return str;
        }
        byte[] bArr3 = this.f13444a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f13445b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        int i6 = this.f13445b;
        if (bArr3[i6] == 10) {
            this.f13445b = i6 + 1;
        }
        return str;
    }

    /* renamed from: e */
    public int mo25599e() {
        byte[] bArr = this.f13444a;
        int i = this.f13445b;
        int i2 = i + 1;
        this.f13445b = i2;
        int i3 = i2 + 1;
        this.f13445b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f13445b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f13445b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b2;
    }

    /* renamed from: a */
    public int mo25588a() {
        return this.f13446c - this.f13445b;
    }

    public C5036k(byte[] bArr) {
        this.f13444a = bArr;
        this.f13446c = bArr.length;
    }

    /* renamed from: a */
    public void mo25590a(C5035j jVar, int i) {
        mo25592a(jVar.f13440a, 0, i);
        jVar.mo25585b(0);
    }

    /* renamed from: a */
    public void mo25592a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13444a, this.f13445b, bArr, i, i2);
        this.f13445b += i2;
    }

    public C5036k(byte[] bArr, int i) {
        this.f13444a = bArr;
        this.f13446c = i;
    }

    /* renamed from: a */
    public String mo25589a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13445b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f13444a, i2, (i3 >= this.f13446c || this.f13444a[i3] != 0) ? i : i - 1);
        this.f13445b += i;
        return str;
    }
}
