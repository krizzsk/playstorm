package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C1571a;
import com.applovin.impl.mediation.C1616c;
import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
public class C1607b implements C1571a.C1572a, C1616c.C1618a {

    /* renamed from: a */
    private final C1571a f2180a;

    /* renamed from: b */
    private final C1616c f2181b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdListener f2182c;

    public C1607b(C1959m mVar, MaxAdListener maxAdListener) {
        this.f2182c = maxAdListener;
        this.f2180a = new C1571a(mVar);
        this.f2181b = new C1616c(mVar, this);
    }

    /* renamed from: a */
    public void mo13131a(final C1575c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                C1607b.this.f2182c.onAdHidden(cVar);
            }
        }, cVar.mo13191x());
    }

    /* renamed from: a */
    public void mo13309a(MaxAd maxAd) {
        this.f2181b.mo13350a();
        this.f2180a.mo13129a();
    }

    /* renamed from: b */
    public void mo13310b(C1575c cVar) {
        long v = cVar.mo13189v();
        if (v >= 0) {
            this.f2181b.mo13351a(cVar, v);
        }
        if (cVar.mo13190w()) {
            this.f2180a.mo13130a(cVar, this);
        }
    }

    /* renamed from: c */
    public void mo13311c(C1575c cVar) {
        this.f2182c.onAdHidden(cVar);
    }
}
