package com.iab.omid.library.inmobi.adsession;

import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.iab.omid.library.inmobi.p253d.C7859e;

public final class AdEvents {
    private final C7838a adSession;

    private AdEvents(C7838a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C7838a aVar = (C7838a) adSession2;
        C7859e.m22170a((Object) adSession2, "AdSession is null");
        C7859e.m22175d(aVar);
        C7859e.m22173b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55250a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C7859e.m22173b(this.adSession);
        C7859e.m22177f(this.adSession);
        if (!this.adSession.mo55165e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo55165e()) {
            this.adSession.mo55162b();
        }
    }

    public void loaded() {
        C7859e.m22174c(this.adSession);
        C7859e.m22177f(this.adSession);
        this.adSession.mo55163c();
    }

    public void loaded(VastProperties vastProperties) {
        C7859e.m22170a((Object) vastProperties, "VastProperties is null");
        C7859e.m22174c(this.adSession);
        C7859e.m22177f(this.adSession);
        this.adSession.mo55161a(vastProperties.mo55186a());
    }
}
