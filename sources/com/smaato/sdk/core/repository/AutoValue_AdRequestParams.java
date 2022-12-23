package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.repository.AdRequestParams;

final class AutoValue_AdRequestParams extends AdRequestParams {
    private final String UBUniqueId;
    private final Integer displayAdCloseInterval;
    private final Integer videoSkipInterval;

    private AutoValue_AdRequestParams(String str, Integer num, Integer num2) {
        this.UBUniqueId = str;
        this.videoSkipInterval = num;
        this.displayAdCloseInterval = num2;
    }

    public String getUBUniqueId() {
        return this.UBUniqueId;
    }

    public Integer getVideoSkipInterval() {
        return this.videoSkipInterval;
    }

    public Integer getDisplayAdCloseInterval() {
        return this.displayAdCloseInterval;
    }

    public String toString() {
        return "AdRequestParams{UBUniqueId=" + this.UBUniqueId + ", videoSkipInterval=" + this.videoSkipInterval + ", displayAdCloseInterval=" + this.displayAdCloseInterval + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdRequestParams)) {
            return false;
        }
        AdRequestParams adRequestParams = (AdRequestParams) obj;
        String str = this.UBUniqueId;
        if (str != null ? str.equals(adRequestParams.getUBUniqueId()) : adRequestParams.getUBUniqueId() == null) {
            Integer num = this.videoSkipInterval;
            if (num != null ? num.equals(adRequestParams.getVideoSkipInterval()) : adRequestParams.getVideoSkipInterval() == null) {
                Integer num2 = this.displayAdCloseInterval;
                if (num2 == null) {
                    if (adRequestParams.getDisplayAdCloseInterval() == null) {
                        return true;
                    }
                } else if (num2.equals(adRequestParams.getDisplayAdCloseInterval())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.UBUniqueId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.videoSkipInterval;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.displayAdCloseInterval;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 ^ i;
    }

    static final class Builder extends AdRequestParams.Builder {
        private String UBUniqueId;
        private Integer displayAdCloseInterval;
        private Integer videoSkipInterval;

        Builder() {
        }

        public AdRequestParams.Builder setUBUniqueId(String str) {
            this.UBUniqueId = str;
            return this;
        }

        public AdRequestParams.Builder setVideoSkipInterval(Integer num) {
            this.videoSkipInterval = num;
            return this;
        }

        public AdRequestParams.Builder setDisplayAdCloseInterval(Integer num) {
            this.displayAdCloseInterval = num;
            return this;
        }

        public AdRequestParams build() {
            return new AutoValue_AdRequestParams(this.UBUniqueId, this.videoSkipInterval, this.displayAdCloseInterval);
        }
    }
}
