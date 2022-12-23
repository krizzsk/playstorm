package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.ironsrc.publisher.a */
public class C7914a extends AdSessionStatePublisher {
    public C7914a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55435a(webView);
    }
}
