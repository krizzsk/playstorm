package com.apm.insight.p022k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.C1218b;
import com.apm.insight.entity.C1222e;
import com.apm.insight.nativecrash.C1323b;
import com.apm.insight.nativecrash.C1330c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1172a;
import com.apm.insight.p012c.C1206a;
import com.apm.insight.p014e.C1212a;
import com.apm.insight.p018g.C1231a;
import com.apm.insight.p022k.C1265c;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1309p;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1360b;
import com.apm.insight.runtime.C1370h;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1389s;
import com.ogury.p376ed.OguryAdFormatErrorCode;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.b */
public final class C1258b {

    /* renamed from: d */
    private static volatile C1258b f1192d;

    /* renamed from: a */
    List<File> f1193a = new ArrayList();

    /* renamed from: b */
    List<File> f1194b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f1195c;

    /* renamed from: e */
    private int f1196e = -1;

    /* renamed from: f */
    private C1264b f1197f;

    /* renamed from: g */
    private HashMap<String, C1264b> f1198g;

    /* renamed from: h */
    private volatile boolean f1199h = false;

    /* renamed from: i */
    private Runnable f1200i = new Runnable() {
        public void run() {
            C1258b.this.m1635g();
        }
    };

    /* renamed from: j */
    private Runnable f1201j = new Runnable() {
        public void run() {
            C1258b.this.m1633e();
        }
    };

    /* renamed from: com.apm.insight.k.b$a */
    static class C1263a {

        /* renamed from: a */
        File f1211a;

        /* renamed from: b */
        long f1212b = -1;

        /* renamed from: c */
        long f1213c = -1;

        /* renamed from: d */
        CrashType f1214d;

        /* renamed from: e */
        String f1215e;

        C1263a(File file, long j, CrashType crashType) {
            this.f1211a = file;
            this.f1212b = j;
            this.f1214d = crashType;
            this.f1215e = file.getName();
        }

