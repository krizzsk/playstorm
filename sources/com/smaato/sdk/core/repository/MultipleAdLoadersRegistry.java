package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.config.ConfigurationRepository;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class MultipleAdLoadersRegistry implements AdLoadersRegistry {
    private final Map<String, Set<AdLoader>> adLoaders = new HashMap();
    private final ConfigurationRepository configurationRepository;
    private final Logger logger;

    public MultipleAdLoadersRegistry(ConfigurationRepository configurationRepository2, Logger logger2) {
        this.configurationRepository = configurationRepository2;
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    public void register(String str, AdLoader adLoader) {
        synchronized (this.adLoaders) {
            Set set = this.adLoaders.get(str);
            if (set == null) {
                set = new HashSet();
            } else {
                int i = this.configurationRepository.get().cachingCapacity;
                if (set.size() >= i) {
                    this.logger.debug(LogDomain.CORE, String.format("Unable to put additional Ad to cache. The capacity of %s entries is exceeded for the key: %s", new Object[]{Integer.valueOf(i), str}), new Object[0]);
                    return;
                }
            }
            set.add(adLoader);
            this.adLoaders.put(str, set);
        }
    }

    public int remainingCapacity(String str) {
        int i = this.configurationRepository.get().cachingCapacity;
        synchronized (this.adLoaders) {
            Set set = this.adLoaders.get(str);
            if (set != null) {
                i -= set.size();
            }
        }
        return i;
    }

    public boolean unregister(String str, AdLoader adLoader) {
        boolean z;
        synchronized (this.adLoaders) {
            Set set = this.adLoaders.get(str);
            z = set != null && set.remove(adLoader);
        }
        return z;
    }

    public Set<AdLoader> getAdLoaders(String str) {
        Set set;
        synchronized (this.adLoaders) {
            set = this.adLoaders.get(str);
        }
        return Sets.toImmutableSet(set);
    }
}
