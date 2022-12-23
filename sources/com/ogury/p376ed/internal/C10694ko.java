package com.ogury.p376ed.internal;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ko */
class C10694ko extends C10693kn {
    /* renamed from: a */
    public static final <T> Collection<T> m32647a(T[] tArr) {
        C10765mq.m32773b(tArr, "$this$asCollection");
        return new C10685kf<>(tArr);
    }

    /* renamed from: a */
    public static final <T> List<T> m32648a() {
        return C10704ky.f26942a;
    }

    /* renamed from: b */
    public static final <T> List<T> m32649b(T... tArr) {
        C10765mq.m32773b(tArr, "elements");
        return tArr.length > 0 ? C10686kg.m32637a(tArr) : C10692km.m32648a();
    }

    /* renamed from: a */
    public static final <T> int m32646a(List<? extends T> list) {
        C10765mq.m32773b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: b */
    public static final void m32650b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
