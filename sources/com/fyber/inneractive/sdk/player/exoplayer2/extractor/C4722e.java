package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.e */
public final class C4722e implements C4804n {
    /* renamed from: a */
    public int mo25143a(C4730g gVar, int i, boolean z) throws IOException, InterruptedException {
        int b = ((C4715b) gVar).mo25137b(i);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo25147a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public void mo25149a(C4869i iVar) {
    }

    /* renamed from: a */
    public void mo25150a(C5036k kVar, int i) {
        kVar.mo25600e(kVar.f13445b + i);
    }
}
