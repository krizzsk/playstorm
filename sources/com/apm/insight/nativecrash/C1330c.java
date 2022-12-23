package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.facebook.internal.security.CertificateUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.apm.insight.nativecrash.c */
public class C1330c {

    /* renamed from: com.apm.insight.nativecrash.c$a */
    public static class C1331a extends C1333c {
        C1331a(File file) {
            super(file);
            this.f1340b = "Total FD Count:";
            this.f1341c = CertificateUtil.DELIMITER;
            this.f1342d = -2;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$b */
    public static class C1332b extends C1333c {
        C1332b(File file) {
            super(file);
            this.f1340b = "VmSize:";
            this.f1341c = "\\s+";
            this.f1342d = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c */
    public static class C1333c {

        /* renamed from: a */
        protected File f1339a;

        /* renamed from: b */
        protected String f1340b;

        /* renamed from: c */
        protected String f1341c;

        /* renamed from: d */
        protected int f1342d;

        public C1333c(File file) {
            this.f1339a = file;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo12396a() {
            /*
                r6 = this;
                java.io.File r0 = r6.f1339a
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x0050
                java.io.File r0 = r6.f1339a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x0050
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r6.f1339a     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = r1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r6.mo12397a(r2)     // Catch:{ all -> 0x0031 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1330c.C1333c.mo12396a():int");
        }

        /* renamed from: a */
        public int mo12397a(String str) {
            int i = this.f1342d;
            if (!str.startsWith(this.f1340b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f1341c)[1].trim());
            } catch (NumberFormatException e) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$d */
    public static class C1334d extends C1333c {
        C1334d(File file) {
            super(file);
        }

        /* renamed from: b */
        public HashMap<String, List<String>> mo12398b() {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                JSONArray b = C1298i.m1780b(this.f1339a.getAbsolutePath());
                if (b == null) {
                    return hashMap;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        if (optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            String substring = indexOf > 0 ? optString.substring(i2, optString.indexOf(93, i2)) : "unknown addr";
                            List list = hashMap.get(substring);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(substring, list);
                            }
                            list.add(optString);
                        }
                    }
                }
                return hashMap;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$e */
    public static class C1335e extends C1333c {
        C1335e(File file) {
            super(file);
        }

        /* renamed from: a */
        public JSONArray mo12399a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray b = C1298i.m1780b(this.f1339a.getAbsolutePath());
                if (b == null) {
                    return jSONArray;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(CertificateUtil.DELIMITER));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            for (String str : list) {
                                jSONArray.put(str + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> it : hashMap.values()) {
                    for (String str2 : it) {
                        jSONArray.put(str2 + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1176b.m1249a().mo12218a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$f */
    public static class C1336f extends C1333c {
        C1336f(File file) {
            super(file);
            this.f1340b = "Total Threads Count:";
            this.f1341c = CertificateUtil.DELIMITER;
            this.f1342d = -2;
        }
    }

    /* renamed from: a */
    public static int m2019a(String str) {
        return new C1331a(C1308o.m1837b(str)).mo12396a();
    }

    /* renamed from: a */
    public static JSONArray m2020a(File file, File file2) {
        return new C1335e(file2).mo12399a(new C1334d(file).mo12398b());
    }

    /* renamed from: b */
    public static int m2021b(String str) {
        return new C1336f(C1308o.m1841c(str)).mo12396a();
    }

    /* renamed from: c */
    public static int m2022c(String str) {
        return new C1332b(C1308o.m1845d(str)).mo12396a();
    }
}
