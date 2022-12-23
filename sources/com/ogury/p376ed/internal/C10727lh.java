package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.lh */
public final class C10727lh {
    /* renamed from: b */
    private static final int m32744b(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    private static final int m32743a(int i, int i2, int i3) {
        return m32744b(m32744b(i, 1) - m32744b(i2, 1), 1);
    }

    /* renamed from: a */
    public static final int m32742a(int i, int i2) {
        return i >= i2 ? i2 : i2 - m32743a(i2, i, 1);
    }
}
