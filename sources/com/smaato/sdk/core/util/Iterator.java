package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p382fi.Consumer;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    void remove() {
        throw new UnsupportedOperationException("remove");
    }

    void forEachRemaining(Consumer<? super E> consumer) {
        Objects.requireNonNull(consumer);
        while (hasNext()) {
            consumer.accept(next());
        }
    }
}
