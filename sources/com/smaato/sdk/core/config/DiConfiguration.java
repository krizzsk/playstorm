package com.smaato.sdk.core.config;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Function;
import java.util.HashMap;

public final class DiConfiguration {

    public interface Provider extends Function<Configuration, ConfigurationRepository> {
    }

    private DiConfiguration() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ.INSTANCE);
    }

    static /* synthetic */ ConfigurationRepository lambda$createRegistry$0(Configuration configuration) {
        return new ConfigurationRepository(new HashMap(), configuration);
    }
}
