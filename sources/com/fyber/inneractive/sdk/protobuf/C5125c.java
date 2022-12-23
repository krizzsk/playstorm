package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c */
public abstract class C5125c<E> extends AbstractList<E> implements C5252z.C5263j<E> {

    /* renamed from: a */
    public boolean f13728a = true;

    public boolean add(E e) {
        mo25844e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo25844e();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo25841b() {
        this.f13728a = false;
    }

    public void clear() {
        mo25844e();
        super.clear();
    }

    /* renamed from: d */
    public boolean mo25843d() {
        return this.f13728a;
    }

    /* renamed from: e */
    public void mo25844e() {
        if (!this.f13728a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo25844e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo25844e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo25844e();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo25844e();
        return super.addAll(i, collection);
    }
}
