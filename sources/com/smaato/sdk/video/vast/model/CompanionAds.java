package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public class CompanionAds {
    public static final String COMPANION = "Companion";
    public static final String NAME = "CompanionAds";
    public static final String REQUIRED = "required";
    public final List<Companion> companions;
    public final Required required;

    CompanionAds(List<Companion> list, Required required2) {
        this.companions = list;
        this.required = required2;
    }

    public enum Required {
        ALL,
        ANY,
        NONE;

        public static Required parse(String str) {
            for (Required required : values()) {
                if (required.name().equalsIgnoreCase(str)) {
                    return required;
                }
            }
            return null;
        }
    }

    public static class Builder {
        private List<Companion> companions;
        private Required required;

        public Builder setCompanions(List<Companion> list) {
            this.companions = list;
            return this;
        }

        public Builder setRequired(Required required2) {
            this.required = required2;
            return this;
        }

        public CompanionAds build() throws VastElementMissingException {
            VastModels.requireNonEmpty(this.companions, "Cannot build CompanionAds: companions are missing");
            return new CompanionAds(VastModels.toImmutableList(this.companions), this.required);
        }
    }
}
