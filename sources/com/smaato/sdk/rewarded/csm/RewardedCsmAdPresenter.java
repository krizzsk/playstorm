package com.smaato.sdk.rewarded.csm;

import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.p378ad.AdPresenter;

public interface RewardedCsmAdPresenter extends CsmAdPresenter {

    public interface Listener extends AdPresenter.Listener<RewardedCsmAdPresenter> {
        void onAdClosed(RewardedCsmAdPresenter rewardedCsmAdPresenter);

        void onAdReward(RewardedCsmAdPresenter rewardedCsmAdPresenter);

        void onAdStarted(RewardedCsmAdPresenter rewardedCsmAdPresenter);
    }

    void setRewardedAdListener(Listener listener);

    void showAd();
}
