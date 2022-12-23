package com.ogury.p376ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.mg */
final class C10753mg<T> implements C10772mx, Iterator<T> {

    /* renamed from: a */
    private int f26981a;

    /* renamed from: b */
    private final T[] f26982b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C10753mg(T[] tArr) {
        C10765mq.m32773b(tArr, "array");
        this.f26982b = tArr;
    }

    public final boolean hasNext() {
        return this.f26981a < this.f26982b.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f26982b;
            int i = this.f26981a;
            this.f26981a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f26981a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
