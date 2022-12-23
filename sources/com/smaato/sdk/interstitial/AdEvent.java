package com.smaato.sdk.interstitial;

public class AdEvent {
    private final Object content;
    private final Type type;

    public enum Type {
        LOADED,
        OPEN,
        IMPRESS,
        CLICK,
        CLOSE,
        ERROR,
        TTL_EXPIRED
    }

    public Type getType() {
        return this.type;
    }

    public Object getContent() {
        return this.content;
    }
}
