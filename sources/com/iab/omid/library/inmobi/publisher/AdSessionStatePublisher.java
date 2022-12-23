package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.p251b.C7844d;
import com.iab.omid.library.inmobi.p251b.C7845e;
import com.iab.omid.library.inmobi.p253d.C7854a;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7858d;
import com.iab.omid.library.inmobi.p254e.C7862b;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C7862b f18705a = new C7862b((WebView) null);

    /* renamed from: b */
    private AdEvents f18706b;

    /* renamed from: c */
    private MediaEvents f18707c;

    /* renamed from: d */
    private C7863a f18708d;

    /* renamed from: e */
    private long f18709e;

    /* renamed from: com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher$a */
    enum C7863a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo55270i();
    }

    /* renamed from: a */
    public void mo55247a() {
    }

    /* renamed from: a */
    public void mo55248a(float f) {
        C7845e.m22101a().mo55221a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55249a(WebView webView) {
        this.f18705a = new C7862b(webView);
    }

    /* renamed from: a */
    public void mo55250a(AdEvents adEvents) {
        this.f18706b = adEvents;
    }

    /* renamed from: a */
    public void mo55251a(AdSessionConfiguration adSessionConfiguration) {
        C7845e.m22101a().mo55228a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo55252a(ErrorType errorType, String str) {
        C7845e.m22101a().mo55222a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo55253a(C7838a aVar, AdSessionContext adSessionContext) {
        mo55254a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55254a(C7838a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C7855b.m22154a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C7855b.m22154a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C7855b.m22154a(jSONObject2, "deviceInfo", C7854a.m22147d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C7855b.m22154a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C7855b.m22154a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C7855b.m22154a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C7855b.m22154a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C7855b.m22154a(jSONObject4, "libraryVersion", "1.3.17-Inmobi");
        C7855b.m22154a(jSONObject4, "appId", C7844d.m22098a().mo55219b().getApplicationContext().getPackageName());
        C7855b.m22154a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C7855b.m22154a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C7855b.m22154a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C7855b.m22154a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C7845e.m22101a().mo55225a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo55255a(MediaEvents mediaEvents) {
        this.f18707c = mediaEvents;
    }

    /* renamed from: a */
    public void mo55256a(String str) {
        C7845e.m22101a().mo55224a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo55257a(String str, long j) {
        if (j >= this.f18709e) {
            this.f18708d = C7863a.AD_STATE_VISIBLE;
            C7845e.m22101a().mo55232b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo55258a(String str, JSONObject jSONObject) {
        C7845e.m22101a().mo55224a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo55259a(JSONObject jSONObject) {
        C7845e.m22101a().mo55233b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo55260a(boolean z) {
        if (mo55265e()) {
            C7845e.m22101a().mo55235c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo55261b() {
        this.f18705a.clear();
    }

    /* renamed from: b */
    public void mo55262b(String str, long j) {
        if (j >= this.f18709e && this.f18708d != C7863a.AD_STATE_NOTVISIBLE) {
            this.f18708d = C7863a.AD_STATE_NOTVISIBLE;
            C7845e.m22101a().mo55232b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo55263c() {
        return this.f18706b;
    }

    /* renamed from: d */
    public MediaEvents mo55264d() {
        return this.f18707c;
    }

    /* renamed from: e */
    public boolean mo55265e() {
        return this.f18705a.get() != null;
    }

    /* renamed from: f */
    public void mo55266f() {
        C7845e.m22101a().mo55220a(getWebView());
    }

    /* renamed from: g */
    public void mo55267g() {
        C7845e.m22101a().mo55231b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f18705a.get();
    }

    /* renamed from: h */
    public void mo55269h() {
        C7845e.m22101a().mo55234c(getWebView());
    }

    /* renamed from: i */
    public void mo55270i() {
        this.f18709e = C7858d.m22166a();
        this.f18708d = C7863a.AD_STATE_IDLE;
    }
}
