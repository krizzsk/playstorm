package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdPresenter;

/* renamed from: com.smaato.sdk.core.ad.BannerAdPresenter */
public interface BannerAdPresenter extends AdPresenter {

    /* renamed from: com.smaato.sdk.core.ad.BannerAdPresenter$Listener */
    public interface Listener extends AdPresenter.Listener<BannerAdPresenter> {
        void onAdClosed();

        void onAdExpanded(BannerAdPresenter bannerAdPresenter);

        void onAdResized();

        void onAdUnload(BannerAdPresenter bannerAdPresenter);
    }

    void initialize();

    void setListener(Listener listener);
}
