package com.vungle.warren.p393ui.view;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.vungle.warren.ui.view.WebSettingsUtils */
public class WebSettingsUtils {
    public static void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        webView.setVisibility(4);
    }
}
