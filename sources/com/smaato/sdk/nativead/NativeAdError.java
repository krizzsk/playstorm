package com.smaato.sdk.nativead;

import java.util.Objects;

public enum NativeAdError {
    NO_AD_AVAILABLE("No ad is currently available matching the requested parameters."),
    INVALID_REQUEST("Invalid ad request (e.g. PublisherId or AdSpaceId is incorrect)."),
    NETWORK_ERROR("The ad request has not been completed due to a network connectivity issue."),
    INTERNAL_ERROR("An internal error happened (e.g. the ad server responded with an invalid response)."),
    CACHE_LIMIT_REACHED("Cache limit reached. Please use one of previous AD.");
    
    private final String description;

    private NativeAdError(String str) {
        this.description = (String) Objects.requireNonNull(str);
    }

    public String toString() {
        return String.format("[%s]: %s", new Object[]{name(), this.description});
    }
}
