package com.smaato.sdk.core.log;

public enum LogLevel {
    DEBUG(3),
    INFO(4),
    WARNING(5),
    ERROR(6);
    
    private final int logCatLevel;

    private LogLevel(int i) {
        this.logCatLevel = i;
    }

    public int getLogCatLevel() {
        return this.logCatLevel;
    }
}
