package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiAdRequest;
import java.util.Map;
import java.util.Set;

final class AutoValue_ApiAdRequest extends ApiAdRequest {
    private final String adDimension;
    private final String adFormat;
    private final String adSpaceId;
    private final Integer displayAdCloseInterval;
    private final Map<String, Object> extraParameters;
    private final Integer height;
    private final boolean isSplash;
    private final Map<String, Set<String>> keyValuePairs;
    private final String mediationAdapterVersion;
    private final String mediationNetworkName;
    private final String mediationNetworkSDKVersion;
    private final String publisherId;
    private final Integer videoSkipInterval;
    private final Integer width;

    private AutoValue_ApiAdRequest(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Map<String, Object> map, Map<String, Set<String>> map2, Integer num3, boolean z, Integer num4) {
        this.publisherId = str;
        this.adSpaceId = str2;
        this.adFormat = str3;
        this.adDimension = str4;
        this.width = num;
        this.height = num2;
        this.mediationNetworkName = str5;
        this.mediationNetworkSDKVersion = str6;
        this.mediationAdapterVersion = str7;
        this.extraParameters = map;
        this.keyValuePairs = map2;
        this.displayAdCloseInterval = num3;
        this.isSplash = z;
        this.videoSkipInterval = num4;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    public String getAdFormat() {
        return this.adFormat;
    }

    public String getAdDimension() {
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

    public Map<String, Object> getExtraParameters() {
        return this.extraParameters;
    }

    public Map<String, Set<String>> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    public Integer getDisplayAdCloseInterval() {
        return this.displayAdCloseInterval;
    }

    public boolean getIsSplash() {
        return this.isSplash;
    }

    public Integer getVideoSkipInterval() {
        return this.videoSkipInterval;
    }

    public String toString() {
        return "ApiAdRequest{publisherId=" + this.publisherId + ", adSpaceId=" + this.adSpaceId + ", adFormat=" + this.adFormat + ", adDimension=" + this.adDimension + ", width=" + this.width + ", height=" + this.height + ", mediationNetworkName=" + this.mediationNetworkName + ", mediationNetworkSDKVersion=" + this.mediationNetworkSDKVersion + ", mediationAdapterVersion=" + this.mediationAdapterVersion + ", extraParameters=" + this.extraParameters + ", keyValuePairs=" + this.keyValuePairs + ", displayAdCloseInterval=" + this.displayAdCloseInterval + ", isSplash=" + this.isSplash + ", videoSkipInterval=" + this.videoSkipInterval + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        String str4;
        Map<String, Object> map;
        Map<String, Set<String>> map2;
        Integer num3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiAdRequest)) {
            return false;
        }
        ApiAdRequest apiAdRequest = (ApiAdRequest) obj;
        if (this.publisherId.equals(apiAdRequest.getPublisherId()) && this.adSpaceId.equals(apiAdRequest.getAdSpaceId()) && this.adFormat.equals(apiAdRequest.getAdFormat()) && ((str = this.adDimension) != null ? str.equals(apiAdRequest.getAdDimension()) : apiAdRequest.getAdDimension() == null) && ((num = this.width) != null ? num.equals(apiAdRequest.getWidth()) : apiAdRequest.getWidth() == null) && ((num2 = this.height) != null ? num2.equals(apiAdRequest.getHeight()) : apiAdRequest.getHeight() == null) && ((str2 = this.mediationNetworkName) != null ? str2.equals(apiAdRequest.getMediationNetworkName()) : apiAdRequest.getMediationNetworkName() == null) && ((str3 = this.mediationNetworkSDKVersion) != null ? str3.equals(apiAdRequest.getMediationNetworkSDKVersion()) : apiAdRequest.getMediationNetworkSDKVersion() == null) && ((str4 = this.mediationAdapterVersion) != null ? str4.equals(apiAdRequest.getMediationAdapterVersion()) : apiAdRequest.getMediationAdapterVersion() == null) && ((map = this.extraParameters) != null ? map.equals(apiAdRequest.getExtraParameters()) : apiAdRequest.getExtraParameters() == null) && ((map2 = this.keyValuePairs) != null ? map2.equals(apiAdRequest.getKeyValuePairs()) : apiAdRequest.getKeyValuePairs() == null) && ((num3 = this.displayAdCloseInterval) != null ? num3.equals(apiAdRequest.getDisplayAdCloseInterval()) : apiAdRequest.getDisplayAdCloseInterval() == null) && this.isSplash == apiAdRequest.getIsSplash()) {
            Integer num4 = this.videoSkipInterval;
            if (num4 == null) {
                if (apiAdRequest.getVideoSkipInterval() == null) {
                    return true;
                }
            } else if (num4.equals(apiAdRequest.getVideoSkipInterval())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.publisherId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003) ^ this.adFormat.hashCode()) * 1000003;
        String str = this.adDimension;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.width;
        int hashCode3 = (hashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str2 = this.mediationNetworkName;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mediationNetworkSDKVersion;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mediationAdapterVersion;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Map<String, Object> map = this.extraParameters;
        int hashCode8 = (hashCode7 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        Map<String, Set<String>> map2 = this.keyValuePairs;
        int hashCode9 = (hashCode8 ^ (map2 == null ? 0 : map2.hashCode())) * 1000003;
        Integer num3 = this.displayAdCloseInterval;
        int hashCode10 = (((hashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003) ^ (this.isSplash ? 1231 : 1237)) * 1000003;
        Integer num4 = this.videoSkipInterval;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode10 ^ i;
    }

    static final class Builder extends ApiAdRequest.Builder {
        private String adDimension;
        private String adFormat;
        private String adSpaceId;
        private Integer displayAdCloseInterval;
        private Map<String, Object> extraParameters;
        private Integer height;
        private Boolean isSplash;
        private Map<String, Set<String>> keyValuePairs;
        private String mediationAdapterVersion;
        private String mediationNetworkName;
        private String mediationNetworkSDKVersion;
        private String publisherId;
        private Integer videoSkipInterval;
        private Integer width;

        Builder() {
        }

        public ApiAdRequest.Builder setPublisherId(String str) {
            if (str != null) {
                this.publisherId = str;
                return this;
            }
            throw new NullPointerException("Null publisherId");
        }

        public ApiAdRequest.Builder setAdSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public ApiAdRequest.Builder setAdFormat(String str) {
            if (str != null) {
                this.adFormat = str;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public ApiAdRequest.Builder setAdDimension(String str) {
            this.adDimension = str;
            return this;
        }

        public ApiAdRequest.Builder setWidth(Integer num) {
            this.width = num;
            return this;
        }

        public ApiAdRequest.Builder setHeight(Integer num) {
            this.height = num;
            return this;
        }

        public ApiAdRequest.Builder setMediationNetworkName(String str) {
            this.mediationNetworkName = str;
            return this;
        }

        public ApiAdRequest.Builder setMediationNetworkSDKVersion(String str) {
            this.mediationNetworkSDKVersion = str;
            return this;
        }

        public ApiAdRequest.Builder setMediationAdapterVersion(String str) {
            this.mediationAdapterVersion = str;
            return this;
        }

        public ApiAdRequest.Builder setExtraParameters(Map<String, Object> map) {
            this.extraParameters = map;
            return this;
        }

        public ApiAdRequest.Builder setKeyValuePairs(Map<String, Set<String>> map) {
            this.keyValuePairs = map;
            return this;
        }

        public ApiAdRequest.Builder setDisplayAdCloseInterval(Integer num) {
            this.displayAdCloseInterval = num;
            return this;
        }

        public ApiAdRequest.Builder setIsSplash(boolean z) {
            this.isSplash = Boolean.valueOf(z);
            return this;
        }

        public ApiAdRequest.Builder setVideoSkipInterval(Integer num) {
            this.videoSkipInterval = num;
            return this;
        }

        public ApiAdRequest build() {
            String str = "";
            if (this.publisherId == null) {
                str = str + " publisherId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.isSplash == null) {
                str = str + " isSplash";
            }
            if (str.isEmpty()) {
                return new AutoValue_ApiAdRequest(this.publisherId, this.adSpaceId, this.adFormat, this.adDimension, this.width, this.height, this.mediationNetworkName, this.mediationNetworkSDKVersion, this.mediationAdapterVersion, this.extraParameters, this.keyValuePairs, this.displayAdCloseInterval, this.isSplash.booleanValue(), this.videoSkipInterval);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
