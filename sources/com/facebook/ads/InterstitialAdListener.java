package com.facebook.ads;

public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C4033Ad ad);

    void onInterstitialDisplayed(C4033Ad ad);
}
