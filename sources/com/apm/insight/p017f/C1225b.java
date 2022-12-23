package com.apm.insight.p017f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.C1218b;
import com.apm.insight.entity.C1220c;
import com.apm.insight.p022k.C1274g;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.p024a.C1352f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.f.b */
public final class C1225b {
    /* renamed from: a */
    private static String m1479a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C1316v.m1907a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m1481a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        try {
            final Object obj2 = obj;
            final Throwable th2 = th;
            final String str4 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str5 = str2;
            final String str6 = str3;
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    C1225b.m1491c(obj2, th2, str4, z2, map2, str5, str6);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1482a(Throwable th, String str, boolean z) {
        m1483a(th, str, z, "core_exception_monitor");
    }

    /* renamed from: a */
    public static void m1483a(Throwable th, String str, boolean z, String str2) {
        m1484a(th, str, z, (Map<String, String>) null, str2);
    }

    /* renamed from: a */
    public static void m1484a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            final Throwable th2 = th;
            final String str3 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str4 = str2;
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    C1225b.m1488b((Object) null, th2, str3, z2, (Map<String, String>) map2, str4);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m1485a(Map<String, String> map, C1220c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject.put(next, map.get(next));
                }
                cVar.mo12251a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1487a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        try {
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final int i2 = i;
            final String str3 = str;
            final String str4 = str2;
            final Map<String, String> map2 = map;
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    C1225b.m1490b(stackTraceElementArr2, i2, str3, str4, "core_exception_monitor", (Map<String, String>) map2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1488b(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        m1491c(obj, th, str, z, map, "EnsureNotReachHere", str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1490b(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String a = m1479a(stackTraceElementArr, i);
                        if (!TextUtils.isEmpty(a)) {
                            C1220c a2 = C1220c.m1456a(stackTraceElement, a, str, Thread.currentThread().getName(), true, str2, str3);
                            m1485a(map, a2);
                            C1352f.m2138a().mo12477a(CrashType.ENSURE, (C1217a) a2);
                            C1274g.m1682a(a2);
                            C1311q.m1876b((Object) "[report] " + str);
                        }
                    }
                }
            } catch (Throwable th) {
                C1311q.m1877b(th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m1491c(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        if (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                StackTraceElement stackTraceElement = stackTrace[0];
                if (stackTraceElement != null) {
                    String a = C1316v.m1903a(th);
                    if (!TextUtils.isEmpty(a)) {
                        C1220c a2 = C1220c.m1456a(stackTraceElement, a, str, Thread.currentThread().getName(), z, str2, str3);
                        if (obj != null) {
                            a2.mo12251a("exception_line_num", (Object) C1218b.m1446a(obj, th, stackTrace));
                        }
                        m1485a(map, a2);
                        C1352f.m2138a().mo12477a(CrashType.ENSURE, (C1217a) a2);
                        C1274g.m1683a(obj, a2);
                        C1311q.m1876b((Object) "[reportException] " + str);
                    }
                }
            } catch (Throwable th2) {
                C1311q.m1877b(th2);
            }
        }
    }
}
