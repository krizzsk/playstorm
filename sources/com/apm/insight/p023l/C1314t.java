package com.apm.insight.p023l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.apm.insight.l.t */
public class C1314t {

    /* renamed from: a */
    private static final CharSequence f1309a = "sony";

    /* renamed from: b */
    private static final CharSequence f1310b = "amigo";

    /* renamed from: c */
    private static final CharSequence f1311c = "funtouch";

    /* renamed from: a */
    public static String m1886a() {
        if (C1291d.m1745c()) {
            return m1896j();
        }
        if (C1291d.m1747d()) {
            return m1898l();
        }
        if (m1899m()) {
            return m1900n();
        }
        String k = m1897k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m1891e()) {
            return m1890d();
        }
        if (m1892f()) {
            return m1893g();
        }
        if (m1889c()) {
            return m1888b();
        }
        String h = m1894h();
        return !TextUtils.isEmpty(h) ? h : Build.DISPLAY;
    }

    /* renamed from: a */
    private static String m1887a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C1300k.m1795a((Closeable) bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C1300k.m1795a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C1300k.m1795a((Closeable) bufferedReader);
            return str2;
        }
    }

    /* renamed from: b */
    public static String m1888b() {
        return m1887a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: c */
    public static boolean m1889c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* renamed from: d */
    public static String m1890d() {
        return m1887a("ro.vivo.os.build.display.id") + "_" + m1887a("ro.vivo.product.version");
    }

    /* renamed from: e */
    public static boolean m1891e() {
        String a = m1887a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(a) && a.toLowerCase(Locale.getDefault()).contains(f1311c);
    }

    /* renamed from: f */
    public static boolean m1892f() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f1310b);
    }

    /* renamed from: g */
    public static String m1893g() {
        return Build.DISPLAY + "_" + m1887a("ro.gn.sv.version");
    }

    /* renamed from: h */
    public static String m1894h() {
        if (!m1895i()) {
            return "";
        }
        return "eui_" + m1887a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: i */
    public static boolean m1895i() {
        return !TextUtils.isEmpty(m1887a("ro.letv.release.version"));
    }

    /* renamed from: j */
    public static String m1896j() {
        if (!C1291d.m1745c()) {
            return "";
        }
        return "miui_" + m1887a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static String m1897k() {
        String a = C1291d.m1740a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return a + "_" + Build.DISPLAY;
    }

    /* renamed from: l */
    public static String m1898l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    /* renamed from: m */
    public static boolean m1899m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: n */
    public static String m1900n() {
        if (!m1899m()) {
            return "";
        }
        return "coloros_" + m1887a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
