package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Set;

public final class VastScenarioResult {
    public final Set<String> errorUrls;
    public final Set<Integer> errors;
    public final VastScenario vastScenario;

    private VastScenarioResult(Set<String> set, Set<Integer> set2, VastScenario vastScenario2) {
        this.errorUrls = (Set) Objects.requireNonNull(set);
        this.errors = (Set) Objects.requireNonNull(set2);
        this.vastScenario = vastScenario2;
    }

    public static class Builder {
        private Set<String> errorUrls;
        private Set<Integer> errors;
        private VastScenario vastScenario;

        public Builder setVastScenario(VastScenario vastScenario2) {
            this.vastScenario = vastScenario2;
            return this;
        }

        public Builder setErrors(Set<Integer> set) {
            this.errors = set;
            return this;
        }

        public Builder setErrorUrls(Set<String> set) {
            this.errorUrls = set;
            return this;
        }

        public VastScenarioResult build() {
            return new VastScenarioResult(Sets.toImmutableSet(this.errorUrls), Sets.toImmutableSet(this.errors), this.vastScenario);
        }
    }
}
