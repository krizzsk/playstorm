package com.apm.insight.p023l;

import android.os.Build;
import android.os.Debug;

/* renamed from: com.apm.insight.l.c */
public class C1287c {

    /* renamed from: a */
    static final C1289a f1284a = (Build.VERSION.SDK_INT >= 19 ? new C1290b() : new C1289a());

    /* renamed from: com.apm.insight.l.c$a */
    private static class C1289a {
        private C1289a() {
        }

        /* renamed from: a */
        public int mo12357a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo12358b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo12359c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.apm.insight.l.c$b */
    private static class C1290b extends C1289a {
        private C1290b() {
            super();
        }

        /* renamed from: a */
        public int mo12357a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        /* renamed from: b */
        public int mo12358b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        /* renamed from: c */
        public int mo12359c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* renamed from: a */
    public static int m1731a(Debug.MemoryInfo memoryInfo) {
        return f1284a.mo12357a(memoryInfo);
    }

    /* renamed from: b */
    public static int m1732b(Debug.MemoryInfo memoryInfo) {
        return f1284a.mo12358b(memoryInfo);
    }

    /* renamed from: c */
    public static int m1733c(Debug.MemoryInfo memoryInfo) {
        return f1284a.mo12359c(memoryInfo);
    }
}
