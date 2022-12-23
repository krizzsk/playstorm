package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.p251b.C7847f;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7859e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7838a adSession;

    private MediaEvents(C7838a aVar) {
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
        C7838a aVar = (C7838a) adSession2;
        C7859e.m22170a((Object) adSession2, "AdSession is null");
        C7859e.m22178g(aVar);
        C7859e.m22169a(aVar);
        C7859e.m22173b(aVar);
        C7859e.m22176e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55255a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7859e.m22170a((Object) interactionType, "InteractionType is null");
        C7859e.m22174c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7855b.m22154a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55258a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a("bufferFinish");
    }

    public void bufferStart() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a("complete");
    }

    public void firstQuartile() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a("midpoint");
    }

    public void pause() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7859e.m22170a((Object) playerState, "PlayerState is null");
        C7859e.m22174c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7855b.m22154a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55258a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7859e.m22174c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7855b.m22154a(jSONObject, "duration", Float.valueOf(f));
        C7855b.m22154a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7855b.m22154a(jSONObject, "deviceVolume", Float.valueOf(C7847f.m22118a().mo55240d()));
        this.adSession.getAdSessionStatePublisher().mo55258a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7859e.m22174c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55256a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7859e.m22174c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7855b.m22154a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7855b.m22154a(jSONObject, "deviceVolume", Float.valueOf(C7847f.m22118a().mo55240d()));
        this.adSession.getAdSessionStatePublisher().mo55258a("volumeChange", jSONObject);
    }
}
