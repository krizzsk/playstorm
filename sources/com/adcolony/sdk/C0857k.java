package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.adcolony.adcolonysdk.BuildConfig;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0919o;
import com.adcolony.sdk.C0951s;
import com.adcolony.sdk.C0979v;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.adcolony.sdk.k */
class C0857k {

    /* renamed from: Z */
    static String f506Z = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: a0 */
    private static volatile String f507a0 = "";

    /* renamed from: A */
    private boolean f508A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f509B;

    /* renamed from: C */
    private boolean f510C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C0820f f511D = new C0820f();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f512E;

    /* renamed from: F */
    private boolean f513F;

    /* renamed from: G */
    private boolean f514G;

    /* renamed from: H */
    private boolean f515H;

    /* renamed from: I */
    private boolean f516I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f517J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f518K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f519L;

    /* renamed from: M */
    private int f520M;

    /* renamed from: N */
    private int f521N = 1;

    /* renamed from: O */
    private Application.ActivityLifecycleCallbacks f522O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public Partner f523P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C0823f1 f524Q = new C0823f1();

    /* renamed from: R */
    private long f525R = 500;

    /* renamed from: S */
    private long f526S = 500;

    /* renamed from: T */
    private boolean f527T;

    /* renamed from: U */
    private long f528U = SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US;

    /* renamed from: V */
    private long f529V = 300000;

    /* renamed from: W */
    private long f530W = 15000;

    /* renamed from: X */
    private int f531X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f532Y = false;

    /* renamed from: a */
    private C0843i0 f533a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0956t f534b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0960t0 f535c;

    /* renamed from: d */
    private C0781d f536d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0944r f537e;

    /* renamed from: f */
    private C0984w f538f;

    /* renamed from: g */
    private C1005x0 f539g;

    /* renamed from: h */
    private C0983v0 f540h;

    /* renamed from: i */
    private C0826g0 f541i;

    /* renamed from: j */
    private C0934q f542j;

    /* renamed from: k */
    private C0908m0 f543k;

    /* renamed from: l */
    private C0752c f544l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1034z f545m;

    /* renamed from: n */
    private AdColonyAdView f546n;

    /* renamed from: o */
    private AdColonyInterstitial f547o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdColonyRewardListener f548p;

    /* renamed from: q */
    private HashMap<String, AdColonyCustomMessageListener> f549q = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AdColonyAppOptions f550r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C0841h0 f551s;

    /* renamed from: t */
    private C0823f1 f552t;

    /* renamed from: u */
    private HashMap<String, AdColonyZone> f553u = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HashMap<Integer, C0765c1> f554v = new HashMap<>();

    /* renamed from: w */
    private String f555w;

    /* renamed from: x */
    private String f556x;

    /* renamed from: y */
    private String f557y;

    /* renamed from: z */
    private String f558z = "";

