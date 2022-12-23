package com.ogury.p376ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kw */
class C10702kw extends C10701kv {
    /* renamed from: b */
    public static final <T> T m32656b(List<? extends T> list) {
        C10765mq.m32773b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public static final <T> T m32658c(List<? extends T> list) {
        C10765mq.m32773b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C10692km.m32646a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: a */
    public static final <T> List<T> m32655a(Collection<? extends T> collection) {
        C10765mq.m32773b(collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    /* renamed from: b */
    public static final <T> boolean m32657b(Iterable<? extends T> iterable) {
        C10765mq.m32773b(iterable, "$this$none");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
