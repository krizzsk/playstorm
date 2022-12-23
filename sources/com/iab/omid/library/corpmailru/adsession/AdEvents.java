package com.iab.omid.library.corpmailru.adsession;

import com.iab.omid.library.corpmailru.adsession.media.VastProperties;
import com.iab.omid.library.corpmailru.p241d.C7757e;

public final class AdEvents {
    private final C7736a adSession;

    private AdEvents(C7736a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7736a aVar = (C7736a) adSession2;
        C7757e.m21716a((Object) adSession2, "AdSession is null");
        C7757e.m21721d(aVar);
        C7757e.m21719b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54857a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7757e.m21719b(this.adSession);
        C7757e.m21723f(this.adSession);
        if (!this.adSession.mo54772e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54772e()) {
            this.adSession.mo54769b();
        }
    }

    public void loaded() {
        C7757e.m21720c(this.adSession);
        C7757e.m21723f(this.adSession);
        this.adSession.mo54770c();
    }

    public void loaded(VastProperties vastProperties) {
        C7757e.m21716a((Object) vastProperties, "VastProperties is null");
        C7757e.m21720c(this.adSession);
        C7757e.m21723f(this.adSession);
        this.adSession.mo54768a(vastProperties.mo54793a());
    }
}
