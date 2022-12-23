package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.tapjoy.internal.as */
public final class C11433as<E> extends AbstractSet<E> implements Serializable, Set<E> {

    /* renamed from: a */
    transient WeakHashMap<E, C11433as<E>> f27681a;

    public C11433as() {
        this(new WeakHashMap());
    }

    private C11433as(WeakHashMap<E, C11433as<E>> weakHashMap) {
        this.f27681a = weakHashMap;
    }

    public final boolean add(E e) {
        return this.f27681a.put(e, this) == null;
    }

    public final void clear() {
        this.f27681a.clear();
    }

    public final Object clone() {
        try {
            return (C11433as) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean contains(Object obj) {
        return this.f27681a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f27681a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f27681a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        return this.f27681a.remove(obj) != null;
    }

    public final int size() {
        return this.f27681a.size();
    }
}
