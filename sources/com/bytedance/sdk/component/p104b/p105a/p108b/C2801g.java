package com.bytedance.sdk.component.p104b.p105a.p108b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.g */
/* compiled from: SegmentedByteString */
final class C2801g extends C2798d {

    /* renamed from: g */
    final transient byte[][] f6303g;

    /* renamed from: h */
    final transient int[] f6304h;

    C2801g(C2795a aVar, int i) {
        super((byte[]) null);
        C2803i.m7672a(aVar.f6287b, 0, (long) i);
        C2799e eVar = aVar.f6286a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (eVar.f6296c != eVar.f6295b) {
                i3 += eVar.f6296c - eVar.f6295b;
                i4++;
                eVar = eVar.f6299f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f6303g = new byte[i4][];
        this.f6304h = new int[(i4 * 2)];
        C2799e eVar2 = aVar.f6286a;
        int i5 = 0;
        while (i2 < i) {
            this.f6303g[i5] = eVar2.f6294a;
            i2 += eVar2.f6296c - eVar2.f6295b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f6304h;
            iArr[i5] = i2;
            iArr[this.f6303g.length + i5] = eVar2.f6295b;
            eVar2.f6297d = true;
            i5++;
            eVar2 = eVar2.f6299f;
        }
    }

    /* renamed from: a */
    public String mo17540a() {
        return m7657e().mo17540a();
    }

    /* renamed from: b */
    public String mo17543b() {
        return m7657e().mo17543b();
    }

    /* renamed from: a */
    public C2798d mo17539a(int i, int i2) {
        return m7657e().mo17539a(i, i2);
    }

    /* renamed from: a */
    public byte mo17537a(int i) {
        int i2;
        C2803i.m7672a((long) this.f6304h[this.f6303g.length - 1], (long) i, 1);
        int b = m7656b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f6304h[b - 1];
        }
        int[] iArr = this.f6304h;
        byte[][] bArr = this.f6303g;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m7656b(int i) {
        int binarySearch = Arrays.binarySearch(this.f6304h, 0, this.f6303g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public int mo17544c() {
        return this.f6304h[this.f6303g.length - 1];
    }

    /* renamed from: d */
    public byte[] mo17546d() {
        int[] iArr = this.f6304h;
        byte[][] bArr = this.f6303g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f6304h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f6303g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: a */
    public boolean mo17541a(int i, C2798d dVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo17544c() - i3) {
            return false;
        }
        int b = m7656b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f6304h[b - 1];
            }
            int min = Math.min(i3, ((this.f6304h[b] - i4) + i4) - i);
            int[] iArr = this.f6304h;
            byte[][] bArr = this.f6303g;
            if (!dVar.mo17542a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo17542a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo17544c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m7656b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f6304h[b - 1];
            }
            int min = Math.min(i3, ((this.f6304h[b] - i4) + i4) - i);
            int[] iArr = this.f6304h;
            byte[][] bArr2 = this.f6303g;
            if (!C2803i.m7674a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: e */
    private C2798d m7657e() {
        return new C2798d(mo17546d());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2798d) {
            C2798d dVar = (C2798d) obj;
            if (dVar.mo17544c() == mo17544c() && mo17541a(0, dVar, 0, mo17544c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f6292e;
        if (i != 0) {
            return i;
        }
        int length = this.f6303g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f6303g[i2];
            int[] iArr = this.f6304h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f6292e = i3;
        return i3;
    }

    public String toString() {
        return m7657e().toString();
    }
}
