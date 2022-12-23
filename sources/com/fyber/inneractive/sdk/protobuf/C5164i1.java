package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5239u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i1 */
public class C5164i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f13778g = 0;

    /* renamed from: a */
    public final int f13779a;

    /* renamed from: b */
    public List<C5164i1<K, V>.c> f13780b;

    /* renamed from: c */
    public Map<K, V> f13781c;

    /* renamed from: d */
    public boolean f13782d;

    /* renamed from: e */
    public volatile C5164i1<K, V>.e f13783e;

    /* renamed from: f */
    public Map<K, V> f13784f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$a */
    public class C5165a extends C5164i1<FieldDescriptorType, Object> {
        public C5165a(int i) {
            super(i, (C5165a) null);
        }

        /* renamed from: d */
        public void mo26016d() {
            if (!this.f13782d) {
                for (int i = 0; i < this.f13780b.size(); i++) {
                    Map.Entry a = mo26009a(i);
                    if (((C5239u.C5240a) a.getKey()).mo25816b()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry entry : mo26011b()) {
                    if (((C5239u.C5240a) entry.getKey()).mo25816b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C5164i1.super.mo26016d();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b */
    public static class C5166b {

        /* renamed from: a */
        public static final Iterator<Object> f13785a = new C5167a();

        /* renamed from: b */
        public static final Iterable<Object> f13786b = new C5168b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$a */
        public class C5167a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$b */
        public class C5168b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C5166b.f13785a;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$c */
    public class C5169c implements Map.Entry<K, V>, Comparable<C5164i1<K, V>.c> {

        /* renamed from: a */
        public final K f13787a;

        /* renamed from: b */
        public V f13788b;

        public C5169c(K k, V v) {
            this.f13787a = k;
            this.f13788b = v;
        }

        public int compareTo(Object obj) {
            return this.f13787a.compareTo(((C5169c) obj).f13787a);
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f13787a;
            Object key = entry.getKey();
            if (k == null) {
                z = key == null;
            } else {
                z = k.equals(key);
            }
            if (z) {
                V v = this.f13788b;
                Object value = entry.getValue();
                if (v == null) {
                    z2 = value == null;
                } else {
                    z2 = v.equals(value);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f13787a;
        }

        public V getValue() {
            return this.f13788b;
        }

        public int hashCode() {
            K k = this.f13787a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f13788b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C5164i1 i1Var = C5164i1.this;
            int i = C5164i1.f13778g;
            i1Var.mo26010a();
            V v2 = this.f13788b;
            this.f13788b = v;
            return v2;
        }

        public String toString() {
            return this.f13787a + "=" + this.f13788b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$d */
    public class C5170d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f13790a = -1;

        /* renamed from: b */
        public boolean f13791b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f13792c;

        public C5170d() {
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo26035b() {
            if (this.f13792c == null) {
                this.f13792c = C5164i1.this.f13781c.entrySet().iterator();
            }
            return this.f13792c;
        }

        public boolean hasNext() {
            if (this.f13790a + 1 < C5164i1.this.f13780b.size()) {
                return true;
            }
            if (C5164i1.this.f13781c.isEmpty() || !mo26035b().hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            this.f13791b = true;
            int i = this.f13790a + 1;
            this.f13790a = i;
            if (i < C5164i1.this.f13780b.size()) {
                return C5164i1.this.f13780b.get(this.f13790a);
            }
            return (Map.Entry) mo26035b().next();
        }

        public void remove() {
            if (this.f13791b) {
                this.f13791b = false;
                C5164i1 i1Var = C5164i1.this;
                int i = C5164i1.f13778g;
                i1Var.mo26010a();
                if (this.f13790a < C5164i1.this.f13780b.size()) {
                    C5164i1 i1Var2 = C5164i1.this;
                    int i2 = this.f13790a;
                    this.f13790a = i2 - 1;
                    i1Var2.mo26012c(i2);
                    return;
                }
                mo26035b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$e */
    public class C5171e extends AbstractSet<Map.Entry<K, V>> {
        public C5171e() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C5164i1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C5164i1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C5164i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5170d();
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C5164i1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C5164i1.this.size();
        }
    }

    public /* synthetic */ C5164i1(int i, C5165a aVar) {
        this(i);
    }

    /* renamed from: b */
    public static <FieldDescriptorType extends C5239u.C5240a<FieldDescriptorType>> C5164i1<FieldDescriptorType, Object> m15807b(int i) {
        return new C5165a(i);
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo26009a(int i) {
        return this.f13780b.get(i);
    }

    /* renamed from: c */
    public final V mo26012c(int i) {
        mo26010a();
        V v = this.f13780b.remove(i).f13788b;
        if (!this.f13781c.isEmpty()) {
            Iterator it = mo26013c().entrySet().iterator();
            List<C5164i1<K, V>.c> list = this.f13780b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5169c((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public void clear() {
        mo26010a();
        if (!this.f13780b.isEmpty()) {
            this.f13780b.clear();
        }
        if (!this.f13781c.isEmpty()) {
            this.f13781c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo26007a(comparable) >= 0 || this.f13781c.containsKey(comparable);
    }

    /* renamed from: d */
    public void mo26016d() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f13782d) {
            if (this.f13781c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f13781c);
            }
            this.f13781c = map;
            if (this.f13784f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f13784f);
            }
            this.f13784f = map2;
            this.f13782d = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13783e == null) {
            this.f13783e = new C5171e();
        }
        return this.f13783e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5164i1)) {
            return super.equals(obj);
        }
        C5164i1 i1Var = (C5164i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int size2 = this.f13780b.size();
        if (size2 != i1Var.f13780b.size()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!mo26009a(i).equals(i1Var.mo26009a(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f13781c.equals(i1Var.f13781c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo26007a(comparable);
        if (a >= 0) {
            return this.f13780b.get(a).f13788b;
        }
        return this.f13781c.get(comparable);
    }

    public int hashCode() {
        int size = this.f13780b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f13780b.get(i2).hashCode();
        }
        return this.f13781c.size() > 0 ? i + this.f13781c.hashCode() : i;
    }

    public V remove(Object obj) {
        mo26010a();
        Comparable comparable = (Comparable) obj;
        int a = mo26007a(comparable);
        if (a >= 0) {
            return mo26012c(a);
        }
        if (this.f13781c.isEmpty()) {
            return null;
        }
        return this.f13781c.remove(comparable);
    }

    public int size() {
        return this.f13780b.size() + this.f13781c.size();
    }

    public C5164i1(int i) {
        this.f13779a = i;
        this.f13780b = Collections.emptyList();
        this.f13781c = Collections.emptyMap();
        this.f13784f = Collections.emptyMap();
    }

    /* renamed from: a */
    public V put(K k, V v) {
        mo26010a();
        int a = mo26007a(k);
        if (a >= 0) {
            C5169c cVar = this.f13780b.get(a);
            C5164i1.this.mo26010a();
            V v2 = cVar.f13788b;
            cVar.f13788b = v;
            return v2;
        }
        mo26010a();
        if (this.f13780b.isEmpty() && !(this.f13780b instanceof ArrayList)) {
            this.f13780b = new ArrayList(this.f13779a);
        }
        int i = -(a + 1);
        if (i >= this.f13779a) {
            return mo26013c().put(k, v);
        }
        int size = this.f13780b.size();
        int i2 = this.f13779a;
        if (size == i2) {
            C5169c remove = this.f13780b.remove(i2 - 1);
            mo26013c().put(remove.f13787a, remove.f13788b);
        }
        this.f13780b.add(i, new C5169c(k, v));
        return null;
    }

    /* renamed from: b */
    public Iterable<Map.Entry<K, V>> mo26011b() {
        if (this.f13781c.isEmpty()) {
            return C5166b.f13786b;
        }
        return this.f13781c.entrySet();
    }

    /* renamed from: c */
    public final SortedMap<K, V> mo26013c() {
        mo26010a();
        if (this.f13781c.isEmpty() && !(this.f13781c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13781c = treeMap;
            this.f13784f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13781c;
    }

    /* renamed from: a */
    public final int mo26007a(K k) {
        int size = this.f13780b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f13780b.get(size).f13787a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f13780b.get(i2).f13787a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public final void mo26010a() {
        if (this.f13782d) {
            throw new UnsupportedOperationException();
        }
    }
}
