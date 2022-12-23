package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdPresenter;

/* renamed from: com.smaato.sdk.core.ad.RewardedAdPresenter */
public interface RewardedAdPresenter extends AdPresenter {

    /* renamed from: com.smaato.sdk.core.ad.RewardedAdPresenter$Listener */
    public interface Listener extends AdPresenter.Listener<RewardedAdPresenter> {
        void onClose(RewardedAdPresenter rewardedAdPresenter);

        void onCompleted(RewardedAdPresenter rewardedAdPresenter);

        void onStart(RewardedAdPresenter rewardedAdPresenter);
    }

    /* renamed from: com.smaato.sdk.core.ad.RewardedAdPresenter$OnCloseEnabledListener */
    public interface OnCloseEnabledListener {
        void onClose(RewardedAdPresenter rewardedAdPresenter);

        void onCloseEnabled(RewardedAdPresenter rewardedAdPresenter);
    }

    Listener getListener();

    void onCloseClicked();

    void setListener(Listener listener);

    void setOnCloseEnabledListener(OnCloseEnabledListener onCloseEnabledListener);
}
