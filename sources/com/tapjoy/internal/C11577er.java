package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.tapjoy.internal.er */
final class C11577er<T> extends AbstractList<T> implements Serializable, RandomAccess {

    /* renamed from: a */
    List<T> f27984a;

    /* renamed from: b */
    private final List<T> f27985b;

    C11577er(List<T> list) {
        this.f27985b = list;
        this.f27984a = list;
    }

    public final T get(int i) {
        return this.f27984a.get(i);
    }

    public final int size() {
        return this.f27984a.size();
    }

    public final T set(int i, T t) {
        if (this.f27984a == this.f27985b) {
            this.f27984a = new ArrayList(this.f27985b);
        }
        return this.f27984a.set(i, t);
    }

    public final void add(int i, T t) {
        if (this.f27984a == this.f27985b) {
            this.f27984a = new ArrayList(this.f27985b);
        }
        this.f27984a.add(i, t);
    }

    public final T remove(int i) {
        if (this.f27984a == this.f27985b) {
            this.f27984a = new ArrayList(this.f27985b);
        }
        return this.f27984a.remove(i);
    }
}
