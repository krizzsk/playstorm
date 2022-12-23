package com.ogury.p375cm.internal;

import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbca */
public final class bbbca<T, R> implements bbbba<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bbbba<T> f25938a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bbaab<T, R> f25939b;

    /* renamed from: com.ogury.cm.internal.bbbca$aaaaa */
    public static final class aaaaa implements Iterator<R> {

        /* renamed from: a */
        final /* synthetic */ bbbca f25940a;

        /* renamed from: b */
        private final Iterator<T> f25941b;

        aaaaa(bbbca bbbca) {
            this.f25940a = bbbca;
            this.f25941b = bbbca.f25938a.mo66713a();
        }

        public final boolean hasNext() {
            return this.f25941b.hasNext();
        }

        public final R next() {
            return this.f25940a.f25939b.mo66506a(this.f25941b.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbca(bbbba<? extends T> bbbba, bbaab<? super T, ? extends R> bbaab) {
        bbabc.m30943b(bbbba, "sequence");
        bbabc.m30943b(bbaab, "transformer");
        this.f25938a = bbbba;
        this.f25939b = bbaab;
    }

    /* renamed from: a */
    public final Iterator<R> mo66713a() {
        return new aaaaa(this);
    }
}
