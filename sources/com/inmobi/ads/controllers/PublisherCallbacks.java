package com.inmobi.ads.controllers;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

public abstract class PublisherCallbacks {
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(Map<Object, Object> map);

    public abstract void onAdDismissed();

    public void onAdDisplayFailed() {
    }

    public abstract void onAdDisplayed(AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
    }

    public void onAdImpressed() {
    }

    public abstract void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public abstract void onAdLoadSucceeded(AdMetaInfo adMetaInfo);

    public void onAdWillDisplay() {
    }

    public void onAudioStateChanged(boolean z) {
    }

    public abstract void onRequestPayloadCreated(byte[] bArr);

    public abstract void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onRewardsUnlocked(Map<Object, Object> map) {
    }

    public abstract void onUserLeftApplication();

    public void onVideoCompleted() {
    }

    public void onVideoSkipped() {
    }
}
