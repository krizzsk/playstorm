package com.tapjoy.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.at */
public final class C11434at<K, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final HashMap<K, C11466bq<K, V>> f27682a = new HashMap<>();

    /* renamed from: b */
    private final C11467br<K, V> f27683b = new C11467br<>();

    public final int size() {
        m33230b();
        return this.f27682a.size();
    }

    public final void clear() {
        this.f27682a.clear();
        do {
        } while (this.f27683b.mo72249a() != null);
    }

    public final boolean containsKey(Object obj) {
        m33230b();
        return this.f27682a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        m33230b();
        for (C11466bq<K, V> bqVar : this.f27682a.values()) {
            if (obj.equals(bqVar.get())) {
                return true;
            }
        }
        return false;
    }

    public final V get(Object obj) {
        m33230b();
        return m33229a(this.f27682a.get(obj));
    }

    public final V put(K k, V v) {
        m33230b();
        return m33229a(this.f27682a.put(k, new C11466bq(k, v, this.f27683b)));
    }

    public final V remove(Object obj) {
        m33230b();
        return m33229a(this.f27682a.remove(obj));
    }

    /* renamed from: a */
    private static V m33229a(C11466bq<K, V> bqVar) {
        if (bqVar != null) {
            return bqVar.get();
        }
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        m33230b();
        throw new UnsupportedOperationException();
    }

    public final Set<K> keySet() {
        m33230b();
        return this.f27682a.keySet();
    }

    public final Collection<V> values() {
        m33230b();
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        m33230b();
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        m33230b();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        m33230b();
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private void m33230b() {
        while (true) {
            C11466bq<K, V> a = this.f27683b.mo72249a();
            if (a != null) {
                this.f27682a.remove(a.f27741a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static <K, V> C11434at<K, V> m33228a() {
        return new C11434at<>();
    }
}
