package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.adsession.AdSession;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.p239b.C7745f;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7757e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7736a adSession;

    private MediaEvents(C7736a aVar) {
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
        C7736a aVar = (C7736a) adSession2;
        C7757e.m21716a((Object) adSession2, "AdSession is null");
        C7757e.m21724g(aVar);
        C7757e.m21715a(aVar);
        C7757e.m21719b(aVar);
        C7757e.m21722e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54862a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7757e.m21716a((Object) interactionType, "InteractionType is null");
        C7757e.m21720c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7753b.m21700a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54865a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a("bufferFinish");
    }

    public void bufferStart() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a("complete");
    }

    public void firstQuartile() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a("midpoint");
    }

    public void pause() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7757e.m21716a((Object) playerState, "PlayerState is null");
        C7757e.m21720c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7753b.m21700a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54865a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7757e.m21720c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7753b.m21700a(jSONObject, "duration", Float.valueOf(f));
        C7753b.m21700a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7753b.m21700a(jSONObject, "deviceVolume", Float.valueOf(C7745f.m21664a().mo54847d()));
        this.adSession.getAdSessionStatePublisher().mo54865a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7757e.m21720c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54863a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7757e.m21720c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7753b.m21700a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7753b.m21700a(jSONObject, "deviceVolume", Float.valueOf(C7745f.m21664a().mo54847d()));
        this.adSession.getAdSessionStatePublisher().mo54865a("volumeChange", jSONObject);
    }
}
