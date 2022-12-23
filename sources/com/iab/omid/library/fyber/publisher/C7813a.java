package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.fyber.publisher.a */
public class C7813a extends AdSessionStatePublisher {
    public C7813a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55054a(webView);
    }
}
