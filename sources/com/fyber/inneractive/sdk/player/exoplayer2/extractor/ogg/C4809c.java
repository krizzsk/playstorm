package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4814h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c */
public class C4809c implements C4723f {

    /* renamed from: a */
    public C4814h f12555a;

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        boolean z;
        boolean z2;
        try {
            C4811e eVar = new C4811e();
            if (eVar.mo25286a(gVar, true)) {
                if ((eVar.f12562a & 2) == 2) {
                    int min = Math.min(eVar.f12566e, 8);
                    C5036k kVar = new C5036k(min);
                    ((C4715b) gVar).mo25136a(kVar.f13444a, 0, min, false);
                    kVar.mo25600e(0);
                    if (kVar.mo25588a() >= 5 && kVar.mo25608l() == 127 && kVar.mo25609m() == 1179402563) {
                        this.f12555a = new C4807b();
                    } else {
                        kVar.mo25600e(0);
                        try {
                            z = C4820k.m14801a(1, kVar, true);
                        } catch (C4873l unused) {
                            z = false;
                        }
                        if (z) {
                            this.f12555a = new C4818j();
                        } else {
                            kVar.mo25600e(0);
                            int i = C4813g.f12569o;
                            int a = kVar.mo25588a();
                            byte[] bArr = C4813g.f12570p;
                            if (a < bArr.length) {
                                z2 = false;
                            } else {
                                byte[] bArr2 = new byte[bArr.length];
                                int length = bArr.length;
                                System.arraycopy(kVar.f13444a, kVar.f13445b, bArr2, 0, length);
                                kVar.f13445b += length;
                                z2 = Arrays.equals(bArr2, bArr);
                            }
                            if (z2) {
                                this.f12555a = new C4813g();
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (C4873l unused2) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        C4804n a = hVar.mo25173a(0, 1);
        hVar.mo25175c();
        C4814h hVar2 = this.f12555a;
        hVar2.f12574c = hVar;
        hVar2.f12573b = a;
        hVar2.f12572a = new C4810d();
        hVar2.mo25281a(true);
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        C4814h hVar = this.f12555a;
        C4810d dVar = hVar.f12572a;
        dVar.f12556a.mo25285a();
        dVar.f12557b.mo25614r();
        dVar.f12558c = -1;
        dVar.f12560e = false;
        if (j == 0) {
            hVar.mo25281a(!hVar.f12583l);
        } else if (hVar.f12579h != 0) {
            hVar.f12576e = hVar.f12575d.mo25279c(j2);
            hVar.f12579h = 2;
        }
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        C4730g gVar2 = gVar;
        C4814h hVar = this.f12555a;
        int i = hVar.f12579h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!hVar.f12572a.mo25284a(gVar2)) {
                    hVar.f12579h = 3;
                    return -1;
                }
                C4715b bVar = (C4715b) gVar2;
                long j = bVar.f11871c;
                long j2 = hVar.f12577f;
                hVar.f12582k = j - j2;
                boolean a = hVar.mo25282a(hVar.f12572a.f12557b, j2, hVar.f12581j);
                if (a) {
                    hVar.f12577f = bVar.f11871c;
                }
                z = a;
            }
            C4869i iVar = hVar.f12581j.f12585a;
            hVar.f12580i = iVar.f12969s;
            if (!hVar.f12584m) {
                hVar.f12573b.mo25149a(iVar);
                hVar.f12584m = true;
            }
            C4812f fVar = hVar.f12581j.f12586b;
            if (fVar != null) {
                hVar.f12575d = fVar;
            } else {
                long j3 = ((C4715b) gVar2).f11870b;
                if (j3 == -1) {
                    hVar.f12575d = new C4814h.C4816b();
                } else {
                    C4811e eVar = hVar.f12572a.f12556a;
                    hVar.f12575d = new C4805a(hVar.f12577f, j3, hVar, eVar.f12565d + eVar.f12566e, eVar.f12563b);
                }
            }
            hVar.f12581j = null;
            hVar.f12579h = 2;
            C5036k kVar = hVar.f12572a.f12557b;
            byte[] bArr = kVar.f13444a;
            if (bArr.length != 65025) {
                kVar.f13444a = Arrays.copyOf(bArr, Math.max(65025, kVar.f13446c));
            }
        } else if (i == 1) {
            ((C4715b) gVar2).mo25139c((int) hVar.f12577f);
            hVar.f12579h = 2;
        } else if (i == 2) {
            long a2 = hVar.f12575d.mo25276a(gVar2);
            if (a2 >= 0) {
                lVar.f12145a = a2;
                return 1;
            }
            if (a2 < -1) {
                hVar.mo25289b(-(a2 + 2));
            }
            if (!hVar.f12583l) {
                hVar.f12574c.mo25174a(hVar.f12575d.mo25278b());
                hVar.f12583l = true;
            }
            if (hVar.f12582k > 0 || hVar.f12572a.mo25284a(gVar2)) {
                hVar.f12582k = 0;
                C5036k kVar2 = hVar.f12572a.f12557b;
                long a3 = hVar.mo25280a(kVar2);
                if (a3 >= 0) {
                    long j4 = hVar.f12578g;
                    if (j4 + a3 >= hVar.f12576e) {
                        long j5 = (j4 * 1000000) / ((long) hVar.f12580i);
                        hVar.f12573b.mo25150a(kVar2, kVar2.f13446c);
                        hVar.f12573b.mo25147a(j5, 1, kVar2.f13446c, 0, (byte[]) null);
                        hVar.f12576e = -1;
                    }
                }
                hVar.f12578g += a3;
            } else {
                hVar.f12579h = 3;
                return -1;
            }
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
