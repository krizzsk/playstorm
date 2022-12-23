package com.ogury.p375cm.internal;

import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bacba */
public abstract class bacba implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo66714a();

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo66714a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
