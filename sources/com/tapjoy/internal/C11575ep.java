package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.tapjoy.internal.ep */
final class C11575ep<T> extends AbstractList<T> implements Serializable, RandomAccess {

    /* renamed from: a */
    private final ArrayList<T> f27983a;

    C11575ep(List<T> list) {
        this.f27983a = new ArrayList<>(list);
    }

    public final int size() {
        return this.f27983a.size();
    }

    public final T get(int i) {
        return this.f27983a.get(i);
    }

    public final Object[] toArray() {
        return this.f27983a.toArray();
    }
}
