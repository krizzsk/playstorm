package com.apm.insight.p022k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.C1240h;
import com.apm.insight.entity.C1218b;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1364e;
import com.apm.insight.runtime.C1384p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.k.k */
public class C1281k {

    /* renamed from: a */
    private static File f1268a = null;

    /* renamed from: b */
    private static boolean f1269b = false;

    /* renamed from: c */
    private static boolean f1270c = false;

    /* renamed from: d */
    private static String f1271d = "exception_modules";

    /* renamed from: e */
    private static String f1272e = "npth";

    /* renamed from: f */
    private static Map<String, String> f1273f;

    /* renamed from: a */
    public static void m1702a(String str) {
        if (f1273f == null) {
            f1273f = new HashMap();
        }
        f1273f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1703a(boolean r2, org.json.JSONArray r3) {
        /*
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0013 }
            android.content.Context r0 = com.apm.insight.C1240h.m1558g()     // Catch:{ IOException -> 0x0013 }
            java.lang.String r0 = com.apm.insight.p023l.C1308o.m1860j((android.content.Context) r0)     // Catch:{ IOException -> 0x0013 }
            java.lang.String r1 = "apminsight/configCrash/configFile"
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0013 }
            r0 = 0
            com.apm.insight.p023l.C1298i.m1771a((java.io.File) r2, (org.json.JSONArray) r3, (boolean) r0)     // Catch:{ IOException -> 0x0013 }
        L_0x0013:
            java.io.File r2 = m1710f()     // Catch:{ all -> 0x001c }
            java.util.Map<java.lang.String, java.lang.String> r3 = f1273f     // Catch:{ all -> 0x001c }
            com.apm.insight.p023l.C1298i.m1770a((java.io.File) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x001c }
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1281k.m1703a(boolean, org.json.JSONArray):void");
    }

    /* renamed from: a */
    static boolean m1704a() {
        return f1269b;
    }

    /* renamed from: a */
    static boolean m1705a(boolean z) {
        try {
            Map<String, String> e = f1273f == null ? C1298i.m1790e(m1710f()) : f1273f;
            f1273f = e;
            if (e == null) {
                f1273f = new HashMap();
                return true;
            } else if (e.size() < C1218b.m1454c()) {
                return true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z2 = false;
                for (Map.Entry next : f1273f.entrySet()) {
                    if (currentTimeMillis - Long.decode((String) next.getValue()).longValue() > C1364e.m2181e((String) next.getKey())) {
                        z2 = true;
                    }
                }
                C1311q.m1870a((Object) z2 ? "config should be updated" : "config should not be updated");
                return z2;
            }
        } catch (Throwable th) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th);
            return true;
        }
    }

    /* renamed from: b */
    static boolean m1706b() {
        return f1270c;
    }

    /* renamed from: c */
    static void m1707c() {
        if (!f1269b) {
            f1270c = true;
            File file = new File(C1308o.m1860j(C1240h.m1558g()), "apminsight/configCrash/configFile");
            if (file.exists()) {
                try {
                    C1341a.m2039a(new JSONArray(C1298i.m1784c(file)), false);
                    f1269b = true;
                } catch (Throwable unused) {
                    C1341a.m2039a((JSONArray) null, false);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m1708d() {
        m1707c();
        if (m1705a(false)) {
            C1256a.m1607a();
        }
    }

    /* renamed from: e */
    public static void m1709e() {
        C1384p.m2264b().mo12526a((Runnable) new Runnable() {
            public void run() {
                if (C1281k.m1705a(false)) {
                    C1256a.m1607a();
                }
            }
        });
    }

    /* renamed from: f */
    private static File m1710f() {
        if (f1268a == null) {
            f1268a = new File(C1308o.m1860j(C1240h.m1558g()), "apminsight/configCrash/configInvalid");
        }
        return f1268a;
    }
}
