package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.p011b.C1186f;
import com.apm.insight.p023l.C1311q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.runtime.l */
public class C1375l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Printer f1437a;

    /* renamed from: b */
    private static C1375l f1438b;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Printer f1439f = new Printer() {
        public void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C1375l.m2205a().mo12506a(str);
                } else if (str.charAt(0) == '<') {
                    C1375l.m2205a().mo12507b(str);
                }
                if (C1375l.f1437a != null && C1375l.f1437a != C1375l.f1439f) {
                    C1375l.f1437a.println(str);
                }
            }
        }
    };

    /* renamed from: c */
    private long f1440c = -1;

    /* renamed from: d */
    private final List<Printer> f1441d = new ArrayList();

    /* renamed from: e */
    private final List<Printer> f1442e = new ArrayList();

    /* renamed from: g */
    private boolean f1443g = false;

    private C1375l() {
    }

    /* renamed from: a */
    public static C1375l m2205a() {
        if (f1438b == null) {
            synchronized (C1375l.class) {
                if (f1438b == null) {
                    f1438b = new C1375l();
                }
            }
        }
        return f1438b;
    }

    /* renamed from: a */
    private static void m2206a(List<? extends Printer> list, String str) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    Printer printer = (Printer) list.get(i);
                    if (printer != null) {
                        printer.println(str);
                        i++;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th) {
                C1311q.m1875a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12506a(String str) {
        C1186f.m1296a(false);
        this.f1440c = -1;
        try {
            m2206a(this.f1441d, str);
        } catch (Exception e) {
            C1311q.m1875a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12507b(String str) {
        this.f1440c = SystemClock.uptimeMillis();
        try {
            m2206a(this.f1442e, str);
        } catch (Exception e) {
            C1311q.m1877b((Throwable) e);
        }
    }

    /* renamed from: b */
    public boolean mo12508b() {
        return this.f1440c != -1 && SystemClock.uptimeMillis() - this.f1440c > 5000;
    }
}
