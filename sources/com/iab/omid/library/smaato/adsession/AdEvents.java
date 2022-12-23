package com.iab.omid.library.smaato.adsession;

import com.iab.omid.library.smaato.adsession.media.VastProperties;
import com.iab.omid.library.smaato.p277d.C8060e;

public final class AdEvents {
    private final C8039a adSession;

    private AdEvents(C8039a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C8039a aVar = (C8039a) adSession2;
        C8060e.m23074a((Object) adSession2, "AdSession is null");
        C8060e.m23079d(aVar);
        C8060e.m23077b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo56043a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C8060e.m23077b(this.adSession);
        C8060e.m23081f(this.adSession);
        if (!this.adSession.mo55958e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55958e()) {
            this.adSession.mo55955b();
        }
    }

    public void loaded() {
        C8060e.m23078c(this.adSession);
        C8060e.m23081f(this.adSession);
        this.adSession.mo55956c();
    }

    public void loaded(VastProperties vastProperties) {
        C8060e.m23074a((Object) vastProperties, "VastProperties is null");
        C8060e.m23078c(this.adSession);
        C8060e.m23081f(this.adSession);
        this.adSession.mo55954a(vastProperties.mo55979a());
    }
}
