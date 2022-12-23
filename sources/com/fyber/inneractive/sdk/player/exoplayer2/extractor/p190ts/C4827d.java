package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4722e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5026c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d */
public final class C4827d implements C4831h {

    /* renamed from: r */
    public static final byte[] f12629r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f12630a;

    /* renamed from: b */
    public final C5035j f12631b = new C5035j(new byte[7]);

    /* renamed from: c */
    public final C5036k f12632c = new C5036k(Arrays.copyOf(f12629r, 10));

    /* renamed from: d */
    public final String f12633d;

    /* renamed from: e */
    public String f12634e;

    /* renamed from: f */
    public C4804n f12635f;

    /* renamed from: g */
    public C4804n f12636g;

    /* renamed from: h */
    public int f12637h;

    /* renamed from: i */
    public int f12638i;

    /* renamed from: j */
    public int f12639j;

    /* renamed from: k */
    public boolean f12640k;

    /* renamed from: l */
    public boolean f12641l;

    /* renamed from: m */
    public long f12642m;

    /* renamed from: n */
    public int f12643n;

    /* renamed from: o */
    public long f12644o;

    /* renamed from: p */
    public C4804n f12645p;

    /* renamed from: q */
    public long f12646q;

    public C4827d(boolean z, String str) {
        mo25299c();
        this.f12630a = z;
        this.f12633d = str;
    }

    /* renamed from: a */
    public void mo25293a() {
        mo25299c();
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: c */
    public final void mo25299c() {
        this.f12637h = 0;
        this.f12638i = 0;
        this.f12639j = 256;
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12634e = dVar.mo25323b();
        this.f12635f = hVar.mo25173a(dVar.mo25324c(), 1);
        if (this.f12630a) {
            dVar.mo25322a();
            C4804n a = hVar.mo25173a(dVar.mo25324c(), 4);
            this.f12636g = a;
            a.mo25149a(C4869i.m14978a(dVar.mo25323b(), "application/id3", (String) null, -1, (C4702a) null));
            return;
        }
        this.f12636g = new C4722e();
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12644o = j;
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        C5036k kVar2 = kVar;
        while (kVar.mo25588a() > 0) {
            int i = this.f12637h;
            boolean z = true;
            if (i == 0) {
                byte[] bArr = kVar2.f13444a;
                int i2 = kVar2.f13445b;
                int i3 = kVar2.f13446c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo25600e(i2);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2] & 255;
                    int i5 = this.f12639j;
                    if (i5 != 512 || b < 240 || b == 255) {
                        byte b2 = b | i5;
                        if (b2 == 329) {
                            this.f12639j = 768;
                        } else if (b2 == 511) {
                            this.f12639j = 512;
                        } else if (b2 != 836) {
                            if (b2 == 1075) {
                                this.f12637h = 1;
                                this.f12638i = f12629r.length;
                                this.f12643n = 0;
                                this.f12632c.mo25600e(0);
                                kVar2.mo25600e(i4);
                                break;
                            } else if (i5 != 256) {
                                this.f12639j = 256;
                                i2 = i4 - 1;
                            }
                        } else {
                            this.f12639j = 1024;
                        }
                        i2 = i4;
                    } else {
                        if ((b & 1) != 0) {
                            z = false;
                        }
                        this.f12640k = z;
                        this.f12637h = 2;
                        this.f12638i = 0;
                        kVar2.mo25600e(i4);
                    }
                }
            } else if (i != 1) {
                if (i == 2) {
                    if (mo25298a(kVar2, this.f12631b.f13440a, this.f12640k ? 7 : 5)) {
                        this.f12631b.mo25585b(0);
                        if (!this.f12641l) {
                            int a = this.f12631b.mo25583a(2) + 1;
                            if (a != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + a + ", but assuming AAC LC.");
                                a = 2;
                            }
                            int a2 = this.f12631b.mo25583a(4);
                            this.f12631b.mo25587c(1);
                            byte[] bArr2 = {(byte) (((a << 3) & 248) | ((a2 >> 1) & 7)), (byte) (((a2 << 7) & 128) | ((this.f12631b.mo25583a(3) << 3) & 120))};
                            Pair<Integer, Integer> a3 = C5026c.m15309a(bArr2);
                            C4869i a4 = C4869i.m14975a(this.f12634e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr2), (C4702a) null, 0, this.f12633d);
                            this.f12642m = 1024000000 / ((long) a4.f12969s);
                            this.f12635f.mo25149a(a4);
                            this.f12641l = true;
                        } else {
                            this.f12631b.mo25587c(10);
                        }
                        this.f12631b.mo25587c(4);
                        int a5 = (this.f12631b.mo25583a(13) - 2) - 5;
                        if (this.f12640k) {
                            a5 -= 2;
                        }
                        C4804n nVar = this.f12635f;
                        long j = this.f12642m;
                        this.f12637h = 3;
                        this.f12638i = 0;
                        this.f12645p = nVar;
                        this.f12646q = j;
                        this.f12643n = a5;
                    }
                } else if (i == 3) {
                    int min = Math.min(kVar.mo25588a(), this.f12643n - this.f12638i);
                    this.f12645p.mo25150a(kVar2, min);
                    int i6 = this.f12638i + min;
                    this.f12638i = i6;
                    int i7 = this.f12643n;
                    if (i6 == i7) {
                        this.f12645p.mo25147a(this.f12644o, 1, i7, 0, (byte[]) null);
                        this.f12644o += this.f12646q;
                        mo25299c();
                    }
                }
            } else if (mo25298a(kVar2, this.f12632c.f13444a, 10)) {
                this.f12636g.mo25150a(this.f12632c, 10);
                this.f12632c.mo25600e(6);
                C4804n nVar2 = this.f12636g;
                this.f12637h = 3;
                this.f12638i = 10;
                this.f12645p = nVar2;
                this.f12646q = 0;
                this.f12643n = this.f12632c.mo25607k() + 10;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25298a(C5036k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo25588a(), i - this.f12638i);
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, this.f12638i, min);
        kVar.f13445b += min;
        int i2 = this.f12638i + min;
        this.f12638i = i2;
        return i2 == i;
    }
}
