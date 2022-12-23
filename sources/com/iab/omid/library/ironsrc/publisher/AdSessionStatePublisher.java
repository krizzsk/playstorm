package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.p257b.C7894d;
import com.iab.omid.library.ironsrc.p257b.C7895e;
import com.iab.omid.library.ironsrc.p259d.C7904a;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7908d;
import com.iab.omid.library.ironsrc.p260e.C7912b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7912b f18819a = new C7912b((WebView) null);

    /* renamed from: b */
    private AdEvents f18820b;

    /* renamed from: c */
    private MediaEvents f18821c;

    /* renamed from: d */
    private C7913a f18822d;

    /* renamed from: e */
    private long f18823e;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum C7913a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55456i();
    }

    /* renamed from: a */
    public void mo55433a() {
    }

    /* renamed from: a */
    public void mo55434a(float f) {
        C7895e.m22323a().mo55407a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55435a(WebView webView) {
        this.f18819a = new C7912b(webView);
    }

    /* renamed from: a */
    public void mo55436a(AdEvents adEvents) {
        this.f18820b = adEvents;
    }

    /* renamed from: a */
    public void mo55437a(AdSessionConfiguration adSessionConfiguration) {
        C7895e.m22323a().mo55414a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55438a(ErrorType errorType, String str) {
        C7895e.m22323a().mo55408a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55439a(C7888a aVar, AdSessionContext adSessionContext) {
        mo55440a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55440a(C7888a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7905b.m22375a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7905b.m22375a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7905b.m22375a(jSONObject2, "deviceInfo", C7904a.m22368d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7905b.m22375a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7905b.m22375a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7905b.m22375a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7905b.m22375a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7905b.m22375a(jSONObject4, "libraryVersion", "1.3.12-Ironsrc");
        C7905b.m22375a(jSONObject4, "appId", C7894d.m22320a().mo55405b().getApplicationContext().getPackageName());
        C7905b.m22375a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7905b.m22375a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7905b.m22375a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7905b.m22375a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7895e.m22323a().mo55411a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55441a(MediaEvents mediaEvents) {
        this.f18821c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55442a(String str) {
        C7895e.m22323a().mo55410a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55443a(String str, long j) {
        if (j >= this.f18823e) {
            this.f18822d = C7913a.AD_STATE_VISIBLE;
            C7895e.m22323a().mo55418b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55444a(String str, JSONObject jSONObject) {
        C7895e.m22323a().mo55410a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55445a(JSONObject jSONObject) {
        C7895e.m22323a().mo55419b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55446a(boolean z) {
        if (mo55451e()) {
            C7895e.m22323a().mo55421c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55447b() {
        this.f18819a.clear();
    }

    /* renamed from: b */
    public void mo55448b(String str, long j) {
        if (j >= this.f18823e && this.f18822d != C7913a.AD_STATE_NOTVISIBLE) {
            this.f18822d = C7913a.AD_STATE_NOTVISIBLE;
            C7895e.m22323a().mo55418b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55449c() {
        return this.f18820b;
    }

    /* renamed from: d */
    public MediaEvents mo55450d() {
        return this.f18821c;
    }

    /* renamed from: e */
    public boolean mo55451e() {
        return this.f18819a.get() != null;
    }

    /* renamed from: f */
    public void mo55452f() {
        C7895e.m22323a().mo55406a(getWebView());
    }

    /* renamed from: g */
    public void mo55453g() {
        C7895e.m22323a().mo55417b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18819a.get();
    }

    /* renamed from: h */
    public void mo55455h() {
        C7895e.m22323a().mo55420c(getWebView());
    }

    /* renamed from: i */
    public void mo55456i() {
        this.f18823e = C7908d.m22387a();
        this.f18822d = C7913a.AD_STATE_IDLE;
    }
}
