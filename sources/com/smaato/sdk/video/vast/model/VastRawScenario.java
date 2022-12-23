package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public final class VastRawScenario {
    public final AdSystem adSystem;
    public final String adTitle;
    public final List<Verification> adVerifications;
    public final String advertiser;
    public final List<String> blockedAdCategories;
    public final List<Category> categories;
    public final String description;
    public final List<String> errors;
    public final List<VastBeacon> impressions;
    public final List<VastCompanionScenario> vastCompanionScenarios;
    public final List<VastRawMediaFileScenario> vastRawMediaFileScenarios;
    public final ViewableImpression viewableImpression;

    private VastRawScenario(List<VastBeacon> list, List<Verification> list2, List<Category> list3, List<String> list4, List<VastRawMediaFileScenario> list5, List<VastCompanionScenario> list6, List<String> list7, AdSystem adSystem2, String str, String str2, String str3, ViewableImpression viewableImpression2) {
        this.impressions = (List) Objects.requireNonNull(list);
        this.adVerifications = (List) Objects.requireNonNull(list2);
        this.categories = (List) Objects.requireNonNull(list3);
        this.errors = (List) Objects.requireNonNull(list4);
        this.vastRawMediaFileScenarios = (List) Objects.requireNonNull(list5);
        this.vastCompanionScenarios = (List) Objects.requireNonNull(list6);
        this.blockedAdCategories = (List) Objects.requireNonNull(list7);
        this.adSystem = adSystem2;
        this.adTitle = str;
        this.description = str2;
        this.advertiser = str3;
        this.viewableImpression = viewableImpression2;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private AdSystem adSystem;
        private String adTitle;
        private List<Verification> adVerifications;
        private String advertiser;
        private List<String> blockedAdCategories;
        private List<Category> categories;
        private String description;
        private List<String> errors;
        private List<VastBeacon> impressions;
        private List<VastCompanionScenario> vastCompanionScenarios;
        private List<VastRawMediaFileScenario> vastRawMediaFileScenarios;
        private ViewableImpression viewableImpression;

        public Builder() {
        }

        public Builder(VastRawScenario vastRawScenario) {
            this.impressions = vastRawScenario.impressions;
            this.adVerifications = vastRawScenario.adVerifications;
            this.categories = vastRawScenario.categories;
            this.errors = vastRawScenario.errors;
            this.adSystem = vastRawScenario.adSystem;
            this.adTitle = vastRawScenario.adTitle;
            this.description = vastRawScenario.description;
            this.advertiser = vastRawScenario.advertiser;
            this.viewableImpression = vastRawScenario.viewableImpression;
            this.vastRawMediaFileScenarios = vastRawScenario.vastRawMediaFileScenarios;
            this.vastCompanionScenarios = vastRawScenario.vastCompanionScenarios;
            this.blockedAdCategories = vastRawScenario.blockedAdCategories;
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

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
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

        public Builder setVastMediaFileScenarios(List<VastRawMediaFileScenario> list) {
            this.vastRawMediaFileScenarios = list;
            return this;
        }

        public Builder setVastCompanionScenarios(List<VastCompanionScenario> list) {
            this.vastCompanionScenarios = list;
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

        public VastRawScenario build() {
            return new VastRawScenario(VastModels.toImmutableList(this.impressions), VastModels.toImmutableList(this.adVerifications), VastModels.toImmutableList(this.categories), VastModels.toImmutableList(this.errors), VastModels.toImmutableList(this.vastRawMediaFileScenarios), VastModels.toImmutableList(this.vastCompanionScenarios), VastModels.toImmutableList(this.blockedAdCategories), this.adSystem, this.adTitle, this.description, this.advertiser, this.viewableImpression);
        }
    }
}
