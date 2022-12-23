package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C4033Ad ad);

    void onAdLoaded(C4033Ad ad);

    void onError(C4033Ad ad, AdError adError);

    void onLoggingImpression(C4033Ad ad);
}
