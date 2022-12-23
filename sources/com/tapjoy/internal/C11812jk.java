package com.tapjoy.internal;

import java.util.Arrays;

/* renamed from: com.tapjoy.internal.jk */
final class C11812jk extends C11804je {

    /* renamed from: f */
    final transient byte[][] f28841f;

    /* renamed from: g */
    final transient int[] f28842g;

    C11812jk(C11801jb jbVar, int i) {
        super((byte[]) null);
        C11817jo.m34348a(jbVar.f28815b, 0, (long) i);
        C11810ji jiVar = jbVar.f28814a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (jiVar.f28834c != jiVar.f28833b) {
                i3 += jiVar.f28834c - jiVar.f28833b;
                i4++;
                jiVar = jiVar.f28837f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f28841f = new byte[i4][];
        this.f28842g = new int[(i4 * 2)];
        C11810ji jiVar2 = jbVar.f28814a;
        int i5 = 0;
        while (i2 < i) {
            this.f28841f[i5] = jiVar2.f28832a;
            i2 += jiVar2.f28834c - jiVar2.f28833b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f28842g;
            iArr[i5] = i2;
            iArr[this.f28841f.length + i5] = jiVar2.f28833b;
            jiVar2.f28835d = true;
            i5++;
            jiVar2 = jiVar2.f28837f;
        }
    }

    /* renamed from: a */
    public final String mo72779a() {
        return m34333e().mo72779a();
    }

    /* renamed from: b */
    public final String mo72782b() {
        return m34333e().mo72782b();
    }

    /* renamed from: a */
    public final C11804je mo72778a(int i, int i2) {
        return m34333e().mo72778a(i, i2);
    }

    /* renamed from: a */
    public final byte mo72777a(int i) {
        int i2;
        C11817jo.m34348a((long) this.f28842g[this.f28841f.length - 1], (long) i, 1);
        int b = m34332b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f28842g[b - 1];
        }
        int[] iArr = this.f28842g;
        byte[][] bArr = this.f28841f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m34332b(int i) {
        int binarySearch = Arrays.binarySearch(this.f28842g, 0, this.f28841f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public final int mo72783c() {
        return this.f28842g[this.f28841f.length - 1];
    }

    /* renamed from: d */
    public final byte[] mo72785d() {
        int[] iArr = this.f28842g;
        byte[][] bArr = this.f28841f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f28842g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f28841f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72780a(C11801jb jbVar) {
        int length = this.f28841f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f28842g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C11810ji jiVar = new C11810ji(this.f28841f[i], i3, (i3 + i4) - i2);
            if (jbVar.f28814a == null) {
                jiVar.f28838g = jiVar;
                jiVar.f28837f = jiVar;
                jbVar.f28814a = jiVar;
            } else {
                jbVar.f28814a.f28838g.mo72794a(jiVar);
            }
            i++;
            i2 = i4;
        }
        jbVar.f28815b += (long) i2;
    }

    /* renamed from: a */
    public final boolean mo72781a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo72783c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m34332b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f28842g[b - 1];
            }
            int min = Math.min(i3, ((this.f28842g[b] - i4) + i4) - i);
            int[] iArr = this.f28842g;
            byte[][] bArr2 = this.f28841f;
            if (!C11817jo.m34350a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
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
    private C11804je m34333e() {
        return new C11804je(mo72785d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r12 instanceof com.tapjoy.internal.C11804je
            r2 = 0
            if (r1 == 0) goto L_0x005d
            com.tapjoy.internal.je r12 = (com.tapjoy.internal.C11804je) r12
            int r1 = r12.mo72783c()
            int r3 = r11.mo72783c()
            if (r1 != r3) goto L_0x005d
            int r1 = r11.mo72783c()
            int r3 = r11.mo72783c()
            int r3 = r3 - r1
            if (r3 >= 0) goto L_0x0022
        L_0x0020:
            r12 = r2
            goto L_0x005a
        L_0x0022:
            int r3 = r11.m34332b(r2)
            r4 = r2
            r5 = r4
        L_0x0028:
            if (r1 <= 0) goto L_0x0059
            if (r3 != 0) goto L_0x002e
            r6 = r2
            goto L_0x0034
        L_0x002e:
            int[] r6 = r11.f28842g
            int r7 = r3 + -1
            r6 = r6[r7]
        L_0x0034:
            int[] r7 = r11.f28842g
            r7 = r7[r3]
            int r7 = r7 - r6
            int r7 = r7 + r6
            int r7 = r7 - r4
            int r7 = java.lang.Math.min(r1, r7)
            int[] r8 = r11.f28842g
            byte[][] r9 = r11.f28841f
            int r10 = r9.length
            int r10 = r10 + r3
            r8 = r8[r10]
            int r6 = r4 - r6
            int r6 = r6 + r8
            r8 = r9[r3]
            boolean r6 = r12.mo72781a(r5, r8, r6, r7)
            if (r6 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            int r4 = r4 + r7
            int r5 = r5 + r7
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0059:
            r12 = r0
        L_0x005a:
            if (r12 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11812jk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = this.f28819d;
        if (i != 0) {
            return i;
        }
        int length = this.f28841f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f28841f[i2];
            int[] iArr = this.f28842g;
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
        this.f28819d = i3;
        return i3;
    }

    public final String toString() {
        return m34333e().toString();
    }
}
