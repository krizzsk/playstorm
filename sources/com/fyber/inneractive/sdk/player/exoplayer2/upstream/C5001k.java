package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.k */
public final class C5001k implements C4971b {

    /* renamed from: a */
    public final boolean f13334a;

    /* renamed from: b */
    public final int f13335b;

    /* renamed from: c */
    public final byte[] f13336c;

    /* renamed from: d */
    public final C4969a[] f13337d;

    /* renamed from: e */
    public int f13338e;

    /* renamed from: f */
    public int f13339f;

    /* renamed from: g */
    public int f13340g;

    /* renamed from: h */
    public C4969a[] f13341h;

    public C5001k(boolean z, int i, int i2) {
        C5023a.m15302a(i > 0);
        C5023a.m15302a(i2 >= 0);
        this.f13334a = z;
        this.f13335b = i;
        this.f13340g = i2;
        this.f13341h = new C4969a[(i2 + 100)];
        if (i2 > 0) {
            this.f13336c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f13341h[i3] = new C4969a(this.f13336c, i3 * i);
            }
        } else {
            this.f13336c = null;
        }
        this.f13337d = new C4969a[1];
    }

    /* renamed from: a */
    public synchronized void mo25556a(C4969a[] aVarArr) {
        boolean z;
        int i = this.f13340g;
        int length = aVarArr.length + i;
        C4969a[] aVarArr2 = this.f13341h;
        if (length >= aVarArr2.length) {
            this.f13341h = (C4969a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C4969a aVar : aVarArr) {
            byte[] bArr = aVar.f13239a;
            if (bArr != this.f13336c) {
                if (bArr.length != this.f13335b) {
                    z = false;
                    C5023a.m15302a(z);
                    C4969a[] aVarArr3 = this.f13341h;
                    int i2 = this.f13340g;
                    this.f13340g = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
            }
            z = true;
            C5023a.m15302a(z);
            C4969a[] aVarArr32 = this.f13341h;
            int i22 = this.f13340g;
            this.f13340g = i22 + 1;
            aVarArr32[i22] = aVar;
        }
        this.f13339f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo25557b() {
        int i = 0;
        int max = Math.max(0, C5049u.m15385a(this.f13338e, this.f13335b) - this.f13339f);
        int i2 = this.f13340g;
        if (max < i2) {
            if (this.f13336c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C4969a[] aVarArr = this.f13341h;
                    C4969a aVar = aVarArr[i];
                    byte[] bArr = aVar.f13239a;
                    byte[] bArr2 = this.f13336c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        C4969a aVar2 = aVarArr[i3];
                        if (aVar2.f13239a != bArr2) {
                            i3--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f13340g) {
                    return;
                }
            }
            Arrays.fill(this.f13341h, max, this.f13340g, (Object) null);
            this.f13340g = max;
        }
    }

    /* renamed from: a */
    public int mo25555a() {
        return this.f13335b;
    }
}
