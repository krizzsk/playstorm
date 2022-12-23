package com.p374my.tracker.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* renamed from: com.my.tracker.ads.AdNetwork */
public @interface AdNetwork {
    public static final int ADMOB = 1;
    public static final int MOPUB = 2;
}
