package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1208d;
import com.apm.insight.C1211e;
import com.apm.insight.C1223f;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1172a;
import com.apm.insight.p010a.C1174b;
import com.apm.insight.p010a.C1175c;
import com.apm.insight.p011b.C1181c;
import com.apm.insight.p011b.C1183d;
import com.apm.insight.p011b.C1187g;
import com.apm.insight.p013d.C1209a;
import com.apm.insight.p018g.C1231a;
import com.apm.insight.p018g.C1236c;
import com.apm.insight.p018g.C1237d;
import com.apm.insight.p020i.C1248b;
import com.apm.insight.p022k.C1270e;
import com.apm.insight.p022k.C1278h;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1311q;
import java.io.File;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.o */
public class C1379o {

    /* renamed from: a */
    private static boolean f1448a = false;

    /* renamed from: b */
    private static boolean f1449b = false;

    /* renamed from: c */
    private static boolean f1450c = false;

    /* renamed from: d */
    private static boolean f1451d = false;

    /* renamed from: e */
    private static boolean f1452e = false;

    /* renamed from: f */
    private static C1361c f1453f = new C1361c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile boolean f1454g = false;

    /* renamed from: h */
    private static boolean f1455h = false;

    /* renamed from: a */
    public static C1361c m2222a() {
        return f1453f;
    }

    /* renamed from: a */
    public static void m2223a(long j) {
        NativeImpl.m1948a(j);
    }

