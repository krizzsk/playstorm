package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
public class C7612a extends AdSessionStatePublisher {
    public C7612a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo54263a(webView);
    }
}
