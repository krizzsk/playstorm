package com.smaato.sdk.nativead;

import android.view.View;

public interface NativeAdRenderer {
    NativeAdAssets getAssets();

    void registerForClicks(Iterable<? extends View> iterable);

    void registerForClicks(View... viewArr);

    void registerForImpression(View view);

    void renderInView(NativeAdView nativeAdView);
}
