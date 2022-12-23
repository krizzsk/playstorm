package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* renamed from: com.inmobi.media.ej */
/* compiled from: AdEventHandler */
final class C6033ej {

    /* renamed from: a */
    AdEvents f15347a;

    /* renamed from: b */
    MediaEvents f15348b;

    public C6033ej(AdSession adSession, String str) {
        if (((str.hashCode() == -1191784049 && str.equals("native_video_ad")) ? (char) 0 : 65535) == 0) {
            this.f15348b = MediaEvents.createMediaEvents(adSession);
        }
        this.f15347a = AdEvents.createAdEvents(adSession);
    }

    /* renamed from: a */
    public final void mo35160a() {
        AdEvents adEvents = this.f15347a;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }
}
