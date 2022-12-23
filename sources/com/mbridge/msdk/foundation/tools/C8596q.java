package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.q */
/* compiled from: SameDiTool */
public final class C8596q extends C8575e {

    /* renamed from: a */
    private static String f20770a = null;

    /* renamed from: b */
    private static String f20771b = null;

    /* renamed from: c */
    private static int f20772c = -1;

    /* renamed from: d */
    private static int f20773d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile int f20774e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f20775f = "";

    /* renamed from: g */
    private static String f20776g = "";

    /* renamed from: h */
    private static String f20777h = "";

    /* renamed from: i */
    private static String f20778i = "";

    /* renamed from: j */
    private static int f20779j = 0;

    /* renamed from: k */
    private static String f20780k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static String f20781l = "";

    /* renamed from: m */
    private static int f20782m = -1;

    /* renamed from: n */
    private static String f20783n = "";

    /* renamed from: o */
    private static int f20784o = 0;

    /* renamed from: p */
    private static String f20785p = "";

    /* renamed from: q */
    private static String f20786q;

    /* renamed from: r */
    private static int f20787r;

    /* renamed from: a */
    public static int m24816a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static void m24824b(Context context) {
        try {
            m24832f();
            m24843k(context);
            m24833f(context);
            m24830e(context);
            m24828d(context);
            m24817a();
            m24825c();
            m24839i();
            m24826c(context);
            m24831e();
            C8413a.f20321c = false;
            C8413a.f20320b = C8613y.m24927a("android.permission.ACCESS_NETWORK_STATE", context);
            m24835g(context);
            m24859t();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m24817a() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MODEL;
    }

    /* renamed from: b */
    public static String m24822b() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: c */
    public static String m24825c() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    /* renamed from: c */
    public static String m24826c(Context context) {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f20780k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() != null) {
                    if (context.getResources().getConfiguration() != null) {
                        Locale locale = context.getResources().getConfiguration().locale;
                        if (locale == null) {
                            return "en-US";
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            f20780k = locale.toLanguageTag();
                        } else {
                            f20780k = locale.getLanguage() + "-" + locale.getCountry();
                        }
                        return f20780k;
                    }
                }
                return "en-US";
            } catch (Throwable th) {
                C8608u.m24880a("SameDiTool", th.getMessage());
                f20780k = "en-US";
            }
        }
        return f20780k;
    }

    /* renamed from: d */
    public static int m24828d(Context context) {
        Configuration configuration;
        if (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null) {
            return 1;
        }
        int i = configuration.orientation;
        if (i == 2) {
            return 2;
        }
        if (i == 1) {
        }
        return 1;
    }

    /* renamed from: e */
    public static int m24830e(Context context) {
        if (context == null) {
            return f20779j;
        }
        int i = f20779j;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f20779j = i2;
            return i2;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: f */
    public static String m24833f(Context context) {
        if (context == null) {
            return f20778i;
        }
        try {
            if (!TextUtils.isEmpty(f20778i)) {
                return f20778i;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f20778i = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static int m24835g(Context context) {
        if (context == null) {
            return f20784o;
        }
        if (f20784o == 0) {
            try {
                f20784o = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e) {
                C8608u.m24884d("SameDiTool", e.getMessage());
            }
        }
        return f20784o;
    }

    /* renamed from: h */
    public static int m24837h(Context context) {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap j = m24841j(context);
            return j.get("width") == null ? displayMetrics.widthPixels : ((Integer) j.get("width")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static int m24838i(Context context) {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap j = m24841j(context);
            return j.get("height") == null ? displayMetrics.heightPixels : ((Integer) j.get("height")).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static HashMap m24841j(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e) {
            C8608u.m24881a("SameDiTool", e.getMessage(), e);
        }
        return hashMap;
    }

    /* renamed from: k */
    public static String m24843k(Context context) {
        if (context == null) {
            return f20777h;
        }
        try {
            if (!TextUtils.isEmpty(f20777h)) {
                return f20777h;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f20777h = str;
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: l */
    public static void m24845l(final Context context) {
        if (context != null) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    m24768a(context);
                } else {
                    new Handler(context.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C8575e.m24768a(context);
                        }
                    });
                }
            } catch (Exception e) {
                C8608u.m24881a("SameDiTool", "", e);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24847m(final android.content.Context r8) {
        /*
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r0 = com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a.m5633a()
            java.lang.String r1 = "authority_general_data"
            boolean r0 = r0.mo15819a((java.lang.String) r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r0 = f20775f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "SameDiTool"
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "mbridge_ua"
            java.lang.String r3 = ""
            java.lang.Object r0 = com.mbridge.msdk.foundation.tools.C8554aa.m24733b(r8, r0, r3)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0027 }
            f20775f = r0     // Catch:{ all -> 0x0027 }
            goto L_0x002f
        L_0x0027:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r2, r3, r0)
        L_0x002f:
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00c9 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00c9 }
            r4 = 1
            r5 = 0
            if (r0 != r3) goto L_0x003d
            r0 = r4
            goto L_0x003e
        L_0x003d:
            r0 = r5
        L_0x003e:
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = f20775f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00b2
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0054 }
            r3 = 17
            if (r0 < r3) goto L_0x0054
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r8)     // Catch:{ all -> 0x0054 }
            f20775f = r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            java.lang.String r0 = f20775f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Class<android.webkit.WebSettings> r0 = android.webkit.WebSettings.class
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0086 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r5] = r7     // Catch:{ all -> 0x0086 }
            java.lang.Class<android.webkit.WebView> r7 = android.webkit.WebView.class
            r6[r4] = r7     // Catch:{ all -> 0x0086 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch:{ all -> 0x0086 }
            r0.setAccessible(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0086 }
            r3[r5] = r8     // Catch:{ all -> 0x0086 }
            r3[r4] = r1     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = r0.newInstance(r3)     // Catch:{ all -> 0x0086 }
            android.webkit.WebSettings r1 = (android.webkit.WebSettings) r1     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.getUserAgentString()     // Catch:{ all -> 0x0086 }
            f20775f = r1     // Catch:{ all -> 0x0086 }
            r0.setAccessible(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
        L_0x008a:
            java.lang.String r0 = f20775f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00a6
            android.webkit.WebView r0 = new android.webkit.WebView     // Catch:{ all -> 0x00a2 }
            r0.<init>(r8)     // Catch:{ all -> 0x00a2 }
            android.webkit.WebSettings r0 = r0.getSettings()     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r0.getUserAgentString()     // Catch:{ all -> 0x00a2 }
            f20775f = r0     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
        L_0x00a6:
            java.lang.String r0 = f20775f     // Catch:{ all -> 0x00c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00d1
            m24856r()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00b2:
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Exception -> 0x00c0 }
            com.mbridge.msdk.foundation.tools.q$2 r1 = new com.mbridge.msdk.foundation.tools.q$2     // Catch:{ Exception -> 0x00c0 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c0 }
            r0.start()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00d1
        L_0x00c0:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00c5:
            m24856r()     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r2, r1, r0)
        L_0x00d1:
            m24857r(r8)
            java.lang.String r8 = f20775f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8596q.m24847m(android.content.Context):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m24857r(Context context) {
        try {
            C8554aa.m24732a(context, "mbridge_ua", f20775f);
        } catch (Throwable th) {
            C8608u.m24881a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: d */
    public static String m24829d() {
        if (TextUtils.isEmpty(f20775f)) {
            m24847m(C2350a.m5601e().mo15792g());
        }
        return f20775f;
    }

    /* renamed from: r */
    private static void m24856r() {
        String str = Build.VERSION.RELEASE;
        String a = m24817a();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a)) {
            f20775f = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        f20775f = "Mozilla/5.0 (Linux; Android " + str + "; " + a + " Build/) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    /* renamed from: n */
    public static int m24849n(Context context) {
        try {
            final Context g = C2350a.m5601e().mo15792g();
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f20774e;
            }
            if (g == null) {
                return f20774e;
            }
            if (f20774e != -1) {
                try {
                    C85993 r2 = new Runnable() {
                        public final void run() {
                            try {
                                ConnectivityManager connectivityManager = (ConnectivityManager) g.getSystemService("connectivity");
                                if (connectivityManager != null && C8413a.f20320b) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    if (activeNetworkInfo == null) {
                                        int unused = C8596q.f20774e = 0;
                                    } else if (activeNetworkInfo.getType() == 1) {
                                        int unused2 = C8596q.f20774e = 9;
                                    } else {
                                        TelephonyManager telephonyManager = (TelephonyManager) g.getSystemService("phone");
                                        if (telephonyManager == null) {
                                            int unused3 = C8596q.f20774e = 0;
                                        } else {
                                            int unused4 = C8596q.f20774e = C8596q.m24816a(telephonyManager.getNetworkType());
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                C8608u.m24881a("SameDiTool", e.getMessage(), e);
                                int unused5 = C8596q.f20774e = 0;
                            }
                        }
                    };
                    if (C8442b.m24390c().getActiveCount() < 1) {
                        C8442b.m24390c().execute(r2);
                    }
                } catch (Throwable th) {
                    C8608u.m24884d("SameDiTool", th.getMessage());
                }
                return f20774e;
            }
            f20774e = 0;
            return f20774e;
        } catch (Exception e) {
            C8608u.m24881a("SameDiTool", e.getMessage(), e);
            f20774e = 0;
            return f20774e;
        }
    }

    /* renamed from: a */
    public static String m24818a(Context context, int i) {
        TelephonyManager telephonyManager;
        if (i == 0 || i == 9) {
            return "";
        }
        try {
            if (!C8413a.f20320b || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return "";
            }
            return String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            C8608u.m24881a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: e */
    public static String m24831e() {
        try {
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f20781l)) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            String unused = C8596q.f20781l = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }).start();
                return f20781l;
            }
            return f20781l;
        } catch (Throwable th) {
            C8608u.m24881a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: f */
    public static String m24832f() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f20776g)) {
            int g = m24834g();
            f20776g = g + "";
        }
        return f20776g;
    }

    /* renamed from: g */
    public static int m24834g() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m24836h() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m24820a(String str) {
        f20771b = C8595p.m24814a(str);
        f20770a = str;
    }

    /* renamed from: i */
    public static String m24839i() {
        String str;
        if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_DEVICE_ID) && (str = f20770a) != null) {
            return str;
        }
        return "";
    }

    /* renamed from: j */
    public static String m24840j() {
        String str;
        if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_DEVICE_ID) && (str = f20771b) != null) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public static String m24819a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(f20783n)) {
                return f20783n;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                f20783n = context.getPackageManager().getInstallerPackageName(str);
                C8608u.m24880a("SameDiTool", "PKGSource:" + f20783n);
            }
            return f20783n;
        } catch (Exception e) {
            C8608u.m24881a("SameDiTool", e.getMessage(), e);
        }
    }

    /* renamed from: k */
    public static String m24842k() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[SYNTHETIC, Splitter:B:31:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f A[SYNTHETIC, Splitter:B:35:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0 A[SYNTHETIC, Splitter:B:42:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5 A[SYNTHETIC, Splitter:B:46:0x00a5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0081=Splitter:B:28:0x0081, B:39:0x0097=Splitter:B:39:0x0097} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24844l() {
        /*
            java.lang.String r0 = "SameDiTool"
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r1 = com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a.m5633a()
            java.lang.String r2 = "authority_general_data"
            boolean r1 = r1.mo15819a((java.lang.String) r2)
            if (r1 != 0) goto L_0x0011
            java.lang.String r0 = ""
            return r0
        L_0x0011:
            int r1 = f20787r
            java.lang.String r2 = "GB"
            if (r1 <= 0) goto L_0x0029
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = f20787r
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0029:
            java.lang.String r1 = "/proc/meminfo"
            r3 = 0
            f20787r = r3
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0093, all -> 0x007d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0093, all -> 0x007d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0078, all -> 0x0073 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch:{ Exception -> 0x0078, all -> 0x0073 }
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            r5 = 1
            r3 = r3[r5]     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            r1.close()     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            if (r3 == 0) goto L_0x0068
            java.lang.Float r5 = new java.lang.Float     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            r6 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r6
            r5.<init>(r3)     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            double r5 = r5.doubleValue()     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            double r5 = java.lang.Math.ceil(r5)     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            int r3 = (int) r5     // Catch:{ Exception -> 0x0071, all -> 0x006f }
            f20787r = r3     // Catch:{ Exception -> 0x0071, all -> 0x006f }
        L_0x0068:
            r4.close()     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            r1.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x006f:
            r3 = move-exception
            goto L_0x0081
        L_0x0071:
            r3 = move-exception
            goto L_0x0097
        L_0x0073:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0081
        L_0x0078:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0097
        L_0x007d:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L_0x0081:
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x00bf }
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r5, r3)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x0093:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L_0x0097:
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x00bf }
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r5, r3)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x00a3
            r4.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = f20787r
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00bf:
            r0 = move-exception
            if (r4 == 0) goto L_0x00c5
            r4.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            if (r1 == 0) goto L_0x00cf
            r1.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00cf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8596q.m24844l():java.lang.String");
    }

    /* renamed from: o */
    public static String m24851o(Context context) {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e) {
            C8608u.m24881a("SameDiTool", e.getMessage(), e);
            return "";
        } catch (Throwable th) {
            C8608u.m24881a("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.FileReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[SYNTHETIC, Splitter:B:36:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088 A[SYNTHETIC, Splitter:B:41:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097 A[SYNTHETIC, Splitter:B:48:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5 A[SYNTHETIC, Splitter:B:53:0x00a5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0071=Splitter:B:33:0x0071, B:45:0x008e=Splitter:B:45:0x008e} */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24853p(android.content.Context r9) {
        /*
            java.lang.String r0 = "SameDiTool"
            com.mbridge.msdk.foundation.controller.authoritycontroller.a r1 = com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a.m5633a()
            java.lang.String r2 = "authority_general_data"
            boolean r1 = r1.mo15819a((java.lang.String) r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            if (r9 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r1 = f20786q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001f
            java.lang.String r9 = f20786q
            return r9
        L_0x001f:
            java.lang.String r1 = "/proc/meminfo"
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x008c, all -> 0x006f }
            r4.<init>(r1)     // Catch:{ IOException -> 0x008c, all -> 0x006f }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r5 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            java.lang.String r3 = r1.readLine()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r5 = 1
            r3 = r3[r5]     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            long r5 = r3.longValue()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r7 = 1024(0x400, double:5.06E-321)
            long r5 = r5 * r7
            java.lang.String r9 = android.text.format.Formatter.formatFileSize(r9, r5)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            f20786q = r9     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r1.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0058
        L_0x0050:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r2, r1)
        L_0x0058:
            r4.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0064
        L_0x005c:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r2, r1)
        L_0x0064:
            return r9
        L_0x0065:
            r9 = move-exception
            r3 = r1
            goto L_0x0071
        L_0x0068:
            r9 = move-exception
            r3 = r1
            goto L_0x008e
        L_0x006b:
            r9 = move-exception
            goto L_0x0071
        L_0x006d:
            r9 = move-exception
            goto L_0x008e
        L_0x006f:
            r9 = move-exception
            r4 = r3
        L_0x0071:
            java.lang.String r1 = r9.getMessage()     // Catch:{ all -> 0x00b2 }
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r9)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r9)
        L_0x0086:
            if (r4 == 0) goto L_0x00b1
            r4.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00b1
        L_0x008c:
            r9 = move-exception
            r4 = r3
        L_0x008e:
            java.lang.String r1 = r9.getMessage()     // Catch:{ all -> 0x00b2 }
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r9)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x00a3
            r3.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00a3
        L_0x009b:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r9)
        L_0x00a3:
            if (r4 == 0) goto L_0x00b1
            r4.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r9 = move-exception
            java.lang.String r1 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r1, r9)
        L_0x00b1:
            return r2
        L_0x00b2:
            r9 = move-exception
            if (r3 == 0) goto L_0x00c1
            r3.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00c1
        L_0x00b9:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r2, r1)
        L_0x00c1:
            if (r4 == 0) goto L_0x00cf
            r4.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cf
        L_0x00c7:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r0, r2, r1)
        L_0x00cf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8596q.m24853p(android.content.Context):java.lang.String");
    }

    /* renamed from: m */
    public static String m24846m() {
        String str = "";
        try {
            Context g = C2350a.m5601e().mo15792g();
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            long s = m24858s();
            String str2 = "app_tki_" + currentTimeMillis + "_" + s;
            String str3 = (String) C8554aa.m24733b(g, str2, str);
            try {
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", str);
                    jSONObject.put("2", String.valueOf(s));
                    jSONObject.put("3", String.valueOf(currentTimeMillis));
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_TYPE_ALTER_NATIVE_STR_4, str);
                    jSONObject.put("5", str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                str = C8552a.m24730a(jSONObject.toString());
                C8554aa.m24732a(g, str2, str);
                return str;
            } catch (Exception e2) {
                e = e2;
                str = str3;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: n */
    public static int m24848n() {
        try {
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            Context g = C2350a.m5601e().mo15792g();
            long j = 0;
            long longValue = ((Long) C8554aa.m24733b(g, "FreeRamSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f20773d == -1) {
                Context g2 = C2350a.m5601e().mo15792g();
                if (g2 != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) g2.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                }
                f20773d = Long.valueOf((j / 1000) / 1000).intValue();
                C8554aa.m24732a(g, "FreeRamSize", Long.valueOf(currentTimeMillis));
            }
            return f20773d;
        } catch (Throwable th) {
            C8608u.m24881a("SameDiTool", th.getMessage(), th);
        }
    }

    /* renamed from: s */
    private static long m24858s() {
        Context g = C2350a.m5601e().mo15792g();
        if (g == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) g.getSystemService("activity")).getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return 0;
    }

    /* renamed from: o */
    public static int m24850o() {
        if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (f20772c < 1) {
            try {
                Context g = C2350a.m5601e().mo15792g();
                long longValue = ((Long) C8554aa.m24733b(g, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f20772c == -1) {
                    f20772c = Long.valueOf((m24858s() / 1000) / 1000).intValue();
                    C8554aa.m24732a(g, "TotalRamSize", Long.valueOf(currentTimeMillis));
                }
            } catch (Throwable th) {
                C8608u.m24881a("SameDiTool", th.getMessage(), th);
            }
        }
        return f20772c;
    }

    /* renamed from: p */
    public static int m24852p() {
        return f20782m;
    }

    /* renamed from: t */
    private static String m24859t() {
        if (!TextUtils.isEmpty(f20785p)) {
            return f20785p;
        }
        JSONObject jSONObject = new JSONObject();
        String str = null;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            C8608u.m24884d("SameDiTool", th.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str) || !str.equals("harmony")) {
                f20785p = "android";
                return f20785p;
            }
            jSONObject.put("osType", str);
            Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
            jSONObject.put("version", (String) cls2.getMethod("getVersion", new Class[0]).invoke(cls2, new Object[0]));
            try {
                jSONObject.put("pure_state", Settings.Secure.getInt(C2350a.m5601e().mo15792g().getContentResolver(), "pure_mode_state", -1));
            } catch (Throwable th2) {
                C8608u.m24884d("SameDiTool", th2.getMessage());
            }
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                jSONObject2 = C8595p.m24814a(jSONObject2);
            }
            f20785p = jSONObject2;
            return f20785p;
        } catch (Throwable th3) {
            C8608u.m24884d("SameDiTool", th3.getMessage());
        }
    }
}
