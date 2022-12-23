package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ak */
public abstract class C11424ak<K, V> implements C11420ah<K, V> {
    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract C11421ai<V> mo72127a(K k, boolean z);

    /* renamed from: a */
    public final V mo72125a(K k) {
        C11421ai a = mo72127a(k, false);
        if (a != null) {
            return a.mo72123a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo72126a(K k, V v) {
        mo72127a(k, true).mo72124a(v);
    }
}
