package com.smaato.sdk.core.util.collections;

import java.util.LinkedHashSet;

public class CacheSet<T> extends LinkedHashSet<T> {
    public T poll() {
        int size = size() - 1;
        if (size < 0) {
            return null;
        }
        T t = toArray()[size];
        remove(t);
        return t;
    }
}
