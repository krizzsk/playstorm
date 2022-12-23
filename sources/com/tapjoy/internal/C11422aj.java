package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.aj */
public final class C11422aj {

    /* renamed from: com.tapjoy.internal.aj$a */
    public static final class C11423a<K, V> implements C11426am<K, V> {

        /* renamed from: a */
        private final C11424ak<K, V> f27670a;

        public C11423a(C11424ak<K, V> akVar) {
            this.f27670a = akVar;
        }

        /* renamed from: a */
        public final V mo72125a(K k) {
            C11421ai<V> a;
            V a2;
            synchronized (this.f27670a) {
                a = this.f27670a.mo72127a(k, false);
            }
            if (a == null) {
                return null;
            }
            synchronized (a) {
                a2 = a.mo72123a();
            }
            return a2;
        }

        /* renamed from: a */
        public final void mo72126a(K k, V v) {
            C11421ai<V> a;
            synchronized (this.f27670a) {
                a = this.f27670a.mo72127a(k, true);
            }
            synchronized (a) {
                a.mo72124a(v);
            }
        }
    }
}
