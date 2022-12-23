package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.util.Objects;

public class InterstitialRequestError {
    private final String adSpaceId;
    private final InterstitialError interstitialError;
    private final String publisherId;

    InterstitialRequestError(InterstitialError interstitialError2, String str, String str2) {
        this.interstitialError = (InterstitialError) Objects.requireNonNull(interstitialError2);
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public InterstitialError getInterstitialError() {
        return this.interstitialError;
    }
}
