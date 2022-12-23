package com.smaato.sdk.core.openmeasurement;

import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;

public class OMWebViewViewabilityTracker extends BaseOMViewabilityTracker {
    private final String customReferenceData;
    private final Partner partner;

    public /* bridge */ /* synthetic */ void registerFriendlyObstruction(View view) {
        super.registerFriendlyObstruction(view);
    }

    public /* bridge */ /* synthetic */ void removeFriendlyObstruction(View view) {
        super.removeFriendlyObstruction(view);
    }

    public /* bridge */ /* synthetic */ void startTracking() {
        super.startTracking();
    }

    public /* bridge */ /* synthetic */ void stopTracking() {
        super.stopTracking();
    }

    public /* bridge */ /* synthetic */ void trackImpression() {
        super.trackImpression();
    }

    public /* bridge */ /* synthetic */ void trackLoaded() {
        super.trackLoaded();
    }

    OMWebViewViewabilityTracker(Partner partner2, String str) {
        this.partner = partner2;
        this.customReferenceData = str;
    }

    public OMWebViewViewabilityTracker() {
        this.partner = Partner.createPartner("name", "version");
        this.customReferenceData = "";
    }

    public void registerAdView(WebView webView) {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(this.partner, webView, "", this.customReferenceData));
        this.adSession = createAdSession;
        createAdSession.registerAdView(webView);
        this.adEvents = AdEvents.createAdEvents(this.adSession);
        Log.i("OMTracker", "OM Viewabiltiy registerAdView");
    }

    public void updateAdView(WebView webView) {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.registerAdView(webView);
        }
    }
}
