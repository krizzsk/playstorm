package com.iab.omid.library.corpmailru.publisher;

import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdEvents;
import com.iab.omid.library.corpmailru.adsession.AdSessionConfiguration;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.p239b.C7742d;
import com.iab.omid.library.corpmailru.p239b.C7743e;
import com.iab.omid.library.corpmailru.p241d.C7752a;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7756d;
import com.iab.omid.library.corpmailru.p242e.C7760b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7760b f18475a = new C7760b((WebView) null);

    /* renamed from: b */
    private AdEvents f18476b;

    /* renamed from: c */
    private MediaEvents f18477c;

    /* renamed from: d */
    private C7761a f18478d;

    /* renamed from: e */
    private long f18479e;

    /* renamed from: com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher$a */
    public enum C7761a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo54877i();
    }

    /* renamed from: a */
    public void mo54854a() {
    }

    /* renamed from: a */
    public void mo54855a(float f) {
        C7743e.m21647a().mo54828a(getWebView(), f);
    }

    /* renamed from: a */
    public void mo54856a(WebView webView) {
        this.f18475a = new C7760b(webView);
    }

    /* renamed from: a */
    public void mo54857a(AdEvents adEvents) {
        this.f18476b = adEvents;
    }

    /* renamed from: a */
    public void mo54858a(AdSessionConfiguration adSessionConfiguration) {
        C7743e.m21647a().mo54835a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo54859a(ErrorType errorType, String str) {
        C7743e.m21647a().mo54829a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo54860a(C7736a aVar, AdSessionContext adSessionContext) {
        mo54861a(aVar, adSessionContext, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54861a(C7736a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7753b.m21700a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7753b.m21700a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7753b.m21700a(jSONObject2, "deviceInfo", C7752a.m21693d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7753b.m21700a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7753b.m21700a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7753b.m21700a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7753b.m21700a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7753b.m21700a(jSONObject4, "libraryVersion", "1.3.20-Corpmailru");
        C7753b.m21700a(jSONObject4, "appId", C7742d.m21644a().mo54826b().getApplicationContext().getPackageName());
        C7753b.m21700a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7753b.m21700a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7753b.m21700a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7753b.m21700a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7743e.m21647a().mo54832a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo54862a(MediaEvents mediaEvents) {
        this.f18477c = mediaEvents;
    }

    /* renamed from: a */
    public void mo54863a(String str) {
        C7743e.m21647a().mo54831a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo54864a(String str, long j) {
        if (j >= this.f18479e) {
            this.f18478d = C7761a.AD_STATE_VISIBLE;
            C7743e.m21647a().mo54839b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo54865a(String str, JSONObject jSONObject) {
        C7743e.m21647a().mo54831a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo54866a(JSONObject jSONObject) {
        C7743e.m21647a().mo54840b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo54867a(boolean z) {
        if (mo54872e()) {
            C7743e.m21647a().mo54842c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo54868b() {
        this.f18475a.clear();
    }

    /* renamed from: b */
    public void mo54869b(String str, long j) {
        C7761a aVar;
        if (j >= this.f18479e && this.f18478d != (aVar = C7761a.AD_STATE_NOTVISIBLE)) {
            this.f18478d = aVar;
            C7743e.m21647a().mo54839b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo54870c() {
        return this.f18476b;
    }

    /* renamed from: d */
    public MediaEvents mo54871d() {
        return this.f18477c;
    }

    /* renamed from: e */
    public boolean mo54872e() {
        return this.f18475a.get() != null;
    }

    /* renamed from: f */
    public void mo54873f() {
        C7743e.m21647a().mo54827a(getWebView());
    }

    /* renamed from: g */
    public void mo54874g() {
        C7743e.m21647a().mo54838b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18475a.get();
    }

    /* renamed from: h */
    public void mo54876h() {
        C7743e.m21647a().mo54841c(getWebView());
    }

    /* renamed from: i */
    public void mo54877i() {
        this.f18479e = C7756d.m21712a();
        this.f18478d = C7761a.AD_STATE_IDLE;
    }
}
