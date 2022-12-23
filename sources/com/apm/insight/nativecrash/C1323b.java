package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.C1221d;
import com.apm.insight.entity.Header;
import com.apm.insight.p014e.C1212a;
import com.apm.insight.p014e.p015a.C1213a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1300k;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1313s;
import com.apm.insight.p023l.C1318w;
import com.apm.insight.runtime.C1385q;
import com.apm.insight.runtime.C1389s;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.nativecrash.b */
public final class C1323b {

    /* renamed from: d */
    private static Boolean f1322d;

    /* renamed from: a */
    private final Context f1323a;

    /* renamed from: b */
    private JSONObject f1324b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1325b f1325c;

    /* renamed from: com.apm.insight.nativecrash.b$a */
    private static class C1324a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static String m2010b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C1300k.m1795a((Closeable) bufferedReader2);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C1300k.m1795a((Closeable) bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        while (true) {
                            sb.append("\n");
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                            } else {
                                String sb2 = sb.toString();
                                C1300k.m1795a((Closeable) bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        C1300k.m1795a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                return "";
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$b */
    private class C1325b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1337d f1327b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1322a f1328c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final File f1329d;

        /* renamed from: e */
        private final File f1330e;

        public C1325b(File file) {
            this.f1329d = file;
            this.f1330e = C1308o.m1831a(C1240h.m1558g(), file.getName());
            this.f1328c = new C1322a(file);
            this.f1327b = new C1337d(file);
            if (this.f1328c.mo12376a() && this.f1327b.mo12400a() == null) {
                this.f1327b.mo12401a(file);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[Catch:{ all -> 0x0017 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo12391a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.f1328c
                java.util.Map r0 = r0.mo12378c()
                if (r0 == 0) goto L_0x0019
                boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 != 0) goto L_0x0019
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0017 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0017 }
                goto L_0x001a
            L_0x0017:
                r0 = move-exception
                goto L_0x0021
            L_0x0019:
                r0 = 0
            L_0x001a:
                if (r0 == 0) goto L_0x002a
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0017 }
                return r0
            L_0x0021:
                com.apm.insight.c r1 = com.apm.insight.C1176b.m1249a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo12218a((java.lang.String) r2, (java.lang.Throwable) r0)
            L_0x002a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1323b.C1325b.mo12391a():long");
        }

        /* renamed from: b */
        public File mo12392b() {
            return this.f1329d;
        }

        /* renamed from: c */
        public boolean mo12393c() {
            return this.f1328c.mo12376a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$c */
    public class C1326c extends C1328e {
        C1326c() {
            super();
            this.f1334c = "Total FD Count:";
            this.f1333b = C1308o.m1858i(C1323b.this.f1325c.mo12392b());
            this.f1335d = CertificateUtil.DELIMITER;
            this.f1336e = -2;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$d */
    public class C1327d extends C1328e {
        C1327d() {
            super();
            this.f1334c = "VmSize:";
            this.f1333b = C1308o.m1861k(C1323b.this.f1325c.mo12392b());
            this.f1335d = "\\s+";
            this.f1336e = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$e */
    public class C1328e {

        /* renamed from: b */
        protected File f1333b;

        /* renamed from: c */
        protected String f1334c;

        /* renamed from: d */
        protected String f1335d;

        /* renamed from: e */
        protected int f1336e;

        public C1328e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo12394a() {
            /*
                r6 = this;
                java.io.File r0 = r6.f1333b
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x0050
                java.io.File r0 = r6.f1333b
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x0050
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r6.f1333b     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = r1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r6.mo12395a(r2)     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x002d
                goto L_0x0020
            L_0x002d:
                com.apm.insight.p023l.C1300k.m1795a((java.io.Closeable) r3)
                goto L_0x0048
            L_0x0031:
                r1 = move-exception
                r2 = r0
                r0 = r3
                goto L_0x0039
            L_0x0035:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r5
            L_0x0039:
                com.apm.insight.c r3 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x0049 }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo12218a((java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0049 }
                if (r0 == 0) goto L_0x0047
                com.apm.insight.p023l.C1300k.m1795a((java.io.Closeable) r0)
            L_0x0047:
                r0 = r2
            L_0x0048:
                return r0
            L_0x0049:
                r1 = move-exception
                if (r0 == 0) goto L_0x004f
                com.apm.insight.p023l.C1300k.m1795a((java.io.Closeable) r0)
            L_0x004f:
                throw r1
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1323b.C1328e.mo12394a():int");
        }

        /* renamed from: a */
        public int mo12395a(String str) {
            int i = this.f1336e;
            if (!str.startsWith(this.f1334c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f1335d)[1].trim());
            } catch (NumberFormatException e) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$f */
    public class C1329f extends C1328e {
        C1329f() {
            super();
            this.f1334c = "Total Threads Count:";
            this.f1333b = C1308o.m1859j(C1323b.this.f1325c.mo12392b());
            this.f1335d = CertificateUtil.DELIMITER;
            this.f1336e = -2;
        }
    }

    public C1323b(Context context) {
        this.f1323a = context;
    }

    /* renamed from: a */
    private String m1981a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append(str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    private void m1982a(C1217a aVar) {
        aVar.mo12244a(m1993n());
        aVar.mo12251a("is_native_crash", (Object) 1);
        aVar.mo12251a("repack_time", (Object) Long.valueOf(System.currentTimeMillis()));
        aVar.mo12251a("crash_uuid", (Object) this.f1325c.mo12392b().getName());
        aVar.mo12251a("jiffy", (Object) Long.valueOf(C1385q.C1386a.m2267a()));
    }

    /* renamed from: a */
    private void m1983a(Map<String, String> map) {
        String str = "true";
        map.put("has_fds_file", C1308o.m1858i(this.f1325c.mo12392b()).exists() ? str : "false");
        File h = C1308o.m1856h(this.f1325c.mo12392b());
        map.put("has_logcat_file", (!h.exists() || h.length() <= 128) ? "false" : str);
        map.put("has_maps_file", C1308o.m1844d(this.f1325c.mo12392b()).exists() ? str : "false");
        map.put("has_tombstone_file", C1308o.m1836b(this.f1325c.mo12392b()).exists() ? str : "false");
        map.put("has_meminfo_file", C1308o.m1861k(this.f1325c.mo12392b()).exists() ? str : "false");
        if (!C1308o.m1859j(this.f1325c.mo12392b()).exists()) {
            str = "false";
        }
        map.put("has_threads_file", str);
    }

    /* renamed from: b */
    private void m1984b(C1217a aVar) {
        C1221d.m1459b(aVar.mo12265h());
        HashMap hashMap = new HashMap();
        if (m1992m()) {
            hashMap.put("is_root", "true");
            aVar.mo12251a("is_root", (Object) "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.mo12251a("is_root", (Object) "false");
        }
        m1983a((Map<String, String>) hashMap);
        int o = m1994o();
        if (o > 0) {
            if (o > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.mo12251a("fd_count", (Object) Integer.valueOf(o));
        }
        int p = m1995p();
        if (p > 0) {
            if (p > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.mo12251a("threads_count", (Object) Integer.valueOf(p));
        }
        int q = m1996q();
        if (q > 0) {
            if (((long) q) > m1991i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.mo12251a("memory_size", (Object) Integer.valueOf(q));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.0");
        hashMap.put("has_java_stack", String.valueOf(aVar.mo12265h().opt("java_data") != null));
        JSONArray a = C1330c.m2020a(C1308o.m1862l(this.f1325c.f1329d), C1308o.m1863m(this.f1325c.f1329d));
        hashMap.put("leak_threads_count", String.valueOf(a.length()));
        if (a.length() > 0) {
            try {
                C1298i.m1771a(C1308o.m1864n(this.f1325c.f1329d), a, false);
            } catch (Throwable unused) {
            }
        }
        aVar.mo12256b();
        aVar.mo12258c();
        aVar.mo12257c((Map<? extends String, ? extends String>) hashMap);
    }

    /* renamed from: c */
    private void m1985c(C1217a aVar) {
        Map<String, String> b = this.f1325c.f1327b.mo12402b();
        if (!b.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String next : b.keySet()) {
                String a = m1981a(b.get(next));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", next);
                    jSONObject.put("lib_uuid", a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) e);
                }
            }
            aVar.mo12251a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* renamed from: d */
    private void m1986d(C1217a aVar) {
        File e = C1308o.m1847e(this.f1325c.mo12392b());
        if (e.exists() || this.f1324b != null) {
            try {
                aVar.mo12259c(this.f1324b == null ? new JSONObject(C1298i.m1785c(e.getAbsolutePath())) : this.f1324b);
                aVar.mo12246a("has_callback", "true");
                if (aVar.mo12265h().opt("storage") == null) {
                    aVar.mo12255b(C1318w.m1928a(C1240h.m1558g()));
                }
                C1313s.m1884a(aVar, aVar.mo12266i(), CrashType.NATIVE);
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
            long j = -1;
            long optLong = aVar.mo12265h().optLong("crash_time", -1);
            long optLong2 = aVar.mo12265h().optLong("java_end", -1);
            if (!(optLong2 == -1 || optLong == -1)) {
                j = optLong2 - optLong;
            }
            try {
                aVar.mo12253b("total_cost", String.valueOf(j));
                aVar.mo12246a("total_cost", String.valueOf(j / 1000));
            } catch (Throwable unused) {
            }
        } else {
            aVar.mo12255b(C1318w.m1928a(C1240h.m1558g()));
            aVar.mo12246a("has_callback", "false");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1987e(com.apm.insight.entity.C1217a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.b$b r0 = r4.f1325c
            java.io.File r0 = r0.mo12392b()
            java.io.File r0 = com.apm.insight.p023l.C1308o.m1853g((java.io.File) r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x001b }
            java.lang.String r0 = com.apm.insight.p023l.C1316v.m1902a((java.lang.String) r0)     // Catch:{ all -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r0 = move-exception
            com.apm.insight.c r1 = com.apm.insight.C1176b.m1249a()
            r1.mo12218a((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0023:
            java.lang.String r0 = ""
        L_0x0025:
            com.apm.insight.nativecrash.b$b r1 = r4.f1325c
            java.io.File r1 = r1.mo12392b()
            java.io.File r1 = com.apm.insight.p023l.C1308o.m1865o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x0055
            java.lang.String r1 = com.apm.insight.nativecrash.C1323b.C1324a.m2010b(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0054
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "java_data"
            r5.mo12251a((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()
            r0.mo12218a((java.lang.String) r2, (java.lang.Throwable) r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1323b.m1987e(com.apm.insight.entity.a):void");
    }

    /* renamed from: f */
    private void m1988f(C1217a aVar) {
        File a = C1308o.m1832a(this.f1325c.mo12392b());
        if (a.exists()) {
            try {
                aVar.mo12251a("native_log", (Object) C1298i.m1781b(C1298i.m1766a(a.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: g */
    private void m1989g(C1217a aVar) {
        File h = C1308o.m1856h(this.f1325c.mo12392b());
        if (!h.exists()) {
            NativeImpl.m1950a(h.getAbsolutePath(), String.valueOf(C1240h.m1560i().getLogcatDumpCount()), String.valueOf(C1240h.m1560i().getLogcatLevel()));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f1325c.f1328c.mo12378c().get("pid") + " ";
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(h));
            try {
                if (h.length() > 512000) {
                    bufferedReader2.skip(h.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(str)) {
                        jSONArray.put(readLine);
                    }
                }
                C1300k.m1795a((Closeable) bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C1300k.m1795a((Closeable) bufferedReader);
                aVar.mo12251a("logcat", (Object) jSONArray);
            }
        } catch (Throwable unused2) {
            C1300k.m1795a((Closeable) bufferedReader);
            aVar.mo12251a("logcat", (Object) jSONArray);
        }
        aVar.mo12251a("logcat", (Object) jSONArray);
    }

    /* renamed from: h */
    private void m1990h(C1217a aVar) {
        Map<String, String> a = mo12379a();
        if (a != null && aVar != null) {
            String str = a.get("process_name");
            if (str != null) {
                aVar.mo12251a("process_name", (Object) str);
            }
            String str2 = a.get("start_time");
            if (str2 != null) {
                try {
                    aVar.mo12243a(Long.decode(str2).longValue());
                } catch (Throwable th) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                }
            }
            String str3 = a.get("pid");
            if (str3 != null) {
                try {
                    aVar.mo12251a("pid", (Object) Long.decode(str3));
                } catch (Throwable th2) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th2);
                }
            }
            String str4 = a.get("crash_thread_name");
            if (str4 != null) {
                aVar.mo12251a("crash_thread_name", (Object) str4);
            }
            String str5 = a.get("crash_time");
            if (str5 != null) {
                try {
                    aVar.mo12251a("crash_time", (Object) Long.decode(str5));
                } catch (Throwable th3) {
                    C1176b.m1249a().mo12218a("NPTH_CATCH", th3);
                }
            }
            aVar.mo12251a("data", (Object) mo12381b());
        }
    }

    /* renamed from: i */
    public static long m1991i() {
        if (NativeImpl.m1965e()) {
            return Long.MAX_VALUE;
        }
        return Header.m1386a() ? 3891200 : 2867200;
    }

    /* renamed from: m */
    public static boolean m1992m() {
        Boolean bool = f1322d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        while (i < 11) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    f1322d = bool2;
                    return bool2.booleanValue();
                }
                i++;
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
        Boolean bool3 = false;
        f1322d = bool3;
        return bool3.booleanValue();
    }

    /* renamed from: n */
    private Header m1993n() {
        Header header = new Header(this.f1323a);
        JSONObject a = C1389s.m2276a().mo12514a(this.f1325c.mo12391a());
        if (a != null) {
            header.mo12237a(a);
            header.mo12239d();
            header.mo12240e();
        }
        Header.m1388b(header);
        return header;
    }

    /* renamed from: o */
    private int m1994o() {
        return new C1326c().mo12394a();
    }

    /* renamed from: p */
    private int m1995p() {
        return new C1329f().mo12394a();
    }

    /* renamed from: q */
    private int m1996q() {
        return new C1327d().mo12394a();
    }

    /* renamed from: a */
    public Map<String, String> mo12379a() {
        C1325b bVar = this.f1325c;
        if (bVar != null) {
            return bVar.f1328c.mo12378c();
        }
        return null;
    }

    /* renamed from: a */
    public void mo12380a(File file) {
        this.f1325c = new C1325b(file);
    }

    /* renamed from: b */
    public String mo12381b() {
        C1325b bVar = this.f1325c;
        if (bVar == null) {
            return null;
        }
        String c = bVar.f1327b.mo12403c();
        return (c == null || c.isEmpty()) ? this.f1325c.f1328c.mo12377b() : c;
    }

    /* renamed from: c */
    public boolean mo12382c() {
        C1325b bVar = this.f1325c;
        if (bVar != null) {
            return bVar.mo12393c();
        }
        return false;
    }

    /* renamed from: d */
    public JSONObject mo12383d() {
        File f = C1308o.m1850f(this.f1325c.mo12392b());
        if (!f.exists()) {
            return null;
        }
        try {
            String c = C1298i.m1785c(f.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|(4:16|(1:52)(3:18|19|(2:21|53)(1:51))|25|14)|49|26|27|28|(1:32)|33|34|(2:36|(3:(4:40|(2:42|55)(1:56)|43|38)|54|61)(1:59))(1:58)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d2 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8 A[Catch:{ IOException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12384e() {
        /*
            r10 = this;
            java.lang.String r0 = "NPTH_CATCH"
            com.apm.insight.nativecrash.b$b r1 = r10.f1325c     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = r1.mo12392b()     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = com.apm.insight.p023l.C1308o.m1847e((java.io.File) r1)     // Catch:{ IOException -> 0x0110 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = ".tmp'"
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x002f
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x002f:
            boolean r3 = r1.exists()     // Catch:{ IOException -> 0x0110 }
            r4 = 46
            r5 = 0
            if (r3 == 0) goto L_0x0065
        L_0x0038:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m1938a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x0062
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0065:
            com.apm.insight.entity.a r3 = new com.apm.insight.entity.a     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            r6 = r5
        L_0x006b:
            int r7 = com.apm.insight.nativecrash.NativeCrashCollector.m1938a()     // Catch:{ IOException -> 0x0110 }
            if (r6 >= r7) goto L_0x00b5
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r8.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r9 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r8.append(r9)     // Catch:{ IOException -> 0x0110 }
            r8.append(r4)     // Catch:{ IOException -> 0x0110 }
            r8.append(r6)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0110 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0110 }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x0110 }
            if (r8 != 0) goto L_0x0093
            goto L_0x00b2
        L_0x0093:
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x00aa }
            java.lang.String r7 = com.apm.insight.p023l.C1298i.m1785c((java.lang.String) r7)     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00aa }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x00aa }
            if (r7 <= 0) goto L_0x00b2
            r3.mo12259c((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r7 = move-exception
            com.apm.insight.c r8 = com.apm.insight.C1176b.m1249a()     // Catch:{ IOException -> 0x0110 }
            r8.mo12218a((java.lang.String) r0, (java.lang.Throwable) r7)     // Catch:{ IOException -> 0x0110 }
        L_0x00b2:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x00b5:
            org.json.JSONObject r3 = r3.mo12265h()     // Catch:{ IOException -> 0x0110 }
            int r6 = r3.length()     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00d2
            java.lang.String r6 = "storage"
            java.lang.Object r6 = r3.opt(r6)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00d2
            android.content.Context r6 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x00d2 }
            org.json.JSONObject r6 = com.apm.insight.p023l.C1318w.m1928a((android.content.Context) r6)     // Catch:{ all -> 0x00d2 }
            com.apm.insight.entity.C1217a.m1412a((org.json.JSONObject) r3, (org.json.JSONObject) r6)     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            int r6 = r3.length()     // Catch:{ IOException -> 0x0110 }
            if (r6 == 0) goto L_0x0118
            r10.f1324b = r3     // Catch:{ IOException -> 0x0110 }
            com.apm.insight.p023l.C1298i.m1782b(r2, r3, r5)     // Catch:{ IOException -> 0x0110 }
            boolean r2 = r2.renameTo(r1)     // Catch:{ IOException -> 0x0110 }
            if (r2 == 0) goto L_0x0118
        L_0x00e3:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m1938a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x010d
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x010d:
            int r5 = r5 + 1
            goto L_0x00e3
        L_0x0110:
            r1 = move-exception
            com.apm.insight.c r2 = com.apm.insight.C1176b.m1249a()
            r2.mo12218a((java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1323b.mo12384e():void");
    }

    /* renamed from: f */
    public boolean mo12385f() {
        ICrashFilter b = C1240h.m1552b().mo12171b();
        if (b == null) {
            return true;
        }
        try {
            return b.onNativeCrashFilter(mo12381b(), "");
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo12386g() {
        return C1212a.m1367a().mo12226a(C1308o.m1850f(this.f1325c.mo12392b()).getAbsolutePath());
    }

    /* renamed from: h */
    public void mo12387h() {
        C1212a.m1367a().mo12225a(C1213a.m1372a(C1308o.m1850f(this.f1325c.mo12392b()).getAbsolutePath()));
    }

    /* renamed from: j */
    public JSONObject mo12388j() {
        try {
            C1217a aVar = new C1217a();
            m1982a(aVar);
            m1990h(aVar);
            m1985c(aVar);
            m1986d(aVar);
            m1987e(aVar);
            m1989g(aVar);
            m1988f(aVar);
            m1984b(aVar);
            File f = C1308o.m1850f(this.f1325c.mo12392b());
            JSONObject h = aVar.mo12265h();
            C1298i.m1772a(f, h, false);
            return h;
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: k */
    public boolean mo12389k() {
        return C1298i.m1777a(this.f1325c.mo12392b());
    }

    /* renamed from: l */
    public void mo12390l() {
        try {
            String absolutePath = this.f1325c.mo12392b().getAbsolutePath();
            C1298i.m1786c(absolutePath, Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "localDebug" + "/" + C1240h.m1558g().getPackageName() + "/" + this.f1325c.mo12392b().getName() + ".zip");
        } catch (Throwable th) {
            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
        }
    }
}
