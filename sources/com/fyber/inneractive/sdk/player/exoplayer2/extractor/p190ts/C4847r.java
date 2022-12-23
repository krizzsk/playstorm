package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r */
public final class C4847r implements C4853v {

    /* renamed from: a */
    public final C4846q f12808a;

    /* renamed from: b */
    public final C5036k f12809b = new C5036k(32);

    /* renamed from: c */
    public int f12810c;

    /* renamed from: d */
    public int f12811d;

    /* renamed from: e */
    public boolean f12812e;

    /* renamed from: f */
    public boolean f12813f;

    public C4847r(C4846q qVar) {
        this.f12808a = qVar;
    }

    /* renamed from: a */
    public void mo25316a(C5046r rVar, C4731h hVar, C4853v.C4857d dVar) {
        this.f12808a.mo25319a(rVar, hVar, dVar);
        this.f12813f = true;
    }

    /* renamed from: a */
    public void mo25313a() {
        this.f12813f = true;
    }

    /* renamed from: a */
    public void mo25315a(C5036k kVar, boolean z) {
        int i;
        if (z) {
            i = kVar.f13445b + kVar.mo25608l();
        } else {
            i = -1;
        }
        if (this.f12813f) {
            if (z) {
                this.f12813f = false;
                kVar.mo25600e(i);
                this.f12811d = 0;
            } else {
                return;
            }
        }
        while (kVar.mo25588a() > 0) {
            int i2 = this.f12811d;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int l = kVar.mo25608l();
                    kVar.mo25600e(kVar.f13445b - 1);
                    if (l == 255) {
                        this.f12813f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.mo25588a(), 3 - this.f12811d);
                kVar.mo25592a(this.f12809b.f13444a, this.f12811d, min);
                int i3 = this.f12811d + min;
                this.f12811d = i3;
                if (i3 == 3) {
                    this.f12809b.mo25596c(3);
                    this.f12809b.mo25602f(1);
                    int l2 = this.f12809b.mo25608l();
                    int l3 = this.f12809b.mo25608l();
                    if ((l2 & 128) == 0) {
                        z2 = false;
                    }
                    this.f12812e = z2;
                    this.f12810c = (((l2 & 15) << 8) | l3) + 3;
                    int b = this.f12809b.mo25593b();
                    int i4 = this.f12810c;
                    if (b < i4) {
                        C5036k kVar2 = this.f12809b;
                        byte[] bArr = kVar2.f13444a;
                        kVar2.mo25596c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f12809b.f13444a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.mo25588a(), this.f12810c - this.f12811d);
                kVar.mo25592a(this.f12809b.f13444a, this.f12811d, min2);
                int i5 = this.f12811d + min2;
                this.f12811d = i5;
                int i6 = this.f12810c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f12812e) {
                        byte[] bArr2 = this.f12809b.f13444a;
                        int i7 = C5049u.f13471a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = C5049u.f13478h[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f12813f = true;
                            return;
                        }
                        this.f12809b.mo25596c(this.f12810c - 4);
                    } else {
                        this.f12809b.mo25596c(i6);
                    }
                    this.f12808a.mo25318a(this.f12809b);
                    this.f12811d = 0;
                }
            }
        }
    }
}
