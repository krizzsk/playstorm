package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3472c;
import com.bytedance.sdk.openadsdk.core.p151e.C3473d;
import com.bytedance.sdk.openadsdk.core.p151e.C3475f;
import com.bytedance.sdk.openadsdk.core.p151e.C3479h;
import com.bytedance.sdk.openadsdk.core.p151e.C3480i;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3497m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p156j.C3539a;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3546b;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.p158a.C3544d;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.b */
/* compiled from: AdInfoFactory */
public class C3423b {
    /* renamed from: a */
    private static int m10202a(C2521b bVar, boolean z) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.mo16360i())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(bVar.mo16358h())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    /* renamed from: a */
    private static int m10203a(C3472c cVar) {
        return cVar == null ? TTAdConstant.DOWNLOAD_APP_INFO_CODE : TextUtils.isEmpty(cVar.mo19491a()) ? 408 : 200;
    }

    /* renamed from: a */
    private static int m10204a(C3479h hVar) {
        if (hVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(hVar.mo19534a())) {
            return 403;
        }
        return TextUtils.isEmpty(hVar.mo19537b()) ? TTAdConstant.DEEPLINK_FALLBACK_CODE : (hVar.mo19539c() == 1 || hVar.mo19539c() == 2) ? 200 : 405;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r0 != 50) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m10205a(com.bytedance.sdk.openadsdk.core.p151e.C3498n r6) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = r6.mo19622Y()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = r6.mo19622Y()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L_0x001e
            goto L_0x00b2
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.e.h r1 = r6.mo19658ab()
            int r1 = m10204a((com.bytedance.sdk.openadsdk.core.p151e.C3479h) r1)
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x002b
            return r1
        L_0x002b:
            boolean r3 = r6.mo19681ay()
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r6.mo19682az()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004a
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            r2 = 0
            java.lang.String r3 = "banner_ad"
            java.lang.String r4 = "load_html_fail"
            com.bytedance.sdk.openadsdk.p130b.C3156e.m9195b((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r6, (java.lang.String) r3, (java.lang.String) r4, (org.json.JSONObject) r2)
            return r0
        L_0x004a:
            int r0 = r6.mo19609L()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0063
            if (r0 == r3) goto L_0x0058
            goto L_0x0078
        L_0x0058:
            com.bytedance.sdk.openadsdk.core.e.c r0 = r6.mo19657aa()
            int r1 = m10203a((com.bytedance.sdk.openadsdk.core.p151e.C3472c) r0)
            if (r1 == r2) goto L_0x0078
            return r1
        L_0x0063:
            boolean r0 = m10215b((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r6)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r6.mo19612O()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            r6 = 406(0x196, float:5.69E-43)
            return r6
        L_0x0078:
            boolean r0 = r6.mo19679aw()
            if (r0 != 0) goto L_0x00b1
            int r0 = r6.mo19660ad()
            if (r0 == r5) goto L_0x00a7
            if (r0 == r4) goto L_0x00a7
            if (r0 == r3) goto L_0x00a7
            r3 = 5
            if (r0 == r3) goto L_0x0098
            r3 = 15
            if (r0 == r3) goto L_0x0098
            r3 = 16
            if (r0 == r3) goto L_0x00a7
            r3 = 50
            if (r0 == r3) goto L_0x0098
            goto L_0x00b1
        L_0x0098:
            com.bykv.vk.openvk.component.video.api.c.b r0 = r6.mo19607J()
            boolean r6 = r6.mo19679aw()
            int r1 = m10202a((com.bykv.p068vk.openvk.component.video.api.p085c.C2521b) r0, (boolean) r6)
            if (r1 == r2) goto L_0x00b1
            return r1
        L_0x00a7:
            java.util.List r6 = r6.mo19613P()
            int r1 = m10206a((java.util.List<com.bytedance.sdk.openadsdk.core.p151e.C3484k>) r6)
            if (r1 == r2) goto L_0x00b1
        L_0x00b1:
            return r1
        L_0x00b2:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3423b.m10205a(com.bytedance.sdk.openadsdk.core.e.n):int");
    }

    /* renamed from: a */
    private static int m10206a(List<C3484k> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return 410;
        }
        for (C3484k next : list) {
            if (next == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(next.mo19559a())) {
                return 412;
            }
        }
        return 200;
    }

    /* renamed from: a */
    public static Pair<C3469a, ArrayList<Integer>> m10207a(JSONObject jSONObject, AdSlot adSlot, C3500o oVar) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C3469a aVar = new C3469a();
            aVar.mo19476a(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
            aVar.mo19473a(jSONObject.optInt("ret"));
            aVar.mo19478b(jSONObject.optString("message"));
            String optString = jSONObject.optString("auction_price");
            if (aVar.mo19472a() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C3498n b = m10214b(optJSONArray.optJSONObject(i), adSlot, oVar);
                    int a = m10205a(b);
                    if (a != 200) {
                        arrayList.add(Integer.valueOf(a));
                    } else {
                        b.mo19694c(optString);
                        aVar.mo19475a(b);
                    }
                }
            }
            return new Pair<>(aVar, arrayList);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C3498n m10208a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m10214b(jSONObject, (AdSlot) null, (C3500o) null);
    }

    /* renamed from: a */
    private static C3539a m10209a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c = C4020v.m13306c(C3578m.m11231a());
        int d = C4020v.m13310d(C3578m.m11231a());
        if (i == 2) {
            int i2 = d;
            d = c;
            c = i2;
        }
        return new C3544d(C3578m.m11231a(), c, d).mo19999b(str, (List<C3553c>) new ArrayList());
    }

    /* renamed from: a */
    private static void m10210a(C3498n nVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            C3156e.m9195b(C3578m.m11231a(), nVar, str, "load_vast_fail", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m10211a(C3498n nVar, String str, C3539a aVar, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "load_vast_fail";
            if (aVar != null) {
                if (!TextUtils.isEmpty(aVar.mo19995i()) && !TextUtils.isEmpty(aVar.mo19991f())) {
                    if (aVar.mo19994h() > 0.0d) {
                        jSONObject.put("duration", System.currentTimeMillis() - j);
                        str2 = "load_vast_success";
                    }
                }
                jSONObject.put("reason_code", -3);
            } else {
                jSONObject.put("reason_code", -2);
                jSONObject.put("error_code", C3546b.f8906e);
            }
            C3156e.m9195b(C3578m.m11231a(), nVar, str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m10212a(C3539a aVar, C3498n nVar) {
        aVar.mo19979a(nVar);
        int L = nVar.mo19609L();
        if (!(L == 2 || L == 3)) {
            nVar.mo19743r(2);
        }
        nVar.mo19698d(1);
        nVar.mo19696c(true);
        nVar.mo19642a(aVar);
        if (!TextUtils.isEmpty(aVar.mo19987d())) {
            nVar.mo19713h(aVar.mo19987d());
        }
        if (!TextUtils.isEmpty(aVar.mo19989e())) {
            nVar.mo19717i(aVar.mo19989e());
        }
        nVar.mo19707f(aVar.mo19991f());
        C3484k kVar = null;
        nVar.mo19633a((C3472c) null);
        C2521b J = nVar.mo19607J();
        if (J == null) {
            J = new C2521b();
        }
        J.mo16346c(aVar.mo19993g());
        J.mo16337a(aVar.mo19994h());
        J.mo16343b((String) null);
        J.mo16349d((String) null);
        nVar.mo19630a(J);
        if (aVar.mo19983b() != null) {
            kVar = new C3484k();
            kVar.mo19561a(aVar.mo19983b().mo20029e());
            kVar.mo19560a(aVar.mo19983b().mo20025b());
            kVar.mo19564b(aVar.mo19983b().mo20027c());
        }
        nVar.mo19638a(kVar);
    }

    /* renamed from: b */
    private static C3473d m10213b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        C3473d dVar = new C3473d();
        dVar.mo19505a(optInt);
        dVar.mo19507b(optInt2);
        return dVar;
    }

    /* renamed from: b */
    public static C3498n m10214b(JSONObject jSONObject, AdSlot adSlot, C3500o oVar) {
        C3539a aVar;
        if (jSONObject == null) {
            return null;
        }
        C3498n nVar = new C3498n();
        nVar.mo19743r(jSONObject.optInt("interaction_type"));
        nVar.mo19707f(jSONObject.optString("target_url"));
        nVar.mo19723k(jSONObject.optString("ad_id"));
        nVar.mo19726l(jSONObject.optString("app_log_url"));
        nVar.mo19703e(jSONObject.optString("source"));
        nVar.mo19751v(jSONObject.optInt("dislike_control", 0));
        nVar.mo19728m(jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES));
        nVar.mo19732n(jSONObject.optString("gecko_id"));
        if (jSONObject.has("set_click_type")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("set_click_type");
            nVar.mo19684b(optJSONObject.optDouble(SDKConstants.PARAM_GAME_REQUESTS_CTA, 2.0d));
            nVar.mo19625a(optJSONObject.optDouble("other", 1.0d));
        }
        nVar.mo19695c(jSONObject.optJSONObject(ShareConstants.MEDIA_EXTENSION));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(RewardPlus.ICON);
        nVar.mo19690b(jSONObject.optBoolean("screenshot", false));
        nVar.mo19722k(jSONObject.optInt("play_bar_style", 0));
        nVar.mo19734o(jSONObject.optString("market_url", ""));
        nVar.mo19716i(jSONObject.optInt("video_adaptation", 0));
        nVar.mo19706f(jSONObject.optInt("feed_video_opentype", 0));
        nVar.mo19645a(jSONObject.optJSONObject("session_params"));
        nVar.mo19694c(jSONObject.optString("auction_price", ""));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("render");
        if (optJSONObject3 != null) {
            nVar.mo19709g(optJSONObject3.optInt("render_sequence", 0));
            nVar.mo19712h(optJSONObject3.optInt("backup_render_control", 1));
        }
        nVar.mo19698d(jSONObject.optInt("render_control", oVar != null ? oVar.f8660f : 1));
        if (optJSONObject2 != null) {
            C3484k kVar = new C3484k();
            kVar.mo19561a(optJSONObject2.optString("url"));
            kVar.mo19564b(optJSONObject2.optInt("height"));
            kVar.mo19560a(optJSONObject2.optInt("width"));
            nVar.mo19638a(kVar);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("reward_data");
        if (optJSONObject4 != null) {
            nVar.mo19692c(optJSONObject4.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            nVar.mo19643a(optJSONObject4.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("cover_image");
        if (optJSONObject5 != null) {
            C3484k kVar2 = new C3484k();
            kVar2.mo19561a(optJSONObject5.optString("url"));
            kVar2.mo19564b(optJSONObject5.optInt("height"));
            kVar2.mo19560a(optJSONObject5.optInt("width"));
            nVar.mo19687b(kVar2);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("image");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C3484k kVar3 = new C3484k();
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i);
                kVar3.mo19561a(optJSONObject6.optString("url"));
                kVar3.mo19564b(optJSONObject6.optInt("height"));
                kVar3.mo19560a(optJSONObject6.optInt("width"));
                kVar3.mo19562a(optJSONObject6.optBoolean("image_preview"));
                kVar3.mo19565b(optJSONObject6.optString("image_key"));
                nVar.mo19693c(kVar3);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("show_url");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                nVar.mo19615R().add(optJSONArray2.optString(i2));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("click_url");
        if (optJSONArray3 != null) {
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                nVar.mo19616S().add(optJSONArray3.optString(i3));
            }
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("play_start");
        if (optJSONArray4 != null) {
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                nVar.mo19617T().add(optJSONArray4.optString(i4));
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("click_area");
        if (optJSONObject7 != null) {
            C3475f fVar = new C3475f();
            fVar.f8431a = optJSONObject7.optBoolean("click_upper_content_area", true);
            fVar.f8432b = optJSONObject7.optBoolean("click_upper_non_content_area", true);
            fVar.f8433c = optJSONObject7.optBoolean("click_lower_content_area", true);
            fVar.f8434d = optJSONObject7.optBoolean("click_lower_non_content_area", true);
            fVar.f8435e = optJSONObject7.optBoolean("click_button_area", true);
            fVar.f8436f = optJSONObject7.optBoolean("click_video_area", true);
            nVar.mo19635a(fVar);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("adslot");
        if (optJSONObject8 != null) {
            adSlot = m10216c(optJSONObject8);
        }
        nVar.mo19631a(adSlot);
        nVar.mo19725l(jSONObject.optInt("intercept_flag", 0));
        nVar.mo19710g(jSONObject.optString("phone_num"));
        nVar.mo19713h(jSONObject.optString("title"));
        nVar.mo19717i(jSONObject.optString("description"));
        nVar.mo19720j(jSONObject.optString("button_text"));
        nVar.mo19719j(jSONObject.optInt("ad_logo", 1));
        nVar.mo19729m(jSONObject.optString("ext"));
        nVar.mo19737p(jSONObject.optInt("cover_click_area", 0));
        nVar.mo19745s(jSONObject.optInt("image_mode"));
        nVar.mo19749u(jSONObject.optInt("orientation", 1));
        nVar.mo19626a((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        nVar.mo19737p(jSONObject.optInt("cover_click_area", 0));
        JSONObject optJSONObject9 = jSONObject.optJSONObject(TapjoyConstants.TJC_APP_PLACEMENT);
        JSONObject optJSONObject10 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        nVar.mo19633a(m10218e(optJSONObject9));
        nVar.mo19639a(m10219f(jSONObject.optJSONObject("interaction_method_params")));
        nVar.mo19636a(m10221h(optJSONObject10));
        nVar.mo19641a(new C3501p(jSONObject));
        JSONArray optJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (optJSONArray5 != null) {
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                FilterWord d = m10217d(optJSONArray5.optJSONObject(i5));
                if (d != null && d.isValid()) {
                    nVar.mo19632a(d);
                }
            }
        }
        nVar.mo19747t(jSONObject.optInt("count_down"));
        nVar.mo19629a(jSONObject.optLong("expiration_time"));
        nVar.mo19598B(jSONObject.optInt("video_encode_type", 0));
        nVar.mo19596A(jSONObject.optInt("player_type", 0));
        JSONObject optJSONObject11 = jSONObject.optJSONObject("video");
        if (optJSONObject11 != null) {
            nVar.mo19630a(m10222i(optJSONObject11));
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("h265_video");
        if (optJSONObject12 != null) {
            nVar.mo19686b(m10222i(optJSONObject12));
        }
        JSONObject optJSONObject13 = jSONObject.optJSONObject("download_conf");
        if (optJSONObject13 != null) {
            nVar.mo19637a(m10220g(optJSONObject13));
        }
        nVar.mo19644a(m10223j(jSONObject.optJSONObject("media_ext")));
        JSONObject optJSONObject14 = jSONObject.optJSONObject("tpl_info");
        if (optJSONObject14 != null) {
            C3498n.C3499a aVar2 = new C3498n.C3499a();
            aVar2.mo19763b(optJSONObject14.optString("id"));
            aVar2.mo19765c(optJSONObject14.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5));
            aVar2.mo19767d(optJSONObject14.optString("url"));
            aVar2.mo19769e(optJSONObject14.optString("data"));
            aVar2.mo19771f(optJSONObject14.optString("diff_data"));
            aVar2.mo19773g(optJSONObject14.optString("dynamic_creative"));
            aVar2.mo19761a(optJSONObject14.optString("version"));
            nVar.mo19640a(aVar2);
        }
        nVar.mo19699d(jSONObject.optString("creative_extra"));
        nVar.mo19702e(jSONObject.optInt("if_block_lp", 0));
        nVar.mo19731n(jSONObject.optInt("cache_sort", 1));
        nVar.mo19733o(jSONObject.optInt("if_sp_cache", 0));
        JSONObject optJSONObject15 = jSONObject.optJSONObject("splash_control");
        if (optJSONObject15 != null) {
            nVar.mo19634a(m10213b(optJSONObject15));
        }
        nVar.mo19753w(jSONObject.optInt("is_package_open", 1));
        nVar.mo19688b(jSONObject.optString("ad_info", (String) null));
        nVar.mo19740q(jSONObject.optInt("ua_policy", 2));
        nVar.mo19755x(jSONObject.optInt("playable_duration_time", 20));
        nVar.mo19757y(jSONObject.optInt("playable_endcard_close_time", -1));
        nVar.mo19759z(jSONObject.optInt("endcard_close_time", -1));
        nVar.mo19627a(jSONObject.optInt("interaction_method"));
        nVar.mo19700d(jSONObject.optBoolean("is_html"));
        nVar.mo19738p(jSONObject.optString("dsp_html"));
        if (jSONObject.optBoolean("is_vast", false)) {
            if (jSONObject.has("vast_json")) {
                aVar = C3539a.m11052a(jSONObject.optJSONObject("vast_json"));
            } else {
                String b = C4014u.m13198b(C4014u.m13219e(nVar));
                String optString = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(optString)) {
                    m10210a(nVar, b);
                    return null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                aVar = m10209a(optString, nVar.mo19669am());
                m10211a(nVar, b, aVar, currentTimeMillis);
                if (aVar != null) {
                    aVar.mo19992f(b);
                }
            }
            if (aVar == null) {
                return null;
            }
            m10212a(aVar, nVar);
        }
        return nVar;
    }

    /* renamed from: b */
    private static boolean m10215b(C3498n nVar) {
        return !nVar.mo19679aw() && !nVar.mo19681ay();
    }

    /* renamed from: c */
    private static AdSlot m10216c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("mCodeId", "");
        int optInt = jSONObject2.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject2.optInt("mImgAcceptedHeight", 0);
        int optInt3 = jSONObject2.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject2.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject2.optString("mRewardName", "");
        int optInt4 = jSONObject2.optInt("mRewardAmount", 0);
        String optString3 = jSONObject2.optString("mMediaExtra", "");
        String optString4 = jSONObject2.optString("mUserID", "");
        jSONObject2.optInt("mOrientation", 2);
        int optInt5 = jSONObject2.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject2.optBoolean("mIsExpressAd", false);
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize((float) jSONObject2.optDouble("mExpressViewAcceptedWidth", 0.0d), (float) jSONObject2.optDouble("mExpressViewAcceptedHeight", 0.0d)).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(jSONObject2.optBoolean("mIsAutoPlay", false)).isExpressAd(optBoolean2).withBid(jSONObject2.optString("mBidAdm", "")).build();
    }

    /* renamed from: d */
    private static FilterWord m10217d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord d = m10217d(optJSONArray.optJSONObject(i));
                    if (d != null && d.isValid()) {
                        filterWord.addOption(d);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static C3472c m10218e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3472c cVar = new C3472c();
        cVar.mo19497b(jSONObject.optString(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING));
        cVar.mo19499c(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        cVar.mo19494a(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        cVar.mo19492a(jSONObject.optDouble("score", -1.0d));
        cVar.mo19493a(jSONObject.optInt("comment_num", -1));
        cVar.mo19496b(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        return cVar;
    }

    /* renamed from: f */
    private static C3497m m10219f(JSONObject jSONObject) {
        C3497m mVar = new C3497m();
        if (jSONObject == null) {
            mVar.mo19590a(10);
            mVar.mo19593b(20);
            mVar.mo19591a("");
            return mVar;
        }
        mVar.mo19590a(jSONObject.optLong("onlylp_loading_maxtime", 10));
        mVar.mo19593b(jSONObject.optLong("straight_lp_showtime", 20));
        mVar.mo19591a(jSONObject.optString("loading_text", ""));
        return mVar;
    }

    /* renamed from: g */
    private static C3480i m10220g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3480i iVar = new C3480i();
        iVar.mo19541a(jSONObject.optInt("if_send_click", 0));
        return iVar;
    }

    /* renamed from: h */
    private static C3479h m10221h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3479h hVar = new C3479h();
        hVar.mo19536a(jSONObject.optString("deeplink_url"));
        hVar.mo19538b(jSONObject.optString("fallback_url"));
        hVar.mo19535a(jSONObject.optInt("fallback_type"));
        return hVar;
    }

    /* renamed from: i */
    private static C2521b m10222i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2521b bVar = new C2521b();
        bVar.mo16342b(jSONObject.optInt("cover_height"));
        bVar.mo16345c(jSONObject.optInt("cover_width"));
        bVar.mo16340a(jSONObject.optString("resolution"));
        bVar.mo16339a(jSONObject.optLong("size"));
        bVar.mo16337a(jSONObject.optDouble("video_duration", 0.0d));
        bVar.mo16343b(jSONObject.optString("cover_url"));
        bVar.mo16346c(jSONObject.optString("video_url"));
        bVar.mo16349d(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        bVar.mo16352e(jSONObject.optString("playable_download_url"));
        bVar.mo16355f(jSONObject.optString("file_hash"));
        int i = 0;
        bVar.mo16359h(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.mo16361i(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.mo16338a(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.mo16351e(jSONObject.optInt("video_preload_size", 307200));
        bVar.mo16354f(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.mo16357g(jSONObject.optInt("execute_cached_type", 0));
        if (jSONObject.optDouble("endcard_render", 0.0d) == 1.0d) {
            i = 1;
        }
        bVar.mo16348d(i);
        return bVar;
    }

    /* renamed from: j */
    private static Map<String, Object> m10223j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b$a */
    /* compiled from: AdInfoFactory */
    static class C3424a {
        C3424a() {
        }

        /* renamed from: a */
        public static C3424a m10224a() {
            return new C3424a();
        }

        /* renamed from: a */
        public C3424a mo19381a(boolean z) {
            if (z) {
                m10225a(300);
            }
            return this;
        }

        /* renamed from: b */
        public C3424a mo19382b(boolean z) {
            if (z) {
                m10225a((int) ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR);
            }
            return this;
        }

        /* renamed from: c */
        public C3424a mo19383c(boolean z) {
            if (z) {
                m10225a(302);
            }
            return this;
        }

        /* renamed from: d */
        public C3424a mo19384d(boolean z) {
            if (z) {
                m10225a((int) ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
            }
            return this;
        }

        /* renamed from: e */
        public C3424a mo19385e(boolean z) {
            if (z) {
                m10225a((int) ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR);
            }
            return this;
        }

        /* renamed from: f */
        public C3424a mo19386f(boolean z) {
            if (z) {
                m10225a((int) IronSourceConstants.OFFERWALL_OPENED);
            }
            return this;
        }

        /* renamed from: a */
        private void m10225a(final int i) {
            C3578m.m11242i().mo20676a(new C3812a() {
                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    return C3814b.m12522b().mo20634a("creative_error").mo20635b(i).mo20636b(C3513g.m10826b(i));
                }
            });
        }

        /* renamed from: a */
        public static void m10226a(C3469a aVar) {
            if (aVar != null && aVar.mo19477b() != null && !aVar.mo19477b().isEmpty()) {
                for (C3498n next : aVar.mo19477b()) {
                    boolean z = false;
                    C3424a d = m10224a().mo19381a(TextUtils.isEmpty(next.mo19618U())).mo19382b(TextUtils.isEmpty(next.mo19619V())).mo19383c(TextUtils.isEmpty(next.mo19621X())).mo19386f(next.mo19610M() == null || TextUtils.isEmpty(next.mo19610M().mo19559a())).mo19384d(next.mo19657aa() == null || next.mo19657aa().mo19500d() == -1.0d || m10227a(next));
                    if (next.mo19657aa() == null || next.mo19657aa().mo19501e() == -1 || m10228b(next)) {
                        z = true;
                    }
                    d.mo19385e(z);
                }
            }
        }

        /* renamed from: a */
        public static boolean m10227a(C3498n nVar) {
            try {
                double optDouble = new JSONObject(nVar.mo19604G().mo19772g()).optDouble("score_exact_i18n", -1.0d);
                return optDouble < 0.0d || optDouble > 5.0d;
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public static boolean m10228b(C3498n nVar) {
            try {
                return new JSONObject(nVar.mo19604G().mo19772g()).optInt("comment_num_i18n", -1) < 0;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
