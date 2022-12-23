package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.c */
public final class C5063c {

    /* renamed from: a */
    public final List<byte[]> f13542a;

    /* renamed from: b */
    public final int f13543b;

    public C5063c(List<byte[]> list, int i) {
        this.f13542a = list;
        this.f13543b = i;
    }

    /* renamed from: a */
    public static C5063c m15429a(C5036k kVar) throws C4873l {
        List list;
        try {
            kVar.mo25602f(21);
            int l = kVar.mo25608l() & 3;
            int l2 = kVar.mo25608l();
            int i = kVar.f13445b;
            int i2 = 0;
            for (int i3 = 0; i3 < l2; i3++) {
                kVar.mo25602f(1);
                int q = kVar.mo25613q();
                for (int i4 = 0; i4 < q; i4++) {
                    int q2 = kVar.mo25613q();
                    i2 += q2 + 4;
                    kVar.mo25602f(q2);
                }
            }
            kVar.mo25600e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < l2; i6++) {
                kVar.mo25602f(1);
                int q3 = kVar.mo25613q();
                for (int i7 = 0; i7 < q3; i7++) {
                    int q4 = kVar.mo25613q();
                    byte[] bArr2 = C5032i.f13423a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, length, q4);
                    i5 = length + q4;
                    kVar.mo25602f(q4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C5063c(list, l + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4873l("Error parsing HEVC config", e);
        }
    }
}
