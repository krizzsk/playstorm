package com.iab.omid.library.smaato.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.smaato.publisher.a */
public class C8065a extends AdSessionStatePublisher {
    public C8065a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo56042a(webView);
    }
}
