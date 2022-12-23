package com.inmobi.ads.exceptions;

public final class SdkNotInitializedException extends IllegalStateException {
    public SdkNotInitializedException(String str) {
        super("Please initialize the SDK before creating " + str + " ad");
    }
}
