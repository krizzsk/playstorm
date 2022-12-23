package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7796f;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7808e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7787a adSession;

    private MediaEvents(C7787a aVar) {
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
        C7787a aVar = (C7787a) adSession2;
        C7808e.m21944a((Object) adSession2, "AdSession is null");
        C7808e.m21952g(aVar);
        C7808e.m21943a(aVar);
        C7808e.m21947b(aVar);
        C7808e.m21950e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55060a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7808e.m21944a((Object) interactionType, "InteractionType is null");
        C7808e.m21948c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7804b.m21927a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55063a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a("bufferFinish");
    }

    public void bufferStart() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a("complete");
    }

    public void firstQuartile() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a("midpoint");
    }

    public void pause() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7808e.m21944a((Object) playerState, "PlayerState is null");
        C7808e.m21948c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7804b.m21927a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55063a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7808e.m21948c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7804b.m21927a(jSONObject, "duration", Float.valueOf(f));
        C7804b.m21927a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7804b.m21927a(jSONObject, "deviceVolume", Float.valueOf(C7796f.m21890a().mo55045d()));
        this.adSession.getAdSessionStatePublisher().mo55063a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7808e.m21948c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55061a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7808e.m21948c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7804b.m21927a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7804b.m21927a(jSONObject, "deviceVolume", Float.valueOf(C7796f.m21890a().mo55045d()));
        this.adSession.getAdSessionStatePublisher().mo55063a("volumeChange", jSONObject);
    }
}
