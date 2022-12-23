package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.p259d.C7909e;

public final class AdEvents {
    private final C7888a adSession;

    private AdEvents(C7888a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7888a aVar = (C7888a) adSession2;
        C7909e.m22391a((Object) adSession2, "AdSession is null");
        C7909e.m22396d(aVar);
        C7909e.m22394b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55436a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C7909e.m22394b(this.adSession);
        C7909e.m22398f(this.adSession);
        if (!this.adSession.mo55359e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55359e()) {
            this.adSession.mo55356b();
        }
    }

    public final void loaded() {
        C7909e.m22395c(this.adSession);
        C7909e.m22398f(this.adSession);
        this.adSession.mo55357c();
    }

    public final void loaded(VastProperties vastProperties) {
        C7909e.m22391a((Object) vastProperties, "VastProperties is null");
        C7909e.m22395c(this.adSession);
        C7909e.m22398f(this.adSession);
        this.adSession.mo55355a(vastProperties.mo55380a());
    }
}
