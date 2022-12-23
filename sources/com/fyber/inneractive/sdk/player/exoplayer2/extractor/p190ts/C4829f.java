package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4691e;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f */
public final class C4829f implements C4831h {

    /* renamed from: a */
    public final C5036k f12649a;

    /* renamed from: b */
    public final String f12650b;

    /* renamed from: c */
    public String f12651c;

    /* renamed from: d */
    public C4804n f12652d;

    /* renamed from: e */
    public int f12653e = 0;

    /* renamed from: f */
    public int f12654f;

    /* renamed from: g */
    public int f12655g;

    /* renamed from: h */
    public long f12656h;

    /* renamed from: i */
    public C4869i f12657i;

    /* renamed from: j */
    public int f12658j;

    /* renamed from: k */
    public long f12659k;

    public C4829f(String str) {
        C5036k kVar = new C5036k(new byte[15]);
        this.f12649a = kVar;
        byte[] bArr = kVar.f13444a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.f12650b = str;
    }

    /* renamed from: a */
    public void mo25293a() {
        this.f12653e = 0;
        this.f12654f = 0;
        this.f12655g = 0;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12651c = dVar.mo25323b();
        this.f12652d = hVar.mo25173a(dVar.mo25324c(), 1);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12659k = j;
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        int i;
        C5036k kVar2 = kVar;
        while (kVar.mo25588a() > 0) {
            int i2 = this.f12653e;
            boolean z = false;
            if (i2 == 0) {
                while (true) {
                    if (kVar.mo25588a() <= 0) {
                        break;
                    }
                    int i3 = this.f12655g << 8;
                    this.f12655g = i3;
                    int l = i3 | kVar.mo25608l();
                    this.f12655g = l;
                    if (l == 2147385345) {
                        this.f12655g = 0;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f12654f = 4;
                    this.f12653e = 1;
                }
            } else if (i2 == 1) {
                byte[] bArr = this.f12649a.f13444a;
                int min = Math.min(kVar.mo25588a(), 15 - this.f12654f);
                System.arraycopy(kVar2.f13444a, kVar2.f13445b, bArr, this.f12654f, min);
                kVar2.f13445b += min;
                int i4 = this.f12654f + min;
                this.f12654f = i4;
                if (i4 == 15) {
                    byte[] bArr2 = this.f12649a.f13444a;
                    if (this.f12657i == null) {
                        String str = this.f12651c;
                        String str2 = this.f12650b;
                        C5035j jVar = new C5035j(bArr2, bArr2.length);
                        jVar.mo25587c(60);
                        int i5 = C4691e.f11786a[jVar.mo25583a(6)];
                        int i6 = C4691e.f11787b[jVar.mo25583a(4)];
                        int a = jVar.mo25583a(5);
                        int[] iArr = C4691e.f11788c;
                        if (a >= iArr.length) {
                            i = -1;
                        } else {
                            i = (iArr[a] * 1000) / 2;
                        }
                        int i7 = i;
                        jVar.mo25587c(10);
                        C4869i a2 = C4869i.m14975a(str, "audio/vnd.dts", (String) null, i7, -1, i5 + (jVar.mo25583a(2) > 0 ? 1 : 0), i6, -1, (List<byte[]>) null, (C4702a) null, 0, str2);
                        this.f12657i = a2;
                        this.f12652d.mo25149a(a2);
                    }
                    this.f12658j = (((bArr2[5] & 2) << Ascii.f17937FF) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f12656h = (long) ((int) ((((long) (((((bArr2[5] & 252) >> 2) | ((bArr2[4] & 1) << 6)) + 1) * 32)) * 1000000) / ((long) this.f12657i.f12969s)));
                    this.f12649a.mo25600e(0);
                    this.f12652d.mo25150a(this.f12649a, 15);
                    this.f12653e = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(kVar.mo25588a(), this.f12658j - this.f12654f);
                this.f12652d.mo25150a(kVar2, min2);
                int i8 = this.f12654f + min2;
                this.f12654f = i8;
                int i9 = this.f12658j;
                if (i8 == i9) {
                    this.f12652d.mo25147a(this.f12659k, 1, i9, 0, (byte[]) null);
                    this.f12659k += this.f12656h;
                    this.f12653e = 0;
                }
            }
        }
    }
}
