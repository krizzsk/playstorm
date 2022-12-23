package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.n */
public final class C5004n implements C4996g.C4997a {

    /* renamed from: a */
    public final Context f13354a;

    /* renamed from: b */
    public final C4970a0<? super C4996g> f13355b;

    /* renamed from: c */
    public final C4996g.C4997a f13356c;

    public C5004n(Context context, C4970a0<? super C4996g> a0Var, C4996g.C4997a aVar) {
        this.f13354a = context.getApplicationContext();
        this.f13355b = a0Var;
        this.f13356c = aVar;
    }

    /* renamed from: a */
    public C4996g mo24836a() {
        return new C5003m(this.f13354a, this.f13355b, this.f13356c.mo24836a());
    }
}
