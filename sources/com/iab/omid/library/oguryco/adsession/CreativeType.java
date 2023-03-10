package com.iab.omid.library.oguryco.adsession;

public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");
    
    private final String creativeType;

    private CreativeType(String str) {
        this.creativeType = str;
    }

    public final String toString() {
        return this.creativeType;
    }
}
