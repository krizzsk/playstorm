package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;

/* renamed from: com.applovin.impl.sdk.utils.k */
public class C2078k {

    /* renamed from: a */
    private final StringBuilder f4061a = new StringBuilder();

    /* renamed from: a */
    public C2078k mo14712a() {
        this.f4061a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C2078k mo14713a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            mo14719a(str, bundle.get(str));
        }
        return this;
    }

    /* renamed from: a */
    public C2078k mo14714a(AppLovinAdView appLovinAdView) {
        return mo14719a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).mo14719a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).mo14719a("Visibility", C2085q.m5022b(appLovinAdView.getVisibility()));
    }

    /* renamed from: a */
    public C2078k mo14715a(C1573a aVar) {
        String str = "None";
        C2078k a = mo14719a("Network", aVar.mo13209M()).mo14719a("Format", aVar.getFormat().getLabel()).mo14719a("Ad Unit ID", aVar.getAdUnitId()).mo14719a("Placement", aVar.getPlacement()).mo14719a("Network Placement", aVar.mo13162l()).mo14719a("Serve ID", aVar.mo13142f()).mo14719a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : str).mo14719a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : str);
        if (StringUtils.isValidString(aVar.getDspId())) {
            str = aVar.getDspId();
        }
        return a.mo14719a("DSP ID", str).mo14719a("Server Parameters", aVar.mo13217U());
    }

    /* renamed from: a */
    public C2078k mo14716a(C1829e eVar) {
        boolean z = eVar instanceof C1401a;
        mo14719a("Format", eVar.getAdZone().mo13932b() != null ? eVar.getAdZone().mo13932b().getLabel() : null).mo14719a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).mo14719a("Zone ID", eVar.getAdZone().mo13931a()).mo14719a("Source", eVar.getSource()).mo14719a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            mo14719a("DSP Name", dspName);
        }
        if (z) {
            mo14719a("VAST DSP", ((C1401a) eVar).mo12637l());
        }
        return this;
    }

    /* renamed from: a */
    public C2078k mo14717a(C1959m mVar) {
        return mo14719a("Muted", Boolean.valueOf(mVar.mo14363p().isMuted())).mo14719a("ExoPlayer eligible", Boolean.valueOf(Utils.checkExoPlayerEligibility(mVar)));
    }

    /* renamed from: a */
    public C2078k mo14718a(String str) {
        StringBuilder sb = this.f4061a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C2078k mo14719a(String str, Object obj) {
        return mo14720a(str, obj, "");
    }

    /* renamed from: a */
    public C2078k mo14720a(String str, Object obj, String str2) {
        StringBuilder sb = this.f4061a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* renamed from: b */
    public C2078k mo14721b(C1829e eVar) {
        mo14719a("Target", eVar.mo14009p()).mo14719a("close_style", eVar.mo14014u()).mo14720a("close_delay_graphic", Long.valueOf(eVar.mo14012s()), "s");
        if (eVar instanceof C1824a) {
            C1824a aVar = (C1824a) eVar;
            mo14719a("HTML", aVar.mo12621b().substring(0, Math.min(aVar.mo12621b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            mo14720a("close_delay", Long.valueOf(eVar.mo14010q()), "s").mo14719a("skip_style", eVar.mo14016w()).mo14719a("Streaming", Boolean.valueOf(eVar.mo12626f())).mo14719a("Video Location", eVar.mo12623d()).mo14719a("video_button_properties", eVar.mo13941C());
        }
        return this;
    }

    /* renamed from: b */
    public C2078k mo14722b(String str) {
        this.f4061a.append(str);
        return this;
    }

    public String toString() {
        return this.f4061a.toString();
    }
}
