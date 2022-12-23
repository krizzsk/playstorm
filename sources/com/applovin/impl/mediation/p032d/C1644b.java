package com.applovin.impl.mediation.p032d;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.b */
public class C1644b extends C2040h {

    /* renamed from: a */
    private static final String[] f2296a = {CampaignUnit.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b */
    private static final String[] f2297b = {CampaignUnit.JSON_KEY_ADS, "settings", "signal_providers"};

    /* renamed from: a */
    public static String m3306a(C1959m mVar) {
        return C2040h.m4894a((String) mVar.mo14311a(C1856a.f3042c), "1.0/mediate", mVar);
    }

    /* renamed from: a */
    public static void m3307a(JSONObject jSONObject, C1959m mVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f2296a);
            mVar.mo14318a(C1859d.f3363x, shallowCopy.toString());
        }
    }

    /* renamed from: b */
    public static String m3308b(C1959m mVar) {
        return C2040h.m4894a((String) mVar.mo14311a(C1856a.f3043d), "1.0/mediate", mVar);
    }

    /* renamed from: b */
    public static void m3309b(JSONObject jSONObject, C1959m mVar) {
        if (jSONObject.length() != 0) {
            if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
                JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
                JsonUtils.removeObjectsForKeys(shallowCopy, f2297b);
                mVar.mo14318a(C1859d.f3364y, shallowCopy.toString());
                return;
            }
            mVar.mo14346b(C1859d.f3364y);
        }
    }

    /* renamed from: c */
    public static String m3310c(C1959m mVar) {
        return C2040h.m4894a((String) mVar.mo14311a(C1856a.f3042c), "1.0/mediate_debug", mVar);
    }

    /* renamed from: d */
    public static String m3311d(C1959m mVar) {
        return C2040h.m4894a((String) mVar.mo14311a(C1856a.f3043d), "1.0/mediate_debug", mVar);
    }
}
