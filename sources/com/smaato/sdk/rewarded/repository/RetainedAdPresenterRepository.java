package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Objects;
import java.util.Map;

public class RetainedAdPresenterRepository {
    private final Map<String, AdPresenterCacheEntry<RewardedAdPresenter>> adPresentersCache;

    RetainedAdPresenterRepository(Map<String, AdPresenterCacheEntry<RewardedAdPresenter>> map) {
        this.adPresentersCache = (Map) Objects.requireNonNull(map);
    }

    public synchronized RewardedAdPresenter get(String str) {
        RewardedAdPresenter rewardedAdPresenter;
        AdPresenterCacheEntry adPresenterCacheEntry = this.adPresentersCache.get(str);
        if (adPresenterCacheEntry == null) {
            rewardedAdPresenter = null;
        } else {
            rewardedAdPresenter = (RewardedAdPresenter) adPresenterCacheEntry.getAdPresenter();
        }
        return rewardedAdPresenter;
    }

    public synchronized String put(RewardedAdPresenter rewardedAdPresenter, final String str) {
        C111781 r0 = new RetainedRepositoryAdPresenterListener(rewardedAdPresenter) {
            public void onReadyToBeRemovedFromCache(RewardedAdPresenter rewardedAdPresenter) {
                rewardedAdPresenter.getAdInteractor().removeStateListener(this);
                RetainedAdPresenterRepository.this.remove(str);
            }
        };
        rewardedAdPresenter.getAdInteractor().addStateListener(r0);
        this.adPresentersCache.put(str, new AdPresenterCacheEntry(rewardedAdPresenter, r0, rewardedAdPresenter.getListener()));
        return str;
    }

    /* access modifiers changed from: package-private */
    public synchronized void remove(String str) {
        this.adPresentersCache.remove(str);
    }
}
