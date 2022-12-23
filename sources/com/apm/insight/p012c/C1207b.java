package com.apm.insight.p012c;

import com.apm.insight.C1240h;
import com.apm.insight.runtime.C1341a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.apm.insight.c.b */
public class C1207b {

    /* renamed from: a */
    private static AtomicBoolean f1065a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m1360a() {
        synchronized (f1065a) {
            if (f1065a.get()) {
                return false;
            }
            f1065a.set(true);
            return m1361b();
        }
    }

    /* renamed from: b */
    public static boolean m1361b() {
        if (!C1341a.m2051h()) {
            return false;
        }
        try {
            File file = new File(C1240h.m1559h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
