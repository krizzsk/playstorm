package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.ArrayList;
import java.util.List;

public class InLine {
    public static final String ADVERTISER = "Advertiser";
    public static final String AD_SERVING_ID = "AdServingId";
    public static final String AD_SYSTEM = "AdSystem";
    public static final String AD_TITLE = "AdTitle";
    public static final String AD_VERIFICATIONS = "AdVerifications";
    public static final String CATEGORY = "Category";
    public static final String CREATIVES = "Creatives";
    public static final String DESCRIPTION = "Description";
    public static final String ERROR = "Error";
    public static final String EXTENSIONS = "Extensions";
    public static final String IMPRESSION = "Impression";
    public static final String NAME = "InLine";
    public static final String VIEWABLE_IMPRESSION = "ViewableImpression";
    public final String adServingId;
    public final AdSystem adSystem;
    public final String adTitle;
    public final List<Verification> adVerifications;
    public final Advertiser advertiser;
    public final List<Category> categories;
    public final List<Creative> creatives;
    public final String description;
    public final List<String> errors;
    public final List<Extension> extensions;
    public final List<VastBeacon> impressions;
    public final ViewableImpression viewableImpression;

    public InLine(List<VastBeacon> list, List<Creative> list2, List<Verification> list3, List<Category> list4, List<String> list5, AdSystem adSystem2, String str, String str2, String str3, Advertiser advertiser2, ViewableImpression viewableImpression2, List<Extension> list6) {
        this.adSystem = adSystem2;
        this.adTitle = str;
        this.adServingId = str2;
        this.impressions = list;
        this.categories = list4;
        this.description = str3;
        this.advertiser = advertiser2;
        this.errors = list5;
        this.viewableImpression = viewableImpression2;
        this.creatives = list2;
        this.adVerifications = list3;
        this.extensions = list6;
    }

    public static class Builder {
        private String adServingId;
        private AdSystem adSystem;
        private String adTitle;
        private List<Verification> adVerifications;
        private Advertiser advertiser;
        private List<Category> categories;
        private List<Creative> creatives;
        private String description;
        private List<String> errors;
        private List<Extension> extensions;
        private List<VastBeacon> impressions;
        private ViewableImpression viewableImpression;

        public Builder setAdSystem(AdSystem adSystem2) {
            this.adSystem = adSystem2;
            return this;
        }

        public Builder setAdTitle(String str) {
            this.adTitle = str;
            return this;
        }

        public Builder setAdServingId(String str) {
            this.adServingId = str;
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

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setAdvertiser(Advertiser advertiser2) {
            this.advertiser = advertiser2;
            return this;
        }

        public Builder setErrors(List<String> list) {
            this.errors = list;
            return this;
        }

        public Builder setViewableImpression(ViewableImpression viewableImpression2) {
            this.viewableImpression = viewableImpression2;
            return this;
        }

        public Builder setCreatives(List<Creative> list) {
            this.creatives = list;
            return this;
        }

        public Builder setAdVerifications(List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        public Builder setExtensions(List<Extension> list) {
            this.extensions = list;
            return this;
        }

        public InLine build() {
            ArrayList arrayList = new ArrayList();
            List<Verification> list = this.adVerifications;
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(this.adVerifications);
            }
            List<Extension> list2 = this.extensions;
            if (list2 != null && !list2.isEmpty()) {
                for (Extension extension : this.extensions) {
                    Objects.onNotNull(extension.adVerifications, new Consumer(arrayList) {
                        public final /* synthetic */ List f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void accept(Object obj) {
                            this.f$0.addAll((List) obj);
                        }
                    });
                }
            }
            this.impressions = VastModels.toImmutableList(this.impressions);
            this.creatives = VastModels.toImmutableList(this.creatives);
            this.adVerifications = VastModels.toImmutableList(arrayList);
            this.categories = VastModels.toImmutableList(this.categories);
            this.errors = VastModels.toImmutableList(this.errors);
            List<Extension> immutableList = VastModels.toImmutableList(this.extensions);
            this.extensions = immutableList;
            return new InLine(this.impressions, this.creatives, this.adVerifications, this.categories, this.errors, this.adSystem, this.adTitle, this.adServingId, this.description, this.advertiser, this.viewableImpression, immutableList);
        }
    }
}
