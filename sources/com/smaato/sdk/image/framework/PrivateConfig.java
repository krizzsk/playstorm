package com.smaato.sdk.image.framework;

final class PrivateConfig {
    /* access modifiers changed from: private */
    public final double bannerVisibilityRatio;
    /* access modifiers changed from: private */
    public final long bannerVisibilityTimeMillis;

    private PrivateConfig(double d, long j) {
        this.bannerVisibilityRatio = d;
        this.bannerVisibilityTimeMillis = j;
    }

    public static class Builder {
        private double bannerVisibilityRatio;
        private long bannerVisibilityTimeMillis;

        public Builder() {
        }

        public Builder(PrivateConfig privateConfig) {
            this.bannerVisibilityRatio = privateConfig.bannerVisibilityRatio;
            this.bannerVisibilityTimeMillis = privateConfig.bannerVisibilityTimeMillis;
        }

        public Builder bannerVisibilityRatio(double d) {
            this.bannerVisibilityRatio = d;
            return this;
        }

        public Builder bannerVisibilityTimeMillis(long j) {
            this.bannerVisibilityTimeMillis = j;
            return this;
        }

        public PrivateConfig build() {
            return new PrivateConfig(this.bannerVisibilityRatio, this.bannerVisibilityTimeMillis);
        }
    }
}
