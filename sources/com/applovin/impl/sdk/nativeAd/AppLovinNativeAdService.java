package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1826c;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C2092v logger;
    private final C1959m sdk;

    public AppLovinNativeAdService(C1959m mVar) {
        this.sdk = mVar;
        this.logger = mVar.mo14286A();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        StringBuilder sb;
        String str2;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            if (C2092v.m5047a()) {
                C2092v.m5053i(TAG, "Invalid ad token specified");
            }
            C2043j.m4924a(appLovinNativeAdLoadListener, -8);
            return;
        }
        C1826c cVar = new C1826c(trim, this.sdk);
        if (cVar.mo13924b() == C1826c.C1827a.REGULAR) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                vVar.mo14789b(TAG, "Loading next ad for token: " + cVar);
            }
            this.sdk.mo14303S().mo14206a((C1877a) new C1978b(cVar, appLovinNativeAdLoadListener, this.sdk), C1908o.C1910a.MAIN);
            return;
        }
        if (cVar.mo13924b() == C1826c.C1827a.AD_RESPONSE_JSON) {
            JSONObject d = cVar.mo13926d();
            if (d != null) {
                C2040h.m4909f(d, this.sdk);
                C2040h.m4905d(d, this.sdk);
                C2040h.m4904c(d, this.sdk);
                C2040h.m4907e(d, this.sdk);
                if (JsonUtils.getJSONArray(d, CampaignUnit.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (C2092v.m5047a()) {
                        C2092v vVar2 = this.logger;
                        vVar2.mo14789b(TAG, "Rendering ad for token: " + cVar);
                    }
                    this.sdk.mo14303S().mo14206a((C1877a) new C1980d(d, appLovinNativeAdLoadListener, this.sdk), C1908o.C1910a.MAIN);
                    return;
                }
                if (C2092v.m5047a()) {
                    C2092v vVar3 = this.logger;
                    vVar3.mo14793e(TAG, "No ad returned from the server for token: " + cVar);
                }
                C2043j.m4924a(appLovinNativeAdLoadListener, 204);
                return;
            }
            if (C2092v.m5047a()) {
                sb = new StringBuilder();
                str2 = "Unable to retrieve ad response JSON from token: ";
            }
            C2043j.m4924a(appLovinNativeAdLoadListener, -8);
        }
        if (C2092v.m5047a()) {
            sb = new StringBuilder();
            str2 = "Invalid ad token specified: ";
        }
        C2043j.m4924a(appLovinNativeAdLoadListener, -8);
        sb.append(str2);
        sb.append(cVar);
        C2092v.m5053i(TAG, sb.toString());
        C2043j.m4924a(appLovinNativeAdLoadListener, -8);
    }
}
