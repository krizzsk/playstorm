package com.ogury.p376ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10491ej;
import com.p374my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.ee */
public final class C10486ee {

    /* renamed from: a */
    public static final C10486ee f26512a = new C10486ee();

    /* renamed from: b */
    private static C10461do f26513b = new C10461do();

    private C10486ee() {
    }

    /* renamed from: a */
    private static void m31759a(String str) {
        C10765mq.m32773b(str, "message");
        OguryIntegrationLogger.m30997e(str);
    }

    /* renamed from: a */
    public static C10490ei m31753a(String str, C10491ej ejVar, C10501es esVar) throws C10499eq {
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        String str5;
        String str6;
        String optString;
        C10765mq.m32773b(str, "adStringResponse");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        JSONObject jSONObject = new JSONObject(str);
        C10461do.m31640a(jSONObject);
        List arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("ad");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        int length = optJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C10483eb ebVar = new C10483eb();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject optJSONObject = jSONObject2.optJSONObject("format");
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("ad_track_urls");
                String optString2 = jSONObject2.optString("ad_content");
                C10765mq.m32770a((Object) optString2, "adJson.optString(\"ad_content\")");
                ebVar.mo67226c(optString2);
                String optString3 = jSONObject2.optString(CampaignEx.JSON_KEY_IMPRESSION_URL);
                C10765mq.m32770a((Object) optString3, "adJson.optString(\"impression_url\")");
                ebVar.mo67232e(optString3);
                String optString4 = jSONObject2.optString("id");
                C10765mq.m32770a((Object) optString4, "adJson.optString(\"id\")");
                ebVar.mo67223b(optString4);
                JSONObject optJSONObject3 = jSONObject2.optJSONObject(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER);
                String str7 = "";
                if (optJSONObject3 == null || (str2 = optJSONObject3.optString("id")) == null) {
                    str2 = str7;
                }
                ebVar.mo67235f(str2);
                String optString5 = jSONObject2.optString("campaign_id");
                C10765mq.m32770a((Object) optString5, "adJson.optString(\"campaign_id\")");
                ebVar.mo67238g(optString5);
                if (optJSONObject == null || (str3 = optJSONObject.optString("webview_base_url")) == null) {
                    str3 = str7;
                }
                ebVar.mo67240h(str3);
                if (optJSONObject == null || (str4 = optJSONObject.optString("mraid_download_url")) == null) {
                    str4 = str7;
                }
                ebVar.mo67246k(str4);
                ebVar.mo67224b(jSONObject2.optBoolean(CampaignEx.KEY_OMID, false));
                ebVar.mo67227c(jSONObject2.optBoolean("is_video", false));
                ebVar.mo67219a(m31756a(jSONObject2.optJSONObject("overlay"), esVar));
                ebVar.mo67216a(m31754a(jSONObject2.optJSONObject("ad_unit"), jSONObject2.optString("id")));
                C10765mq.m32770a((Object) jSONObject2, "adJson");
                ebVar.mo67229d(m31757a("orientation", jSONObject2));
                if (optJSONObject == null) {
                    jSONArray = null;
                } else {
                    jSONArray = optJSONObject.optJSONArray("params");
                }
                ebVar.mo67244j(m31758a(jSONArray));
                ebVar.mo67242i(m31760b(jSONObject2));
                ebVar.mo67221a(jSONObject2.optBoolean("has_transparency", false));
                String optString6 = jSONObject2.optString("sdk_close_button_url", str7);
                C10765mq.m32770a((Object) optString6, "adJson.optString(\"sdk_close_button_url\", \"\")");
                ebVar.mo67248l(optString6);
                String optString7 = jSONObject2.optString("landing_page_prefetch_url", str7);
                C10765mq.m32770a((Object) optString7, "adJson.optString(\"landing_page_prefetch_url\", \"\")");
                ebVar.mo67250m(optString7);
                ebVar.mo67230d(jSONObject2.optBoolean("landing_page_disable_javascript", false));
                String optString8 = jSONObject2.optString("landing_page_prefetch_whitelist", str7);
                C10765mq.m32770a((Object) optString8, "adJson.optString(\"landin…_prefetch_whitelist\", \"\")");
                ebVar.mo67251n(optString8);
                ebVar.mo67236f(jSONObject2.optBoolean("ad_keep_alive", false));
                ebVar.mo67220a(C10765mq.m32765a(UUID.randomUUID().toString(), (Object) ebVar.mo67237g()));
                ebVar.mo67233e(!jSONObject2.has("overlay") && !jSONObject2.has(AdFormat.BANNER));
                ebVar.mo67215a(ejVar);
                if (C10765mq.m32772a((Object) ebVar.mo67249m().mo67296c(), (Object) ejVar.mo67287a())) {
                    arrayList.add(ebVar);
                } else {
                    C10491ej.C10492a aVar = C10491ej.f26522a;
                    m31759a("[Ads][" + ejVar.mo67288b() + "][load][" + ebVar.mo67249m().mo67292a() + "] Wrong ad unit id type. Expected ad unit id of type " + ejVar.mo67288b() + ", but received ad unit id of type " + C10491ej.C10492a.m31804a(ebVar.mo67249m().mo67296c()) + '.');
                }
                if (optJSONObject2 == null || (str5 = optJSONObject2.optString("ad_track_url")) == null) {
                    str5 = str7;
                }
                ebVar.mo67253o(str5);
                if (optJSONObject2 == null || (str6 = optJSONObject2.optString("ad_precache_url")) == null) {
                    str6 = str7;
                }
                ebVar.mo67255p(str6);
                if (!(optJSONObject2 == null || (optString = optJSONObject2.optString("ad_history_url")) == null)) {
                    str7 = optString;
                }
                ebVar.mo67258q(str7);
                ebVar.mo67217a(m31755a(jSONObject2.optJSONObject(AdFormat.BANNER)));
                ebVar.mo67218a(m31761c(jSONObject2));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new C10490ei(arrayList);
    }

