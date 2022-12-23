package com.ogury.p376ed.internal;

import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mw */
public class C10771mw {
    /* renamed from: a */
    private static <T extends Throwable> T m32789a(T t) {
        return C10765mq.m32767a(t, C10771mw.class.getName());
    }

    /* renamed from: a */
    private static void m32790a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m32791a(name + " cannot be cast to " + str);
    }

    /* renamed from: a */
    private static void m32791a(String str) {
        throw m32787a(new ClassCastException(str));
    }

    /* renamed from: a */
    private static ClassCastException m32787a(ClassCastException classCastException) {
        throw ((ClassCastException) m32789a(classCastException));
    }

    /* renamed from: a */
    public static Iterable m32788a(Object obj) {
        if ((obj instanceof C10772mx) && !(obj instanceof C10774mz)) {
            m32790a(obj, "kotlin.collections.MutableIterable");
        }
        return m32794d(obj);
    }

    /* renamed from: d */
    private static Iterable m32794d(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m32787a(e);
        }
    }

    /* renamed from: b */
    public static List m32792b(Object obj) {
        if ((obj instanceof C10772mx) && !(obj instanceof C10776na)) {
            m32790a(obj, "kotlin.collections.MutableList");
        }
        return m32795e(obj);
    }

    /* renamed from: e */
    private static List m32795e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m32787a(e);
        }
    }

    /* renamed from: c */
    public static Map m32793c(Object obj) {
        if ((obj instanceof C10772mx) && !(obj instanceof C10777nb)) {
            m32790a(obj, "kotlin.collections.MutableMap");
        }
        return m32796f(obj);
    }

    /* renamed from: f */
    private static Map m32796f(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m32787a(e);
        }
    }
}
