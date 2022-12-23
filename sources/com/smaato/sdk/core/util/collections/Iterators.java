package com.smaato.sdk.core.util.collections;

import java.util.Iterator;
import java.util.ListIterator;

final class Iterators {
    private Iterators() {
    }

    static <T> ListIterator<T> cast(Iterator<T> it) {
        return (ListIterator) it;
    }
}
