package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.C2397a;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.p120e.p123c.C2921a;
import com.bytedance.sdk.component.p125f.C2949c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2982r;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3641r;
import com.bytedance.sdk.openadsdk.core.C3647u;
import com.bytedance.sdk.openadsdk.core.p155i.C3531b;
import com.bytedance.sdk.openadsdk.core.p155i.C3533d;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.C3965d;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3930b;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p174b.C3833a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C3998h;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class TTAdSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    public static final long INIT_TIME = System.currentTimeMillis();

    /* renamed from: a */
    private static AtomicBoolean f6896a = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile boolean f6897b = false;

    /* renamed from: c */
    private static SharedPreferences.OnSharedPreferenceChangeListener f6898c;

    /* renamed from: d */
    private static final TTAdManager f6899d = new C3647u();

    public interface InitCallback {
        void fail(int i, String str);

        void success();
    }

    public static boolean isInitSuccess() {
        return f6897b;
    }

    public static void init(Context context, TTAdConfig tTAdConfig, InitCallback initCallback) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3568k.f8982c = true;
        if (context == null && initCallback != null) {
            initCallback.fail(INIT_LOCAL_FAIL_CODE, "Context is null, please check. ");
        } else if (tTAdConfig != null || initCallback == null) {
            m8551b(context, tTAdConfig);
            try {
                C3524h.m10850a(initCallback);
                try {
                    C2984t.m8425a(C3578m.m11231a(), "tt_ad_logo_txt");
                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (f6897b) {
                        if (initCallback != null) {
                            initCallback.success();
                        }
                    } else if (!tTAdConfig.isSupportMultiProcess()) {
                        m8553b(context, tTAdConfig, initCallback, elapsedRealtime2);
                    } else {
                        final Context context2 = context;
                        final TTAdConfig tTAdConfig2 = tTAdConfig;
                        final InitCallback initCallback2 = initCallback;
                        C3917a.m12867a((C3930b) new C3930b() {
                            /* renamed from: a */
                            public void mo18248a() {
                                TTAdSdk.m8553b(context2, tTAdConfig2, initCallback2, elapsedRealtime2);
                            }
                        });
                        C3917a.m12866a(context).mo20812a();
                    }
                } catch (Throwable unused) {
                    if (initCallback != null) {
                        initCallback.fail(INIT_LOCAL_FAIL_CODE, "resources not found, if you use aab please call TTAdConfig.setPackageName");
                    }
                }
            } catch (Throwable unused2) {
                if (initCallback != null) {
                    initCallback.fail(INIT_LOCAL_FAIL_CODE, "Internal Error, setting exception. ");
                }
            }
        } else {
            initCallback.fail(INIT_LOCAL_FAIL_CODE, "TTAdConfig is null, please check.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8553b(Context context, TTAdConfig tTAdConfig, InitCallback initCallback, long j) {
        final InitCallback initCallback2 = initCallback;
        final Context context2 = context;
        final TTAdConfig tTAdConfig2 = tTAdConfig;
        final long j2 = j;
        C3568k.m11191c().post(new Runnable() {
            public void run() {
                try {
                    if (!TTAdSdk.f6897b) {
                        TTAdSdk.m8554b(context2, tTAdConfig2, true);
                        TTAdSdk.m8552b(context2, tTAdConfig2, initCallback2);
                        boolean unused = TTAdSdk.f6897b = true;
                        if (initCallback2 != null) {
                            initCallback2.success();
                        }
                        TTAdSdk.m8550b(context2, j2, true, tTAdConfig2);
                    } else if (initCallback2 != null) {
                        initCallback2.success();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    InitCallback initCallback = initCallback2;
                    if (initCallback != null) {
                        initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, th.getMessage());
                    }
                    boolean unused2 = TTAdSdk.f6897b = false;
                }
            }
        });
    }

    public static TTAdManager getAdManager() {
        C4014u.m13252m("getAdManager");
        return f6899d;
    }

    /* renamed from: a */
    private static void m8543a(final Context context, TTAdConfig tTAdConfig) {
        m8549b();
        C3568k.f8980a = tTAdConfig.isAsyncInit();
        f6899d.setAppId(tTAdConfig.getAppId()).setCoppa(tTAdConfig.getCoppa()).setGdpr(tTAdConfig.getGDPR()).setCcpa(tTAdConfig.getCcpa()).setName(tTAdConfig.getAppName()).setIconId(tTAdConfig.getAppIconId()).setPaid(tTAdConfig.isPaid()).setKeywords(tTAdConfig.getKeywords()).setData(tTAdConfig.getData()).setTitleBarTheme(tTAdConfig.getTitleBarTheme()).setAllowShowNotifiFromSDK(tTAdConfig.isAllowShowNotify()).isUseTextureView(tTAdConfig.isUseTextureView()).setNeedClearTaskReset(tTAdConfig.getNeedClearTaskReset()).debugLog(tTAdConfig.getDebugLog());
        try {
            if (tTAdConfig.isDebug()) {
                C2975l.m8382b();
                f6899d.openDebugMode();
                C3998h.m13111a();
                C2536c.m6430a();
            }
        } catch (Throwable unused) {
        }
        C3537f.f8806a = C3533d.m10955b(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        C30103 r0 = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (C3537f.f8807b.equals(str)) {
                    C2952e.m8307a((C2955g) new C2955g("onSharedPreferenceChanged") {
                        public void run() {
                            String b = C3533d.m10955b(context);
                            if ((TextUtils.isEmpty(b) && !TextUtils.isEmpty(C3537f.f8806a)) || !b.equals(C3537f.f8806a)) {
                                C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
                                C3537f.f8806a = b;
                            }
                        }
                    });
                }
            }
        };
        f6898c = r0;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(r0);
    }

    /* renamed from: b */
    private static void m8549b() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context a = C3578m.m11231a();
                if (a != null && (shortcutManager = (ShortcutManager) a.getSystemService(ShortcutManager.class)) != null) {
                    C3524h.m10852d().mo19836a(shortcutManager.isRequestPinShortcutSupported());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m8551b(Context context, TTAdConfig tTAdConfig) {
        if (!TextUtils.isEmpty(tTAdConfig.getPackageName())) {
            C2984t.m8427a(tTAdConfig.getPackageName());
        }
        C3578m.m11233a(context);
        if (!tTAdConfig.isSupportMultiProcess()) {
            C3953b.m12900b();
        }
        C3568k.m11189b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8554b(Context context, TTAdConfig tTAdConfig, boolean z) {
        if (C3536e.m10968a()) {
            C2952e.m8316c(-1);
            C3965d.m12956a(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) C2952e.m8304a();
            C2921a.m8190a(context).mo17802a(threadPoolExecutor);
            C3568k.f8981b.set(true);
            if (tTAdConfig.isSupportMultiProcess()) {
                C3953b.m12899a();
            }
            try {
                C2599a.m6611a().mo16626a(C3769a.m12389a());
            } catch (Exception e) {
                e.printStackTrace();
            }
            updateAdConfig(tTAdConfig);
            m8543a(context, tTAdConfig);
            C3568k.m11187a();
            C2518b.m6271a(context, (String) null, threadPoolExecutor, C3568k.m11191c());
            C2518b.m6273a(tTAdConfig.isSupportMultiProcess());
            C2518b.m6272a(C3854d.m12660a().mo20705b().mo17764e());
            if (Build.VERSION.SDK_INT < 23) {
                C2397a.m5784a(context);
            }
            if (C3578m.m11241h().mo19916C()) {
                C3641r.m11577a();
            }
            NetworkTools.m13023c(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8552b(final Context context, final TTAdConfig tTAdConfig, InitCallback initCallback) {
        C2952e.m8309a(new C2955g("init sync") {
            public void run() {
                C3537f h = C3578m.m11241h();
                if (!h.mo19918E()) {
                    synchronized (h) {
                        if (!h.mo19918E()) {
                            h.mo19908a();
                            h.mo19926a((Boolean) false);
                        }
                    }
                }
                C3985e.m13068f();
                C3568k.m11188a(context);
                C2952e.m8310a(true);
                C2952e.m8306a((C2949c) new C3833a());
                if (Build.VERSION.SDK_INT != 29 || !C4003m.m13142r()) {
                    C3985e.m13052a(context);
                }
                C3985e.m13069f(context);
                C3985e.m13076j(context);
                C3985e.m13078k(context);
            }
        }, 10, 5);
        C3568k.m11191c().post(new Runnable() {
            public void run() {
                if (!tTAdConfig.isSupportMultiProcess()) {
                    C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
                } else if (C2982r.m8418a(context)) {
                    C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
                    C2975l.m8387c("TTAdSdk", "Load setting in main process");
                }
                C3578m.m11236c().mo18742a();
                C3578m.m11238e().mo18742a();
                C3578m.m11237d().mo18742a();
            }
        });
        m8555c();
    }

    /* renamed from: c */
    private static void m8555c() {
        C2952e.m8314b(new C2955g("Disk Event") {
            public void run() {
                C3815b.m12556b();
            }
        }, 5);
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        if (tTAdConfig != null) {
            if (!TextUtils.isEmpty(tTAdConfig.getData())) {
                C3524h.m10852d().mo19848d(tTAdConfig.getData());
            }
            if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
                C3524h.m10852d().mo19845c(tTAdConfig.getKeywords());
            }
        }
    }

    public static void setCoppa(int i) {
        C4014u.m13252m("setCoppa");
        if (i != getCoppa()) {
            f6899d.setCoppa(i);
            C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
        }
    }

    public static int getCoppa() {
        C4014u.m13252m("getCoppa");
        return f6899d.getCoppa();
    }

    public static void setGdpr(int i) {
        C4014u.m13252m("setGdpr");
        if (i != getGdpr()) {
            f6899d.setGdpr(i);
            C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
        }
    }

    public static int getGdpr() {
        C4014u.m13252m("getGdpr");
        return f6899d.getGdpr();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8550b(Context context, long j, boolean z, TTAdConfig tTAdConfig) {
        final Context context2 = context;
        final TTAdConfig tTAdConfig2 = tTAdConfig;
        final long j2 = j;
        final boolean z2 = z;
        C2952e.m8308a(new C2955g("initMustBeCall") {
            public void run() {
                ApmHelper.initApm(context2, tTAdConfig2);
                if (C3578m.m11241h().mo19919F()) {
                    try {
                        boolean e = C3524h.m10852d().mo19853e();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", j2);
                        jSONObject.put("is_async", z2);
                        jSONObject.put("is_multi_process", tTAdConfig2.isSupportMultiProcess());
                        jSONObject.put("is_debug", tTAdConfig2.isDebug());
                        jSONObject.put("is_use_texture_view", tTAdConfig2.isUseTextureView());
                        jSONObject.put("is_activate_init", e);
                        jSONObject.put("minSdkVersion", C4014u.m13258o(context2));
                        jSONObject.put("targetSdkVersion", C4014u.m13254n(context2));
                        jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                        C3524h.m10852d().mo19841b(false);
                        C3815b.m12552a().mo20663a("pangle_sdk_init", jSONObject);
                        C2975l.m8380a("TTAdSdk", "pangle_sdk_init = ", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    public static void setCCPA(int i) {
        C4014u.m13252m("setCCPA");
        if (i != getCCPA()) {
            C3524h.m10852d().mo19855f(i);
            C3533d.m10949a((C3531b) C3578m.m11241h()).mo19910a(true);
        }
    }

    public static int getCCPA() {
        C4014u.m13252m("getCCPA");
        return C3524h.m10852d().mo19872v();
    }
}
