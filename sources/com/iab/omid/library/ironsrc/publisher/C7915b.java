package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C7888a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.p257b.C7894d;
import com.iab.omid.library.ironsrc.p257b.C7895e;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7908d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
public class C7915b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18828a;

    /* renamed from: b */
    private Long f18829b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f18830c;

    /* renamed from: d */
    private final String f18831d;

    public C7915b(Map<String, VerificationScriptResource> map, String str) {
        this.f18830c = map;
        this.f18831d = str;
    }

    /* renamed from: a */
    public void mo55433a() {
        super.mo55433a();
        mo55457j();
    }

    /* renamed from: a */
    public void mo55439a(C7888a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7905b.m22375a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55440a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55447b() {
        super.mo55447b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f18833b = C7915b.this.f18828a;

            public void run() {
                this.f18833b.destroy();
            }
        }, Math.max(4000 - (this.f18829b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7908d.m22387a() - this.f18829b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18828a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55457j() {
        WebView webView = new WebView(C7894d.m22320a().mo55405b());
        this.f18828a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55435a(this.f18828a);
        C7895e.m22323a().mo55416a(this.f18828a, this.f18831d);
        for (String next : this.f18830c.keySet()) {
            C7895e.m22323a().mo55409a(this.f18828a, this.f18830c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18829b = Long.valueOf(C7908d.m22387a());
    }
}
