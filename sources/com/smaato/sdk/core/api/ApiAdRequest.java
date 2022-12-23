package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.AutoValue_ApiAdRequest;
import java.util.Map;
import java.util.Set;

public abstract class ApiAdRequest {

    public static abstract class Builder {
        public abstract ApiAdRequest build();

        public abstract Builder setAdDimension(String str);

        public abstract Builder setAdFormat(String str);

        public abstract Builder setAdSpaceId(String str);

        public abstract Builder setDisplayAdCloseInterval(Integer num);

        public abstract Builder setExtraParameters(Map<String, Object> map);

        public abstract Builder setHeight(Integer num);

        public abstract Builder setIsSplash(boolean z);

        public abstract Builder setKeyValuePairs(Map<String, Set<String>> map);

        public abstract Builder setMediationAdapterVersion(String str);

        public abstract Builder setMediationNetworkName(String str);

        public abstract Builder setMediationNetworkSDKVersion(String str);

        public abstract Builder setPublisherId(String str);

        public abstract Builder setVideoSkipInterval(Integer num);

        public abstract Builder setWidth(Integer num);
    }

    public abstract String getAdDimension();

    public abstract String getAdFormat();

    public abstract String getAdSpaceId();

    public abstract Integer getDisplayAdCloseInterval();

    public abstract Map<String, Object> getExtraParameters();

    public abstract Integer getHeight();

    public abstract boolean getIsSplash();

    public abstract Map<String, Set<String>> getKeyValuePairs();

    public abstract String getMediationAdapterVersion();

    public abstract String getMediationNetworkName();

    public abstract String getMediationNetworkSDKVersion();

    public abstract String getPublisherId();

    public abstract Integer getVideoSkipInterval();

    public abstract Integer getWidth();

    public static Builder builder() {
        return new AutoValue_ApiAdRequest.Builder();
    }

    public Builder newBuilder() {
        return builder().setPublisherId(getPublisherId()).setAdSpaceId(getAdSpaceId()).setAdFormat(getAdFormat()).setAdDimension(getAdDimension()).setWidth(getWidth()).setHeight(getHeight()).setMediationNetworkName(getMediationNetworkName()).setMediationNetworkSDKVersion(getMediationNetworkSDKVersion()).setMediationAdapterVersion(getMediationAdapterVersion()).setExtraParameters(getExtraParameters()).setIsSplash(getIsSplash()).setDisplayAdCloseInterval(getDisplayAdCloseInterval()).setVideoSkipInterval(getVideoSkipInterval());
    }
}
