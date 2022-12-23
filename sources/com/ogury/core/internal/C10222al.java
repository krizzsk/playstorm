package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.al */
/* compiled from: TypeIntrinsics */
public class C10222al {
    /* renamed from: a */
    private static <T extends Throwable> T m31039a(T t) {
        return C10219ai.m31033a(t, C10222al.class.getName());
    }

    /* renamed from: a */
    public static Iterable m31038a(Object obj) {
        if (!(obj instanceof C10223am) || (obj instanceof C10224an)) {
            return m31040b(obj);
        }
        String name = obj == null ? "null" : obj.getClass().getName();
        throw ((ClassCastException) m31039a(new ClassCastException(name + " cannot be cast to " + "kotlin.collections.MutableIterable")));
    }

    /* renamed from: b */
    private static Iterable m31040b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) m31039a(e));
        }
    }
}
