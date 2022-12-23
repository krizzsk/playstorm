package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.adsession.AdSession;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7645f;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7657e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7636a adSession;

    private MediaEvents(C7636a aVar) {
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
        C7636a aVar = (C7636a) adSession2;
        C7657e.m21260a((Object) adSession2, "AdSession is null");
        C7657e.m21268g(aVar);
        C7657e.m21259a(aVar);
        C7657e.m21263b(aVar);
        C7657e.m21266e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54468a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7657e.m21260a((Object) interactionType, "InteractionType is null");
        C7657e.m21264c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7653b.m21243a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54471a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a("bufferFinish");
    }

    public void bufferStart() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a("complete");
    }

    public void firstQuartile() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a("midpoint");
    }

    public void pause() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7657e.m21260a((Object) playerState, "PlayerState is null");
        C7657e.m21264c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7653b.m21243a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54471a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7657e.m21264c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7653b.m21243a(jSONObject, "duration", Float.valueOf(f));
        C7653b.m21243a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7653b.m21243a(jSONObject, "deviceVolume", Float.valueOf(C7645f.m21206a().mo54453d()));
        this.adSession.getAdSessionStatePublisher().mo54471a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7657e.m21264c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54469a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7657e.m21264c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7653b.m21243a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7653b.m21243a(jSONObject, "deviceVolume", Float.valueOf(C7645f.m21206a().mo54453d()));
        this.adSession.getAdSessionStatePublisher().mo54471a("volumeChange", jSONObject);
    }
}
