package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.content.res.Resources;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.flow.C4451z;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.player.controller.C4632b;
import com.fyber.inneractive.sdk.player.controller.C4650j;
import com.fyber.inneractive.sdk.player.p191ui.C5097f;
import com.fyber.inneractive.sdk.player.p191ui.C5098g;

/* renamed from: com.fyber.inneractive.sdk.renderers.a */
public class C5265a extends C5286n {

    /* renamed from: c */
    public C5066f f13967c;

    public C5265a(C5073i iVar) {
        this.f13967c = (C5066f) iVar.mo25681c();
    }

    /* renamed from: a */
    public C5098g mo26321a(Context context) throws Resources.NotFoundException {
        if (this.f14048b == null) {
            this.f14048b = new C5097f(context);
        }
        return this.f14048b;
    }

    /* renamed from: a */
    public void mo26322a(C4591c.C4594c cVar) {
    }

    /* renamed from: a */
    public C4632b mo26320a(InneractiveAdSpot inneractiveAdSpot, C4450y yVar) {
        if (this.f14047a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean z = false;
            if (selectedUnitController instanceof C4451z) {
                z = ((C4451z) selectedUnitController).isOverlayOutside();
            }
            this.f14047a = new C4650j(this.f13967c, (C5097f) this.f14048b, C4261a.m13439b(inneractiveAdSpot.getAdContent().mo24367c().f14078m), yVar.f10915c, z);
        }
        return this.f14047a;
    }

    /* renamed from: a */
    public boolean mo26323a() {
        this.f13967c.getClass();
        return false;
    }
}
