package com.iab.omid.library.mmadbridge.adsession;

import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.iab.omid.library.mmadbridge.p265d.C7959e;

public final class AdEvents {
    private final C7938a adSession;

    private AdEvents(C7938a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7938a aVar = (C7938a) adSession2;
        C7959e.m22619a((Object) adSession2, "AdSession is null");
        C7959e.m22624d(aVar);
        C7959e.m22622b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55634a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7959e.m22622b(this.adSession);
        C7959e.m22626f(this.adSession);
        if (!this.adSession.mo55549f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55549f()) {
            this.adSession.mo55546c();
        }
    }

    public void loaded() {
        C7959e.m22623c(this.adSession);
        C7959e.m22626f(this.adSession);
        this.adSession.mo55547d();
    }

    public void loaded(VastProperties vastProperties) {
        C7959e.m22619a((Object) vastProperties, "VastProperties is null");
        C7959e.m22623c(this.adSession);
        C7959e.m22626f(this.adSession);
        this.adSession.mo55544a(vastProperties.mo55570a());
    }
}
