package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.p281b.C8095d;
import com.iab.omid.library.vungle.p281b.C8096e;
import com.iab.omid.library.vungle.p283d.C8105a;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8109d;
import com.iab.omid.library.vungle.p284e.C8113b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8113b f19283a = new C8113b((WebView) null);

    /* renamed from: b */
    private AdEvents f19284b;

    /* renamed from: c */
    private MediaEvents f19285c;

    /* renamed from: d */
    private C8114a f19286d;

    /* renamed from: e */
    private long f19287e;

    /* renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    enum C8114a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo56257i();
    }

    /* renamed from: a */
    public void mo56234a() {
    }

    /* renamed from: a */
    public void mo56235a(float f) {
        C8096e.m23229a().mo56208a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56236a(WebView webView) {
        this.f19283a = new C8113b(webView);
    }

    /* renamed from: a */
    public void mo56237a(AdEvents adEvents) {
        this.f19284b = adEvents;
    }

    /* renamed from: a */
    public void mo56238a(AdSessionConfiguration adSessionConfiguration) {
        C8096e.m23229a().mo56215a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo56239a(ErrorType errorType, String str) {
        C8096e.m23229a().mo56209a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo56240a(C8089a aVar, AdSessionContext adSessionContext) {
        mo56241a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56241a(C8089a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C8106b.m23282a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C8106b.m23282a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C8106b.m23282a(jSONObject2, "deviceInfo", C8105a.m23275d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8106b.m23282a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C8106b.m23282a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C8106b.m23282a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C8106b.m23282a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C8106b.m23282a(jSONObject4, "libraryVersion", "1.3.21-Vungle");
        C8106b.m23282a(jSONObject4, "appId", C8095d.m23226a().mo56206b().getApplicationContext().getPackageName());
        C8106b.m23282a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C8106b.m23282a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C8106b.m23282a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C8106b.m23282a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C8096e.m23229a().mo56212a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo56242a(MediaEvents mediaEvents) {
        this.f19285c = mediaEvents;
    }

    /* renamed from: a */
    public void mo56243a(String str) {
        C8096e.m23229a().mo56211a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo56244a(String str, long j) {
        if (j >= this.f19287e) {
            this.f19286d = C8114a.AD_STATE_VISIBLE;
            C8096e.m23229a().mo56219b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo56245a(String str, JSONObject jSONObject) {
        C8096e.m23229a().mo56211a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo56246a(JSONObject jSONObject) {
        C8096e.m23229a().mo56220b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo56247a(boolean z) {
        if (mo56252e()) {
            C8096e.m23229a().mo56222c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo56248b() {
        this.f19283a.clear();
    }

    /* renamed from: b */
    public void mo56249b(String str, long j) {
        if (j >= this.f19287e && this.f19286d != C8114a.AD_STATE_NOTVISIBLE) {
            this.f19286d = C8114a.AD_STATE_NOTVISIBLE;
            C8096e.m23229a().mo56219b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo56250c() {
        return this.f19284b;
    }

    /* renamed from: d */
    public MediaEvents mo56251d() {
        return this.f19285c;
    }

    /* renamed from: e */
    public boolean mo56252e() {
        return this.f19283a.get() != null;
    }

    /* renamed from: f */
    public void mo56253f() {
        C8096e.m23229a().mo56207a(getWebView());
    }

    /* renamed from: g */
    public void mo56254g() {
        C8096e.m23229a().mo56218b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19283a.get();
    }

    /* renamed from: h */
    public void mo56256h() {
        C8096e.m23229a().mo56221c(getWebView());
    }

    /* renamed from: i */
    public void mo56257i() {
        this.f19287e = C8109d.m23294a();
        this.f19286d = C8114a.AD_STATE_IDLE;
    }
}
