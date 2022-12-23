package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b */
public final class C4725b implements C4723f, C4767m {

    /* renamed from: n */
    public static final int f11916n = C5049u.m15386a("FLV");

    /* renamed from: a */
    public final C5036k f11917a = new C5036k(4);

    /* renamed from: b */
    public final C5036k f11918b = new C5036k(9);

    /* renamed from: c */
    public final C5036k f11919c = new C5036k(11);

    /* renamed from: d */
    public final C5036k f11920d = new C5036k();

    /* renamed from: e */
    public C4731h f11921e;

    /* renamed from: f */
    public int f11922f = 1;

    /* renamed from: g */
    public int f11923g;

    /* renamed from: h */
    public int f11924h;

    /* renamed from: i */
    public int f11925i;

    /* renamed from: j */
    public long f11926j;

    /* renamed from: k */
    public C4724a f11927k;

    /* renamed from: l */
    public C4729e f11928l;

    /* renamed from: m */
    public C4726c f11929m;

    /* renamed from: a */
    public long mo25129a(long j) {
        return 0;
    }

    /* renamed from: a */
    public boolean mo25130a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        C4715b bVar = (C4715b) gVar;
        bVar.mo25136a(this.f11917a.f13444a, 0, 3, false);
        this.f11917a.mo25600e(0);
        if (this.f11917a.mo25610n() != f11916n) {
            return false;
        }
        bVar.mo25136a(this.f11917a.f13444a, 0, 2, false);
        this.f11917a.mo25600e(0);
        if ((this.f11917a.mo25613q() & 250) != 0) {
            return false;
        }
        bVar.mo25136a(this.f11917a.f13444a, 0, 4, false);
        this.f11917a.mo25600e(0);
        int c = this.f11917a.mo25595c();
        bVar.f11873e = 0;
        bVar.mo25135a(c, false);
        bVar.mo25136a(this.f11917a.f13444a, 0, 4, false);
        this.f11917a.mo25600e(0);
        if (this.f11917a.mo25595c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C5036k mo25170b(C4730g gVar) throws IOException, InterruptedException {
        if (this.f11925i > this.f11920d.mo25593b()) {
            C5036k kVar = this.f11920d;
            kVar.f13444a = new byte[Math.max(kVar.mo25593b() * 2, this.f11925i)];
            kVar.f13446c = 0;
            kVar.f13445b = 0;
        } else {
            this.f11920d.mo25600e(0);
        }
        this.f11920d.mo25598d(this.f11925i);
        ((C4715b) gVar).mo25138b(this.f11920d.f13444a, 0, this.f11925i, false);
        return this.f11920d;
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: c */
    public final boolean mo25171c(C4730g gVar) throws IOException, InterruptedException {
        boolean z;
        C4726c cVar;
        C4729e eVar;
        C4724a aVar;
        int i = this.f11924h;
        if (i == 8 && (aVar = this.f11927k) != null) {
            aVar.mo25172a(mo25170b(gVar), this.f11926j);
        } else if (i == 9 && (eVar = this.f11928l) != null) {
            eVar.mo25172a(mo25170b(gVar), this.f11926j);
        } else if (i != 18 || (cVar = this.f11929m) == null) {
            ((C4715b) gVar).mo25139c(this.f11925i);
            z = false;
            this.f11923g = 4;
            this.f11922f = 2;
            return z;
        } else {
            cVar.mo25172a(mo25170b(gVar), this.f11926j);
        }
        z = true;
        this.f11923g = 4;
        this.f11922f = 2;
        return z;
    }

    /* renamed from: c */
    public long mo25131c() {
        return this.f11929m.f11930b;
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f11921e = hVar;
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f11922f = 1;
        this.f11923g = 0;
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f11922f;
            boolean z = true;
            boolean z2 = false;
            if (i == 1) {
                if (!((C4715b) gVar).mo25138b(this.f11918b.f13444a, 0, 9, true)) {
                    z = false;
                } else {
                    this.f11918b.mo25600e(0);
                    this.f11918b.mo25602f(4);
                    int l = this.f11918b.mo25608l();
                    boolean z3 = (l & 4) != 0;
                    if ((l & 1) != 0) {
                        z2 = true;
                    }
                    if (z3 && this.f11927k == null) {
                        this.f11927k = new C4724a(this.f11921e.mo25173a(8, 1));
                    }
                    if (z2 && this.f11928l == null) {
                        this.f11928l = new C4729e(this.f11921e.mo25173a(9, 2));
                    }
                    if (this.f11929m == null) {
                        this.f11929m = new C4726c((C4804n) null);
                    }
                    this.f11921e.mo25175c();
                    this.f11921e.mo25174a(this);
                    this.f11923g = (this.f11918b.mo25595c() - 9) + 4;
                    this.f11922f = 2;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 2) {
                ((C4715b) gVar).mo25139c(this.f11923g);
                this.f11923g = 0;
                this.f11922f = 3;
            } else if (i == 3) {
                if (!((C4715b) gVar).mo25138b(this.f11919c.f13444a, 0, 11, true)) {
                    z = false;
                } else {
                    this.f11919c.mo25600e(0);
                    this.f11924h = this.f11919c.mo25608l();
                    this.f11925i = this.f11919c.mo25610n();
                    this.f11926j = (long) this.f11919c.mo25610n();
                    this.f11926j = (((long) (this.f11919c.mo25608l() << 24)) | this.f11926j) * 1000;
                    this.f11919c.mo25602f(3);
                    this.f11922f = 4;
                }
                if (!z) {
                    return -1;
                }
            } else if (i == 4 && mo25171c(gVar)) {
                return 0;
            }
        }
    }
}
