package com.ogury.p376ed.internal;

import com.facebook.appevents.UserDataStore;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ef */
public final class C10487ef {

    /* renamed from: a */
    public static final C10487ef f26514a = new C10487ef();

    private C10487ef() {
    }

    /* renamed from: a */
    public static String m31762a(C10488eg egVar, C10484ec ecVar, String str, C10501es esVar) {
        C10765mq.m32773b(egVar, "requestDetails");
        C10765mq.m32773b(ecVar, "adContent");
        C10765mq.m32773b(str, DataKeys.USER_ID);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", egVar.mo67272a());
        jSONObject.put("at", egVar.mo67273b());
        jSONObject.put(UserDataStore.COUNTRY, egVar.mo67274c());
        jSONObject.put("build", 30105);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(egVar.mo67275d());
        jSONObject.put("apps_publishers", jSONArray);
        jSONObject.put("version", egVar.mo67279h());
        jSONObject.put("device", m31763a(egVar));
        jSONObject.put("content", m31766b(egVar, ecVar, str, esVar));
        JSONObject b = m31765b(egVar);
        if (!C10552ge.m32080a(b)) {
            jSONObject.put("privacy_compliancy", b);
        }
        JSONObject d = m31768d(egVar);
        if (!C10552ge.m32080a(d)) {
            jSONObject.put("targeting", d);
        }
        JSONObject c = m31767c(egVar);
        if (!C10552ge.m32080a(c)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, c);
        }
        String jSONObject2 = jSONObject.toString();
        C10765mq.m32770a((Object) jSONObject2, "requestBody.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private static JSONObject m31763a(C10488eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", egVar.mo67277f());
        jSONObject.put("height", egVar.mo67278g());
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m31766b(C10488eg egVar, C10484ec ecVar, String str, C10501es esVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ecVar.mo67268a());
        jSONObject.put("ad_sync_type", "load");
        if (esVar != null) {
            jSONObject.put("overlay", m31764a(esVar, egVar.mo67280i()));
        }
        if (ecVar.mo67269b() != null) {
            jSONObject.put("ad_unit_id", ecVar.mo67269b());
        }
        if (str.length() > 0) {
            jSONObject.put("app_user_id", str);
        }
        if (ecVar.mo67270c() != null) {
            jSONObject.put("campaign_to_load", ecVar.mo67270c());
        }
        if (ecVar.mo67271d() != null) {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ecVar.mo67271d());
        }
        jSONObject.put("is_omid_compliant", egVar.mo67276e());
        jSONObject.put("omid_integration_version", 3);
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m31765b(C10488eg egVar) {
        JSONObject jSONObject = new JSONObject();
        if (egVar.mo67281j() != null) {
            jSONObject.put("is_child_under_coppa", egVar.mo67281j());
        }
        if (egVar.mo67282k() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", egVar.mo67282k());
        }
        jSONObject.put("consent_token", egVar.mo67284m());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m31767c(C10488eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", egVar.mo67285n());
        return jSONObject;
    }

    /* renamed from: d */
    private static JSONObject m31768d(C10488eg egVar) {
        JSONObject jSONObject = new JSONObject();
        CharSequence l = egVar.mo67283l();
        if (!(l == null || l.length() == 0)) {
            jSONObject.put("ad_content_threshold", egVar.mo67283l());
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m31764a(C10501es esVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", esVar.mo67314a());
        jSONObject2.put("height", esVar.mo67315b());
        jSONObject2.put("scaler", Float.valueOf(f));
        jSONObject.put("overlay_max_size", jSONObject2);
        return jSONObject;
    }
}
