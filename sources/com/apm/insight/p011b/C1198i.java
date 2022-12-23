package com.apm.insight.p011b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.b.i */
public class C1198i {

    /* renamed from: a */
    private static volatile boolean f1044a;

    /* renamed from: b */
    private static Printer f1045b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<C1185e> f1046c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static C1185e f1047d;

    /* renamed from: e */
    private static volatile C1200a f1048e;

    /* renamed from: f */
    private static volatile boolean f1049f = false;

    /* renamed from: g */
    private static long f1050g = 0;

    /* renamed from: h */
    private static int f1051h = 0;

    /* renamed from: com.apm.insight.b.i$a */
    public interface C1200a {
        /* renamed from: a */
        void mo12213a(long j);
    }

    /* renamed from: a */
    public static void m1338a() {
        if (!f1044a) {
            f1044a = true;
            f1045b = new Printer() {
                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        boolean z = false;
                        if (str.charAt(0) == '>') {
                            z = true;
                        } else if (str.charAt(0) != '<') {
                            return;
                        }
                        C1198i.m1340a(z, str);
                    }
                }
            };
            C1201j.m1342a();
            C1201j.m1343a(f1045b);
        }
    }

    /* renamed from: a */
    public static void m1339a(C1185e eVar) {
        synchronized (f1046c) {
            f1046c.add(eVar);
        }
    }

    /* renamed from: a */
    public static void m1340a(boolean z, String str) {
        C1185e eVar;
        C1185e eVar2;
        long nanoTime = System.nanoTime();
        C1185e.f976a = nanoTime / 1000000;
        C1185e.f977b = SystemClock.currentThreadTimeMillis();
        if (z && (eVar2 = f1047d) != null && eVar2.mo12194a()) {
            f1047d.mo12193a(str);
        }
        CopyOnWriteArrayList<C1185e> copyOnWriteArrayList = f1046c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            C1185e eVar3 = copyOnWriteArrayList.get(i);
            if (eVar3 != null && eVar3.mo12194a()) {
                boolean z2 = eVar3.f978c;
                if (z) {
                    if (!z2) {
                        eVar3.mo12193a(str);
                    }
                } else if (z2) {
                    eVar3.mo12195b(str);
                }
            } else if (!z && eVar3.f978c) {
                eVar3.mo12195b("");
            }
        }
        if (!z && (eVar = f1047d) != null && eVar.mo12194a()) {
            f1047d.mo12195b("");
        }
        if (f1049f) {
            f1050g += System.nanoTime() - nanoTime;
            int i2 = f1051h;
            f1051h = i2 + 1;
            if (i2 >= 1000) {
                if (f1048e != null) {
                    f1048e.mo12213a(f1050g);
                }
                f1051h = 0;
                f1050g = 0;
                f1049f = false;
            }
        }
    }
}
