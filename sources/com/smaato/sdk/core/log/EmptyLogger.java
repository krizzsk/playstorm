package com.smaato.sdk.core.log;

public class EmptyLogger implements Logger {
    public void debug(LogDomain logDomain, String str, Object... objArr) {
    }

    public void debug(LogDomain logDomain, Throwable th, String str, Object... objArr) {
    }

    public void error(LogDomain logDomain, String str, Object... objArr) {
    }

    public void error(LogDomain logDomain, Throwable th, String str, Object... objArr) {
    }

    public void info(LogDomain logDomain, String str, Object... objArr) {
    }

    public void info(LogDomain logDomain, Throwable th, String str, Object... objArr) {
    }

    public void log(LogLevel logLevel, LogDomain logDomain, String str, Object... objArr) {
    }

    public void log(LogLevel logLevel, LogDomain logDomain, Throwable th, String str, Object... objArr) {
    }

    public void setExplicitOneShotTag(String str) {
    }

    public void warning(LogDomain logDomain, String str, Object... objArr) {
    }

    public void warning(LogDomain logDomain, Throwable th, String str, Object... objArr) {
    }
}
