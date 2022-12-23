package com.apm.insight.p023l;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.r */
public class C1312r {

    /* renamed from: a */
    private static int f1308a;

    /* renamed from: a */
    public static int m1878a(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Float m1879a(Map<? super String, Float> map) {
        float f = 0.0f;
        for (Float next : map.values()) {
            if (next != null) {
                f += next.floatValue();
            }
        }
        return Float.valueOf(f);
    }

    /* renamed from: a */
    public static Long m1880a(Map<? super String, Long> map, String str, Long l) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l2 = map.get(str);
        if (l2 != null) {
            l = Long.valueOf(l2.longValue() + l.longValue());
        }
        map.put(str, l);
        return l;
    }

    /* renamed from: a */
    public static void m1881a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public static boolean m1882a(int i) {
        return false;
    }

    /* renamed from: b */
    public static int m1883b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 16;
        }
        if (i == 3) {
            return 32;
        }
        if (i != 4) {
            return i != 5 ? 0 : 128;
        }
        return 64;
    }
}
