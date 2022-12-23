package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.p221b.C7592d;
import com.iab.omid.library.adcolony.p221b.C7593e;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7606d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
public class C7613b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18134a;

    /* renamed from: b */
    private Long f18135b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18136c;

    /* renamed from: d */
    private final String f18137d;

    public C7613b(Map<String, VerificationScriptResource> map, String str) {
        this.f18136c = map;
        this.f18137d = str;
    }

    /* renamed from: a */
    public void mo54261a() {
        super.mo54261a();
        mo54285j();
    }

    /* renamed from: a */
    public void mo54267a(C7586a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7603b.m21013a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo54268a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo54275b() {
        super.mo54275b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18139b;

            {
                this.f18139b = C7613b.this.f18134a;
            }

            public void run() {
                this.f18139b.destroy();
            }
        }, Math.max(4000 - (this.f18135b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7606d.m21026a() - this.f18135b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18134a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo54285j() {
        WebView webView = new WebView(C7592d.m20956a().mo54233b());
        this.f18134a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo54263a(this.f18134a);
        C7593e.m20959a().mo54244a(this.f18134a, this.f18137d);
        for (String next : this.f18136c.keySet()) {
            C7593e.m20959a().mo54237a(this.f18134a, this.f18136c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18135b = Long.valueOf(C7606d.m21026a());
    }
}
