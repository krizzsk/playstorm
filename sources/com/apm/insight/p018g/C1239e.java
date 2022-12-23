package com.apm.insight.p018g;

import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1312r;
import com.apm.insight.runtime.p024a.C1343b;

/* renamed from: com.apm.insight.g.e */
public class C1239e {
    /* renamed from: a */
    public static boolean m1541a(long j) {
        if (C1312r.m1882a(2)) {
            return true;
        }
        if (C1312r.m1882a(1024)) {
            return false;
        }
        return (C1343b.m2074c() == -1 || j - C1343b.m2074c() <= C1240h.m1560i().getLaunchCrashInterval()) && (!C1240h.m1564m() || C1240h.m1567p() != 0);
    }
}
