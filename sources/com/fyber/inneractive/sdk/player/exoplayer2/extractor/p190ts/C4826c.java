package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c */
public final class C4826c implements C4723f {

    /* renamed from: e */
    public static final int f12624e = C5049u.m15386a("ID3");

    /* renamed from: a */
    public final long f12625a;

    /* renamed from: b */
    public final C5036k f12626b = new C5036k(200);

    /* renamed from: c */
    public C4827d f12627c;

    /* renamed from: d */
    public boolean f12628d;

    public C4826c(long j) {
        this.f12625a = j;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        C4715b bVar;
        C5036k kVar = new C5036k(10);
        byte[] bArr = kVar.f13444a;
        C5035j jVar = new C5035j(bArr, bArr.length);
        int i = 0;
        while (true) {
            bVar = (C4715b) gVar;
            bVar.mo25136a(kVar.f13444a, 0, 10, false);
            kVar.mo25600e(0);
            if (kVar.mo25610n() != f12624e) {
                break;
            }
            kVar.mo25602f(3);
            int k = kVar.mo25607k();
            i += k + 10;
            bVar.mo25135a(k, false);
        }
        bVar.f11873e = 0;
        bVar.mo25135a(i, false);
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (true) {
            bVar.mo25136a(kVar.f13444a, 0, 2, false);
            kVar.mo25600e(0);
            if ((kVar.mo25613q() & 65526) != 65520) {
                bVar.f11873e = 0;
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                bVar.mo25135a(i4, false);
                i2 = 0;
                i3 = 0;
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                bVar.mo25136a(kVar.f13444a, 0, 4, false);
                jVar.mo25585b(14);
                int a = jVar.mo25583a(13);
                if (a <= 6) {
                    return false;
                }
                bVar.mo25135a(a - 6, false);
                i3 += a;
            }
        }
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        C4827d dVar = new C4827d(true, (String) null);
        this.f12627c = dVar;
        dVar.mo25295a(hVar, new C4853v.C4857d(Integer.MIN_VALUE, 0, 1));
        hVar.mo25175c();
        hVar.mo25174a(new C4767m.C4768a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12628d = false;
        this.f12627c.mo25299c();
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        int a = ((C4715b) gVar).mo25132a(this.f12626b.f13444a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.f12626b.mo25600e(0);
        this.f12626b.mo25598d(a);
        if (!this.f12628d) {
            this.f12627c.f12644o = this.f12625a;
            this.f12628d = true;
        }
        this.f12627c.mo25296a(this.f12626b);
        return 0;
    }
}
