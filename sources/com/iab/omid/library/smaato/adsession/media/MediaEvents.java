package com.iab.omid.library.smaato.adsession.media;

import com.iab.omid.library.smaato.adsession.AdSession;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.p275b.C8048f;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8060e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C8039a adSession;

    private MediaEvents(C8039a aVar) {
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
        C8039a aVar = (C8039a) adSession2;
        C8060e.m23074a((Object) adSession2, "AdSession is null");
        C8060e.m23082g(aVar);
        C8060e.m23073a(aVar);
        C8060e.m23077b(aVar);
        C8060e.m23080e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo56048a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C8060e.m23074a((Object) interactionType, "InteractionType is null");
        C8060e.m23078c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8056b.m23058a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo56051a(TJAdUnitConstants.String.AD_USER_INTERACTION, jSONObject);
    }

    public void bufferFinish() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a("bufferFinish");
    }

    public void bufferStart() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a(TJAdUnitConstants.String.VIDEO_BUFFER_START);
    }

    public void complete() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a("complete");
    }

    public void firstQuartile() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
    }

    public void midpoint() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a("midpoint");
    }

    public void pause() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        C8060e.m23074a((Object) playerState, "PlayerState is null");
        C8060e.m23078c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8056b.m23058a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo56051a("playerStateChange", jSONObject);
    }

    public void resume() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C8060e.m23078c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8056b.m23058a(jSONObject, "duration", Float.valueOf(f));
        C8056b.m23058a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C8056b.m23058a(jSONObject, "deviceVolume", Float.valueOf(C8048f.m23022a().mo56033d()));
        this.adSession.getAdSessionStatePublisher().mo56051a("start", jSONObject);
    }

    public void thirdQuartile() {
        C8060e.m23078c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo56049a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C8060e.m23078c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8056b.m23058a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C8056b.m23058a(jSONObject, "deviceVolume", Float.valueOf(C8048f.m23022a().mo56033d()));
        this.adSession.getAdSessionStatePublisher().mo56051a("volumeChange", jSONObject);
    }
}
