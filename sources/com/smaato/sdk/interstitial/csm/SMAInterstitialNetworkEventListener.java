package com.smaato.sdk.interstitial.csm;

public interface SMAInterstitialNetworkEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad();

    void onAdLoaded();

    void onAdOpened();

    void onAdTTLExpired();
}
