package com.smaato.sdk.core.webview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BaseWebView extends WebView {
    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        init();
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        init();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        init();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context.getApplicationContext(), attributeSet, i, i2);
        init();
    }

    private void init() {
        if (Build.VERSION.SDK_INT < 18) {
            getSettings().setPluginState(WebSettings.PluginState.OFF);
        }
        initWebViewSettings();
    }

    public void loadHtml(String str) {
        loadDataWithBaseURL((String) null, str, "text/html", "UTF-8", (String) null);
    }

    private void initWebViewSettings() {
        getSettings().setJavaScriptEnabled(true);
        disableContentAccess();
    }

    private void disableContentAccess() {
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }
}
