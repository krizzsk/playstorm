package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.activity.p026a.C1433b;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p045a.C1799d;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2036e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.b */
public class C1455b extends C1440a {

    /* renamed from: s */
    private final C1433b f1724s = new C1433b(this.f1680a, this.f1684e, this.f1681b);

    /* renamed from: t */
    private C2036e f1725t;

    /* renamed from: u */
    private long f1726u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AtomicBoolean f1727v = new AtomicBoolean();

    public C1455b(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
    }

    /* renamed from: c */
    private long m2535c() {
        if (!(this.f1680a instanceof C1824a)) {
            return 0;
        }
        float l = ((C1824a) this.f1680a).mo13919l();
        if (l <= 0.0f) {
            l = (float) this.f1680a.mo14012s();
        }
        return (long) (((double) Utils.secondsToMillisLong(l)) * (((double) this.f1680a.mo13955R()) / 100.0d));
    }

    /* renamed from: a */
    public void mo12802a() {
    }

    /* renamed from: a */
    public void mo12759a(long j) {
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        this.f1724s.mo12749a(this.f1686g, this.f1685f, viewGroup);
        mo12766a(false);
        this.f1685f.renderAd(this.f1680a);
        mo12765a("javascript:al_onPoststitialShow();", (long) this.f1680a.mo13956S());
        if (mo12788t()) {
            long c = m2535c();
            this.f1726u = c;
            if (c > 0) {
                if (C2092v.m5047a()) {
                    C2092v vVar = this.f1682c;
                    vVar.mo14789b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f1726u + "ms...");
                }
                this.f1725t = C2036e.m4876a(this.f1726u, this.f1681b, new Runnable() {
                    public void run() {
                        if (C2092v.m5047a()) {
                            C1455b.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        C1455b.this.f1727v.set(true);
                    }
                });
            }
        }
        if (this.f1686g != null) {
            if (this.f1680a.mo14012s() >= 0) {
                mo12762a(this.f1686g, this.f1680a.mo14012s(), new Runnable() {
                    public void run() {
                        C1455b.this.f1688i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1686g.setVisibility(0);
            }
        }
        mo12789u();
        this.f1681b.mo14303S().mo14207a((C1877a) new C1934z(this.f1681b, new Runnable() {
            public void run() {
                if (C1455b.this.f1686g != null) {
                    C1455b.this.f1680a.mo12640o().mo13839a((View) C1455b.this.f1685f, (List<C1799d>) Collections.singletonList(new C1799d(C1455b.this.f1686g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C1455b.this.f1680a.mo12640o().mo13838a((View) C1455b.this.f1685f);
                }
            }
        }), C1908o.C1910a.MAIN, TimeUnit.SECONDS.toMillis(1));
        super.mo12770b(Utils.isVideoMutedInitially(this.f1681b));
    }

    /* renamed from: b */
    public void mo12803b() {
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12773e() {
    }

    /* renamed from: h */
    public void mo12776h() {
        mo12781m();
        C2036e eVar = this.f1725t;
        if (eVar != null) {
            eVar.mo14671a();
            this.f1725t = null;
        }
        super.mo12776h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo12781m() {
        C2036e eVar;
        boolean r = mo12786r();
        int i = 100;
        if (mo12788t()) {
            if (!r && (eVar = this.f1725t) != null) {
                i = (int) Math.min(100.0d, (((double) (this.f1726u - eVar.mo14672b())) / ((double) this.f1726u)) * 100.0d);
            }
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        super.mo12758a(i, false, r, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo12786r() {
        if (mo12788t()) {
            return this.f1727v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo12787s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12789u() {
        long j;
        int l;
        long j2 = 0;
        if (this.f1680a.mo13984ad() >= 0 || this.f1680a.mo13985ae() >= 0) {
            if (this.f1680a.mo13984ad() >= 0) {
                j = this.f1680a.mo13984ad();
            } else {
                if (this.f1680a.mo13986af() && ((l = (int) ((C1824a) this.f1680a).mo13919l()) > 0 || (l = (int) this.f1680a.mo14012s()) > 0)) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) l);
                }
                j = (long) (((double) j2) * (((double) this.f1680a.mo13985ae()) / 100.0d));
            }
            mo12768b(j);
        }
    }
}
