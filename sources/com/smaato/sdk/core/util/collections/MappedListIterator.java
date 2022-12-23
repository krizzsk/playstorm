package com.smaato.sdk.core.util.collections;

import java.util.ListIterator;

abstract class MappedListIterator<F, T> extends MappedIterator<F, T> implements ListIterator<T> {
    MappedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> backingIterator() {
        return Iterators.cast(this.backingIterator);
    }

    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    public final T previous() {
        return map(backingIterator().previous());
    }

    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    public final int previousIndex() {
        return backingIterator().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}
