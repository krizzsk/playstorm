package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.p257b.C7897f;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7909e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7888a adSession;

    private MediaEvents(C7888a aVar) {
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
        C7888a aVar = (C7888a) adSession2;
        C7909e.m22391a((Object) adSession2, "AdSession is null");
        C7909e.m22399g(aVar);
        C7909e.m22390a(aVar);
        C7909e.m22394b(aVar);
        C7909e.m22397e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo55441a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C7909e.m22391a((Object) interactionType, "InteractionType is null");
        C7909e.m22395c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7905b.m22375a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo55444a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public final void bufferFinish() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a("bufferFinish");
    }

    public final void bufferStart() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public final void complete() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a("complete");
    }

    public final void firstQuartile() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public final void midpoint() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a("midpoint");
    }

    public final void pause() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public final void playerStateChange(PlayerState playerState) {
        C7909e.m22391a((Object) playerState, "PlayerState is null");
        C7909e.m22395c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7905b.m22375a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo55444a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public final void skipped() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7909e.m22395c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7905b.m22375a(jSONObject, "duration", Float.valueOf(f));
        C7905b.m22375a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7905b.m22375a(jSONObject, "deviceVolume", Float.valueOf(C7897f.m22340a().mo55426d()));
        this.adSession.getAdSessionStatePublisher().mo55444a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C7909e.m22395c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo55442a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C7909e.m22395c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7905b.m22375a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7905b.m22375a(jSONObject, "deviceVolume", Float.valueOf(C7897f.m22340a().mo55426d()));
        this.adSession.getAdSessionStatePublisher().mo55444a("volumeChange", jSONObject);
    }
}
