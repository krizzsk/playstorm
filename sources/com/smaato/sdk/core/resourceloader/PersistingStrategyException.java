package com.smaato.sdk.core.resourceloader;

import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;
import java.io.IOException;

public class PersistingStrategyException extends IOException implements SdkComponentException<PersistingStrategy.Error> {
    private final PersistingStrategy.Error errorType;
    private final Exception reason;

    public PersistingStrategyException(PersistingStrategy.Error error, Exception exc) {
        this.errorType = (PersistingStrategy.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public Exception getReason() {
        return this.reason;
    }

    public PersistingStrategy.Error getErrorType() {
        return this.errorType;
    }

    public String toString() {
        return "PersistingStrategyException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistingStrategyException persistingStrategyException = (PersistingStrategyException) obj;
        if (this.errorType != persistingStrategyException.errorType || !Objects.equals(this.reason, persistingStrategyException.reason)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }
}
