package com.ogury.p376ed.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.kn */
class C10693kn {
    /* renamed from: a */
    public static final <T> List<T> m32644a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C10765mq.m32770a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m32645a(T[] tArr, boolean z) {
        C10765mq.m32773b(tArr, "$this$copyToArrayOfAny");
        if (z && C10765mq.m32772a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C10765mq.m32770a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
