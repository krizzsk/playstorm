package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.a */
public final class C4678a {

    /* renamed from: a */
    public static final int[] f11698a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f11699b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: c */
    public static final int[] f11700c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: d */
    public static final int[] f11701d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f11702e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f11703f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m14382a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f11699b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f11703f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f11702e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
