package com.ogury.p376ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fo */
public final class C10532fo {

    /* renamed from: a */
    public static final C10532fo f26637a = new C10532fo();

    private C10532fo() {
    }

    /* renamed from: a */
    public static C10534fq m32009a(JSONObject jSONObject) {
        C10765mq.m32773b(jSONObject, "jsonObject");
        if (jSONObject.optBoolean("force")) {
            return C10523fg.f26602a;
        }
        if (C10552ge.m32080a(jSONObject)) {
            return C10529fl.f26613a;
        }
        try {
            return m32014b(jSONObject);
        } catch (JSONException e) {
            C10427da daVar = C10427da.f26371a;
            C10427da.m31544a(e);
            return C10529fl.f26613a;
        }
    }

    /* renamed from: b */
    private static C10530fm m32014b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C10530fm fmVar = new C10530fm();
        JSONObject optJSONObject = jSONObject.optJSONObject("profig");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m32013a(optJSONObject, fmVar);
        fmVar.mo67408a(C10552ge.m32077a(optJSONObject.optJSONObject("max_per_day"), "profig", 10));
        fmVar.mo67417c(C10533fp.m32017a(C10552ge.m32077a(optJSONObject.optJSONObject("timeout"), CampaignUnit.JSON_KEY_ADS, 3)));
        fmVar.mo67410a(C10552ge.m32079a(optJSONObject.optJSONObject("logs"), "crash_report", ""));
        fmVar.mo67422d(C10552ge.m32077a(optJSONObject, "adsync_permissions", 0));
        fmVar.mo67426e(C10552ge.m32077a(optJSONObject, "trackers_permissions", 0));
        fmVar.mo67430f(C10552ge.m32077a(optJSONObject, "children_whitelist", 0));
        m32015b(optJSONObject, fmVar);
        m32016c(optJSONObject, fmVar);
        m32012a(optJSONObject, fmVar.mo67439n(), fmVar.mo67440o());
        m32011a(optJSONObject, fmVar.mo67441p());
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache");
        if (optJSONObject2 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject2.optJSONObject("ads_to_precache");
        }
        fmVar.mo67413b(C10552ge.m32077a(jSONObject2, "max", -1));
        fmVar.mo67423d(C10533fp.m32018a(C10552ge.m32078a(optJSONObject2, "ad_expiration", 14400)));
        return fmVar;
    }

    /* renamed from: a */
    private static void m32013a(JSONObject jSONObject, C10530fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("timing_finder");
        fmVar.mo67414b(C10533fp.m32018a(C10552ge.m32078a(optJSONObject, "profig", 43200)));
        fmVar.mo67409a(C10533fp.m32018a(C10552ge.m32078a(optJSONObject, "no_internet_retry", 7200)));
        fmVar.mo67427e(C10533fp.m32018a(C10552ge.m32078a(optJSONObject, "show_close_button", 2)));
    }

    /* renamed from: b */
    private static void m32015b(JSONObject jSONObject, C10530fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("webview");
        fmVar.mo67428e(C10552ge.m32081a(optJSONObject, "back_button_enabled", false));
        fmVar.mo67431f(C10552ge.m32081a(optJSONObject, "close_ad_when_leaving_app", true));
        fmVar.mo67418c(C10533fp.m32018a(C10552ge.m32078a(optJSONObject, "webview_load_timeout", 80)));
    }

    /* renamed from: c */
    private static void m32016c(JSONObject jSONObject, C10530fm fmVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.ENABLED);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String jSONArray = optJSONArray.toString();
        C10765mq.m32770a((Object) jSONArray, "enabledArray.toString()");
        CharSequence charSequence = jSONArray;
        fmVar.mo67411a(C10814oc.m32861b(charSequence, (CharSequence) "profig"));
        fmVar.mo67415b(C10814oc.m32861b(charSequence, (CharSequence) CampaignUnit.JSON_KEY_ADS));
        fmVar.mo67419c(C10814oc.m32861b(charSequence, (CharSequence) "launch"));
        fmVar.mo67424d(C10814oc.m32861b(charSequence, (CharSequence) CampaignEx.KEY_OMID));
    }

    /* renamed from: a */
    private static void m32012a(JSONObject jSONObject, C10524fh fhVar, C10526fj fjVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_config");
        if (optJSONObject != null) {
            fhVar.mo67376a(optJSONObject.optBoolean("multiactivity_enabled", fhVar.mo67377a()));
            m32010a((C10525fi) fhVar, optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overlay_fragment_config");
        if (optJSONObject2 != null) {
            fjVar.mo67388a(optJSONObject2.optBoolean("fragment_filter_enabled", fjVar.mo67389a()));
            m32010a((C10525fi) fjVar, optJSONObject2);
        }
    }

    /* renamed from: a */
    private static void m32011a(JSONObject jSONObject, C10503eu euVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_defaults");
        if (optJSONObject != null) {
            euVar.mo67323a(optJSONObject.optInt("gravity", euVar.mo67322a()));
            euVar.mo67325b(optJSONObject.optInt("x_margin", euVar.mo67324b()));
            euVar.mo67327c(optJSONObject.optInt("y_margin", euVar.mo67326c()));
            euVar.mo67329d(optJSONObject.optInt("max_width", euVar.mo67328d()));
            euVar.mo67331e(optJSONObject.optInt("max_height", euVar.mo67330e()));
        }
    }

    /* renamed from: a */
    private static void m32010a(C10525fi fiVar, JSONObject jSONObject) {
        fiVar.mo67380b(jSONObject.optBoolean("default_whitelist_enabled", fiVar.mo67381b()));
        fiVar.mo67384d(jSONObject.optBoolean("publisher_blacklist_enabled", fiVar.mo67385d()));
        fiVar.mo67382c(jSONObject.optBoolean("publisher_whitelist_enabled", fiVar.mo67383c()));
        fiVar.mo67378a(C10551gd.m32076a(jSONObject.optJSONArray("whitelist")));
        fiVar.mo67379b(C10551gd.m32076a(jSONObject.optJSONArray("blacklist")));
    }

    /* renamed from: a */
    public static C10530fm m32008a(String str) {
        C10765mq.m32773b(str, "profigFullResponse");
        try {
            if (!(str.length() > 0) || C10765mq.m32772a((Object) str, (Object) JsonUtils.EMPTY_JSON)) {
                return null;
            }
            return m32014b(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
