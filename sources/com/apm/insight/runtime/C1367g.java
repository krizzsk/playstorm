package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C1385q;
import java.util.Comparator;

/* renamed from: com.apm.insight.runtime.g */
public class C1367g {

    /* renamed from: a */
    private static final Comparator<C1369a> f1427a = new Comparator<C1369a>() {
        /* renamed from: a */
        public final int compare(C1369a aVar, C1369a aVar2) {
            int i = aVar.f1430b + aVar.f1431c;
            int i2 = aVar2.f1430b + aVar2.f1431c;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b */
    private static byte[] f1428b = new byte[4096];

    /* renamed from: com.apm.insight.runtime.g$a */
    public static class C1369a {

        /* renamed from: a */
        public String f1429a = "unknown";

        /* renamed from: b */
        public int f1430b;

        /* renamed from: c */
        public int f1431c;

        C1369a() {
        }
    }

    /* renamed from: a */
    public static long m2193a(int i) {
        return NativeImpl.m1959c(i) * C1385q.C1386a.m2267a();
    }
}
