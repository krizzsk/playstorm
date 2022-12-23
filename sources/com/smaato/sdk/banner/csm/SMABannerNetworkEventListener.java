package com.smaato.sdk.banner.csm;

import android.view.View;

public interface SMABannerNetworkEventListener {
    void onAdClicked();

    void onAdFailedToLoad();

    void onAdLoaded(View view);

    void onAdTTLExpired();
}
