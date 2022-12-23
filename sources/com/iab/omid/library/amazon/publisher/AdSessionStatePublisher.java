package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.media.MediaEvents;
import com.iab.omid.library.amazon.p227b.C7642d;
import com.iab.omid.library.amazon.p227b.C7643e;
import com.iab.omid.library.amazon.p229d.C7652a;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7656d;
import com.iab.omid.library.amazon.p230e.C7660b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7660b f18242a = new C7660b((WebView) null);

    /* renamed from: b */
    private AdEvents f18243b;

    /* renamed from: c */
    private MediaEvents f18244c;

    /* renamed from: d */
    private C7661a f18245d;

    /* renamed from: e */
    private long f18246e;

    /* renamed from: com.iab.omid.library.amazon.publisher.AdSessionStatePublisher$a */
    enum C7661a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54483i();
    }

    /* renamed from: a */
    public void mo54460a() {
    }

    /* renamed from: a */
    public void mo54461a(float f) {
        C7643e.m21189a().mo54434a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54462a(WebView webView) {
        this.f18242a = new C7660b(webView);
    }

    /* renamed from: a */
    public void mo54463a(AdEvents adEvents) {
        this.f18243b = adEvents;
    }

    /* renamed from: a */
    public void mo54464a(AdSessionConfiguration adSessionConfiguration) {
        C7643e.m21189a().mo54441a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54465a(ErrorType errorType, String str) {
        C7643e.m21189a().mo54435a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54466a(C7636a aVar, AdSessionContext adSessionContext) {
        mo54467a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54467a(C7636a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7653b.m21243a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7653b.m21243a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7653b.m21243a(jSONObject2, "deviceInfo", C7652a.m21235d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7653b.m21243a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7653b.m21243a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7653b.m21243a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7653b.m21243a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7653b.m21243a(jSONObject4, "libraryVersion", "1.3.28-Amazon");
        C7653b.m21243a(jSONObject4, "appId", C7642d.m21186a().mo54432b().getApplicationContext().getPackageName());
        C7653b.m21243a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7653b.m21243a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7653b.m21243a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7653b.m21243a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7643e.m21189a().mo54438a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54468a(MediaEvents mediaEvents) {
        this.f18244c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54469a(String str) {
        C7643e.m21189a().mo54437a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54470a(String str, long j) {
        if (j >= this.f18246e) {
            this.f18245d = C7661a.AD_STATE_VISIBLE;
            C7643e.m21189a().mo54445b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54471a(String str, JSONObject jSONObject) {
        C7643e.m21189a().mo54437a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54472a(JSONObject jSONObject) {
        C7643e.m21189a().mo54446b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54473a(boolean z) {
        if (mo54478e()) {
            C7643e.m21189a().mo54448c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54474b() {
        this.f18242a.clear();
    }

    /* renamed from: b */
    public void mo54475b(String str, long j) {
        if (j >= this.f18246e && this.f18245d != C7661a.AD_STATE_NOTVISIBLE) {
            this.f18245d = C7661a.AD_STATE_NOTVISIBLE;
            C7643e.m21189a().mo54445b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54476c() {
        return this.f18243b;
    }

    /* renamed from: d */
    public MediaEvents mo54477d() {
        return this.f18244c;
    }

    /* renamed from: e */
    public boolean mo54478e() {
        return this.f18242a.get() != null;
    }

    /* renamed from: f */
    public void mo54479f() {
        C7643e.m21189a().mo54433a(getWebView());
    }

    /* renamed from: g */
    public void mo54480g() {
        C7643e.m21189a().mo54444b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18242a.get();
    }

    /* renamed from: h */
    public void mo54482h() {
        C7643e.m21189a().mo54447c(getWebView());
    }

    /* renamed from: i */
    public void mo54483i() {
        this.f18246e = C7656d.m21256a();
        this.f18245d = C7661a.AD_STATE_IDLE;
    }
}
