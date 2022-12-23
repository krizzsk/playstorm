package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.Collections;
import java.util.Set;

public final class VastResult<Result> {
    public final Set<Integer> errors;
    public final Result value;

    private VastResult(Set<Integer> set, Result result) {
        this.errors = (Set) Objects.requireNonNull(set);
        this.value = result;
    }

    public static <Result> VastResult<Result> error(int i) {
        return new VastResult<>(Collections.singleton(Integer.valueOf(i)), (Object) null);
    }

    public static <Result> VastResult<Result> error(Set<Integer> set) {
        return new VastResult<>(set, (Object) null);
    }

    public static class Builder<Result> {
        private Set<Integer> errors;
        private Result value;

        public Builder<Result> setResult(Result result) {
            this.value = result;
            return this;
        }

        public Builder<Result> setErrors(Set<Integer> set) {
            this.errors = set;
            return this;
        }

        public VastResult<Result> build() {
            if (this.value != null || this.errors != null) {
                return new VastResult<>(Sets.toImmutableSet(this.errors), this.value);
            }
            throw new IllegalStateException("VastResult should contain value or list of errors at least");
        }
    }
}
