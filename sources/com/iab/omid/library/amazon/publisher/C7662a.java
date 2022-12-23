package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.amazon.publisher.a */
public class C7662a extends AdSessionStatePublisher {
    public C7662a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54462a(webView);
    }
}
