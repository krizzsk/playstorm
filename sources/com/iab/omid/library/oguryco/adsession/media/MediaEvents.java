package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.p269b.C7998f;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8010e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7988a adSession;

    private MediaEvents(C7988a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        C7988a aVar = (C7988a) adSession2;
        C8010e.m22850a((Object) adSession2, "AdSession is null");
        C8010e.m22858g(aVar);
        C8010e.m22849a(aVar);
        C8010e.m22853b(aVar);
        C8010e.m22856e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55854a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C8010e.m22850a((Object) interactionType, "InteractionType is null");
        C8010e.m22854c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55857a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public final void bufferFinish() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a("bufferFinish");
    }

    public final void bufferStart() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a("complete");
    }

    public final void firstQuartile() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void loaded(VastProperties vastProperties) {
        C8010e.m22850a((Object) vastProperties, "VastProperties is null");
        C8010e.m22853b(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55857a(TJAdUnitConstants.String.VIDEO_LOADED, vastProperties.mo55768a());
    }

    public final void midpoint() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a("midpoint");
    }

    public final void pause() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C8010e.m22850a((Object) playerState, "PlayerState is null");
        C8010e.m22854c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55857a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C8010e.m22854c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "duration", Float.valueOf(f));
        C8006b.m22834a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C8006b.m22834a(jSONObject, "deviceVolume", Float.valueOf(C7998f.m22798a().mo55839d()));
        this.adSession.getAdSessionStatePublisher().mo55857a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C8010e.m22854c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55855a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C8010e.m22854c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8006b.m22834a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C8006b.m22834a(jSONObject, "deviceVolume", Float.valueOf(C7998f.m22798a().mo55839d()));
        this.adSession.getAdSessionStatePublisher().mo55857a("volumeChange", jSONObject);
    }
}
