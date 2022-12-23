package com.smaato.sdk.core.webview;

import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.util.Objects;

public final class WebViewHelperUtil {
    private WebViewHelperUtil() {
    }

    static void destroyWebViewSafely(WebView webView) {
        Objects.requireNonNull(webView, "Parameter webView cannot be null for WebViewHelperUtil::destroyWebViewSafely");
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
    }

    public static void resetAndDestroyWebViewSafely(final WebView webView) {
        Objects.requireNonNull(webView);
        webView.stopLoading();
        BaseWebViewClient baseWebViewClient = new BaseWebViewClient();
        baseWebViewClient.setWebViewClientCallback(new WebViewClientCallbackAdapter() {
            public void onPageFinishedLoading(String str) {
                if ("about:blank".equals(str)) {
                    Log.d(LogDomain.CORE.name(), "going to release web-view");
                    WebViewHelperUtil.destroyWebViewSafely(webView);
                }
            }
        });
        webView.setWebViewClient(baseWebViewClient);
        webView.loadUrl("about:blank");
    }

    public static String getCenterContentCss() {
        return Build.VERSION.SDK_INT < 19 ? "display: -webkit-box;-webkit-box-align: center;-webkit-box-pack: center;" : "display: flex;align-items: center;justify-content: center;";
    }
}
