package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.mu */
public final class C10769mu {
    /* renamed from: a */
    public static C10792no m32784a(C10763mo moVar) {
        return moVar;
    }

    /* renamed from: a */
    public static C10791nn m32783a(Class cls, String str) {
        return new C10767ms(cls, str);
    }

    /* renamed from: a */
    public static C10790nm m32782a(Class cls) {
        return new C10758mk(cls);
    }

    /* renamed from: a */
    public static String m32786a(C10766mr mrVar) {
        return m32785a((C10762mn) mrVar);
    }

    /* renamed from: a */
    private static String m32785a(C10762mn mnVar) {
        String obj = mnVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