        C1263a(File file, CrashType crashType) {
            this.f1211a = file;
            this.f1214d = crashType;
            this.f1215e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b */
    static class C1264b {

        /* renamed from: a */
        String f1216a;

        /* renamed from: b */
        List<C1263a> f1217b = new ArrayList();

        /* renamed from: c */
        List<C1263a> f1218c = new ArrayList();

        /* renamed from: d */
        C1263a f1219d;

        /* renamed from: e */
        C1263a f1220e;

        /* renamed from: f */
        boolean f1221f = false;

        /* renamed from: g */
        int f1222g = 0;

        C1264b(String str) {
            this.f1216a = str;
        }
    }

    private C1258b(Context context) {
        this.f1195c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r13.put("lastAliveTime", "unknown");
        com.apm.insight.entity.C1217a.m1409a(r13, "filters", "lastAliveTime", "unknown");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0168 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.apm.insight.entity.C1222e m1616a(java.io.File r20, com.apm.insight.CrashType r21, java.lang.String r22, long r23, long r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = r23
            java.lang.String r4 = "data"
            java.lang.String r5 = "unauthentic_version"
            java.lang.String r6 = "unknown"
            java.lang.String r7 = "true"
            java.lang.String r8 = "has_dump"
            java.lang.String r9 = "logcat"
            java.lang.String r10 = "header"
            java.lang.String r11 = "lastAliveTime"
            java.lang.String r12 = "filters"
            boolean r14 = r20.isFile()     // Catch:{ all -> 0x01da }
            if (r14 == 0) goto L_0x0028
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r20)     // Catch:{ all -> 0x0024 }
            r13 = 0
            goto L_0x01e9
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r13 = 0
            goto L_0x01dd
        L_0x0028:
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01da }
            if (r0 != r14) goto L_0x002e
            r14 = 1
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0049
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r20.getName()     // Catch:{ all -> 0x0045 }
            r3 = r20
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0024 }
            com.apm.insight.entity.e r0 = com.apm.insight.p023l.C1298i.m1788d((java.lang.String) r0)     // Catch:{ all -> 0x0024 }
            return r0
        L_0x0045:
            r0 = move-exception
            r3 = r20
            goto L_0x0025
        L_0x0049:
            com.apm.insight.entity.e r15 = com.apm.insight.p023l.C1298i.m1761a((java.io.File) r20, (com.apm.insight.CrashType) r21)     // Catch:{ all -> 0x01da }
            org.json.JSONObject r13 = r15.mo12272b()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r17 = r15.mo12272b()     // Catch:{ all -> 0x01d7 }
            if (r17 == 0) goto L_0x01d2
            r17 = r4
            com.apm.insight.CrashType r4 = com.apm.insight.CrashType.ANR     // Catch:{ all -> 0x01d7 }
            if (r0 != r4) goto L_0x005e
            return r15
        L_0x005e:
            java.lang.String r0 = "crash_time"
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = "app_start_time"
            r18 = r5
            r4 = r25
            r13.put(r0, r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r13.optJSONObject(r10)     // Catch:{ all -> 0x01d7 }
            if (r0 != 0) goto L_0x007d
            android.content.Context r0 = r1.f1195c     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.m1384a(r0, r2)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r0 = r0.mo12241f()     // Catch:{ all -> 0x01d7 }
            goto L_0x0082
        L_0x007d:
            if (r14 == 0) goto L_0x0082
            r13.remove(r10)     // Catch:{ all -> 0x01d7 }
        L_0x0082:
            java.lang.String r4 = "sdk_version_name"
            r5 = 0
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = "sdk_version"
            if (r4 != 0) goto L_0x008f
            java.lang.String r4 = "1.3.8.nourl-alpha.0"
        L_0x008f:
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r4 = r13.optJSONArray(r9)     // Catch:{ all -> 0x01d7 }
            boolean r4 = com.apm.insight.p023l.C1298i.m1779a((org.json.JSONArray) r4)     // Catch:{ all -> 0x01d7 }
            if (r4 == 0) goto L_0x00a3
            org.json.JSONArray r4 = com.apm.insight.runtime.C1374k.m2204b(r22)     // Catch:{ all -> 0x01d7 }
            r13.put(r9, r4)     // Catch:{ all -> 0x01d7 }
        L_0x00a3:
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_logcat"
            boolean r5 = com.apm.insight.p023l.C1301l.m1805a((org.json.JSONObject) r13, (java.lang.String) r9)     // Catch:{ all -> 0x01d7 }
            if (r5 != 0) goto L_0x00b1
            r16 = 1
            goto L_0x00b3
        L_0x00b1:
            r16 = 0
        L_0x00b3:
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "memory_leak"
            boolean r5 = com.apm.insight.entity.C1217a.m1415b((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "fd_leak"
            boolean r5 = com.apm.insight.entity.C1217a.m1416c((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "threads_leak"
            boolean r5 = com.apm.insight.entity.C1217a.m1417d(r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_devices"
            boolean r5 = com.apm.insight.entity.Header.m1386a()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_64_runtime"
            boolean r5 = com.apm.insight.nativecrash.NativeImpl.m1965e()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_x86_devices"
            boolean r5 = com.apm.insight.entity.Header.m1389b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "has_meminfo_file"
            boolean r5 = com.apm.insight.entity.C1217a.m1413a((java.lang.String) r22)     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "is_root"
            boolean r5 = com.apm.insight.nativecrash.C1323b.m1992m()     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "launch_did"
            android.content.Context r5 = r1.f1195c     // Catch:{ all -> 0x01d7 }
            java.lang.String r5 = com.apm.insight.p020i.C1247a.m1589a(r5)     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "crash_uuid"
            java.lang.String r5 = r20.getName()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r5)     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = "jiffy"
            r16 = r10
            long r9 = com.apm.insight.runtime.C1385q.C1386a.m2267a()     // Catch:{ all -> 0x01d7 }
            r13.put(r4, r9)     // Catch:{ all -> 0x01d7 }
            r4 = r22
            java.lang.String r4 = com.apm.insight.runtime.C1360b.m2155a(r2, r4)     // Catch:{ all -> 0x0168 }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0168 }
            long r2 = r4 - r2
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0168 }
            r9 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x015b
            java.lang.String r2 = "< 60s"
            goto L_0x015d
        L_0x015b:
            java.lang.String r2 = "> 60s"
        L_0x015d:
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0168 }
            r13.put(r11, r2)     // Catch:{ all -> 0x0168 }
            goto L_0x016e
        L_0x0168:
            r13.put(r11, r6)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r6)     // Catch:{ all -> 0x01d7 }
        L_0x016e:
            r13.put(r8, r7)     // Catch:{ all -> 0x01d7 }
            java.lang.String r2 = "storage"
            java.lang.Object r2 = r13.opt(r2)     // Catch:{ all -> 0x01d7 }
            if (r2 != 0) goto L_0x0184
            android.content.Context r2 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = com.apm.insight.p023l.C1318w.m1928a((android.content.Context) r2)     // Catch:{ all -> 0x01d7 }
            com.apm.insight.entity.C1217a.m1412a((org.json.JSONObject) r13, (org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
        L_0x0184:
            boolean r2 = com.apm.insight.entity.Header.m1390b((org.json.JSONObject) r0)     // Catch:{ all -> 0x01d7 }
            if (r2 == 0) goto L_0x018f
            r2 = r18
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r13, (java.lang.String) r12, (java.lang.String) r2, (java.lang.String) r2)     // Catch:{ all -> 0x01d7 }
        L_0x018f:
            com.apm.insight.entity.C1221d.m1459b(r13)     // Catch:{ all -> 0x01d7 }
            org.json.JSONObject r2 = r15.mo12272b()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "upload_scene"
            java.lang.String r4 = "launch_scan"
            r2.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            if (r14 == 0) goto L_0x01cb
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x01d7 }
            r2.<init>()     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "event_type"
            java.lang.String r4 = "start_crash"
            r13.put(r3, r4)     // Catch:{ all -> 0x01d7 }
            java.lang.String r3 = "stack"
            r4 = r17
            java.lang.Object r5 = r13.remove(r4)     // Catch:{ all -> 0x01d7 }
            r13.put(r3, r5)     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x01d7 }
            r3.<init>()     // Catch:{ all -> 0x01d7 }
            org.json.JSONArray r3 = r3.put(r13)     // Catch:{ all -> 0x01d7 }
            r2.put(r4, r3)     // Catch:{ all -> 0x01d7 }
            r3 = r16
            r2.put(r3, r0)     // Catch:{ all -> 0x01d7 }
            r15.mo12270a((org.json.JSONObject) r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01cb:
            java.lang.String r0 = "isJava"
            r2 = 1
            r13.put(r0, r2)     // Catch:{ all -> 0x01d7 }
            goto L_0x01d5
        L_0x01d2:
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r20)     // Catch:{ all -> 0x01d7 }
        L_0x01d5:
            r13 = r15
            goto L_0x01e9
        L_0x01d7:
            r0 = move-exception
            r13 = r15
            goto L_0x01dd
        L_0x01da:
            r0 = move-exception
            r5 = 0
            r13 = r5
        L_0x01dd:
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r20)
            com.apm.insight.c r2 = com.apm.insight.C1176b.m1249a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo12218a((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x01e9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1258b.m1616a(java.io.File, com.apm.insight.CrashType, java.lang.String, long, long):com.apm.insight.entity.e");
    }

    /* renamed from: a */
    public static C1258b m1617a() {
        if (f1192d == null) {
            synchronized (C1258b.class) {
                if (f1192d == null) {
                    f1192d = new C1258b(C1240h.m1558g());
                }
            }
        }
        return f1192d;
    }

    /* renamed from: a */
    private JSONObject m1618a(C1323b bVar) {
        JSONObject d = bVar.mo12383d();
        if (d != null && d.length() != 0) {
            return d;
        }
        if (C1240h.m1555d()) {
            bVar.mo12390l();
        }
        if (!bVar.mo12382c()) {
            bVar.mo12389k();
            return null;
        } else if (!bVar.mo12385f()) {
            bVar.mo12389k();
            return null;
        } else if (bVar.mo12386g()) {
            bVar.mo12389k();
            return null;
        } else {
            bVar.mo12384e();
            return bVar.mo12388j();
        }
    }

    /* renamed from: a */
    private void m1619a(C1264b bVar) {
        C1298i.m1777a(C1308o.m1831a(this.f1195c, bVar.f1216a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r1.f1220e == r7) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[SYNTHETIC, Splitter:B:34:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c A[Catch:{ all -> 0x0161 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1620a(com.apm.insight.p022k.C1258b.C1264b r21, boolean r22, com.apm.insight.runtime.C1370h r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r23
            java.lang.String r3 = "crash_thread_name"
            java.lang.String r4 = "NPTH_CATCH"
            java.lang.String r5 = "aid"
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1217b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            com.apm.insight.k.b$a r0 = r1.f1220e
            if (r0 != 0) goto L_0x001b
            com.apm.insight.k.b$a r0 = r1.f1219d
            r1.f1220e = r0
        L_0x001b:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1217b
            java.util.Iterator r6 = r0.iterator()
        L_0x0021:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r6.next()
            r7 = r0
            com.apm.insight.k.b$a r7 = (com.apm.insight.p022k.C1258b.C1263a) r7
            java.io.File r14 = r7.f1211a     // Catch:{ all -> 0x0168 }
            com.apm.insight.CrashType r15 = r7.f1214d     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = r1.f1216a     // Catch:{ all -> 0x0168 }
            long r12 = r7.f1212b     // Catch:{ all -> 0x0168 }
            long r9 = r7.f1213c     // Catch:{ all -> 0x0168 }
            r8 = r20
            r16 = r9
            r9 = r14
            r10 = r15
            r19 = r6
            r18 = r14
            r6 = r15
            r14 = r16
            com.apm.insight.entity.e r8 = r8.m1616a(r9, r10, r11, r12, r14)     // Catch:{ all -> 0x0166 }
            if (r8 != 0) goto L_0x0050
        L_0x004b:
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r18)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0050:
            org.json.JSONObject r9 = r8.mo12272b()     // Catch:{ all -> 0x0166 }
            if (r9 != 0) goto L_0x0057
            goto L_0x004b
        L_0x0057:
            java.lang.String r0 = "header"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0060:
            if (r6 != 0) goto L_0x0098
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = r18.getName()     // Catch:{ all -> 0x0166 }
            r12 = r18
            r10.<init>(r12, r11)     // Catch:{ all -> 0x0166 }
            boolean r10 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = r12.getName()     // Catch:{ all -> 0x0166 }
            java.lang.String r11 = "_"
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ all -> 0x0166 }
            int r10 = r10.length     // Catch:{ all -> 0x0166 }
            r11 = 5
            if (r10 >= r11) goto L_0x009a
        L_0x0081:
            java.lang.String r0 = r8.mo12267a()     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.l r0 = com.apm.insight.p022k.C1270e.m1666b(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.mo12351a()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0179
        L_0x0093:
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x0098:
            r12 = r18
        L_0x009a:
            java.io.File r10 = com.apm.insight.entity.C1218b.m1443a((java.io.File) r12)     // Catch:{ all -> 0x0166 }
            boolean r11 = r10.exists()     // Catch:{ all -> 0x0166 }
            if (r11 != 0) goto L_0x00a5
            goto L_0x0093
        L_0x00a5:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ all -> 0x0163 }
            java.lang.String r10 = com.apm.insight.p023l.C1298i.m1784c((java.io.File) r10)     // Catch:{ all -> 0x0163 }
            r11.<init>(r10)     // Catch:{ all -> 0x0163 }
            com.apm.insight.CrashType r10 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x0166 }
            if (r6 != r10) goto L_0x00c0
            java.lang.String r10 = "data"
            java.lang.Object r10 = r9.opt(r10)     // Catch:{ all -> 0x0166 }
            org.json.JSONArray r10 = (org.json.JSONArray) r10     // Catch:{ all -> 0x0166 }
            r13 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r13)     // Catch:{ all -> 0x0166 }
            goto L_0x00c1
        L_0x00c0:
            r10 = r9
        L_0x00c1:
            java.lang.String r13 = "ignore"
            java.lang.String r14 = "filters"
            if (r22 != 0) goto L_0x00cb
            com.apm.insight.k.b$a r15 = r1.f1220e     // Catch:{ all -> 0x0166 }
            if (r15 != r7) goto L_0x00d3
        L_0x00cb:
            java.lang.String r15 = r7.f1215e     // Catch:{ all -> 0x0166 }
            boolean r15 = r15.contains(r13)     // Catch:{ all -> 0x0166 }
            if (r15 == 0) goto L_0x0106
        L_0x00d3:
            java.lang.Object r15 = r0.opt(r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x00fb }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r5, (java.lang.String) r15)     // Catch:{ all -> 0x00fb }
            java.lang.String r15 = "has_ignore"
            r16 = r6
            java.lang.String r6 = r7.f1215e     // Catch:{ all -> 0x00f9 }
            boolean r6 = r6.contains(r13)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r6)     // Catch:{ all -> 0x00f9 }
            r6 = 2010(0x7da, float:2.817E-42)
            r0.put(r5, r6)     // Catch:{ all -> 0x00f9 }
            goto L_0x011e
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            r16 = r6
        L_0x00fe:
            com.apm.insight.c r6 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x0166 }
            r6.mo12218a((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x011e
        L_0x0106:
            r16 = r6
            if (r2 == 0) goto L_0x011e
            java.lang.String r0 = "crash_md5"
            java.lang.String r6 = "default"
            java.lang.String r0 = r10.optString(r0, r6)     // Catch:{ all -> 0x0166 }
            boolean r0 = r2.mo12504a((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x011e
            java.io.File r0 = r7.f1211a     // Catch:{ all -> 0x0166 }
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0179
        L_0x011e:
            java.lang.String r0 = "start_uuid"
            java.lang.String r6 = r1.f1216a     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "leak_threads_count"
            int r6 = r1.f1222g     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "unknown"
            java.lang.String r0 = r10.optString(r3, r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.entity.C1217a.m1409a((org.json.JSONObject) r10, (java.lang.String) r14, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            com.apm.insight.p023l.C1312r.m1881a((org.json.JSONObject) r9)     // Catch:{ all -> 0x0166 }
            com.apm.insight.k.b$3 r0 = new com.apm.insight.k.b$3     // Catch:{ all -> 0x0166 }
            r6 = r20
            r0.<init>(r8, r12, r1)     // Catch:{ all -> 0x0161 }
            com.apm.insight.entity.C1218b.m1451a((org.json.JSONObject) r9, (org.json.JSONArray) r11, (com.apm.insight.entity.C1218b.C1219a) r0)     // Catch:{ all -> 0x0161 }
            boolean r0 = com.apm.insight.p023l.C1298i.m1777a((java.io.File) r12)     // Catch:{ all -> 0x0161 }
            if (r0 != 0) goto L_0x015b
            com.apm.insight.e.a r0 = com.apm.insight.p014e.C1212a.m1367a()     // Catch:{ all -> 0x0161 }
            java.lang.String r8 = r12.getAbsolutePath()     // Catch:{ all -> 0x0161 }
            com.apm.insight.e.a.a r8 = com.apm.insight.p014e.p015a.C1213a.m1372a(r8)     // Catch:{ all -> 0x0161 }
            r0.mo12225a((com.apm.insight.p014e.p015a.C1213a) r8)     // Catch:{ all -> 0x0161 }
        L_0x015b:
            r8 = r16
            com.apm.insight.p022k.C1265c.m1643a((com.apm.insight.CrashType) r8, (org.json.JSONObject) r9)     // Catch:{ all -> 0x0161 }
            goto L_0x0179
        L_0x0161:
            r0 = move-exception
            goto L_0x016d
        L_0x0163:
            r6 = r20
            goto L_0x0179
        L_0x0166:
            r0 = move-exception
            goto L_0x016b
        L_0x0168:
            r0 = move-exception
            r19 = r6
        L_0x016b:
            r6 = r20
        L_0x016d:
            com.apm.insight.c r8 = com.apm.insight.C1176b.m1249a()
            r8.mo12218a((java.lang.String) r4, (java.lang.Throwable) r0)
            java.io.File r0 = r7.f1211a
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r0)
        L_0x0179:
            r6 = r19
            goto L_0x0021
        L_0x017d:
            r6 = r20
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1258b.m1620a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    /* renamed from: a */
    private void m1622a(File file, C1264b bVar) {
    }

    /* renamed from: a */
    private void m1623a(HashMap<String, C1264b> hashMap) {
        File[] listFiles = C1308o.m1849f(this.f1195c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith("G")) {
                        String name = file.getName();
                        C1264b bVar = hashMap.get(name);
                        if (bVar == null) {
                            bVar = new C1264b(name);
                            hashMap.put(name, bVar);
                        }
                        JSONArray a = C1330c.m2020a(C1308o.m1862l(file), C1308o.m1863m(file));
                        bVar.f1222g = a.length();
                        if (bVar.f1222g > 0) {
                            try {
                                C1298i.m1771a(C1308o.m1864n(file), a, false);
                            } catch (Throwable unused) {
                            }
                        }
                        i++;
                    } else {
                        C1298i.m1777a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                    C1298i.m1777a(file);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1624a(HashMap<String, C1264b> hashMap, C1264b bVar) {
        File[] listFiles = C1308o.m1843d(this.f1195c).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (file.isDirectory() && file.getName().endsWith("G")) {
                        String name = file.getName();
                        C1264b bVar2 = hashMap.get(name);
                        if (bVar2 == null) {
                            bVar2 = new C1264b(name);
                            hashMap.put(name, bVar2);
                        }
                        bVar2.f1218c.add(new C1263a(file, CrashType.NATIVE));
                        i++;
                    } else {
                        C1298i.m1777a(file);
                        i++;
                    }
                } catch (Throwable th) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                    C1298i.m1777a(file);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r4.equals("launch") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1625a(java.util.HashMap<java.lang.String, com.apm.insight.p022k.C1258b.C1264b> r17, com.apm.insight.p022k.C1258b.C1264b r18, java.io.File r19, java.lang.String r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "G"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "_"
            java.lang.String[] r4 = r3.split(r4)
            int r5 = r4.length
            r6 = 5
            r7 = 0
            if (r5 >= r6) goto L_0x0026
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1217b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            return
        L_0x0026:
            r5 = 0
            r6 = r4[r5]     // Catch:{ all -> 0x00b7 }
            long r8 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r6 = 4
            r6 = r4[r6]     // Catch:{ all -> 0x00b7 }
            long r10 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x00b7 }
            r1 = 2
            r6 = r4[r1]
            r12 = 1
            r4 = r4[r12]
            r13 = -1
            int r14 = r4.hashCode()
            r15 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r14 == r15) goto L_0x0063
            r5 = 96741(0x179e5, float:1.35563E-40)
            if (r14 == r5) goto L_0x0059
            r5 = 3254818(0x31aa22, float:4.560971E-39)
            if (r14 == r5) goto L_0x004f
            goto L_0x006c
        L_0x004f:
            java.lang.String r5 = "java"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = r12
            goto L_0x006d
        L_0x0059:
            java.lang.String r5 = "anr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006c
            r5 = r1
            goto L_0x006d
        L_0x0063:
            java.lang.String r14 = "launch"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r5 = r13
        L_0x006d:
            if (r5 == 0) goto L_0x007a
            if (r5 == r12) goto L_0x0077
            if (r5 == r1) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.ANR
            goto L_0x007c
        L_0x0077:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.JAVA
            goto L_0x007c
        L_0x007a:
            com.apm.insight.CrashType r7 = com.apm.insight.CrashType.LAUNCH
        L_0x007c:
            java.lang.Object r1 = r0.get(r6)
            com.apm.insight.k.b$b r1 = (com.apm.insight.p022k.C1258b.C1264b) r1
            if (r1 != 0) goto L_0x008c
            com.apm.insight.k.b$b r1 = new com.apm.insight.k.b$b
            r1.<init>(r6)
            r0.put(r6, r1)
        L_0x008c:
            com.apm.insight.k.b$a r0 = new com.apm.insight.k.b$a
            r0.<init>(r2, r8, r7)
            r0.f1213c = r10
            com.apm.insight.k.b$a r2 = r1.f1219d
            if (r2 == 0) goto L_0x00a1
            com.apm.insight.k.b$a r2 = r1.f1219d
            long r4 = r2.f1212b
            long r8 = r0.f1212b
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
        L_0x00a1:
            if (r7 == 0) goto L_0x00b1
            com.apm.insight.CrashType r2 = com.apm.insight.CrashType.ANR
            if (r7 == r2) goto L_0x00b1
            java.lang.String r2 = "ignore"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x00b1
            r1.f1219d = r0
        L_0x00b1:
            java.util.List<com.apm.insight.k.b$a> r1 = r1.f1217b
            r1.add(r0)
            goto L_0x00e4
        L_0x00b7:
            java.util.List<com.apm.insight.k.b$a> r0 = r1.f1217b
            com.apm.insight.k.b$a r1 = new com.apm.insight.k.b$a
            r1.<init>(r2, r7)
            r0.add(r1)
            com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "err format crashTime:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.String r2 = "NPTH_CATCH"
            r0.mo12218a((java.lang.String) r2, (java.lang.Throwable) r1)
            return
        L_0x00e1:
            com.apm.insight.p023l.C1298i.m1777a((java.io.File) r19)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1258b.m1625a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private boolean m1626a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1627b(C1264b bVar, boolean z, C1370h hVar) {
        boolean z2;
        final C1264b bVar2 = bVar;
        C1370h hVar2 = hVar;
        if (bVar2.f1218c.size() <= 1 && bVar2.f1218c.isEmpty()) {
            bVar2.f1220e = bVar2.f1219d;
            return;
        }
        boolean b = C1309p.m1868b(this.f1195c);
        bVar2.f1220e = bVar2.f1219d;
        C1323b bVar3 = new C1323b(this.f1195c);
        for (C1263a next : bVar2.f1218c) {
            final File file = next.f1211a;
            try {
                bVar3.mo12380a(file);
                JSONObject a = m1618a(bVar3);
                if (a != null) {
                    if (a.length() != 0) {
                        if (a.length() != 0) {
                            if (!z) {
                                long optLong = a.optLong("crash_time");
                                try {
                                    if (bVar2.f1220e == null) {
                                        bVar2.f1220e = next;
                                        bVar2.f1221f = true;
                                        if (hVar2 != null) {
                                            if (!hVar2.mo12504a("default")) {
                                                bVar3.mo12389k();
                                            }
                                        }
                                        z2 = b;
                                    } else {
                                        if (!bVar2.f1221f) {
                                            z2 = b;
                                            try {
                                                if (optLong < bVar2.f1220e.f1212b) {
                                                    bVar2.f1220e = next;
                                                    if (hVar2 == null || hVar2.mo12504a("default")) {
                                                        if (!m1626a(file)) {
                                                            m1622a(file, bVar2);
                                                        }
                                                        bVar2.f1221f = true;
                                                    } else {
                                                        bVar3.mo12389k();
                                                        b = z2;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                                                C1298i.m1777a(file);
                                                b = z2;
                                            }
                                        } else {
                                            z2 = b;
                                        }
                                        C1217a.m1409a(a, "filters", "aid", String.valueOf(a.optJSONObject("header").opt("aid")));
                                        a.optJSONObject("header").put("aid", OguryAdFormatErrorCode.SHOW_FAILED);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = b;
                                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                                    C1298i.m1777a(file);
                                    b = z2;
                                }
                            } else {
                                z2 = b;
                                if (hVar2 != null && !hVar2.mo12504a("default")) {
                                    bVar3.mo12389k();
                                }
                            }
                            C1217a.m1409a(a, "filters", "start_uuid", bVar2.f1216a);
                            C1217a.m1409a(a, "filters", "crash_thread_name", a.optString("crash_thread_name", "unknown"));
                            if (z2) {
                                C1265c.C1267a aVar = new C1265c.C1267a(a, CrashType.NATIVE);
                                C1218b.m1451a(a, C1218b.m1448a(aVar.mo12329c(), aVar.mo12327a(), C1389s.m2276a().mo12517b(aVar.mo12328b() == -1 ? System.currentTimeMillis() : aVar.mo12328b())), (C1218b.C1219a) new C1218b.C1219a() {
                                    /* renamed from: a */
                                    public void mo12188a(JSONObject jSONObject) {
                                        C1268d.m1648a().mo12333a(jSONObject, file, C1308o.m1831a(C1258b.this.f1195c, bVar2.f1216a));
                                    }
                                });
                                if (!bVar3.mo12389k()) {
                                    bVar3.mo12387h();
                                }
                            }
                            C1265c.m1643a(CrashType.NATIVE, a);
                        } else {
                            z2 = b;
                        }
                        b = z2;
                    }
                }
                z2 = b;
                bVar3.mo12389k();
            } catch (Throwable th3) {
                th = th3;
                z2 = b;
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                C1298i.m1777a(file);
                b = z2;
            }
            b = z2;
        }
    }

    /* renamed from: b */
    private void m1629b(HashMap<String, C1264b> hashMap, C1264b bVar) {
        File[] listFiles = C1308o.m1830a(this.f1195c).listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            for (File file : listFiles) {
                try {
                    if (!C1212a.m1367a().mo12226a(file.getAbsolutePath())) {
                        if (!C1298i.m1792g(file)) {
                            if (!C1231a.m1508a().mo12298b(file.getName())) {
                                if (!file.isFile()) {
                                    m1625a(hashMap, bVar, file, file.getName());
                                }
                            }
                        }
                    }
                    C1298i.m1777a(file);
                } catch (Throwable th) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: c */
    private void m1631c(HashMap<String, C1264b> hashMap, C1264b bVar) {
        C1298i.m1777a(C1308o.m1835b(this.f1195c));
    }

    /* renamed from: d */
    private void m1632d() {
        if (this.f1197f == null) {
            this.f1197f = new C1264b("old_uuid");
            HashMap<String, C1264b> hashMap = new HashMap<>();
            this.f1198g = hashMap;
            m1623a(hashMap);
            m1629b(this.f1198g, this.f1197f);
            m1631c(this.f1198g, this.f1197f);
            m1624a(this.f1198g, this.f1197f);
            m1627b(this.f1197f, true, (C1370h) null);
            m1620a(this.f1197f, true, (C1370h) null);
            this.f1197f = null;
            if (this.f1198g.isEmpty()) {
                m1634f();
            } else {
                m1635g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1633e() {
        if (!this.f1199h && this.f1198g != null) {
            if (!C1309p.m1868b(this.f1195c)) {
                m1634f();
            }
            boolean h = m1636h();
            C1370h hVar = new C1370h(this.f1195c);
            for (C1264b b : this.f1198g.values()) {
                m1627b(b, h, hVar);
            }
            for (C1264b a : this.f1198g.values()) {
                m1620a(a, h, hVar);
            }
            for (C1264b a2 : this.f1198g.values()) {
                m1619a(a2);
            }
            hVar.mo12503a();
            C1360b.m2156a();
            m1634f();
        }
    }

    /* renamed from: f */
    private void m1634f() {
        this.f1199h = true;
        this.f1198g = null;
        NativeImpl.m1972i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m1635g() {
        if (!this.f1199h) {
            if (!C1309p.m1868b(this.f1195c) || (System.currentTimeMillis() - C1240h.m1561j() <= 5000 && C1240h.m1560i().isApmExists() && !Npth.hasCrash())) {
                C1384p.m2264b().mo12527a(this.f1200i, 5000);
            } else {
                m1633e();
            }
        }
    }

    /* renamed from: h */
    private boolean m1636h() {
        if (this.f1196e == -1) {
            if (C1341a.m2043b() && C1341a.m2050g()) {
                this.f1196e = 1;
            } else {
                this.f1196e = 0;
            }
        }
        return this.f1196e == 1;
    }

    /* renamed from: i */
    private void m1637i() {
        File[] listFiles = C1308o.m1857i(this.f1195c).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                if (file.getName().endsWith(".atmp")) {
                    C1172a.m1244a().mo12176a(file.getAbsolutePath());
                } else {
                    try {
                        C1222e e = C1298i.m1789e(file.getAbsolutePath());
                        if (e != null) {
                            if (e.mo12272b() != null) {
                                e.mo12272b().put("upload_scene", "launch_scan");
                            }
                            if (C1270e.m1662a(C1270e.m1674d(), e.mo12278e(), e.mo12276d(), e.mo12280f(), e.mo12281g())) {
                                C1298i.m1777a(file);
                                C1298i.m1778a(e.mo12274c());
                            }
                        } else {
                            C1298i.m1777a(file);
                        }
                    } catch (Throwable th) {
                        C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo12321a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            m1632d();
            m1637i();
            C1206a.m1358a();
        }
    }

    /* renamed from: b */
    public void mo12322b() {
        try {
            if (this.f1199h) {
                return;
            }
            if (C1285a.m1724b(C1240h.m1558g())) {
                C1384p.m2264b().mo12526a(this.f1201j);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public boolean mo12323c() {
        return this.f1199h;
    }
}
