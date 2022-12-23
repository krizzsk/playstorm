package com.smaato.sdk.core.network.exception;

import com.smaato.sdk.core.util.Objects;

public class HttpsOnlyPolicyViolationException extends Exception {
    public final String violatedUrl;

    public HttpsOnlyPolicyViolationException(String str) {
        this.violatedUrl = (String) Objects.requireNonNull(str);
    }

    public String toString() {
        return "HttpsOnlyPolicyViolationException{violatedUrl='" + this.violatedUrl + '\'' + '}';
    }
}
