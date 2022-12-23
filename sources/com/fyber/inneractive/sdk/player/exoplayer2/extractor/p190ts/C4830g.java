package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.g */
public final class C4830g implements C4831h {

    /* renamed from: a */
    public final List<C4853v.C4854a> f12660a;

    /* renamed from: b */
    public final C4804n[] f12661b;

    /* renamed from: c */
    public boolean f12662c;

    /* renamed from: d */
    public int f12663d;

    /* renamed from: e */
    public int f12664e;

    /* renamed from: f */
    public long f12665f;

    public C4830g(List<C4853v.C4854a> list) {
        this.f12660a = list;
        this.f12661b = new C4804n[list.size()];
    }

    /* renamed from: a */
    public void mo25293a() {
        this.f12662c = false;
    }

    /* renamed from: b */
    public void mo25297b() {
        if (this.f12662c) {
            for (C4804n a : this.f12661b) {
                a.mo25147a(this.f12665f, 1, this.f12664e, 0, (byte[]) null);
            }
            this.f12662c = false;
        }
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        for (int i = 0; i < this.f12661b.length; i++) {
            C4853v.C4854a aVar = this.f12660a.get(i);
            dVar.mo25322a();
            C4804n a = hVar.mo25173a(dVar.mo25324c(), 3);
            a.mo25149a(C4869i.m14979a(dVar.mo25323b(), "application/dvbsubs", (String) null, -1, (List<byte[]>) Collections.singletonList(aVar.f12841b), aVar.f12840a, (C4702a) null));
            this.f12661b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        if (z) {
            this.f12662c = true;
            this.f12665f = j;
            this.f12664e = 0;
            this.f12663d = 2;
        }
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        if (!this.f12662c) {
            return;
        }
        if (this.f12663d != 2 || mo25304a(kVar, 32)) {
            if (this.f12663d != 1 || mo25304a(kVar, 0)) {
                int i = kVar.f13445b;
                int a = kVar.mo25588a();
                for (C4804n a2 : this.f12661b) {
                    kVar.mo25600e(i);
                    a2.mo25150a(kVar, a);
                }
                this.f12664e += a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25304a(C5036k kVar, int i) {
        if (kVar.mo25588a() == 0) {
            return false;
        }
        if (kVar.mo25608l() != i) {
            this.f12662c = false;
        }
        this.f12663d--;
        return this.f12662c;
    }
}