    /* renamed from: a */
    private static C10493ek m31754a(JSONObject jSONObject, String str) {
        C10493ek ekVar = new C10493ek();
        if (jSONObject == null) {
            return ekVar;
        }
        String optString = jSONObject.optString("id");
        String str2 = "";
        if (optString == null) {
            optString = str2;
        }
        ekVar.mo67293a(optString);
        if (str == null) {
            str = str2;
        }
        ekVar.mo67295b(str);
        String optString2 = jSONObject.optString("type");
        if (optString2 == null) {
            optString2 = str2;
        }
        ekVar.mo67297c(optString2);
        if (C10765mq.m32772a((Object) ekVar.mo67296c(), (Object) "optin_video")) {
            String optString3 = jSONObject.optString("app_user_id");
            if (optString3 == null) {
                optString3 = str2;
            }
            ekVar.mo67301e(optString3);
            String optString4 = jSONObject.optString("reward_launch");
            if (optString4 == null) {
                optString4 = str2;
            }
            ekVar.mo67299d(optString4);
            RewardItem e = ekVar.mo67300e();
            String optString5 = jSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME);
            if (optString5 == null) {
                optString5 = str2;
            }
            e.setName(optString5);
            RewardItem e2 = ekVar.mo67300e();
            String optString6 = jSONObject.optString("reward_value");
            if (optString6 != null) {
                str2 = optString6;
            }
            e2.setValue(str2);
        }
        return ekVar;
    }

    /* renamed from: a */
    private static C10495em m31755a(JSONObject jSONObject) {
        C10495em emVar = new C10495em();
        if (jSONObject == null) {
            return new C10495em();
        }
        emVar.mo67303a(jSONObject.optBoolean("full_width", false));
        emVar.mo67305b(jSONObject.optBoolean("auto_refresh", false));
        emVar.mo67302a(jSONObject.optInt("auto_refresh_rate", 0));
        return emVar;
    }

    /* renamed from: b */
    private static String m31760b(JSONObject jSONObject) {
        String str = "";
        String optString = jSONObject.optString("client_tracker_pattern", str);
        if (!C10765mq.m32772a((Object) optString, (Object) "null")) {
            str = optString;
        }
        C10765mq.m32770a((Object) str, "clientTrackerPattern");
        return str;
    }

    /* renamed from: a */
    private static String m31758a(JSONArray jSONArray) {
        int i;
        JSONObject optJSONObject;
        String optString;
        if (jSONArray != null && jSONArray.length() - 1 >= 0) {
            while (true) {
                int i2 = i - 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (C10765mq.m32772a((Object) jSONObject.getString("name"), (Object) "zones")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("value");
                    if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (optString = optJSONObject.optString("name")) == null) {
                        return "";
                    }
                    return optString;
                } else if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static String m31757a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("params");
        if (optJSONArray == null) {
            return "";
        }
        int i = 0;
        int length = optJSONArray.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (C10765mq.m32772a((Object) jSONObject2.getString("name"), (Object) str)) {
                    String string = jSONObject2.getString("value");
                    C10765mq.m32770a((Object) string, "paramElement.getString(\"value\")");
                    return string;
                } else if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static C10502et m31756a(JSONObject jSONObject, C10501es esVar) {
        JSONObject jSONObject2;
        Integer num;
        C10502et etVar = new C10502et();
        if (esVar == null) {
            return etVar;
        }
        boolean z = true;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("draggable", true);
        }
        etVar.mo67317a(z);
        Integer num2 = null;
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("initial_size");
        }
        if (jSONObject2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(jSONObject2.optInt("width"));
        }
        etVar.mo67316a(C10556gi.m32087b(num == null ? esVar.mo67314a() : num.intValue()));
        if (jSONObject2 != null) {
            num2 = Integer.valueOf(jSONObject2.getInt("height"));
        }
        etVar.mo67320b(C10556gi.m32087b(num2 == null ? esVar.mo67315b() : num2.intValue()));
        return etVar;
    }

    /* renamed from: c */
    private static C10496en m31761c(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_impression", false);
        String optString = jSONObject.optString("impression_source", "");
        C10498ep epVar = C10498ep.f26545a;
        C10765mq.m32770a((Object) optString, "impressionSourceString");
        return new C10496en(optBoolean, C10498ep.m31824a(optString));
    }
}
