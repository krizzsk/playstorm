package com.tapjoy.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.al */
public final class C11425al<K, V> extends C11424ak<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, C11419ag<K, V>> f27671a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    private int f27672b = 10;

    /* renamed from: a */
    private void m33217a() {
        int size = this.f27671a.size() - this.f27672b;
        if (size > 0) {
            Iterator<Map.Entry<K, C11419ag<K, V>>> it = this.f27671a.entrySet().iterator();
            while (size > 0 && it.hasNext()) {
                size--;
                it.next();
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo72126a(K k, V v) {
        super.mo72126a(k, v);
        m33217a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11421ai<V> mo72127a(K k, boolean z) {
        C11419ag agVar = this.f27671a.get(k);
        if (agVar != null || !z) {
            return agVar;
        }
        C11419ag agVar2 = new C11419ag(k);
        this.f27671a.put(k, agVar2);
        m33217a();
        return agVar2;
    }
}
