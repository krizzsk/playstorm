package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a */
public final class C4824a implements C4723f {

    /* renamed from: e */
    public static final int f12607e = C5049u.m15386a("ID3");

    /* renamed from: a */
    public final long f12608a;

    /* renamed from: b */
    public final C5036k f12609b = new C5036k(2786);

    /* renamed from: c */
    public C4825b f12610c;

    /* renamed from: d */
    public boolean f12611d;

    public C4824a(long j) {
        this.f12608a = j;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        C4715b bVar;
        int i;
        C5036k kVar = new C5036k(10);
        int i2 = 0;
        while (true) {
            bVar = (C4715b) gVar;
            bVar.mo25136a(kVar.f13444a, 0, 10, false);
            kVar.mo25600e(0);
            if (kVar.mo25610n() != f12607e) {
                break;
            }
            kVar.mo25602f(3);
            int k = kVar.mo25607k();
            i2 += k + 10;
            bVar.mo25135a(k, false);
        }
        bVar.f11873e = 0;
        bVar.mo25135a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            bVar.mo25136a(kVar.f13444a, 0, 5, false);
            kVar.mo25600e(0);
            if (kVar.mo25613q() != 2935) {
                bVar.f11873e = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                bVar.mo25135a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = kVar.f13444a;
                if (bArr.length < 5) {
                    i = -1;
                } else {
                    i = C4678a.m14382a((bArr[4] & 192) >> 6, bArr[4] & 63);
                }
                if (i == -1) {
                    return false;
                }
                bVar.mo25135a(i - 5, false);
            }
        }
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        C4825b bVar = new C4825b((String) null);
        this.f12610c = bVar;
        bVar.f12615d = "0";
        bVar.f12616e = hVar.mo25173a(0, 1);
        hVar.mo25175c();
        hVar.mo25174a(new C4767m.C4768a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12611d = false;
        this.f12610c.mo25293a();
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        int a = ((C4715b) gVar).mo25132a(this.f12609b.f13444a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f12609b.mo25600e(0);
        this.f12609b.mo25598d(a);
        if (!this.f12611d) {
            this.f12610c.f12623l = this.f12608a;
            this.f12611d = true;
        }
        this.f12610c.mo25296a(this.f12609b);
        return 0;
    }
}
