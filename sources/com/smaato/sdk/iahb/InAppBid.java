package com.smaato.sdk.iahb;

public abstract class InAppBid {
    /* access modifiers changed from: package-private */
    public abstract String getJson();

    InAppBid() {
    }

    public static InAppBid create(String str) {
        if (str != null) {
            return new AutoValue_InAppBid(str);
        }
        throw new NullPointerException("'json' specified as non-null is null");
    }
}
