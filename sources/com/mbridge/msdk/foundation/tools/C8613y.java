package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8404e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2378i;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.tools.C8585m;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.tapjoy.TapjoyConstants;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.tools.y */
/* compiled from: SameTool */
public final class C8613y extends C8578h {

    /* renamed from: a */
    private static char[] f20816a = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: b */
    private static char[] f20817b = {'.', 'X'};

    /* renamed from: c */
    private static int f20818c = 0;

    /* renamed from: d */
    private static int f20819d = 1;

    /* renamed from: e */
    private static int f20820e = 2;

    /* renamed from: f */
    private static int f20821f = 3;

    /* renamed from: g */
    private static int f20822g = 0;

    /* renamed from: h */
    private static int f20823h = 7;

    /* renamed from: i */
    private static int f20824i = 14;

    /* renamed from: j */
    private static int f20825j = 19;

    /* renamed from: k */
    private static int f20826k = 16;

    /* renamed from: l */
    private static int f20827l = 26;

    /* renamed from: m */
    private static String f20828m = "[一-龥]";

    /* renamed from: n */
    private static Pattern f20829n = Pattern.compile("[一-龥]");

    /* renamed from: o */
    private static int f20830o = 1;

    /* renamed from: p */
    private static boolean f20831p = true;

    /* renamed from: q */
    private static Map<String, String> f20832q;

    /* renamed from: r */
    private static Map<String, String> f20833r;

    /* renamed from: s */
    private static volatile Boolean f20834s = null;

    /* renamed from: a */
    public static <T extends String> boolean m24926a(T t) {
        return t == null || t.length() == 0;
    }

    /* renamed from: b */
    public static boolean m24934b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m24939c(Context context) {
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m24925a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    /* renamed from: d */
    public static float m24941d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f = context.getResources().getDisplayMetrics().density;
            if (f == 0.0f) {
                return 2.5f;
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return 2.5f;
        }
    }

