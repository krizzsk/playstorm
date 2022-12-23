package com.tapjoy.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.ap */
public final class C11430ap<E> implements C11432ar<E> {

    /* renamed from: a */
    private final List<E> f27680a;

    public C11430ap(List<E> list) {
        this.f27680a = list;
    }

    public final boolean add(E e) {
        return this.f27680a.add(e);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f27680a.addAll(collection);
    }

    public final void clear() {
        this.f27680a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f27680a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f27680a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f27680a.equals(obj);
    }

    /* renamed from: a */
    public final E mo72132a(int i) {
        return this.f27680a.get(i);
    }

    public final int hashCode() {
        return this.f27680a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f27680a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f27680a.iterator();
    }

    public final boolean remove(Object obj) {
        return this.f27680a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f27680a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f27680a.retainAll(collection);
    }

    public final int size() {
        return this.f27680a.size();
    }

    public final Object[] toArray() {
        return this.f27680a.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f27680a.toArray(tArr);
    }

    public final boolean offer(E e) {
        return this.f27680a.add(e);
    }

    public final E remove() {
        E poll = poll();
        if (poll != null) {
            return poll;
        }
        throw new NoSuchElementException();
    }

    public final E poll() {
        if (this.f27680a.isEmpty()) {
            return null;
        }
        return this.f27680a.remove(0);
    }

    public final E element() {
        E peek = peek();
        if (peek != null) {
            return peek;
        }
        throw new NoSuchElementException();
    }

    public final E peek() {
        if (this.f27680a.isEmpty()) {
            return null;
        }
        return this.f27680a.get(0);
    }

    /* renamed from: b */
    public final void mo72133b(int i) {
        C11431aq.m33225a(this.f27680a, i);
    }
}