    /* renamed from: com.adcolony.sdk.k$a */
    class C0858a implements C0856j0 {
        C0858a(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m326b(b, "crc32", C1038z0.m1174a(C0764c0.m336h(h0Var.mo10772a(), "data")));
            h0Var.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$a0 */
    class C0859a0 implements C0856j0 {
        C0859a0() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0857k.this.m624a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.k$b */
    class C0860b implements C0856j0 {
        C0860b(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            int d = C0764c0.m332d(h0Var.mo10772a(), "number");
            C0823f1 b = C0764c0.m322b();
            C0764c0.m317a(b, "uuids", C1038z0.m1176a(d));
            h0Var.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$b0 */
    class C0861b0 implements C0856j0 {
        C0861b0(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "sha1", C1038z0.m1199b(C0764c0.m336h(h0Var.mo10772a(), "data")));
            h0Var.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$c */
    class C0862c implements C0856j0 {

        /* renamed from: com.adcolony.sdk.k$c$a */
        class C0863a implements C1022y<String> {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f561a;

            C0863a(C0841h0 h0Var) {
                this.f561a = h0Var;
            }

            /* renamed from: a */
            public void mo10856a(String str) {
                C0823f1 b = C0764c0.m322b();
                C0764c0.m319a(b, "advertiser_id", C0857k.this.mo10843n().mo10983f());
                C0764c0.m328b(b, "limit_ad_tracking", C0857k.this.mo10843n().mo10948A());
                this.f561a.mo10773a(b).mo10776c();
            }

            /* renamed from: a */
            public void mo10858a(Throwable th) {
                new C0817e0.C0818a().mo10684a("Device.query_advertiser_info").mo10684a(" failed with error: ").mo10684a(Log.getStackTraceString(th)).mo10685a(C0817e0.f432g);
            }
        }

        C0862c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.mo10843n().mo10967a(C0714a.m129a(), new C0863a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.k$d */
    class C0864d implements C0856j0 {
        C0864d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0953s0 a = C0857k.this.mo10846q().mo10760a();
            C0857k.this.mo10843n().mo10979c(C0764c0.m336h(h0Var.mo10772a(), "version"));
            if (a != null) {
                a.mo11035e(C0857k.this.mo10843n().mo10992o());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$e */
    class C0865e implements C0856j0 {
        C0865e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0823f1 unused = C0857k.this.f524Q = C0764c0.m334f(h0Var.mo10772a(), "signals");
        }
    }

    /* renamed from: com.adcolony.sdk.k$f */
    class C0866f implements C0856j0 {

        /* renamed from: com.adcolony.sdk.k$f$a */
        class C0867a implements C1004x<C0919o.C0921b> {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f566a;

            C0867a(C0866f fVar, C0841h0 h0Var) {
                this.f566a = h0Var;
            }

            /* renamed from: a */
            public void mo10860a(C0919o.C0921b bVar) {
                C0823f1 b = C0764c0.m322b();
                if (bVar != null) {
                    C0764c0.m318a(b, "odt", bVar.mo10914b());
                }
                this.f566a.mo10773a(b).mo10776c();
            }
        }

        C0866f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0857k.this.mo10807G()) {
                C0925o0.m838c().mo10931a((C1004x<C0919o.C0921b>) new C0867a(this, h0Var), C0857k.this.mo10836g());
                return;
            }
            C0919o.C0921b b = C0925o0.m838c().mo10932b();
            C0823f1 b2 = C0764c0.m322b();
            if (b != null) {
                C0764c0.m318a(b2, "odt", b.mo10914b());
            }
            h0Var.mo10773a(b2).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$g */
    class C0868g implements C0856j0 {
        C0868g(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0925o0.m838c().mo10926a();
        }
    }

    /* renamed from: com.adcolony.sdk.k$h */
    class C0869h implements C0856j0 {
        C0869h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.f545m.mo11147a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$i */
    class C0870i implements Runnable {
        C0870i() {
        }

        public void run() {
            Context a = C0714a.m129a();
            if (!C0857k.this.f519L && a != null) {
                try {
                    Omid.activate(a.getApplicationContext());
                    boolean unused = C0857k.this.f519L = true;
                } catch (IllegalArgumentException unused2) {
                    new C0817e0.C0818a().mo10684a("IllegalArgumentException when activating Omid").mo10685a(C0817e0.f434i);
                    boolean unused3 = C0857k.this.f519L = false;
                }
            }
            if (C0857k.this.f519L && C0857k.this.f523P == null) {
                try {
                    Partner unused4 = C0857k.this.f523P = Partner.createPartner("AdColony", "4.8.0");
                } catch (IllegalArgumentException unused5) {
                    new C0817e0.C0818a().mo10684a("IllegalArgumentException when creating Omid Partner").mo10685a(C0817e0.f434i);
                    boolean unused6 = C0857k.this.f519L = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$j */
    class C0871j implements Runnable {

        /* renamed from: com.adcolony.sdk.k$j$a */
        class C0872a implements C0951s.C0952a {
            C0872a() {
            }

            /* renamed from: a */
            public void mo10863a(C0951s sVar, C0841h0 h0Var, Map<String, List<String>> map) {
                C0857k.this.m616a(sVar);
            }
        }

        C0871j() {
        }

        public void run() {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "url", C0857k.f506Z);
            C0764c0.m319a(b, FirebaseAnalytics.Param.CONTENT_TYPE, "application/json");
            C0764c0.m319a(b, "content", C0857k.this.mo10843n().mo10997t().toString());
            C0764c0.m319a(b, "url", C0857k.f506Z);
            if (C0857k.this.f532Y) {
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m319a(b2, "request", BuildConfig.LAUNCH_REQ_DICT_ID);
                C0764c0.m319a(b2, "response", BuildConfig.LAUNCH_RESP_DICT_ID);
                C0764c0.m318a(b, "dictionaries_mapping", b2);
            }
            C0857k.this.f534b.mo11042a(new C0951s(new C0841h0("WebServices.post", 0, b), new C0872a()));
        }
    }

    /* renamed from: com.adcolony.sdk.k$k */
    class C0873k implements C0979v.C0982c {
        C0873k(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10864a() {
            C0925o0.m838c().mo10933d();
        }
    }

    /* renamed from: com.adcolony.sdk.k$l */
    class C0874l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f571a;

        /* renamed from: b */
        final /* synthetic */ C0841h0 f572b;

        C0874l(Context context, C0841h0 h0Var) {
            this.f571a = context;
            this.f572b = h0Var;
        }

        public void run() {
            C0848j a = C0848j.m601a(this.f571a.getApplicationContext(), this.f572b);
            C0857k.this.f554v.put(Integer.valueOf(a.getAdc3ModuleId()), a);
        }
    }

    /* renamed from: com.adcolony.sdk.k$m */
    class C0875m implements Runnable {
        C0875m() {
        }

        public void run() {
            if (C0714a.m136b().mo10853x().mo11057f()) {
                C0857k.this.m606K();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$n */
    class C0876n implements C0951s.C0952a {
        C0876n() {
        }

        /* renamed from: a */
        public void mo10863a(C0951s sVar, C0841h0 h0Var, Map<String, List<String>> map) {
            C0857k.this.m609N();
        }
    }

    /* renamed from: com.adcolony.sdk.k$o */
    class C0877o implements Runnable {
        C0877o() {
        }

        public void run() {
            boolean unused = C0857k.this.m607L();
        }
    }

    /* renamed from: com.adcolony.sdk.k$p */
    class C0878p implements AdColonyInterstitial.C0712f {
        C0878p() {
        }

        /* renamed from: a */
        public void mo10414a() {
            C0857k.this.m626b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$q */
    class C0879q implements AdColonyAdView.C0705c {
        C0879q() {
        }

        /* renamed from: a */
        public void mo10296a() {
            C0857k.this.m626b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$r */
    class C0880r implements C1004x<C0914n0> {
        C0880r(C0857k kVar) {
        }

        /* renamed from: a */
        public void mo10860a(C0914n0 n0Var) {
            C0925o0.m838c().mo10928a(n0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$s */
    class C0881s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0841h0 f579a;

        C0881s(C0841h0 h0Var) {
            this.f579a = h0Var;
        }

        public void run() {
            C0857k.this.f548p.onReward(new AdColonyReward(this.f579a));
        }
    }

    /* renamed from: com.adcolony.sdk.k$t */
    class C0882t implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Set<Integer> f581a = new HashSet();

        C0882t() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C0857k.this.f535c.mo11057f()) {
                C0857k.this.f535c.mo11051c(true);
            }
            C0714a.m131a((Context) activity);
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C0714a.f179d = false;
            C0857k.this.f535c.mo11053d(false);
        }

        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f581a.add(Integer.valueOf(activity.hashCode()));
            C0714a.f179d = true;
            C0714a.m131a((Context) activity);
            C0953s0 a = C0857k.this.mo10846q().mo10760a();
            Context a2 = C0714a.m129a();
            if (a2 == null || !C0857k.this.f535c.mo11055e() || !(a2 instanceof C0730b) || ((C0730b) a2).f254d) {
                C0714a.m131a((Context) activity);
                if (C0857k.this.f551s != null) {
                    if (!Objects.equals(C0764c0.m336h(C0857k.this.f551s.mo10772a(), "m_origin"), "")) {
                        C0857k.this.f551s.mo10773a(C0857k.this.f551s.mo10772a()).mo10776c();
                    }
                    C0841h0 unused = C0857k.this.f551s = null;
                }
                boolean unused2 = C0857k.this.f509B = false;
                C0857k.this.f535c.mo11058g(false);
                if (C0857k.this.f512E && !C0857k.this.f535c.mo11057f()) {
                    C0857k.this.f535c.mo11051c(true);
                }
                C0857k.this.f535c.mo11053d(true);
                C0857k.this.f537e.mo11019c();
                if (a == null || (scheduledExecutorService = a.f741b) == null || scheduledExecutorService.isShutdown() || a.f741b.isTerminated()) {
                    AdColony.m31a((Context) activity, C0714a.m136b().f550r);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C0857k.this.f535c.mo11054e(true);
        }

        public void onActivityStopped(Activity activity) {
            this.f581a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f581a.isEmpty()) {
                C0857k.this.f535c.mo11054e(false);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$u */
    class C0883u implements C0856j0 {
        C0883u() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0857k.this.m633c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$v */
    class C0884v implements C0856j0 {
        C0884v() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.m614a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$w */
    class C0885w implements C0856j0 {
        C0885w() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0953s0 a = C0857k.this.mo10846q().mo10760a();
            C0857k.this.f511D.mo10701a(true);
            if (C0857k.this.f517J) {
                C0823f1 b = C0764c0.m322b();
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m319a(b2, TapjoyConstants.TJC_APP_VERSION_NAME, C1038z0.m1205c());
                C0764c0.m318a(b, "app_bundle_info", b2);
                new C0841h0("AdColony.on_update", 1, b).mo10776c();
                boolean unused = C0857k.this.f517J = false;
            }
            if (C0857k.this.f518K) {
                new C0841h0("AdColony.on_install", 1).mo10776c();
            }
            C0823f1 a2 = h0Var.mo10772a();
            if (a != null) {
                a.mo11036f(C0764c0.m336h(a2, "app_session_id"));
            }
            if (AdColonyEventTracker.m72a()) {
                AdColonyEventTracker.m74b();
            }
            Integer i = a2.mo10740i("base_download_threads");
            if (i != null) {
                C0857k.this.f534b.mo11041a(i.intValue());
            }
            Integer i2 = a2.mo10740i("concurrent_requests");
            if (i2 != null) {
                C0857k.this.f534b.mo11043b(i2.intValue());
            }
            Integer i3 = a2.mo10740i("threads_keep_alive_time");
            if (i3 != null) {
                C0857k.this.f534b.mo11044c(i3.intValue());
            }
            double h = a2.mo10739h("thread_pool_scaling_factor");
            if (!Double.isNaN(h)) {
                C0857k.this.f534b.mo11040a(h);
            }
            C0857k.this.f545m.mo11148b();
            C0857k.this.m608M();
        }
    }

    /* renamed from: com.adcolony.sdk.k$x */
    class C0886x implements C0856j0 {
        C0886x() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.m628b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$y */
    class C0887y implements C0856j0 {
        C0887y() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.mo10834e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$z */
    class C0888z implements C0856j0 {
        C0888z() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0857k.this.m640f(h0Var);
        }
    }

    C0857k() {
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m606K() {
        new Thread(new C0871j()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public boolean m607L() {
        this.f533a.mo10782a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m608M() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "type", "AdColony.on_configuration_completed");
        C0819e1 e1Var = new C0819e1();
        for (String b2 : mo10803C().keySet()) {
            e1Var.mo10692b(b2);
        }
        C0823f1 b3 = C0764c0.m322b();
        C0764c0.m317a(b3, "zone_ids", e1Var);
        C0764c0.m318a(b, "message", b3);
        new C0841h0("CustomMessage.controller_send", 0, b).mo10776c();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m609N() {
        if (m622a(this.f556x) || C0890l.f590H) {
            if (!this.f513F && !this.f516I) {
                C1038z0.m1202b((Runnable) new C0877o());
            }
            if (this.f513F && this.f516I) {
                mo10812Q();
                return;
            }
            return;
        }
        new C0817e0.C0818a().mo10684a("Downloaded controller sha1 does not match, retrying.").mo10685a(C0817e0.f431f);
        m611S();
    }

    /* renamed from: O */
    private void m610O() {
        Application application;
        Context a = C0714a.m129a();
        if (a != null && this.f522O == null && Build.VERSION.SDK_INT > 14) {
            this.f522O = new C0882t();
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.registerActivityLifecycleCallbacks(this.f522O);
        }
    }

    /* renamed from: S */
    private void m611S() {
        if (C0714a.m136b().mo10853x().mo11057f()) {
            int i = this.f520M + 1;
            this.f520M = i;
            this.f521N = Math.min(this.f521N * i, 120);
            C1038z0.m1187a((Runnable) new C0875m(), ((long) this.f521N) * 1000);
            return;
        }
        new C0817e0.C0818a().mo10684a("Max launch server download attempts hit, or AdColony is no longer").mo10684a(" active.").mo10685a(C0817e0.f432g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C1005x0 mo10801A() {
        if (this.f539g == null) {
            C1005x0 x0Var = new C1005x0();
            this.f539g = x0Var;
            x0Var.mo11119a();
        }
        return this.f539g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public HashMap<Integer, C0765c1> mo10802B() {
        return this.f554v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public HashMap<String, AdColonyZone> mo10803C() {
        return this.f553u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo10804D() {
        return this.f550r != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo10805E() {
        return this.f509B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo10806F() {
        return this.f510C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo10807G() {
        return this.f527T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo10808H() {
        return this.f532Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo10809I() {
        return this.f511D.mo10702a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo10810J() {
        return this.f508A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo10811P() {
        this.f511D.mo10701a(false);
        this.f536d.mo10654b();
        Object option = this.f550r.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            mo10813R();
        }
        AdColony.m31a(C0714a.m129a(), this.f550r);
        mo10814T();
        this.f553u.clear();
        this.f533a.mo10782a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo10812Q() {
        this.f531X = 0;
        for (AdColonyInterstitial next : this.f536d.mo10661f().values()) {
            if (next.mo10396m()) {
                this.f531X++;
                next.mo10369a((AdColonyInterstitial.C0712f) new C0878p());
            }
        }
        for (AdColonyAdView onDestroyListenerOrCall : this.f536d.mo10658d().values()) {
            this.f531X++;
            onDestroyListenerOrCall.setOnDestroyListenerOrCall(new C0879q());
        }
        if (this.f531X == 0) {
            mo10811P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo10813R() {
        synchronized (this.f536d.mo10661f()) {
            for (AdColonyInterstitial p : this.f536d.mo10661f().values()) {
                p.mo10399p();
            }
            this.f536d.mo10661f().clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo10814T() {
        mo10823a(1);
        for (C0765c1 b : this.f554v.values()) {
            this.f533a.mo10786b((C0889k0) b);
        }
        this.f554v.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public AdColonyAppOptions mo10850u() {
        if (this.f550r == null) {
            this.f550r = new AdColonyAppOptions();
        }
        return this.f550r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo10851v() {
        return f507a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public AdColonyRewardListener mo10852w() {
        return this.f548p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C0960t0 mo10853x() {
        if (this.f535c == null) {
            C0960t0 t0Var = new C0960t0();
            this.f535c = t0Var;
            t0Var.mo11052d();
        }
        return this.f535c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public long mo10854y() {
        return this.f525R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C0983v0 mo10855z() {
        if (this.f540h == null) {
            C0983v0 v0Var = new C0983v0();
            this.f540h = v0Var;
            v0Var.mo11096e();
        }
        return this.f540h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo10835f() {
        return this.f558z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo10836g() {
        return this.f526S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo10837h() {
        return this.f529V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo10838i() {
        return this.f530W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public AdColonyInterstitial mo10839j() {
        return this.f547o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public AdColonyAdView mo10840k() {
        return this.f546n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0752c mo10841l() {
        return this.f544l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<String, AdColonyCustomMessageListener> mo10842m() {
        return this.f549q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0934q mo10843n() {
        if (this.f542j == null) {
            C0934q qVar = new C0934q();
            this.f542j = qVar;
            qVar.mo10960M();
        }
        return this.f542j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0944r mo10844o() {
        if (this.f537e == null) {
            this.f537e = new C0944r();
        }
        return this.f537e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0984w mo10845p() {
        if (this.f538f == null) {
            C0984w wVar = new C0984w();
            this.f538f = wVar;
            wVar.mo11103b();
        }
        return this.f538f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0826g0 mo10846q() {
        if (this.f541i == null) {
            C0826g0 g0Var = new C0826g0();
            this.f541i = g0Var;
            g0Var.mo10768c();
        }
        return this.f541i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0843i0 mo10847r() {
        if (this.f533a == null) {
            C0843i0 i0Var = new C0843i0();
            this.f533a = i0Var;
            i0Var.mo10782a();
        }
        return this.f533a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0908m0 mo10848s() {
        if (this.f543k == null) {
            this.f543k = new C0908m0();
        }
        return this.f543k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Partner mo10849t() {
        return this.f523P;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m640f(C0841h0 h0Var) {
        AdColonyZone adColonyZone;
        if (!this.f510C) {
            String h = C0764c0.m336h(h0Var.mo10772a(), "zone_id");
            if (this.f553u.containsKey(h)) {
                adColonyZone = this.f553u.get(h);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(h);
                this.f553u.put(h, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo10455a(h0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10830d(C0841h0 h0Var) {
        this.f551s = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10834e(C0841h0 h0Var) {
        if (this.f548p == null) {
            return false;
        }
        C1038z0.m1202b((Runnable) new C0881s(h0Var));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m633c(C0841h0 h0Var) {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        try {
            int j = h0Var.mo10772a().mo10741j("id");
            if (j > 0) {
                mo10823a(j);
            }
            C1038z0.m1202b((Runnable) new C0874l(a, h0Var));
            return true;
        } catch (RuntimeException e) {
            C0817e0.C0818a aVar = new C0817e0.C0818a();
            aVar.mo10684a(e.toString() + ": during WebView initialization.").mo10684a(" Disabling AdColony.").mo10685a(C0817e0.f433h);
            AdColony.disable();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10826b(boolean z) {
        this.f511D.mo10701a(false);
        this.f510C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10831d(boolean z) {
        this.f512E = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10829d() {
        return this.f528U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10833e(boolean z) {
        this.f508A = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0823f1 mo10832e() {
        return this.f524Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m628b(C0841h0 h0Var) {
        C0823f1 b = this.f550r.mo10321b();
        C0764c0.m319a(b, "app_id", this.f550r.mo10320a());
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m318a(b2, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, b);
        h0Var.mo10773a(b2).mo10776c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10819a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            r4 = this;
            r4.f510C = r6
            r4.f550r = r5
            com.adcolony.sdk.i0 r0 = new com.adcolony.sdk.i0
            r0.<init>()
            r4.f533a = r0
            com.adcolony.sdk.m r0 = new com.adcolony.sdk.m
            r0.<init>()
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r4.f542j = r0
            r0.mo10960M()
            com.adcolony.sdk.t r0 = new com.adcolony.sdk.t
            r0.<init>()
            r4.f534b = r0
            r0.mo11039a()
            com.adcolony.sdk.t0 r0 = new com.adcolony.sdk.t0
            r0.<init>()
            r4.f535c = r0
            r0.mo11052d()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r4.f536d = r0
            r0.mo10663h()
            com.adcolony.sdk.r r0 = new com.adcolony.sdk.r
            r0.<init>()
            r4.f537e = r0
            com.adcolony.sdk.w r0 = new com.adcolony.sdk.w
            r0.<init>()
            r4.f538f = r0
            r0.mo11103b()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r4.f541i = r0
            r0.mo10768c()
            com.adcolony.sdk.v0 r0 = new com.adcolony.sdk.v0
            r0.<init>()
            r4.f540h = r0
            r0.mo11096e()
            com.adcolony.sdk.x0 r0 = new com.adcolony.sdk.x0
            r0.<init>()
            r4.f539g = r0
            r0.mo11119a()
            com.adcolony.sdk.m0 r0 = new com.adcolony.sdk.m0
            r0.<init>()
            r4.f543k = r0
            com.adcolony.sdk.z r0 = new com.adcolony.sdk.z
            r0.<init>()
            r4.f545m = r0
            com.adcolony.sdk.m0 r0 = r4.f543k
            r0.mo10883b()
            android.content.Context r0 = com.adcolony.sdk.C0714a.m129a()
            com.adcolony.sdk.AdColony.m31a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r5)
            r5 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0135
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r2 = r4.f540h
            java.lang.String r2 = r2.mo11091a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f514G = r6
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r3 = r4.f540h
            java.lang.String r3 = r3.mo11091a()
            r1.append(r3)
            java.lang.String r3 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f515H = r6
            boolean r1 = r4.f514G
            if (r1 == 0) goto L_0x00fc
            if (r6 == 0) goto L_0x00fc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f540h
            java.lang.String r1 = r1.mo11091a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C0764c0.m331c(r6)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r6 = com.adcolony.sdk.C0764c0.m336h(r6, r1)
            com.adcolony.sdk.q r1 = r4.f542j
            java.lang.String r1 = r1.mo10956I()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x00fc
            r6 = r0
            goto L_0x00fd
        L_0x00fc:
            r6 = r5
        L_0x00fd:
            r4.f513F = r6
            com.adcolony.sdk.v r6 = com.adcolony.sdk.C0979v.m1032a()
            com.adcolony.sdk.k$k r1 = new com.adcolony.sdk.k$k
            r1.<init>(r4)
            r6.mo11085a((com.adcolony.sdk.C0979v.C0982c) r1)
            boolean r6 = r4.f514G
            if (r6 == 0) goto L_0x012d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f540h
            java.lang.String r1 = r1.mo11091a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C0764c0.m331c(r6)
            r4.f552t = r6
            r4.m627b((com.adcolony.sdk.C0823f1) r6)
        L_0x012d:
            boolean r6 = r4.f513F
            r4.m623a((boolean) r6)
            r4.m610O()
        L_0x0135:
            com.adcolony.sdk.k$u r6 = new com.adcolony.sdk.k$u
            r6.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$v r6 = new com.adcolony.sdk.k$v
            r6.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$w r6 = new com.adcolony.sdk.k$w
            r6.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$x r6 = new com.adcolony.sdk.k$x
            r6.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$y r6 = new com.adcolony.sdk.k$y
            r6.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$z r6 = new com.adcolony.sdk.k$z
            r6.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$a0 r6 = new com.adcolony.sdk.k$a0
            r6.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$b0 r6 = new com.adcolony.sdk.k$b0
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$a r6 = new com.adcolony.sdk.k$a
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$b r6 = new com.adcolony.sdk.k$b
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$c r6 = new com.adcolony.sdk.k$c
            r6.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$d r6 = new com.adcolony.sdk.k$d
            r6.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$e r6 = new com.adcolony.sdk.k$e
            r6.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$f r6 = new com.adcolony.sdk.k$f
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$g r6 = new com.adcolony.sdk.k$g
            r6.<init>(r4)
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.k$h r6 = new com.adcolony.sdk.k$h
            r6.<init>()
            java.lang.String r1 = "AdColony.heartbeat"
            com.adcolony.sdk.C0714a.m135a((java.lang.String) r1, (com.adcolony.sdk.C0856j0) r6)
            com.adcolony.sdk.v0 r6 = r4.f540h
            int r6 = com.adcolony.sdk.C1038z0.m1193b((com.adcolony.sdk.C0983v0) r6)
            if (r6 != r0) goto L_0x01df
            r1 = r0
            goto L_0x01e0
        L_0x01df:
            r1 = r5
        L_0x01e0:
            r4.f517J = r1
            r1 = 2
            if (r6 != r1) goto L_0x01e6
            r5 = r0
        L_0x01e6:
            r4.f518K = r5
            com.adcolony.sdk.k$i r5 = new com.adcolony.sdk.k$i
            r5.<init>()
            com.adcolony.sdk.C1038z0.m1202b((java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0857k.mo10819a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m626b() {
        int i = this.f531X - 1;
        this.f531X = i;
        if (i == 0) {
            mo10811P();
        }
    }

    /* renamed from: b */
    private void m627b(C0823f1 f1Var) {
        if (!C0890l.f590H) {
            C0823f1 f = C0764c0.m334f(f1Var, "logging");
            C0826g0.f455h = C0764c0.m306a(f, "send_level", 1);
            C0826g0.f453f = C0764c0.m325b(f, "log_private");
            C0826g0.f454g = C0764c0.m306a(f, "print_level", 3);
            this.f541i.mo10767b(C0764c0.m309a(f, "modules"));
            this.f541i.mo10769c(C0764c0.m333e(f, "included_fields"));
        }
        C0823f1 f2 = C0764c0.m334f(f1Var, "metadata");
        mo10843n().mo10968a(f2);
        mo10853x().mo11046a(C0764c0.m332d(f2, "session_timeout"));
        f507a0 = C0764c0.m336h(f1Var, "pie");
        this.f558z = C0764c0.m336h(C0764c0.m334f(f1Var, "controller"), "version");
        this.f525R = C0764c0.m307a(f2, "signals_timeout", this.f525R);
        this.f526S = C0764c0.m307a(f2, "calculate_odt_timeout", this.f526S);
        this.f527T = C0764c0.m320a(f2, "async_odt_query", this.f527T);
        this.f528U = C0764c0.m307a(f2, "ad_request_timeout", this.f528U);
        this.f529V = C0764c0.m307a(f2, "controller_heartbeat_interval", this.f529V);
        this.f530W = C0764c0.m307a(f2, "controller_heartbeat_timeout", this.f530W);
        this.f532Y = C0764c0.m320a(f2, "enable_compression", false);
        C0979v.m1032a().mo11083a(f2.mo10745n("odt_config"), (C1004x<C0914n0>) new C0880r(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        new java.io.File(r3.f540h.mo11091a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m632c(com.adcolony.sdk.C0823f1 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            com.adcolony.sdk.f1 r1 = com.adcolony.sdk.C0764c0.m334f(r4, r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C0764c0.m336h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f555w = r2     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C0764c0.m336h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f556x = r1     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C0764c0.m336h(r4, r1)     // Catch:{ Exception -> 0x002f }
            r3.f557y = r1     // Catch:{ Exception -> 0x002f }
            r3.m627b((com.adcolony.sdk.C0823f1) r4)     // Catch:{ Exception -> 0x002f }
            boolean r4 = com.adcolony.sdk.AdColonyEventTracker.m72a()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x004e
            com.adcolony.sdk.AdColonyEventTracker.m74b()     // Catch:{ Exception -> 0x002f }
            goto L_0x004e
        L_0x002f:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            r1.<init>()     // Catch:{ Exception -> 0x004e }
            com.adcolony.sdk.v0 r2 = r3.f540h     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = r2.mo11091a()     // Catch:{ Exception -> 0x004e }
            r1.append(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x004e }
            r4.delete()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            java.lang.String r4 = r3.f557y
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0095
            boolean r4 = com.adcolony.sdk.C0890l.f590H
            if (r4 != 0) goto L_0x0095
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r1.<init>()     // Catch:{ Exception -> 0x007b }
            com.adcolony.sdk.v0 r2 = r3.f540h     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r2.mo11091a()     // Catch:{ Exception -> 0x007b }
            r1.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007b }
            r4.<init>(r1)     // Catch:{ Exception -> 0x007b }
            r4.delete()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.e0$a r4 = r4.mo10684a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.e0$a r4 = r4.mo10684a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f432g
            r4.mo10685a((com.adcolony.sdk.C0817e0) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x0095:
            java.lang.String r4 = r3.f555w
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00a7
            java.lang.String r4 = r3.f557y
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00c2
        L_0x00a7:
            boolean r4 = com.adcolony.sdk.C0890l.f590H
            if (r4 != 0) goto L_0x00c2
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.e0$a r4 = r4.mo10684a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.e0$a r4 = r4.mo10684a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0817e0.f434i
            r4.mo10685a((com.adcolony.sdk.C0817e0) r1)
            return r0
        L_0x00c2:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0857k.m632c(com.adcolony.sdk.f1):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10825b(AdColonyAppOptions adColonyAppOptions) {
        this.f550r = adColonyAppOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10828c(boolean z) {
        this.f509B = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0781d mo10827c() {
        if (this.f536d == null) {
            C0781d dVar = new C0781d();
            this.f536d = dVar;
            dVar.mo10663h();
        }
        return this.f536d;
    }

    /* renamed from: a */
    private boolean m623a(boolean z) {
        return m624a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m624a(boolean z, boolean z2) {
        if (!C0714a.m138c()) {
            return false;
        }
        this.f516I = z2;
        this.f513F = z;
        if (z && !z2) {
            if (!m607L()) {
                return false;
            }
            this.f516I = true;
        }
        m606K();
        return true;
    }

    /* renamed from: a */
    private boolean m617a(C0823f1 f1Var) {
        if (!this.f513F) {
            return true;
        }
        C0823f1 f1Var2 = this.f552t;
        if (f1Var2 != null && C0764c0.m336h(C0764c0.m334f(f1Var2, "controller"), "sha1").equals(C0764c0.m336h(C0764c0.m334f(f1Var, "controller"), "sha1"))) {
            return false;
        }
        new C0817e0.C0818a().mo10684a("Controller sha1 does not match, downloading new controller.").mo10685a(C0817e0.f432g);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m614a(C0841h0 h0Var) {
        mo10823a(C0764c0.m332d(h0Var.mo10772a(), "id"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m616a(C0951s sVar) {
        if (sVar.f737n) {
            C0823f1 a = C0764c0.m312a(sVar.f736m, "Parsing launch response");
            C0764c0.m319a(a, SmaatoSdk.KEY_SDK_VERSION, mo10843n().mo10956I());
            C0764c0.m338j(a, this.f540h.mo11091a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
            if (m632c(a)) {
                if (m617a(a)) {
                    C0823f1 b = C0764c0.m322b();
                    C0764c0.m319a(b, "url", this.f555w);
                    C0764c0.m319a(b, "filepath", this.f540h.mo11091a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                    this.f534b.mo11042a(new C0951s(new C0841h0("WebServices.download", 0, b), new C0876n()));
                }
                this.f552t = a;
            } else if (!this.f513F) {
                new C0817e0.C0818a().mo10684a("Incomplete or disabled launch server response. ").mo10684a("Disabling AdColony until next launch.").mo10685a(C0817e0.f433h);
                mo10826b(true);
            }
        } else {
            m611S();
        }
    }

    /* renamed from: a */
    private boolean m622a(String str) {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        File file = new File(a.getFilesDir().getAbsolutePath() + "/adc3/" + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
        if (file.exists()) {
            return C1038z0.m1189a(str, file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10815a() {
        this.f536d.mo10646a();
        mo10811P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10818a(AdColonyAppOptions adColonyAppOptions) {
        this.f511D.mo10701a(false);
        this.f536d.mo10654b();
        mo10813R();
        AdColony.m31a(C0714a.m129a(), adColonyAppOptions);
        mo10814T();
        this.f553u.clear();
        this.f550r = adColonyAppOptions;
        this.f533a.mo10782a();
        m624a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10824a(C0889k0 k0Var) {
        this.f554v.remove(Integer.valueOf(k0Var.getModuleId()));
        return this.f533a.mo10786b(k0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10823a(int i) {
        this.f554v.remove(Integer.valueOf(i));
        return this.f533a.mo10785b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10821a(AdColonyRewardListener adColonyRewardListener) {
        this.f548p = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10822a(C0752c cVar) {
        this.f544l = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10817a(AdColonyAdView adColonyAdView) {
        this.f546n = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10820a(AdColonyInterstitial adColonyInterstitial) {
        this.f547o = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10816a(long j) {
        this.f511D.mo10700a(j);
    }
}
