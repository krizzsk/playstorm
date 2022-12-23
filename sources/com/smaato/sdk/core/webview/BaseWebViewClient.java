package com.smaato.sdk.core.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebViewClient;

public class BaseWebViewClient extends WebViewClient {
    private WebViewClientCallback webViewClientCallback;

    public interface WebViewClientCallback {
        void onGeneralError(int i, String str, String str2);

        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageFinishedLoading(String str);

        void onPageStartedLoading(String str);

        void onRenderProcessGone();

        boolean shouldOverrideUrlLoading(String str);
    }

    public void setWebViewClientCallback(WebViewClientCallback webViewClientCallback2) {
        this.webViewClientCallback = webViewClientCallback2;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onPageStartedLoading(this.f$0);
            }
        });
    }

    public void onPageFinished(WebView webView, String str) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onPageFinishedLoading(this.f$0);
            }
        });
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return shouldOverrideUrlLoadingInternal(str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoadingInternal(webResourceRequest.getUrl().toString());
    }

    private boolean shouldOverrideUrlLoadingInternal(String str) {
        WebViewClientCallback webViewClientCallback2 = this.webViewClientCallback;
        if (webViewClientCallback2 == null) {
            return false;
        }
        return webViewClientCallback2.shouldOverrideUrlLoading(str);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer(webResourceRequest, webResourceResponse) {
            public final /* synthetic */ WebResourceRequest f$0;
            public final /* synthetic */ WebResourceResponse f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onHttpError(this.f$0, this.f$1);
            }
        });
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer(i, str, str2) {
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onGeneralError(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Objects.onNotNull(this.webViewClientCallback, new Consumer(webResourceError, webResourceRequest) {
            public final /* synthetic */ WebResourceError f$0;
            public final /* synthetic */ WebResourceRequest f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((BaseWebViewClient.WebViewClientCallback) obj).onGeneralError(this.f$0.getErrorCode(), this.f$0.getDescription().toString(), this.f$1.getUrl().toString());
            }
        });
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Objects.onNotNull(this.webViewClientCallback, $$Lambda$bSVuxij1dwzUrJgQd2IEdzwsD0.INSTANCE);
        return true;
    }
}
