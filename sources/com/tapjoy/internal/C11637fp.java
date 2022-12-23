package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.tapjoy.internal.fp */
public final class C11637fp {
    /* renamed from: a */
    public static <T> T m33802a(T t, Class<T> cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C11638a(t, Thread.currentThread(), Looper.myLooper()));
    }

    /* renamed from: com.tapjoy.internal.fp$a */
    static class C11638a implements InvocationHandler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Object f28299a;

        /* renamed from: b */
        private final Thread f28300b;

        /* renamed from: c */
        private final Looper f28301c;

        public C11638a(Object obj, Thread thread, Looper looper) {
            this.f28299a = obj;
            this.f28300b = thread;
            this.f28301c = looper;
        }

        public final Object invoke(Object obj, final Method method, final Object[] objArr) {
            if (this.f28300b == Thread.currentThread()) {
                return method.invoke(this.f28299a, objArr);
            }
            if (method.getReturnType().equals(Void.TYPE)) {
                C116391 r4 = new Runnable() {
                    public final void run() {
                        try {
                            method.invoke(C11638a.this.f28299a, objArr);
                        } catch (IllegalArgumentException e) {
                            throw C11691gt.m33929a(e);
                        } catch (IllegalAccessException e2) {
                            throw C11691gt.m33929a(e2);
                        } catch (InvocationTargetException e3) {
                            throw C11691gt.m33929a(e3);
                        }
                    }
                };
                if (this.f28301c != null && new Handler(this.f28301c).post(r4)) {
                    return null;
                }
                if (this.f28300b == C11700hb.m33956b() && C11700hb.f28440a.mo72182a(r4)) {
                    return null;
                }
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null || !new Handler(mainLooper).post(r4)) {
                    return method.invoke(this.f28299a, objArr);
                }
                return null;
            }
            throw new UnsupportedOperationException("method not return void: " + method.getName());
        }
    }
}
