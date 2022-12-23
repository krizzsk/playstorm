package com.iab.omid.library.oguryco.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.C7988a;
import com.iab.omid.library.oguryco.adsession.VerificationScriptResource;
import com.iab.omid.library.oguryco.p269b.C7995d;
import com.iab.omid.library.oguryco.p269b.C7996e;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8009d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.publisher.b */
public class C8016b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19066a;

    /* renamed from: b */
    private Long f19067b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f19068c;

    /* renamed from: d */
    private final String f19069d;

    public C8016b(Map<String, VerificationScriptResource> map, String str) {
        this.f19068c = map;
        this.f19069d = str;
    }

    /* renamed from: a */
    public void mo55846a() {
        super.mo55846a();
        mo55870j();
    }

    /* renamed from: a */
    public void mo55852a(C7988a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C8006b.m22834a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55853a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55860b() {
        super.mo55860b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f19071b = C8016b.this.f19066a;

            public void run() {
                this.f19071b.destroy();
            }
        }, Math.max(4000 - (this.f19067b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C8009d.m22846a() - this.f19067b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19066a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55870j() {
        WebView webView = new WebView(C7995d.m22778a().mo55818b());
        this.f19066a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55848a(this.f19066a);
        C7996e.m22781a().mo55829a(this.f19066a, this.f19069d);
        for (String next : this.f19068c.keySet()) {
            C7996e.m22781a().mo55822a(this.f19066a, this.f19068c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19067b = Long.valueOf(C8009d.m22846a());
    }
}
