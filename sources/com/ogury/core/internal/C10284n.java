package com.ogury.core.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.ogury.core.internal.n */
/* compiled from: MutableCollections.kt */
class C10284n extends C10283m {
    /* renamed from: a */
    private static final <T> boolean m31129a(Iterable<? extends T> iterable, C10216af<? super T, Boolean> afVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (afVar.mo66754a(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static final <T> boolean m31130a(List<T> list, C10216af<? super T, Boolean> afVar) {
        int i;
        C10219ai.m31036b(list, "$this$removeAll");
        C10219ai.m31036b(afVar, "predicate");
        if (list instanceof RandomAccess) {
            int a = C10281k.m31126a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!afVar.mo66754a(t).booleanValue()) {
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
            int a2 = C10281k.m31126a(list);
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
            return m31129a(C10222al.m31038a((Object) list), afVar, true);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
