package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.media.C5900bs;
import java.util.Map;

public abstract class InterstitialAdEventListener extends C5900bs<InMobiInterstitial> {
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
    }

    @Deprecated
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Deprecated
    public void onAdReceived(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
    }

    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
    }

    public /* bridge */ /* synthetic */ void onAdClicked(Object obj, Map map) {
        super.onAdClicked(obj, map);
    }

    public /* bridge */ /* synthetic */ void onAdFetchSuccessful(Object obj, AdMetaInfo adMetaInfo) {
        super.onAdFetchSuccessful(obj, adMetaInfo);
    }

    public /* bridge */ /* synthetic */ void onAdLoadFailed(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onAdLoadFailed(obj, inMobiAdRequestStatus);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(Object obj) {
        super.onAdLoadSucceeded(obj);
    }

    public /* bridge */ /* synthetic */ void onAdLoadSucceeded(Object obj, AdMetaInfo adMetaInfo) {
        super.onAdLoadSucceeded(obj, adMetaInfo);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }
}
