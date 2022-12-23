package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7595f;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7607e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C7586a adSession;

    private MediaEvents(C7586a aVar) {
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
        C7586a aVar = (C7586a) adSession2;
        C7607e.m21030a((Object) adSession2, "AdSession is null");
        C7607e.m21038g(aVar);
        C7607e.m21029a(aVar);
        C7607e.m21033b(aVar);
        C7607e.m21036e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo54269a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C7607e.m21030a((Object) interactionType, "InteractionType is null");
        C7607e.m21034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7603b.m21013a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo54272a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a("bufferFinish");
    }

    public void bufferStart() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a("complete");
    }

    public void firstQuartile() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a("midpoint");
    }

    public void pause() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C7607e.m21030a((Object) playerState, "PlayerState is null");
        C7607e.m21034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7603b.m21013a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo54272a("playerStateChange", jSONObject);
    }

    public void resume() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C7607e.m21034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7603b.m21013a(jSONObject, "duration", Float.valueOf(f));
        C7603b.m21013a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C7603b.m21013a(jSONObject, "deviceVolume", Float.valueOf(C7595f.m20976a().mo54254d()));
        this.adSession.getAdSessionStatePublisher().mo54272a("start", jSONObject);
    }

    public void thirdQuartile() {
        C7607e.m21034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo54270a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C7607e.m21034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C7603b.m21013a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C7603b.m21013a(jSONObject, "deviceVolume", Float.valueOf(C7595f.m20976a().mo54254d()));
        this.adSession.getAdSessionStatePublisher().mo54272a("volumeChange", jSONObject);
    }
}
