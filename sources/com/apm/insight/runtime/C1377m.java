package com.apm.insight.runtime;

import com.apm.insight.C1240h;
import com.apm.insight.MonitorCrash;

/* renamed from: com.apm.insight.runtime.m */
public class C1377m {

    /* renamed from: a */
    private static MonitorCrash f1444a = null;

    /* renamed from: b */
    private static int f1445b = -1;

    /* renamed from: c */
    private static int f1446c;

    /* renamed from: a */
    public static MonitorCrash m2212a() {
        if (f1444a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(C1240h.m1558g(), "239017", 1030820, "1.3.8.nourl-alpha.0", "com.apm.insight");
            f1444a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f1444a;
    }

    /* renamed from: a */
    public static void m2213a(Throwable th, String str) {
        if (C1240h.m1558g() != null && m2214b()) {
            m2212a().reportCustomErr(str, "INNER", th);
        }
    }

    /* renamed from: b */
    private static boolean m2214b() {
        if (f1445b == -1) {
            f1445b = 5;
        }
        int i = f1446c;
        if (i >= f1445b) {
            return false;
        }
        f1446c = i + 1;
        return true;
    }
}
