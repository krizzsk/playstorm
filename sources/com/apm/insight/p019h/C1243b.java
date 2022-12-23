package com.apm.insight.p019h;

import com.apm.insight.C1176b;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1387r;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.apm.insight.h.b */
public class C1243b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static HashMap<String, String> f1167a;

    /* renamed from: a */
    public static String m1576a() {
        return C1240h.m1558g().getFilesDir() + "/apminsight/selflib/";
    }

    /* renamed from: a */
    public static String m1577a(String str) {
        return C1240h.m1558g().getFilesDir() + "/apminsight/selflib/" + "lib" + str + ".so";
    }

    /* renamed from: b */
    public static void m1579b(final String str) {
        C1384p.m2264b().mo12526a((Runnable) new Runnable() {

            /* renamed from: a */
            boolean f1168a = false;

            public void run() {
                String str;
                String str2;
                C1243b.m1583d();
                if (!C1243b.m1585f(str)) {
                    C1387r.m2274a("updateSo", str);
                    File file = new File(C1243b.m1577a(str));
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    C1311q.m1871a("doUnpackLibrary: " + str);
                    String str3 = null;
                    try {
                        str3 = C1245c.m1586a(C1240h.m1558g(), str, file);
                    } catch (Throwable th) {
                        C1387r.m2274a("updateSoError", str);
                        C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                    }
                    if (str3 == null) {
                        C1243b.f1167a.put(file.getName(), "1.3.8.nourl-alpha.0");
                        try {
                            C1298i.m1769a(new File(C1243b.m1584e(str)), "1.3.8.nourl-alpha.0", false);
                        } catch (Throwable unused) {
                        }
                        str2 = str;
                        str = "updateSoSuccess";
                    } else if (!this.f1168a) {
                        this.f1168a = true;
                        C1387r.m2274a("updateSoPostRetry", str);
                        C1384p.m2264b().mo12527a((Runnable) this, 3000);
                        return;
                    } else {
                        str2 = str;
                        str = "updateSoFailed";
                    }
                    C1387r.m2274a(str, str2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m1583d() {
        if (f1167a == null) {
            f1167a = new HashMap<>();
            File file = new File(C1240h.m1558g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f1167a.put(str.substring(0, str.length() - 4), C1298i.m1785c(file.getAbsolutePath() + "/" + str));
                        } catch (Throwable th) {
                            C1176b.m1249a().mo12218a("NPTH_CATCH", th);
                        }
                    } else if (!str.endsWith(".so")) {
                        C1298i.m1777a(new File(file, str));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m1584e(String str) {
        return C1240h.m1558g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m1585f(String str) {
        return "1.3.8.nourl-alpha.0".equals(f1167a.get(str)) && new File(m1577a(str)).exists();
    }
}
