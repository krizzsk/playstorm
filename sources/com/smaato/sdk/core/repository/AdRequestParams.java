package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.repository.AutoValue_AdRequestParams;

public abstract class AdRequestParams {

    public static abstract class Builder {
        public abstract AdRequestParams build();

        public abstract Builder setDisplayAdCloseInterval(Integer num);

        public abstract Builder setUBUniqueId(String str);

        public abstract Builder setVideoSkipInterval(Integer num);
    }

    public abstract Integer getDisplayAdCloseInterval();

    public abstract String getUBUniqueId();

    public abstract Integer getVideoSkipInterval();

    AdRequestParams() {
    }

    public static Builder builder() {
        return new AutoValue_AdRequestParams.Builder();
    }

    public Builder newBuilder() {
        return builder().setUBUniqueId(getUBUniqueId()).setVideoSkipInterval(getVideoSkipInterval()).setDisplayAdCloseInterval(getDisplayAdCloseInterval());
    }
}
