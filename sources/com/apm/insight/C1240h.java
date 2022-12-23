package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.C1363d;
import com.apm.insight.runtime.C1371i;
import com.apm.insight.runtime.C1392t;
import com.apm.insight.runtime.ConfigManager;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.h */
public final class C1240h {

    /* renamed from: a */
    private static Context f1149a = null;

    /* renamed from: b */
    private static Application f1150b = null;

    /* renamed from: c */
    private static long f1151c = 0;

    /* renamed from: d */
    private static String f1152d = "default";

    /* renamed from: e */
    private static boolean f1153e = false;

    /* renamed from: f */
    private static C1363d f1154f;

    /* renamed from: g */
    private static ConfigManager f1155g = new ConfigManager();

    /* renamed from: h */
    private static C1171a f1156h = new C1171a();

    /* renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f1157i;

    /* renamed from: j */
    private static C1392t f1158j = null;

    /* renamed from: k */
    private static volatile String f1159k = null;

    /* renamed from: l */
    private static Object f1160l = new Object();

    /* renamed from: m */
    private static volatile int f1161m = 0;

    /* renamed from: n */
    private static volatile String f1162n;

    /* renamed from: o */
    private static int f1163o = 0;

    /* renamed from: a */
    public static C1363d m1542a() {
        if (f1154f == null) {
            f1154f = C1371i.m2200a(f1149a);
        }
        return f1154f;
    }

    /* renamed from: a */
    public static String m1543a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m1557f());
        sb.append('_');
        String str = "normal_";
        sb.append(z ? "oom_" : str);
        sb.append(m1561j());
        sb.append('_');
        if (z2) {
            str = "ignore_";
        }
        sb.append(str);
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m1544a(int i) {
        f1163o = i;
    }

    /* renamed from: a */
    static void m1545a(int i, String str) {
        if (f1157i == null) {
            synchronized (C1240h.class) {
                if (f1157i == null) {
                    f1157i = new ConcurrentHashMap<>();
                }
            }
        }
        f1157i.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m1546a(Application application) {
        if (application != null) {
            f1150b = application;
        }
    }

    /* renamed from: a */
    public static void m1547a(Application application, Context context) {
        if (f1150b == null) {
            f1151c = System.currentTimeMillis();
            f1149a = context;
            f1150b = application;
            f1159k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    /* renamed from: a */
    static void m1548a(Application application, Context context, ICommonParams iCommonParams) {
        m1547a(application, context);
        f1154f = new C1363d(f1149a, iCommonParams, m1542a());
    }

    /* renamed from: a */
    public static void m1549a(C1363d dVar) {
        f1154f = dVar;
    }

    /* renamed from: a */
    static void m1550a(String str) {
        f1152d = str;
    }

    /* renamed from: a */
    static void m1551a(boolean z) {
        f1153e = z;
    }

    /* renamed from: b */
    public static C1171a m1552b() {
        return f1156h;
    }

    /* renamed from: b */
    static void m1553b(int i, String str) {
        f1161m = i;
        f1162n = str;
    }

    /* renamed from: c */
    public static C1392t m1554c() {
        if (f1158j == null) {
            synchronized (C1240h.class) {
                f1158j = new C1392t(f1149a);
            }
        }
        return f1158j;
    }

    /* renamed from: d */
    public static boolean m1555d() {
        return m1560i().isDebugMode() && m1565n().contains("local_test");
    }

    /* renamed from: e */
    public static String m1556e() {
        return m1557f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* renamed from: f */
    public static String m1557f() {
        if (f1159k == null) {
            synchronized (f1160l) {
                if (f1159k == null) {
                    f1159k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f1159k;
    }

    /* renamed from: g */
    public static Context m1558g() {
        return f1149a;
    }

    /* renamed from: h */
    public static Application m1559h() {
        return f1150b;
    }

    /* renamed from: i */
    public static ConfigManager m1560i() {
        return f1155g;
    }

    /* renamed from: j */
    public static long m1561j() {
        return f1151c;
    }

    /* renamed from: k */
    public static String m1562k() {
        return f1152d;
    }

    /* renamed from: l */
    public static int m1563l() {
        return f1163o;
    }

    /* renamed from: m */
    public static boolean m1564m() {
        return f1153e;
    }

    /* renamed from: n */
    public static String m1565n() {
        Object obj = m1542a().mo12489a().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    /* renamed from: o */
    public static ConcurrentHashMap<Integer, String> m1566o() {
        return f1157i;
    }

    /* renamed from: p */
    public static int m1567p() {
        return f1161m;
    }

    /* renamed from: q */
    public static String m1568q() {
        return f1162n;
    }
}
