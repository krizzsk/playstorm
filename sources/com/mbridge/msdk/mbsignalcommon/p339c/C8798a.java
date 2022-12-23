package com.mbridge.msdk.mbsignalcommon.p339c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbsignalcommon.c.a */
/* compiled from: Mapping */
public final class C8798a {

    /* renamed from: a */
    private static C8799a f21402a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a */
    /* compiled from: Mapping */
    public interface C8799a {
        /* renamed from: a */
        boolean mo58213a(C8800b.C8801a aVar);
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b */
    /* compiled from: Mapping */
    public static abstract class C8800b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a */
        /* compiled from: Mapping */
        public static class C8801a extends Throwable {

            /* renamed from: a */
            private Class<?> f21403a;

            /* renamed from: b */
            private String f21404b;

            public C8801a(String str) {
                super(str);
            }

            public C8801a(Exception exc) {
                super(exc);
            }

            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            /* renamed from: a */
            public final void mo58214a(Class<?> cls) {
                this.f21403a = cls;
            }

            /* renamed from: a */
            public final void mo58215a(String str) {
                this.f21404b = str;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$d */
    /* compiled from: Mapping */
    public static class C8803d {

        /* renamed from: a */
        protected final Method f21406a;

        /* renamed from: a */
        public final Object mo58218a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            try {
                return this.f21406a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        C8803d(Class<?> cls, String str, Class<?>[] clsArr, int i) throws C8800b.C8801a {
            Method method = null;
            Class<? super Object> cls2 = cls;
            if (cls == null) {
                this.f21406a = null;
                return;
            }
            while (true) {
                if (cls2 == Object.class) {
                    break;
                }
                try {
                    method = cls2.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        C8800b.C8801a aVar = new C8800b.C8801a(e3);
                        aVar.mo58214a(cls2);
                        aVar.mo58215a(str);
                        C8798a.m25580b(aVar);
                    } catch (Throwable th) {
                        this.f21406a = null;
                        throw th;
                    }
                }
                cls2 = cls2.getSuperclass();
            }
            if (i > 0 && (method.getModifiers() & i) != i) {
                C8798a.m25580b(new C8800b.C8801a(method + " does not match modifiers: " + i));
            }
            method.setAccessible(true);
            this.f21406a = method;
        }

        /* renamed from: a */
        public final Method mo58219a() {
            return this.f21406a;
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$c */
    /* compiled from: Mapping */
    public static class C8802c<C> {

        /* renamed from: a */
        protected Class<C> f21405a;

        /* renamed from: a */
        public final C8803d mo58217a(String str, Class<?>... clsArr) throws C8800b.C8801a {
            return new C8803d(this.f21405a, str, clsArr, 0);
        }

        public C8802c(Class<C> cls) {
            this.f21405a = cls;
        }
    }

    /* renamed from: a */
    public static <T> C8802c<T> m25578a(ClassLoader classLoader, String str) throws C8800b.C8801a {
        try {
            return new C8802c<>(classLoader.loadClass(str));
        } catch (Exception e) {
            m25580b(new C8800b.C8801a(e));
            return new C8802c<>((Class) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m25580b(C8800b.C8801a aVar) throws C8800b.C8801a {
        C8799a aVar2 = f21402a;
        if (aVar2 == null || !aVar2.mo58213a(aVar)) {
            throw aVar;
        }
    }
}
