package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C5900bs;
import java.util.Map;

public abstract class BannerAdEventListener extends C5900bs<InMobiBanner> {
    public void onAdDismissed(InMobiBanner inMobiBanner) {
    }

    public void onAdDisplayed(InMobiBanner inMobiBanner) {
    }

    public void onAdFetchFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
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
