package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.p233b.C7692d;
import com.iab.omid.library.applovin.p233b.C7693e;
import com.iab.omid.library.applovin.p235d.C7702a;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7706d;
import com.iab.omid.library.applovin.p236e.C7710b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7710b f18359a = new C7710b((WebView) null);

    /* renamed from: b */
    private AdEvents f18360b;

    /* renamed from: c */
    private MediaEvents f18361c;

    /* renamed from: d */
    private C7711a f18362d;

    /* renamed from: e */
    private long f18363e;

    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    enum C7711a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54682i();
    }

    /* renamed from: a */
    public void mo54659a() {
    }

    /* renamed from: a */
    public void mo54660a(float f) {
        C7693e.m21419a().mo54633a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54661a(WebView webView) {
        this.f18359a = new C7710b(webView);
    }

    /* renamed from: a */
    public void mo54662a(AdEvents adEvents) {
        this.f18360b = adEvents;
    }

    /* renamed from: a */
    public void mo54663a(AdSessionConfiguration adSessionConfiguration) {
        C7693e.m21419a().mo54640a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54664a(ErrorType errorType, String str) {
        C7693e.m21419a().mo54634a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54665a(C7686a aVar, AdSessionContext adSessionContext) {
        mo54666a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54666a(C7686a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7703b.m21473a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7703b.m21473a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7703b.m21473a(jSONObject2, "deviceInfo", C7702a.m21465d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7703b.m21473a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7703b.m21473a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7703b.m21473a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7703b.m21473a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7703b.m21473a(jSONObject4, "libraryVersion", "1.3.30-Applovin");
        C7703b.m21473a(jSONObject4, "appId", C7692d.m21416a().mo54631b().getApplicationContext().getPackageName());
        C7703b.m21473a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7703b.m21473a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7703b.m21473a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7703b.m21473a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7693e.m21419a().mo54637a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54667a(MediaEvents mediaEvents) {
        this.f18361c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54668a(String str) {
        C7693e.m21419a().mo54636a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54669a(String str, long j) {
        if (j >= this.f18363e) {
            this.f18362d = C7711a.AD_STATE_VISIBLE;
            C7693e.m21419a().mo54644b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54670a(String str, JSONObject jSONObject) {
        C7693e.m21419a().mo54636a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54671a(JSONObject jSONObject) {
        C7693e.m21419a().mo54645b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54672a(boolean z) {
        if (mo54677e()) {
            C7693e.m21419a().mo54647c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54673b() {
        this.f18359a.clear();
    }

    /* renamed from: b */
    public void mo54674b(String str, long j) {
        if (j >= this.f18363e && this.f18362d != C7711a.AD_STATE_NOTVISIBLE) {
            this.f18362d = C7711a.AD_STATE_NOTVISIBLE;
            C7693e.m21419a().mo54644b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54675c() {
        return this.f18360b;
    }

    /* renamed from: d */
    public MediaEvents mo54676d() {
        return this.f18361c;
    }

    /* renamed from: e */
    public boolean mo54677e() {
        return this.f18359a.get() != null;
    }

    /* renamed from: f */
    public void mo54678f() {
        C7693e.m21419a().mo54632a(getWebView());
    }

    /* renamed from: g */
    public void mo54679g() {
        C7693e.m21419a().mo54643b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18359a.get();
    }

    /* renamed from: h */
    public void mo54681h() {
        C7693e.m21419a().mo54646c(getWebView());
    }

    /* renamed from: i */
    public void mo54682i() {
        this.f18363e = C7706d.m21486a();
        this.f18362d = C7711a.AD_STATE_IDLE;
    }
}
