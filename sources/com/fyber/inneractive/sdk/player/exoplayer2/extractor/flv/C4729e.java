package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4727d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C5060a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.e */
public final class C4729e extends C4727d {

    /* renamed from: b */
    public final C5036k f11932b = new C5036k(C5032i.f13423a);

    /* renamed from: c */
    public final C5036k f11933c = new C5036k(4);

    /* renamed from: d */
    public int f11934d;

    /* renamed from: e */
    public boolean f11935e;

    /* renamed from: f */
    public int f11936f;

    public C4729e(C4804n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo25168a(C5036k kVar) throws C4727d.C4728a {
        int l = kVar.mo25608l();
        int i = (l >> 4) & 15;
        int i2 = l & 15;
        if (i2 == 7) {
            this.f11936f = i;
            return i != 5;
        }
        throw new C4727d.C4728a("Video format not supported: " + i2);
    }

    /* renamed from: b */
    public void mo25169b(C5036k kVar, long j) throws C4873l {
        int l = kVar.mo25608l();
        long n = j + (((long) kVar.mo25610n()) * 1000);
        if (l == 0 && !this.f11935e) {
            C5036k kVar2 = new C5036k(new byte[kVar.mo25588a()]);
            kVar.mo25592a(kVar2.f13444a, 0, kVar.mo25588a());
            C5060a b = C5060a.m15428b(kVar2);
            this.f11934d = b.f13533b;
            this.f11931a.mo25149a(C4869i.m14972a((String) null, "video/avc", (String) null, -1, -1, b.f13534c, b.f13535d, -1.0f, b.f13532a, -1, b.f13536e, (C4702a) null));
            this.f11935e = true;
        } else if (l == 1 && this.f11935e) {
            byte[] bArr = this.f11933c.f13444a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f11934d;
            int i2 = 0;
            while (kVar.mo25588a() > 0) {
                kVar.mo25592a(this.f11933c.f13444a, i, this.f11934d);
                this.f11933c.mo25600e(0);
                int o = this.f11933c.mo25611o();
                this.f11932b.mo25600e(0);
                this.f11931a.mo25150a(this.f11932b, 4);
                this.f11931a.mo25150a(kVar, o);
                i2 = i2 + 4 + o;
            }
            this.f11931a.mo25147a(n, this.f11936f == 1 ? 1 : 0, i2, 0, (byte[]) null);
        }
    }
}
