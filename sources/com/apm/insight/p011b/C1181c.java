package com.apm.insight.p011b;

import android.os.SystemClock;
import com.apm.insight.runtime.C1360b;
import com.apm.insight.runtime.C1384p;

/* renamed from: com.apm.insight.b.c */
public class C1181c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static long f964b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1178b f965a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f966c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f967d = new Runnable() {
        public void run() {
            if (!C1181c.this.f966c) {
                C1181c.this.f965a.mo12184d();
                long unused = C1181c.f964b = SystemClock.uptimeMillis();
                boolean a = C1186f.m1297a();
                C1384p.m2264b().mo12527a(C1181c.this.f967d, 500);
                C1360b.m2157a(C1181c.f964b);
            }
        }
    };

    C1181c(C1178b bVar) {
        this.f965a = bVar;
        C1384p.m2264b().mo12527a(this.f967d, 5000);
    }

    /* renamed from: c */
    public static boolean m1283c() {
        return SystemClock.uptimeMillis() - f964b <= 15000;
    }

    /* renamed from: a */
    public void mo12189a() {
        if (!this.f966c) {
            C1384p.m2264b().mo12527a(this.f967d, 5000);
        }
    }

    /* renamed from: b */
    public void mo12190b() {
        this.f966c = true;
    }
}
