package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

public final class ApiConnectorException extends Exception implements SdkComponentException<ApiConnector.Error> {
    private final ApiConnector.Error errorType;
    private final Exception reason;

    public ApiConnectorException(ApiConnector.Error error, Exception exc) {
        super(exc);
        this.errorType = (ApiConnector.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public String toString() {
        return "ApiConnectorException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApiConnectorException.class != obj.getClass()) {
            return false;
        }
        ApiConnectorException apiConnectorException = (ApiConnectorException) obj;
        if (this.errorType != apiConnectorException.errorType || !Objects.equals(this.reason, apiConnectorException.reason)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public ApiConnector.Error getErrorType() {
        return this.errorType;
    }

    public Exception getReason() {
        return this.reason;
    }
}
