package com.p374my.target.common;

import com.p374my.target.C9596a;
import com.p374my.target.C9822l3;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.BaseAd */
public abstract class BaseAd {
    public final C9596a adConfig;
    private final AtomicBoolean isLoaded = new AtomicBoolean();
    public final C9822l3.C9823a metricFactory;

    public BaseAd(int i, String str) {
        this.adConfig = C9596a.newConfig(i, str);
        this.metricFactory = C9822l3.m28580a(i);
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public boolean isLoadCalled() {
        return !this.isLoaded.compareAndSet(false, true);
    }
}
