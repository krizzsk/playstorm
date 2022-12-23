package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.t */
/* compiled from: Iterators.kt */
public abstract class C10293t implements C10223am, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo66789a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo66789a());
    }
}
