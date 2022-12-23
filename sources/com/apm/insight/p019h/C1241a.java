package com.apm.insight.p019h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.apm.insight.h.a */
public class C1241a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f1164a;

    /* renamed from: com.apm.insight.h.a$a */
    public static class C1242a<T> {

        /* renamed from: a */
        public final Class<? extends T> f1165a;

        /* renamed from: b */
        public final T f1166b;
    }

    static {
        HashMap hashMap = new HashMap();
        f1164a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f1164a.put(Byte.class, Byte.TYPE);
        f1164a.put(Character.class, Character.TYPE);
        f1164a.put(Short.class, Short.TYPE);
        f1164a.put(Integer.class, Integer.TYPE);
        f1164a.put(Float.class, Float.TYPE);
        f1164a.put(Long.class, Long.TYPE);
        f1164a.put(Double.class, Double.TYPE);
        f1164a.put(Boolean.TYPE, Boolean.TYPE);
        f1164a.put(Byte.TYPE, Byte.TYPE);
        f1164a.put(Character.TYPE, Character.TYPE);
        f1164a.put(Short.TYPE, Short.TYPE);
        f1164a.put(Integer.TYPE, Integer.TYPE);
        f1164a.put(Float.TYPE, Float.TYPE);
        f1164a.put(Long.TYPE, Long.TYPE);
        f1164a.put(Double.TYPE, Double.TYPE);
    }

    /* renamed from: a */
    public static <T> T m1569a(Class<?> cls, String str, Object... objArr) {
        return m1571a(cls, str, (Class<?>[]) m1574a(objArr)).invoke((Object) null, m1575b(objArr));
    }

    /* renamed from: a */
    public static <T> T m1570a(String str, String str2, Object... objArr) {
        try {
            return m1569a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m1571a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m1572a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m1571a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m1572a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m1573a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static boolean m1573a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f1164a.containsKey(clsArr[i]) || !f1164a.get(clsArr[i]).equals(f1164a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m1574a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C1242a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C1242a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f1165a;
            }
        }
        return clsArr;
    }

    /* renamed from: b */
    private static Object[] m1575b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C1242a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C1242a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f1166b;
            }
        }
        return objArr2;
    }
}
