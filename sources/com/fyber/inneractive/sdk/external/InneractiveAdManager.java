package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.C4183b;
import com.fyber.inneractive.sdk.bidder.C4209a;
import com.fyber.inneractive.sdk.bidder.C4232e;
import com.fyber.inneractive.sdk.cache.session.C4244b;
import com.fyber.inneractive.sdk.cache.session.C4247d;
import com.fyber.inneractive.sdk.config.C4263b;
import com.fyber.inneractive.sdk.config.C4268c;
import com.fyber.inneractive.sdk.config.C4270d;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.C4311i;
import com.fyber.inneractive.sdk.config.C4314j;
import com.fyber.inneractive.sdk.config.C4315k;
import com.fyber.inneractive.sdk.config.C4319l;
import com.fyber.inneractive.sdk.config.C4320m;
import com.fyber.inneractive.sdk.config.C4322n;
import com.fyber.inneractive.sdk.config.C4323o;
import com.fyber.inneractive.sdk.config.C4339s;
import com.fyber.inneractive.sdk.config.C4344x;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4277a;
import com.fyber.inneractive.sdk.config.global.C4308r;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.factories.C4394a;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.factories.C4400c;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.C4534c;
import com.fyber.inneractive.sdk.network.C4537d;
import com.fyber.inneractive.sdk.network.C4543f0;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4581w;
import com.fyber.inneractive.sdk.p189dv.C4356c;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5312a0;
import com.fyber.inneractive.sdk.util.C5314b0;
import com.fyber.inneractive.sdk.util.C5328f0;
import com.fyber.inneractive.sdk.util.C5342i;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5360n0;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.C5374t0;
import com.fyber.inneractive.sdk.util.C5376u0;
import com.fyber.inneractive.sdk.util.C5381v;
import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.C5390z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.C5433r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class InneractiveAdManager implements C4311i.C4313b {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* renamed from: c */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f10812c;

    /* renamed from: a */
    public volatile Context f10813a;

    /* renamed from: b */
    public String f10814b;

    public enum GdprConsentSource {
        Internal,
        External
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$a */
    public class C4387a implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a */
        public final /* synthetic */ Context f10816a;

        /* renamed from: b */
        public final /* synthetic */ OnFyberMarketplaceInitializedListener f10817b;

        public C4387a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
            this.f10816a = context;
            this.f10817b = onFyberMarketplaceInitializedListener;
        }

        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
            if (this.f10816a.getApplicationContext() != null) {
                IAConfigManager.removeListener(this);
                InneractiveAdManager.f10812c = null;
                if (z) {
                    InneractiveAdManager.m13666a(this.f10817b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
                    return;
                }
                OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener = this.f10817b;
                if (exc instanceof InvalidAppIdException) {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
                } else {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
                }
                InneractiveAdManager.m13666a(onFyberMarketplaceInitializedListener, fyberInitStatus, exc.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdManager$b */
    public static class C4388b {

        /* renamed from: a */
        public static volatile InneractiveAdManager f10818a = new InneractiveAdManager();
    }

    /* renamed from: a */
    public static void m13666a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (C4388b.f10818a.f10813a != null && fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            C4569q.C4570a aVar = new C4569q.C4570a(C4565o.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null);
            if (!TextUtils.isEmpty(str)) {
                aVar.mo24767a("message", str);
            }
            aVar.mo24767a("init_status", fyberInitStatus.name());
            aVar.mo24768a((String) null);
        }
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            IAlog.m16699a("Clearing GDPR Consent String and status", new Object[0]);
            if (C5350l.f14216a == null) {
                IAlog.m16703e("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo24282b();
            dVar.f10594a = null;
            dVar.f10595b = null;
            SharedPreferences sharedPreferences = dVar.f10600g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.m16703e("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.f10525J.f10527A.f14207a = null;
    }

    public static void clearLgpdConsentData() {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            IAlog.m16699a("Clearing LGPD consent status", new Object[0]);
            if (C5350l.f14216a == null) {
                IAlog.m16703e("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.mo24282b();
            dVar.f10599f = null;
            SharedPreferences sharedPreferences = dVar.f10600g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
                return;
            }
            return;
        }
        IAlog.m16703e("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        dVar.getClass();
        IAlog.m16699a("Clearing CCPA Consent String", new Object[0]);
        if (C5350l.f14216a == null) {
            IAlog.m16703e("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        dVar.mo24282b();
        dVar.f10598e = null;
        SharedPreferences sharedPreferences = dVar.f10600g;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void destroy() {
        IAlog.m16699a("InneractiveAdManager:destroy called", new Object[0]);
        if (C4388b.f10818a.f10813a == null) {
            IAlog.m16699a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        C4388b.f10818a.f10813a = null;
        IAConfigManager.removeListener(f10812c);
        f10812c = null;
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        iAConfigManager.f10527A.f14207a = null;
        iAConfigManager.f10543h = false;
        C5390z zVar = C5390z.C5391a.f14278a;
        IAlog.m16699a("%sdestroy called", "Location Manager: ");
        Runnable runnable = zVar.f14274d;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
        }
        zVar.mo26495a(zVar.f14275e);
        zVar.mo26495a(zVar.f14276f);
        zVar.f14275e = null;
        zVar.f14276f = null;
        zVar.f14271a = null;
        zVar.f14273c = null;
        C5328f0 f0Var = C5328f0.C5332d.f14185a;
        f0Var.f14180b.clear();
        for (Context context : f0Var.f14179a.keySet()) {
            Pair pair = f0Var.f14179a.get(context);
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        f0Var.f14179a.clear();
        C5314b0 b0Var = C5314b0.C5315a.f14151a;
        synchronized (b0Var) {
            if (b0Var.f14149c != null) {
                IAlog.m16699a("%sremoving screen state receiver and destroying singleton", IAlog.m16696a((Object) b0Var));
                b0Var.f14149c.unregisterReceiver(b0Var.f14150d);
                b0Var.f14149c = null;
                b0Var.f14150d = null;
                b0Var.f14147a.clear();
            }
        }
        C4397b.C4398a.f10858a.f10857a.clear();
        C4394a.C4396b.f10856a.f10855a.clear();
        C4400c.C4402b.f10860a.f10859a.clear();
        InneractiveAdSpotManager.destroy();
        ((HashMap) C5350l.C5352b.f14218a).clear();
        C4209a aVar = C4209a.f10389h;
        C4232e eVar = aVar.f10393d;
        if (eVar != null) {
            try {
                C5350l.f14216a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
        aVar.f10393d = null;
    }

    public static String getAppId() {
        return IAConfigManager.f10525J.f10538c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return C4388b.f10818a.f10814b;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.f10525J.f10530D.mo24279a();
    }

    public static GdprConsentSource getGdprStatusSource() {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            return dVar.f10596c;
        }
        IAlog.m16703e("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    @Deprecated
    public static String getKeywords() {
        return IAConfigManager.f10525J.f10546k;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.f10525J.f10547l;
    }

    public static String getUserId() {
        return IAConfigManager.m13432e();
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.f10525J.f10545j;
    }

    public static String getVersion() {
        return "8.1.5";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, (OnFyberMarketplaceInitializedListener) null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        C4388b.f10818a.f10814b = str;
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            if (C5350l.f14216a == null) {
                IAlog.m16703e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10595b = str;
            if (!dVar.mo24280a("IAGdprConsentData", str)) {
                IAlog.m16703e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16703e("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.f10525J.f10527A.f14207a = onGlobalImpressionDataListener;
    }

    @Deprecated
    public static void setKeywords(String str) {
        IAConfigManager.f10525J.f10546k = str;
    }

    public static void setLgpdConsent(boolean z) {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            if (C5350l.f14216a == null) {
                IAlog.m16703e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10599f = Boolean.valueOf(z);
            if (!dVar.mo24281a("IALgpdConsentStatus", z)) {
                IAlog.m16703e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16703e("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setLogLevel(int i) {
        IAlog.f14137a = i;
    }

    public static void setMediationName(String str) {
        IAConfigManager.f10525J.f10548m = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.f10525J.f10550o = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.f10525J.f10547l = z;
    }

    public static void setUSPrivacyString(String str) {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            if (C5350l.f14216a == null) {
                IAlog.m16703e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10598e = str;
            if (!dVar.mo24280a("IACCPAConsentData", str)) {
                IAlog.m16703e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16703e("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.f10525J.f10554s = z;
    }

    public static void setUserId(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        if (C5350l.f14216a == null) {
            IAlog.m16703e("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        dVar.getClass();
        if (C5350l.f14216a != null) {
            dVar.mo24282b();
            if (TextUtils.isEmpty(str)) {
                dVar.f10597d = str;
                SharedPreferences sharedPreferences = dVar.f10600g;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            SharedPreferences sharedPreferences2 = dVar.f10600g;
            if (sharedPreferences2 != null) {
                dVar.f10597d = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.f10525J.f10545j = inneractiveUserConfig;
        IAlog.m16699a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.f10525J.f10553r = z;
        IAlog.m16699a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (!C5368r.m16780a() && !z) {
            IAlog.m16703e("************************************************************************************************************************", new Object[0]);
            IAlog.m16703e("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
            IAlog.m16703e("***  The traffic will be Secured  ", new Object[0]);
            IAlog.m16703e("************************************************************************************************************************", new Object[0]);
        }
    }

    public static boolean wasInitialized() {
        return C4388b.f10818a.f10813a != null;
    }

    public Context getAppContext() {
        return this.f10813a;
    }

    public void onGlobalConfigChanged(C4311i iVar, C4310h hVar) {
        if (hVar != null && hVar.mo24347a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            C5357n.f14225b.post(new C4393b(this));
        }
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
        String str2;
        int i;
        String str3;
        Context context2 = context;
        String str4 = str;
        OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener2 = onFyberMarketplaceInitializedListener;
        if (context2 == null || str4 == null) {
            IAlog.m16700b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            Object[] objArr = new Object[1];
            objArr[0] = str4 == null ? "appid" : "context";
            String format = String.format("%s is null", objArr);
            if (str4 == null || TextUtils.isEmpty(str.trim())) {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
            } else {
                fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
            }
            m13666a(onFyberMarketplaceInitializedListener2, fyberInitStatus, format);
            return;
        }
        String str5 = IAConfigManager.f10525J.f10538c;
        boolean z = str5 != null && !str5.equalsIgnoreCase(str4);
        if (C4388b.f10818a.f10813a == null || z) {
            ((CopyOnWriteArrayList) IAlog.f14139c).retainAll(Collections.singleton(IAlog.f14138b));
            int i2 = C4273e.f10606a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
            if (property != null) {
                for (String cls : property.split(",")) {
                    try {
                        FMPLogger fMPLogger = (FMPLogger) Class.forName(cls).newInstance();
                        fMPLogger.initialize(context2);
                        ((CopyOnWriteArrayList) IAlog.f14139c).add(fMPLogger);
                    } catch (Throwable unused) {
                    }
                }
            }
            C5350l.f14216a = (Application) context.getApplicationContext();
            C5314b0 b0Var = C5314b0.C5315a.f14151a;
            Context applicationContext = context.getApplicationContext();
            b0Var.getClass();
            IAlog.m16699a("%sinit called", IAlog.m16696a((Object) b0Var));
            b0Var.f14149c = applicationContext;
            b0Var.f14150d = new C5312a0(b0Var);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            b0Var.f14149c.registerReceiver(b0Var.f14150d, intentFilter);
            Intent intent = new Intent();
            intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
            intent.setPackage(C5350l.f14216a.getPackageName());
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                List<BroadcastReceiver> asList = Arrays.asList(new BroadcastReceiver[]{new IAMraidKit(), new IAVideoKit(), new C4356c()});
                for (BroadcastReceiver broadcastReceiver : asList) {
                    try {
                        broadcastReceiver.onReceive(applicationContext2, intent);
                    } catch (Throwable unused2) {
                        IAlog.m16703e("%sCould not trigger receiver for %s", IAlog.m16695a((Class<?>) C4183b.class), broadcastReceiver);
                    }
                }
                if (C4397b.C4398a.f10858a.f10857a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                if (asList.size() == 0) {
                    IAlog.m16700b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
                    m13666a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, (String) null);
                    return;
                }
                C4387a aVar = new C4387a(context2, onFyberMarketplaceInitializedListener2);
                f10812c = aVar;
                IAConfigManager.addListener(aVar);
                if (z) {
                    IAConfigManager iAConfigManager = IAConfigManager.f10525J;
                    iAConfigManager.f10538c = str4;
                    Map<String, C4344x> map = iAConfigManager.f10536a;
                    if (map != null) {
                        map.clear();
                    }
                    Map<String, C4345y> map2 = iAConfigManager.f10537b;
                    if (map2 != null) {
                        map2.clear();
                    }
                    iAConfigManager.f10540e = null;
                    iAConfigManager.f10539d = "";
                    IAConfigManager.m13428a();
                } else {
                    Context applicationContext3 = context.getApplicationContext();
                    IAConfigManager iAConfigManager2 = IAConfigManager.f10525J;
                    if (!iAConfigManager2.f10543h) {
                        C5376u0 u0Var = new C5376u0();
                        iAConfigManager2.f10560y = u0Var;
                        u0Var.f14252b = applicationContext3.getApplicationContext();
                        C5357n.m16773a(new C5374t0(u0Var));
                        C4581w wVar = iAConfigManager2.f10555t;
                        if (!wVar.f11388b) {
                            wVar.f11388b = true;
                            for (int i3 = 0; i3 < 6; i3++) {
                                wVar.f11390d.submit(wVar.f11391e);
                            }
                        }
                        C5357n.m16773a(new C4320m(iAConfigManager2, iAConfigManager2, applicationContext3));
                        C5433r.f14386c.getClass();
                        iAConfigManager2.f10530D = new C4270d();
                        C4311i iVar = new C4311i(applicationContext3);
                        iAConfigManager2.f10557v = iVar;
                        iAConfigManager2.f10558w = new C4314j(iVar);
                        iVar.mo24351b();
                        C4534c cVar = iAConfigManager2.f10533G;
                        Application application = (Application) applicationContext3.getApplicationContext();
                        if (!cVar.f11205g) {
                            cVar.f11205g = true;
                            cVar.f11201c.start();
                            cVar.f11202d = new C5360n0(cVar.f11201c.getLooper(), cVar);
                        }
                        application.registerActivityLifecycleCallbacks(new C4537d(cVar));
                        iAConfigManager2.f10557v.f10661c.add(new C4319l(iAConfigManager2));
                        iAConfigManager2.f10561z = new C4277a(new C4308r());
                        IAlog.m16699a("Initializing config manager", new Object[0]);
                        IAlog.m16699a("Config manager: lib name = %s", APSAnalytics.OS_NAME);
                        IAlog.m16699a("Config manager: app version = %s", "8.1.5");
                        C5390z zVar = C5390z.C5391a.f14278a;
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        zVar.f14271a = applicationContext4;
                        if (applicationContext4 != null && IAConfigManager.f10525J.f10554s) {
                            C5381v vVar = new C5381v(zVar);
                            zVar.f14273c = vVar;
                            C5342i.m16738a(applicationContext4, vVar);
                        }
                        C4315k kVar = C4315k.C4317b.f10668a;
                        if (kVar.f10666a == null) {
                            kVar.f10666a = applicationContext3;
                            new Thread(new C4339s(applicationContext3, kVar)).start();
                        }
                        if (!str4.matches("[0-9]+")) {
                            IAlog.m16700b("************************************************************************************************************************", new Object[0]);
                            IAlog.m16700b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                            IAlog.m16700b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                            IAlog.m16700b("************************************************************************************************************************", new Object[0]);
                        }
                        iAConfigManager2.f10541f = applicationContext3;
                        iAConfigManager2.f10538c = str4;
                        iAConfigManager2.f10545j = new InneractiveUserConfig();
                        iAConfigManager2.f10543h = true;
                        C4271d0 d0Var = iAConfigManager2.f10559x;
                        d0Var.getClass();
                        C4263b bVar = new C4263b(d0Var);
                        IAConfigManager iAConfigManager3 = IAConfigManager.f10525J;
                        C4311i iVar2 = iAConfigManager3.f10557v;
                        if (!iVar2.f10662d) {
                            iVar2.f10661c.add(bVar);
                        }
                        C5384w0 w0Var = new C5384w0(TimeUnit.MINUTES, (long) iAConfigManager3.f10557v.f10660b.mo24345a("session_duration", 30, 1));
                        bVar.f10583c = w0Var;
                        w0Var.f14266e = bVar.f10586f;
                        d0Var.f10603c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        C4247d dVar = new C4247d(25, (C4247d.C4248a) null);
                        d0Var.f10601a = dVar;
                        C5357n.m16773a(new C4244b(dVar));
                        iAConfigManager2.f10528B = new C4543f0(new C4322n(iAConfigManager2), iAConfigManager2.f10541f, new C4268c());
                        C5357n.m16773a(new C4323o(iAConfigManager2));
                        try {
                            str3 = Locale.getDefault().getLanguage();
                            try {
                                IAlog.m16699a("Available device language: %s", str3);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            str3 = null;
                        }
                        iAConfigManager2.f10551p = str3;
                        iAConfigManager2.f10531E.mo24400a();
                    }
                }
                C4388b.f10818a.f10813a = context.getApplicationContext();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("Fyber_Shared_File", 0);
                String string = sharedPreferences.getString("FyberExceptionKey", "empty");
                String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
                String string3 = sharedPreferences.getString("FyberNameKey", "empty");
                String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
                IAlog.m16699a(" name- %s   description - %s exception - %s", string3, string2, string);
                if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
                    IAlog.m16699a("Firing Event 999 for %s", string);
                    C4567p pVar = C4567p.IA_UNCAUGHT_EXCEPTION;
                    C4569q.C4570a aVar2 = new C4569q.C4570a((C5291e) null);
                    aVar2.f11365c = pVar;
                    aVar2.f11363a = null;
                    aVar2.f11366d = null;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception_name", string3);
                        str2 = "FyberNameKey";
                        i = 2;
                    } catch (Exception unused5) {
                        str2 = "FyberNameKey";
                        i = 2;
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", "exception_name", string3);
                    }
                    try {
                        jSONObject.put("description", string2);
                    } catch (Exception unused6) {
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = "description";
                        objArr2[1] = string2;
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", objArr2);
                    }
                    try {
                        jSONObject.put("stack_trace", string);
                    } catch (Exception unused7) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = "stack_trace";
                        objArr3[1] = string;
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", objArr3);
                    }
                    aVar2.f11368f.put(jSONObject);
                    aVar2.mo24768a(string4);
                    sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove(str2).apply();
                }
                Thread.setDefaultUncaughtExceptionHandler(new C4392a(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
                IAConfigManager iAConfigManager4 = IAConfigManager.f10525J;
                iAConfigManager4.f10557v.f10661c.remove(C4388b.f10818a);
                iAConfigManager4.f10557v.f10661c.add(C4388b.f10818a);
                return;
            }
            throw new IllegalArgumentException("Context can't be null");
        }
        IAlog.m16699a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
        m13666a(onFyberMarketplaceInitializedListener2, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, (String) null);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        C4270d dVar = IAConfigManager.f10525J.f10530D;
        if (dVar != null) {
            dVar.getClass();
            if (C5350l.f14216a == null) {
                IAlog.m16703e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f10594a = Boolean.valueOf(z);
            if (!dVar.mo24281a("IAGDPRBool", z)) {
                IAlog.m16703e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            dVar.f10596c = gdprConsentSource;
            if (!dVar.mo24280a("IAGdprSource", gdprConsentSource.name())) {
                IAlog.m16703e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            return;
        }
        IAlog.m16703e("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            iAConfigManager.f10549n = inneractiveMediationName;
            iAConfigManager.f10548m = inneractiveMediationName.getKey();
        }
    }
}
