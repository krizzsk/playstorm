package com.p374my.target.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* renamed from: com.my.target.common.CachePolicy */
public @interface CachePolicy {
    public static final int ALL = 0;
    public static final int IMAGE = 1;
    public static final int NONE = 3;
    public static final int VIDEO = 2;
}
