package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f */
public final class C4778f {

    /* renamed from: d */
    public static final long[] f12255d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f12256a = new byte[8];

    /* renamed from: b */
    public int f12257b;

    /* renamed from: c */
    public int f12258c;

    /* renamed from: a */
    public long mo25256a(C4730g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f12257b == 0) {
            if (!((C4715b) gVar).mo25138b(this.f12256a, 0, 1, z)) {
                return -1;
            }
            int a = m14675a(this.f12256a[0] & 255);
            this.f12258c = a;
            if (a != -1) {
                this.f12257b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f12258c;
        if (i2 > i) {
            this.f12257b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((C4715b) gVar).mo25138b(this.f12256a, 1, i2 - 1, false);
        }
        this.f12257b = 0;
        return m14676a(this.f12256a, this.f12258c, z2);
    }

    /* renamed from: a */
    public static int m14675a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f12255d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m14676a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f12255d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
