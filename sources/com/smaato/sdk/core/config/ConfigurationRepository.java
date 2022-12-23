package com.smaato.sdk.core.config;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.Map;

public final class ConfigurationRepository {
    private final Map<String, Configuration> configurationCache;
    private final Configuration defaultConfiguration;

    public ConfigurationRepository(Map<String, Configuration> map, Configuration configuration) {
        this.configurationCache = Collections.synchronizedMap((Map) Objects.requireNonNull(map));
        this.defaultConfiguration = (Configuration) Objects.requireNonNull(configuration);
    }

    public Configuration get() {
        Configuration configuration = this.configurationCache.get(SmaatoSdk.getPublisherId());
        return configuration == null ? this.defaultConfiguration : configuration;
    }
}
