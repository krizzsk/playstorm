package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.vungle.publisher.a */
public class C8115a extends AdSessionStatePublisher {
    public C8115a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo56236a(webView);
    }
}
