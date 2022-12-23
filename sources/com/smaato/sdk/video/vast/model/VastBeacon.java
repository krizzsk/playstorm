package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

public class VastBeacon {

    /* renamed from: ID */
    public static final String f27174ID = "id";

    /* renamed from: id */
    public final String f27175id;
    public final String uri;

    VastBeacon(String str, String str2) {
        this.uri = str;
        this.f27175id = str2;
    }

    public static class Builder {

        /* renamed from: id */
        private String f27176id;
        private String uri;

        public Builder setId(String str) {
            this.f27176id = str;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = str;
            return this;
        }

        public VastBeacon build() throws VastElementMissingException {
            VastModels.requireNonNull(this.uri, "Cannot build VastBeacon: uri is missing");
            return new VastBeacon(this.uri, this.f27176id);
        }
    }
}
