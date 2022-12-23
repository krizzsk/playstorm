package com.ogury.core.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ogury.core.internal.s */
/* compiled from: Sets.kt */
public final class C10292s implements C10223am, Serializable, Set {

    /* renamed from: a */
    public static final C10292s f26090a = new C10292s();

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return C10217ag.m31029a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C10217ag.m31030a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C10292s() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C10219ai.m31036b((Void) obj, "element");
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C10219ai.m31036b(collection, "elements");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C10289p.f26087a;
    }
}
