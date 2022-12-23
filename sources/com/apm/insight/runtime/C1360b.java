package com.apm.insight.runtime;

import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.apm.insight.runtime.b */
public class C1360b {

    /* renamed from: a */
    private static long f1408a = -30000;

    /* renamed from: b */
    private static File f1409b;

    /* renamed from: a */
    public static String m2155a(long j, String str) {
        try {
            String j2 = C1308o.m1860j(C1240h.m1558g());
            return C1298i.m1784c(new File(j2, "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* renamed from: a */
    public static void m2156a() {
        File file = new File(C1308o.m1860j(C1240h.m1558g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                C1298i.m1777a(new File(file, list[i]));
            }
        }
    }

    /* renamed from: a */
    public static void m2157a(long j) {
        if (j - f1408a >= 30000) {
            f1408a = j;
            try {
                C1298i.m1769a(m2158b(), String.valueOf(System.currentTimeMillis()), false);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private static File m2158b() {
        if (f1409b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j = C1308o.m1860j(C1240h.m1558g());
            f1409b = new File(j, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + C1240h.m1557f());
        }
        return f1409b;
    }
}
