package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o */
public final class C4843o implements C4853v {

    /* renamed from: a */
    public final C4831h f12782a;

    /* renamed from: b */
    public final C5035j f12783b = new C5035j(new byte[10]);

    /* renamed from: c */
    public int f12784c = 0;

    /* renamed from: d */
    public int f12785d;

    /* renamed from: e */
    public C5046r f12786e;

    /* renamed from: f */
    public boolean f12787f;

    /* renamed from: g */
    public boolean f12788g;

    /* renamed from: h */
    public boolean f12789h;

    /* renamed from: i */
    public int f12790i;

    /* renamed from: j */
    public int f12791j;

    /* renamed from: k */
    public boolean f12792k;

    /* renamed from: l */
    public long f12793l;

    public C4843o(C4831h hVar) {
        this.f12782a = hVar;
    }

    /* renamed from: a */
    public void mo25316a(C5046r rVar, C4731h hVar, C4853v.C4857d dVar) {
        this.f12786e = rVar;
        this.f12782a.mo25295a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo25313a() {
        this.f12784c = 0;
        this.f12785d = 0;
        this.f12789h = false;
        this.f12782a.mo25293a();
    }

    /* renamed from: a */
    public final void mo25315a(C5036k kVar, boolean z) {
        boolean z2;
        C5036k kVar2 = kVar;
        if (z) {
            int i = this.f12784c;
            if (i == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                if (this.f12791j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f12791j + " more bytes");
                }
                this.f12782a.mo25297b();
            }
            mo25314a(1);
        }
        while (kVar.mo25588a() > 0) {
            int i2 = this.f12784c;
            if (i2 != 0) {
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (mo25317a(kVar2, this.f12783b.f13440a, Math.min(10, this.f12790i)) && mo25317a(kVar2, (byte[]) null, this.f12790i)) {
                            this.f12783b.mo25585b(0);
                            this.f12793l = -9223372036854775807L;
                            if (this.f12787f) {
                                this.f12783b.mo25587c(4);
                                this.f12783b.mo25587c(1);
                                this.f12783b.mo25587c(1);
                                long a = (((long) this.f12783b.mo25583a(3)) << 30) | ((long) (this.f12783b.mo25583a(15) << 15)) | ((long) this.f12783b.mo25583a(15));
                                this.f12783b.mo25587c(1);
                                if (!this.f12789h && this.f12788g) {
                                    this.f12783b.mo25587c(4);
                                    this.f12783b.mo25587c(1);
                                    this.f12783b.mo25587c(1);
                                    long a2 = (((long) this.f12783b.mo25583a(3)) << 30) | ((long) (this.f12783b.mo25583a(15) << 15)) | ((long) this.f12783b.mo25583a(15));
                                    this.f12783b.mo25587c(1);
                                    this.f12786e.mo25635b(a2);
                                    this.f12789h = true;
                                }
                                this.f12793l = this.f12786e.mo25635b(a);
                            }
                            this.f12782a.mo25294a(this.f12793l, this.f12792k);
                            mo25314a(3);
                        }
                    } else if (i2 == 3) {
                        int a3 = kVar.mo25588a();
                        int i4 = this.f12791j;
                        if (i4 != -1) {
                            i3 = a3 - i4;
                        }
                        if (i3 > 0) {
                            a3 -= i3;
                            kVar2.mo25598d(kVar2.f13445b + a3);
                        }
                        this.f12782a.mo25296a(kVar2);
                        int i5 = this.f12791j;
                        if (i5 != -1) {
                            int i6 = i5 - a3;
                            this.f12791j = i6;
                            if (i6 == 0) {
                                this.f12782a.mo25297b();
                                mo25314a(1);
                            }
                        }
                    }
                } else if (mo25317a(kVar2, this.f12783b.f13440a, 9)) {
                    this.f12783b.mo25585b(0);
                    int a4 = this.f12783b.mo25583a(24);
                    if (a4 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + a4);
                        this.f12791j = -1;
                        z2 = false;
                    } else {
                        this.f12783b.mo25587c(8);
                        int a5 = this.f12783b.mo25583a(16);
                        this.f12783b.mo25587c(5);
                        this.f12792k = this.f12783b.mo25586b();
                        this.f12783b.mo25587c(2);
                        this.f12787f = this.f12783b.mo25586b();
                        this.f12788g = this.f12783b.mo25586b();
                        this.f12783b.mo25587c(6);
                        int a6 = this.f12783b.mo25583a(8);
                        this.f12790i = a6;
                        if (a5 == 0) {
                            this.f12791j = -1;
                        } else {
                            this.f12791j = ((a5 + 6) - 9) - a6;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        i3 = 2;
                    }
                    mo25314a(i3);
                }
            } else {
                kVar2.mo25602f(kVar.mo25588a());
            }
        }
    }

    /* renamed from: a */
    public final void mo25314a(int i) {
        this.f12784c = i;
        this.f12785d = 0;
    }

    /* renamed from: a */
    public final boolean mo25317a(C5036k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo25588a(), i - this.f12785d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.mo25602f(min);
        } else {
            System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, this.f12785d, min);
            kVar.f13445b += min;
        }
        int i2 = this.f12785d + min;
        this.f12785d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
