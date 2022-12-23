package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.iab.omid.library.fyber.p247d.C7808e;

public final class AdEvents {
    private final C7787a adSession;

    private AdEvents(C7787a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7787a aVar = (C7787a) adSession2;
        C7808e.m21944a((Object) adSession2, "AdSession is null");
        C7808e.m21949d(aVar);
        C7808e.m21947b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55055a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7808e.m21947b(this.adSession);
        C7808e.m21951f(this.adSession);
        if (!this.adSession.mo54970f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54970f()) {
            this.adSession.mo54967c();
        }
    }

    public void loaded() {
        C7808e.m21948c(this.adSession);
        C7808e.m21951f(this.adSession);
        this.adSession.mo54968d();
    }

    public void loaded(VastProperties vastProperties) {
        C7808e.m21944a((Object) vastProperties, "VastProperties is null");
        C7808e.m21948c(this.adSession);
        C7808e.m21951f(this.adSession);
        this.adSession.mo54965a(vastProperties.mo54991a());
    }
}
