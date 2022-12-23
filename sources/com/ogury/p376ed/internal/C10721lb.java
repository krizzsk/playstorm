package com.ogury.p376ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.lb */
public abstract class C10721lb implements C10772mx, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo67840a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer next() {
        return Integer.valueOf(mo67840a());
    }
}
