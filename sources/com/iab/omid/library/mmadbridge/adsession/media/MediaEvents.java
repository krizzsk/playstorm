package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7947f;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7959e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7938a adSession;

    private MediaEvents(C7938a aVar) {
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
        C7938a aVar = (C7938a) adSession2;
        C7959e.m22619a((Object) adSession2, "AdSession is null");
        C7959e.m22627g(aVar);
        C7959e.m22618a(aVar);
        C7959e.m22622b(aVar);
        C7959e.m22625e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55639a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7959e.m22619a((Object) interactionType, "InteractionType is null");
        C7959e.m22623c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7955b.m22602a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55642a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a("bufferFinish");
    }

    public void bufferStart() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a("complete");
    }

    public void firstQuartile() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a("midpoint");
    }

    public void pause() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7959e.m22619a((Object) playerState, "PlayerState is null");
        C7959e.m22623c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7955b.m22602a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55642a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7959e.m22623c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7955b.m22602a(jSONObject, "duration", Float.valueOf(f));
        C7955b.m22602a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7955b.m22602a(jSONObject, "deviceVolume", Float.valueOf(C7947f.m22565a().mo55624d()));
        this.adSession.getAdSessionStatePublisher().mo55642a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7959e.m22623c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55640a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7959e.m22623c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7955b.m22602a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7955b.m22602a(jSONObject, "deviceVolume", Float.valueOf(C7947f.m22565a().mo55624d()));
        this.adSession.getAdSessionStatePublisher().mo55642a("volumeChange", jSONObject);
    }
}
