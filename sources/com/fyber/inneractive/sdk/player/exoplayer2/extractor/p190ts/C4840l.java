package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.l */
public final class C4840l implements C4831h {

    /* renamed from: a */
    public final C5036k f12759a = new C5036k(10);

    /* renamed from: b */
    public C4804n f12760b;

    /* renamed from: c */
    public boolean f12761c;

    /* renamed from: d */
    public long f12762d;

    /* renamed from: e */
    public int f12763e;

    /* renamed from: f */
    public int f12764f;

    /* renamed from: a */
    public void mo25293a() {
        this.f12761c = false;
    }

    /* renamed from: b */
    public void mo25297b() {
        int i;
        if (this.f12761c && (i = this.f12763e) != 0 && this.f12764f == i) {
            this.f12760b.mo25147a(this.f12762d, 1, i, 0, (byte[]) null);
            this.f12761c = false;
        }
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        C4804n a = hVar.mo25173a(dVar.mo25324c(), 4);
        this.f12760b = a;
        a.mo25149a(C4869i.m14978a(dVar.mo25323b(), "application/id3", (String) null, -1, (C4702a) null));
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        if (z) {
            this.f12761c = true;
            this.f12762d = j;
            this.f12763e = 0;
            this.f12764f = 0;
        }
    }

    /* renamed from: a */
    public void mo25296a(C5036k kVar) {
        if (this.f12761c) {
            int a = kVar.mo25588a();
            int i = this.f12764f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(kVar.f13444a, kVar.f13445b, this.f12759a.f13444a, this.f12764f, min);
                if (this.f12764f + min == 10) {
                    this.f12759a.mo25600e(0);
                    if (73 == this.f12759a.mo25608l() && 68 == this.f12759a.mo25608l() && 51 == this.f12759a.mo25608l()) {
                        this.f12759a.mo25602f(3);
                        this.f12763e = this.f12759a.mo25607k() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12761c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f12763e - this.f12764f);
            this.f12760b.mo25150a(kVar, min2);
            this.f12764f += min2;
        }
    }
}
