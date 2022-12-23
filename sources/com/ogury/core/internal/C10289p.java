package com.ogury.core.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.core.internal.p */
/* compiled from: Collections.kt */
public final class C10289p implements C10223am, ListIterator {

    /* renamed from: a */
    public static final C10289p f26087a = new C10289p();

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C10289p() {
    }

    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}
