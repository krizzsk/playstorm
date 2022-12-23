package com.smaato.sdk.core.network.exception;

import com.smaato.sdk.core.util.Objects;

public class HttpsOnlyPolicyViolationOnRedirectException extends Exception {
    public final String originalUrl;
    public final String violatedUrl;

    public HttpsOnlyPolicyViolationOnRedirectException(String str, String str2) {
        this.originalUrl = (String) Objects.requireNonNull(str);
        this.violatedUrl = (String) Objects.requireNonNull(str2);
    }

    public String toString() {
        return "HttpsOnlyPolicyViolationOnRedirectException{, originalUrl='" + this.originalUrl + '\'' + ", violatedUrl='" + this.violatedUrl + '\'' + '}';
    }
}
