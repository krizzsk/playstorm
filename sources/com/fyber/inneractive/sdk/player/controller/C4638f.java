package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.f */
public class C4638f implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ C4640g f11577a;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.f$a */
    public class C4639a implements Runnable {
        public C4639a() {
        }

        public void run() {
            C4640g gVar = C4638f.this.f11577a;
            C4640g.C4647g gVar2 = gVar.f11582d;
            if (gVar2 != null) {
                TextureView textureView = gVar.f11588j;
                C4659p pVar = (C4659p) gVar2;
                pVar.f11638a.f11613d.post(new C4658o(pVar));
            }
        }
    }

    public C4638f(C4640g gVar) {
        this.f11577a = gVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4640g gVar = this.f11577a;
        gVar.getClass();
        IAlog.m16699a("%sonSurfaceTextureAvailable", IAlog.m16696a((Object) gVar));
        C4640g gVar2 = this.f11577a;
        boolean z = !surfaceTexture.equals(gVar2.f11589k);
        gVar2.f11589k = surfaceTexture;
        if (gVar2.f11590l == null || z) {
            gVar2.f11590l = new Surface(gVar2.f11589k);
        }
        gVar2.mo24858a(gVar2.f11590l);
        C4640g gVar3 = this.f11577a;
        C4640g.C4647g gVar4 = gVar3.f11582d;
        if (gVar4 != null) {
            TextureView textureView = gVar3.f11588j;
            C4652k kVar = ((C4659p) gVar4).f11638a;
            kVar.getClass();
            IAlog.m16699a("%sonSurfaceTextureAvailable", IAlog.m16696a((Object) kVar));
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C4640g gVar = this.f11577a;
        gVar.getClass();
        IAlog.m16699a("%s onSurfaceTextureDestroyed", IAlog.m16696a((Object) gVar));
        this.f11577a.mo24872k();
        this.f11577a.mo24858a((Surface) null);
        boolean unused = this.f11577a.f11593o = true;
        C4640g gVar2 = this.f11577a;
        C4668b bVar = gVar2.f11583e;
        if (bVar == C4668b.f11663i || bVar == C4668b.Error || bVar == C4668b.Idle) {
            gVar2.getClass();
            IAlog.m16699a("%sReleasing surface texture", IAlog.m16696a((Object) gVar2));
            this.f11577a.f11589k = null;
            return true;
        }
        gVar2.getClass();
        IAlog.m16699a("%s caching surface texture", IAlog.m16696a((Object) gVar2));
        C4640g gVar3 = this.f11577a;
        gVar3.f11589k = surfaceTexture;
        gVar3.f11587i.post(new C4639a());
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        C4591c cVar;
        C4640g gVar;
        C4640g.C4647g gVar2 = this.f11577a.f11582d;
        if (!(gVar2 == null || (cVar = ((C4659p) gVar2).f11638a.f11610a) == null || (gVar = cVar.f11406b) == null)) {
            gVar.f11587i.post(new C4649i(gVar));
        }
        C4640g gVar3 = this.f11577a;
        if (gVar3.f11593o && (surface = gVar3.f11590l) != null) {
            gVar3.mo24858a(surface);
            boolean unused = this.f11577a.f11593o = false;
        }
    }
}
