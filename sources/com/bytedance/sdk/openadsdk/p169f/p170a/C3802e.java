package com.bytedance.sdk.openadsdk.p169f.p170a;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p090a.C2561e;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.openadsdk.core.C3728w;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.e */
/* compiled from: OldBridgeSyncMethod */
public class C3802e extends C2561e<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f9874a;

    /* renamed from: b */
    private C3728w f9875b;

    public C3802e(String str, C3728w wVar) {
        this.f9875b = wVar;
        this.f9874a = str;
    }

    /* renamed from: a */
    public static void m12493a(C2582r rVar, C3728w wVar) {
        rVar.mo16603a("appInfo", (C2561e<?, ?>) new C3802e("appInfo", wVar));
        rVar.mo16603a("adInfo", (C2561e<?, ?>) new C3802e("adInfo", wVar));
        rVar.mo16603a("sendLog", (C2561e<?, ?>) new C3802e("sendLog", wVar));
        rVar.mo16603a("playable_style", (C2561e<?, ?>) new C3802e("playable_style", wVar));
        rVar.mo16603a("getTemplateInfo", (C2561e<?, ?>) new C3802e("getTemplateInfo", wVar));
        rVar.mo16603a("getTeMaiAds", (C2561e<?, ?>) new C3802e("getTeMaiAds", wVar));
        rVar.mo16603a("isViewable", (C2561e<?, ?>) new C3802e("isViewable", wVar));
        rVar.mo16603a("getScreenSize", (C2561e<?, ?>) new C3802e("getScreenSize", wVar));
        rVar.mo16603a("getCloseButtonInfo", (C2561e<?, ?>) new C3802e("getCloseButtonInfo", wVar));
        rVar.mo16603a("getVolume", (C2561e<?, ?>) new C3802e("getVolume", wVar));
        rVar.mo16603a("removeLoading", (C2561e<?, ?>) new C3802e("removeLoading", wVar));
        rVar.mo16603a("sendReward", (C2561e<?, ?>) new C3802e("sendReward", wVar));
        rVar.mo16603a("subscribe_app_ad", (C2561e<?, ?>) new C3802e("subscribe_app_ad", wVar));
        rVar.mo16603a("download_app_ad", (C2561e<?, ?>) new C3802e("download_app_ad", wVar));
        rVar.mo16603a("cancel_download_app_ad", (C2561e<?, ?>) new C3802e("cancel_download_app_ad", wVar));
        rVar.mo16603a("unsubscribe_app_ad", (C2561e<?, ?>) new C3802e("unsubscribe_app_ad", wVar));
        rVar.mo16603a("landscape_click", (C2561e<?, ?>) new C3802e("landscape_click", wVar));
        rVar.mo16603a("clickEvent", (C2561e<?, ?>) new C3802e("clickEvent", wVar));
        rVar.mo16603a("renderDidFinish", (C2561e<?, ?>) new C3802e("renderDidFinish", wVar));
        rVar.mo16603a("dynamicTrack", (C2561e<?, ?>) new C3802e("dynamicTrack", wVar));
        rVar.mo16603a("skipVideo", (C2561e<?, ?>) new C3802e("skipVideo", wVar));
        rVar.mo16603a("muteVideo", (C2561e<?, ?>) new C3802e("muteVideo", wVar));
        rVar.mo16603a("changeVideoState", (C2561e<?, ?>) new C3802e("changeVideoState", wVar));
        rVar.mo16603a("getCurrentVideoState", (C2561e<?, ?>) new C3802e("getCurrentVideoState", wVar));
        rVar.mo16603a("send_temai_product_ids", (C2561e<?, ?>) new C3802e("send_temai_product_ids", wVar));
        rVar.mo16603a("getMaterialMeta", (C2561e<?, ?>) new C3802e("getMaterialMeta", wVar));
        rVar.mo16603a("endcard_load", (C2561e<?, ?>) new C3802e("endcard_load", wVar));
        rVar.mo16603a("pauseWebView", (C2561e<?, ?>) new C3802e("pauseWebView", wVar));
        rVar.mo16603a("pauseWebViewTimers", (C2561e<?, ?>) new C3802e("pauseWebViewTimers", wVar));
        rVar.mo16603a("webview_time_track", (C2561e<?, ?>) new C3802e("webview_time_track", wVar));
        rVar.mo16603a("openPrivacy", (C2561e<?, ?>) new C3802e("openPrivacy", wVar));
        rVar.mo16603a("openAdLandPageLinks", (C2561e<?, ?>) new C3802e("openAdLandPageLinks", wVar));
        rVar.mo16603a("getNativeSiteCustomData", (C2561e<?, ?>) new C3802e("getNativeSiteCustomData", wVar));
        rVar.mo16603a("close", (C2561e<?, ?>) new C3802e("close", wVar));
    }

    /* renamed from: a */
    public JSONObject mo16564a(JSONObject jSONObject, C2562f fVar) throws Exception {
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                C3728w.C3738a aVar = new C3728w.C3738a();
                                aVar.f9636a = NotificationCompat.CATEGORY_CALL;
                                aVar.f9638c = this.f9874a;
                                aVar.f9639d = jSONObject;
                                return this.f9875b.mo20438a(aVar, 3);
                        }
                    case '`':
                        switch (c2) {
                            case '7':
                            case '8':
                            case '9':
                                continue;
                        }
                }
                c = '_';
                c2 = '_';
            }
        }
    }
}
