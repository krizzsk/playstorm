package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.util.Objects;

public final class MraidEnvironmentProperties {
    public static final String SDK = "SmaatoSDK Android";
    public static final String VERSION = "3.0";
    public final String appId;
    public final Integer coppa;
    public final String googleAdId;
    public final Boolean googleDnt;
    public final String sdkVersion;

    private MraidEnvironmentProperties(String str, String str2, String str3, Boolean bool, Integer num) {
        this.sdkVersion = str;
        this.appId = str2;
        this.googleAdId = str3;
        this.googleDnt = bool;
        this.coppa = num;
    }

    public static final class Builder {
        private final String appId;
        private final Integer coppa;
        private final String googleAdId;
        private final Boolean googleDnt;
        private final String sdkVersion = SmaatoSdk.getVersion();

        public Builder(String str, ApiParams apiParams) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(apiParams);
            this.appId = str;
            this.googleAdId = apiParams.getGoogleAdId();
            this.googleDnt = apiParams.getGoogleDnt();
            this.coppa = Integer.valueOf(apiParams.getCoppa());
        }

        public Builder(String str) {
            Objects.requireNonNull(str);
            this.appId = str;
            this.googleAdId = null;
            this.googleDnt = null;
            this.coppa = null;
        }

        public MraidEnvironmentProperties build() {
            Objects.requireNonNull(this.sdkVersion);
            Objects.requireNonNull(this.appId);
            return new MraidEnvironmentProperties(this.sdkVersion, this.appId, this.googleAdId, this.googleDnt, this.coppa);
        }
    }
}
