package com.smaato.sdk.nativead;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.lifecycle.Lifecycling;
import com.smaato.sdk.nativead.viewmodel.NativeAdViewModel;

public class NativeAd {
    private final NativeAdRequest nativeAdRequest;

    public interface Listener {
        void onAdClicked(NativeAd nativeAd);

        void onAdFailedToLoad(NativeAd nativeAd, NativeAdError nativeAdError);

        void onAdImpressed(NativeAd nativeAd);

        void onAdLoaded(NativeAd nativeAd, NativeAdRenderer nativeAdRenderer);

        void onTtlExpired(NativeAd nativeAd);
    }

    public NativeAd(NativeAdRequest nativeAdRequest2) {
        this.nativeAdRequest = nativeAdRequest2;
    }

    public NativeAdRequest request() {
        return this.nativeAdRequest;
    }

    public static void loadAd(Lifecycle lifecycle, NativeAdRequest nativeAdRequest2, Listener listener) {
        new NativeAdViewModel().loadAd(lifecycle, nativeAdRequest2, listener);
    }

    public static void loadAd(LifecycleOwner lifecycleOwner, NativeAdRequest nativeAdRequest2, Listener listener) {
        loadAd(Lifecycling.wrap(lifecycleOwner), nativeAdRequest2, listener);
    }

    public static void loadAd(View view, NativeAdRequest nativeAdRequest2, Listener listener) {
        loadAd(Lifecycling.m32961of(view), nativeAdRequest2, listener);
    }
}
