package com.smaato.sdk.core.openmeasurement;

import android.view.View;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;
import com.iab.omid.library.smaato.adsession.Partner;
import com.iab.omid.library.smaato.adsession.media.InteractionType;
import com.iab.omid.library.smaato.adsession.media.MediaEvents;
import com.iab.omid.library.smaato.adsession.media.PlayerState;
import com.iab.omid.library.smaato.adsession.media.Position;
import com.iab.omid.library.smaato.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class OMVideoViewabilityTracker extends BaseOMViewabilityTracker {
    private final String customReferenceData;
    private final String omidJsServiceContent;
    private final Partner partner;
    private final OMVideoResourceMapper resourceMapper;
    private MediaEvents videoEvents;

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

    OMVideoViewabilityTracker(Partner partner2, String str, String str2, OMVideoResourceMapper oMVideoResourceMapper) {
        this.partner = partner2;
        this.omidJsServiceContent = str;
        this.customReferenceData = str2;
        this.resourceMapper = oMVideoResourceMapper;
    }

    public void registerAdView(View view, Map<String, List<ViewabilityVerificationResource>> map) {
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.LOADED, owner, owner, false);
        List list = map.get(CampaignEx.KEY_OMID);
        Partner partner2 = this.partner;
        String str = this.omidJsServiceContent;
        OMVideoResourceMapper oMVideoResourceMapper = this.resourceMapper;
        if (list == null) {
            list = Collections.emptyList();
        }
        AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partner2, str, oMVideoResourceMapper.apply((List<ViewabilityVerificationResource>) list), (String) null, this.customReferenceData));
        this.adSession = createAdSession;
        createAdSession.registerAdView(view);
        this.adEvents = AdEvents.createAdEvents(this.adSession);
        this.videoEvents = MediaEvents.createMediaEvents(this.adSession);
    }

    public void trackPlayerStateChange() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
        }
    }

    public void trackVideoClicked() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(InteractionType.CLICK);
        }
    }

    public void trackLoaded(VideoProps videoProps) {
        Objects.onNotNull(this.videoEvents, new Consumer(videoProps) {
            public final /* synthetic */ VideoProps f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                OMVideoViewabilityTracker.this.lambda$trackLoaded$0$OMVideoViewabilityTracker(this.f$1, (MediaEvents) obj);
            }
        });
    }

    public /* synthetic */ void lambda$trackLoaded$0$OMVideoViewabilityTracker(VideoProps videoProps, MediaEvents mediaEvents) {
        VastProperties vastProperties;
        if (videoProps.isSkippable) {
            vastProperties = VastProperties.createVastPropertiesForSkippableMedia(videoProps.skipOffset, true, Position.STANDALONE);
        } else {
            vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        AdEvents adEvents = this.adEvents;
        if (adEvents != null) {
            adEvents.loaded(vastProperties);
        }
    }

    public void trackStarted(float f, float f2) {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.start(f, f2);
        }
    }

    public void trackFirstQuartile() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.firstQuartile();
        }
    }

    public void trackMidPoint() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.midpoint();
        }
    }

    public void trackThirdQuartile() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.thirdQuartile();
        }
    }

    public void trackCompleted() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    public void trackPaused() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.pause();
        }
    }

    public void trackResumed() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.resume();
        }
    }

    public void trackBufferStart() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    public void trackBufferFinish() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    public void trackPlayerVolumeChanged(float f) {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.volumeChange(f);
        }
    }

    public void trackSkipped() {
        MediaEvents mediaEvents = this.videoEvents;
        if (mediaEvents != null) {
            mediaEvents.skipped();
        }
    }
}