    /* renamed from: a */
    public static synchronized void m2224a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (C1379o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f1448a) {
                f1448a = true;
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                }
                C1240h.m1547a(application, context);
                if (z || z2) {
                    C1231a a = C1231a.m1508a();
                    if (z2) {
                        a.mo12294a((C1236c) new C1248b(context));
                    }
                    if (z) {
                        a.mo12297b((C1236c) new C1237d(context));
                    }
                    f1449b = true;
                }
                NativeImpl.m1952a();
                if (z3) {
                    boolean a2 = NativeImpl.m1953a(context);
                    f1451d = a2;
                    if (!a2) {
                        f1452e = true;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    f1454g = true;
                    NativeImpl.m1971h();
                }
                m2246c(z4);
                C1311q.m1870a((Object) "Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m2225a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        synchronized (C1379o.class) {
            if (C1240h.m1559h() != null) {
                application = C1240h.m1559h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context = application.getBaseContext();
                    }
                } finally {
                    str = "初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).";
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
                }
            }
            m2224a(application, context, z, z2, z3, z4, j);
        }
    }

    /* renamed from: a */
    public static void m2226a(ICrashCallback iCrashCallback, CrashType crashType) {
        m2222a().mo12481a(iCrashCallback, crashType);
    }

    /* renamed from: a */
    public static void m2227a(IOOMCallback iOOMCallback) {
        m2222a().mo12482a(iOOMCallback);
    }

    /* renamed from: a */
    public static void m2228a(IOOMCallback iOOMCallback, CrashType crashType) {
        m2222a().mo12485b(iOOMCallback);
    }

    /* renamed from: a */
    public static void m2229a(C1208d dVar) {
        C1240h.m1560i().setEncryptImpl(dVar);
    }

    /* renamed from: a */
    public static void m2230a(C1278h hVar) {
        C1270e.m1660a(hVar);
    }

    /* renamed from: a */
    public static void m2231a(C1373j jVar) {
        C1374k.m2203a(jVar);
    }

    /* renamed from: a */
    public static void m2232a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C1209a.m1363a(str);
        }
    }

    /* renamed from: a */
    public static void m2233a(String str, C1174b bVar, C1175c cVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            C1172a.m1244a().mo12177a(str, bVar, cVar);
        }
    }

    /* renamed from: a */
    public static void m2234a(final String str, final C1211e eVar) {
        C1384p.m2264b().mo12526a((Runnable) new Runnable() {
            public void run() {
                if (C1285a.m1724b(C1240h.m1558g())) {
                    C1183d.m1290a(str, eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m2235a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1223f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C1209a.m1364a(str, map, map2, fVar);
        }
    }

    /* renamed from: a */
    public static void m2236a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C1223f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C1209a.m1365a(str, map, map2, map3, fVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m2237a(Throwable th) {
        if (C1240h.m1560i().isReportErrorEnable()) {
            C1231a.m1512a(th);
        }
    }

    /* renamed from: b */
    public static void m2239b(long j) {
        NativeImpl.m1956b(j);
    }

    /* renamed from: b */
    public static void m2240b(ICrashCallback iCrashCallback, CrashType crashType) {
        m2222a().mo12484b(iCrashCallback, crashType);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2241b(String str) {
        if (C1240h.m1560i().isReportErrorEnable()) {
            C1231a.m1517c(str);
        }
    }

    /* renamed from: b */
    public static boolean m2243b() {
        return f1449b;
    }

    /* renamed from: c */
    public static void m2244c(long j) {
        NativeImpl.m1961c(j);
    }

    /* renamed from: c */
    public static void m2245c(String str) {
        NativeImpl.m1957b(str);
    }

    /* renamed from: c */
    private static void m2246c(final boolean z) {
        C1384p.m2264b().mo12527a((Runnable) new Runnable() {
            public void run() {
                if (!C1379o.f1454g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            boolean unused = C1379o.f1454g = true;
                            NativeImpl.m1971h();
                        }
                    });
                }
                C1379o.m2248d(z);
            }
        }, 0);
    }

    /* renamed from: c */
    public static boolean m2247c() {
        return f1450c;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2248d(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.C1240h.m1558g()
            com.apm.insight.runtime.p024a.C1352f.m2138a()
            com.apm.insight.runtime.C1377m.m2212a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.C1250j.m1599a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.m1954b()
            com.apm.insight.C1250j.m1598a()
            com.apm.insight.nativecrash.NativeImpl.m1960c()
            boolean r2 = f1452e
            if (r2 == 0) goto L_0x0027
            com.apm.insight.c r1 = com.apm.insight.C1176b.m1249a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L_0x0023:
            r1.mo12216a((java.lang.String) r2)
            goto L_0x0030
        L_0x0027:
            if (r1 >= 0) goto L_0x0030
            com.apm.insight.c r1 = com.apm.insight.C1176b.m1249a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L_0x0023
        L_0x0030:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.C1250j.m1599a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.p014e.C1212a.m1367a()
            r1.mo12224a((android.content.Context) r0)
            com.apm.insight.C1250j.m1598a()
            com.apm.insight.C1176b.m1249a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.C1250j.m1599a(r1)
            com.apm.insight.p022k.C1279i.m1694a(r0)
            com.apm.insight.C1250j.m1598a()
            if (r3 == 0) goto L_0x0060
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.C1250j.m1599a(r1)
            com.apm.insight.b.g r1 = com.apm.insight.p011b.C1187g.m1299a(r0)
            r1.mo12197c()
            com.apm.insight.C1250j.m1598a()
            f1450c = r3
        L_0x0060:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.C1250j.m1599a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.p022k.C1274g.m1680a()
            r3.mo12338b()
            com.apm.insight.C1250j.m1598a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.C1250j.m1599a(r3)
            com.apm.insight.C1250j.m1598a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.C1250j.m1599a(r3)
            com.apm.insight.C1250j.m1598a()
            com.apm.insight.nativecrash.NativeImpl.m1966f()
            com.apm.insight.C1246i.m1588a()
            java.lang.String r3 = "fastbot"
            java.io.File r3 = r0.getExternalFilesDir(r3)     // Catch:{ all -> 0x00a9 }
            android.content.Context r0 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x00a9 }
            boolean r0 = com.apm.insight.p023l.C1285a.m1724b(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.exists()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.runtime.o$3 r0 = new com.apm.insight.runtime.o$3     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.p011b.C1183d.m1290a((java.lang.String) r3, (com.apm.insight.C1211e) r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            com.apm.insight.p022k.C1281k.m1708d()
            com.apm.insight.nativecrash.NativeImpl.m1974j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.C1387r.m2274a((java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C1379o.m2248d(boolean):void");
    }

    /* renamed from: d */
    public static boolean m2249d() {
        return f1451d;
    }

    /* renamed from: e */
    public static boolean m2250e() {
        return f1448a;
    }

    /* renamed from: f */
    public static void m2251f() {
        if (f1448a && !f1449b) {
            Context g = C1240h.m1558g();
            C1231a a = C1231a.m1508a();
            a.mo12294a((C1236c) new C1248b(g));
            a.mo12297b((C1236c) new C1237d(g));
        }
    }

    /* renamed from: g */
    public static void m2252g() {
        if (f1448a) {
            C1187g.m1299a(C1240h.m1558g()).mo12197c();
            f1450c = true;
        }
    }

    /* renamed from: h */
    public static boolean m2253h() {
        if (f1448a && !f1451d) {
            boolean a = NativeImpl.m1953a(C1240h.m1558g());
            f1451d = a;
            if (!a) {
                f1452e = true;
            }
        }
        return f1451d;
    }

    /* renamed from: i */
    public static boolean m2254i() {
        return C1181c.m1283c();
    }

    /* renamed from: j */
    public static void m2255j() {
        if (f1448a) {
            C1187g.m1299a(C1240h.m1558g()).mo12198d();
            f1450c = false;
        }
    }

    /* renamed from: k */
    public static boolean m2256k() {
        return C1231a.m1515b() || NativeImpl.m1963d();
    }

    /* renamed from: l */
    public static boolean m2257l() {
        return C1231a.m1519c() || NativeImpl.m1963d();
    }

    /* renamed from: m */
    public static boolean m2258m() {
        return C1231a.m1515b();
    }

    /* renamed from: n */
    public static boolean m2259n() {
        return f1455h;
    }

    /* renamed from: o */
    public static void m2260o() {
        f1455h = true;
    }
}
