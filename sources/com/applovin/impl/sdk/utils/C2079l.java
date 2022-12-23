package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.l */
public class C2079l<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a */
    private final ArrayList<T> f4062a = new ArrayList<>();

    /* renamed from: b */
    private final HashSet<T> f4063b = new HashSet<>();

    /* renamed from: a */
    public T mo14724a() {
        return (Comparable) this.f4062a.get(size() - 1);
    }

    /* renamed from: a */
    public T mo14725a(int i) {
        return (Comparable) this.f4062a.get(i);
    }

    /* renamed from: a */
    public void mo14726a(int i, T t) {
        this.f4063b.remove((Comparable) this.f4062a.get(i));
        this.f4062a.set(i, t);
        this.f4063b.add(t);
    }

    /* renamed from: a */
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }
        if (isEmpty() || t.compareTo(mo14724a()) > 0) {
            this.f4062a.add(t);
        } else {
            this.f4062a.add(mo14732c(t), t);
        }
        return this.f4063b.add(t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo14730b(T t) {
        if (t == null || !contains(t)) {
            return -1;
        }
        return mo14732c(t);
    }

    /* renamed from: b */
    public T mo14731b(int i) {
        T t = (Comparable) this.f4062a.remove(i);
        this.f4063b.remove(t);
        return t;
    }

    /* renamed from: c */
    public int mo14732c(T t) {
        int binarySearch = Collections.binarySearch(this.f4062a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo14725a(binarySearch);
        while (binarySearch >= 0 && a == mo14725a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public void clear() {
        this.f4062a.clear();
        this.f4063b.clear();
    }

    public boolean contains(Object obj) {
        return this.f4063b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f4063b.containsAll(collection);
    }

    /* renamed from: d */
    public int mo14736d(T t) {
        int binarySearch = Collections.binarySearch(this.f4062a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo14725a(binarySearch);
        while (binarySearch < size() && a == mo14725a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public boolean isEmpty() {
        return this.f4062a.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f4062a.iterator();
    }

    public boolean remove(Object obj) {
        int b = mo14730b((Comparable) obj);
        if (b == -1) {
            return false;
        }
        this.f4062a.remove(b);
        return this.f4063b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it.next();
                if (z || remove(next)) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f4062a.get(size);
            if (!collection.contains(comparable)) {
                this.f4062a.remove(size);
                this.f4063b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f4062a.size();
    }

    public Object[] toArray() {
        return this.f4062a.toArray();
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f4062a.toArray(t1Arr);
    }
}
