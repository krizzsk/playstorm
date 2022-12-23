package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import androidx.browser.customtabs.CustomTabsCallback;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C1038z0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdColonyInterstitialListener f124a;

    /* renamed from: b */
    private C0712f f125b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0752c f126c;

    /* renamed from: d */
    private AdColonyAdOptions f127d;

    /* renamed from: e */
    private C0930p0 f128e;

    /* renamed from: f */
    private int f129f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f130g;

    /* renamed from: h */
    private String f131h;

    /* renamed from: i */
    private final String f132i;

    /* renamed from: j */
    private String f133j;

    /* renamed from: k */
    private String f134k;

    /* renamed from: l */
    private C0713g f135l;

    /* renamed from: m */
    private boolean f136m;

    /* renamed from: n */
    private String f137n;

    /* renamed from: o */
    final C1038z0.C1040b f138o = new C0707a();

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$a */
    class C0707a implements C1038z0.C1040b {

        /* renamed from: a */
        private boolean f139a;

        C0707a() {
        }

        /* renamed from: a */
        public boolean mo10251a() {
            return this.f139a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            r0 = com.adcolony.sdk.C0714a.m136b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (r0.mo10809I() == false) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            r0.mo10815a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r0 = new com.adcolony.sdk.C0817e0.C0818a().mo10684a("Ad show failed due to a native timeout (5000 ms). ");
            r0.mo10684a("Interstitial with adSessionId(" + com.adcolony.sdk.AdColonyInterstitial.m79a(r3.f140b) + "). ").mo10684a("Reloading controller.").mo10685a(com.adcolony.sdk.C0817e0.f434i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (com.adcolony.sdk.C0714a.m139d() != false) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f139a     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                return
            L_0x0007:
                r0 = 1
                r3.f139a = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                boolean r0 = com.adcolony.sdk.C0714a.m139d()
                if (r0 != 0) goto L_0x0012
                return
            L_0x0012:
                com.adcolony.sdk.k r0 = com.adcolony.sdk.C0714a.m136b()
                boolean r1 = r0.mo10809I()
                if (r1 == 0) goto L_0x001f
                r0.mo10815a()
            L_0x001f:
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "Ad show failed due to a native timeout (5000 ms). "
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Interstitial with adSessionId("
                r1.append(r2)
                com.adcolony.sdk.AdColonyInterstitial r2 = com.adcolony.sdk.AdColonyInterstitial.this
                java.lang.String r2 = r2.f130g
                r1.append(r2)
                java.lang.String r2 = "). "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                java.lang.String r1 = "Reloading controller."
                com.adcolony.sdk.e0$a r0 = r0.mo10684a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f434i
                r0.mo10685a((com.adcolony.sdk.C0817e0) r1)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColonyInterstitial.C0707a.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$b */
    class C0708b implements Runnable {
        C0708b() {
        }

        public void run() {
            if (!(C0714a.m129a() instanceof AdColonyInterstitialActivity) && AdColonyInterstitial.this.f124a != null) {
                AdColonyInterstitial.this.f124a.onOpened(AdColonyInterstitial.this);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$c */
    class C0709c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0781d f142a;

        /* renamed from: b */
        final /* synthetic */ String f143b;

        C0709c(C0781d dVar, String str) {
            this.f142a = dVar;
            this.f143b = str;
        }

        public void run() {
            Context a = C0714a.m129a();
            if (a instanceof C0730b) {
                this.f142a.mo10647a(a, C0764c0.m322b(), this.f143b);
            } else {
                if (AdColonyInterstitial.this.f124a != null) {
                    AdColonyInterstitial.this.f124a.onClosed(AdColonyInterstitial.this);
                    AdColonyInterstitial.this.setListener((AdColonyInterstitialListener) null);
                }
                AdColonyInterstitial.this.mo10398o();
                AdColonyInterstitial.this.destroy();
                C0714a.m136b().mo10833e(false);
            }
            if (AdColonyInterstitial.this.f126c != null) {
                this.f142a.mo10649a(AdColonyInterstitial.this.f126c);
                C0752c unused = AdColonyInterstitial.this.f126c = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$d */
    class C0710d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f145a;

        C0710d(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f145a = adColonyInterstitialListener;
        }

        public void run() {
            this.f145a.onRequestNotFilled(AdColony.m25a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$e */
    class C0711e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f147a;

        C0711e(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f147a = adColonyInterstitialListener;
        }

        public void run() {
            this.f147a.onExpiring(AdColonyInterstitial.this);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$f */
    interface C0712f {
        /* renamed from: a */
        void mo10414a();
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$g */
    enum C0713g {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f124a = adColonyInterstitialListener;
        this.f132i = str2;
        this.f130g = str;
        this.f135l = C0713g.REQUESTED;
    }

    /* renamed from: k */
    private boolean m82k() {
        String e = C0714a.m136b().mo10848s().mo10884e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        return viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(e) || viewNetworkPassFilter.equals(TtmlNode.COMBINE_ALL) || (viewNetworkPassFilter.equals(CustomTabsCallback.ONLINE_EXTRAS_KEY) && (e.equals(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI) || e.equals("cell"))) || (viewNetworkPassFilter.equals("offline") && e.equals("none"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10373a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10379c(String str) {
    }

    public boolean cancel() {
        if (this.f126c == null) {
            return false;
        }
        Context a = C0714a.m129a();
        if (a != null && !(a instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "id", this.f126c.mo10563a());
        new C0841h0("AdSession.on_request_close", this.f126c.mo10591k(), b).mo10776c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0752c mo10381d() {
        return this.f126c;
    }

    public boolean destroy() {
        C0714a.m136b().mo10827c().mo10661f().remove(this.f130g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10385e(String str) {
        if (C0714a.m139d()) {
            C0857k b = C0714a.m136b();
            C0781d c = b.mo10827c();
            C1038z0.m1202b((Runnable) new C0708b());
            AdColonyZone adColonyZone = b.mo10803C().get(this.f132i);
            if (adColonyZone != null && adColonyZone.isRewarded()) {
                C0823f1 f1Var = new C0823f1();
                C0764c0.m326b(f1Var, CampaignEx.JSON_KEY_REWARD_AMOUNT, adColonyZone.getRewardAmount());
                C0764c0.m319a(f1Var, CampaignEx.JSON_KEY_REWARD_NAME, adColonyZone.getRewardName());
                C0764c0.m328b(f1Var, "success", true);
                C0764c0.m319a(f1Var, "zone_id", this.f132i);
                b.mo10834e(new C0841h0("AdColony.v4vc_reward", 0, f1Var));
            }
            C1038z0.m1202b((Runnable) new C0709c(c, str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo10386f() {
        return this.f129f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10387g() {
        return this.f134k;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f124a;
    }

    public String getViewNetworkPassFilter() {
        return this.f137n;
    }

    public String getZoneID() {
        return this.f132i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10391h() {
        return this.f136m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10392i() {
        return this.f128e != null;
    }

    public boolean isExpired() {
        C0713g gVar = this.f135l;
        return gVar == C0713g.EXPIRED || gVar == C0713g.SHOWN || gVar == C0713g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo10394j() {
        return this.f135l == C0713g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo10395l() {
        return this.f135l == C0713g.REQUESTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo10396m() {
        return this.f135l == C0713g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10397n() {
        C1038z0.m1206c((Runnable) this.f138o);
        Context a = C0714a.m129a();
        if (a == null || !C0714a.m139d() || this.f138o.mo10251a()) {
            return false;
        }
        C0714a.m136b().mo10822a(this.f126c);
        C0714a.m136b().mo10820a(this);
        C1038z0.m1183a(new Intent(a, AdColonyInterstitialActivity.class));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo10398o() {
        C0712f fVar;
        synchronized (this) {
            mo10401r();
            fVar = this.f125b;
            if (fVar != null) {
                this.f125b = null;
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.mo10414a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo10399p() {
        mo10402s();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f124a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C1038z0.m1202b((Runnable) new C0711e(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo10400q() {
        mo10407u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f124a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C1038z0.m1202b((Runnable) new C0710d(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10401r() {
        this.f135l = C0713g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10402s() {
        this.f135l = C0713g.EXPIRED;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f124a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f137n = str;
    }

    public boolean show() {
        boolean z = false;
        if (!C0714a.m139d()) {
            return false;
        }
        C0857k b = C0714a.m136b();
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m319a(b2, "zone_id", this.f132i);
        C0764c0.m326b(b2, "type", 0);
        C0764c0.m319a(b2, "id", this.f130g);
        if (mo10396m()) {
            C0764c0.m326b(b2, "request_fail_reason", 24);
            new C0817e0.C0818a().mo10684a("This ad object has already been shown. Please request a new ad ").mo10684a("via AdColony.requestInterstitial.").mo10685a(C0817e0.f431f);
        } else if (this.f135l == C0713g.EXPIRED) {
            C0764c0.m326b(b2, "request_fail_reason", 17);
            new C0817e0.C0818a().mo10684a("This ad object has expired. Please request a new ad via AdColony").mo10684a(".requestInterstitial.").mo10685a(C0817e0.f431f);
        } else if (b.mo10810J()) {
            C0764c0.m326b(b2, "request_fail_reason", 23);
            new C0817e0.C0818a().mo10684a("Can not show ad while an interstitial is already active.").mo10685a(C0817e0.f431f);
        } else if (mo10374a(b.mo10803C().get(this.f132i))) {
            C0764c0.m326b(b2, "request_fail_reason", 11);
        } else if (!m82k()) {
            C0764c0.m326b(b2, "request_fail_reason", 9);
            new C0817e0.C0818a().mo10684a("Tried to show interstitial ad during unacceptable network conditions.").mo10685a(C0817e0.f431f);
        } else {
            mo10408v();
            C0714a.m136b().mo10833e(true);
            C1038z0.m1187a((Runnable) this.f138o, 5000);
            z = true;
        }
        AdColonyAdOptions adColonyAdOptions = this.f127d;
        if (adColonyAdOptions != null) {
            C0764c0.m328b(b2, "pre_popup", adColonyAdOptions.f83a);
            C0764c0.m328b(b2, "post_popup", this.f127d.f84b);
        }
        AdColonyZone adColonyZone = b.mo10803C().get(this.f132i);
        if (adColonyZone != null && adColonyZone.isRewarded() && b.mo10852w() == null) {
            new C0817e0.C0818a().mo10684a("Rewarded ad: show() called with no reward listener set.").mo10685a(C0817e0.f431f);
        }
        new C0841h0("AdSession.launch_ad_unit", 1, b2).mo10776c();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10406t() {
        this.f135l = C0713g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10407u() {
        this.f135l = C0713g.NOT_FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10408v() {
        this.f135l = C0713g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo10375b() {
        return this.f130g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo10378c() {
        return this.f133j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10382d(String str) {
        this.f134k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10374a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo10454a() == 0) {
                adColonyZone.mo10456b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo10456b(adColonyZone.mo10454a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10376b(String str) {
        this.f133j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10377b(boolean z) {
        this.f136m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10369a(C0712f fVar) {
        boolean z;
        synchronized (this) {
            if (this.f135l == C0713g.CLOSED) {
                z = true;
            } else {
                this.f125b = fVar;
                z = false;
            }
        }
        if (z) {
            fVar.mo10414a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10371a(C0823f1 f1Var) {
        if (!f1Var.mo10729b()) {
            this.f128e = new C0930p0(f1Var, this.f130g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10370a(C0752c cVar) {
        this.f126c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10368a(AdColonyAdOptions adColonyAdOptions) {
        this.f127d = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10367a(int i) {
        this.f129f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10366a() {
        String str = this.f131h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0930p0 mo10384e() {
        return this.f128e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10372a(String str) {
        this.f131h = str;
    }
}
