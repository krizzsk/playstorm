package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.ms */
public final class C10767ms implements C10757mj {

    /* renamed from: a */
    private final Class<?> f27002a;

    /* renamed from: b */
    private final String f27003b;

    public C10767ms(Class<?> cls, String str) {
        C10765mq.m32773b(cls, "jClass");
        C10765mq.m32773b(str, "moduleName");
        this.f27002a = cls;
        this.f27003b = str;
    }

    /* renamed from: a */
    public final Class<?> mo67855a() {
        return this.f27002a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10767ms) && C10765mq.m32772a((Object) mo67855a(), (Object) ((C10767ms) obj).mo67855a());
    }

    public final int hashCode() {
        return mo67855a().hashCode();
    }

    public final String toString() {
        return mo67855a().toString() + " (Kotlin reflection is not available)";
    }
}
