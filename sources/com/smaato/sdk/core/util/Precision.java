package com.smaato.sdk.core.util;

public final class Precision {
    public static final double EPSILON = Double.longBitsToDouble(4368491638549381120L);
    private static final long NEGATIVE_ZERO_DOUBLE_BITS = Double.doubleToRawLongBits(-0.0d);
    private static final int NEGATIVE_ZERO_FLOAT_BITS = Float.floatToRawIntBits(-0.0f);
    private static final long POSITIVE_ZERO_DOUBLE_BITS = Double.doubleToRawLongBits(0.0d);
    private static final int POSITIVE_ZERO_FLOAT_BITS = Float.floatToRawIntBits(0.0f);
    public static final double SAFE_MIN = Double.longBitsToDouble(4503599627370496L);

    private Precision() {
    }

    public static int compareTo(double d, double d2, double d3) {
        if (equals(d, d2, d3)) {
            return 0;
        }
        return d < d2 ? -1 : 1;
    }

    public static int compareTo(double d, double d2, int i) {
        if (equals(d, d2, i)) {
            return 0;
        }
        return d < d2 ? -1 : 1;
    }

    public static boolean equals(float f, float f2) {
        return equals(f, f2, 1);
    }

    public static boolean equalsIncludingNaN(float f, float f2) {
        int i = (f > f ? 1 : (f == f ? 0 : -1));
        if (i == 0 && f2 == f2) {
            return equals(f, f2, 1);
        }
        return !((i != 0) ^ ((f2 > f2 ? 1 : (f2 == f2 ? 0 : -1)) != 0));
    }

    public static boolean equals(float f, float f2, float f3) {
        return equals(f, f2, 1) || Math.abs(f2 - f) <= f3;
    }

    public static boolean equalsIncludingNaN(float f, float f2, float f3) {
        return equalsIncludingNaN(f, f2) || Math.abs(f2 - f) <= f3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (java.lang.Math.abs(r0 - r1) <= r8) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0 > (r8 - r1)) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean equals(float r6, float r7, int r8) {
        /*
            int r0 = java.lang.Float.floatToRawIntBits(r6)
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            r2 = r0 ^ r1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0019
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            if (r0 > r8) goto L_0x0033
            goto L_0x0031
        L_0x0019:
            if (r0 >= r1) goto L_0x0022
            int r2 = POSITIVE_ZERO_FLOAT_BITS
            int r1 = r1 - r2
            int r2 = NEGATIVE_ZERO_FLOAT_BITS
            int r0 = r0 - r2
            goto L_0x002b
        L_0x0022:
            int r2 = POSITIVE_ZERO_FLOAT_BITS
            int r0 = r0 - r2
            int r2 = NEGATIVE_ZERO_FLOAT_BITS
            int r1 = r1 - r2
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002b:
            if (r1 <= r8) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            int r8 = r8 - r1
            if (r0 > r8) goto L_0x0033
        L_0x0031:
            r8 = r4
            goto L_0x0034
        L_0x0033:
            r8 = r3
        L_0x0034:
            if (r8 == 0) goto L_0x0043
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0043
            boolean r6 = java.lang.Float.isNaN(r7)
            if (r6 != 0) goto L_0x0043
            r3 = r4
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.Precision.equals(float, float, int):boolean");
    }

    public static boolean equalsIncludingNaN(float f, float f2, int i) {
        int i2 = (f > f ? 1 : (f == f ? 0 : -1));
        if (i2 == 0 && f2 == f2) {
            return equals(f, f2, i);
        }
        return !((i2 != 0) ^ ((f2 > f2 ? 1 : (f2 == f2 ? 0 : -1)) != 0));
    }

    public static boolean equals(double d, double d2) {
        return equals(d, d2, 1);
    }

    public static boolean equalsIncludingNaN(double d, double d2) {
        int i = (d > d ? 1 : (d == d ? 0 : -1));
        if (i == 0 && d2 == d2) {
            return equals(d, d2, 1);
        }
        return !((i != 0) ^ ((d2 > d2 ? 1 : (d2 == d2 ? 0 : -1)) != 0));
    }

    public static boolean equals(double d, double d2, double d3) {
        return equals(d, d2, 1) || Math.abs(d2 - d) <= d3;
    }

    public static boolean equalsIncludingNaN(double d, double d2, double d3) {
        return equalsIncludingNaN(d, d2) || Math.abs(d2 - d) <= d3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 > (r7 - r2)) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (java.lang.Math.abs(r0 - r2) <= ((long) r15)) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean equals(double r11, double r13, int r15) {
        /*
            long r0 = java.lang.Double.doubleToRawLongBits(r11)
            long r2 = java.lang.Double.doubleToRawLongBits(r13)
            long r4 = r0 ^ r2
            r6 = -9223372036854775808
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0020
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            long r2 = (long) r15
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x0041
            goto L_0x003f
        L_0x0020:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002b
            long r7 = POSITIVE_ZERO_DOUBLE_BITS
            long r2 = r2 - r7
            long r7 = NEGATIVE_ZERO_DOUBLE_BITS
            long r0 = r0 - r7
            goto L_0x0034
        L_0x002b:
            long r7 = POSITIVE_ZERO_DOUBLE_BITS
            long r0 = r0 - r7
            long r7 = NEGATIVE_ZERO_DOUBLE_BITS
            long r2 = r2 - r7
            r9 = r0
            r0 = r2
            r2 = r9
        L_0x0034:
            long r7 = (long) r15
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            long r7 = r7 - r2
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 > 0) goto L_0x0041
        L_0x003f:
            r15 = r6
            goto L_0x0042
        L_0x0041:
            r15 = r5
        L_0x0042:
            if (r15 == 0) goto L_0x0051
            boolean r11 = java.lang.Double.isNaN(r11)
            if (r11 != 0) goto L_0x0051
            boolean r11 = java.lang.Double.isNaN(r13)
            if (r11 != 0) goto L_0x0051
            r5 = r6
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.Precision.equals(double, double, int):boolean");
    }

    public static boolean equalsIncludingNaN(double d, double d2, int i) {
        int i2 = (d > d ? 1 : (d == d ? 0 : -1));
        if (i2 == 0 && d2 == d2) {
            return equals(d, d2, i);
        }
        return !((i2 != 0) ^ ((d2 > d2 ? 1 : (d2 == d2 ? 0 : -1)) != 0));
    }
}
