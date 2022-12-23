package com.iab.omid.library.vungle.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C8089a;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.p281b.C8095d;
import com.iab.omid.library.vungle.p281b.C8096e;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8109d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.publisher.b */
public class C8116b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19292a;

    /* renamed from: b */
    private Long f19293b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f19294c;

    /* renamed from: d */
    private final String f19295d;

    public C8116b(Map<String, VerificationScriptResource> map, String str) {
        this.f19294c = map;
        this.f19295d = str;
    }

    /* renamed from: a */
    public void mo56234a() {
        super.mo56234a();
        mo56258j();
    }

    /* renamed from: a */
    public void mo56240a(C8089a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C8106b.m23282a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo56241a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo56248b() {
        super.mo56248b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f19297b = C8116b.this.f19292a;

            public void run() {
                this.f19297b.destroy();
            }
        }, Math.max(4000 - (this.f19293b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C8109d.m23294a() - this.f19293b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f19292a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56258j() {
        WebView webView = new WebView(C8095d.m23226a().mo56206b());
        this.f19292a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo56236a(this.f19292a);
        C8096e.m23229a().mo56217a(this.f19292a, this.f19295d);
        for (String next : this.f19294c.keySet()) {
            C8096e.m23229a().mo56210a(this.f19292a, this.f19294c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f19293b = Long.valueOf(C8109d.m23294a());
    }
}
