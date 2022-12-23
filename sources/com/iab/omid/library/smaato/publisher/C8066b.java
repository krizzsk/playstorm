package com.iab.omid.library.smaato.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.AdSessionContext;
import com.iab.omid.library.smaato.adsession.C8039a;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.iab.omid.library.smaato.p275b.C8045d;
import com.iab.omid.library.smaato.p275b.C8046e;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8059d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.publisher.b */
public class C8066b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19179a;

    /* renamed from: b */
    private Long f19180b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f19181c;

    /* renamed from: d */
    private final String f19182d;

    public C8066b(Map<String, VerificationScriptResource> map, String str) {
        this.f19181c = map;
        this.f19182d = str;
    }

    /* renamed from: a */
    public void mo56040a() {
        super.mo56040a();
        mo56064j();
    }

    /* renamed from: a */
    public void mo56046a(C8039a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C8056b.m23058a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo56047a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo56054b() {
        super.mo56054b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f19184b;

            {
                this.f19184b = C8066b.this.f19179a;
            }

            public void run() {
                this.f19184b.destroy();
            }
        }, Math.max(4000 - (this.f19180b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C8059d.m23070a() - this.f19180b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19179a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56064j() {
        WebView webView = new WebView(C8045d.m23002a().mo56012b());
        this.f19179a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo56042a(this.f19179a);
        C8046e.m23005a().mo56023a(this.f19179a, this.f19182d);
        for (String next : this.f19181c.keySet()) {
            C8046e.m23005a().mo56016a(this.f19179a, this.f19181c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19180b = Long.valueOf(C8059d.m23070a());
    }
}
