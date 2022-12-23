package com.tapjoy.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.eq */
public final class C11576eq {
    /* renamed from: a */
    public static <T> List<T> m33582a() {
        return new C11577er(Collections.emptyList());
    }

    /* renamed from: a */
    public static <T> List<T> m33583a(String str, List<T> list) {
        if (list != null) {
            if (list instanceof C11577er) {
                list = ((C11577er) list).f27984a;
            }
            if (list == Collections.emptyList() || (list instanceof C11575ep)) {
                return list;
            }
            C11575ep epVar = new C11575ep(list);
            if (!epVar.contains((Object) null)) {
                return epVar;
            }
            throw new IllegalArgumentException(str + ".contains(null)");
        }
        throw new NullPointerException(str + " == null");
    }

    /* renamed from: a */
    public static boolean m33584a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static IllegalStateException m33581a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + sb);
    }
}
