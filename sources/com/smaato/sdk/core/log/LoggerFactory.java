package com.smaato.sdk.core.log;

import android.util.Log;
import com.smaato.sdk.core.log.LoggerImpl;
import com.smaato.sdk.core.util.Objects;

final class LoggerFactory {
    public static final LogLevel DEFAULT_CONSOLE_LOG_LEVEL = LogLevel.WARNING;
    private static volatile Logger loggerInstance;

    private LoggerFactory() {
    }

    public static void initializeLogger(LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        if (loggerInstance == null) {
            synchronized (LoggerFactory.class) {
                if (loggerInstance == null) {
                    LoggerImpl loggerImpl = new LoggerImpl(LoggerImpl.Environment.RELEASE);
                    loggerImpl.addLogWriter(new ConsoleLogWriter(logLevel));
                    loggerInstance = loggerImpl;
                }
            }
        }
    }

    public static Logger getLogger() {
        Class<LoggerFactory> cls = LoggerFactory.class;
        if (loggerInstance == null) {
            synchronized (cls) {
                if (loggerInstance == null) {
                    Log.e(cls.getName(), "Logger was not initialized! Going to initialize with a default console log level");
                    initializeLogger(DEFAULT_CONSOLE_LOG_LEVEL);
                }
            }
        }
        return loggerInstance;
    }
}
