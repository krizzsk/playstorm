package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.ne */
class C10780ne extends C10779nd {
    /* renamed from: a */
    public static final int m32798a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
