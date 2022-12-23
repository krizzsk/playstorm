package com.ogury.p376ed.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.le */
class C10724le extends C10723ld {
    /* renamed from: a */
    public static final int m32736a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m32737a(C10678jz<? extends K, ? extends V> jzVar) {
        C10765mq.m32773b(jzVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jzVar.mo67737a(), jzVar.mo67738b());
        C10765mq.m32770a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }
}
