package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.g */
public final class C4693g {

    /* renamed from: a */
    public final int f11795a;

    /* renamed from: b */
    public final int f11796b;

    /* renamed from: c */
    public final int f11797c;

    /* renamed from: d */
    public final int f11798d;

    /* renamed from: e */
    public final int f11799e;

    /* renamed from: f */
    public final short[] f11800f;

    /* renamed from: g */
    public int f11801g;

    /* renamed from: h */
    public short[] f11802h;

    /* renamed from: i */
    public int f11803i;

    /* renamed from: j */
    public short[] f11804j;

    /* renamed from: k */
    public int f11805k;

    /* renamed from: l */
    public short[] f11806l;

    /* renamed from: m */
    public int f11807m = 0;

    /* renamed from: n */
    public int f11808n = 0;

    /* renamed from: o */
    public float f11809o = 1.0f;

    /* renamed from: p */
    public float f11810p = 1.0f;

    /* renamed from: q */
    public int f11811q;

    /* renamed from: r */
    public int f11812r;

    /* renamed from: s */
    public int f11813s;

    /* renamed from: t */
    public int f11814t;

    /* renamed from: u */
    public int f11815u = 0;

    /* renamed from: v */
    public int f11816v;

    /* renamed from: w */
    public int f11817w;

    /* renamed from: x */
    public int f11818x;

    public C4693g(int i, int i2) {
        this.f11795a = i;
        this.f11796b = i2;
        this.f11797c = i / 400;
        int i3 = i / 65;
        this.f11798d = i3;
        int i4 = i3 * 2;
        this.f11799e = i4;
        this.f11800f = new short[i4];
        this.f11801g = i4;
        int i5 = i2 * i4;
        this.f11802h = new short[i5];
        this.f11803i = i4;
        this.f11804j = new short[i5];
        this.f11805k = i4;
        this.f11806l = new short[i5];
    }

