package com.smaato.sdk.core.log;

import com.smaato.sdk.core.util.Objects;

abstract class LogWriter {
    private final LogLevel logLevel;

    /* access modifiers changed from: protected */
    public abstract boolean isLoggable(LogLevel logLevel2);

    /* access modifiers changed from: protected */
    public abstract void log(LogLevel logLevel2, String str, String str2);

    LogWriter(LogLevel logLevel2) {
        Objects.requireNonNull(logLevel2);
        this.logLevel = logLevel2;
    }

    /* access modifiers changed from: protected */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }
}
