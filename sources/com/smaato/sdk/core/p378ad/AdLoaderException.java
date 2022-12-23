package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

/* renamed from: com.smaato.sdk.core.ad.AdLoaderException */
public final class AdLoaderException extends Exception implements SdkComponentException<AdLoader.Error> {
    private final AdLoader.Error errorType;
    private final Exception reason;

    public AdLoaderException(AdLoader.Error error, Exception exc) {
        super(exc);
        this.errorType = (AdLoader.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public String toString() {
        return "AdLoaderException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdLoaderException.class != obj.getClass()) {
            return false;
        }
        AdLoaderException adLoaderException = (AdLoaderException) obj;
        if (this.errorType != adLoaderException.errorType || !Objects.equals(this.reason, adLoaderException.reason)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public AdLoader.Error getErrorType() {
        return this.errorType;
    }

    public Exception getReason() {
        return this.reason;
    }
}
