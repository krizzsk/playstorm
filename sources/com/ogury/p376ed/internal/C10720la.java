package com.ogury.p376ed.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.la */
public final class C10720la implements C10772mx, Serializable, Set {

    /* renamed from: a */
    public static final C10720la f26977a = new C10720la();
    private static final long serialVersionUID = 3406603774387020532L;

    /* renamed from: a */
    private static boolean m32733a(Void voidR) {
        C10765mq.m32773b(voidR, "element");
        return false;
    }

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
        return C10760ml.m32762a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C10760ml.m32763a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C10720la() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m32733a((Void) obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C10765mq.m32773b(collection, "elements");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C10703kx.f26941a;
    }

    private final Object readResolve() {
        return f26977a;
    }
}
