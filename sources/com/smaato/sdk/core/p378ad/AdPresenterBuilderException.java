package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderException */
public final class AdPresenterBuilderException extends Exception implements SdkComponentException<AdPresenterBuilder.Error> {
    private final AdPresenterBuilder.Error errorType;
    private final Exception reason;

    public AdPresenterBuilderException(AdPresenterBuilder.Error error, Exception exc) {
        super(exc);
        this.errorType = (AdPresenterBuilder.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public String toString() {
        return "AdPresenterBuilderException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPresenterBuilderException.class != obj.getClass()) {
            return false;
        }
        AdPresenterBuilderException adPresenterBuilderException = (AdPresenterBuilderException) obj;
        if (this.errorType != adPresenterBuilderException.errorType || !Objects.equals(this.reason, adPresenterBuilderException.reason)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public AdPresenterBuilder.Error getErrorType() {
        return this.errorType;
    }

    public Exception getReason() {
        return this.reason;
    }
}
