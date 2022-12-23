package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.d */
public class C1980d extends C1877a {

    /* renamed from: a */
    private final JSONObject f3745a;

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f3746c;

    public C1980d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1959m mVar) {
        super("TaskProcessNativeAdResponse", mVar);
        this.f3745a = jSONObject;
        this.f3746c = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f3745a, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (C2092v.m5047a()) {
                mo14142a("Processing ad...");
            }
            this.f3467b.mo14303S().mo14205a((C1877a) new C1981e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f3745a, this.f3746c, this.f3467b));
            return;
        }
        if (C2092v.m5047a()) {
            mo14145c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f3745a, this.f3467b);
        this.f3746c.onNativeAdLoadFailed(204);
    }
}
