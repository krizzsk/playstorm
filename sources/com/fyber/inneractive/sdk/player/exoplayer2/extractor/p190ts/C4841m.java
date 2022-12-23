package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4765k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m */
public final class C4841m implements C4831h {

    /* renamed from: a */
    public final C5036k f12765a;

    /* renamed from: b */
    public final C4765k f12766b;

    /* renamed from: c */
    public final String f12767c;

    /* renamed from: d */
    public String f12768d;

    /* renamed from: e */
    public C4804n f12769e;

    /* renamed from: f */
    public int f12770f = 0;

    /* renamed from: g */
    public int f12771g;

    /* renamed from: h */
    public boolean f12772h;

    /* renamed from: i */
    public boolean f12773i;

    /* renamed from: j */
    public long f12774j;

    /* renamed from: k */
    public int f12775k;

    /* renamed from: l */
    public long f12776l;

    public C4841m(String str) {
        C5036k kVar = new C5036k(4);
        this.f12765a = kVar;
        kVar.f13444a[0] = -1;
        this.f12766b = new C4765k();
        this.f12767c = str;
    }

    /* renamed from: a */
    public void mo25293a() {
        this.f12770f = 0;
        this.f12771g = 0;
        this.f12773i = false;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12768d = dVar.mo25323b();
        this.f12769e = hVar.mo25173a(dVar.mo25324c(), 1);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12776l = j;
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        C5036k kVar2 = kVar;
        while (kVar.mo25588a() > 0) {
            int i = this.f12770f;
            if (i == 0) {
                byte[] bArr = kVar2.f13444a;
                int i2 = kVar2.f13445b;
                int i3 = kVar2.f13446c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo25600e(i3);
                        break;
                    }
                    boolean z = (bArr[i2] & 255) == 255;
                    boolean z2 = this.f12773i && (bArr[i2] & 224) == 224;
                    this.f12773i = z;
                    if (z2) {
                        kVar2.mo25600e(i2 + 1);
                        this.f12773i = false;
                        this.f12765a.f13444a[1] = bArr[i2];
                        this.f12771g = 2;
                        this.f12770f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(kVar.mo25588a(), 4 - this.f12771g);
                kVar2.mo25592a(this.f12765a.f13444a, this.f12771g, min);
                int i4 = this.f12771g + min;
                this.f12771g = i4;
                if (i4 >= 4) {
                    this.f12765a.mo25600e(0);
                    if (!C4765k.m14644a(this.f12765a.mo25595c(), this.f12766b)) {
                        this.f12771g = 0;
                        this.f12770f = 1;
                    } else {
                        C4765k kVar3 = this.f12766b;
                        this.f12775k = kVar3.f12140c;
                        if (!this.f12772h) {
                            int i5 = kVar3.f12141d;
                            this.f12774j = (((long) kVar3.f12144g) * 1000000) / ((long) i5);
                            this.f12769e.mo25149a(C4869i.m14975a(this.f12768d, kVar3.f12139b, (String) null, -1, 4096, kVar3.f12142e, i5, -1, (List<byte[]>) null, (C4702a) null, 0, this.f12767c));
                            this.f12772h = true;
                        }
                        this.f12765a.mo25600e(0);
                        this.f12769e.mo25150a(this.f12765a, 4);
                        this.f12770f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(kVar.mo25588a(), this.f12775k - this.f12771g);
                this.f12769e.mo25150a(kVar2, min2);
                int i6 = this.f12771g + min2;
                this.f12771g = i6;
                int i7 = this.f12775k;
                if (i6 >= i7) {
                    this.f12769e.mo25147a(this.f12776l, 1, i7, 0, (byte[]) null);
                    this.f12776l += this.f12774j;
                    this.f12771g = 0;
                    this.f12770f = 0;
                }
            }
        }
    }
}
