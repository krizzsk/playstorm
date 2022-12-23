package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.fyber.inneractive.sdk.activities.b */
public class C4175b extends WebChromeClient {
    public C4175b(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
    }

    public void onProgressChanged(WebView webView, int i) {
        Activity activity = (Activity) webView.getContext();
        activity.setTitle("Page is Loading...");
        activity.setProgress(i * 100);
        if (i == 100) {
            activity.setTitle(webView.getUrl());
        }
    }
}
