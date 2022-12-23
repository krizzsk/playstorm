package com.apm.insight.p023l;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.apm.insight.l.n */
public class C1304n {

    /* renamed from: a */
    static final C1306a f1302a = (Build.VERSION.SDK_INT >= 16 ? new C1307b() : new C1306a());

    /* renamed from: com.apm.insight.l.n$a */
    private static class C1306a {
        private C1306a() {
        }

        /* renamed from: a */
        public long mo12373a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }
    }

    /* renamed from: com.apm.insight.l.n$b */
    private static class C1307b extends C1306a {
        private C1307b() {
            super();
        }

        /* renamed from: a */
        public long mo12373a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* renamed from: a */
    public static long m1826a(ActivityManager.MemoryInfo memoryInfo) {
        return f1302a.mo12373a(memoryInfo);
    }
}
