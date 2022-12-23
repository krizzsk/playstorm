package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4448w;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.flow.C4451z;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.player.controller.C4632b;
import com.fyber.inneractive.sdk.player.controller.C4637e;
import com.fyber.inneractive.sdk.player.p191ui.C5095d;
import com.fyber.inneractive.sdk.player.p191ui.C5098g;

/* renamed from: com.fyber.inneractive.sdk.renderers.c */
public class C5270c extends C5286n {

    /* renamed from: c */
    public C5066f f13980c;

    public C5270c(C5073i iVar) {
        this.f13980c = (C5066f) iVar.mo25681c();
    }

    /* renamed from: a */
    public C5098g mo26329a(Context context) {
        if (this.f14048b == null) {
            this.f14048b = new C5095d(context);
        }
        return this.f14048b;
    }

    /* renamed from: a */
    public C4632b mo26320a(InneractiveAdSpot inneractiveAdSpot, C4450y yVar) {
        if (this.f14047a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean z = false;
            boolean isOverlayOutside = selectedUnitController instanceof C4451z ? ((C4451z) selectedUnitController).isOverlayOutside() : false;
            Skip skip = null;
            if (inneractiveAdSpot instanceof C4448w) {
                skip = ((C4448w) inneractiveAdSpot).mo24644a();
            }
            Skip skip2 = skip;
            C5066f fVar = this.f13980c;
            C5095d dVar = (C5095d) this.f14048b;
            C4346z zVar = inneractiveAdSpot.getAdContent().f10916d;
            C4309s sVar = yVar.f10915c;
            if (IAConfigManager.f10525J.f10547l || yVar.f10918f) {
                z = true;
            }
            this.f14047a = new C4637e(fVar, dVar, zVar, sVar, false, isOverlayOutside, skip2, z);
        }
        return this.f14047a;
    }

    /* renamed from: a */
    public boolean mo26323a() {
        this.f13980c.getClass();
        return false;
    }

    /* renamed from: a */
    public void mo26322a(C4591c.C4594c cVar) {
        C5066f fVar = this.f13980c;
        fVar.getClass();
        cVar.mo24802a(fVar);
    }
}
