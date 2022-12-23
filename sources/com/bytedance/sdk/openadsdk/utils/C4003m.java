package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2954f;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2985u;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.utils.m */
/* compiled from: RomUtils */
public class C4003m {

    /* renamed from: a */
    public static boolean f10235a = false;

    /* renamed from: b */
    public static boolean f10236b = false;

    /* renamed from: c */
    private static final CharSequence f10237c = "sony";

    /* renamed from: d */
    private static final CharSequence f10238d = "amigo";

    /* renamed from: e */
    private static final CharSequence f10239e = "funtouch";

    /* renamed from: f */
    private static String f10240f = null;

    /* renamed from: g */
    private static int f10241g = Integer.MAX_VALUE;

    /* renamed from: a */
    public static String m13121a() {
        if (!TextUtils.isEmpty(f10240f)) {
            return f10240f;
        }
        String a = C3524h.m10849a("sdk_local_rom_info", 604800000);
        f10240f = a;
        if (TextUtils.isEmpty(a)) {
            String u = m13145u();
            f10240f = u;
            C3524h.m10851a("sdk_local_rom_info", u);
        }
        return f10240f;
    }

    /* renamed from: u */
    private static String m13145u() {
        if (m13139o()) {
            return m13140p();
        }
        if (m13129e()) {
            return m13136l();
        }
        if (m13124b()) {
            return m13141q();
        }
        if (m13142r()) {
            return m13143s();
        }
        String m = m13137m();
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        if (m13131g()) {
            return m13130f();
        }
        if (m13132h()) {
            return m13133i();
        }
        if (m13128d()) {
            return m13125c();
        }
        String j = m13134j();
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        return Build.DISPLAY;
    }

    /* renamed from: b */
    public static boolean m13124b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* renamed from: c */
    public static String m13125c() {
        return m13127d("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: d */
    public static boolean m13128d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m13129e() {
        if (!f10236b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f10235a = true;
                    f10236b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f10236b = true;
        }
        return f10235a;
    }

    /* renamed from: f */
    public static String m13130f() {
        return m13127d("ro.vivo.os.build.display.id") + "_" + m13127d("ro.vivo.product.version");
    }

    /* renamed from: g */
    public static boolean m13131g() {
        String d = m13127d("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(d) && d.toLowerCase().contains(f10239e);
    }

    /* renamed from: h */
    public static boolean m13132h() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(f10238d);
    }

    /* renamed from: i */
    public static String m13133i() {
        return Build.DISPLAY + "_" + m13127d("ro.gn.sv.version");
    }

    /* renamed from: j */
    public static String m13134j() {
        if (!m13135k()) {
            return "";
        }
        return "eui_" + m13127d("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: k */
    public static boolean m13135k() {
        return !TextUtils.isEmpty(m13127d("ro.letv.release.version"));
    }

    /* renamed from: l */
    public static String m13136l() {
        if (!m13129e()) {
            return "";
        }
        return "miui_" + m13127d("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: m */
    public static String m13137m() {
        String n = m13138n();
        if (n == null || !n.toLowerCase().contains("emotionui")) {
            return "";
        }
        return n + "_" + Build.DISPLAY;
    }

    /* renamed from: n */
    public static String m13138n() {
        return m13127d("ro.build.version.emui");
    }

    /* renamed from: o */
    public static boolean m13139o() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: p */
    public static String m13140p() {
        if (m13139o()) {
            try {
                String d = m13127d("ro.smartisan.version");
                return "smartisan_" + d;
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    /* renamed from: q */
    public static String m13141q() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    /* renamed from: r */
    public static boolean m13142r() {
        if (f10241g == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String k = C4014u.m13246k("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(k)) {
                f10241g = 0;
            } else {
                f10241g = 1;
            }
        }
        if (f10241g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static String m13143s() {
        if (!m13142r()) {
            return "";
        }
        String k = C4014u.m13246k("ro.build.version.kllkrom");
        return "coloros_" + m13127d(k) + "_" + Build.DISPLAY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (android.os.Build.BRAND.toLowerCase().startsWith("huawei") == false) goto L_0x0017;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13144t() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002b
        L_0x0017:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4003m.m13144t():boolean");
    }

    /* renamed from: a */
    public static boolean m13122a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m13138n();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || m13144t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r5 = null;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ExcHandler: all (r4v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC, Splitter:B:39:0x0079] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13126c(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.<init>()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r6 = "getprop "
            r5.append(r6)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.append(r8)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStream r7 = r4.getInputStream()     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.lang.String r2 = r5.readLine()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r4.exitValue()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x007c
        L_0x003b:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r0, r8)
            goto L_0x007c
        L_0x0040:
            r3 = move-exception
            goto L_0x0048
        L_0x0042:
            r5 = r3
        L_0x0043:
            r3 = r4
            goto L_0x0074
        L_0x0045:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "Unable to read sysprop "
            r4.append(r6)     // Catch:{ all -> 0x0067 }
            r4.append(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0067 }
            com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r8, r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r0, r8)
        L_0x0066:
            return r2
        L_0x0067:
            r8 = move-exception
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r0, r2)
        L_0x0072:
            throw r8
        L_0x0073:
            r5 = r3
        L_0x0074:
            r3.destroy()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            if (r5 == 0) goto L_0x007c
            r5.close()     // Catch:{ IOException -> 0x003b }
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4003m.m13126c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static String m13127d(String str) {
        String str2;
        try {
            str2 = m13146v();
            try {
                if (TextUtils.isEmpty(str2)) {
                    final C2954f fVar = new C2954f(new C4005a(str), 5, 2);
                    C2952e.m8308a(new C2955g("_getSystemPropertyTask") {
                        public void run() {
                            fVar.run();
                        }
                    }, 5);
                    str2 = (String) fVar.get(1, TimeUnit.SECONDS);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = "";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.m$a */
    /* compiled from: RomUtils */
    public static class C4005a implements Callable<String> {

        /* renamed from: a */
        private String f10243a;

        public C4005a(String str) {
            this.f10243a = str;
        }

        /* renamed from: a */
        public String call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String b = C4003m.m13126c(this.f10243a);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C2975l.m8384b("RomUtils", "property:" + b + ",getSystemProperty use time :" + currentTimeMillis2);
            if (!TextUtils.isEmpty(b)) {
                try {
                    if (C3953b.m12901c()) {
                        C2975l.m8390d("RomUtils", "SPMultiHelper-getPropertyFromSPMultiHelper:" + b);
                        C3966a.m12971a("rom_info", "rom_property_info", b);
                    } else {
                        C2975l.m8390d("RomUtils", "SP-getPropertyFromSP:" + b);
                        C2985u.m8442a("rom_info", C3578m.m11231a()).mo17903a("rom_property_info", b);
                    }
                } catch (Throwable unused) {
                }
            }
            return b;
        }
    }

    /* renamed from: v */
    private static String m13146v() {
        try {
            if (C3953b.m12901c()) {
                String b = C3966a.m12977b("rom_info", "rom_property_info", "");
                C2975l.m8387c("RomUtils", "get Property From SPMultiHelper..." + b);
                return b;
            }
            String b2 = C2985u.m8442a("rom_info", C3578m.m11231a()).mo17910b("rom_property_info", "");
            C2975l.m8387c("RomUtils", "get Property From SP...=" + b2);
            return b2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
