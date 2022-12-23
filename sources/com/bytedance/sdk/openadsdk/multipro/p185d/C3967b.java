package com.bytedance.sdk.openadsdk.multipro.p185d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.b */
/* compiled from: SPMultiHelperImpl */
class C3967b {

    /* renamed from: a */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f10184a;

    /* renamed from: c */
    private static SharedPreferences m12996c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(m12986a(str), 0);
    }

    /* renamed from: a */
    private static String m12986a(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    /* renamed from: a */
    private static Object m12984a(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10184a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = (Map) concurrentHashMap.get(m12986a(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* renamed from: a */
    private static void m12989a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10184a;
        if (softReference == null || softReference.get() == null) {
            f10184a = new SoftReference<>(new ConcurrentHashMap());
        }
        String a = m12986a(str);
        ConcurrentHashMap concurrentHashMap = f10184a.get();
        if (concurrentHashMap.get(a) == null) {
            concurrentHashMap.put(a, new HashMap());
        }
        ((Map) concurrentHashMap.get(a)).put(str2, obj);
    }

    /* renamed from: b */
    private static void m12995b(String str) {
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10184a;
        if (softReference != null && softReference.get() != null && (map = (Map) f10184a.get().get(m12986a(str))) != null) {
            map.clear();
        }
    }

    /* renamed from: a */
    static synchronized <T> void m12988a(Context context, String str, String str2, T t) {
        synchronized (C3967b.class) {
            SharedPreferences c = m12996c(context, str);
            if (c != null) {
                if (!t.equals(m12984a(str, str2))) {
                    SharedPreferences.Editor edit = c.edit();
                    if (t instanceof Boolean) {
                        edit.putBoolean(str2, ((Boolean) t).booleanValue());
                    }
                    if (t instanceof String) {
                        edit.putString(str2, (String) t);
                    }
                    if (t instanceof Integer) {
                        edit.putInt(str2, ((Integer) t).intValue());
                    }
                    if (t instanceof Long) {
                        edit.putLong(str2, ((Long) t).longValue());
                    }
                    if (t instanceof Float) {
                        edit.putFloat(str2, ((Float) t).floatValue());
                    }
                    edit.apply();
                    m12989a(str, str2, (Object) t);
                }
            }
        }
    }

    /* renamed from: a */
    static String m12985a(Context context, String str, String str2, String str3) {
        Object a = m12984a(str, str2);
        if (a != null) {
            return a + "";
        }
        Object b = m12992b(context, str, str2, str3);
        m12989a(str, str2, b);
        return b + "";
    }

    /* renamed from: b */
    private static Object m12992b(Context context, String str, String str2, String str3) {
        String a = m12986a(str);
        if (!m12990a(context, a, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return m12997c(context, a, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(m12991a(context, a, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(m12982a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase(Constants.LONG)) {
            return Long.valueOf(m12983a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(m12981a(context, a, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return m12997c(context, a, str2, (String) null);
        }
        return null;
    }

    /* renamed from: c */
    private static String m12997c(Context context, String str, String str2, String str3) {
        SharedPreferences c = m12996c(context, str);
        if (c == null) {
            return str3;
        }
        return c.getString(str2, str3);
    }

    /* renamed from: a */
    private static int m12982a(Context context, String str, String str2, int i) {
        SharedPreferences c = m12996c(context, str);
        if (c == null) {
            return i;
        }
        return c.getInt(str2, i);
    }

    /* renamed from: a */
    private static float m12981a(Context context, String str, String str2, float f) {
        SharedPreferences c = m12996c(context, str);
        if (c == null) {
            return f;
        }
        return c.getFloat(str2, f);
    }

    /* renamed from: a */
    private static boolean m12991a(Context context, String str, String str2, boolean z) {
        SharedPreferences c = m12996c(context, str);
        if (c == null) {
            return z;
        }
        return c.getBoolean(str2, z);
    }

    /* renamed from: a */
    private static long m12983a(Context context, String str, String str2, long j) {
        SharedPreferences c = m12996c(context, str);
        if (c == null) {
            return j;
        }
        return c.getLong(str2, j);
    }

    /* renamed from: a */
    static boolean m12990a(Context context, String str, String str2) {
        SharedPreferences c = m12996c(context, str);
        return c != null && c.contains(str2);
    }

    /* renamed from: b */
    static void m12994b(Context context, String str, String str2) {
        try {
            SharedPreferences c = m12996c(context, str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.remove(str2);
                edit.apply();
                if (f10184a != null && f10184a.get() != null) {
                    Map map = (Map) f10184a.get().get(m12986a(str));
                    if (map == null) {
                        return;
                    }
                    if (map.size() != 0) {
                        map.remove(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static void m12987a(Context context, String str) {
        SharedPreferences.Editor edit = m12996c(context, str).edit();
        edit.clear();
        edit.apply();
        m12995b(str);
    }

    /* renamed from: b */
    static Map<String, ?> m12993b(Context context, String str) {
        return m12996c(context, str).getAll();
    }
}
