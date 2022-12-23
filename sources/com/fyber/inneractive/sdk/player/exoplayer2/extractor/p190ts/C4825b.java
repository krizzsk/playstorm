package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b */
public final class C4825b implements C4831h {

    /* renamed from: a */
    public final C5035j f12612a;

    /* renamed from: b */
    public final C5036k f12613b;

    /* renamed from: c */
    public final String f12614c;

    /* renamed from: d */
    public String f12615d;

    /* renamed from: e */
    public C4804n f12616e;

    /* renamed from: f */
    public int f12617f = 0;

    /* renamed from: g */
    public int f12618g;

    /* renamed from: h */
    public boolean f12619h;

    /* renamed from: i */
    public long f12620i;

    /* renamed from: j */
    public C4869i f12621j;

    /* renamed from: k */
    public int f12622k;

    /* renamed from: l */
    public long f12623l;

    public C4825b(String str) {
        byte[] bArr = new byte[8];
        this.f12612a = new C5035j(bArr);
        this.f12613b = new C5036k(bArr);
        this.f12614c = str;
    }

    /* renamed from: a */
    public void mo25293a() {
        this.f12617f = 0;
        this.f12618g = 0;
        this.f12619h = false;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12615d = dVar.mo25323b();
        this.f12616e = hVar.mo25173a(dVar.mo25324c(), 1);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12623l = j;
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        C5036k kVar2 = kVar;
        while (kVar.mo25588a() > 0) {
            int i5 = this.f12617f;
            if (i5 == 0) {
                while (true) {
                    if (kVar.mo25588a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f12619h) {
                        this.f12619h = kVar.mo25608l() == 11;
                    } else {
                        int l = kVar.mo25608l();
                        if (l == 119) {
                            this.f12619h = false;
                            z = true;
                            break;
                        }
                        this.f12619h = l == 11;
                    }
                }
                if (z) {
                    this.f12617f = 1;
                    byte[] bArr = this.f12613b.f13444a;
                    bArr[0] = Ascii.f17948VT;
                    bArr[1] = 119;
                    this.f12618g = 2;
                }
            } else if (i5 == 1) {
                byte[] bArr2 = this.f12613b.f13444a;
                int min = Math.min(kVar.mo25588a(), 8 - this.f12618g);
                System.arraycopy(kVar2.f13444a, kVar2.f13445b, bArr2, this.f12618g, min);
                kVar2.f13445b += min;
                int i6 = this.f12618g + min;
                this.f12618g = i6;
                if (i6 == 8) {
                    this.f12612a.mo25585b(0);
                    C5035j jVar = this.f12612a;
                    int i7 = (jVar.f13441b * 8) + jVar.f13442c;
                    jVar.mo25587c(40);
                    boolean z2 = jVar.mo25583a(5) == 16;
                    jVar.mo25585b(i7);
                    int i8 = 6;
                    if (z2) {
                        jVar.mo25587c(21);
                        i4 = (jVar.mo25583a(11) + 1) * 2;
                        int a = jVar.mo25583a(2);
                        if (a == 3) {
                            i3 = C4678a.f11700c[jVar.mo25583a(2)];
                        } else {
                            i8 = C4678a.f11698a[jVar.mo25583a(2)];
                            i3 = C4678a.f11699b[a];
                        }
                        i2 = i8 * 256;
                        i = jVar.mo25583a(3);
                        str = "audio/eac3";
                    } else {
                        jVar.mo25587c(32);
                        int a2 = jVar.mo25583a(2);
                        int a3 = C4678a.m14382a(a2, jVar.mo25583a(6));
                        jVar.mo25587c(8);
                        i = jVar.mo25583a(3);
                        if (!((i & 1) == 0 || i == 1)) {
                            jVar.mo25587c(2);
                        }
                        if ((i & 4) != 0) {
                            jVar.mo25587c(2);
                        }
                        if (i == 2) {
                            jVar.mo25587c(2);
                        }
                        i3 = C4678a.f11699b[a2];
                        str = "audio/ac3";
                        int i9 = a3;
                        i2 = 1536;
                        i4 = i9;
                    }
                    int i10 = C4678a.f11701d[i] + (jVar.mo25586b() ? 1 : 0);
                    C4869i iVar = this.f12621j;
                    if (!(iVar != null && i10 == iVar.f12968r && i3 == iVar.f12969s && str == iVar.f12956f)) {
                        C4869i a4 = C4869i.m14975a(this.f12615d, str, (String) null, -1, -1, i10, i3, -1, (List<byte[]>) null, (C4702a) null, 0, this.f12614c);
                        this.f12621j = a4;
                        this.f12616e.mo25149a(a4);
                    }
                    this.f12622k = i4;
                    this.f12620i = (((long) i2) * 1000000) / ((long) this.f12621j.f12969s);
                    this.f12613b.mo25600e(0);
                    this.f12616e.mo25150a(this.f12613b, 8);
                    this.f12617f = 2;
                }
            } else if (i5 == 2) {
                int min2 = Math.min(kVar.mo25588a(), this.f12622k - this.f12618g);
                this.f12616e.mo25150a(kVar2, min2);
                int i11 = this.f12618g + min2;
                this.f12618g = i11;
                int i12 = this.f12622k;
                if (i11 == i12) {
                    this.f12616e.mo25147a(this.f12623l, 1, i12, 0, (byte[]) null);
                    this.f12623l += this.f12620i;
                    this.f12617f = 0;
                }
            }
        }
    }
}
