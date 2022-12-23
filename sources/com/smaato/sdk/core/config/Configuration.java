package com.smaato.sdk.core.config;

import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.util.Objects;

public final class Configuration {
    public final int cachingCapacity;
    public final AdStateMachine.State impressionState;

    public Configuration(int i, AdStateMachine.State state) {
        this.cachingCapacity = i;
        this.impressionState = (AdStateMachine.State) Objects.requireNonNull(state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Configuration.class != obj.getClass()) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        if (this.cachingCapacity != configuration.cachingCapacity) {
            return false;
        }
        if (this.impressionState == configuration.impressionState) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.cachingCapacity * 31) + this.impressionState.hashCode();
    }
}
