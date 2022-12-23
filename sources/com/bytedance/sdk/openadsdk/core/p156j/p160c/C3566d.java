package com.bytedance.sdk.openadsdk.core.p156j.p160c;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.d */
/* compiled from: VastUtils */
public class C3566d {

    /* renamed from: a */
    public static final List<String> f8960a = Arrays.asList(new String[]{"video/mp4", "video/3gpp"});

    /* renamed from: a */
    public static double m11150a(int i, double d, int i2, int i3, int i4, String str) {
        double a = m11149a(i, d, i2, i3);
        return m11151a(str) * (1.0d / ((a + 1.0d) + m11148a(i4)));
    }

    /* renamed from: a */
    private static double m11149a(int i, double d, int i2, int i3) {
        double d2 = 0.0d;
        double abs = d != Double.MIN_VALUE ? Math.abs(d - (i3 != 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d;
        if (!(i == Integer.MIN_VALUE || i == 0)) {
            d2 = (double) Math.abs((i - i2) / i);
        }
        return abs + d2;
    }

    /* renamed from: a */
    private static double m11148a(int i) {
        int max = Math.max(i, 0);
        if (700 > max || max > 1500) {
            return Math.min((double) (((float) Math.abs(700 - max)) / 700.0f), (double) (((float) Math.abs(1500 - max)) / 1500.0f));
        }
        return 0.0d;
    }

    /* renamed from: a */
    private static double m11151a(String str) {
        if (str == null) {
            str = "";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c = 0;
            }
        } else if (str.equals("video/3gpp")) {
            c = 1;
        }
        return c != 0 ? 1.0d : 1.5d;
    }
}
