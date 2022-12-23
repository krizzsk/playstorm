package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.player.cache.C4607d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;

/* renamed from: com.fyber.inneractive.sdk.player.cache.e */
public class C4611e implements C4996g.C4997a {

    /* renamed from: a */
    public final C4607d.C4610c f11486a;

    /* renamed from: b */
    public C4607d.C4609b f11487b;

    /* renamed from: c */
    public final int f11488c;

    /* renamed from: d */
    public final C4309s f11489d;

    public C4611e(C4607d.C4609b bVar, C4607d.C4610c cVar, int i, C4309s sVar) {
        this.f11487b = bVar;
        this.f11488c = i;
        this.f11486a = cVar;
        this.f11489d = sVar;
    }

    /* renamed from: a */
    public C4996g mo24836a() {
        C4607d dVar = new C4607d();
        dVar.f11478h = this.f11487b;
        dVar.f11480j = this.f11488c;
        dVar.f11481k = this.f11489d;
        dVar.f11479i = this.f11486a;
        return dVar;
    }
}
