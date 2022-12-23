package com.ogury.p375cm.internal;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ogury.p375cm.internal.bacab;
import java.util.Collection;

/* renamed from: com.ogury.cm.internal.bacaa */
public abstract class bacaa<E> implements Collection<E> {

    /* renamed from: com.ogury.cm.internal.bacaa$aaaaa */
    static final class aaaaa extends bbaca implements bbaab<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ bacaa f25909a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(bacaa bacaa) {
            super(1);
            this.f25909a = bacaa;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66506a(Object obj) {
            return obj == this.f25909a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected bacaa() {
    }

    /* renamed from: a */
    public abstract int mo66675a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (bbabc.m30942a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        bbabc.m30943b(collection, "elements");
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

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return mo66675a();
    }

    public Object[] toArray() {
        return bbaba.m30935a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        bbabc.m30943b(tArr, "array");
        T[] a = bbaba.m30936a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String toString() {
        CharSequence charSequence = ", ";
        CharSequence charSequence2 = "[";
        CharSequence charSequence3 = "]";
        CharSequence charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        bbabc.m30943b(this, "receiver$0");
        bbabc.m30943b(charSequence, "separator");
        bbabc.m30943b(charSequence2, "prefix");
        bbabc.m30943b(charSequence3, "postfix");
        bbabc.m30943b(charSequence4, "truncated");
        String sb = ((StringBuilder) bacab.aaaaa.m30915a(this, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, new aaaaa(this))).toString();
        bbabc.m30940a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
