package com.iab.omid.library.oguryco.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.oguryco.publisher.a */
public class C8015a extends AdSessionStatePublisher {
    public C8015a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo55848a(webView);
    }
}
