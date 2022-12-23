package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.apm.insight.runtime.p */
public class C1384p {

    /* renamed from: a */
    private static volatile C1393u f1460a;

    /* renamed from: b */
    private static volatile Handler f1461b;

    /* renamed from: a */
    public static HandlerThread m2263a() {
        if (f1460a == null) {
            synchronized (C1384p.class) {
                if (f1460a == null) {
                    f1460a = new C1393u("default_npth_thread");
                    f1460a.mo12528b();
                }
            }
        }
        return f1460a.mo12530c();
    }

    /* renamed from: b */
    public static C1393u m2264b() {
        if (f1460a == null) {
            m2263a();
        }
        return f1460a;
    }
}
