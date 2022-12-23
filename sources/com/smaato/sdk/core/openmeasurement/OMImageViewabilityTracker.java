package com.smaato.sdk.core.openmeasurement;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class OMImageViewabilityTracker extends BaseOMViewabilityTracker {
    private final String customReferenceData;
    public boolean hasTracked;
    private final String omidJsServiceContent;
    private final Partner partner;
    private final OMImageResourceMapper resourceMapper;

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

    public OMImageViewabilityTracker(Partner partner2, String str, String str2, OMImageResourceMapper oMImageResourceMapper) {
        this.hasTracked = false;
        this.partner = partner2;
        this.omidJsServiceContent = str;
        this.customReferenceData = str2;
        this.resourceMapper = oMImageResourceMapper;
    }

    public OMImageViewabilityTracker() {
        this.hasTracked = false;
        this.partner = Partner.createPartner("name", "version");
        this.omidJsServiceContent = "";
        this.customReferenceData = "";
        this.resourceMapper = new OMImageResourceMapper();
    }

    public void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map) {
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        List list = map.get(CampaignEx.KEY_OMID);
        Partner partner2 = this.partner;
        String str = this.omidJsServiceContent;
        OMImageResourceMapper oMImageResourceMapper = this.resourceMapper;
        if (list == null) {
            list = Collections.emptyList();
        }
        AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partner2, str, oMImageResourceMapper.apply((List<ViewabilityVerificationResource>) list), (String) null, this.customReferenceData));
        this.adSession = createAdSession;
        createAdSession.registerAdView(view);
        Log.i("OMTracker", "OM Viewabiltiy registerAdView");
        this.adEvents = AdEvents.createAdEvents(this.adSession);
    }

    public boolean isTracked() {
        return this.hasTracked;
    }

    public void setHasTracked(boolean z) {
        this.hasTracked = z;
    }
}
