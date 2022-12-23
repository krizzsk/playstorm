package com.smaato.sdk.core.p378ad;

/* renamed from: com.smaato.sdk.core.ad.GeoType */
public enum GeoType {
    GPS("1"),
    IP_ADDRESS("2"),
    USER_PROVIDED("3");
    
    private final String type;

    private GeoType(String str) {
        this.type = str;
    }

    public String toString() {
        return this.type;
    }
}
