package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e */
public final class C4777e {

    /* renamed from: a */
    public final C5036k f12253a = new C5036k(8);

    /* renamed from: b */
    public int f12254b;

    /* renamed from: a */
    public final long mo25255a(C4730g gVar) throws IOException, InterruptedException {
        C4715b bVar = (C4715b) gVar;
        int i = 0;
        bVar.mo25136a(this.f12253a.f13444a, 0, 1, false);
        byte b = this.f12253a.f13444a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        bVar.mo25136a(this.f12253a.f13444a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f12253a.f13444a[i] & 255) + (i4 << 8);
        }
        this.f12254b += i3 + 1;
        return (long) i4;
    }
}
