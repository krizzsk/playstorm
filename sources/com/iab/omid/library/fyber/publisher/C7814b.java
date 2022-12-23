package com.iab.omid.library.fyber.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.p245b.C7793d;
import com.iab.omid.library.fyber.p245b.C7794e;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7807d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.publisher.b */
public class C7814b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18598a;

    /* renamed from: b */
    private Long f18599b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18600c;

    /* renamed from: d */
    private final String f18601d;

    public C7814b(Map<String, VerificationScriptResource> map, String str) {
        this.f18600c = map;
        this.f18601d = str;
    }

    /* renamed from: a */
    public void mo55052a() {
        super.mo55052a();
        mo55076j();
    }

    /* renamed from: a */
    public void mo55058a(C7787a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7804b.m21927a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55059a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55066b() {
        super.mo55066b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18603b = C7814b.this.f18598a;

            public void run() {
                this.f18603b.destroy();
            }
        }, Math.max(4000 - (this.f18599b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7807d.m21940a() - this.f18599b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18598a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55076j() {
        WebView webView = new WebView(C7793d.m21870a().mo55024b());
        this.f18598a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55054a(this.f18598a);
        C7794e.m21873a().mo55035a(this.f18598a, this.f18601d);
        for (String next : this.f18600c.keySet()) {
            C7794e.m21873a().mo55028a(this.f18598a, this.f18600c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18599b = Long.valueOf(C7807d.m21940a());
    }
}
