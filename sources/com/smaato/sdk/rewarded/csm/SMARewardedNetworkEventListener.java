package com.smaato.sdk.rewarded.csm;

public interface SMARewardedNetworkEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError();

    void onAdFailedToLoad();

    void onAdLoaded();

    void onAdReward();

    void onAdStarted();

    void onAdTTLExpired();
}
