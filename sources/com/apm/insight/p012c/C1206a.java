package com.apm.insight.p012c;

import com.apm.insight.C1240h;
import java.io.File;

/* renamed from: com.apm.insight.c.a */
public class C1206a {
    /* renamed from: a */
    public static void m1358a() {
        File[] listFiles;
        File file = new File(C1240h.m1558g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    String[] split = file2.getName().split("_");
                    if (split[0].equals(String.valueOf(0))) {
                        m1359a(split);
                    }
                    file2.delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1359a(String... strArr) {
    }
}
