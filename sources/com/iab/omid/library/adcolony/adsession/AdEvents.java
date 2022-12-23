package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.iab.omid.library.adcolony.p223d.C7607e;

public final class AdEvents {
    private final C7586a adSession;

    private AdEvents(C7586a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7586a aVar = (C7586a) adSession2;
        C7607e.m21030a((Object) adSession2, "AdSession is null");
        C7607e.m21035d(aVar);
        C7607e.m21033b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54264a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7607e.m21033b(this.adSession);
        C7607e.m21037f(this.adSession);
        if (!this.adSession.mo54179f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo54179f()) {
            this.adSession.mo54176c();
        }
    }

    public void loaded() {
        C7607e.m21034c(this.adSession);
        C7607e.m21037f(this.adSession);
        this.adSession.mo54177d();
    }

    public void loaded(VastProperties vastProperties) {
        C7607e.m21030a((Object) vastProperties, "VastProperties is null");
        C7607e.m21034c(this.adSession);
        C7607e.m21037f(this.adSession);
        this.adSession.mo54174a(vastProperties.mo54200a());
    }
}
