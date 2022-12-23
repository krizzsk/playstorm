package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2976m;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3455c;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3641r;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.com.bytedance.overseas.sdk.p187b.C4028a;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.smaato.sdk.video.vast.model.Verification;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.vungle.warren.VungleApiClient;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.utils.e */
/* compiled from: DeviceUtils */
public class C3985e {

    /* renamed from: a */
    public static String f10217a = "";

    /* renamed from: b */
    private static volatile boolean f10218b = false;

    /* renamed from: c */
    private static volatile boolean f10219c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile boolean f10220d = false;

    /* renamed from: e */
    private static volatile boolean f10221e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f10222f = true;

    /* renamed from: g */
    private static long f10223g;

    /* renamed from: h */
    private static int f10224h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f10225i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static int f10226j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static int f10227k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static int f10228l;

    @JProtect
    /* renamed from: a */
    public static JSONObject m13051a(Context context, boolean z) {
        for (char c = 65534; c <= 11; c = 'l') {
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", m13070g(context));
            m13053a(jSONObject);
            jSONObject.put("type", m13065d(context));
            int i = 1;
            jSONObject.put("os", 1);
            jSONObject.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE + "");
            jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
            jSONObject.put("conn_type", C4014u.m13261p(context));
            jSONObject.put("screen_width", C4020v.m13306c(context));
            jSONObject.put("screen_height", C4020v.m13310d(context));
            if (C3578m.m11241h().mo19916C()) {
                jSONObject.put("sec_did", C3641r.m11577a().mo20216c());
            }
            C3537f h = C3578m.m11241h();
            if (h.mo19966p("boot")) {
                jSONObject.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            }
            jSONObject.put("uuid", C3538j.m11049c(context));
            jSONObject.put("rom_version", C4003m.m13121a());
            jSONObject.put("sys_compiling_time", C3538j.m11048b(context));
            jSONObject.put(TapjoyConstants.TJC_DEVICE_TIMEZONE, C4014u.m13263q());
            jSONObject.put("language", C3538j.m11044a());
            jSONObject.put(TapjoyConstants.TJC_CARRIER_NAME, C4006n.m13148a());
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(z ? C4014u.m13182a(context) : C4014u.m13199b(context)) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            jSONObject.put("locale_language", m13062c());
            jSONObject.put("screen_bright", Math.ceil((double) (m13064d() * 10.0f)) / 10.0d);
            if (m13054a()) {
                i = 0;
            }
            jSONObject.put("is_screen_off", i);
            jSONObject.put("cpu_num", C4014u.m13206c(context));
            jSONObject.put("cpu_max_freq", C4014u.m13212d(context));
            jSONObject.put("cpu_min_freq", C4014u.m13218e(context));
            jSONObject.put("battery_remaining_pct", (int) C3990c.m13095b());
            jSONObject.put("is_charging", C3990c.m13094a());
            jSONObject.put("total_space", String.valueOf(C4014u.m13224f(context)));
            jSONObject.put("free_space_in", String.valueOf(C4014u.m13229g(context)));
            jSONObject.put("sdcard_size", String.valueOf(C4014u.m13234h(context)));
            jSONObject.put("rooted", C4014u.m13237i(context));
            jSONObject.put("enable_assisted_clicking", m13066e());
            jSONObject.put("force_language", C2984t.m8425a(context, "tt_choose_language"));
            jSONObject.put("airplane", m13073h(context));
            jSONObject.put("darkmode", m13081n(context));
            jSONObject.put("headset", m13082o(context));
            jSONObject.put("ringmute", m13083p(context));
            jSONObject.put("screenscale", (double) m13084q(context));
            jSONObject.put(TapjoyConstants.TJC_VOLUME, m13085r(context));
            jSONObject.put("low_power_mode", m13086s(context));
            if (h.mo19966p("mnc")) {
                jSONObject.put("mnc", C4006n.m13150c());
            }
            if (h.mo19966p("mcc")) {
                jSONObject.put("mcc", C4006n.m13149b());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: a */
    public static void m13052a(Context context) {
        if (!f10218b) {
            try {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    f10222f = powerManager.isScreenOn();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                C3992e eVar = new C3992e();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(eVar, intentFilter);
                f10218b = true;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m13053a(JSONObject jSONObject) throws JSONException {
        m13058b(jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        switch(r1) {
            case 52: goto L_0x0037;
            case 53: goto L_0x0041;
            case 54: goto L_0x004e;
            default: goto L_0x0040;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        switch(r3) {
            case 29: goto L_0x0037;
            case 30: goto L_0x0037;
            case 31: goto L_0x003d;
            default: goto L_0x0044;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r3 = 30;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ all -> 0x0056 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13054a() {
        /*
            boolean r0 = f10222f
            if (r0 != 0) goto L_0x005a
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = f10223g
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            long r0 = android.os.SystemClock.elapsedRealtime()
            f10223g = r0
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0056 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x005a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0056 }
            r2 = 20
            r3 = 55
            if (r1 < r2) goto L_0x0032
            boolean r0 = r0.isInteractive()     // Catch:{ all -> 0x0056 }
            goto L_0x004c
        L_0x0032:
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x0056 }
            r1 = 0
        L_0x0037:
            r2 = 72
        L_0x0039:
            switch(r2) {
                case 72: goto L_0x0053;
                case 73: goto L_0x0047;
                case 74: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ all -> 0x0056 }
        L_0x003c:
            goto L_0x0037
        L_0x003d:
            switch(r1) {
                case 52: goto L_0x0037;
                case 53: goto L_0x0041;
                case 54: goto L_0x004e;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x0056 }
        L_0x0040:
            goto L_0x004c
        L_0x0041:
            switch(r3) {
                case 29: goto L_0x0037;
                case 30: goto L_0x0037;
                case 31: goto L_0x003d;
                default: goto L_0x0044;
            }     // Catch:{ all -> 0x0056 }
        L_0x0044:
            r3 = 30
            goto L_0x0041
        L_0x0047:
            r2 = 57
            if (r1 > r2) goto L_0x004c
            goto L_0x005a
        L_0x004c:
            f10222f = r0     // Catch:{ all -> 0x0056 }
        L_0x004e:
            r2 = 73
            r1 = 16
            goto L_0x0039
        L_0x0053:
            f10222f = r0     // Catch:{ all -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005a:
            boolean r0 = f10222f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C3985e.m13054a():boolean");
    }

    /* renamed from: b */
    public static int m13056b() {
        return C3455c.m10351a(C3578m.m11231a()).mo19459b("limit_ad_track", -1);
    }

    /* renamed from: b */
    private static void m13058b(JSONObject jSONObject) throws JSONException {
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        if (C3578m.m11241h().mo19966p(VungleApiClient.GAID)) {
            jSONObject.put(VungleApiClient.GAID, C4028a.m13343a().mo20936b());
        }
    }

    /* renamed from: b */
    public static boolean m13059b(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m13062c() {
        if (Build.VERSION.SDK_INT < 21) {
            return Locale.getDefault().getLanguage();
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    /* renamed from: c */
    public static boolean m13063c(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static float m13064d() {
        int i = -1;
        try {
            Context a = C3578m.m11231a();
            if (a != null) {
                i = Settings.System.getInt(a.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            C2975l.m8391e("DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return ((float) Math.round((((float) i) / 255.0f) * 10.0f)) / 10.0f;
    }

    /* renamed from: d */
    public static int m13065d(Context context) {
        if (m13063c(context)) {
            return 3;
        }
        return m13059b(context) ? 2 : 1;
    }

    /* renamed from: e */
    public static int m13066e() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C3578m.m11231a().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    /* renamed from: e */
    public static JSONObject m13067e(Context context) {
        return m13051a(context, false);
    }

    @JProtect
    /* renamed from: f */
    public static void m13068f() {
        new C3993f().run();
        Context a = C3578m.m11231a();
        if (a != null) {
            C3455c.m10351a(a).mo19455a("cpu_count", C4014u.m13233h());
            C3455c.m10351a(a).mo19455a("cpu_max_frequency", C4014u.m13205c(C4014u.m13233h()));
            C3455c.m10351a(a).mo19455a("cpu_min_frequency", C4014u.m13211d(C4014u.m13233h()));
            String e = C4014u.m13221e(a, "MemTotal");
            if (e != null) {
                C3455c.m10351a(a).mo19457a("total_memory", e);
            }
            C3455c.m10351a(a).mo19456a("total_internal_storage", C4014u.m13238i());
            C3455c.m10351a(a).mo19456a("free_internal_storage", C2976m.m8392a());
            C3455c.m10351a(a).mo19456a("total_sdcard_storage", C4014u.m13241j());
            C3455c.m10351a(a).mo19455a("is_root", C4014u.m13247k() ? 1 : 0);
            if (TextUtils.isEmpty(m13075i(a))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    f10217a = TapjoyConstants.TJC_PLUGIN_UNITY;
                } catch (ClassNotFoundException unused) {
                    f10217a = "native";
                }
                C3455c.m10351a(a).mo19457a("framework_name", f10217a);
            }
            m13071g();
            m13087t(a);
            f10228l = m13089v(a);
        }
    }

    /* renamed from: f */
    public static void m13069f(Context context) {
        if (!f10219c) {
            try {
                C3989b bVar = new C3989b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                context.registerReceiver(bVar, intentFilter);
                f10219c = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static int m13070g(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(Build.VERSION.SDK_INT >= 17 ? context.getContentResolver() : context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            C2975l.m8391e("DeviceUtils", th.getMessage());
            return -1;
        }
    }

    /* renamed from: g */
    public static void m13071g() {
        try {
            int ringerMode = ((AudioManager) C3578m.m11231a().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f10224h = 1;
            } else if (ringerMode == 1) {
                f10224h = 2;
            } else {
                f10224h = 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static int m13073h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public static String m13075i(Context context) {
        if (TextUtils.isEmpty(f10217a)) {
            f10217a = C3455c.m10351a(context).mo19461b("framework_name", "");
        }
        return f10217a;
    }

    /* renamed from: j */
    public static void m13076j(Context context) {
        if (context != null) {
            C3988a.m13093b(context.getApplicationContext());
        }
    }

    /* renamed from: k */
    public static void m13078k(Context context) {
        Context applicationContext;
        if (!f10221e && context != null && (applicationContext = context.getApplicationContext()) != null) {
            try {
                if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                    m13091x(applicationContext);
                } else {
                    C3991d.m13097b(applicationContext);
                }
                f10221e = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: n */
    private static int m13081n(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    private static int m13082o(Context context) {
        return f10227k;
    }

    /* renamed from: p */
    private static int m13083p(Context context) {
        return f10224h;
    }

    /* renamed from: q */
    private static float m13084q(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: r */
    private static int m13085r(Context context) {
        return f10226j;
    }

    /* renamed from: s */
    private static int m13086s(Context context) {
        return f10228l;
    }

    /* renamed from: t */
    private static void m13087t(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f10225i = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f10226j = streamVolume;
            f10226j = (int) ((((double) streamVolume) / ((double) f10225i)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m13088u(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C2952e.m8308a(new C2955g("DeviceUtils_get_low_power_mode") {
                public void run() {
                    int unused = C3985e.f10228l = C3985e.m13089v(applicationContext);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static int m13089v(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                    return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
                }
            }
            return m13090w(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L_0x001a;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13090w(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            r2 = r1
            goto L_0x0034
        L_0x001c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            r0 = 4
            if (r4 != r0) goto L_0x0019
            goto L_0x001a
        L_0x0034:
            return r2
        L_0x0035:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C3985e.m13090w(android.content.Context):int");
    }

    /* renamed from: x */
    private static void m13091x(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver((Handler) null) {
                public void onChange(boolean z) {
                    super.onChange(z);
                    C3985e.m13088u(applicationContext);
                }
            });
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$e */
    /* compiled from: DeviceUtils */
    static class C3992e extends BroadcastReceiver {
        C3992e() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = C3985e.f10222f = true;
                C2975l.m8387c("DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = C3985e.f10222f = false;
                C2975l.m8387c("DeviceUtils", "screen_off");
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$f */
    /* compiled from: DeviceUtils */
    public static class C3993f implements Runnable {
        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C3578m.m11231a());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (C3578m.m11241h().mo19966p(VungleApiClient.GAID)) {
                        String id = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id)) {
                            C4028a.m13343a().mo20937b(id);
                            C4028a.m13344a(id);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    C3455c.m10351a(C3578m.m11231a()).mo19455a("limit_ad_track", i);
                }
            } catch (IOException e) {
                C2975l.m8388c("DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (GooglePlayServicesNotAvailableException e2) {
                C2975l.m8388c("DeviceUtils", "getLmtTask error : indicating that Google Play is not installed on this device.", e2);
            } catch (GooglePlayServicesRepairableException e3) {
                C2975l.m8388c("DeviceUtils", "getLmtTask error : indicating that there was a recoverable error connecting to Google Play Services.", e3);
            } catch (Throwable th) {
                C2975l.m8391e("DeviceUtils", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$c */
    /* compiled from: DeviceUtils */
    public static class C3990c {

        /* renamed from: a */
        static int f10231a = -1;

        /* renamed from: b */
        static float f10232b;

        /* renamed from: a */
        public static int m13094a() {
            return f10231a;
        }

        /* renamed from: b */
        public static float m13095b() {
            return f10232b;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$b */
    /* compiled from: DeviceUtils */
    static class C3989b extends BroadcastReceiver {
        C3989b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("status", -1);
                if (intExtra == -1) {
                    C3990c.f10231a = intExtra;
                }
                if (intExtra == 2) {
                    C3990c.f10231a = 1;
                } else {
                    C3990c.f10231a = 0;
                }
                C3990c.f10232b = ((float) (intent.getIntExtra("level", -1) * 100)) / ((float) intent.getIntExtra("scale", -1));
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$a */
    /* compiled from: DeviceUtils */
    static class C3988a extends BroadcastReceiver {
        C3988a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = C3985e.f10226j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (C3985e.f10225i != 0) {
                            int unused2 = C3985e.f10226j = (int) ((((double) C3985e.f10226j) / ((double) C3985e.f10225i)) * 100.0d);
                        }
                    }
                } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = C3985e.f10227k = intent.getIntExtra("state", 0);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m13093b(Context context) {
            if (!C3985e.f10220d && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new C3988a(), intentFilter);
                    boolean unused = C3985e.f10220d = true;
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$d */
    /* compiled from: DeviceUtils */
    private static class C3991d extends BroadcastReceiver {
        private C3991d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    C3985e.m13088u(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i = 1;
                    }
                    int unused = C3985e.f10228l = i;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m13097b(Context context) {
            if (Build.VERSION.SDK_INT >= 21 && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                context.registerReceiver(new C3991d(), intentFilter);
            }
        }
    }
}
