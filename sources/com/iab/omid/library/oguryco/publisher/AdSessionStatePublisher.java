package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdEvents;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.adsession.ErrorType;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.adsession.media.MediaEvents;
import com.iab.omid.library.oguryco.p269b.C7995d;
import com.iab.omid.library.oguryco.p269b.C7996e;
import com.iab.omid.library.oguryco.p271d.C8005a;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8009d;
import com.iab.omid.library.oguryco.p272e.C8013b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C8013b f19057a = new C8013b((WebView) null);

    /* renamed from: b */
    private AdEvents f19058b;

    /* renamed from: c */
    private MediaEvents f19059c;

    /* renamed from: d */
    private C8014a f19060d;

    /* renamed from: e */
    private long f19061e;

    /* renamed from: com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher$a */
    enum C8014a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55869i();
    }

    /* renamed from: a */
    public void mo55846a() {
    }

    /* renamed from: a */
    public void mo55847a(float f) {
        C7996e.m22781a().mo55820a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55848a(WebView webView) {
        this.f19057a = new C8013b(webView);
    }

    /* renamed from: a */
    public void mo55849a(AdEvents adEvents) {
        this.f19058b = adEvents;
    }

    /* renamed from: a */
    public void mo55850a(AdSessionConfiguration adSessionConfiguration) {
        C7996e.m22781a().mo55827a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55851a(ErrorType errorType, String str) {
        C7996e.m22781a().mo55821a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55852a(C7988a aVar, AdSessionContext adSessionContext) {
        mo55853a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55853a(C7988a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C8006b.m22834a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C8006b.m22834a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C8006b.m22834a(jSONObject2, "deviceInfo", C8005a.m22827d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8006b.m22834a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C8006b.m22834a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C8006b.m22834a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C8006b.m22834a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C8006b.m22834a(jSONObject4, "libraryVersion", "1.3.1-Oguryco");
        C8006b.m22834a(jSONObject4, "appId", C7995d.m22778a().mo55818b().getApplicationContext().getPackageName());
        C8006b.m22834a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C8006b.m22834a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C8006b.m22834a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C8006b.m22834a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7996e.m22781a().mo55824a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55854a(MediaEvents mediaEvents) {
        this.f19059c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55855a(String str) {
        C7996e.m22781a().mo55823a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55856a(String str, long j) {
        if (j >= this.f19061e) {
            this.f19060d = C8014a.AD_STATE_VISIBLE;
            C7996e.m22781a().mo55831b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55857a(String str, JSONObject jSONObject) {
        C7996e.m22781a().mo55823a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55858a(JSONObject jSONObject) {
        C7996e.m22781a().mo55832b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55859a(boolean z) {
        if (mo55864e()) {
            C7996e.m22781a().mo55834c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55860b() {
        this.f19057a.clear();
    }

    /* renamed from: b */
    public void mo55861b(String str, long j) {
        if (j >= this.f19061e && this.f19060d != C8014a.AD_STATE_NOTVISIBLE) {
            this.f19060d = C8014a.AD_STATE_NOTVISIBLE;
            C7996e.m22781a().mo55831b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55862c() {
        return this.f19058b;
    }

    /* renamed from: d */
    public MediaEvents mo55863d() {
        return this.f19059c;
    }

    /* renamed from: e */
    public boolean mo55864e() {
        return this.f19057a.get() != null;
    }

    /* renamed from: f */
    public void mo55865f() {
        C7996e.m22781a().mo55819a(getWebView());
    }

    /* renamed from: g */
    public void mo55866g() {
        C7996e.m22781a().mo55830b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f19057a.get();
    }

    /* renamed from: h */
    public void mo55868h() {
        C7996e.m22781a().mo55833c(getWebView());
    }

    /* renamed from: i */
    public void mo55869i() {
        this.f19061e = C8009d.m22846a();
        this.f19060d = C8014a.AD_STATE_IDLE;
    }
}
