package com.apm.insight.p023l;

/* renamed from: com.apm.insight.l.x */
public final class C1319x {
    /* renamed from: a */
    public static Thread m1937a(Runnable runnable, String str) {
        if (runnable == null) {
            return null;
        }
        Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
        thread.start();
        return thread;
    }
}
