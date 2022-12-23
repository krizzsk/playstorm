package com.ogury.p376ed.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.kf */
final class C10685kf<T> implements C10772mx, Collection<T> {

    /* renamed from: a */
    private final T[] f26939a;

    /* renamed from: b */
    private final boolean f26940b = false;

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final <T> T[] toArray(T[] tArr) {
        return C10760ml.m32763a(this, tArr);
    }

    public C10685kf(T[] tArr) {
        C10765mq.m32773b(tArr, TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        this.f26939a = tArr;
    }

    public final int size() {
        return m32636a();
    }

    /* renamed from: a */
    private int m32636a() {
        return this.f26939a.length;
    }

    public final boolean isEmpty() {
        return this.f26939a.length == 0;
    }

    public final boolean contains(Object obj) {
        return C10686kg.m32639a(this.f26939a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C10765mq.m32773b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<T> iterator() {
        return C10754mh.m32752a(this.f26939a);
    }

    public final Object[] toArray() {
        return C10692km.m32645a(this.f26939a, this.f26940b);
    }
}
