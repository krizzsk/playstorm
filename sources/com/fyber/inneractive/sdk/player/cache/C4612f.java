package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.player.cache.C4599c;
import com.fyber.inneractive.sdk.player.cache.C4614h;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.cache.f */
public class C4612f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4614h f11490a;

    public C4612f(C4614h hVar) {
        this.f11490a = hVar;
    }

    public void run() {
        try {
            C4614h hVar = this.f11490a;
            C4599c.C4606f b = hVar.f11493b.mo24808b(hVar.mo24839a());
            C4614h hVar2 = this.f11490a;
            hVar2.f11494c = b;
            if (b == null) {
                C4599c.C4602c a = hVar2.f11493b.mo24805a(hVar2.mo24839a());
                if (a == null) {
                    boolean unused = this.f11490a.f11505n = true;
                }
                if (a != null) {
                    C4614h hVar3 = this.f11490a;
                    IAlog.m16702d("%s | start | got an editor for %s", hVar3.f11492a, hVar3.mo24839a());
                    a.mo24821a();
                }
            }
        } catch (IOException e) {
            C4614h hVar4 = this.f11490a;
            IAlog.m16698a(String.format("%s | Exception raised starting a new caching process for %s", new Object[]{hVar4.f11492a, hVar4.mo24839a()}), e, new Object[0]);
            C4574r.m14050a("Exception raised starting a new caching process", e.getMessage(), (InneractiveAdRequest) null, (C5291e) null);
        }
        C4614h hVar5 = this.f11490a;
        if (hVar5.f11494c != null || hVar5.f11505n) {
            C4614h.m14121b(hVar5, true);
            return;
        }
        C4614h.C4619e eVar = hVar5.f11499h;
        if (eVar != null) {
            eVar.start();
        }
    }
}
