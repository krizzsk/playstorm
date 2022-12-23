package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.ArrayList;
import java.util.List;

public final class VastCompanionScenario implements Sized {
    public final AdParameters adParameters;
    public final String adSlotID;
    public final String altText;
    public final String apiFramework;
    public final Float assetHeight;
    public final Float assetWidth;
    public final String companionClickThrough;
    public final List<VastBeacon> companionClickTrackings;
    public final Float expandedHeight;
    public final Float expandedWidth;
    public final Float height;

    /* renamed from: id */
    public final String f27177id;
    public final Float pxRatio;
    public final VastScenarioResourceData resourceData;
    public final List<Tracking> trackingEvents;
    public final VastScenarioCreativeData vastScenarioCreativeData;
    public final Float width;

    private VastCompanionScenario(VastScenarioResourceData vastScenarioResourceData, VastScenarioCreativeData vastScenarioCreativeData2, List<VastBeacon> list, List<Tracking> list2, String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, String str3, String str4, String str5, AdParameters adParameters2) {
        this.resourceData = vastScenarioResourceData;
        this.vastScenarioCreativeData = vastScenarioCreativeData2;
        List<VastBeacon> list3 = list;
        this.companionClickTrackings = new ArrayList(list);
        this.companionClickThrough = str;
        this.trackingEvents = list2;
        this.f27177id = str2;
        this.width = f;
        this.height = f2;
        this.assetWidth = f3;
        this.assetHeight = f4;
        this.expandedWidth = f5;
        this.expandedHeight = f6;
        this.pxRatio = f7;
        this.apiFramework = str3;
        this.adSlotID = str4;
        this.altText = str5;
        this.adParameters = adParameters2;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Float getHeight() {
        return this.height;
    }

    public Float getWidth() {
        return this.width;
    }

    public static class Builder {
        private AdParameters adParameters;
        private String adSlotID;
        private String altText;
        private String apiFramework;
        private Float assetHeight;
        private Float assetWidth;
        private String companionClickThrough;
        private List<VastBeacon> companionClickTrackings;
        private Float expandedHeight;
        private Float expandedWidth;
        private Float height;

        /* renamed from: id */
        private String f27178id;
        private Float pxRatio;
        private VastScenarioResourceData resourceData;
        private List<Tracking> trackingEvents;
        private VastScenarioCreativeData vastScenarioCreativeData;
        private Float width;

        public Builder() {
        }

        public Builder(VastCompanionScenario vastCompanionScenario) {
            this.resourceData = vastCompanionScenario.resourceData;
            this.companionClickTrackings = vastCompanionScenario.companionClickTrackings;
            this.companionClickThrough = vastCompanionScenario.companionClickThrough;
            this.trackingEvents = vastCompanionScenario.trackingEvents;
            this.f27178id = vastCompanionScenario.f27177id;
            this.width = vastCompanionScenario.width;
            this.height = vastCompanionScenario.height;
            this.assetWidth = vastCompanionScenario.assetWidth;
            this.assetHeight = vastCompanionScenario.assetHeight;
            this.expandedWidth = vastCompanionScenario.expandedWidth;
            this.expandedHeight = vastCompanionScenario.expandedHeight;
            this.pxRatio = vastCompanionScenario.pxRatio;
            this.apiFramework = vastCompanionScenario.apiFramework;
            this.adSlotID = vastCompanionScenario.adSlotID;
            this.altText = vastCompanionScenario.altText;
            this.adParameters = vastCompanionScenario.adParameters;
            this.vastScenarioCreativeData = vastCompanionScenario.vastScenarioCreativeData;
        }

        public Builder setVastScenarioResourceData(VastScenarioResourceData vastScenarioResourceData) {
            this.resourceData = vastScenarioResourceData;
            return this;
        }

        public Builder setWidth(Float f) {
            this.width = f;
            return this;
        }

        public Builder setHeight(Float f) {
            this.height = f;
            return this;
        }

        public Builder setTrackingEvents(List<Tracking> list) {
            this.trackingEvents = list;
            return this;
        }

        public Builder setCompanionClickTrackings(List<VastBeacon> list) {
            this.companionClickTrackings = list;
            return this;
        }

        public Builder setId(String str) {
            this.f27178id = str;
            return this;
        }

        public Builder setCompanionClickThrough(String str) {
            this.companionClickThrough = str;
            return this;
        }

        public Builder setAssetWidth(Float f) {
            this.assetWidth = f;
            return this;
        }

        public Builder setAssetHeight(Float f) {
            this.assetHeight = f;
            return this;
        }

        public Builder setExpandedWidth(Float f) {
            this.expandedWidth = f;
            return this;
        }

        public Builder setExpandedHeight(Float f) {
            this.expandedHeight = f;
            return this;
        }

        public Builder setPxRatio(Float f) {
            this.pxRatio = f;
            return this;
        }

        public Builder setAdSlotID(String str) {
            this.adSlotID = str;
            return this;
        }

        public Builder setAltText(String str) {
            this.altText = str;
            return this;
        }

        public Builder setApiFramework(String str) {
            this.apiFramework = str;
            return this;
        }

        public Builder setAdParameters(AdParameters adParameters2) {
            this.adParameters = adParameters2;
            return this;
        }

        public Builder setVastScenarioCreativeData(VastScenarioCreativeData vastScenarioCreativeData2) {
            this.vastScenarioCreativeData = vastScenarioCreativeData2;
            return this;
        }

        public VastCompanionScenario build() {
            Objects.requireNonNull(this.resourceData, "Cannot build VastCompanionScenario: resourceData is missing");
            Objects.requireNonNull(this.vastScenarioCreativeData, "Cannot build VastMediaFileScenario: vastScenarioCreativeData is missing");
            return new VastCompanionScenario(this.resourceData, this.vastScenarioCreativeData, VastModels.toImmutableList(this.companionClickTrackings), VastModels.toImmutableList(this.trackingEvents), this.companionClickThrough, this.f27178id, this.width, this.height, this.assetWidth, this.assetHeight, this.expandedWidth, this.expandedHeight, this.pxRatio, this.apiFramework, this.adSlotID, this.altText, this.adParameters);
        }
    }
}
