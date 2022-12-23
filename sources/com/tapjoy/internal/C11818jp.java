package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.jp */
public final class C11818jp {

    /* renamed from: a */
    public static C11818jp f28847a = new C11818jp((String) null);

    /* renamed from: b */
    public String f28848b;

    /* renamed from: c */
    public Throwable f28849c;

    /* renamed from: d */
    private Object[] f28850d;

    public C11818jp(String str) {
        this(str, (Object[]) null, (Throwable) null);
    }

    public C11818jp(String str, Object[] objArr, Throwable th) {
        this.f28848b = str;
        this.f28849c = th;
        if (th == null) {
            this.f28850d = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.f28850d = objArr2;
        }
    }
}
