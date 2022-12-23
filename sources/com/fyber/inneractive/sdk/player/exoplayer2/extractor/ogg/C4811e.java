package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.e */
public final class C4811e {

    /* renamed from: h */
    public static final int f12561h = C5049u.m15386a("OggS");

    /* renamed from: a */
    public int f12562a;

    /* renamed from: b */
    public long f12563b;

    /* renamed from: c */
    public int f12564c;

    /* renamed from: d */
    public int f12565d;

    /* renamed from: e */
    public int f12566e;

    /* renamed from: f */
    public final int[] f12567f = new int[255];

    /* renamed from: g */
    public final C5036k f12568g = new C5036k(255);

    /* renamed from: a */
    public void mo25285a() {
        this.f12562a = 0;
        this.f12563b = 0;
        this.f12564c = 0;
        this.f12565d = 0;
        this.f12566e = 0;
    }

    /* renamed from: a */
    public boolean mo25286a(C4730g gVar, boolean z) throws IOException, InterruptedException {
        this.f12568g.mo25614r();
        mo25285a();
        C4715b bVar = (C4715b) gVar;
        long j = bVar.f11870b;
        if (!(j == -1 || j - (bVar.f11871c + ((long) bVar.f11873e)) >= 27) || !bVar.mo25136a(this.f12568g.f13444a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f12568g.mo25609m() != ((long) f12561h)) {
            if (z) {
                return false;
            }
            throw new C4873l("expected OggS capture pattern at begin of page");
        } else if (this.f12568g.mo25608l() == 0) {
            this.f12562a = this.f12568g.mo25608l();
            C5036k kVar = this.f12568g;
            byte[] bArr = kVar.f13444a;
            int i = kVar.f13445b;
            int i2 = i + 1;
            kVar.f13445b = i2;
            int i3 = i2 + 1;
            kVar.f13445b = i3;
            int i4 = i3 + 1;
            kVar.f13445b = i4;
            int i5 = i4 + 1;
            kVar.f13445b = i5;
            int i6 = i5 + 1;
            kVar.f13445b = i6;
            int i7 = i6 + 1;
            kVar.f13445b = i7;
            int i8 = i7 + 1;
            kVar.f13445b = i8;
            kVar.f13445b = i8 + 1;
            this.f12563b = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
            kVar.mo25601f();
            this.f12568g.mo25601f();
            this.f12568g.mo25601f();
            int l = this.f12568g.mo25608l();
            this.f12564c = l;
            this.f12565d = l + 27;
            this.f12568g.mo25614r();
            bVar.mo25136a(this.f12568g.f13444a, 0, this.f12564c, false);
            for (int i9 = 0; i9 < this.f12564c; i9++) {
                this.f12567f[i9] = this.f12568g.mo25608l();
                this.f12566e += this.f12567f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C4873l("unsupported bit stream revision");
        }
    }
}
