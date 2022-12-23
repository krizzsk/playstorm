package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k */
public final class C4820k {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a */
    public static final class C4821a {
        public C4821a(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b */
    public static final class C4822b {

        /* renamed from: a */
        public final boolean f12600a;

        public C4822b(boolean z, int i, int i2, int i3) {
            this.f12600a = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c */
    public static final class C4823c {

        /* renamed from: a */
        public final int f12601a;

        /* renamed from: b */
        public final long f12602b;

        /* renamed from: c */
        public final int f12603c;

        /* renamed from: d */
        public final int f12604d;

        /* renamed from: e */
        public final int f12605e;

        /* renamed from: f */
        public final byte[] f12606f;

        public C4823c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f12601a = i;
            this.f12602b = j2;
            this.f12603c = i3;
            this.f12604d = i5;
            this.f12605e = i6;
            this.f12606f = bArr;
        }
    }

    /* renamed from: a */
    public static int m14800a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m14801a(int i, C5036k kVar, boolean z) throws C4873l {
        if (kVar.mo25588a() < 7) {
            if (z) {
                return false;
            }
            throw new C4873l("too short header: " + kVar.mo25588a());
        } else if (kVar.mo25608l() != i) {
            if (z) {
                return false;
            }
            throw new C4873l("expected header type " + Integer.toHexString(i));
        } else if (kVar.mo25608l() == 118 && kVar.mo25608l() == 111 && kVar.mo25608l() == 114 && kVar.mo25608l() == 98 && kVar.mo25608l() == 105 && kVar.mo25608l() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C4873l("expected characters 'vorbis'");
        }
    }
}
