package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1576d;
import com.applovin.impl.mediation.p028a.C1577e;
import com.applovin.impl.sdk.C1817aa;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.C2101z;

/* renamed from: com.applovin.impl.mediation.ads.b */
public class C1606b implements C1817aa.C1820a {

    /* renamed from: a */
    private final C1959m f2175a;

    /* renamed from: b */
    private final C1576d f2176b;

    /* renamed from: c */
    private final C1817aa f2177c;

    /* renamed from: d */
    private final C2101z f2178d;

    /* renamed from: e */
    private final C1604a.C1605a f2179e;

    public C1606b(C1576d dVar, C1604a.C1605a aVar, C1959m mVar) {
        this.f2175a = mVar;
        this.f2176b = dVar;
        this.f2179e = aVar;
        this.f2178d = new C2101z(this.f2176b.mo13174u(), mVar);
        C1817aa aaVar = new C1817aa(this.f2176b.mo13174u(), mVar, this);
        this.f2177c = aaVar;
        aaVar.mo13893a((C1577e) this.f2176b);
        if (C2092v.m5047a()) {
            C2092v A = mVar.mo14286A();
            A.mo14789b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m3148a(long j) {
        if (this.f2176b.mo13198y().compareAndSet(false, true)) {
            if (C2092v.m5047a()) {
                this.f2175a.mo14286A().mo14789b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f2175a.mo14290E().processViewabilityAdImpressionPostback(this.f2176b, j, this.f2179e);
        }
    }

    /* renamed from: a */
    public void mo13306a() {
        this.f2177c.mo13892a();
    }

    /* renamed from: b */
    public void mo13307b() {
        if (C2092v.m5047a()) {
            this.f2175a.mo14286A().mo14789b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f2176b.mo13197x().compareAndSet(false, true)) {
            if (C2092v.m5047a()) {
                this.f2175a.mo14286A().mo14789b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            this.f2175a.mo14290E().processRawAdImpressionPostback(this.f2176b, this.f2179e);
        }
    }

    /* renamed from: c */
    public C1576d mo13308c() {
        return this.f2176b;
    }

    public void onLogVisibilityImpression() {
        m3148a(this.f2178d.mo14810a(this.f2176b));
    }
}
