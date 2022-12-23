package com.iab.omid.library.amazon.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.p227b.C7642d;
import com.iab.omid.library.amazon.p227b.C7643e;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7656d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.publisher.b */
public class C7663b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18251a;

    /* renamed from: b */
    private Long f18252b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18253c;

    /* renamed from: d */
    private final String f18254d;

    public C7663b(Map<String, VerificationScriptResource> map, String str) {
        this.f18253c = map;
        this.f18254d = str;
    }

    /* renamed from: a */
    public void mo54460a() {
        super.mo54460a();
        mo54484j();
    }

    /* renamed from: a */
    public void mo54466a(C7636a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7653b.m21243a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54467a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54474b() {
        super.mo54474b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18256b = C7663b.this.f18251a;

            public void run() {
                this.f18256b.destroy();
            }
        }, Math.max(4000 - (this.f18252b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7656d.m21256a() - this.f18252b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18251a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54484j() {
        WebView webView = new WebView(C7642d.m21186a().mo54432b());
        this.f18251a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54462a(this.f18251a);
        C7643e.m21189a().mo54443a(this.f18251a, this.f18254d);
        for (String next : this.f18253c.keySet()) {
            C7643e.m21189a().mo54436a(this.f18251a, this.f18253c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18252b = Long.valueOf(C7656d.m21256a());
    }
}
