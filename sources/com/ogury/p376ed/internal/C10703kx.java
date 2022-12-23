package com.ogury.p376ed.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kx */
public final class C10703kx implements C10772mx, ListIterator {

    /* renamed from: a */
    public static final C10703kx f26941a = new C10703kx();

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

    private C10703kx() {
    }

    public final /* synthetic */ Object next() {
        return m32659a();
    }

    public final /* synthetic */ Object previous() {
        return m32660b();
    }

    /* renamed from: a */
    private static Void m32659a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static Void m32660b() {
        throw new NoSuchElementException();
    }
}
