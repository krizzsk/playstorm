package com.smaato.sdk.video.vast.model;

public class Creative {
    public static final String AD_ID = "adId";
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String COMPANION_ADS = "CompanionAds";
    public static final String CREATIVE_EXTENSIONS = "CreativeExtensions";

    /* renamed from: ID */
    public static final String f27168ID = "id";
    public static final String LINEAR = "Linear";
    public static final String NAME = "Creative";
    public static final String SEQUENCE = "sequence";
    public static final String UNIVERSAL_AD_ID = "UniversalAdId";
    public final String adId;
    public final String apiFramework;
    public final CompanionAds companionAds;

    /* renamed from: id */
    public final String f27169id;
    public final Linear linear;
    public final Integer sequence;
    public final UniversalAdId universalAdId;

    Creative(UniversalAdId universalAdId2, String str, String str2, Integer num, String str3, Linear linear2, CompanionAds companionAds2) {
        this.f27169id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
        this.universalAdId = universalAdId2;
        this.linear = linear2;
        this.companionAds = companionAds2;
    }

    public boolean hasCompanions() {
        CompanionAds companionAds2 = this.companionAds;
        return companionAds2 != null && !companionAds2.companions.isEmpty();
    }

    public static class Builder {
        private String adId;
        private String apiFramework;
        private CompanionAds companionAds;

        /* renamed from: id */
        private String f27170id;
        private Linear linear;
        private Integer sequence;
        private UniversalAdId universalAdId;

        public Builder setId(String str) {
            this.f27170id = str;
            return this;
        }

        public Builder setAdId(String str) {
            this.adId = str;
            return this;
        }

        public Builder setSequence(Integer num) {
            this.sequence = num;
            return this;
        }

        public Builder setApiFramework(String str) {
            this.apiFramework = str;
            return this;
        }

        public Builder setLinear(Linear linear2) {
            this.linear = linear2;
            return this;
        }

        public Builder setCompanionAds(CompanionAds companionAds2) {
            this.companionAds = companionAds2;
            return this;
        }

        public Builder setUniversalAdId(UniversalAdId universalAdId2) {
            this.universalAdId = universalAdId2;
            return this;
        }

        public Creative build() {
            if (this.universalAdId == null) {
                this.universalAdId = UniversalAdId.DEFAULT;
            }
            return new Creative(this.universalAdId, this.f27170id, this.adId, this.sequence, this.apiFramework, this.linear, this.companionAds);
        }
    }
}
