package com.ogury.p376ed.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.lf */
class C10725lf extends C10724le {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m32738a() {
        C10705kz kzVar = C10705kz.f26943a;
        if (kzVar != null) {
            return kzVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: a */
    public static final <K, V> void m32741a(Map<? super K, ? super V> map, Iterable<? extends C10678jz<? extends K, ? extends V>> iterable) {
        C10765mq.m32773b(map, "$this$putAll");
        C10765mq.m32773b(iterable, "pairs");
        for (C10678jz jzVar : iterable) {
            map.put(jzVar.mo67739c(), jzVar.mo67740d());
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m32739a(Iterable<? extends C10678jz<? extends K, ? extends V>> iterable) {
        C10765mq.m32773b(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10722lc.m32738a();
        }
        if (size != 1) {
            return C10722lc.m32740a(iterable, new LinkedHashMap(C10722lc.m32736a(collection.size())));
        }
        return C10722lc.m32737a((C10678jz) ((List) iterable).get(0));
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m32740a(Iterable<? extends C10678jz<? extends K, ? extends V>> iterable, M m) {
        C10765mq.m32773b(iterable, "$this$toMap");
        C10765mq.m32773b(m, "destination");
        C10722lc.m32741a(m, iterable);
        return m;
    }
}
