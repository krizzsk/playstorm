package com.ogury.p376ed.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.ogury.ed.internal.kt */
class C10699kt extends C10698ks {
    /* renamed from: a */
    private static final <T> boolean m32652a(Iterable<? extends T> iterable, C10730lk<? super T, Boolean> lkVar) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (lkVar.mo66961a(it.next()).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final <T> boolean m32653a(List<T> list, C10730lk<? super T, Boolean> lkVar) {
        C10765mq.m32773b(list, "$this$removeAll");
        C10765mq.m32773b(lkVar, "predicate");
        return m32654b(list, lkVar);
    }

    /* renamed from: b */
    private static final <T> boolean m32654b(List<T> list, C10730lk<? super T, Boolean> lkVar) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C10692km.m32646a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!lkVar.mo66961a(t).booleanValue()) {
                        if (i != i2) {
                            list.set(i, t);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C10692km.m32646a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m32652a(C10771mw.m32788a((Object) list), lkVar);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
