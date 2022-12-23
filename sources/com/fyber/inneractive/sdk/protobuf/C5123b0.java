package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b0 */
public enum C5123b0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C5151i.class, C5151i.class, C5151i.f13766b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    public final Class<?> f13723a;

    /* renamed from: b */
    public final Object f13724b;

    /* access modifiers changed from: public */
    C5123b0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f13723a = cls2;
        this.f13724b = obj;
    }
}
