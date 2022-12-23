package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public class VastTree {

    /* renamed from: AD */
    public static final String f27181AD = "Ad";
    public static final String ERROR = "Error";
    public static final String VAST = "VAST";
    public static final String VERSION = "version";
    public final List<C11286Ad> ads;
    public final List<String> errors;
    public final String version;

    VastTree(List<C11286Ad> list, List<String> list2, String str) {
        this.ads = (List) Objects.requireNonNull(list);
        this.errors = (List) Objects.requireNonNull(list2);
        this.version = str;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        private List<C11286Ad> ads;
        private List<String> errors;
        private String version;

        public Builder() {
        }

        public Builder(VastTree vastTree) {
            this.version = vastTree.version;
            this.errors = vastTree.errors;
            this.ads = vastTree.ads;
        }

        public Builder setAds(List<C11286Ad> list) {
            this.ads = list;
            return this;
        }

        public Builder setErrors(List<String> list) {
            this.errors = list;
            return this;
        }

        public Builder setVersion(String str) {
            this.version = str;
            return this;
        }

        public VastTree build() {
            return new VastTree(VastModels.toImmutableList(this.ads), VastModels.toImmutableList(this.errors), this.version);
        }
    }
}
