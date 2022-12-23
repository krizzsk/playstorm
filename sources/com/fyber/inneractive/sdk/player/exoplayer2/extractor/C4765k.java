package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.k */
public final class C4765k {

    /* renamed from: h */
    public static final String[] f12131h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f12132i = {44100, OpusUtil.SAMPLE_RATE, 32000};

    /* renamed from: j */
    public static final int[] f12133j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    public static final int[] f12134k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    public static final int[] f12135l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    public static final int[] f12136m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    public static final int[] f12137n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f12138a;

    /* renamed from: b */
    public String f12139b;

    /* renamed from: c */
    public int f12140c;

    /* renamed from: d */
    public int f12141d;

    /* renamed from: e */
    public int f12142e;

    /* renamed from: f */
    public int f12143f;

    /* renamed from: g */
    public int f12144g;

    /* renamed from: a */
    public static int m14643a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f12132i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f12133j[i4 - 1] : f12134k[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f12135l[i4 - 1] : f12136m[i4 - 1];
        } else {
            i6 = f12137n[i4 - 1];
        }
        int i9 = 144000;
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: a */
    public static boolean m14644a(int i, C4765k kVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = f12132i[i5];
        int i11 = 2;
        if (i2 == 2) {
            i10 /= 2;
        } else if (i2 == 0) {
            i10 /= 4;
        }
        int i12 = (i >>> 9) & 1;
        int i13 = 1152;
        if (i3 == 3) {
            i7 = i2 == 3 ? f12133j[i4 - 1] : f12134k[i4 - 1];
            i13 = 384;
            i6 = (((i7 * 12000) / i10) + i12) * 4;
        } else {
            int i14 = 144000;
            if (i2 == 3) {
                i8 = i3 == 2 ? f12135l[i4 - 1] : f12136m[i4 - 1];
                i9 = (144000 * i8) / i10;
            } else {
                i8 = f12137n[i4 - 1];
                if (i3 == 1) {
                    i13 = 576;
                }
                if (i3 == 1) {
                    i14 = DefaultOggSeeker.MATCH_RANGE;
                }
                i9 = (i14 * i8) / i10;
            }
            i6 = i12 + i9;
        }
        String str = f12131h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i11 = 1;
        }
        kVar.f12138a = i2;
        kVar.f12139b = str;
        kVar.f12140c = i6;
        kVar.f12141d = i10;
        kVar.f12142e = i11;
        kVar.f12143f = i7 * 1000;
        kVar.f12144g = i13;
        return true;
    }
}
