package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.adcolonysdk.BuildConfig;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0919o;
import com.adcolony.sdk.C1038z0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

public class AdColony {

    /* renamed from: a */
    private static ExecutorService f48a = C1038z0.m1219h();

    /* renamed from: com.adcolony.sdk.AdColony$a */
    class C0692a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0857k f49a;

        /* renamed from: b */
        final /* synthetic */ C0960t0 f50b;

        /* renamed from: c */
        final /* synthetic */ AdColonySignalsListener f51c;

        /* renamed from: com.adcolony.sdk.AdColony$a$a */
        class C0693a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f52a;

            C0693a(String str) {
                this.f52a = str;
            }

            public void run() {
                if (!this.f52a.isEmpty()) {
                    C0692a.this.f51c.onSuccess(this.f52a);
                } else {
                    C0692a.this.f51c.onFailure();
                }
            }
        }

        C0692a(C0857k kVar, C0960t0 t0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f49a = kVar;
            this.f50b = t0Var;
            this.f51c = adColonySignalsListener;
        }

        public void run() {
            C0857k kVar = this.f49a;
            C1038z0.m1202b((Runnable) new C0693a(AdColony.m37b(kVar, this.f50b, kVar.mo10854y())));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$b */
    class C0694b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f54a;

        /* renamed from: b */
        final /* synthetic */ String f55b;

        C0694b(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f54a = adColonyAdViewListener;
            this.f55b = str;
        }

        public void run() {
            this.f54a.onRequestNotFilled(AdColony.m25a(this.f55b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$c */
    class C0695c implements Callable<C0823f1> {

        /* renamed from: a */
        final /* synthetic */ long f56a;

        C0695c(long j) {
            this.f56a = j;
        }

        /* renamed from: b */
        public C0823f1 call() {
            return AdColony.m36b(this.f56a);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$d */
    class C0696d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ double f57a;

        /* renamed from: b */
        final /* synthetic */ String f58b;

        /* renamed from: c */
        final /* synthetic */ String f59c;

        /* renamed from: d */
        final /* synthetic */ String f60d;

        C0696d(double d, String str, String str2, String str3) {
            this.f57a = d;
            this.f58b = str;
            this.f59c = str2;
            this.f60d = str3;
        }

        public void run() {
            AdColony.m38b();
            C0823f1 b = C0764c0.m322b();
            double d = this.f57a;
            if (d >= 0.0d) {
                C0764c0.m316a(b, "price", d);
            }
            String str = this.f58b;
            if (str != null && str.length() <= 3) {
                C0764c0.m319a(b, "currency_code", this.f58b);
            }
            C0764c0.m319a(b, "product_id", this.f59c);
            C0764c0.m319a(b, "transaction_id", this.f60d);
            new C0841h0("AdColony.on_iap_report", 1, b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$e */
    class C0697e implements C1038z0.C1040b {

        /* renamed from: a */
        private boolean f61a;

        /* renamed from: b */
        final /* synthetic */ AdColonyAdViewListener f62b;

        /* renamed from: c */
        final /* synthetic */ String f63c;

        /* renamed from: d */
        final /* synthetic */ C1038z0.C1041c f64d;

        C0697e(AdColonyAdViewListener adColonyAdViewListener, String str, C1038z0.C1041c cVar) {
            this.f62b = adColonyAdViewListener;
            this.f63c = str;
            this.f64d = cVar;
        }

        /* renamed from: a */
        public boolean mo10251a() {
            return this.f61a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0817e0.C0818a().mo10684a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo10684a("Timeout set to: " + r6.f64d.mo11155b() + " ms. ");
            r0.mo10684a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f64d.mo11156c()) + " ms. ").mo10684a("AdView request not yet started.").mo10685a(com.adcolony.sdk.C0817e0.f434i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m32a(r6.f62b, r6.f63c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f64d.mo11154a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f61a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f61a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyAdViewListener r0 = r6.f62b
                java.lang.String r1 = r6.f63c
                com.adcolony.sdk.AdColony.m32a((com.adcolony.sdk.AdColonyAdViewListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f64d
                boolean r0 = r0.mo11154a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f64d
                long r2 = r2.mo11155b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f64d
                long r4 = r4.mo11156c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.String r1 = "AdView request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f434i
                r0.mo10685a((com.adcolony.sdk.C0817e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0697e.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$f */
    class C0698f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1038z0.C1040b f65a;

        /* renamed from: b */
        final /* synthetic */ String f66b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f67c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdSize f68d;

        /* renamed from: e */
        final /* synthetic */ AdColonyAdOptions f69e;

        /* renamed from: f */
        final /* synthetic */ C1038z0.C1041c f70f;

        C0698f(C1038z0.C1040b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, C1038z0.C1041c cVar) {
            this.f65a = bVar;
            this.f66b = str;
            this.f67c = adColonyAdViewListener;
            this.f68d = adColonyAdSize;
            this.f69e = adColonyAdOptions;
            this.f70f = cVar;
        }

        public void run() {
            C0857k b = C0714a.m136b();
            if (b.mo10805E() || b.mo10806F()) {
                AdColony.m42f();
                C1038z0.m1185a(this.f65a);
            } else if (AdColony.m38b() || !C0714a.m138c()) {
                C1038z0.m1206c((Runnable) this.f65a);
                if (!this.f65a.mo10251a()) {
                    b.mo10827c().mo10650a(this.f66b, this.f67c, this.f68d, this.f69e, this.f70f.mo11157d());
                }
            } else {
                C1038z0.m1185a(this.f65a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$g */
    class C0699g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAppOptions f71a;

        C0699g(AdColonyAppOptions adColonyAppOptions) {
            this.f71a = adColonyAppOptions;
        }

        public void run() {
            AdColony.m38b();
            C0823f1 b = C0764c0.m322b();
            C0764c0.m318a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, this.f71a.mo10321b());
            new C0841h0("Options.set_options", 1, b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$h */
    class C0700h implements C1038z0.C1040b {

        /* renamed from: a */
        private boolean f72a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f73b;

        /* renamed from: c */
        final /* synthetic */ String f74c;

        /* renamed from: d */
        final /* synthetic */ C1038z0.C1041c f75d;

        C0700h(AdColonyInterstitialListener adColonyInterstitialListener, String str, C1038z0.C1041c cVar) {
            this.f73b = adColonyInterstitialListener;
            this.f74c = str;
            this.f75d = cVar;
        }

        /* renamed from: a */
        public boolean mo10251a() {
            return this.f72a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0817e0.C0818a().mo10684a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo10684a("Timeout set to: " + r6.f75d.mo11155b() + " ms. ");
            r0.mo10684a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f75d.mo11156c()) + " ms. ").mo10684a("Interstitial request not yet started.").mo10685a(com.adcolony.sdk.C0817e0.f434i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m33a(r6.f73b, r6.f74c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f75d.mo11154a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f72a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f72a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyInterstitialListener r0 = r6.f73b
                java.lang.String r1 = r6.f74c
                com.adcolony.sdk.AdColony.m33a((com.adcolony.sdk.AdColonyInterstitialListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f75d
                boolean r0 = r0.mo11154a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f75d
                long r2 = r2.mo11155b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f75d
                long r4 = r4.mo11156c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.String r1 = "Interstitial request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f434i
                r0.mo10685a((com.adcolony.sdk.C0817e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0700h.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$i */
    class C0701i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1038z0.C1040b f76a;

        /* renamed from: b */
        final /* synthetic */ String f77b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f78c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdOptions f79d;

        /* renamed from: e */
        final /* synthetic */ C1038z0.C1041c f80e;

        C0701i(C1038z0.C1040b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, C1038z0.C1041c cVar) {
            this.f76a = bVar;
            this.f77b = str;
            this.f78c = adColonyInterstitialListener;
            this.f79d = adColonyAdOptions;
            this.f80e = cVar;
        }

        public void run() {
            C0857k b = C0714a.m136b();
            if (b.mo10805E() || b.mo10806F()) {
                AdColony.m42f();
                C1038z0.m1185a(this.f76a);
            } else if (AdColony.m38b() || !C0714a.m138c()) {
                AdColonyZone adColonyZone = b.mo10803C().get(this.f77b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f77b);
                }
                if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                    C1038z0.m1185a(this.f76a);
                    return;
                }
                C1038z0.m1206c((Runnable) this.f76a);
                if (!this.f76a.mo10251a()) {
                    b.mo10827c().mo10651a(this.f77b, this.f78c, this.f79d, this.f80e.mo11157d());
                }
            } else {
                C1038z0.m1185a(this.f76a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$j */
    class C0702j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f81a;

        /* renamed from: b */
        final /* synthetic */ String f82b;

        C0702j(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f81a = adColonyInterstitialListener;
            this.f82b = str;
        }

        public void run() {
            this.f81a.onRequestNotFilled(AdColony.m25a(this.f82b));
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").mo10684a("has not yet been configured.").mo10685a(C0817e0.f431f);
            return false;
        } else if (!C1038z0.m1213e(str)) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.addCustomMessageListener.").mo10685a(C0817e0.f431f);
            return false;
        } else {
            C0714a.m136b().mo10842m().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m37b(C0857k kVar, C0960t0 t0Var, long j) {
        C0934q n = kVar.mo10843n();
        ArrayList arrayList = new ArrayList(Arrays.asList(new C0823f1[]{C1038z0.m1204c(kVar.mo10850u().mo10321b()), C1038z0.m1177a(n.mo10981d())}));
        if (j > 0) {
            C0942q0 q0Var = new C0942q0();
            if (n.mo10961N()) {
                arrayList.add(n.mo10971b());
            } else {
                q0Var.mo11013a(n.mo10965a(j));
            }
            if (n.mo10962O()) {
                arrayList.add(n.mo10977c());
            } else {
                q0Var.mo11013a(n.mo10972b(j));
            }
            if (kVar.mo10807G()) {
                q0Var.mo11013a(new C0695c(j));
            } else {
                arrayList.add(m40d());
            }
            if (!q0Var.mo11014b()) {
                arrayList.addAll(q0Var.mo11011a());
            }
        } else {
            arrayList.add(n.mo10971b());
            arrayList.add(n.mo10977c());
            arrayList.add(m40d());
        }
        arrayList.add(kVar.mo10832e());
        C0823f1 a = C0764c0.m313a((C0823f1[]) arrayList.toArray(new C0823f1[0]));
        t0Var.mo11050c();
        C0764c0.m326b(a, "signals_count", t0Var.mo11048b());
        C0764c0.m328b(a, "device_audio", m41e());
        a.mo10735e();
        byte[] bytes = a.toString().getBytes(C0840h.f478a);
        if (kVar.mo10808H()) {
            return m29a(bytes);
        }
        return Base64.encodeToString(bytes, 0);
    }

    /* renamed from: c */
    static void m39c() {
        if (f48a.isShutdown()) {
            f48a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean clearCustomMessageListeners() {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").mo10684a(" has not yet been configured.").mo10685a(C0817e0.f431f);
            return false;
        }
        C0714a.m136b().mo10842m().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10685a(C0817e0.f431f);
            adColonySignalsListener.onFailure();
            return;
        }
        C0857k b = C0714a.m136b();
        if (!m35a((Runnable) new C0692a(b, b.mo10853x(), adColonySignalsListener))) {
            adColonySignalsListener.onFailure();
        }
    }

    @Deprecated
    public static boolean configure(Activity activity, String str, String... strArr) {
        return m34a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: d */
    private static C0823f1 m40d() {
        return m36b(-1);
    }

    public static boolean disable() {
        if (!C0714a.m140e()) {
            return false;
        }
        Context a = C0714a.m129a();
        if (a != null && (a instanceof C0730b)) {
            ((Activity) a).finish();
        }
        C0857k b = C0714a.m136b();
        b.mo10827c().mo10654b();
        b.mo10813R();
        b.mo10814T();
        b.mo10826b(true);
        return true;
    }

    /* renamed from: e */
    private static boolean m41e() {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        return C1038z0.m1201b(C1038z0.m1175a(a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m42f() {
        new C0817e0.C0818a().mo10684a("The AdColony API is not available while AdColony is disabled.").mo10685a(C0817e0.f433h);
    }

    /* renamed from: g */
    static void m43g() {
        f48a.shutdown();
    }

    public static AdColonyAppOptions getAppOptions() {
        if (!C0714a.m140e()) {
            return null;
        }
        return C0714a.m136b().mo10850u();
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (!C0714a.m140e()) {
            return null;
        }
        return C0714a.m136b().mo10842m().get(str);
    }

    public static AdColonyRewardListener getRewardListener() {
        if (!C0714a.m140e()) {
            return null;
        }
        return C0714a.m136b().mo10852w();
    }

    public static String getSDKVersion() {
        if (!C0714a.m140e()) {
            return "";
        }
        return C0714a.m136b().mo10843n().mo10956I();
    }

    public static AdColonyZone getZone(String str) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").mo10684a("configured.").mo10685a(C0817e0.f431f);
            return null;
        }
        HashMap<String, AdColonyZone> C = C0714a.m136b().mo10803C();
        if (C.containsKey(str)) {
            return C.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        C0714a.m136b().mo10803C().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, (String) null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").mo10684a(" has not yet been configured.").mo10685a(C0817e0.f431f);
            return false;
        }
        C0714a.m136b().mo10842m().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").mo10684a("not yet been configured.").mo10685a(C0817e0.f431f);
            return false;
        }
        C0714a.m136b().mo10821a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, (AdColonyAdOptions) null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, (AdColonyAdOptions) null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").mo10684a(" been configured.").mo10685a(C0817e0.f431f);
            return false;
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        C0714a.m133a(adColonyAppOptions);
        if (C0714a.m139d()) {
            C0857k b = C0714a.m136b();
            if (b.mo10804D()) {
                adColonyAppOptions.mo10319a(b.mo10850u().mo10320a());
            }
        }
        C0714a.m136b().mo10825b(adColonyAppOptions);
        Context a = C0714a.m129a();
        if (a != null) {
            adColonyAppOptions.mo10322b(a);
        }
        return m35a((Runnable) new C0699g(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.setRewardListener() as AdColony has not").mo10684a(" yet been configured.").mo10685a(C0817e0.f431f);
            return false;
        }
        C0714a.m136b().mo10821a(adColonyRewardListener);
        return true;
    }

    @Deprecated
    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m34a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d) {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").mo10684a("configured.").mo10685a(C0817e0.f431f);
            return false;
        } else if (!C1038z0.m1213e(str) || !C1038z0.m1213e(str2)) {
            new C0817e0.C0818a().mo10684a("Ignoring call to notifyIAPComplete as one of the passed Strings ").mo10684a("is greater than ").mo10682a(128).mo10684a(" characters.").mo10685a(C0817e0.f431f);
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                new C0817e0.C0818a().mo10684a("You are trying to report an IAP event with a currency String ").mo10684a("containing more than 3 characters.").mo10685a(C0817e0.f431f);
            }
            if (m35a((Runnable) new C0696d(d, str3, str, str2))) {
                return true;
            }
            new C0817e0.C0818a().mo10684a("Executing AdColony.notifyIAPComplete failed").mo10685a(C0817e0.f434i);
            return false;
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new C0817e0.C0818a().mo10684a("AdColonyAdViewListener is set to null. ").mo10684a("It is required to be non null.").mo10685a(C0817e0.f431f);
        }
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to requestAdView as AdColony has not yet been").mo10684a(" configured.").mo10685a(C0817e0.f431f);
            m32a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new C0817e0.C0818a().mo10684a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").mo10684a(" object with an invalid width or height.").mo10685a(C0817e0.f431f);
            m32a(adColonyAdViewListener, str);
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C0950r0.m947a(1, bundle)) {
                m32a(adColonyAdViewListener, str);
                return false;
            }
            C1038z0.C1041c cVar = new C1038z0.C1041c(C0714a.m136b().mo10829d());
            C0697e eVar = new C0697e(adColonyAdViewListener, str, cVar);
            C1038z0.m1187a((Runnable) eVar, cVar.mo11157d());
            if (m35a((Runnable) new C0698f(eVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
                return true;
            }
            C1038z0.m1185a((C1038z0.C1040b) eVar);
            return false;
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new C0817e0.C0818a().mo10684a("AdColonyInterstitialListener is set to null. ").mo10684a("It is required to be non null.").mo10685a(C0817e0.f431f);
        }
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.requestInterstitial as AdColony has not").mo10684a(" yet been configured.").mo10685a(C0817e0.f431f);
            m33a(adColonyInterstitialListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C0950r0.m947a(1, bundle)) {
            m33a(adColonyInterstitialListener, str);
            return false;
        }
        C1038z0.C1041c cVar = new C1038z0.C1041c(C0714a.m136b().mo10829d());
        C0700h hVar = new C0700h(adColonyInterstitialListener, str, cVar);
        C1038z0.m1187a((Runnable) hVar, cVar.mo11157d());
        if (m35a((Runnable) new C0701i(hVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        C1038z0.m1185a((C1038z0.C1040b) hVar);
        return false;
    }

    @Deprecated
    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static boolean m35a(Runnable runnable) {
        return C1038z0.m1190a(f48a, runnable);
    }

    @Deprecated
    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m34a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static String m27a(C0857k kVar, C0960t0 t0Var) {
        return m37b(kVar, t0Var, -1);
    }

    public static boolean configure(Activity activity, String str) {
        return m34a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static String m29a(byte[] bArr) {
        C0824g gVar = new C0824g(BuildConfig.COLLECT_SIGNALS_DICT_ID, "", BuildConfig.COLLECT_SIGNALS_DICT, "");
        try {
            byte[] a = gVar.mo10752a(bArr);
            C0823f1 b = C0764c0.m322b();
            b.mo10717a(CampaignUnit.JSON_KEY_SESSION_ID, gVar.mo10753b());
            b.mo10717a("b", Base64.encodeToString(a, 0));
            return b.toString();
        } catch (UnsupportedEncodingException | JSONException unused) {
            return Base64.encodeToString(bArr, 0);
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str) {
        return m34a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean configure(Application application, String str) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str) {
        return m34a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static boolean m34a(Context context, AdColonyAppOptions adColonyAppOptions, String str) {
        if (C0950r0.m947a(0, (Bundle) null)) {
            new C0817e0.C0818a().mo10684a("Cannot configure AdColony; configuration mechanism requires 5 ").mo10684a("seconds between attempts.").mo10685a(C0817e0.f431f);
            return false;
        }
        if (context == null) {
            context = C0714a.m129a();
        }
        if (context == null) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.configure() as the provided Activity or ").mo10684a("Application context is null and we do not currently hold a ").mo10684a("reference to either for our use.").mo10685a(C0817e0.f431f);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (C0714a.m139d() && !C0764c0.m325b(C0714a.m136b().mo10850u().mo10321b(), "reconfigurable") && !C0714a.m136b().mo10850u().mo10320a().equals(str)) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.configure() as the app id does not ").mo10684a("match what was used during the initial configuration.").mo10685a(C0817e0.f431f);
            return false;
        } else if (str.equals("")) {
            new C0817e0.C0818a().mo10684a("AdColony.configure() called with an empty app id String.").mo10685a(C0817e0.f433h);
            return false;
        } else {
            C0714a.f178c = true;
            adColonyAppOptions.mo10319a(str);
            if (Build.VERSION.SDK_INT < 21) {
                new C0817e0.C0818a().mo10684a("The minimum API level for the AdColony SDK is ").mo10682a(21).mo10684a(".").mo10685a(C0817e0.f431f);
                C0714a.m132a(context, adColonyAppOptions, true);
            } else {
                C0714a.m132a(context, adColonyAppOptions, false);
            }
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "appId", str);
            C0764c0.m338j(b, C0714a.m136b().mo10855z().mo11097f() + "/adc3/AppInfo");
            return true;
        }
    }

    @Deprecated
    public static String collectSignals() {
        if (!C0714a.m140e()) {
            new C0817e0.C0818a().mo10684a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo10685a(C0817e0.f431f);
            return "";
        }
        C0857k b = C0714a.m136b();
        return m27a(b, b.mo10853x());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0823f1 m36b(long j) {
        C0919o.C0921b bVar;
        C0823f1 b = C0764c0.m322b();
        if (j > 0) {
            bVar = C0925o0.m838c().mo10925a(j);
        } else {
            bVar = C0925o0.m838c().mo10932b();
        }
        if (bVar != null) {
            C0764c0.m318a(b, "odt_payload", bVar.mo10914b());
        }
        return b;
    }

    /* renamed from: b */
    static boolean m38b() {
        C0857k b = C0714a.m136b();
        b.mo10816a(15000);
        return b.mo10809I();
    }

    /* renamed from: a */
    static AdColonyZone m25a(String str) {
        AdColonyZone adColonyZone;
        if (C0714a.m138c()) {
            adColonyZone = C0714a.m136b().mo10803C().get(str);
        } else {
            adColonyZone = C0714a.m139d() ? C0714a.m136b().mo10803C().get(str) : null;
        }
        if (adColonyZone != null) {
            return adColonyZone;
        }
        AdColonyZone adColonyZone2 = new AdColonyZone(str);
        adColonyZone2.mo10457c(6);
        return adColonyZone2;
    }

    /* renamed from: a */
    static void m33a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            C1038z0.m1202b((Runnable) new C0702j(adColonyInterstitialListener, str));
        }
    }

    /* renamed from: a */
    static void m32a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            C1038z0.m1202b((Runnable) new C0694b(adColonyAdViewListener, str));
        }
    }

    /* renamed from: a */
    static void m31a(Context context, AdColonyAppOptions adColonyAppOptions) {
        C0857k b = C0714a.m136b();
        C0934q n = b.mo10843n();
        if (adColonyAppOptions != null && context != null) {
            String d = C1038z0.m1210d(context);
            String c = C1038z0.m1205c();
            int d2 = C1038z0.m1208d();
            String m = n.mo10990m();
            String e = b.mo10848s().mo10884e();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", C0714a.m136b().mo10843n().mo10993p());
            hashMap.put("manufacturer", C0714a.m136b().mo10843n().mo10950C());
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, C0714a.m136b().mo10843n().mo10953F());
            hashMap.put("osVersion", C0714a.m136b().mo10843n().mo10955H());
            hashMap.put("carrierName", m);
            hashMap.put("networkType", e);
            hashMap.put(TapjoyConstants.TJC_PLATFORM, "android");
            hashMap.put("appName", d);
            hashMap.put("appVersion", c);
            hashMap.put("appBuildNumber", Integer.valueOf(d2));
            hashMap.put("appId", "" + adColonyAppOptions.mo10320a());
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put(SmaatoSdk.KEY_SDK_VERSION, C0714a.m136b().mo10843n().mo10956I());
            hashMap.put("controllerVersion", "unknown");
            C0823f1 f1Var = new C0823f1(adColonyAppOptions.getMediationInfo());
            C0823f1 f1Var2 = new C0823f1(adColonyAppOptions.getPluginInfo());
            if (!C0764c0.m336h(f1Var, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", C0764c0.m336h(f1Var, "mediation_network"));
                hashMap.put("mediationNetworkVersion", C0764c0.m336h(f1Var, "mediation_network_version"));
            }
            if (!C0764c0.m336h(f1Var2, TapjoyConstants.TJC_PLUGIN).equals("")) {
                hashMap.put(TapjoyConstants.TJC_PLUGIN, C0764c0.m336h(f1Var2, TapjoyConstants.TJC_PLUGIN));
                hashMap.put("pluginVersion", C0764c0.m336h(f1Var2, "plugin_version"));
            }
            b.mo10846q().mo10762a((HashMap<String, Object>) hashMap);
        }
    }
}
