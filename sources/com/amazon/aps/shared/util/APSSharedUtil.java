package com.amazon.aps.shared.util;

public class APSSharedUtil {
    public static final String EMPTY_STRING = "";
    public static final String TRUNCATE_SEPARATOR = "...";

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }
}
