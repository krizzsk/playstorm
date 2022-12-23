package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Objects;

class AdPresenterCacheEntry<T extends AdPresenter> {
    private final T adPresenter;
    private final Object listener;
    private final RewardedAdPresenter.Listener rewardedAdPresenterListener;

    AdPresenterCacheEntry(T t, Object obj, RewardedAdPresenter.Listener listener2) {
        this.adPresenter = (AdPresenter) Objects.requireNonNull(t);
        this.listener = Objects.requireNonNull(obj);
        this.rewardedAdPresenterListener = listener2;
    }

    /* access modifiers changed from: package-private */
    public T getAdPresenter() {
        return this.adPresenter;
    }
}
