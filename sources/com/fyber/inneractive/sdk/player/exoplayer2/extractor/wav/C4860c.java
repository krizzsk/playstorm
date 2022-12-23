package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c */
public final class C4860c {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c$a */
    public static final class C4861a {

        /* renamed from: a */
        public final int f12863a;

        /* renamed from: b */
        public final long f12864b;

        public C4861a(int i, long j) {
            this.f12863a = i;
            this.f12864b = j;
        }

        /* renamed from: a */
        public static C4861a m14924a(C4730g gVar, C5036k kVar) throws IOException, InterruptedException {
            ((C4715b) gVar).mo25136a(kVar.f13444a, 0, 8, false);
            kVar.mo25600e(0);
            return new C4861a(kVar.mo25595c(), kVar.mo25601f());
        }
    }

    /* renamed from: a */
    public static C4859b m14923a(C4730g gVar) throws IOException, InterruptedException {
        gVar.getClass();
        C5036k kVar = new C5036k(16);
        if (C4861a.m14924a(gVar, kVar).f12863a != C5049u.m15386a("RIFF")) {
            return null;
        }
        C4715b bVar = (C4715b) gVar;
        bVar.mo25136a(kVar.f13444a, 0, 4, false);
        kVar.mo25600e(0);
        int c = kVar.mo25595c();
        if (c != C5049u.m15386a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + c);
            return null;
        }
        C4861a a = C4861a.m14924a(gVar, kVar);
        while (a.f12863a != C5049u.m15386a("fmt ")) {
            bVar.mo25135a((int) a.f12864b, false);
            a = C4861a.m14924a(gVar, kVar);
        }
        C5023a.m15304b(a.f12864b >= 16);
        bVar.mo25136a(kVar.f13444a, 0, 16, false);
        kVar.mo25600e(0);
        int h = kVar.mo25604h();
        int h2 = kVar.mo25604h();
        int g = kVar.mo25603g();
        int g2 = kVar.mo25603g();
        int h3 = kVar.mo25604h();
        int h4 = kVar.mo25604h();
        int i = (h2 * h4) / 8;
        if (h3 == i) {
            int a2 = C5049u.m15384a(h4);
            if (a2 == 0) {
                Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + h4);
                return null;
            } else if (h == 1 || h == 65534) {
                bVar.mo25135a(((int) a.f12864b) - 16, false);
                return new C4859b(h2, g, g2, h3, h4, a2);
            } else {
                Log.e("WavHeaderReader", "Unsupported WAV format type: " + h);
                return null;
            }
        } else {
            throw new C4873l("Expected block alignment: " + i + "; got: " + h3);
        }
    }
}
