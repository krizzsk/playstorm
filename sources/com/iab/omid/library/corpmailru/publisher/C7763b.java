package com.iab.omid.library.corpmailru.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.C7736a;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.p239b.C7742d;
import com.iab.omid.library.corpmailru.p239b.C7743e;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7756d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.publisher.b */
public class C7763b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18484a;

    /* renamed from: b */
    private Long f18485b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18486c;

    /* renamed from: d */
    private final String f18487d;

    public C7763b(Map<String, VerificationScriptResource> map, String str) {
        this.f18486c = map;
        this.f18487d = str;
    }

    /* renamed from: a */
    public void mo54854a() {
        super.mo54854a();
        mo54878j();
    }

    /* renamed from: a */
    public void mo54860a(C7736a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7753b.m21700a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54861a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54868b() {
        super.mo54868b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18489b;

            {
                this.f18489b = C7763b.this.f18484a;
            }

            public void run() {
                this.f18489b.destroy();
            }
        }, Math.max(4000 - (this.f18485b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7756d.m21712a() - this.f18485b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18484a = null;
    }

    /* renamed from: j */
    public void mo54878j() {
        WebView webView = new WebView(C7742d.m21644a().mo54826b());
        this.f18484a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54856a(this.f18484a);
        C7743e.m21647a().mo54837a(this.f18484a, this.f18487d);
        for (String next : this.f18486c.keySet()) {
            C7743e.m21647a().mo54830a(this.f18484a, this.f18486c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18485b = Long.valueOf(C7756d.m21712a());
    }
}
