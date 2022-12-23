package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.ArrayList;

/* renamed from: com.smaato.sdk.core.ad.AdSettings */
public final class AdSettings {
    private final AdDimension adDimension;
    private final AdFormat adFormat;
    private final String adSpaceId;
    private final Integer displayAdCloseInterval;
    private final Integer height;
    private final String mediationAdapterVersion;
    private final String mediationNetworkName;
    private final String mediationNetworkSDKVersion;
    private final String publisherId;
    private final Integer videoSkipInterval;
    private final Integer width;

    private AdSettings(String str, String str2, AdFormat adFormat2, AdDimension adDimension2, Integer num, Integer num2, String str3, String str4, String str5, Integer num3, Integer num4) {
        this.publisherId = (String) Objects.requireNonNull(str);
        this.adSpaceId = (String) Objects.requireNonNull(str2);
        this.adFormat = (AdFormat) Objects.requireNonNull(adFormat2);
        this.adDimension = adDimension2;
        this.width = num;
        this.height = num2;
        this.mediationNetworkName = str3;
        this.mediationNetworkSDKVersion = str4;
        this.mediationAdapterVersion = str5;
        this.videoSkipInterval = num3;
        this.displayAdCloseInterval = num4;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public AdFormat getAdFormat() {
        return this.adFormat;
    }

    public AdDimension getAdDimension() {
        return this.adDimension;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getMediationNetworkName() {
        return this.mediationNetworkName;
    }

    public String getMediationNetworkSDKVersion() {
        return this.mediationNetworkSDKVersion;
    }

    public String getMediationAdapterVersion() {
        return this.mediationAdapterVersion;
    }

    public Integer getVideoSkipInterval() {
        return this.videoSkipInterval;
    }

    public Integer getDisplayAdCloseInterval() {
        return this.displayAdCloseInterval;
    }

    public String toString() {
        return "AdSettings{publisherId='" + this.publisherId + '\'' + ", adSpaceId='" + this.adSpaceId + '\'' + ", adFormat=" + this.adFormat + ", adDimension=" + this.adDimension + ", width=" + this.width + ", height=" + this.height + ", mediationNetworkName='" + this.mediationNetworkName + '\'' + ", mediationNetworkSDKVersion='" + this.mediationNetworkSDKVersion + '\'' + ", mediationAdapterVersion='" + this.mediationAdapterVersion + '\'' + ", videoSkipInterval='" + this.videoSkipInterval + '\'' + ", displayAdCloseInterval='" + this.displayAdCloseInterval + '\'' + '}';
    }

    /* renamed from: com.smaato.sdk.core.ad.AdSettings$Builder */
    public static final class Builder {
        private AdDimension adDimension;
        private AdFormat adFormat;
        private String adSpaceId;
        private Integer displayAdCloseInterval;
        private Integer height;
        private String mediationAdapterVersion;
        private String mediationNetworkName;
        private String mediationNetworkSDKVersion;
        private String publisherId;
        private Integer videoSkipInterval;
        private Integer width;

        public Builder setPublisherId(String str) {
            this.publisherId = str;
            return this;
        }

        public Builder setAdSpaceId(String str) {
            this.adSpaceId = str;
            return this;
        }

        public Builder setAdFormat(AdFormat adFormat2) {
            this.adFormat = adFormat2;
            return this;
        }

        public Builder setAdDimension(AdDimension adDimension2) {
            this.adDimension = adDimension2;
            return this;
        }

        public Builder setMediationNetworkName(String str) {
            this.mediationNetworkName = str;
            return this;
        }

        public Builder setMediationNetworkSDKVersion(String str) {
            this.mediationNetworkSDKVersion = str;
            return this;
        }

        public Builder setMediationAdapterVersion(String str) {
            this.mediationAdapterVersion = str;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        public Builder setHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public Builder setVideoSkipInterval(Integer num) {
            this.videoSkipInterval = num;
            return this;
        }

        public Builder setDisplayAdCloseInterval(Integer num) {
            this.displayAdCloseInterval = num;
            return this;
        }

        public AdSettings build() {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(this.publisherId)) {
                arrayList.add("publisherId");
            }
            if (TextUtils.isEmpty(this.adSpaceId)) {
                arrayList.add("adSpaceId");
            }
            if (this.adFormat == null) {
                arrayList.add("adFormat");
            }
            if (arrayList.isEmpty()) {
                return new AdSettings(this.publisherId, this.adSpaceId, this.adFormat, this.adDimension, this.width, this.height, this.mediationNetworkName, this.mediationNetworkSDKVersion, this.mediationAdapterVersion, this.videoSkipInterval, this.displayAdCloseInterval);
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
