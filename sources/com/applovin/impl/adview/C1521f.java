package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p049d.C1866b;

/* renamed from: com.applovin.impl.adview.f */
class C1521f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f1895a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f1896b = new WebViewRenderProcessClient() {
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C1513d) {
                C1829e currentAd = ((C1513d) webView).getCurrentAd();
                C1521f.this.f1895a.mo14330ac().mo14097a(currentAd).mo14098a(C1866b.f3387D).mo14101a();
                if (C2092v.m5047a()) {
                    C2092v A = C1521f.this.f1895a.mo14286A();
                    A.mo14793e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    C1521f(C1959m mVar) {
        this.f1895a = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebViewRenderProcessClient mo12953a() {
        return this.f1896b;
    }
}
