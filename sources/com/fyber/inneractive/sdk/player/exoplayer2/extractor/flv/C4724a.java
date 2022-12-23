package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4727d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5026c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a */
public final class C4724a extends C4727d {

    /* renamed from: e */
    public static final int[] f11912e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f11913b;

    /* renamed from: c */
    public boolean f11914c;

    /* renamed from: d */
    public int f11915d;

    public C4724a(C4804n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo25168a(C5036k kVar) throws C4727d.C4728a {
        if (!this.f11913b) {
            int l = kVar.mo25608l();
            int i = (l >> 4) & 15;
            this.f11915d = i;
            if (i == 2) {
                this.f11931a.mo25149a(C4869i.m14975a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f11912e[(l >> 2) & 3], -1, (List<byte[]>) null, (C4702a) null, 0, (String) null));
                this.f11914c = true;
            } else if (i == 7 || i == 8) {
                this.f11931a.mo25149a(C4869i.m14975a((String) null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (l & 1) == 1 ? 2 : 3, (List<byte[]>) null, (C4702a) null, 0, (String) null));
                this.f11914c = true;
            } else if (i != 10) {
                throw new C4727d.C4728a("Audio format not supported: " + this.f11915d);
            }
            this.f11913b = true;
        } else {
            kVar.mo25602f(1);
        }
        return true;
    }

    /* renamed from: b */
    public void mo25169b(C5036k kVar, long j) {
        C5036k kVar2 = kVar;
        if (this.f11915d == 2) {
            int a = kVar.mo25588a();
            this.f11931a.mo25150a(kVar2, a);
            this.f11931a.mo25147a(j, 1, a, 0, (byte[]) null);
            return;
        }
        int l = kVar.mo25608l();
        if (l == 0 && !this.f11914c) {
            int a2 = kVar.mo25588a();
            byte[] bArr = new byte[a2];
            System.arraycopy(kVar2.f13444a, kVar2.f13445b, bArr, 0, a2);
            kVar2.f13445b += a2;
            Pair<Integer, Integer> a3 = C5026c.m15309a(bArr);
            this.f11931a.mo25149a(C4869i.m14975a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr), (C4702a) null, 0, (String) null));
            this.f11914c = true;
        } else if (this.f11915d != 10 || l == 1) {
            int a4 = kVar.mo25588a();
            this.f11931a.mo25150a(kVar2, a4);
            this.f11931a.mo25147a(j, 1, a4, 0, (byte[]) null);
        }
    }
}
