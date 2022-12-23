package com.iab.omid.library.mmadbridge.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.p263b.C7944d;
import com.iab.omid.library.mmadbridge.p263b.C7945e;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7958d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.publisher.b */
public class C7965b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f18942a;

    /* renamed from: b */
    private Long f18943b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f18944c;

    /* renamed from: d */
    private final String f18945d;

    public C7965b(Map<String, VerificationScriptResource> map, String str) {
        this.f18944c = map;
        this.f18945d = str;
    }

    /* renamed from: a */
    public void mo55631a() {
        super.mo55631a();
        mo55655j();
    }

    /* renamed from: a */
    public void mo55637a(C7938a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C7955b.m22602a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo55638a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo55645b() {
        super.mo55645b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f18947b = C7965b.this.f18942a;

            public void run() {
                this.f18947b.destroy();
            }
        }, Math.max(4000 - (this.f18943b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C7958d.m22615a() - this.f18943b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f18942a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo55655j() {
        WebView webView = new WebView(C7944d.m22545a().mo55603b());
        this.f18942a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo55633a(this.f18942a);
        C7945e.m22548a().mo55614a(this.f18942a, this.f18945d);
        for (String next : this.f18944c.keySet()) {
            C7945e.m22548a().mo55607a(this.f18942a, this.f18944c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f18943b = Long.valueOf(C7958d.m22615a());
    }
}
