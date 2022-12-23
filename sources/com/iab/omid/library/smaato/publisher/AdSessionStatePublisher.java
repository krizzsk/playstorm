package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdEvents;
import com.iab.omid.library.smaato.adsession.AdSessionConfiguration;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.adsession.media.MediaEvents;
import com.iab.omid.library.smaato.p275b.C8045d;
import com.iab.omid.library.smaato.p275b.C8046e;
import com.iab.omid.library.smaato.p277d.C8055a;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8059d;
import com.iab.omid.library.smaato.p278e.C8063b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8063b f19170a = new C8063b((WebView) null);

    /* renamed from: b */
    private AdEvents f19171b;

    /* renamed from: c */
    private MediaEvents f19172c;

    /* renamed from: d */
    private C8064a f19173d;

    /* renamed from: e */
    private long f19174e;

    /* renamed from: com.iab.omid.library.smaato.publisher.AdSessionStatePublisher$a */
    enum C8064a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo56063i();
    }

    /* renamed from: a */
    public void mo56040a() {
    }

    /* renamed from: a */
    public void mo56041a(float f) {
        C8046e.m23005a().mo56014a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56042a(WebView webView) {
        this.f19170a = new C8063b(webView);
    }

    /* renamed from: a */
    public void mo56043a(AdEvents adEvents) {
        this.f19171b = adEvents;
    }

    /* renamed from: a */
    public void mo56044a(AdSessionConfiguration adSessionConfiguration) {
        C8046e.m23005a().mo56021a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo56045a(ErrorType errorType, String str) {
        C8046e.m23005a().mo56015a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo56046a(C8039a aVar, AdSessionContext adSessionContext) {
        mo56047a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56047a(C8039a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C8056b.m23058a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C8056b.m23058a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C8056b.m23058a(jSONObject2, "deviceInfo", C8055a.m23051d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8056b.m23058a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C8056b.m23058a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C8056b.m23058a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C8056b.m23058a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C8056b.m23058a(jSONObject4, "libraryVersion", "1.3.15-Smaato");
        C8056b.m23058a(jSONObject4, "appId", C8045d.m23002a().mo56012b().getApplicationContext().getPackageName());
        C8056b.m23058a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C8056b.m23058a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C8056b.m23058a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C8056b.m23058a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C8046e.m23005a().mo56018a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo56048a(MediaEvents mediaEvents) {
        this.f19172c = mediaEvents;
    }

    /* renamed from: a */
    public void mo56049a(String str) {
        C8046e.m23005a().mo56017a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo56050a(String str, long j) {
        if (j >= this.f19174e) {
            this.f19173d = C8064a.AD_STATE_VISIBLE;
            C8046e.m23005a().mo56025b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo56051a(String str, JSONObject jSONObject) {
        C8046e.m23005a().mo56017a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo56052a(JSONObject jSONObject) {
        C8046e.m23005a().mo56026b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo56053a(boolean z) {
        if (mo56058e()) {
            C8046e.m23005a().mo56028c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo56054b() {
        this.f19170a.clear();
    }

    /* renamed from: b */
    public void mo56055b(String str, long j) {
        C8064a aVar;
        if (j >= this.f19174e && this.f19173d != (aVar = C8064a.AD_STATE_NOTVISIBLE)) {
            this.f19173d = aVar;
            C8046e.m23005a().mo56025b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo56056c() {
        return this.f19171b;
    }

    /* renamed from: d */
    public MediaEvents mo56057d() {
        return this.f19172c;
    }

    /* renamed from: e */
    public boolean mo56058e() {
        return this.f19170a.get() != null;
    }

    /* renamed from: f */
    public void mo56059f() {
        C8046e.m23005a().mo56013a(getWebView());
    }

    /* renamed from: g */
    public void mo56060g() {
        C8046e.m23005a().mo56024b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19170a.get();
    }

    /* renamed from: h */
    public void mo56062h() {
        C8046e.m23005a().mo56027c(getWebView());
    }

    /* renamed from: i */
    public void mo56063i() {
        this.f19174e = C8059d.m23070a();
        this.f19173d = C8064a.AD_STATE_IDLE;
    }
}
