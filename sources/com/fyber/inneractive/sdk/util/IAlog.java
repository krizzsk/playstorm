package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.C4458a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAlog {

    /* renamed from: a */
    public static int f14137a = 4;

    /* renamed from: b */
    public static final C4458a f14138b = new C4458a();

    /* renamed from: c */
    public static final List<FMPLogger> f14139c = new C5310a();

    /* renamed from: com.fyber.inneractive.sdk.util.IAlog$a */
    public class C5310a extends CopyOnWriteArrayList<FMPLogger> {
        public C5310a() {
            add(IAlog.f14138b);
        }
    }

    /* renamed from: b */
    public static void m16700b(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, (Throwable) null, objArr);
        }
    }

    /* renamed from: c */
    public static void m16701c(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m16702d(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    /* renamed from: e */
    public static void m16703e(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m16699a(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m16698a(String str, Throwable th, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    /* renamed from: a */
    public static void m16697a(int i, Exception exc, String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f14139c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(i, (Exception) null, str, objArr);
        }
    }

    /* renamed from: a */
    public static String m16696a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    /* renamed from: a */
    public static String m16695a(Class<?> cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
