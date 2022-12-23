package com.smaato.sdk.core.api;

import com.smaato.sdk.core.util.Objects;

public class SomaApiContext {
    private final ApiAdRequest apiAdRequest;
    private final ApiAdResponse apiAdResponse;

    public SomaApiContext(ApiAdRequest apiAdRequest2, ApiAdResponse apiAdResponse2) {
        this.apiAdRequest = (ApiAdRequest) Objects.requireNonNull(apiAdRequest2, "Parameter apiAdRequest cannot be null for SomaApiContext::new");
        this.apiAdResponse = (ApiAdResponse) Objects.requireNonNull(apiAdResponse2, "Parameter apiAdResponse cannot be null for SomaApiContext::new");
    }

    public ApiAdRequest getApiAdRequest() {
        return this.apiAdRequest;
    }

    public ApiAdResponse getApiAdResponse() {
        return this.apiAdResponse;
    }
}
