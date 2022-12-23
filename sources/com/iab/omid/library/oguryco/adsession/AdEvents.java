package com.iab.omid.library.oguryco.adsession;

import com.iab.omid.library.oguryco.adsession.media.VastProperties;
import com.iab.omid.library.oguryco.p271d.C8010e;

public final class AdEvents {
    private final C7988a adSession;

    private AdEvents(C7988a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7988a aVar = (C7988a) adSession2;
        C8010e.m22850a((Object) adSession2, "AdSession is null");
        C8010e.m22855d(aVar);
        C8010e.m22853b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55849a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C8010e.m22853b(this.adSession);
        C8010e.m22857f(this.adSession);
        if (!this.adSession.mo55746e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55746e()) {
            this.adSession.mo55743b();
        }
    }

    public final void loaded() {
        C8010e.m22854c(this.adSession);
        C8010e.m22857f(this.adSession);
        this.adSession.mo55744c();
    }

    public final void loaded(VastProperties vastProperties) {
        C8010e.m22854c(this.adSession);
        C8010e.m22857f(this.adSession);
        this.adSession.mo55742a(vastProperties.mo55768a());
    }
}
