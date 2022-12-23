package com.ogury.p376ed.internal;

import java.util.Collection;

/* renamed from: com.ogury.ed.internal.kp */
class C10695kp extends C10694ko {
    /* renamed from: a */
    public static final <T> int m32651a(Iterable<? extends T> iterable) {
        C10765mq.m32773b(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
