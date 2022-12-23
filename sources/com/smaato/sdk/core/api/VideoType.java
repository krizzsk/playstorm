package com.smaato.sdk.core.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface VideoType {
    public static final String INTERSTITIAL = "interstitial";
    public static final String OUTSTREAM = "outstream";
    public static final String REWARDED = "rewarded";
}
