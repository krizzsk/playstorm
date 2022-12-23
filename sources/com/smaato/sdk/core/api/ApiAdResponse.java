package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.AutoValue_ApiAdResponse;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.util.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class ApiAdResponse {
    public abstract AdFormat getAdFormat();

    public abstract byte[] getBody();

    public abstract String getCharset();

    public abstract String getCreativeId();

    /* access modifiers changed from: package-private */
    public abstract String getCsm();

    public abstract Expiration getExpiration();

    public abstract ImpressionCountingType getImpressionCountingType();

    public abstract String getRequestUrl();

    public abstract Map<String, List<String>> getResponseHeaders();

    public abstract String getSessionId();

    public static Builder builder() {
        return new AutoValue_ApiAdResponse.Builder().responseHeaders(Collections.emptyMap()).requestUrl("").charset("UTF-8").impressionCountingType(ImpressionCountingType.STANDARD);
    }

    public boolean isCsm() {
        return !TextUtils.isEmpty(getCsm());
    }

    public Builder newBuilder() {
        return builder().adFormat(getAdFormat()).body(getBody()).responseHeaders(getResponseHeaders()).charset(getCharset()).requestUrl(getRequestUrl()).expiration(getExpiration()).sessionId(getSessionId()).creativeId(getCreativeId()).csm(getCsm()).impressionCountingType(getImpressionCountingType());
    }

    public static abstract class Builder {
        public abstract Builder adFormat(AdFormat adFormat);

        /* access modifiers changed from: package-private */
        public abstract ApiAdResponse autoBuild();

        public abstract Builder body(byte[] bArr);

        public abstract Builder charset(String str);

        public abstract Builder creativeId(String str);

        public abstract Builder csm(String str);

        public abstract Builder expiration(Expiration expiration);

        /* access modifiers changed from: package-private */
        public abstract byte[] getBody();

        /* access modifiers changed from: package-private */
        public abstract Map<String, List<String>> getResponseHeaders();

        public abstract Builder impressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder requestUrl(String str);

        public abstract Builder responseHeaders(Map<String, List<String>> map);

        public abstract Builder sessionId(String str);

        public ApiAdResponse build() {
            return responseHeaders(Collections.unmodifiableMap(getResponseHeaders())).body(Arrays.copyOf(getBody(), getBody().length)).autoBuild();
        }
    }
}
