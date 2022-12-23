package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.applovin.publisher.a */
public class C7712a extends AdSessionStatePublisher {
    public C7712a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54661a(webView);
    }
}
