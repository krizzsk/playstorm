package com.ogury.p376ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.mq */
public class C10765mq {
    private C10765mq() {
    }

    /* renamed from: a */
    public static String m32765a(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: a */
    public static void m32769a(Object obj) {
        if (obj == null) {
            m32768a();
        }
    }

    /* renamed from: a */
    private static void m32768a() {
        throw ((NullPointerException) m32766a(new NullPointerException()));
    }

    /* renamed from: b */
    private static void m32774b(String str) {
        throw ((C10683kd) m32766a(new C10683kd(str)));
    }

    /* renamed from: a */
    public static void m32771a(String str) {
        m32774b("lateinit property " + str + " has not been initialized");
    }

    /* renamed from: a */
    public static void m32770a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m32766a(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: b */
    public static void m32773b(Object obj, String str) {
        if (obj == null) {
            m32775c(str);
        }
    }

    /* renamed from: c */
    private static void m32775c(String str) {
        throw ((NullPointerException) m32766a(new NullPointerException(m32776d(str))));
    }

    /* renamed from: d */
    private static String m32776d(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: a */
    public static boolean m32772a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m32766a(T t) {
        return m32767a(t, C10765mq.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m32767a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
