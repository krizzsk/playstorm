package com.iab.omid.library.inmobi.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.C7838a;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.p251b.C7844d;
import com.iab.omid.library.inmobi.p251b.C7845e;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7858d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.publisher.b */
public class C7865b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18714a;

    /* renamed from: b */
    private Long f18715b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18716c;

    /* renamed from: d */
    private final String f18717d;

    public C7865b(Map<String, VerificationScriptResource> map, String str) {
        this.f18716c = map;
        this.f18717d = str;
    }

    /* renamed from: a */
    public void mo55247a() {
        super.mo55247a();
        mo55271j();
    }

    /* renamed from: a */
    public void mo55253a(C7838a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7855b.m22154a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55254a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55261b() {
        super.mo55261b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18719b = C7865b.this.f18714a;

            public void run() {
                this.f18719b.destroy();
            }
        }, Math.max(4000 - (this.f18715b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7858d.m22166a() - this.f18715b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18714a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55271j() {
        WebView webView = new WebView(C7844d.m22098a().mo55219b());
        this.f18714a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55249a(this.f18714a);
        C7845e.m22101a().mo55230a(this.f18714a, this.f18717d);
        for (String next : this.f18716c.keySet()) {
            C7845e.m22101a().mo55223a(this.f18714a, this.f18716c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18715b = Long.valueOf(C7858d.m22166a());
    }
}
