package com.smaato.sdk.core.util;

public final class Arrays {
    private Arrays() {
    }

    public static boolean contains(Object[] objArr, Object obj) {
        Objects.requireNonNull(objArr, "Parameter array cannot be null for Arrays::contains");
        Objects.requireNonNull(obj, "Parameter object cannot be null for Arrays::contains");
        for (Object equals : objArr) {
            if (Objects.equals(equals, obj)) {
                return true;
            }
        }
        return false;
    }
}