    /* renamed from: a */
    public final void mo25097a(int i) {
        int i2 = this.f11811q + i;
        int i3 = this.f11801g;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11801g = i4;
            this.f11802h = Arrays.copyOf(this.f11802h, i4 * this.f11796b);
        }
    }

    /* renamed from: b */
    public final void mo25099b(int i) {
        int i2 = this.f11812r + i;
        int i3 = this.f11803i;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11803i = i4;
            this.f11804j = Arrays.copyOf(this.f11804j, i4 * this.f11796b);
        }
    }

    /* renamed from: a */
    public final void mo25098a(short[] sArr, int i, int i2) {
        mo25099b(i2);
        int i3 = this.f11796b;
        System.arraycopy(sArr, i * i3, this.f11804j, this.f11812r * i3, i3 * i2);
        this.f11812r += i2;
    }

    /* renamed from: b */
    public final void mo25100b(short[] sArr, int i, int i2) {
        int i3 = this.f11799e / i2;
        int i4 = this.f11796b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f11800f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    public final int mo25095a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f11796b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f11817w = i5 / i7;
        this.f11818x = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    public final void mo25096a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f11812r;
        float f = this.f11809o / this.f11810p;
        double d = (double) f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f11811q;
            if (i10 >= this.f11799e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f11814t;
                    if (i12 > 0) {
                        int min = Math.min(this.f11799e, i12);
                        mo25098a(this.f11802h, i11, min);
                        this.f11814t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.f11802h;
                        int i13 = this.f11795a;
                        int i14 = i13 > 4000 ? i13 / TTAdSdk.INIT_LOCAL_FAIL_CODE : i9;
                        if (this.f11796b == i9 && i14 == i9) {
                            i5 = mo25095a(sArr, i11, this.f11797c, this.f11798d);
                        } else {
                            mo25100b(sArr, i11, i14);
                            int a = mo25095a(this.f11800f, 0, this.f11797c / i14, this.f11798d / i14);
                            if (i14 != i9) {
                                int i15 = a * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f11797c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f11798d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f11796b == i9) {
                                    i5 = mo25095a(sArr, i11, i17, i18);
                                } else {
                                    mo25100b(sArr, i11, i9);
                                    i5 = mo25095a(this.f11800f, 0, i17, i18);
                                }
                            } else {
                                i5 = a;
                            }
                        }
                        int i21 = this.f11817w;
                        int i22 = ((i21 == 0 || this.f11815u == 0 || this.f11818x > i21 * 3 || i21 * 2 <= this.f11816v * 3) ? 0 : i9) != 0 ? this.f11815u : i5;
                        this.f11816v = i21;
                        this.f11815u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f11802h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i22) / (f - 1.0f));
                            } else {
                                this.f11814t = (int) ((((float) i22) * (2.0f - f)) / (f - 1.0f));
                                i7 = i22;
                            }
                            mo25099b(i7);
                            int i23 = i7;
                            m14438a(i7, this.f11796b, this.f11804j, this.f11812r, sArr2, i11, sArr2, i11 + i22);
                            this.f11812r += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.f11802h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i24) * f) / (1.0f - f));
                            } else {
                                this.f11814t = (int) ((((float) i24) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i6 = i24;
                            }
                            int i25 = i24 + i6;
                            mo25099b(i25);
                            int i26 = this.f11796b;
                            System.arraycopy(sArr3, i11 * i26, this.f11804j, this.f11812r * i26, i26 * i24);
                            m14438a(i6, this.f11796b, this.f11804j, this.f11812r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.f11812r += i25;
                            i11 += i6;
                        }
                    }
                    if (this.f11799e + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i27 = this.f11811q - i11;
                short[] sArr4 = this.f11802h;
                int i28 = this.f11796b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.f11811q = i27;
            }
        } else {
            mo25098a(this.f11802h, 0, this.f11811q);
            this.f11811q = 0;
        }
        float f2 = this.f11810p;
        if (f2 != 1.0f && this.f11812r != i8) {
            int i29 = this.f11795a;
            int i30 = (int) (((float) i29) / f2);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.f11812r - i8;
            int i32 = this.f11813s + i31;
            int i33 = this.f11805k;
            if (i32 > i33) {
                int i34 = i33 + (i33 / 2) + i31;
                this.f11805k = i34;
                this.f11806l = Arrays.copyOf(this.f11806l, i34 * this.f11796b);
            }
            short[] sArr5 = this.f11804j;
            int i35 = this.f11796b;
            System.arraycopy(sArr5, i8 * i35, this.f11806l, this.f11813s * i35, i35 * i31);
            this.f11812r = i8;
            this.f11813s += i31;
            int i36 = 0;
            while (true) {
                i = this.f11813s;
                i2 = i - 1;
                if (i36 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f11807m + 1;
                    int i37 = i3 * i30;
                    i4 = this.f11808n;
                    if (i37 <= i4 * i29) {
                        break;
                    }
                    mo25099b(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f11796b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f11806l;
                        int i40 = (i36 * i39) + i38;
                        short s = sArr6[i40];
                        short s2 = sArr6[i40 + i39];
                        int i41 = this.f11807m;
                        int i42 = i41 * i30;
                        int i43 = (i41 + 1) * i30;
                        int i44 = i43 - (this.f11808n * i29);
                        int i45 = i43 - i42;
                        this.f11804j[(this.f11812r * i39) + i38] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i38++;
                    }
                    this.f11808n++;
                    this.f11812r++;
                }
                this.f11807m = i3;
                if (i3 == i29) {
                    this.f11807m = 0;
                    C5023a.m15304b(i4 == i30);
                    this.f11808n = 0;
                }
                i36++;
            }
            if (i2 != 0) {
                short[] sArr7 = this.f11806l;
                int i46 = this.f11796b;
                System.arraycopy(sArr7, i2 * i46, sArr7, 0, (i - i2) * i46);
                this.f11813s -= i2;
            }
        }
    }

    /* renamed from: a */
    public static void m14438a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
