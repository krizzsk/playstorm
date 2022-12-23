package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4734c;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c */
public abstract class C4922c extends C4920a {

    /* renamed from: i */
    public byte[] f13109i;

    /* renamed from: j */
    public int f13110j;

    /* renamed from: k */
    public volatile boolean f13111k;

    public C4922c(C4996g gVar, C5000j jVar, int i, C4869i iVar, int i2, Object obj, byte[] bArr) {
        super(gVar, jVar, i, iVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f13109i = bArr;
    }

    /* renamed from: a */
    public final boolean mo25185a() {
        return this.f13111k;
    }

    /* renamed from: b */
    public final void mo25186b() {
        this.f13111k = true;
    }

    /* renamed from: c */
    public long mo25187c() {
        return (long) this.f13110j;
    }

    public final void load() throws IOException, InterruptedException {
        try {
            this.f13108h.mo24831a(this.f13101a);
            int i = 0;
            this.f13110j = 0;
            while (i != -1 && !this.f13111k) {
                byte[] bArr = this.f13109i;
                if (bArr == null) {
                    this.f13109i = new byte[16384];
                } else if (bArr.length < this.f13110j + 16384) {
                    this.f13109i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f13108h.mo24830a(this.f13109i, this.f13110j, 16384);
                if (i != -1) {
                    this.f13110j += i;
                }
            }
            if (!this.f13111k) {
                ((C4734c.C4735a) this).f11959m = Arrays.copyOf(this.f13109i, this.f13110j);
            }
        } finally {
            C5049u.m15390a(this.f13108h);
        }
    }
}
