package com.applovin.impl.mediation.p028a;

import com.applovin.impl.mediation.C1730g;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.d */
public class C1576d extends C1577e {

    /* renamed from: c */
    private final AtomicBoolean f2063c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f2064d = new AtomicBoolean();

    private C1576d(C1576d dVar, C1730g gVar) {
        super(dVar.mo13216T(), dVar.mo13206J(), dVar.mo13205I(), gVar, dVar.f2066b);
    }

    public C1576d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        super(map, jSONObject, jSONObject2, (C1730g) null, mVar);
    }

    /* renamed from: a */
    public C1573a mo13132a(C1730g gVar) {
        return new C1576d(this, gVar);
    }

    /* renamed from: a */
    public void mo13194a(MaxNativeAdView maxNativeAdView) {
        this.f2056a.mo13612a(maxNativeAdView);
    }

    public MaxNativeAd getNativeAd() {
        return this.f2056a.mo13615b();
    }

    /* renamed from: u */
    public MaxNativeAdView mo13174u() {
        return this.f2056a.mo13616c();
    }

    /* renamed from: v */
    public String mo13195v() {
        return BundleUtils.getString("template", "", mo13217U());
    }

    /* renamed from: w */
    public boolean mo13196w() {
        return this.f2056a == null;
    }

    /* renamed from: x */
    public AtomicBoolean mo13197x() {
        return this.f2063c;
    }

    /* renamed from: y */
    public AtomicBoolean mo13198y() {
        return this.f2064d;
    }
}
