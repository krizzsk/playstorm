package com.tapjoy.internal;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.an */
public abstract class C11427an<E> extends AbstractQueue<E> implements C11432ar<E> {
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            /* renamed from: b */
            private int f27674b = 0;

            public final boolean hasNext() {
                return this.f27674b < C11427an.this.size();
            }

            public final E next() {
                C11427an anVar = C11427an.this;
                int i = this.f27674b;
                this.f27674b = i + 1;
                return anVar.mo72132a(i);
            }

            public final void remove() {
                if (this.f27674b == 1) {
                    C11427an.this.mo72133b(1);
                    this.f27674b = 0;
                    return;
                }
                throw new UnsupportedOperationException("For the first element only");
            }
        };
    }
}
