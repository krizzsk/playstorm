package com.smaato.sdk.banner.p377ad;

import com.smaato.sdk.core.p378ad.AutoReloadConfig;

/* renamed from: com.smaato.sdk.banner.ad.BannerAutoReloadConfig */
public class BannerAutoReloadConfig implements AutoReloadConfig {
    private static final int DEFAULT_INTERVAL = AutoReloadInterval.DEFAULT.getSeconds();
    private static final int MAX_INTERVAL = 240;
    private static final int MIN_INTERVAL = 10;

    public int maxInterval() {
        return 240;
    }

    public int minInterval() {
        return 10;
    }

    public int defaultInterval() {
        return DEFAULT_INTERVAL;
    }
}
