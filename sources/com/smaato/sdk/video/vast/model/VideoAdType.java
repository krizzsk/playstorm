package com.smaato.sdk.video.vast.model;

public enum VideoAdType {
    VIDEO,
    AUDIO,
    HYBRID;

    public static VideoAdType parse(String str) {
        for (VideoAdType videoAdType : values()) {
            if (videoAdType.name().equalsIgnoreCase(str)) {
                return videoAdType;
            }
        }
        return null;
    }
}
