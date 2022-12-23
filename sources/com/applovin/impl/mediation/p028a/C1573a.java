package com.applovin.impl.mediation.p028a;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.mediation.C1730g;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a */
public abstract class C1573a extends C1578f implements MaxAd {

    /* renamed from: a */
    protected C1730g f2056a;

    /* renamed from: c */
    private final AtomicBoolean f2057c = new AtomicBoolean();

    /* renamed from: d */
    private MaxAdWaterfallInfo f2058d;

    /* renamed from: e */
    private String f2059e;

    protected C1573a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1730g gVar, C1959m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
        this.f2056a = gVar;
    }

    /* renamed from: a */
    public static C1573a m2943a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, (String) null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new C1574b(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new C1576d(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new C1575c(map, jSONObject, jSONObject2, mVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* renamed from: u */
    private long mo13174u() {
        return mo13232b("load_started_time_ms", 0);
    }

    /* renamed from: a */
    public abstract C1573a mo13132a(C1730g gVar);

    /* renamed from: a */
    public String mo13133a() {
        return this.f2059e;
    }

    /* renamed from: a */
    public void mo13134a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !mo13236b(CampaignEx.JSON_KEY_CREATIVE_ID)) {
                mo13240c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
            }
            if (bundle.containsKey("ad_width") && !mo13236b("ad_width") && bundle.containsKey("ad_height") && !mo13236b("ad_height")) {
                int i = BundleUtils.getInt("ad_width", bundle);
                int i2 = BundleUtils.getInt("ad_height", bundle);
                mo13238c("ad_width", i);
                mo13238c("ad_height", i2);
            }
        }
    }

    /* renamed from: a */
    public void mo13135a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f2058d = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void mo13136a(String str) {
        this.f2059e = str;
    }

    /* renamed from: a */
    public void mo13137a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject b = mo13138b();
            JsonUtils.putAll(b, jSONObject);
            mo13230a(Utils.KEY_AD_VALUES, (Object) b);
        }
    }

    /* renamed from: b */
    public JSONObject mo13138b() {
        return mo13229a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    /* renamed from: c */
    public JSONObject mo13139c() {
        return mo13229a("revenue_parameters", new JSONObject());
    }

    /* renamed from: d */
    public String mo13140d() {
        return JsonUtils.getString(mo13139c(), "revenue_event", "");
    }

    /* renamed from: e */
    public boolean mo13141e() {
        C1730g gVar = this.f2056a;
        return gVar != null && gVar.mo13619f() && this.f2056a.mo13620g();
    }

    /* renamed from: f */
    public String mo13142f() {
        return mo13227a("event_id", "");
    }

    /* renamed from: g */
    public C1730g mo13143g() {
        return this.f2056a;
    }

    public String getAdReviewCreativeId() {
        return this.f2066b.mo14287B().mo14135a(mo13142f());
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        JSONObject b = mo13138b();
        if (b.has(str)) {
            return JsonUtils.getString(b, str, str2);
        }
        Bundle U = mo13217U();
        return U.containsKey(str) ? U.getString(str) : mo13234b(str, str2);
    }

    public String getCreativeId() {
        return mo13234b(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    public String getDspId() {
        return mo13234b("dsp_id", (String) null);
    }

    public String getDspName() {
        return mo13234b("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(mo13234b(FirebaseAnalytics.Param.AD_FORMAT, mo13227a(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        return null;
    }

    public String getNetworkName() {
        return mo13234b("network_name", "");
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(mo13162l());
    }

    public double getRevenue() {
        return JsonUtils.getDouble(mo13229a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    public String getRevenuePrecision() {
        return JsonUtils.getString(mo13229a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public AppLovinSdkUtils.Size getSize() {
        int b = mo13231b("ad_width", -3);
        int b2 = mo13231b("ad_height", -3);
        return (b == -3 || b2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(b, b2);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.f2058d;
    }

    /* renamed from: h */
    public Bundle mo13158h() {
        JSONObject jSONObject;
        if (mo13236b("credentials")) {
            jSONObject = mo13229a("credentials", new JSONObject());
        } else {
            jSONObject = mo13229a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_PLACEMENT_ID, mo13162l());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    /* renamed from: i */
    public String mo13159i() {
        return mo13234b("bid_response", (String) null);
    }

    /* renamed from: j */
    public long mo13160j() {
        return mo13232b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1, mo13217U()));
    }

    /* renamed from: k */
    public boolean mo13161k() {
        return mo13233b("is_js_tag_ad", (Boolean) false).booleanValue();
    }

    /* renamed from: l */
    public String mo13162l() {
        return mo13234b("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: m */
    public String mo13163m() {
        return mo13227a("waterfall_name", "");
    }

    /* renamed from: n */
    public String mo13164n() {
        return mo13227a("waterfall_test_name", "");
    }

    /* renamed from: o */
    public long mo13165o() {
        if (mo13174u() > 0) {
            return mo13167q() - mo13174u();
        }
        return -1;
    }

    /* renamed from: p */
    public void mo13166p() {
        mo13239c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: q */
    public long mo13167q() {
        return mo13232b("load_completed_time_ms", 0);
    }

    /* renamed from: r */
    public void mo13168r() {
        mo13239c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: s */
    public AtomicBoolean mo13169s() {
        return this.f2057c;
    }

    /* renamed from: t */
    public void mo13170t() {
        this.f2056a = null;
        this.f2058d = null;
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + mo13162l() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
