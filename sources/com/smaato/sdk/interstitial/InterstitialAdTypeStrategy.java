package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.repository.CoreAdTypeStrategy;
import java.util.Arrays;

final class InterstitialAdTypeStrategy extends CoreAdTypeStrategy {
    InterstitialAdTypeStrategy(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public Iterable getParams() {
        return Arrays.asList(new String[]{this.publisherId, this.adSpaceId});
    }

    public Class<? extends AdPresenter> getAdPresenterClass() {
        return InterstitialAdPresenter.class;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InterstitialAdTypeStrategy.class != obj.getClass()) {
            return false;
        }
        InterstitialAdTypeStrategy interstitialAdTypeStrategy = (InterstitialAdTypeStrategy) obj;
        if (!this.publisherId.equals(interstitialAdTypeStrategy.publisherId)) {
            return false;
        }
        return this.adSpaceId.equals(interstitialAdTypeStrategy.adSpaceId);
    }

    public int hashCode() {
        return (this.publisherId.hashCode() * 31) + this.adSpaceId.hashCode();
    }
}
