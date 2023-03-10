package com.iab.omid.library.oguryco.adsession;

public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");
    
    private final String errorType;

    private ErrorType(String str) {
        this.errorType = str;
    }

    public final String toString() {
        return this.errorType;
    }
}
