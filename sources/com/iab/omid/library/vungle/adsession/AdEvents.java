package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.iab.omid.library.vungle.p283d.C8110e;

public final class AdEvents {
    private final C8089a adSession;

    private AdEvents(C8089a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C8089a aVar = (C8089a) adSession2;
        C8110e.m23298a((Object) adSession2, "AdSession is null");
        C8110e.m23303d(aVar);
        C8110e.m23301b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo56237a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C8110e.m23301b(this.adSession);
        C8110e.m23305f(this.adSession);
        if (!this.adSession.mo56152e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo56152e()) {
            this.adSession.mo56149b();
        }
    }

    public void loaded() {
        C8110e.m23302c(this.adSession);
        C8110e.m23305f(this.adSession);
        this.adSession.mo56150c();
    }

    public void loaded(VastProperties vastProperties) {
        C8110e.m23298a((Object) vastProperties, "VastProperties is null");
        C8110e.m23302c(this.adSession);
        C8110e.m23305f(this.adSession);
        this.adSession.mo56148a(vastProperties.mo56173a());
    }
}
