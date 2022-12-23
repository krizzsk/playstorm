package com.tapjoy.internal;

import android.webkit.WebView;

/* renamed from: com.tapjoy.internal.dv */
public final class C11530dv extends C11528du {
    public C11530dv(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo72316a(webView);
    }
}
