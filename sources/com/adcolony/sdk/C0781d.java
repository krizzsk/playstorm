package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.C0817e0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.d */
class C0781d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ConcurrentHashMap<String, Runnable> f370a;

    /* renamed from: b */
    private HashMap<String, C0752c> f371b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ConcurrentHashMap<String, AdColonyInterstitial> f372c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f373d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f374e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<String, AdColonyAdView> f375f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f376g = new Object();

    /* renamed from: com.adcolony.sdk.d$a */
    class C0782a implements C0856j0 {
        C0782a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0781d.this.mo10660e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C0783b implements C0856j0 {

        /* renamed from: com.adcolony.sdk.d$b$a */
        class C0784a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f379a;

            C0784a(C0841h0 h0Var) {
                this.f379a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0781d.this.f372c.get(C0764c0.m336h(this.f379a.mo10772a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C0783b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1038z0.m1202b((Runnable) new C0784a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C0785c implements C0856j0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C0786a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f382a;

            C0786a(C0841h0 h0Var) {
                this.f382a = h0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0781d.this.f372c.get(C0764c0.m336h(this.f382a.mo10772a(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C0785c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1038z0.m1202b((Runnable) new C0786a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C0787d implements C0856j0 {
        C0787d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0781d.this.mo10665i(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C0788e implements C0856j0 {
        C0788e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0781d.this.mo10664h(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C0789f implements C0856j0 {
        C0789f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0781d.this.m393g(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C0790g implements C0856j0 {
        C0790g(C0781d dVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m328b(b, "success", true);
            h0Var.mo10773a(b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C0791h implements C0856j0 {

        /* renamed from: com.adcolony.sdk.d$h$a */
        class C0792a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f387a;

            C0792a(C0791h hVar, C0841h0 h0Var) {
                this.f387a = h0Var;
            }

            public void run() {
                C0841h0 h0Var = this.f387a;
                h0Var.mo10773a(h0Var.mo10772a()).mo10776c();
            }
        }

        C0791h(C0781d dVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1038z0.m1202b((Runnable) new C0792a(this, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C0793i implements C0856j0 {
        C0793i(C0781d dVar) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0925o0.m838c().mo10927a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C0794j implements Runnable {
        C0794j(C0781d dVar) {
        }

        public void run() {
            C0944r o = C0714a.m136b().mo10844o();
            if (o.mo11016a() != null) {
                o.mo11016a().dismiss();
                o.mo11017a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C0795k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f388a;

        /* renamed from: b */
        final /* synthetic */ C0841h0 f389b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f390c;

        /* renamed from: d */
        final /* synthetic */ String f391d;

        C0795k(Context context, C0841h0 h0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f388a = context;
            this.f389b = h0Var;
            this.f390c = adColonyAdViewListener;
            this.f391d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView;
            try {
                adColonyAdView = new AdColonyAdView(this.f388a, this.f389b, this.f390c);
            } catch (RuntimeException e) {
                new C0817e0.C0818a().mo10684a(e.toString()).mo10685a(C0817e0.f434i);
                adColonyAdView = null;
            }
            synchronized (C0781d.this.f376g) {
                if (C0781d.this.f374e.remove(this.f391d) != null) {
                    if (adColonyAdView == null) {
                        C0781d.this.m377a(this.f390c);
                        return;
                    }
                    C0781d.this.f375f.put(this.f391d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f390c.mo10310b());
                    adColonyAdView.mo10273e();
                    this.f390c.mo10308a((C0930p0) null);
                    this.f390c.onRequestFilled(adColonyAdView);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C0796l implements C0856j0 {

        /* renamed from: com.adcolony.sdk.d$l$a */
        class C0797a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f394a;

            C0797a(C0841h0 h0Var) {
                this.f394a = h0Var;
            }

            public void run() {
                C0781d.this.mo10657c(this.f394a);
            }
        }

        C0796l() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1038z0.m1202b((Runnable) new C0797a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C0798m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0841h0 f396a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f397b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f398c;

        C0798m(C0781d dVar, C0841h0 h0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f396a = h0Var;
            this.f397b = adColonyInterstitial;
            this.f398c = adColonyInterstitialListener;
        }

        public void run() {
            C0823f1 a = this.f396a.mo10772a();
            if (this.f397b.mo10384e() == null) {
                this.f397b.mo10371a(C0764c0.m334f(a, "iab"));
            }
            this.f397b.mo10372a(C0764c0.m336h(a, "ad_id"));
            this.f397b.mo10379c(C0764c0.m336h(a, CampaignEx.JSON_KEY_CREATIVE_ID));
            this.f397b.setViewNetworkPassFilter(C0764c0.m336h(a, "view_network_pass_filter"));
            C0930p0 e = this.f397b.mo10384e();
            if (!(e == null || e.mo10944d() == 2)) {
                try {
                    e.mo10937a();
                } catch (IllegalArgumentException unused) {
                    new C0817e0.C0818a().mo10684a("IllegalArgumentException when creating omid session").mo10685a(C0817e0.f434i);
                }
            }
            this.f398c.onRequestFilled(this.f397b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C0799n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f399a;

        C0799n(C0781d dVar, AdColonyAdViewListener adColonyAdViewListener) {
            this.f399a = adColonyAdViewListener;
        }

        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f399a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.m25a(adColonyAdViewListener.mo10311c()));
            if (!C0714a.m138c()) {
                new C0817e0.C0818a().mo10684a("RequestNotFilled called for AdView due to a missing context. ").mo10685a(C0817e0.f434i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C0800o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f400a;

        /* renamed from: b */
        final /* synthetic */ String f401b;

        /* renamed from: c */
        final /* synthetic */ long f402c;

        C0800o(String str, String str2, long j) {
            this.f400a = str;
            this.f401b = str2;
            this.f402c = j;
        }

        public void run() {
            C0781d.this.f370a.remove(this.f400a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) C0781d.this.f373d.remove(this.f400a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.m25a(this.f401b));
                C0823f1 b = C0764c0.m322b();
                C0764c0.m319a(b, "id", this.f400a);
                C0764c0.m319a(b, "zone_id", this.f401b);
                C0764c0.m326b(b, "type", 1);
                C0764c0.m326b(b, "request_fail_reason", 26);
                new C0841h0("AdSession.on_request_failure", 1, b).mo10776c();
                C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("RequestNotFilled called due to a native timeout. ");
                C0817e0.C0818a a2 = a.mo10684a("Timeout set to: " + C0714a.m136b().mo10829d() + " ms. ");
                C0817e0.C0818a a3 = a2.mo10684a("AdView request time allowed: " + this.f402c + " ms. ");
                a3.mo10684a("AdView with adSessionId(" + this.f400a + ") - request failed.").mo10685a(C0817e0.f434i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C0801p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f404a;

        /* renamed from: b */
        final /* synthetic */ String f405b;

        /* renamed from: c */
        final /* synthetic */ long f406c;

        C0801p(String str, String str2, long j) {
            this.f404a = str;
            this.f405b = str2;
            this.f406c = j;
        }

        public void run() {
            AdColonyInterstitialListener adColonyInterstitialListener;
            C0781d.this.f370a.remove(this.f404a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0781d.this.f372c.remove(this.f404a);
            if (adColonyInterstitial == null) {
                adColonyInterstitialListener = null;
            } else {
                adColonyInterstitialListener = adColonyInterstitial.getListener();
            }
            if (adColonyInterstitialListener != null) {
                adColonyInterstitialListener.onRequestNotFilled(AdColony.m25a(this.f405b));
                C0823f1 b = C0764c0.m322b();
                C0764c0.m319a(b, "id", this.f404a);
                C0764c0.m319a(b, "zone_id", this.f405b);
                C0764c0.m326b(b, "type", 0);
                C0764c0.m326b(b, "request_fail_reason", 26);
                new C0841h0("AdSession.on_request_failure", 1, b).mo10776c();
                C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("RequestNotFilled called due to a native timeout. ");
                C0817e0.C0818a a2 = a.mo10684a("Timeout set to: " + C0714a.m136b().mo10829d() + " ms. ");
                C0817e0.C0818a a3 = a2.mo10684a("Interstitial request time allowed: " + this.f406c + " ms. ");
                a3.mo10684a("Interstitial with adSessionId(" + this.f404a + ") - request failed.").mo10685a(C0817e0.f434i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C0802q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f408a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f409b;

        C0802q(C0781d dVar, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f408a = adColonyInterstitialListener;
            this.f409b = adColonyInterstitial;
        }

        public void run() {
            C0714a.m136b().mo10833e(false);
            this.f408a.onClosed(this.f409b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C0803r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f410a;

        /* renamed from: b */
        final /* synthetic */ C0733b1 f411b;

        /* renamed from: c */
        final /* synthetic */ C0752c f412c;

        C0803r(String str, C0733b1 b1Var, C0752c cVar) {
            this.f410a = str;
            this.f411b = b1Var;
            this.f412c = cVar;
        }

        public void run() {
            C0930p0 p0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = C0781d.this.mo10661f().get(this.f410a);
                AdColonyAdView adColonyAdView = C0781d.this.mo10658d().get(this.f410a);
                if (adColonyInterstitial == null) {
                    p0Var = null;
                } else {
                    p0Var = adColonyInterstitial.mo10384e();
                }
                if (p0Var == null && adColonyAdView != null) {
                    p0Var = adColonyAdView.getOmidManager();
                }
                if (p0Var == null) {
                    i = -1;
                } else {
                    i = p0Var.mo10944d();
                }
                if (p0Var != null && i == 2) {
                    p0Var.mo10938a((WebView) this.f411b);
                    p0Var.mo10939a(this.f412c);
                }
            } catch (IllegalArgumentException unused) {
                new C0817e0.C0818a().mo10684a("IllegalArgumentException when creating omid session").mo10685a(C0817e0.f434i);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C0804s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0752c f414a;

        C0804s(C0781d dVar, C0752c cVar) {
            this.f414a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f414a.mo10587i().size(); i++) {
                C0714a.m137b(this.f414a.mo10589j().get(i), this.f414a.mo10587i().get(i));
            }
            this.f414a.mo10589j().clear();
            this.f414a.mo10587i().clear();
            this.f414a.removeAllViews();
            C0752c cVar = this.f414a;
            cVar.f330z = null;
            cVar.f329y = null;
            for (C0733b1 next : cVar.mo10594n().values()) {
                if (!(next instanceof C0815e)) {
                    if (next instanceof C0765c1) {
                        C0714a.m136b().mo10824a((C0889k0) (C0765c1) next);
                    } else {
                        next.mo10536l();
                    }
                }
            }
            for (C0719a1 next2 : this.f414a.mo10593m().values()) {
                next2.mo10478j();
                next2.mo10479k();
            }
            this.f414a.mo10593m().clear();
            this.f414a.mo10592l().clear();
            this.f414a.mo10594n().clear();
            this.f414a.mo10585h().clear();
            this.f414a.mo10578e().clear();
            this.f414a.mo10581f().clear();
            this.f414a.mo10583g().clear();
            this.f414a.f317m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C0805t implements C0856j0 {

        /* renamed from: com.adcolony.sdk.d$t$a */
        class C0806a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f416a;

            C0806a(C0841h0 h0Var) {
                this.f416a = h0Var;
            }

            public void run() {
                boolean unused = C0781d.this.m387d(this.f416a);
            }
        }

        C0805t() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C1038z0.m1202b((Runnable) new C0806a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C0807u implements C0856j0 {
        C0807u() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0781d.this.m395k(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C0808v implements C0856j0 {
        C0808v() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0781d.this.m394j(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C0809w implements C0856j0 {
        C0809w() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0781d.this.m392f(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C0810x implements C0856j0 {
        C0810x() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0781d.this.m396l(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$y */
    class C0811y implements C0856j0 {
        C0811y() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0781d.this.mo10655b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$z */
    class C0812z implements C0856j0 {
        C0812z() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0781d.this.mo10653a(h0Var);
        }
    }

    C0781d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m393g(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "id");
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "id", h);
        Context a = C0714a.m129a();
        if (a == null) {
            C0764c0.m328b(b, "has_audio", false);
            h0Var.mo10773a(b).mo10776c();
            return false;
        }
        boolean b2 = C1038z0.m1201b(C1038z0.m1175a(a));
        double a2 = C1038z0.m1170a(C1038z0.m1175a(a));
        C0764c0.m328b(b, "has_audio", b2);
        C0764c0.m316a(b, TapjoyConstants.TJC_VOLUME, a2);
        h0Var.mo10773a(b).mo10776c();
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m394j(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String b = h0Var.mo10774b();
        String h = C0764c0.m336h(a, "ad_session_id");
        int d = C0764c0.m332d(a, "view_id");
        C0752c cVar = this.f371b.get(h);
        if (cVar == null) {
            mo10652a(b, h);
            return false;
        }
        View view = cVar.mo10578e().get(Integer.valueOf(d));
        if (view == null) {
            mo10652a(b, "" + d);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m395k(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String b = h0Var.mo10774b();
        String h = C0764c0.m336h(a, "ad_session_id");
        int d = C0764c0.m332d(a, "view_id");
        C0752c cVar = this.f371b.get(h);
        if (cVar == null) {
            mo10652a(b, h);
            return false;
        }
        View view = cVar.mo10578e().get(Integer.valueOf(d));
        if (view == null) {
            mo10652a(b, "" + d);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m396l(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f372c.get(h);
        AdColonyAdView adColonyAdView = this.f375f.get(h);
        int a2 = C0764c0.m306a(a, "orientation", -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C0764c0.m319a(C0764c0.m322b(), "id", h);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo10367a(a2);
                adColonyInterstitial.mo10397n();
            }
            return true;
        }
        mo10652a(h0Var.mo10774b(), h);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10663h() {
        this.f370a = new ConcurrentHashMap<>();
        this.f371b = new HashMap<>();
        this.f372c = new ConcurrentHashMap<>();
        this.f373d = new ConcurrentHashMap<>();
        this.f374e = new ConcurrentHashMap<>();
        this.f375f = Collections.synchronizedMap(new HashMap());
        C0714a.m135a("AdContainer.create", (C0856j0) new C0796l());
        C0714a.m135a("AdContainer.destroy", (C0856j0) new C0805t());
        C0714a.m135a("AdContainer.move_view_to_index", (C0856j0) new C0807u());
        C0714a.m135a("AdContainer.move_view_to_front", (C0856j0) new C0808v());
        C0714a.m135a("AdSession.finish_fullscreen_ad", (C0856j0) new C0809w());
        C0714a.m135a("AdSession.start_fullscreen_ad", (C0856j0) new C0810x());
        C0714a.m135a("AdSession.ad_view_available", (C0856j0) new C0811y());
        C0714a.m135a("AdSession.ad_view_unavailable", (C0856j0) new C0812z());
        C0714a.m135a("AdSession.expiring", (C0856j0) new C0782a());
        C0714a.m135a("AdSession.audio_stopped", (C0856j0) new C0783b());
        C0714a.m135a("AdSession.audio_started", (C0856j0) new C0785c());
        C0714a.m135a("AdSession.interstitial_available", (C0856j0) new C0787d());
        C0714a.m135a("AdSession.interstitial_unavailable", (C0856j0) new C0788e());
        C0714a.m135a("AdSession.has_audio", (C0856j0) new C0789f());
        C0714a.m135a("WebView.prepare", (C0856j0) new C0790g(this));
        C0714a.m135a("AdSession.expanded", (C0856j0) new C0791h(this));
        C0714a.m135a("AdColony.odt_event", (C0856j0) new C0793i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10665i(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "id");
        AdColonyInterstitial adColonyInterstitial = this.f372c.get(h);
        if (adColonyInterstitial == null || adColonyInterstitial.mo10394j()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        C1038z0.m1206c(this.f370a.remove(h));
        if (!C0714a.m138c()) {
            m378a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.mo10406t();
        adColonyInterstitial.mo10372a(C0764c0.m336h(a, "ad_id"));
        adColonyInterstitial.mo10379c(C0764c0.m336h(a, CampaignEx.JSON_KEY_CREATIVE_ID));
        adColonyInterstitial.mo10382d(C0764c0.m336h(a, "ad_request_id"));
        C1038z0.m1202b((Runnable) new C0798m(this, h0Var, adColonyInterstitial, listener));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m387d(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "ad_session_id");
        C0752c cVar = this.f371b.get(h);
        if (cVar == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        mo10649a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m392f(C0841h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        C0823f1 a = h0Var.mo10772a();
        int d = C0764c0.m332d(a, "status");
        if (d == 5 || d == 1 || d == 0 || d == 6) {
            return false;
        }
        String h = C0764c0.m336h(a, "id");
        AdColonyInterstitial remove = this.f372c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        C1038z0.m1202b((Runnable) new C0802q(this, adColonyInterstitialListener, remove));
        remove.mo10398o();
        remove.mo10370a((C0752c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10655b(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "id");
        AdColonyAdViewListener remove = this.f373d.remove(h);
        if (remove == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        this.f374e.put(h, remove);
        C1038z0.m1206c(this.f370a.remove(h));
        Context a = C0714a.m129a();
        if (a == null) {
            m377a(remove);
            return false;
        }
        C1038z0.m1202b((Runnable) new C0795k(a, h0Var, remove, h));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10657c(C0841h0 h0Var) {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        C0823f1 a2 = h0Var.mo10772a();
        String h = C0764c0.m336h(a2, "ad_session_id");
        C0752c cVar = new C0752c(a.getApplicationContext(), h);
        cVar.mo10590j(h0Var);
        this.f371b.put(h, cVar);
        if (C0764c0.m332d(a2, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f372c.get(h);
            if (adColonyInterstitial == null) {
                mo10652a(h0Var.mo10774b(), h);
                return false;
            }
            adColonyInterstitial.mo10370a(cVar);
        } else {
            cVar.mo10574c(false);
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m328b(b, "success", true);
        h0Var.mo10773a(b).mo10776c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10660e(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        String h = C0764c0.m336h(a, "id");
        if (C0764c0.m332d(a, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f372c.remove(h);
        if (!C0714a.m138c() || remove == null || !remove.mo10399p()) {
            mo10652a(h0Var.mo10774b(), h);
            return true;
        }
        C1038z0.m1202b((Runnable) new C0794j(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10653a(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "id");
        AdColonyAdViewListener remove = this.f373d.remove(h);
        if (remove == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        C1038z0.m1206c(this.f370a.remove(h));
        m377a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, AdColonyAdView> mo10658d() {
        return this.f375f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10646a() {
        for (AdColonyInterstitial next : this.f372c.values()) {
            if (next != null && next.mo10396m()) {
                next.mo10385e("Controller was reloaded and current ad was closed");
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m377a(AdColonyAdViewListener adColonyAdViewListener) {
        C1038z0.m1202b((Runnable) new C0799n(this, adColonyAdViewListener));
    }

    /* renamed from: a */
    private void m378a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.mo10400q();
        if (!C0714a.m138c()) {
            C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("RequestNotFilled called due to a missing context. ");
            a.mo10684a("Interstitial with adSessionId(" + adColonyInterstitial.mo10375b() + ").").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AdColonyInterstitial> mo10662g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial next : mo10661f().values()) {
            if (!next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10654b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet<>();
        synchronized (this.f376g) {
            for (String remove : this.f374e.keySet()) {
                AdColonyAdViewListener remove2 = this.f374e.remove(remove);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
            for (String remove3 : this.f373d.keySet()) {
                AdColonyAdViewListener remove4 = this.f373d.remove(remove3);
                if (remove4 != null) {
                    hashSet.add(remove4);
                }
            }
        }
        for (AdColonyAdViewListener a : hashSet) {
            m377a(a);
        }
        for (String next : this.f372c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f372c.get(next);
            if (adColonyInterstitial != null && adColonyInterstitial.mo10395l()) {
                this.f372c.remove(next);
                m378a(adColonyInterstitial);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> mo10659e() {
        return this.f373d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10650a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j) {
        C0823f1 f1Var;
        String a = C1038z0.m1178a();
        float s = C0714a.m136b().mo10843n().mo10996s();
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "zone_id", str);
        C0764c0.m326b(b, "type", 1);
        C0764c0.m326b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * s));
        C0764c0.m326b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * s));
        C0764c0.m326b(b, "width", adColonyAdSize.getWidth());
        C0764c0.m326b(b, "height", adColonyAdSize.getHeight());
        C0764c0.m319a(b, "id", a);
        if (!(adColonyAdOptions == null || (f1Var = adColonyAdOptions.f86d) == null)) {
            C0764c0.m318a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, f1Var);
        }
        adColonyAdViewListener.mo10309a(str);
        adColonyAdViewListener.mo10307a(adColonyAdSize);
        this.f373d.put(a, adColonyAdViewListener);
        this.f370a.put(a, new C0800o(a, str, j));
        new C0841h0("AdSession.on_request", 1, b).mo10776c();
        C1038z0.m1187a(this.f370a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, C0752c> mo10656c() {
        return this.f371b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo10661f() {
        return this.f372c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10651a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j) {
        String a = C1038z0.m1178a();
        C0857k b = C0714a.m136b();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m319a(b2, "zone_id", str);
        C0764c0.m328b(b2, "fullscreen", true);
        Rect w = b.mo10843n().mo11000w();
        C0764c0.m326b(b2, "width", w.width());
        C0764c0.m326b(b2, "height", w.height());
        C0764c0.m326b(b2, "type", 0);
        C0764c0.m319a(b2, "id", a);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f86d == null)) {
            adColonyInterstitial.mo10368a(adColonyAdOptions);
            C0764c0.m318a(b2, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, adColonyAdOptions.f86d);
        }
        this.f372c.put(a, adColonyInterstitial);
        this.f370a.put(a, new C0801p(a, str, j));
        new C0841h0("AdSession.on_request", 1, b2).mo10776c();
        C1038z0.m1187a(this.f370a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10647a(Context context, C0823f1 f1Var, String str) {
        C0841h0 h0Var = new C0841h0("AdSession.finish_fullscreen_ad", 0);
        C0764c0.m326b(f1Var, "status", 1);
        h0Var.mo10775b(f1Var);
        new C0817e0.C0818a().mo10684a(str).mo10685a(C0817e0.f433h);
        ((C0730b) context).mo10415a(h0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10648a(C0733b1 b1Var, String str, C0752c cVar) {
        C1038z0.m1202b((Runnable) new C0803r(str, b1Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10649a(C0752c cVar) {
        C1038z0.m1202b((Runnable) new C0804s(this, cVar));
        AdColonyAdView adColonyAdView = this.f375f.get(cVar.mo10563a());
        if (adColonyAdView == null || adColonyAdView.mo10271d()) {
            this.f371b.remove(cVar.mo10563a());
            cVar.f329y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10664h(C0841h0 h0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String h = C0764c0.m336h(h0Var.mo10772a(), "id");
        AdColonyInterstitial remove = this.f372c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo10652a(h0Var.mo10774b(), h);
            return false;
        }
        C1038z0.m1206c(this.f370a.remove(h));
        m378a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10652a(String str, String str2) {
        new C0817e0.C0818a().mo10684a("Message '").mo10684a(str).mo10684a("' sent with invalid id: ").mo10684a(str2).mo10685a(C0817e0.f433h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdView mo10645a(String str) {
        AdColonyAdView remove;
        synchronized (this.f376g) {
            remove = this.f375f.remove(str);
        }
        return remove;
    }
}
