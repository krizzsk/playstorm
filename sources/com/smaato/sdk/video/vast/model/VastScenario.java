package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public final class VastScenario {
    public final String adServingId;
    public final AdSystem adSystem;
    public final String adTitle;
    public final List<Verification> adVerifications;
    public final Advertiser advertiser;
    public final List<String> blockedAdCategories;
    public final List<Category> categories;
    public final String description;
    public final List<String> errors;
    public final List<VastBeacon> impressions;
    public final VastCompanionScenario vastCompanionScenario;
    public final VastMediaFileScenario vastMediaFileScenario;
    public final ViewableImpression viewableImpression;

    private VastScenario(List<VastBeacon> list, List<Verification> list2, List<Category> list3, List<String> list4, List<String> list5, VastMediaFileScenario vastMediaFileScenario2, VastCompanionScenario vastCompanionScenario2, AdSystem adSystem2, String str, String str2, Advertiser advertiser2, ViewableImpression viewableImpression2, String str3) {
        this.impressions = (List) Objects.requireNonNull(list);
        this.adVerifications = (List) Objects.requireNonNull(list2);
        this.categories = (List) Objects.requireNonNull(list3);
        this.errors = (List) Objects.requireNonNull(list4);
        this.vastMediaFileScenario = (VastMediaFileScenario) Objects.requireNonNull(vastMediaFileScenario2);
        this.blockedAdCategories = (List) Objects.requireNonNull(list5);
        this.vastCompanionScenario = vastCompanionScenario2;
        this.adSystem = adSystem2;
        this.adTitle = str;
        this.description = str2;
        this.advertiser = advertiser2;
        this.viewableImpression = viewableImpression2;
        this.adServingId = str3;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private String adServingId;
        private AdSystem adSystem;
        private String adTitle;
        private List<Verification> adVerifications;
        private Advertiser advertiser;
        private List<String> blockedAdCategories;
        private List<Category> categories;
        private String description;
        private List<String> errors;
        private List<VastBeacon> impressions;
        private VastCompanionScenario vastCompanionScenario;
        private VastMediaFileScenario vastMediaFileScenario;
        private ViewableImpression viewableImpression;

        public Builder() {
        }

        public Builder(VastScenario vastScenario) {
            this.impressions = vastScenario.impressions;
            this.adVerifications = vastScenario.adVerifications;
            this.categories = vastScenario.categories;
            this.errors = vastScenario.errors;
            this.adSystem = vastScenario.adSystem;
            this.adTitle = vastScenario.adTitle;
            this.description = vastScenario.description;
            this.advertiser = vastScenario.advertiser;
            this.viewableImpression = vastScenario.viewableImpression;
            this.vastMediaFileScenario = vastScenario.vastMediaFileScenario;
            this.vastCompanionScenario = vastScenario.vastCompanionScenario;
            this.blockedAdCategories = vastScenario.blockedAdCategories;
            this.adServingId = vastScenario.adServingId;
        }

        public Builder setAdSystem(AdSystem adSystem2) {
            this.adSystem = adSystem2;
            return this;
        }

        public Builder setAdTitle(String str) {
            this.adTitle = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setAdvertiser(Advertiser advertiser2) {
            this.advertiser = advertiser2;
            return this;
        }

        public Builder setViewableImpression(ViewableImpression viewableImpression2) {
            this.viewableImpression = viewableImpression2;
            return this;
        }

        public Builder setAdVerifications(List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        public Builder setVastMediaFileScenario(VastMediaFileScenario vastMediaFileScenario2) {
            this.vastMediaFileScenario = vastMediaFileScenario2;
            return this;
        }

        public Builder setVastCompanionScenario(VastCompanionScenario vastCompanionScenario2) {
            this.vastCompanionScenario = vastCompanionScenario2;
            return this;
        }

        public Builder setImpressions(List<VastBeacon> list) {
            this.impressions = list;
            return this;
        }

        public Builder setCategories(List<Category> list) {
            this.categories = list;
            return this;
        }

        public Builder setErrors(List<String> list) {
            this.errors = list;
            return this;
        }

        public Builder setBlockedAdCategories(List<String> list) {
            this.blockedAdCategories = list;
            return this;
        }

        public Builder setAdServingId(String str) {
            this.adServingId = str;
            return this;
        }

        public VastScenario build() {
            return new VastScenario(VastModels.toImmutableList(this.impressions), VastModels.toImmutableList(this.adVerifications), VastModels.toImmutableList(this.categories), VastModels.toImmutableList(this.errors), VastModels.toImmutableList(this.blockedAdCategories), (VastMediaFileScenario) Objects.requireNonNull(this.vastMediaFileScenario), this.vastCompanionScenario, this.adSystem, this.adTitle, this.description, this.advertiser, this.viewableImpression, this.adServingId);
        }
    }
}
