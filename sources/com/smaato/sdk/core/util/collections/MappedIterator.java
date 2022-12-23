package com.smaato.sdk.core.util.collections;

import com.smaato.sdk.core.util.Objects;
import java.util.Iterator;

abstract class MappedIterator<F, T> implements Iterator<T> {
    final Iterator<? extends F> backingIterator;

    /* access modifiers changed from: package-private */
    public abstract T map(F f);

    MappedIterator(Iterator<? extends F> it) {
        this.backingIterator = (Iterator) Objects.requireNonNull(it);
    }

    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    public final T next() {
        return map(this.backingIterator.next());
    }

    public final void remove() {
        this.backingIterator.remove();
    }
}
