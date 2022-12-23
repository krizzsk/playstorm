package com.smaato.sdk.interstitial.csm;

import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenter;

public interface InterstitialCsmAdPresenter extends CsmAdPresenter {

    public interface Listener extends AdPresenter.Listener<InterstitialCsmAdPresenter> {
        void onAdClosed(InterstitialCsmAdPresenter interstitialCsmAdPresenter);

        void onAdOpened(InterstitialCsmAdPresenter interstitialCsmAdPresenter);
    }

    void setInterstitialAdListener(Listener listener);

    void showAd();
}
