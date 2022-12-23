package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C4860c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a */
public final class C4858a implements C4723f, C4767m {

    /* renamed from: a */
    public C4731h f12850a;

    /* renamed from: b */
    public C4804n f12851b;

    /* renamed from: c */
    public C4859b f12852c;

    /* renamed from: d */
    public int f12853d;

    /* renamed from: e */
    public int f12854e;

    /* renamed from: a */
    public boolean mo25130a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        return C4860c.m14923a(gVar) != null;
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: c */
    public long mo25131c() {
        C4859b bVar = this.f12852c;
        return ((bVar.f12862h / ((long) bVar.f12858d)) * 1000000) / ((long) bVar.f12856b);
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12850a = hVar;
        this.f12851b = hVar.mo25173a(0, 1);
        this.f12852c = null;
        hVar.mo25175c();
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12854e = 0;
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        C4730g gVar2 = gVar;
        if (this.f12852c == null) {
            C4859b a = C4860c.m14923a(gVar);
            this.f12852c = a;
            if (a != null) {
                int i = a.f12856b;
                int i2 = a.f12855a;
                this.f12851b.mo25149a(C4869i.m14975a((String) null, "audio/raw", (String) null, a.f12859e * i * i2, 32768, i2, i, a.f12860f, (List<byte[]>) null, (C4702a) null, 0, (String) null));
                this.f12853d = this.f12852c.f12858d;
            } else {
                throw new C4873l("Unsupported or unrecognized wav header.");
            }
        }
        C4859b bVar = this.f12852c;
        if (!((bVar.f12861g == 0 || bVar.f12862h == 0) ? false : true)) {
            gVar.getClass();
            bVar.getClass();
            C4715b bVar2 = (C4715b) gVar2;
            bVar2.f11873e = 0;
            C5036k kVar = new C5036k(8);
            C4860c.C4861a a2 = C4860c.C4861a.m14924a(gVar2, kVar);
            while (a2.f12863a != C5049u.m15386a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f12863a);
                long j = a2.f12864b + 8;
                if (a2.f12863a == C5049u.m15386a("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bVar2.mo25139c((int) j);
                    a2 = C4860c.C4861a.m14924a(gVar2, kVar);
                } else {
                    throw new C4873l("Chunk is too large (~2GB+) to skip; id: " + a2.f12863a);
                }
            }
            bVar2.mo25139c(8);
            long j2 = bVar2.f11871c;
            long j3 = a2.f12864b;
            bVar.f12861g = j2;
            bVar.f12862h = j3;
            this.f12850a.mo25174a(this);
        }
        int a3 = this.f12851b.mo25143a(gVar2, 32768 - this.f12854e, true);
        if (a3 != -1) {
            this.f12854e += a3;
        }
        int i3 = this.f12854e;
        int i4 = this.f12853d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            C4859b bVar3 = this.f12852c;
            int i6 = i5 * i4;
            int i7 = i3 - i6;
            this.f12854e = i7;
            this.f12851b.mo25147a(((((C4715b) gVar2).f11871c - ((long) i3)) * 1000000) / ((long) bVar3.f12857c), 1, i6, i7, (byte[]) null);
        }
        if (a3 == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public long mo25129a(long j) {
        C4859b bVar = this.f12852c;
        long j2 = (long) bVar.f12858d;
        return Math.min((((j * ((long) bVar.f12857c)) / 1000000) / j2) * j2, bVar.f12862h - j2) + bVar.f12861g;
    }
}
