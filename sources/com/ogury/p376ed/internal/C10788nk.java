package com.ogury.p376ed.internal;

import com.ogury.p376ed.internal.C10784nh;

/* renamed from: com.ogury.ed.internal.nk */
class C10788nk extends C10787nj {
    /* renamed from: a */
    public static final int m32810a(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public static final int m32812b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C10784nh m32811a(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C10784nh(i, i2 - 1);
        }
        C10784nh.C10785a aVar = C10784nh.f27015b;
        return C10784nh.C10785a.m32809a();
    }

    /* renamed from: c */
    public static final int m32813c(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
        } else if (i < 0) {
            return 0;
        } else {
            return i > i2 ? i2 : i;
        }
    }
}
