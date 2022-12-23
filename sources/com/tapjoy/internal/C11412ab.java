package com.tapjoy.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.ab */
public final class C11412ab {
    /* renamed from: a */
    public static Iterable<View> m33203a(ViewGroup viewGroup) {
        final C11414a aVar = new C11414a(viewGroup);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return aVar;
            }
        };
    }

    /* renamed from: com.tapjoy.internal.ab$a */
    static class C11414a implements Iterator<View> {

        /* renamed from: a */
        private final ViewGroup f27656a;

        /* renamed from: b */
        private int f27657b;

        /* renamed from: c */
        private int f27658c = 0;

        public C11414a(ViewGroup viewGroup) {
            this.f27656a = viewGroup;
            this.f27657b = viewGroup.getChildCount();
        }

        public final boolean hasNext() {
            return this.f27658c < this.f27657b;
        }

        public final void remove() {
            this.f27656a.removeViewAt(this.f27658c - 1);
        }

        public final /* synthetic */ Object next() {
            ViewGroup viewGroup = this.f27656a;
            int i = this.f27658c;
            this.f27658c = i + 1;
            return viewGroup.getChildAt(i);
        }
    }
}
