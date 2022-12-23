package com.apm.insight;

import com.apm.insight.p017f.C1224a;
import com.apm.insight.p017f.C1225b;
import com.apm.insight.p023l.C1299j;
import com.apm.insight.runtime.C1377m;
import java.util.Map;

/* renamed from: com.apm.insight.c */
public class C1205c {
    public C1205c() {
        C1224a.m1478a();
    }

    /* renamed from: a */
    public void mo12216a(String str) {
        mo12217a(str, "EnsureNotReachHere", (Map<String, String>) null);
    }

    /* renamed from: a */
    public void mo12217a(String str, String str2, Map<String, String> map) {
        if (C1240h.m1560i().isEnsureEnable()) {
            C1225b.m1487a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }

    /* renamed from: a */
    public void mo12218a(String str, Throwable th) {
        C1377m.m2213a(th, str);
    }

    /* renamed from: a */
    public void mo12219a(Throwable th, String str) {
        if (mo12220a(th)) {
            C1225b.m1482a(th, str, true);
        }
    }

    /* renamed from: a */
    public boolean mo12220a(Throwable th) {
        return C1240h.m1560i().isEnsureEnable() && !C1299j.m1794a(th);
    }
}
