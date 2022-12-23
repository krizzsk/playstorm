package com.tapjoy.internal;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dw */
public final class C11531dw extends C11528du {

    /* renamed from: e */
    WebView f27891e;

    /* renamed from: f */
    private Long f27892f = null;

    /* renamed from: g */
    private final Map<String, C11499cw> f27893g;

    /* renamed from: h */
    private final String f27894h;

    public C11531dw(Map<String, C11499cw> map, String str) {
        this.f27893g = map;
        this.f27894h = str;
    }

    /* renamed from: a */
    public final void mo72314a() {
        super.mo72314a();
        WebView webView = new WebView(C11511dg.m33411a().f27862a);
        this.f27891e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo72316a(this.f27891e);
        C11512dh.m33412a();
        C11512dh.m33415a(this.f27891e, this.f27894h);
        for (String next : this.f27893g.keySet()) {
            String externalForm = this.f27893g.get(next).f27814b.toExternalForm();
            C11512dh.m33412a();
            WebView webView2 = this.f27891e;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                C11512dh.m33415a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next));
            }
        }
        this.f27892f = Long.valueOf(System.nanoTime());
    }

    /* renamed from: a */
    public final void mo72317a(C11500cx cxVar, C11491co coVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C11499cw> unmodifiableMap = Collections.unmodifiableMap(coVar.f27770d);
        for (String next : unmodifiableMap.keySet()) {
            C11521do.m33438a(jSONObject, next, unmodifiableMap.get(next));
        }
        mo72318a(cxVar, coVar, jSONObject);
    }

    /* renamed from: b */
    public final void mo72322b() {
        super.mo72322b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f27896b = C11531dw.this.f27891e;

            public final void run() {
                this.f27896b.destroy();
            }
        }, Math.max(4000 - (this.f27892f == null ? 4000 : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f27892f.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f27891e = null;
    }
}
