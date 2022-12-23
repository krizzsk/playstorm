package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4994f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4980d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e */
public final class C4982e implements C4996g.C4997a {

    /* renamed from: a */
    public final C4974a f13278a;

    /* renamed from: b */
    public final C4996g.C4997a f13279b;

    /* renamed from: c */
    public final C4996g.C4997a f13280c;

    /* renamed from: d */
    public final C4994f.C4995a f13281d;

    public C4982e(C4974a aVar, C4996g.C4997a aVar2, C4996g.C4997a aVar3, C4994f.C4995a aVar4, int i, C4980d.C4981a aVar5) {
        this.f13278a = aVar;
        this.f13279b = aVar2;
        this.f13280c = aVar3;
        this.f13281d = aVar4;
    }

    /* renamed from: a */
    public C4996g mo24836a() {
        C4977b bVar;
        C4974a aVar = this.f13278a;
        C4996g a = this.f13279b.mo24836a();
        C4996g a2 = this.f13280c.mo24836a();
        C4994f.C4995a aVar2 = this.f13281d;
        if (aVar2 != null) {
            C4979c cVar = (C4979c) aVar2;
            bVar = new C4977b(cVar.f13257a, cVar.f13258b, 20480);
        } else {
            bVar = null;
        }
        return new C4980d(aVar, a, a2, bVar, 2, (C4980d.C4981a) null);
    }
}
