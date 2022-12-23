package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c0 */
public class C5126c0 extends C5131d0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$a */
    public static class C5127a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C5126c0> f13729a;

        public C5127a(Map.Entry<K, C5126c0> entry) {
            this.f13729a = entry;
        }

        public K getKey() {
            return this.f13729a.getKey();
        }

        public Object getValue() {
            C5126c0 value = this.f13729a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo25868a((C5207q0) null);
        }

        public Object setValue(Object obj) {
            if (obj instanceof C5207q0) {
                C5126c0 value = this.f13729a.getValue();
                C5207q0 q0Var = value.f13736a;
                value.f13737b = null;
                value.f13736a = (C5207q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$b */
    public static class C5128b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f13730a;

        public C5128b(Iterator<Map.Entry<K, Object>> it) {
            this.f13730a = it;
        }

        public boolean hasNext() {
            return this.f13730a.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f13730a.next();
            return next.getValue() instanceof C5126c0 ? new C5127a(next) : next;
        }

        public void remove() {
            this.f13730a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo25868a((C5207q0) null).equals(obj);
    }

    public int hashCode() {
        return mo25868a((C5207q0) null).hashCode();
    }

    public String toString() {
        return mo25868a((C5207q0) null).toString();
    }
}
