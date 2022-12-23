package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.C4912o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h */
public final class C4968h {

    /* renamed from: a */
    public final C4948s f13235a;

    /* renamed from: b */
    public final C4966f f13236b;

    /* renamed from: c */
    public final Object f13237c;

    /* renamed from: d */
    public final C4912o[] f13238d;

    public C4968h(C4948s sVar, C4966f fVar, Object obj, C4912o[] oVarArr) {
        this.f13235a = sVar;
        this.f13236b = fVar;
        this.f13237c = obj;
        this.f13238d = oVarArr;
    }

    /* renamed from: a */
    public boolean mo25510a(C4968h hVar, int i) {
        if (hVar != null && C5049u.m15393a((Object) this.f13236b.f13233b[i], (Object) hVar.f13236b.f13233b[i]) && C5049u.m15393a((Object) this.f13238d[i], (Object) hVar.f13238d[i])) {
            return true;
        }
        return false;
    }
}
