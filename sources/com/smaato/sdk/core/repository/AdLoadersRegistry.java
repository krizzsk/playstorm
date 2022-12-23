package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.p378ad.AdLoader;
import java.util.Set;

public interface AdLoadersRegistry {
    Set<AdLoader> getAdLoaders(String str);

    void register(String str, AdLoader adLoader);

    int remainingCapacity(String str);

    boolean unregister(String str, AdLoader adLoader);
}
