package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4290h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.util.C5350l;

/* renamed from: com.fyber.inneractive.sdk.player.a */
public class C4588a {

    /* renamed from: a */
    public C4450y f11401a;

    /* renamed from: b */
    public C4589a f11402b;

    /* renamed from: com.fyber.inneractive.sdk.player.a$a */
    public interface C4589a {
    }

    public C4588a(C4450y yVar) {
        this.f11401a = yVar;
    }

    /* renamed from: a */
    public C4589a mo24786a() throws Throwable {
        C4262a0 a0Var;
        UnitDisplayType unitDisplayType;
        if (this.f11402b == null) {
            Application application = C5350l.f14216a;
            C4450y yVar = this.f11401a;
            C5293g gVar = (C5293g) yVar.f10914b;
            C4346z zVar = yVar.f10916d;
            InneractiveAdRequest inneractiveAdRequest = yVar.f10913a;
            C4459a aVar = null;
            if (!(yVar == null || zVar == null || !((C4290h) yVar.f10915c.mo24338a(C4290h.class)).mo24318c() || (a0Var = ((C4345y) this.f11401a.f10916d).f10750f) == null || ((unitDisplayType = a0Var.f10579j) != UnitDisplayType.INTERSTITIAL && unitDisplayType != UnitDisplayType.REWARDED))) {
                aVar = IAConfigManager.f10525J.f10535I;
            }
            this.f11402b = new C5066f(application, gVar, zVar, inneractiveAdRequest, yVar, aVar);
        }
        return this.f11402b;
    }
}
