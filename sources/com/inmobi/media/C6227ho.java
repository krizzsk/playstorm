package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.ho */
/* compiled from: SdkContext */
public final class C6227ho {

    /* renamed from: a */
    private static final String f15774a = C6227ho.class.getSimpleName();

    /* renamed from: b */
    private static Context f15775b;

    /* renamed from: c */
    private static String f15776c = "";

    /* renamed from: d */
    private static String f15777d = null;

    /* renamed from: e */
    private static String f15778e = null;

    /* renamed from: f */
    private static AtomicBoolean f15779f = new AtomicBoolean();

    /* renamed from: g */
    private static boolean f15780g = false;

    /* renamed from: h */
    private static final ExecutorService f15781h = Executors.newSingleThreadExecutor(new C6237ht(f15774a));

    /* renamed from: a */
    public static void m18543a(Runnable runnable) {
        f15781h.submit(runnable);
    }

    /* renamed from: e */
    private static void m18557e(Context context) {
        m18538a(context.getApplicationContext());
        f15779f.set(true);
        if (Build.VERSION.SDK_INT < 17 && f15776c == null) {
            try {
                f15776c = new WebView(context).getSettings().getUserAgentString();
            } catch (Exception unused) {
                m18538a((Context) null);
            }
        }
    }

    /* renamed from: a */
    public static void m18541a(Context context, String str) {
        m18557e(context);
        f15777d = str;
    }

    /* renamed from: b */
    public static void m18547b(Context context, String str) {
        m18557e(context);
        f15778e = str;
    }

    /* renamed from: a */
    public static boolean m18545a() {
        return f15775b != null;
    }

    /* renamed from: b */
    public static boolean m18550b() {
        return (f15775b == null || f15777d == null) ? false : true;
    }

    /* renamed from: c */
    public static Context m18551c() {
        return f15775b;
    }

    /* renamed from: d */
    public static Application m18554d() {
        Context context = f15775b;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* renamed from: a */
    public static void m18538a(Context context) {
        f15775b = context;
    }

    /* renamed from: a */
    public static void m18544a(boolean z) {
        f15780g = z;
    }

    /* renamed from: e */
    public static boolean m18558e() {
        return f15780g;
    }

    /* renamed from: f */
    public static String m18559f() {
        String str = f15777d;
        return str == null ? f15778e : str;
    }

    /* renamed from: g */
    public static String m18561g() {
        return f15777d;
    }

    /* renamed from: h */
    public static String m18563h() {
        return f15778e;
    }

    /* renamed from: i */
    public static String m18564i() {
        if (TextUtils.isEmpty(f15776c) && Build.VERSION.SDK_INT >= 17) {
            f15776c = m18560f(f15775b);
        }
        return f15776c;
    }

    /* renamed from: j */
    public static boolean m18565j() {
        return f15779f.get();
    }

    /* renamed from: b */
    public static void m18549b(boolean z) {
        f15779f.set(z);
    }

    /* renamed from: b */
    public static File m18546b(Context context) {
        return new File(context.getFilesDir(), "im_cached_content");
    }

    /* renamed from: c */
    public static File m18552c(Context context) {
        return new File(context.getFilesDir(), "as_cached_content");
    }

    /* renamed from: a */
    public static void m18542a(File file, String str) {
        if (str == null || str.trim().length() == 0) {
            C6272is.m18744a(file);
        } else {
            C6272is.m18744a(new File(file, str));
        }
    }

    /* renamed from: k */
    public static void m18566k() {
        Context c = m18551c();
        if (c != null) {
            File b = m18546b(c);
            if (!b.mkdir()) {
                b.isDirectory();
            }
        }
    }

    /* renamed from: l */
    public static void m18567l() {
        Context c = m18551c();
        if (c != null) {
            File c2 = m18552c(c);
            if (!c2.mkdir()) {
                c2.isDirectory();
            }
        }
    }

    /* renamed from: f */
    private static String m18560f(Context context) {
        try {
            return m18562g(context);
        } catch (C5898bq e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            try {
                String property = System.getProperty("http.agent");
                if (property == null) {
                    return "";
                }
                return property;
            } catch (Exception e2) {
                C6181gg.m18398a().mo35357a(new C6217hg(e2));
                return "";
            }
        }
    }

    /* renamed from: g */
    private static String m18562g(Context context) throws C5898bq {
        try {
            return WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Exception e) {
            throw new C5898bq(e.getMessage());
        }
    }

    /* renamed from: c */
    public static boolean m18553c(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 23) {
            return m18556d(context, str);
        }
        if (packageManager.checkPermission(str, packageManager.getNameForUid(Binder.getCallingUid())) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m18556d(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String equals : packageInfo.requestedPermissions) {
                        if (equals.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m18539a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: a */
    public static void m18540a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static File m18537a(String str) {
        m18566k();
        File b = m18546b(m18551c());
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode() & Integer.MAX_VALUE);
        return new File(b, valueOf + String.valueOf(str.substring(length).hashCode() & Integer.MAX_VALUE));
    }

    /* renamed from: b */
    public static void m18548b(String str) {
        if (m18551c() != null) {
            C6216hf.m18493a(m18551c(), "coppa_store").mo35416a("im_accid", str);
        }
    }

    /* renamed from: m */
    public static String m18568m() {
        if (m18551c() != null) {
            return C6216hf.m18493a(m18551c(), "coppa_store").mo35419b("im_accid");
        }
        return null;
    }

    /* renamed from: d */
    public static void m18555d(Context context) {
        try {
            File file = new File(context.getCacheDir(), "im_cached_content");
            if (file.exists()) {
                C6272is.m18744a(file);
            }
        } catch (Exception unused) {
        }
    }
}
