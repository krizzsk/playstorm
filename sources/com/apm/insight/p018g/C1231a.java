package com.apm.insight.p018g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.entity.C1217a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p022k.C1268d;
import com.apm.insight.p022k.C1279i;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1293e;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1300k;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.p023l.C1312r;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1379o;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.p024a.C1352f;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.g.a */
public class C1231a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static C1231a f1123a = null;

    /* renamed from: i */
    private static volatile boolean f1124i = false;

    /* renamed from: j */
    private static volatile ThreadLocal<Boolean> f1125j = new ThreadLocal<>();

    /* renamed from: k */
    private static ArrayList<C1235b> f1126k = new ArrayList<>();

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f1127b;

    /* renamed from: c */
    private C1236c f1128c;

    /* renamed from: d */
    private C1236c f1129d;

    /* renamed from: e */
    private volatile int f1130e = 0;

    /* renamed from: f */
    private volatile int f1131f = 0;

    /* renamed from: g */
    private ConcurrentHashMap<String, Object> f1132g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private ConcurrentHashMap<String, Object> f1133h = new ConcurrentHashMap<>();

    private C1231a() {
        m1520d();
    }

    /* renamed from: a */
    private static int m1507a(Throwable th, Thread thread) {
        int i = 0;
        int i2 = 0;
        while (i < f1126k.size()) {
            try {
                try {
                    i2 |= f1126k.get(i).mo12303a(th, thread);
                } catch (Throwable th2) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th2);
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C1231a m1508a() {
        if (f1123a == null) {
            f1123a = new C1231a();
        }
        return f1123a;
    }

    /* renamed from: a */
    private String m1509a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f1133h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m1958c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z2) {
            int h = NativeImpl.m1970h(absolutePath);
            if (h > 0) {
                try {
                    NativeImpl.m1947a(h, C1285a.m1725c(C1240h.m1558g()));
                    NativeImpl.m1947a(h, "\n");
                    NativeImpl.m1947a(h, th.getMessage());
                    NativeImpl.m1947a(h, "\n");
                    NativeImpl.m1947a(h, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m1947a(h, ": ");
                        NativeImpl.m1947a(h, th.getMessage());
                    }
                    NativeImpl.m1947a(h, "\n");
                    NativeImpl.m1947a(h, thread.getName());
                    NativeImpl.m1947a(h, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m1947a(h, "stack:");
                    NativeImpl.m1947a(h, "\n");
                } catch (Throwable unused3) {
                }
                C1316v.m1912a(th, h);
                NativeImpl.m1955b(h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    if (!C1312r.m1882a(32768)) {
                        fileOutputStream.write((C1285a.m1725c(C1240h.m1558g()) + "\n").getBytes());
                        fileOutputStream.write((th.getMessage() + "\n").getBytes());
                        fileOutputStream.write((th + "\n").getBytes());
                        fileOutputStream.write((thread.getName() + "\n").getBytes());
                        try {
                            fileOutputStream.write("stack:\n".getBytes());
                        } catch (Throwable unused4) {
                        }
                        try {
                            if (!C1312r.m1882a(8192)) {
                                str2 = C1316v.m1904a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C1293e.C1294a() {

                                    /* renamed from: a */
                                    boolean f1134a = false;

                                    /* renamed from: a */
                                    public boolean mo12300a(String str) {
                                        if (!this.f1134a && str.contains("android.os.Looper.loop")) {
                                            this.f1134a = true;
                                        }
                                        return !this.f1134a;
                                    }
                                } : new C1293e.C1294a());
                                C1300k.m1795a((Closeable) fileOutputStream);
                                C1300k.m1795a((Closeable) fileOutputStream);
                            } else {
                                throw new RuntimeException("test exception npth write stack");
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.write("err:\n".getBytes());
                                fileOutputStream.write((th + "\n").getBytes());
                                fileOutputStream.write((th2 + "\n").getBytes());
                            } catch (Throwable unused5) {
                            }
                        }
                    } else {
                        throw new RuntimeException("test exception before write stack");
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
            }
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fb A[Catch:{ all -> 0x0226, all -> 0x023f }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC, Splitter:B:29:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094 A[ADDED_TO_REGION, Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a A[SYNTHETIC, Splitter:B:76:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable m1510a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            r22 = this;
            r8 = r22
            r15 = r23
            r14 = r24
            int r0 = r8.f1130e
            r18 = 0
            r1 = 3
            if (r0 < r1) goto L_0x0016
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = com.apm.insight.p023l.C1312r.m1882a((int) r0)
            if (r0 != 0) goto L_0x0016
            return r18
        L_0x0016:
            int r0 = r8.f1130e
            r13 = 1
            int r0 = r0 + r13
            r8.f1130e = r0
            int r0 = r8.f1131f
            int r0 = r0 + r13
            r8.f1131f = r0
            boolean r0 = f1124i
            if (r0 == 0) goto L_0x002e
            java.lang.ThreadLocal<java.lang.Boolean> r0 = f1125j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0.set(r1)
        L_0x002e:
            f1124i = r13
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = m1513a((long) r10)
            r9 = 0
            boolean r0 = com.apm.insight.p023l.C1316v.m1924c((java.lang.Throwable) r24)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            boolean r1 = com.apm.insight.p023l.C1316v.m1925d(r24)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0047
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r9
        L_0x0048:
            r19 = r1
            goto L_0x004e
        L_0x004b:
            r0 = r9
        L_0x004c:
            r19 = r9
        L_0x004e:
            if (r12 == 0) goto L_0x005f
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x0053 }
            goto L_0x0061
        L_0x0053:
            r0 = move-exception
            r20 = r9
            r21 = r20
        L_0x0058:
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
        L_0x005c:
            r7 = r15
            goto L_0x01f5
        L_0x005f:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01eb }
        L_0x0061:
            java.lang.String r7 = com.apm.insight.C1240h.m1543a(r10, r1, r0, r9)     // Catch:{ all -> 0x01eb }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01eb }
            android.content.Context r1 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x01eb }
            java.io.File r1 = com.apm.insight.p023l.C1308o.m1830a((android.content.Context) r1)     // Catch:{ all -> 0x01eb }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x01eb }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01eb }
            java.lang.String r1 = "logEventStack"
            r5.<init>(r6, r1)     // Catch:{ all -> 0x01eb }
            r1 = r22
            r2 = r5
            r3 = r0
            r4 = r24
            r16 = r5
            r5 = r7
            r9 = r6
            r6 = r23
            r20 = r7
            r7 = r19
            java.lang.String r7 = r1.m1509a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01eb }
            int r1 = m1507a((java.lang.Throwable) r14, (java.lang.Thread) r15)     // Catch:{ all -> 0x01eb }
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00a1
            com.apm.insight.runtime.ConfigManager r1 = com.apm.insight.C1240h.m1560i()     // Catch:{ all -> 0x01eb }
            boolean r1 = r1.isCrashIgnored(r7)     // Catch:{ all -> 0x01eb }
            if (r1 == 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r21 = 0
            goto L_0x00a6
        L_0x00a4:
            r21 = r13
        L_0x00a6:
            org.json.JSONArray r1 = com.apm.insight.entity.C1218b.m1449a((java.lang.Throwable) r14, (java.lang.Thread) r15, (java.io.File) r9)     // Catch:{ all -> 0x01e2 }
            if (r1 != 0) goto L_0x00ae
            r1 = r13
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            if (r1 != 0) goto L_0x00b7
            if (r21 == 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r0 = r20
            goto L_0x00db
        L_0x00b7:
            if (r12 == 0) goto L_0x00bc
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01e2 }
            goto L_0x00be
        L_0x00bc:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01e2 }
        L_0x00be:
            java.lang.String r0 = com.apm.insight.C1240h.m1543a(r10, r1, r0, r13)     // Catch:{ all -> 0x01e2 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01e2 }
            android.content.Context r2 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x01e2 }
            java.io.File r2 = com.apm.insight.p023l.C1308o.m1830a((android.content.Context) r2)     // Catch:{ all -> 0x01e2 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01e2 }
            r9.renameTo(r1)     // Catch:{ all -> 0x01e2 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01e2 }
            java.lang.String r3 = "logEventStack"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x01e2 }
            r16 = r2
        L_0x00db:
            com.apm.insight.p023l.C1295f.m1752a()     // Catch:{ all -> 0x01e2 }
            com.apm.insight.k.b r1 = com.apm.insight.p022k.C1258b.m1617a()     // Catch:{ all -> 0x01e2 }
            r1.mo12322b()     // Catch:{ all -> 0x01e2 }
            boolean r20 = r22.m1523g()     // Catch:{ all -> 0x01e2 }
            if (r19 == 0) goto L_0x00f8
            if (r20 == 0) goto L_0x00f8
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r12
            r5 = r10
            r1.m1511a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x01df }
        L_0x00f8:
            boolean r1 = com.apm.insight.p023l.C1312r.m1882a((int) r13)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0103
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f1133h     // Catch:{ all -> 0x01df }
            r1.clear()     // Catch:{ all -> 0x01df }
        L_0x0103:
            if (r12 == 0) goto L_0x0108
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01df }
            goto L_0x010a
        L_0x0108:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01df }
        L_0x010a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r2.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "[uncaughtException] isLaunchCrash="
            r2.append(r3)     // Catch:{ all -> 0x01df }
            r2.append(r12)     // Catch:{ all -> 0x01df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01df }
            com.apm.insight.p023l.C1311q.m1870a((java.lang.Object) r2)     // Catch:{ all -> 0x01df }
            com.apm.insight.a.a r2 = com.apm.insight.p010a.C1172a.m1244a()     // Catch:{ all -> 0x01df }
            r2.mo12175a((com.apm.insight.CrashType) r1, (long) r10, (java.lang.String) r0)     // Catch:{ all -> 0x01df }
            boolean r1 = r22.m1516b((java.lang.Thread) r23, (java.lang.Throwable) r24)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0164
            com.apm.insight.g.c r2 = r8.f1128c     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0164
            if (r12 == 0) goto L_0x0164
            com.apm.insight.g.c r2 = r8.f1128c     // Catch:{ all -> 0x01df }
            boolean r2 = r2.mo12306a(r14)     // Catch:{ all -> 0x01df }
            if (r2 == 0) goto L_0x0164
            com.apm.insight.g.c r9 = r8.f1128c     // Catch:{ all -> 0x01df }
            r5 = r10
            r4 = r12
            r12 = r23
            r2 = r13
            r13 = r24
            r3 = r14
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo12305a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x01a2 }
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a2 }
            goto L_0x019d
        L_0x0164:
            r5 = r10
            r4 = r12
            r2 = r13
            r3 = r14
            if (r1 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1129d     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1129d     // Catch:{ all -> 0x01a9 }
            boolean r9 = r9.mo12306a(r3)     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x01ad
            com.apm.insight.g.c r9 = r8.f1129d     // Catch:{ all -> 0x01a5 }
            r10 = r5
            r12 = r23
            r13 = r24
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.mo12305a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x01a2 }
            r0.append(r7)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a2 }
        L_0x019d:
            com.apm.insight.p023l.C1311q.m1870a((java.lang.Object) r0)     // Catch:{ all -> 0x01a2 }
            r7 = r1
            goto L_0x01ae
        L_0x01a2:
            r0 = move-exception
            r7 = r1
            goto L_0x01ab
        L_0x01a5:
            r0 = move-exception
            r9 = r3
            goto L_0x005c
        L_0x01a9:
            r0 = move-exception
            r7 = r15
        L_0x01ab:
            r9 = r3
            goto L_0x01f5
        L_0x01ad:
            r7 = r15
        L_0x01ae:
            if (r21 != 0) goto L_0x01ca
            if (r19 == 0) goto L_0x01bf
            if (r20 != 0) goto L_0x01bf
            r1 = r22
            r2 = r23
            r9 = r3
            r3 = r24
            r1.m1511a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0211 }
            goto L_0x01c0
        L_0x01bf:
            r9 = r3
        L_0x01c0:
            r22.m1522f()     // Catch:{ all -> 0x0211 }
        L_0x01c3:
            r22.m1521e()     // Catch:{ all -> 0x0211 }
            r22.m1518c(r23, r24)     // Catch:{ all -> 0x0211 }
            goto L_0x0211
        L_0x01ca:
            r9 = r3
            monitor-enter(r22)
            int r0 = r8.f1131f     // Catch:{ all -> 0x01dc }
            int r0 = r0 - r2
            r8.f1131f = r0     // Catch:{ all -> 0x01dc }
            int r0 = r8.f1130e     // Catch:{ all -> 0x01dc }
            int r0 = r0 - r2
            r8.f1130e = r0     // Catch:{ all -> 0x01dc }
            monitor-exit(r22)     // Catch:{ all -> 0x01dc }
            java.lang.Throwable r0 = m1514b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01dc }
            throw r0
        L_0x01df:
            r0 = move-exception
            goto L_0x0058
        L_0x01e2:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
            r7 = r15
            r20 = 0
            goto L_0x01f5
        L_0x01eb:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = r13
            r9 = r14
            r7 = r15
            r20 = 0
            r21 = 0
        L_0x01f5:
            boolean r1 = com.apm.insight.p023l.C1316v.m1924c((java.lang.Throwable) r0)     // Catch:{ all -> 0x0226 }
            if (r1 != 0) goto L_0x01fe
            com.apm.insight.p023l.C1311q.m1875a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0226 }
        L_0x01fe:
            if (r21 != 0) goto L_0x0212
            if (r19 == 0) goto L_0x020d
            if (r20 != 0) goto L_0x020d
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m1511a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0211 }
        L_0x020d:
            r22.m1522f()     // Catch:{ all -> 0x0211 }
            goto L_0x01c3
        L_0x0211:
            return r18
        L_0x0212:
            monitor-enter(r22)
            int r0 = r8.f1131f     // Catch:{ all -> 0x0223 }
            int r0 = r0 - r2
            r8.f1131f = r0     // Catch:{ all -> 0x0223 }
            int r0 = r8.f1130e     // Catch:{ all -> 0x0223 }
            int r0 = r0 - r2
            r8.f1130e = r0     // Catch:{ all -> 0x0223 }
            monitor-exit(r22)     // Catch:{ all -> 0x0223 }
            java.lang.Throwable r0 = m1514b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0223:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0223 }
            throw r0
        L_0x0226:
            r0 = move-exception
            if (r21 != 0) goto L_0x0240
            if (r19 == 0) goto L_0x0236
            if (r20 != 0) goto L_0x0236
            r1 = r22
            r2 = r23
            r3 = r24
            r1.m1511a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x023f }
        L_0x0236:
            r22.m1522f()     // Catch:{ all -> 0x023f }
            r22.m1521e()     // Catch:{ all -> 0x023f }
            r22.m1518c(r23, r24)     // Catch:{ all -> 0x023f }
        L_0x023f:
            throw r0
        L_0x0240:
            monitor-enter(r22)
            int r0 = r8.f1131f     // Catch:{ all -> 0x0251 }
            int r0 = r0 - r2
            r8.f1131f = r0     // Catch:{ all -> 0x0251 }
            int r0 = r8.f1130e     // Catch:{ all -> 0x0251 }
            int r0 = r0 - r2
            r8.f1130e = r0     // Catch:{ all -> 0x0251 }
            monitor-exit(r22)     // Catch:{ all -> 0x0251 }
            java.lang.Throwable r0 = m1514b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0251:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0251 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p018g.C1231a.m1510a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: a */
    private void m1511a(Thread thread, Throwable th, boolean z, long j) {
        List<IOOMCallback> a = C1379o.m2222a().mo12480a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback onCrash : a) {
            try {
                onCrash.onCrash(crashType, th, thread, j);
            } catch (Throwable th2) {
                C1311q.m1877b(th2);
            }
        }
    }

    /* renamed from: a */
    public static void m1512a(final Throwable th) {
        if (th != null) {
            try {
                C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C1217a a = C1217a.m1408a(System.currentTimeMillis(), C1240h.m1558g(), (Thread) null, th);
                            a.mo12251a("userdefine", (Object) 1);
                            C1217a a2 = C1352f.m2138a().mo12477a(CrashType.CUSTOM_JAVA, a);
                            if (a2 != null) {
                                C1268d.m1648a().mo12334b(a2.mo12265h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1513a(long j) {
        return C1239e.m1541a(j);
    }

    /* renamed from: b */
    private static Throwable m1514b(Throwable th, Thread thread) {
        int i = 0;
        while (i < f1126k.size()) {
            try {
                try {
                    f1126k.get(i).mo12304b(th, thread);
                    i++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    /* renamed from: b */
    public static boolean m1515b() {
        return f1124i;
    }

    /* renamed from: b */
    private boolean m1516b(Thread thread, Throwable th) {
        ICrashFilter b = C1240h.m1552b().mo12171b();
        if (b == null) {
            return true;
        }
        try {
            return b.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static void m1517c(final String str) {
        if (str != null) {
            try {
                C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            C1217a aVar = new C1217a();
                            aVar.mo12251a("data", (Object) str);
                            aVar.mo12251a("userdefine", (Object) 1);
                            C1217a a = C1352f.m2138a().mo12477a(CrashType.CUSTOM_JAVA, aVar);
                            if (a != null) {
                                C1268d.m1648a().mo12334b(a.mo12265h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private void m1518c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1127b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !C1312r.m1882a(512)) {
            this.f1127b.uncaughtException(thread, th);
        }
    }

    /* renamed from: c */
    public static boolean m1519c() {
        Boolean bool = f1125j.get();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: d */
    private void m1520d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f1127b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: e */
    private void m1521e() {
        synchronized (this) {
            this.f1131f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f1131f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: f */
    private void m1522f() {
        File a = C1308o.m1830a(C1240h.m1558g());
        File a2 = C1308o.m1829a();
        if (!C1298i.m1783b(a) || !C1298i.m1783b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!C1279i.m1696a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m1523g() {
        return C1341a.m2035a("exception_modules", "oom_callback") == 1;
    }

    /* renamed from: a */
    public void mo12294a(C1236c cVar) {
        this.f1128c = cVar;
    }

    /* renamed from: a */
    public void mo12295a(String str) {
        this.f1132g.put(str, new Object());
    }

    /* renamed from: a */
    public void mo12296a(Thread thread, Throwable th, boolean z, C1217a aVar) {
        List<ICrashCallback> list;
        CrashType crashType;
        if (z) {
            list = C1379o.m2222a().mo12483b();
            crashType = CrashType.LAUNCH;
        } else {
            list = C1379o.m2222a().mo12486c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback next : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                next.onCrash(crashType, C1316v.m1903a(th), thread);
                aVar.mo12253b("callback_cost_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                C1311q.m1877b(th2);
                aVar.mo12253b("callback_err_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public void mo12297b(C1236c cVar) {
        this.f1129d = cVar;
    }

    /* renamed from: b */
    public boolean mo12298b(String str) {
        return this.f1132g.containsKey(str);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m1510a(thread, th);
        } while (th != null);
    }
}
