package com.apm.insight.p011b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.b.j */
public final class C1201j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f1052a = 5;

    /* renamed from: b */
    private static C1203b f1053b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C1202a f1054c;

    /* renamed from: d */
    private static boolean f1055d;

    /* renamed from: e */
    private static Printer f1056e;

    /* renamed from: com.apm.insight.b.j$a */
    public interface C1202a {
        /* renamed from: a */
        void mo12214a(long j);
    }

    /* renamed from: com.apm.insight.b.j$b */
    static class C1203b implements Printer {

        /* renamed from: a */
        List<Printer> f1057a = new ArrayList();

        /* renamed from: b */
        List<Printer> f1058b = new ArrayList();

        /* renamed from: c */
        List<Printer> f1059c = new ArrayList();

        /* renamed from: d */
        boolean f1060d = false;

        /* renamed from: e */
        boolean f1061e = false;

        C1203b() {
        }

        public void println(String str) {
            if (!TextUtils.isEmpty(str)) {
                long currentTimeMillis = C1201j.f1054c != null ? System.currentTimeMillis() : 0;
                if (str.charAt(0) == '>' && this.f1061e) {
                    for (Printer next : this.f1059c) {
                        if (!this.f1057a.contains(next)) {
                            this.f1057a.add(next);
                        }
                    }
                    this.f1059c.clear();
                    this.f1061e = false;
                }
                if (this.f1057a.size() > C1201j.f1052a) {
                    Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
                }
                for (Printer next2 : this.f1057a) {
                    if (next2 != null) {
                        next2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f1060d) {
                    for (Printer next3 : this.f1058b) {
                        this.f1057a.remove(next3);
                        this.f1059c.remove(next3);
                    }
                    this.f1058b.clear();
                    this.f1060d = false;
                }
                if (C1201j.f1054c != null && currentTimeMillis > 0) {
                    C1201j.f1054c.mo12214a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1342a() {
        if (!f1055d) {
            f1055d = true;
            f1053b = new C1203b();
            Printer d = m1346d();
            f1056e = d;
            if (d != null) {
                f1053b.f1057a.add(f1056e);
            }
            Looper.getMainLooper().setMessageLogging(f1053b);
        }
    }

    /* renamed from: a */
    public static void m1343a(Printer printer) {
        if (printer != null && !f1053b.f1059c.contains(printer)) {
            f1053b.f1059c.add(printer);
            f1053b.f1061e = true;
        }
    }

    /* renamed from: d */
    private static Printer m1346d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
