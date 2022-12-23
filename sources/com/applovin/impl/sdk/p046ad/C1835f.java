package com.applovin.impl.sdk.p046ad;

import com.applovin.impl.sdk.C1959m;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.f */
public final class C1835f extends AppLovinAdImpl {

    /* renamed from: a */
    private AppLovinAd f2971a;

    /* renamed from: b */
    private final C1828d f2972b;

    public C1835f(C1828d dVar, C1959m mVar) {
        super(new JSONObject(), new JSONObject(), C1825b.UNKNOWN, mVar);
        this.f2972b = dVar;
    }

    /* renamed from: c */
    private AppLovinAd m3963c() {
        return (AppLovinAd) this.sdk.mo14310Z().mo14055c(this.f2972b);
    }

    /* renamed from: d */
    private String m3964d() {
        C1828d adZone = getAdZone();
        if (adZone == null || adZone.mo13935e()) {
            return null;
        }
        return adZone.mo13931a();
    }

    /* renamed from: a */
    public AppLovinAd mo14020a() {
        return this.f2971a;
    }

    /* renamed from: a */
    public void mo14021a(AppLovinAd appLovinAd) {
        this.f2971a = appLovinAd;
    }

    /* renamed from: b */
    public AppLovinAd mo14022b() {
        AppLovinAd appLovinAd = this.f2971a;
        return appLovinAd != null ? appLovinAd : m3963c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b = mo14022b();
        return b != null ? b.equals(obj) : super.equals(obj);
    }

    public long getAdIdNumber() {
        AppLovinAd b = mo14022b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0;
    }

    public C1828d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo14022b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f2972b;
    }

    public long getCreatedAtMillis() {
        AppLovinAd b = mo14022b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getCreatedAtMillis();
        }
        return 0;
    }

    public String getOpenMeasurementContentUrl() {
        return null;
    }

    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    public JSONObject getOriginalFullResponse() {
        AppLovinAd b = mo14022b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getOriginalFullResponse();
        }
        return null;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().mo13933c();
    }

    public C1825b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo14022b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : C1825b.UNKNOWN;
    }

    public AppLovinAdType getType() {
        return getAdZone().mo13934d();
    }

    public String getZoneId() {
        if (this.f2972b.mo13935e()) {
            return null;
        }
        return this.f2972b.mo13931a();
    }

    public int hashCode() {
        AppLovinAd b = mo14022b();
        return b != null ? b.hashCode() : super.hashCode();
    }

    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public boolean isVideoAd() {
        AppLovinAd b = mo14022b();
        return b != null && b.isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + m3964d() + '\'' + '}';
    }
}
