package com.smaato.sdk.banner.widget;

import com.smaato.sdk.banner.p377ad.BannerAdSize;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.repository.CoreAdTypeStrategy;
import java.io.Serializable;
import java.util.Arrays;

final class BannerAdTypeStrategy extends CoreAdTypeStrategy {
    private final BannerAdSize adSize;

    BannerAdTypeStrategy(String str, String str2, BannerAdSize bannerAdSize) {
        super(str, str2);
        this.adSize = bannerAdSize;
    }

    /* access modifiers changed from: protected */
    public Iterable getParams() {
        BannerAdSize bannerAdSize = this.adSize;
        if (bannerAdSize == null) {
            return Arrays.asList(new String[]{this.publisherId, this.adSpaceId});
        }
        return Arrays.asList(new Serializable[]{this.publisherId, this.adSpaceId, Integer.valueOf(bannerAdSize.ordinal())});
    }

    public Class<? extends AdPresenter> getAdPresenterClass() {
        return BannerAdPresenter.class;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerAdTypeStrategy.class != obj.getClass()) {
            return false;
        }
        BannerAdTypeStrategy bannerAdTypeStrategy = (BannerAdTypeStrategy) obj;
        if (!this.publisherId.equals(bannerAdTypeStrategy.publisherId) || !this.adSpaceId.equals(bannerAdTypeStrategy.adSpaceId)) {
            return false;
        }
        if (this.adSize == bannerAdTypeStrategy.adSize) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.publisherId.hashCode() * 31) + this.adSpaceId.hashCode()) * 31;
        BannerAdSize bannerAdSize = this.adSize;
        return hashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0);
    }
}
