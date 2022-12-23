package com.iab.omid.library.amazon.adsession;

import com.iab.omid.library.amazon.adsession.media.VastProperties;
import com.iab.omid.library.amazon.p229d.C7657e;

public final class AdEvents {
    private final C7636a adSession;

    private AdEvents(C7636a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7636a aVar = (C7636a) adSession2;
        C7657e.m21260a((Object) adSession2, "AdSession is null");
        C7657e.m21265d(aVar);
        C7657e.m21263b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54463a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7657e.m21263b(this.adSession);
        C7657e.m21267f(this.adSession);
        if (!this.adSession.mo54378f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54378f()) {
            this.adSession.mo54375c();
        }
    }

    public void loaded() {
        C7657e.m21264c(this.adSession);
        C7657e.m21267f(this.adSession);
        this.adSession.mo54376d();
    }

    public void loaded(VastProperties vastProperties) {
        C7657e.m21260a((Object) vastProperties, "VastProperties is null");
        C7657e.m21264c(this.adSession);
        C7657e.m21267f(this.adSession);
        this.adSession.mo54373a(vastProperties.mo54399a());
    }
}
