package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7695f;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7707e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7686a adSession;

    private MediaEvents(C7686a aVar) {
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
        C7686a aVar = (C7686a) adSession2;
        C7707e.m21490a((Object) adSession2, "AdSession is null");
        C7707e.m21498g(aVar);
        C7707e.m21489a(aVar);
        C7707e.m21493b(aVar);
        C7707e.m21496e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54667a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7707e.m21490a((Object) interactionType, "InteractionType is null");
        C7707e.m21494c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7703b.m21473a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54670a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a("bufferFinish");
    }

    public void bufferStart() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a("complete");
    }

    public void firstQuartile() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a("midpoint");
    }

    public void pause() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7707e.m21490a((Object) playerState, "PlayerState is null");
        C7707e.m21494c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7703b.m21473a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54670a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7707e.m21494c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7703b.m21473a(jSONObject, "duration", Float.valueOf(f));
        C7703b.m21473a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7703b.m21473a(jSONObject, "deviceVolume", Float.valueOf(C7695f.m21436a().mo54652d()));
        this.adSession.getAdSessionStatePublisher().mo54670a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7707e.m21494c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54668a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7707e.m21494c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7703b.m21473a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7703b.m21473a(jSONObject, "deviceVolume", Float.valueOf(C7695f.m21436a().mo54652d()));
        this.adSession.getAdSessionStatePublisher().mo54670a("volumeChange", jSONObject);
    }
}
