package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.cg */
public final class C11483cg {
    /* renamed from: a */
    public static float m33388a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f = ((float) i) / ((float) i2);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
