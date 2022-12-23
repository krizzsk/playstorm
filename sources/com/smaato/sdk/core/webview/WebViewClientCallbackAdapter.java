package com.smaato.sdk.core.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.smaato.sdk.core.webview.BaseWebViewClient;

public class WebViewClientCallbackAdapter implements BaseWebViewClient.WebViewClientCallback {
    public void onGeneralError(int i, String str, String str2) {
    }

    public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public void onPageFinishedLoading(String str) {
    }

    public void onPageStartedLoading(String str) {
    }

    public void onRenderProcessGone() {
    }

    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }
}