    /* renamed from: a */
    public static int m24912a(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: b */
    public static int m24929b(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[SYNTHETIC, Splitter:B:19:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m24914a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            if (r3 == 0) goto L_0x001a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            int r4 = r3.available()     // Catch:{ Exception -> 0x0018, all -> 0x0015 }
            long r0 = (long) r4
            r2 = r3
            goto L_0x001d
        L_0x0015:
            r4 = move-exception
            r2 = r3
            goto L_0x0024
        L_0x0018:
            r2 = r3
            goto L_0x002a
        L_0x001a:
            r4.createNewFile()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
        L_0x001d:
            if (r2 == 0) goto L_0x002d
        L_0x001f:
            r2.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x002d
        L_0x0023:
            r4 = move-exception
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            throw r4
        L_0x002a:
            if (r2 == 0) goto L_0x002d
            goto L_0x001f
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24914a(java.io.File):long");
    }

    /* renamed from: e */
    public static int m24944e(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static float m24946f(Context context) {
        return (float) context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static int m24911a() {
        int i = f20830o;
        f20830o = i + 1;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ Exception -> 0x005f }, LOOP:0: B:17:0x004a->B:18:0x004c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24915a(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x005f }
            java.lang.String r2 = r2.mo15793h()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.c.a r1 = r1.mo15563b(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x001c
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.c.a r1 = r1.mo15562b()     // Catch:{ Exception -> 0x005f }
        L_0x001c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x005f }
            r2.<init>()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r1 = r1.mo15443Q()     // Catch:{ Exception -> 0x005f }
            r3 = 1
            if (r1 != r3) goto L_0x0054
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x005f }
            android.content.Context r1 = r1.mo15792g()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.g r1 = com.mbridge.msdk.foundation.p066db.C2376g.m5723a((android.content.Context) r1)     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.j r1 = com.mbridge.msdk.foundation.p066db.C2379j.m5740a((com.mbridge.msdk.foundation.p066db.C2374f) r1)     // Catch:{ Exception -> 0x005f }
            long[] r1 = r1.mo15908a()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r3 = r1.length     // Catch:{ Exception -> 0x005f }
            if (r3 <= r6) goto L_0x0049
            if (r6 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            int r6 = r3 - r6
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 >= r3) goto L_0x0054
            r4 = r1[r6]     // Catch:{ Exception -> 0x005f }
            r2.put(r4)     // Catch:{ Exception -> 0x005f }
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0054:
            int r6 = r2.length()     // Catch:{ Exception -> 0x005f }
            if (r6 <= 0) goto L_0x0063
            java.lang.String r0 = m24918a((org.json.JSONArray) r2)     // Catch:{ Exception -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24915a(int):java.lang.String");
    }

    /* renamed from: a */
    public static String m24918a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
        }
        int I = b.mo15435I();
        if (jSONArray.length() <= I) {
            return jSONArray.toString();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < I; i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2.toString();
    }

    /* renamed from: a */
    public static boolean m24927a(String str, Context context) {
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m24935b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static double m24928b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static int m24913a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            C8608u.m24881a("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    /* renamed from: a */
    public static double m24910a(Double d) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            if (C8556ac.m24738b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: n */
    private static DisplayMetrics m24959n(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
                return displayMetrics;
            }
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    /* renamed from: g */
    public static int m24948g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m24959n(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m24950h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m24959n(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static int m24952i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static int m24954j(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m24921a(View view) {
        if (view != null) {
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    view.setSystemUiVisibility(4102);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static int m24956k(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m24922a(ImageView imageView) {
        if (imageView != null) {
            try {
                imageView.setImageResource(0);
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageURI((Uri) null);
                imageView.setImageBitmap((Bitmap) null);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static List<String> m24932b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (C8556ac.m24738b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C8608u.m24881a("SameTools", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: c */
    public static String m24938c(String str) {
        try {
            if (C8556ac.m24738b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            C8608u.m24881a("SameTools", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m24933b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: l */
    public static boolean m24957l(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static int m24958m(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                b = C2283b.m5275a().mo15562b();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b.mo15486ay();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONArray m24920a(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                b = C2283b.m5275a().mo15562b();
            }
            if (b != null && b.mo15443Q() == 1) {
                C8608u.m24882b("SameTools", "fqci cfc:" + b.mo15443Q());
                long[] a = C2379j.m5740a((C2374f) C2376g.m5723a(context)).mo15908a();
                if (a != null) {
                    for (long put : a) {
                        C8608u.m24882b("SameTools", "cfc campaignIds:" + a);
                        jSONArray.put(put);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static String m24931b(Context context, String str) {
        String str2 = "";
        try {
            JSONArray a = m24920a(context, str);
            if (a.length() > 0) {
                str2 = m24918a(a);
            }
            C8608u.m24882b("SameTools", "get excludes:" + str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static void m24923a(String str, CampaignEx campaignEx, int i) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C2350a.m5601e().mo15792g() != null) {
            C2378i a = C2378i.m5736a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
            C8404e eVar = new C8404e();
            eVar.mo57338a(System.currentTimeMillis());
            eVar.mo57341b(str);
            eVar.mo57339a(campaignEx.getId());
            eVar.mo57337a(i);
            a.mo15904a(eVar);
        }
    }

    /* renamed from: c */
    public static synchronized boolean m24940c(Context context, String str) {
        boolean z;
        synchronized (C8613y.class) {
            z = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (m24930b(str, context) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private static Object m24930b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m24936b(f20818c))).getMethod(String.valueOf(m24936b(f20820e)), new Class[]{String.class, Integer.TYPE}).invoke(Class.forName(String.valueOf(m24936b(f20819d))).getMethod(String.valueOf(m24936b(f20821f)), new Class[0]).invoke(context, new Object[0]), new Object[]{str, 8192});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static final char[] m24936b(int i) {
        StringBuilder sb;
        if (i == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C8611x.f20815b, f20823h)));
            sb.append(f20817b[f20822g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20823h, f20824i)));
            sb.append(f20817b[f20822g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20824i, f20826k)));
            sb.append(f20817b[f20822g]);
            sb.append(String.valueOf(C8610w.f20808c));
        } else if (i == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C8611x.f20815b, f20823h)));
            sb.append(f20817b[f20822g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20823h, f20824i)));
            sb.append(f20817b[f20822g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20825j, f20827l)));
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20826k, f20825j)));
            sb.append(String.valueOf(f20816a));
        } else if (i != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C8611x.f20815b, f20826k, f20825j)));
            sb.append(String.valueOf(C8610w.f20808c));
        }
        return sb.toString().toCharArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = new java.lang.StringBuilder("&rtins_type=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.append(0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m24917a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.y> r0 = com.mbridge.msdk.foundation.tools.C8613y.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0025 }
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x001b
            int r2 = r2.size()     // Catch:{ Exception -> 0x0025 }
            if (r2 <= 0) goto L_0x001b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            goto L_0x004b
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ all -> 0x0023 }
        L_0x002c:
            r1 = 0
            java.lang.Object r3 = m24930b((java.lang.String) r4, (android.content.Context) r3)     // Catch:{ Exception -> 0x0042 }
            r4 = 1
            if (r3 == 0) goto L_0x0036
            r3 = r4
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            if (r3 == 0) goto L_0x003d
            r2.append(r4)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x003d:
            r3 = 2
            r2.append(r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x0042:
            r2.append(r1)     // Catch:{ all -> 0x0023 }
        L_0x0045:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)
            return r2
        L_0x004b:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24917a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m24916a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.y> r0 = com.mbridge.msdk.foundation.tools.C8613y.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = m24917a((java.lang.String) r4, (android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x000f }
            r1.append(r2)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24916a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized java.lang.String m24943d(java.lang.String r10) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.y> r0 = com.mbridge.msdk.foundation.tools.C8613y.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r1.<init>()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.mo15793h()     // Catch:{ Exception -> 0x0138 }
            r1.append(r2)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ Exception -> 0x0138 }
            r1.append(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.mo15793h()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.c.a r1 = r1.mo15563b(r2)     // Catch:{ Exception -> 0x0138 }
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L_0x0047
            boolean r2 = r1.mo15474am()     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r1.mo15472ak()     // Catch:{ Exception -> 0x0138 }
            int r1 = r1.mo15473al()     // Catch:{ Exception -> 0x0138 }
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ Exception -> 0x0138 }
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0049
        L_0x0047:
            r1 = 1
            r4 = r3
        L_0x0049:
            if (r4 == 0) goto L_0x0132
            if (r2 != 0) goto L_0x004f
            goto L_0x0132
        L_0x004f:
            if (r1 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r4 = f20832q     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r4 = f20832q     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r4.containsKey(r10)     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r1 = f20832q     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0138 }
            monitor-exit(r0)
            return r10
        L_0x0067:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = ""
            r4.<init>(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ Exception -> 0x0138 }
            if (r5 == 0) goto L_0x0142
            int r6 = r5.length     // Catch:{ Exception -> 0x0138 }
            if (r6 <= 0) goto L_0x0142
            java.util.List r5 = m24919a((java.lang.StackTraceElement[]) r5)     // Catch:{ Exception -> 0x0138 }
            java.util.Collections.reverse(r5)     // Catch:{ Exception -> 0x0138 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0138 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0138 }
            r6.<init>()     // Catch:{ Exception -> 0x0138 }
        L_0x008c:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r7 == 0) goto L_0x00ca
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "com.android"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.os"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.app"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "java.lang.reflect.Method"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.view"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            boolean r8 = r6.contains(r7)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            r6.add(r7)     // Catch:{ Exception -> 0x0138 }
            goto L_0x008c
        L_0x00ca:
            int r5 = r6.size()     // Catch:{ Exception -> 0x0138 }
            int r2 = java.lang.Math.min(r5, r2)     // Catch:{ Exception -> 0x0138 }
            if (r2 <= 0) goto L_0x00eb
        L_0x00d4:
            if (r3 >= r2) goto L_0x00eb
            java.lang.Object r5 = r6.get(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0138 }
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x00e8
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x00d4
        L_0x00eb:
            r2 = 0
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0138 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0104
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r2.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "1"
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0138 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0138 }
        L_0x0104:
            if (r2 == 0) goto L_0x012e
            int r3 = r2.length()     // Catch:{ Exception -> 0x0138 }
            if (r3 <= 0) goto L_0x012e
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8552a.m24730a(r2)     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x012c
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0138 }
            if (r1 != 0) goto L_0x012c
            java.util.Map<java.lang.String, java.lang.String> r1 = f20832q     // Catch:{ Exception -> 0x0138 }
            if (r1 != 0) goto L_0x0127
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0138 }
            r1.<init>()     // Catch:{ Exception -> 0x0138 }
            f20832q = r1     // Catch:{ Exception -> 0x0138 }
        L_0x0127:
            java.util.Map<java.lang.String, java.lang.String> r1 = f20832q     // Catch:{ Exception -> 0x0138 }
            r1.put(r10, r2)     // Catch:{ Exception -> 0x0138 }
        L_0x012c:
            monitor-exit(r0)
            return r2
        L_0x012e:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0132:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0136:
            r10 = move-exception
            goto L_0x0146
        L_0x0138:
            r10 = move-exception
            java.lang.String r1 = "SameTools"
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0136 }
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r10)     // Catch:{ all -> 0x0136 }
        L_0x0142:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0146:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24943d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized void m24924a(String str, String str2) {
        synchronized (C8613y.class) {
            if (f20833r == null) {
                f20833r = new HashMap();
            }
            f20833r.put(C2350a.m5601e().mo15793h() + "_" + str, str2);
        }
    }

    /* renamed from: e */
    public static synchronized String m24945e(String str) {
        synchronized (C8613y.class) {
            String str2 = C2350a.m5601e().mo15793h() + "_" + str;
            if (f20833r == null || !f20833r.containsKey(str2)) {
                return null;
            }
            String str3 = f20833r.get(str2);
            return str3;
        }
    }

    /* renamed from: a */
    private static List<String> m24919a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement className : stackTraceElementArr) {
                arrayList.add(className.getClassName());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final int m24937c() {
        if (f20834s == null) {
            try {
                f20834s = C8585m.C8591a.f20764a.mo57773e();
            } catch (Exception e) {
                C8608u.m24884d("SameTools", e.getMessage());
            }
        }
        if (f20834s != null) {
            return f20834s.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m24947f(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("view");
            z = !TextUtils.isEmpty(queryParameter) && (queryParameter.equals("2") || queryParameter.equals(MBridgeConstans.DYNAMIC_VIEW_TYPE_ALTER_NATIVE_STR_4));
            try {
                if (!TextUtils.isEmpty(parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP))) {
                    return true;
                }
                return z;
            } catch (Exception e) {
                e = e;
                try {
                    C8608u.m24884d("SameTools", e.getMessage());
                    return false;
                } catch (Throwable unused) {
                    return z;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            C8608u.m24884d("SameTools", e.getMessage());
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m24949g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.ENDCARD_URL_IS_PLAYABLE);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter.equals("0");
            }
            return false;
        } catch (Exception e) {
            C8608u.m24884d("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m24951h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter.equals("1");
            }
            return false;
        } catch (Exception e) {
            C8608u.m24884d("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: i */
    public static int m24953i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return -1;
            }
            String queryParameter = parse.getQueryParameter("view");
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e) {
            C8608u.m24884d("SameTools", e.getMessage());
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if ((r5 + (r3 * 1000)) >= r7) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if ((r5 + (r3.mo15436J() * 1000)) >= r7) goto L_0x0073;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24955j(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.ConcurrentHashMap r14 = com.mbridge.msdk.foundation.same.p299a.C8417d.m24307a(r14)
            if (r14 == 0) goto L_0x009a
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x009a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
        L_0x0022:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r14.next()
            com.mbridge.msdk.foundation.entity.b r2 = (com.mbridge.msdk.foundation.entity.C8401b) r2
            if (r2 == 0) goto L_0x0022
            long r3 = r2.mo57305d()
            long r5 = r2.mo57306e()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 0
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r10 = 1
            r11 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L_0x004d
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0072
            goto L_0x0073
        L_0x004d:
            com.mbridge.msdk.c.b r3 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            java.lang.String r4 = r4.mo15793h()
            com.mbridge.msdk.c.a r3 = r3.mo15563b(r4)
            if (r3 != 0) goto L_0x0067
            com.mbridge.msdk.c.b r3 = com.mbridge.msdk.p054c.C2283b.m5275a()
            com.mbridge.msdk.c.a r3 = r3.mo15562b()
        L_0x0067:
            long r3 = r3.mo15436J()
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r10 = r11
        L_0x0073:
            if (r10 == 0) goto L_0x0022
            java.util.List r2 = r2.mo57302c()
            if (r2 == 0) goto L_0x0022
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0022
            r0.addAll(r2)
            goto L_0x0022
        L_0x0085:
            int r14 = r0.size()
            if (r14 <= 0) goto L_0x009a
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            r0.clear()
            r0.addAll(r14)
            java.lang.String r1 = r0.toString()
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8613y.m24955j(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static final String m24942d() {
        return C8585m.C8591a.f20764a.mo57774f();
    }
}
