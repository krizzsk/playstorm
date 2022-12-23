package com.ogury.p376ed;

import com.ogury.core.OguryError;

/* renamed from: com.ogury.ed.OguryAdListener */
public interface OguryAdListener {
    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed();

    void onAdError(OguryError oguryError);

    void onAdLoaded();
}
