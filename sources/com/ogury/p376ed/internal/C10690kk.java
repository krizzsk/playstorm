package com.ogury.p376ed.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kk */
class C10690kk extends C10689kj {
    /* renamed from: a */
    public static final <T> boolean m32639a(T[] tArr, T t) {
        C10765mq.m32773b(tArr, "$this$contains");
        return C10686kg.m32640b(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> int m32640b(T[] tArr, T t) {
        C10765mq.m32773b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C10765mq.m32772a((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static final char m32638a(char[] cArr) {
        C10765mq.m32773b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m32641b(T[] tArr) {
        C10765mq.m32773b(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C10692km.m32648a();
        }
        if (length != 1) {
            return C10686kg.m32642c(tArr);
        }
        return C10692km.m32644a(tArr[0]);
    }

    /* renamed from: c */
    public static final <T> List<T> m32642c(T[] tArr) {
        C10765mq.m32773b(tArr, "$this$toMutableList");
        return new ArrayList<>(C10692km.m32647a(tArr));
    }
}
