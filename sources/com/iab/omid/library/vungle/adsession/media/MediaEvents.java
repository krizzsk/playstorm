package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.p281b.C8098f;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8110e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C8089a adSession;

    private MediaEvents(C8089a aVar) {
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
        C8089a aVar = (C8089a) adSession2;
        C8110e.m23298a((Object) adSession2, "AdSession is null");
        C8110e.m23306g(aVar);
        C8110e.m23297a(aVar);
        C8110e.m23301b(aVar);
        C8110e.m23304e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo56242a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C8110e.m23298a((Object) interactionType, "InteractionType is null");
        C8110e.m23302c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8106b.m23282a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo56245a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a("bufferFinish");
    }

    public void bufferStart() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a("complete");
    }

    public void firstQuartile() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a("midpoint");
    }

    public void pause() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C8110e.m23298a((Object) playerState, "PlayerState is null");
        C8110e.m23302c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8106b.m23282a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo56245a("playerStateChange", jSONObject);
    }

    public void resume() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C8110e.m23302c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8106b.m23282a(jSONObject, "duration", Float.valueOf(f));
        C8106b.m23282a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C8106b.m23282a(jSONObject, "deviceVolume", Float.valueOf(C8098f.m23246a().mo56227d()));
        this.adSession.getAdSessionStatePublisher().mo56245a("start", jSONObject);
    }

    public void thirdQuartile() {
        C8110e.m23302c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56243a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C8110e.m23302c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8106b.m23282a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C8106b.m23282a(jSONObject, "deviceVolume", Float.valueOf(C8098f.m23246a().mo56227d()));
        this.adSession.getAdSessionStatePublisher().mo56245a("volumeChange", jSONObject);
    }
}
