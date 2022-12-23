package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a */
public final class C4875a {

    /* renamed from: a */
    public final String f12982a;

    /* renamed from: b */
    public final boolean f12983b;

    /* renamed from: c */
    public final boolean f12984c;

    /* renamed from: d */
    public final String f12985d;

    /* renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f12986e;

    public C4875a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        this.f12982a = (String) C5023a.m15300a(str);
        this.f12985d = str2;
        this.f12986e = codecCapabilities;
        boolean z2 = true;
        this.f12983b = !z && codecCapabilities != null && m14985a(codecCapabilities);
        this.f12984c = (codecCapabilities == null || !m14987b(codecCapabilities)) ? false : z2;
    }

    /* renamed from: b */
    public static boolean m14987b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5049u.f13471a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: a */
    public boolean mo25386a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12986e;
        if (codecCapabilities == null) {
            mo25385a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo25385a("sizeAndRate.vCaps");
            return false;
        } else if (m14986a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m14986a(videoCapabilities, i2, i, d)) {
                mo25385a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f12982a + ", " + this.f12985d + "] [" + C5049u.f13475e + "]");
            return true;
        }
    }

    /* renamed from: a */
    public final void mo25385a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f12982a + ", " + this.f12985d + "] [" + C5049u.f13475e + "]");
    }

    /* renamed from: a */
    public static boolean m14985a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5049u.f13471a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: a */
    public static boolean m14986a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
