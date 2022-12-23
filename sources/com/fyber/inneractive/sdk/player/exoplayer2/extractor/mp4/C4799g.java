package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g */
public final class C4799g {

    /* renamed from: a */
    public static final int[] f12497a = {C5049u.m15386a("isom"), C5049u.m15386a("iso2"), C5049u.m15386a("iso3"), C5049u.m15386a("iso4"), C5049u.m15386a("iso5"), C5049u.m15386a("iso6"), C5049u.m15386a("avc1"), C5049u.m15386a("hvc1"), C5049u.m15386a("hev1"), C5049u.m15386a("mp41"), C5049u.m15386a("mp42"), C5049u.m15386a("3g2a"), C5049u.m15386a("3g2b"), C5049u.m15386a("3gr6"), C5049u.m15386a("3gs6"), C5049u.m15386a("3ge6"), C5049u.m15386a("3gg6"), C5049u.m15386a("M4V "), C5049u.m15386a("M4A "), C5049u.m15386a("f4v "), C5049u.m15386a("kddi"), C5049u.m15386a("M4VP"), C5049u.m15386a("qt  "), C5049u.m15386a("MSNV")};

    /* renamed from: a */
    public static boolean m14745a(C4730g gVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        boolean z4;
        C4715b bVar = (C4715b) gVar;
        long j = bVar.f11870b;
        if (j == -1 || j > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = 4096;
        }
        int i = (int) j;
        C5036k kVar = new C5036k(64);
        int i2 = 0;
        boolean z5 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            kVar.mo25596c(8);
            bVar.mo25136a(kVar.f13444a, 0, 8, false);
            long m = kVar.mo25609m();
            int c = kVar.mo25595c();
            int i3 = 16;
            if (m == 1) {
                bVar.mo25136a(kVar.f13444a, 8, 8, false);
                kVar.mo25598d(16);
                m = kVar.mo25612p();
            } else {
                i3 = 8;
            }
            long j2 = (long) i3;
            if (m < j2) {
                return false;
            }
            i2 += i3;
            if (c != C4784a.f12290C) {
                if (c == C4784a.f12308L || c == C4784a.f12312N) {
                    z2 = true;
                    z3 = true;
                } else if ((((long) i2) + m) - j2 >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (m - j2);
                    i2 += i4;
                    if (c == C4784a.f12328b) {
                        if (i4 < 8) {
                            return false;
                        }
                        kVar.mo25596c(i4);
                        bVar.mo25136a(kVar.f13444a, 0, i4, false);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                kVar.mo25602f(4);
                            } else {
                                int c2 = kVar.mo25595c();
                                if ((c2 >>> 8) != C5049u.m15386a("3gp")) {
                                    int[] iArr = f12497a;
                                    int length = iArr.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length) {
                                            z4 = false;
                                            break;
                                        } else if (iArr[i7] == c2) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    z5 = true;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (!z5) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        bVar.mo25135a(i4, false);
                    }
                }
            }
        }
        z2 = true;
        z3 = false;
        if (!z5 || z != z3) {
            return false;
        }
        return z2;
    }
}
