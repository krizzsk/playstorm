package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.p221b.C7592d;
import com.iab.omid.library.adcolony.p221b.C7593e;
import com.iab.omid.library.adcolony.p223d.C7602a;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7606d;
import com.iab.omid.library.adcolony.p224e.C7610b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7610b f18125a = new C7610b((WebView) null);

    /* renamed from: b */
    private AdEvents f18126b;

    /* renamed from: c */
    private MediaEvents f18127c;

    /* renamed from: d */
    private C7611a f18128d;

    /* renamed from: e */
    private long f18129e;

    /* renamed from: com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher$a */
    enum C7611a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54284i();
    }

    /* renamed from: a */
    public void mo54261a() {
    }

    /* renamed from: a */
    public void mo54262a(float f) {
        C7593e.m20959a().mo54235a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54263a(WebView webView) {
        this.f18125a = new C7610b(webView);
    }

    /* renamed from: a */
    public void mo54264a(AdEvents adEvents) {
        this.f18126b = adEvents;
    }

    /* renamed from: a */
    public void mo54265a(AdSessionConfiguration adSessionConfiguration) {
        C7593e.m20959a().mo54242a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54266a(ErrorType errorType, String str) {
        C7593e.m20959a().mo54236a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54267a(C7586a aVar, AdSessionContext adSessionContext) {
        mo54268a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54268a(C7586a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7603b.m21013a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7603b.m21013a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7603b.m21013a(jSONObject2, "deviceInfo", C7602a.m21005d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7603b.m21013a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7603b.m21013a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7603b.m21013a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7603b.m21013a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7603b.m21013a(jSONObject4, "libraryVersion", "1.3.30-Adcolony");
        C7603b.m21013a(jSONObject4, "appId", C7592d.m20956a().mo54233b().getApplicationContext().getPackageName());
        C7603b.m21013a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7603b.m21013a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7603b.m21013a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7603b.m21013a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7593e.m20959a().mo54239a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54269a(MediaEvents mediaEvents) {
        this.f18127c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54270a(String str) {
        C7593e.m20959a().mo54238a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54271a(String str, long j) {
        if (j >= this.f18129e) {
            this.f18128d = C7611a.AD_STATE_VISIBLE;
            C7593e.m20959a().mo54246b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54272a(String str, JSONObject jSONObject) {
        C7593e.m20959a().mo54238a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54273a(JSONObject jSONObject) {
        C7593e.m20959a().mo54247b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54274a(boolean z) {
        if (mo54279e()) {
            C7593e.m20959a().mo54249c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54275b() {
        this.f18125a.clear();
    }

    /* renamed from: b */
    public void mo54276b(String str, long j) {
        C7611a aVar;
        if (j >= this.f18129e && this.f18128d != (aVar = C7611a.AD_STATE_NOTVISIBLE)) {
            this.f18128d = aVar;
            C7593e.m20959a().mo54246b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54277c() {
        return this.f18126b;
    }

    /* renamed from: d */
    public MediaEvents mo54278d() {
        return this.f18127c;
    }

    /* renamed from: e */
    public boolean mo54279e() {
        return this.f18125a.get() != null;
    }

    /* renamed from: f */
    public void mo54280f() {
        C7593e.m20959a().mo54234a(getWebView());
    }

    /* renamed from: g */
    public void mo54281g() {
        C7593e.m20959a().mo54245b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18125a.get();
    }

    /* renamed from: h */
    public void mo54283h() {
        C7593e.m20959a().mo54248c(getWebView());
    }

    /* renamed from: i */
    public void mo54284i() {
        this.f18129e = C7606d.m21026a();
        this.f18128d = C7611a.AD_STATE_IDLE;
    }
}
