package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

public class ResourceLoaderException extends Exception implements SdkComponentException<ResourceLoader.Error> {
    private final ResourceLoader.Error errorType;
    private final Exception reason;

    public ResourceLoaderException(ResourceLoader.Error error, Exception exc) {
        this.errorType = (ResourceLoader.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public Exception getReason() {
        return this.reason;
    }

    public ResourceLoader.Error getErrorType() {
        return this.errorType;
    }

    public String toString() {
        return "ResourceLoaderException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoaderException resourceLoaderException = (ResourceLoaderException) obj;
        if (this.errorType != resourceLoaderException.errorType || !Objects.equals(this.reason, resourceLoaderException.reason)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }
}
