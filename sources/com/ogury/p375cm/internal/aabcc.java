package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aabcc */
public final class aabcc {

    /* renamed from: a */
    public static final aabcc f25668a = new aabcc();

    private aabcc() {
    }

    /* renamed from: a */
    public static boolean m30658a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static boolean m30659a(Integer[] numArr, int i) {
        int i2;
        bbabc.m30943b(numArr, TtmlNode.RUBY_CONTAINER);
        if (!(!(numArr.length == 0)) || numArr.length <= (i2 = i / 32)) {
            return false;
        }
        return m30658a(numArr[i2].intValue(), (int) Math.pow(2.0d, (double) (i - (i2 * 32))));
    }
}
