package com.ogury.p375cm.internal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.ogury.cm.internal.bbabc */
public class bbabc {
    private bbabc() {
    }

    /* renamed from: a */
    private static <T extends Throwable> T m30937a(T t) {
        return m30938a(t, bbabc.class.getName());
    }

    /* renamed from: a */
    private static <T extends Throwable> T m30938a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public static void m30939a() {
        throw ((babba) m30937a(new babba()));
    }

    /* renamed from: a */
    public static void m30940a(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m30937a(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: a */
    public static void m30941a(String str) {
        throw ((babcb) m30937a(new babcb("lateinit property " + str + " has not been initialized")));
    }

    /* renamed from: a */
    public static boolean m30942a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m30943b(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            throw ((IllegalArgumentException) m30937a(new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str)));
        }
    }
}
