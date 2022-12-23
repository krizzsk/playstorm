package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.adcolony.sdk.C0817e0;
import com.adjust.sdk.Constants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* renamed from: com.adcolony.sdk.q */
class C0934q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0820f f688a = new C0820f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0820f f689b = new C0820f();

    /* renamed from: c */
    private String f690c = "";

    /* renamed from: d */
    private boolean f691d;

    /* renamed from: e */
    private String f692e = "";

    /* renamed from: f */
    private C0823f1 f693f = C0764c0.m322b();

    /* renamed from: g */
    private String f694g = "";

    /* renamed from: com.adcolony.sdk.q$a */
    class C0935a implements C0856j0 {

        /* renamed from: com.adcolony.sdk.q$a$a */
        class C0936a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f695a;

            /* renamed from: com.adcolony.sdk.q$a$a$a */
            class C0937a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C0823f1 f696a;

                C0937a(C0823f1 f1Var) {
                    this.f696a = f1Var;
                }

                public void run() {
                    C0936a.this.f695a.mo10773a(this.f696a).mo10776c();
                }
            }

            C0936a(C0935a aVar, C0841h0 h0Var) {
                this.f695a = h0Var;
            }

            public void run() {
                C1038z0.m1202b((Runnable) new C0937a(C0714a.m136b().mo10843n().mo10978c(2000)));
            }
        }

        C0935a(C0934q qVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (!C1038z0.m1186a((Runnable) new C0936a(this, h0Var))) {
                new C0817e0.C0818a().mo10684a("Error retrieving device info, disabling AdColony.").mo10685a(C0817e0.f434i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C0938b implements Callable<C0823f1> {

        /* renamed from: a */
        final /* synthetic */ long f698a;

        C0938b(long j) {
            this.f698a = j;
        }

        /* renamed from: b */
        public C0823f1 call() {
            if (!C0934q.this.mo10961N() && this.f698a > 0) {
                C0934q.this.f688a.mo10700a(this.f698a);
            }
            return C0934q.this.mo10971b();
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C0939c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f700a;

        /* renamed from: b */
        final /* synthetic */ C1022y f701b;

        C0939c(Context context, C1022y yVar) {
            this.f700a = context;
            this.f701b = yVar;
        }

        public void run() {
            boolean z;
            String str;
            if (C0714a.f180e) {
                str = "00000000-0000-0000-0000-000000000000";
                z = true;
            } else {
                str = null;
                z = false;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f700a);
                    str = advertisingIdInfo.getId();
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (NoClassDefFoundError unused) {
                    new C0817e0.C0818a().mo10684a("Google Play Services Ads dependencies are missing.").mo10685a(C0817e0.f431f);
                } catch (NoSuchMethodError unused2) {
                    new C0817e0.C0818a().mo10684a("Google Play Services is out of date, please update to GPS 4.0+.").mo10685a(C0817e0.f431f);
                } catch (Exception e) {
                    new C0817e0.C0818a().mo10684a("Query Advertising ID failed with: ").mo10684a(Log.getStackTraceString(e)).mo10685a(C0817e0.f432g);
                }
                if (str == null && Build.MANUFACTURER.equals("Amazon")) {
                    str = C0934q.this.mo10984g();
                    z = C0934q.this.mo10985h();
                }
            }
            if (str == null) {
                new C0817e0.C0818a().mo10684a("Advertising ID is not available. ").mo10684a("Collecting Android ID instead of Advertising ID.").mo10685a(C0817e0.f431f);
                C1022y yVar = this.f701b;
                if (yVar != null) {
                    yVar.mo10858a(new Throwable("Advertising ID is not available."));
                }
            } else {
                C0934q.this.mo10969a(str);
                C0953s0 a = C0714a.m136b().mo10846q().mo10760a();
                if (a != null) {
                    a.f743d.put("advertisingId", C0934q.this.mo10983f());
                }
                C0934q.this.mo10980c(z);
                C1022y yVar2 = this.f701b;
                if (yVar2 != null) {
                    yVar2.mo10856a(C0934q.this.mo10983f());
                }
            }
            C0934q.this.mo10970a(true);
        }
    }

    /* renamed from: com.adcolony.sdk.q$d */
    class C0940d implements Callable<C0823f1> {

        /* renamed from: a */
        final /* synthetic */ long f703a;

        C0940d(long j) {
            this.f703a = j;
        }

        /* renamed from: b */
        public C0823f1 call() {
            if (!C0934q.this.mo10962O() && this.f703a > 0) {
                C0934q.this.f689b.mo10700a(this.f703a);
            }
            return C0934q.this.mo10977c();
        }
    }

    /* renamed from: com.adcolony.sdk.q$e */
    class C0941e implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a */
        final /* synthetic */ C1022y f705a;

        C0941e(C1022y yVar) {
            this.f705a = yVar;
        }

        public void onComplete(Task<AppSetIdInfo> task) {
            Throwable th;
            if (task.isSuccessful()) {
                C0934q.this.mo10975b(task.getResult().getId());
                C1022y yVar = this.f705a;
                if (yVar != null) {
                    yVar.mo10856a(C0934q.this.mo10988k());
                }
            } else {
                if (task.getException() != null) {
                    th = task.getException();
                } else {
                    th = new Throwable("Task failed with unknown exception.");
                }
                new C0817e0.C0818a().mo10684a("App Set ID is not available. Unexpected exception occurred: ").mo10684a(Log.getStackTraceString(th)).mo10685a(C0817e0.f432g);
                C1022y yVar2 = this.f705a;
                if (yVar2 != null) {
                    yVar2.mo10858a(th);
                }
            }
            C0934q.this.mo10976b(true);
        }
    }

    C0934q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo10948A() {
        return this.f691d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo10949B() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo10950C() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo10951D() {
        ActivityManager activityManager;
        Context a = C0714a.m129a();
        if (a == null || (activityManager = (ActivityManager) a.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public long mo10952E() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo10953F() {
        return Build.MODEL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo10954G() {
        Context a = C0714a.m129a();
        if (a == null) {
            return 2;
        }
        int i = a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo10955H() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public String mo10956I() {
        return "4.8.0";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public String mo10957J() {
        TelephonyManager telephonyManager;
        Context a = C0714a.m129a();
        if (a == null || (telephonyManager = (TelephonyManager) a.getSystemService("phone")) == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo10958K() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public String mo10959L() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo10960M() {
        mo10970a(false);
        mo10976b(false);
        C0714a.m135a("Device.get_info", (C0856j0) new C0935a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo10961N() {
        return this.f688a.mo10702a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo10962O() {
        return this.f689b.mo10702a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo10963P() {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10980c(boolean z) {
        this.f691d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0823f1 mo10981d() {
        C0823f1 b = C0764c0.m322b();
        C0857k b2 = C0714a.m136b();
        C0764c0.m319a(b, TapjoyConstants.TJC_CARRIER_NAME, mo10990m());
        C0764c0.m319a(b, "data_path", b2.mo10855z().mo11093b());
        C0764c0.m326b(b, "device_api", mo10987j());
        Rect w = mo11000w();
        C0764c0.m326b(b, "screen_width", w.width());
        C0764c0.m326b(b, "screen_height", w.height());
        C0764c0.m326b(b, "display_dpi", mo10999v());
        C0764c0.m319a(b, TapjoyConstants.TJC_DEVICE_TYPE_NAME, mo10998u());
        C0764c0.m319a(b, "locale_language_code", mo11002y());
        C0764c0.m319a(b, "ln", mo11002y());
        C0764c0.m319a(b, "locale_country_code", mo10993p());
        C0764c0.m319a(b, "locale", mo10993p());
        C0764c0.m319a(b, "mac_address", mo10949B());
        C0764c0.m319a(b, "manufacturer", mo10950C());
        C0764c0.m319a(b, "device_brand", mo10950C());
        C0764c0.m319a(b, "media_path", b2.mo10855z().mo11094c());
        C0764c0.m319a(b, "temp_storage_path", b2.mo10855z().mo11095d());
        C0764c0.m326b(b, "memory_class", mo10951D());
        C0764c0.m327b(b, "memory_used_mb", mo10952E());
        C0764c0.m319a(b, DeviceRequestsHelper.DEVICE_INFO_MODEL, mo10953F());
        C0764c0.m319a(b, "device_model", mo10953F());
        C0764c0.m319a(b, TapjoyConstants.TJC_SDK_TYPE, "android_native");
        C0764c0.m319a(b, "sdk_version", mo10956I());
        C0764c0.m319a(b, "network_type", b2.mo10848s().mo10884e());
        C0764c0.m319a(b, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, mo10955H());
        C0764c0.m319a(b, "os_name", "android");
        C0764c0.m319a(b, TapjoyConstants.TJC_PLATFORM, "android");
        C0764c0.m319a(b, "arch", mo10964a());
        C0764c0.m319a(b, "user_id", C0764c0.m336h(b2.mo10850u().mo10321b(), "user_id"));
        C0764c0.m319a(b, "app_id", b2.mo10850u().mo10320a());
        C0764c0.m319a(b, "app_bundle_name", C1038z0.m1195b());
        C0764c0.m319a(b, "app_bundle_version", C1038z0.m1205c());
        C0764c0.m316a(b, "battery_level", mo10989l());
        C0764c0.m319a(b, "cell_service_country_code", mo10957J());
        C0764c0.m319a(b, "timezone_ietf", mo10959L());
        C0764c0.m326b(b, "timezone_gmt_m", mo10958K());
        C0764c0.m326b(b, "timezone_dst_m", mo10994q());
        C0764c0.m318a(b, "launch_metadata", mo11003z());
        C0764c0.m319a(b, "controller_version", b2.mo10835f());
        C0764c0.m326b(b, "current_orientation", mo10954G());
        C0764c0.m328b(b, "cleartext_permitted", mo10991n());
        C0764c0.m316a(b, "density", (double) mo10996s());
        C0764c0.m328b(b, "dark_mode", mo10995r());
        C0764c0.m319a(b, "adc_alt_id", mo10982e());
        C0819e1 a = C0764c0.m308a();
        if (C1038z0.m1207c("com.android.vending")) {
            a.mo10692b(Constants.REFERRER_API_GOOGLE);
        }
        if (C1038z0.m1207c("com.amazon.venezia")) {
            a.mo10692b("amazon");
        }
        if (C1038z0.m1207c("com.huawei.appmarket")) {
            a.mo10692b("huawei");
        }
        if (C1038z0.m1207c("com.sec.android.app.samsungapps")) {
            a.mo10692b("samsung");
        }
        C0764c0.m317a(b, "available_stores", a);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo10982e() {
        return C1038z0.m1180a(C0714a.m136b().mo10855z());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo10983f() {
        return this.f690c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10984g() {
        Context a = C0714a.m129a();
        if (a == null) {
            return null;
        }
        return Settings.Secure.getString(a.getContentResolver(), TapjoyConstants.TJC_ADVERTISING_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10985h() {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(a.getContentResolver(), "limit_ad_tracking") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo10986i() {
        Context a = C0714a.m129a();
        if (a == null) {
            return "";
        }
        return Settings.Secure.getString(a.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo10987j() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: k */
    public String mo10988k() {
        return this.f692e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public double mo10989l() {
        Context a = C0714a.m129a();
        if (a == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return ((double) intExtra) / ((double) intExtra2);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo10990m() {
        Context a = C0714a.m129a();
        String str = "";
        if (a == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? "unknown" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10991n() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo10992o() {
        return this.f694g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo10993p() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo10994q() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo10995r() {
        int i;
        Context a = C0714a.m129a();
        if (a == null || Build.VERSION.SDK_INT < 29 || (i = a.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo10996s() {
        Context a = C0714a.m129a();
        if (a == null) {
            return 0.0f;
        }
        return a.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C0823f1 mo10997t() {
        if (!mo10961N()) {
            try {
                return C1038z0.m1194b(C0764c0.m313a(mo10981d(), mo10965a(2000).call()));
            } catch (Exception unused) {
            }
        }
        return C1038z0.m1194b(C0764c0.m313a(mo10981d(), mo10971b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo10998u() {
        return mo10963P() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo10999v() {
        Context a = C0714a.m129a();
        if (a == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return a.getResources().getConfiguration().densityDpi;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Rect mo11000w() {
        Rect rect = new Rect();
        Context a = C0714a.m129a();
        if (a == null) {
            return rect;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return rect;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (RuntimeException unused) {
            return rect;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r2.getWindowInsets().getInsetsIgnoringVisibility((android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.displayCutout()) | android.view.WindowInsets.Type.statusBars());
        r1 = new android.graphics.Rect(0, 0, r2.getBounds().width() - (r1.right + r1.left), r2.getBounds().height() - (r1.top + r1.bottom));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d8 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect mo11001x() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.Context r1 = com.adcolony.sdk.C0714a.m129a()
            if (r1 == 0) goto L_0x0111
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch:{ RuntimeException -> 0x0111 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x0111 }
            if (r2 == 0) goto L_0x0111
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 17
            r5 = 0
            if (r3 >= r4) goto L_0x0039
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C1038z0.m1214f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r1
            r2.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r2
            goto L_0x0111
        L_0x0039:
            r4 = 30
            if (r3 >= r4) goto L_0x008d
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            r2.getRealMetrics(r4)     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = com.adcolony.sdk.C1038z0.m1214f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C1038z0.m1191b((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x006d
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r2
            r1.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x006a:
            r0 = r1
            goto L_0x0111
        L_0x006d:
            if (r1 <= 0) goto L_0x0082
            if (r6 > r2) goto L_0x0074
            if (r1 <= r2) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1 + r2
            int r4 = r4 - r1
            r6.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r6
            goto L_0x0111
        L_0x0082:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 - r2
            r1.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x008d:
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.view.Display r1 = r1.getDisplay()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.getCurrentSizeRange(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r1 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.width()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r6 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r6 = r6.height()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r7 = 2
            if (r1 <= r6) goto L_0x00b7
            r1 = r7
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            if (r1 != r7) goto L_0x00c4
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r4, r3)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            goto L_0x00cd
        L_0x00c4:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
        L_0x00cd:
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r1.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>(r5, r5, r4, r1)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r0 = r3
            goto L_0x0111
        L_0x00d8:
            android.view.WindowInsets r1 = r2.getWindowInsets()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = android.view.WindowInsets.Type.navigationBars()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = android.view.WindowInsets.Type.displayCutout()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            int r4 = android.view.WindowInsets.Type.statusBars()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            android.graphics.Insets r1 = r1.getInsetsIgnoringVisibility(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r3 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.width()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.right     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r1.left     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r6
            int r3 = r3 - r4
            android.graphics.Rect r2 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = r2.height()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.top     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1.bottom     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r1
            int r2 = r2 - r4
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            r1.<init>(r5, r5, r3, r2)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0934q.mo11001x():android.graphics.Rect");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo11002y() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C0823f1 mo11003z() {
        return this.f693f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10968a(C0823f1 f1Var) {
        this.f693f = f1Var;
    }

    /* renamed from: b */
    public void mo10975b(String str) {
        this.f692e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10979c(String str) {
        this.f694g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10969a(String str) {
        this.f690c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10976b(boolean z) {
        this.f689b.mo10701a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10970a(boolean z) {
        this.f688a.mo10701a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0823f1 mo10971b() {
        C0823f1 b = C0764c0.m322b();
        String f = mo10983f();
        C0764c0.m319a(b, "advertiser_id", f);
        C0764c0.m328b(b, "limit_tracking", mo10948A());
        if (f == null || f.isEmpty()) {
            C0764c0.m319a(b, "android_id_sha1", C1038z0.m1199b(mo10986i()));
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0823f1 mo10978c(long j) {
        if (j <= 0) {
            return C0764c0.m313a(mo10981d(), mo10971b(), mo10977c());
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(mo10981d()));
        C0942q0 q0Var = new C0942q0();
        if (mo10961N()) {
            arrayList.add(mo10971b());
        } else {
            q0Var.mo11013a(mo10965a(j));
        }
        if (mo10962O()) {
            arrayList.add(mo10977c());
        } else {
            q0Var.mo11013a(mo10972b(j));
        }
        if (!q0Var.mo11014b()) {
            arrayList.addAll(q0Var.mo11011a());
        }
        return C0764c0.m313a((C0823f1[]) arrayList.toArray(new C0823f1[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10964a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Callable<C0823f1> mo10965a(long j) {
        return new C0938b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10966a(Context context) {
        mo10967a(context, (C1022y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10967a(Context context, C1022y<String> yVar) {
        if (context != null) {
            if (mo10983f().isEmpty()) {
                mo10970a(false);
            }
            if (!C1038z0.m1186a((Runnable) new C0939c(context, yVar))) {
                new C0817e0.C0818a().mo10684a("Executing Query Advertising ID failed.").mo10685a(C0817e0.f434i);
                if (yVar != null) {
                    yVar.mo10858a(new Throwable("Query Advertising ID failed on execute."));
                }
            } else {
                return;
            }
        } else if (yVar != null) {
            yVar.mo10858a(new Throwable("Context cannot be null."));
        }
        mo10970a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Callable<C0823f1> mo10972b(long j) {
        return new C0940d(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10973b(Context context) {
        mo10974b(context, (C1022y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10974b(android.content.Context r3, com.adcolony.sdk.C1022y<java.lang.String> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r0 = "Context cannot be null."
            r3.<init>(r0)
            r4.mo10858a((java.lang.Throwable) r3)
            goto L_0x0080
        L_0x000f:
            java.lang.String r0 = r2.mo10988k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r4 == 0) goto L_0x0080
            java.lang.String r3 = r2.mo10988k()
            r4.mo10856a(r3)
            goto L_0x0080
        L_0x0023:
            r0 = 0
            r2.mo10976b((boolean) r0)
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.appset.AppSetIdClient r3 = com.google.android.gms.appset.AppSet.getClient(r3)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.tasks.Task r3 = r3.getAppSetIdInfo()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.adcolony.sdk.q$e r0 = new com.adcolony.sdk.q$e     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r0.<init>(r4)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r3.addOnCompleteListener(r0)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            return
        L_0x003c:
            r3 = move-exception
            com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
            r0.<init>()
            java.lang.String r1 = "Query App Set ID failed with: "
            com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.adcolony.sdk.e0$a r3 = r0.mo10684a((java.lang.String) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0817e0.f432g
            r3.mo10685a((com.adcolony.sdk.C0817e0) r0)
            goto L_0x0066
        L_0x0056:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "Google Play Services App Set dependency is missing."
            com.adcolony.sdk.e0$a r3 = r3.mo10684a((java.lang.String) r0)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0817e0.f431f
            r3.mo10685a((com.adcolony.sdk.C0817e0) r0)
        L_0x0066:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "App Set ID is not available."
            com.adcolony.sdk.e0$a r3 = r3.mo10684a((java.lang.String) r0)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f431f
            r3.mo10685a((com.adcolony.sdk.C0817e0) r1)
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r0)
            r4.mo10858a((java.lang.Throwable) r3)
        L_0x0080:
            r3 = 1
            r2.mo10976b((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0934q.mo10974b(android.content.Context, com.adcolony.sdk.y):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0823f1 mo10977c() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, TapjoyConstants.TJC_APP_SET_ID, mo10988k());
        return b;
    }
}
