package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.p263b.C7944d;
import com.iab.omid.library.mmadbridge.p263b.C7945e;
import com.iab.omid.library.mmadbridge.p265d.C7954a;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7958d;
import com.iab.omid.library.mmadbridge.p266e.C7962b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7962b f18933a = new C7962b((WebView) null);

    /* renamed from: b */
    private AdEvents f18934b;

    /* renamed from: c */
    private MediaEvents f18935c;

    /* renamed from: d */
    private C7963a f18936d;

    /* renamed from: e */
    private long f18937e;

    /* renamed from: com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher$a */
    enum C7963a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55654i();
    }

    /* renamed from: a */
    public void mo55631a() {
    }

    /* renamed from: a */
    public void mo55632a(float f) {
        C7945e.m22548a().mo55605a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55633a(WebView webView) {
        this.f18933a = new C7962b(webView);
    }

    /* renamed from: a */
    public void mo55634a(AdEvents adEvents) {
        this.f18934b = adEvents;
    }

    /* renamed from: a */
    public void mo55635a(AdSessionConfiguration adSessionConfiguration) {
        C7945e.m22548a().mo55612a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55636a(ErrorType errorType, String str) {
        C7945e.m22548a().mo55606a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55637a(C7938a aVar, AdSessionContext adSessionContext) {
        mo55638a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55638a(C7938a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7955b.m22602a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7955b.m22602a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7955b.m22602a(jSONObject2, "deviceInfo", C7954a.m22594d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7955b.m22602a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7955b.m22602a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7955b.m22602a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7955b.m22602a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7955b.m22602a(jSONObject4, "libraryVersion", "1.3.29-Mmadbridge");
        C7955b.m22602a(jSONObject4, "appId", C7944d.m22545a().mo55603b().getApplicationContext().getPackageName());
        C7955b.m22602a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7955b.m22602a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7955b.m22602a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7955b.m22602a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7945e.m22548a().mo55609a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55639a(MediaEvents mediaEvents) {
        this.f18935c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55640a(String str) {
        C7945e.m22548a().mo55608a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55641a(String str, long j) {
        if (j >= this.f18937e) {
            this.f18936d = C7963a.AD_STATE_VISIBLE;
            C7945e.m22548a().mo55616b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55642a(String str, JSONObject jSONObject) {
        C7945e.m22548a().mo55608a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55643a(JSONObject jSONObject) {
        C7945e.m22548a().mo55617b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55644a(boolean z) {
        if (mo55649e()) {
            C7945e.m22548a().mo55619c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55645b() {
        this.f18933a.clear();
    }

    /* renamed from: b */
    public void mo55646b(String str, long j) {
        if (j >= this.f18937e && this.f18936d != C7963a.AD_STATE_NOTVISIBLE) {
            this.f18936d = C7963a.AD_STATE_NOTVISIBLE;
            C7945e.m22548a().mo55616b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55647c() {
        return this.f18934b;
    }

    /* renamed from: d */
    public MediaEvents mo55648d() {
        return this.f18935c;
    }

    /* renamed from: e */
    public boolean mo55649e() {
        return this.f18933a.get() != null;
    }

    /* renamed from: f */
    public void mo55650f() {
        C7945e.m22548a().mo55604a(getWebView());
    }

    /* renamed from: g */
    public void mo55651g() {
        C7945e.m22548a().mo55615b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18933a.get();
    }

    /* renamed from: h */
    public void mo55653h() {
        C7945e.m22548a().mo55618c(getWebView());
    }

    /* renamed from: i */
    public void mo55654i() {
        this.f18937e = C7958d.m22615a();
        this.f18936d = C7963a.AD_STATE_IDLE;
    }
}
