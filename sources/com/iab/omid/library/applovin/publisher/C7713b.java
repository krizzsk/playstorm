package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.p233b.C7692d;
import com.iab.omid.library.applovin.p233b.C7693e;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7706d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.publisher.b */
public class C7713b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18368a;

    /* renamed from: b */
    private Long f18369b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18370c;

    /* renamed from: d */
    private final String f18371d;

    public C7713b(Map<String, VerificationScriptResource> map, String str) {
        this.f18370c = map;
        this.f18371d = str;
    }

    /* renamed from: a */
    public void mo54659a() {
        super.mo54659a();
        mo54683j();
    }

    /* renamed from: a */
    public void mo54665a(C7686a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7703b.m21473a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54666a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54673b() {
        super.mo54673b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18373b = C7713b.this.f18368a;

            public void run() {
                this.f18373b.destroy();
            }
        }, Math.max(4000 - (this.f18369b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7706d.m21486a() - this.f18369b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18368a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54683j() {
        WebView webView = new WebView(C7692d.m21416a().mo54631b());
        this.f18368a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54661a(this.f18368a);
        C7693e.m21419a().mo54642a(this.f18368a, this.f18371d);
        for (String next : this.f18370c.keySet()) {
            C7693e.m21419a().mo54635a(this.f18368a, this.f18370c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18369b = Long.valueOf(C7706d.m21486a());
    }
}
