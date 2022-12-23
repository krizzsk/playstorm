package com.smaato.sdk.banner.p377ad;

import com.smaato.sdk.core.p378ad.AdDimension;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.banner.ad.BannerAdSize */
public enum BannerAdSize {
    XX_LARGE_320x50(AdDimension.XX_LARGE),
    MEDIUM_RECTANGLE_300x250(AdDimension.MEDIUM_RECTANGLE),
    LEADERBOARD_728x90(AdDimension.LEADERBOARD),
    SKYSCRAPER_120x600(AdDimension.SKYSCRAPER);
    
    public final AdDimension adDimension;

    private BannerAdSize(AdDimension adDimension2) {
        this.adDimension = (AdDimension) Objects.requireNonNull(adDimension2);
    }
}
