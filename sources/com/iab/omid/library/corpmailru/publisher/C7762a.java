package com.iab.omid.library.corpmailru.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.corpmailru.publisher.a */
public class C7762a extends AdSessionStatePublisher {
    public C7762a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54856a(webView);
    }
}
