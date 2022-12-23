package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.p235d.C7707e;

public final class AdEvents {
    private final C7686a adSession;

    private AdEvents(C7686a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7686a aVar = (C7686a) adSession2;
        C7707e.m21490a((Object) adSession2, "AdSession is null");
        C7707e.m21495d(aVar);
        C7707e.m21493b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54662a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7707e.m21493b(this.adSession);
        C7707e.m21497f(this.adSession);
        if (!this.adSession.mo54577f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54577f()) {
            this.adSession.mo54574c();
        }
    }

    public void loaded() {
        C7707e.m21494c(this.adSession);
        C7707e.m21497f(this.adSession);
        this.adSession.mo54575d();
    }

    public void loaded(VastProperties vastProperties) {
        C7707e.m21490a((Object) vastProperties, "VastProperties is null");
        C7707e.m21494c(this.adSession);
        C7707e.m21497f(this.adSession);
        this.adSession.mo54572a(vastProperties.mo54598a());
    }
}
