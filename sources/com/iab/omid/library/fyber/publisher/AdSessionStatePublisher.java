package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.p245b.C7793d;
import com.iab.omid.library.fyber.p245b.C7794e;
import com.iab.omid.library.fyber.p247d.C7803a;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7807d;
import com.iab.omid.library.fyber.p248e.C7811b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7811b f18589a = new C7811b((WebView) null);

    /* renamed from: b */
    private AdEvents f18590b;

    /* renamed from: c */
    private MediaEvents f18591c;

    /* renamed from: d */
    private C7812a f18592d;

    /* renamed from: e */
    private long f18593e;

    /* renamed from: com.iab.omid.library.fyber.publisher.AdSessionStatePublisher$a */
    enum C7812a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55075i();
    }

    /* renamed from: a */
    public void mo55052a() {
    }

    /* renamed from: a */
    public void mo55053a(float f) {
        C7794e.m21873a().mo55026a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55054a(WebView webView) {
        this.f18589a = new C7811b(webView);
    }

    /* renamed from: a */
    public void mo55055a(AdEvents adEvents) {
        this.f18590b = adEvents;
    }

    /* renamed from: a */
    public void mo55056a(AdSessionConfiguration adSessionConfiguration) {
        C7794e.m21873a().mo55033a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55057a(ErrorType errorType, String str) {
        C7794e.m21873a().mo55027a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55058a(C7787a aVar, AdSessionContext adSessionContext) {
        mo55059a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55059a(C7787a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7804b.m21927a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7804b.m21927a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7804b.m21927a(jSONObject2, "deviceInfo", C7803a.m21919d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7804b.m21927a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7804b.m21927a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7804b.m21927a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7804b.m21927a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7804b.m21927a(jSONObject4, "libraryVersion", "1.3.30-Fyber");
        C7804b.m21927a(jSONObject4, "appId", C7793d.m21870a().mo55024b().getApplicationContext().getPackageName());
        C7804b.m21927a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7804b.m21927a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7804b.m21927a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7804b.m21927a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7794e.m21873a().mo55030a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55060a(MediaEvents mediaEvents) {
        this.f18591c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55061a(String str) {
        C7794e.m21873a().mo55029a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55062a(String str, long j) {
        if (j >= this.f18593e) {
            this.f18592d = C7812a.AD_STATE_VISIBLE;
            C7794e.m21873a().mo55037b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55063a(String str, JSONObject jSONObject) {
        C7794e.m21873a().mo55029a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55064a(JSONObject jSONObject) {
        C7794e.m21873a().mo55038b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55065a(boolean z) {
        if (mo55070e()) {
            C7794e.m21873a().mo55040c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55066b() {
        this.f18589a.clear();
    }

    /* renamed from: b */
    public void mo55067b(String str, long j) {
        if (j >= this.f18593e && this.f18592d != C7812a.AD_STATE_NOTVISIBLE) {
            this.f18592d = C7812a.AD_STATE_NOTVISIBLE;
            C7794e.m21873a().mo55037b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55068c() {
        return this.f18590b;
    }

    /* renamed from: d */
    public MediaEvents mo55069d() {
        return this.f18591c;
    }

    /* renamed from: e */
    public boolean mo55070e() {
        return this.f18589a.get() != null;
    }

    /* renamed from: f */
    public void mo55071f() {
        C7794e.m21873a().mo55025a(getWebView());
    }

    /* renamed from: g */
    public void mo55072g() {
        C7794e.m21873a().mo55036b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18589a.get();
    }

    /* renamed from: h */
    public void mo55074h() {
        C7794e.m21873a().mo55039c(getWebView());
    }

    /* renamed from: i */
    public void mo55075i() {
        this.f18593e = C7807d.m21940a();
        this.f18592d = C7812a.AD_STATE_IDLE;
    }
}
