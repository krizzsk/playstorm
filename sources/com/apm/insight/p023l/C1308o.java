package com.apm.insight.p023l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1240h;
import java.io.File;

/* renamed from: com.apm.insight.l.o */
public class C1308o {

    /* renamed from: a */
    private static String f1303a;

    /* renamed from: b */
    private static File f1304b;

    /* renamed from: c */
    private static File f1305c;

    /* renamed from: d */
    private static File f1306d;

    /* renamed from: a */
    public static File m1829a() {
        File file = f1305c;
        return file == null ? m1843d(C1240h.m1558g()) : file;
    }

    /* renamed from: a */
    public static File m1830a(Context context) {
        return new File(m1860j(context), "apminsight/CrashLogJava");
    }

    /* renamed from: a */
    public static File m1831a(Context context, String str) {
        return new File(m1860j(context) + '/' + "apminsight/CrashCommonLog" + '/' + str);
    }

    /* renamed from: a */
    public static File m1832a(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: a */
    public static File m1833a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* renamed from: a */
    public static String m1834a(String str) {
        return "dart_" + str;
    }

    /* renamed from: b */
    public static File m1835b(Context context) {
        return new File(m1860j(context), "apminsight/CrashLogSimple");
    }

    /* renamed from: b */
    public static File m1836b(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: b */
    public static File m1837b(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "fds.txt");
    }

    /* renamed from: b */
    public static String m1838b() {
        return "anr_" + C1240h.m1556e();
    }

    /* renamed from: c */
    public static File m1839c(Context context) {
        return new File(m1860j(context), "apminsight/RuntimeContext");
    }

    /* renamed from: c */
    public static File m1840c(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: c */
    public static File m1841c(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "threads.txt");
    }

    /* renamed from: c */
    public static String m1842c() {
        return String.format("ensure_%s", new Object[]{C1240h.m1556e()});
    }

    /* renamed from: d */
    public static File m1843d(Context context) {
        if (f1305c == null) {
            if (context == null) {
                context = C1240h.m1558g();
            }
            f1305c = new File(m1860j(context), "apminsight/CrashLogNative");
        }
        return f1305c;
    }

    /* renamed from: d */
    public static File m1844d(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "maps.txt");
    }

    /* renamed from: d */
    public static File m1845d(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "meminfo.txt");
    }

    /* renamed from: e */
    public static File m1846e(Context context) {
        if (f1306d == null) {
            f1306d = new File(m1860j(context) + '/' + "apminsight/CrashCommonLog" + '/' + C1240h.m1557f());
        }
        return f1306d;
    }

    /* renamed from: e */
    public static File m1847e(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: e */
    public static File m1848e(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "pthreads.txt");
    }

    /* renamed from: f */
    public static File m1849f(Context context) {
        return new File(m1860j(context), "apminsight/CrashCommonLog");
    }

    /* renamed from: f */
    public static File m1850f(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: f */
    public static File m1851f(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "rountines.txt");
    }

    /* renamed from: g */
    public static File m1852g(Context context) {
        return new File(m1860j(context), "apminsight/issueCrashTimes");
    }

    /* renamed from: g */
    public static File m1853g(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: g */
    public static File m1854g(String str) {
        return new File(m1831a(C1240h.m1558g(), str), "leakd_threads.txt");
    }

    /* renamed from: h */
    public static File m1855h(Context context) {
        return new File(m1860j(context) + '/' + "apminsight/issueCrashTimes" + '/' + "current.times");
    }

    /* renamed from: h */
    public static File m1856h(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "logcat.txt");
    }

    /* renamed from: i */
    public static File m1857i(Context context) {
        return new File(m1860j(context), "apminsight/alogCrash");
    }

    /* renamed from: i */
    public static File m1858i(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "fds.txt");
    }

    /* renamed from: j */
    public static File m1859j(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "threads.txt");
    }

    /* renamed from: j */
    public static String m1860j(Context context) {
        if (TextUtils.isEmpty(f1303a)) {
            try {
                f1303a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f1303a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f1303a;
    }

    /* renamed from: k */
    public static File m1861k(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "meminfo.txt");
    }

    /* renamed from: l */
    public static File m1862l(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "pthreads.txt");
    }

    /* renamed from: m */
    public static File m1863m(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "rountines.txt");
    }

    /* renamed from: n */
    public static File m1864n(File file) {
        return new File(m1831a(C1240h.m1558g(), file.getName()), "leakd_threads.txt");
    }

    /* renamed from: o */
    public static File m1865o(File file) {
        return new File(file, "abortmsg.txt");
    }
}
