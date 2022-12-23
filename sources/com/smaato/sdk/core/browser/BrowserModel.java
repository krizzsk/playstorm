package com.smaato.sdk.core.browser;

import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.smaato.sdk.core.browser.BrowserModel;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebChromeClient;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewClientCallbackAdapter;

class BrowserModel {
    /* access modifiers changed from: private */
    public Callback browserModelCallback;
    /* access modifiers changed from: private */
    public String lastKnownUrl;
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final SmaatoCookieManager smaatoCookieManager;
    private final BaseWebChromeClient webChromeClient;
    private final BaseWebChromeClient.WebChromeClientCallback webChromeClientCallback;
    /* access modifiers changed from: private */
    public WebView webView;
    private final BaseWebViewClient webViewClient;
    private final BaseWebViewClient.WebViewClientCallback webViewClientCallback;

    public interface Callback {
        void onGeneralError(int i, String str, String str2);

        void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onPageNavigationStackChanged(boolean z, boolean z2);

        void onProgressChanged(int i);

        void onRenderProcessGone();

        void onUrlLoadingStarted(String str);

        boolean shouldOverrideUrlLoading(String str);
    }

    BrowserModel(Logger logger2, BaseWebViewClient baseWebViewClient, BaseWebChromeClient baseWebChromeClient, SmaatoCookieManager smaatoCookieManager2) {
        C109561 r0 = new BaseWebChromeClient.WebChromeClientCallback() {
            public void onProgressChanged(int i) {
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onProgressChanged(i);
                    if (BrowserModel.this.webView != null) {
                        BrowserModel.this.browserModelCallback.onPageNavigationStackChanged(BrowserModel.this.webView.canGoBack(), BrowserModel.this.webView.canGoForward());
                    }
                }
            }
        };
        this.webChromeClientCallback = r0;
        C109572 r1 = new WebViewClientCallbackAdapter() {
            public boolean shouldOverrideUrlLoading(String str) {
                if (BrowserModel.this.browserModelCallback != null) {
                    return BrowserModel.this.browserModelCallback.shouldOverrideUrlLoading(str);
                }
                return false;
            }

            public void onPageStartedLoading(String str) {
                String unused = BrowserModel.this.lastKnownUrl = str;
                if (BrowserModel.this.browserModelCallback != null) {
                    BrowserModel.this.browserModelCallback.onUrlLoadingStarted(str);
                }
            }

            public void onPageFinishedLoading(String str) {
                BrowserModel.this.smaatoCookieManager.forceCookieSync();
            }

            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (Build.VERSION.SDK_INT >= 21) {
                    BrowserModel.this.logger.debug(LogDomain.BROWSER, "BrowserModel.onHttpError statusCode=%d", Integer.valueOf(webResourceResponse.getStatusCode()));
                }
                Objects.onNotNull(BrowserModel.this.browserModelCallback, new Consumer(webResourceRequest, webResourceResponse) {
                    public final /* synthetic */ WebResourceRequest f$0;
                    public final /* synthetic */ WebResourceResponse f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        ((BrowserModel.Callback) obj).onHttpError(this.f$0, this.f$1);
                    }
                });
            }

            public void onGeneralError(int i, String str, String str2) {
                BrowserModel.this.logger.debug(LogDomain.BROWSER, "BrowserModel.onGeneralError errorCode=%d, description=%s, url=%s", Integer.valueOf(i), str, str2);
                Objects.onNotNull(BrowserModel.this.browserModelCallback, new Consumer(i, str, str2) {
                    public final /* synthetic */ int f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void accept(Object obj) {
                        ((BrowserModel.Callback) obj).onGeneralError(this.f$0, this.f$1, this.f$2);
                    }
                });
            }

            public void onRenderProcessGone() {
                BrowserModel.this.logger.error(LogDomain.BROWSER, "WebView's render process has exited", new Object[0]);
                Objects.onNotNull(BrowserModel.this.browserModelCallback, $$Lambda$ndBoXqtHDXQyXe5fECTsjjJCnos.INSTANCE);
            }
        };
        this.webViewClientCallback = r1;
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for BrowserModel::new");
        this.webViewClient = (BaseWebViewClient) Objects.requireNonNull(baseWebViewClient, "Parameter webViewClient cannot be null for BrowserModel::new");
        this.webChromeClient = (BaseWebChromeClient) Objects.requireNonNull(baseWebChromeClient, "Parameter webChromeClient cannot be null for BrowserModel::new");
        this.smaatoCookieManager = (SmaatoCookieManager) Objects.requireNonNull(smaatoCookieManager2, "Parameter smaatoCookieManager cannot be null for BrowserModel::BrowserModel");
        baseWebViewClient.setWebViewClientCallback(r1);
        baseWebChromeClient.setWebChromeClientCallback(r0);
    }

    public void setWebView(WebView webView2) {
        this.webView = (WebView) Objects.requireNonNull(webView2, "Parameter webView cannot be null for BrowserModel::setWebView");
        webView2.setWebViewClient(this.webViewClient);
        webView2.setWebChromeClient(this.webChromeClient);
        this.smaatoCookieManager.setupCookiePolicy(webView2);
    }

    public void setBrowserModelCallback(Callback callback) {
        this.browserModelCallback = callback;
    }

    public void load(String str) {
        Objects.requireNonNull(str, "Parameter url cannot be null for BrowserModel::load");
        this.lastKnownUrl = str;
        ((WebView) Objects.requireNonNull(this.webView)).loadUrl(str);
    }

    public void reload() {
        ((WebView) Objects.requireNonNull(this.webView)).reload();
    }

    public void goBack() {
        ((WebView) Objects.requireNonNull(this.webView)).goBack();
    }

    public void goForward() {
        ((WebView) Objects.requireNonNull(this.webView)).goForward();
    }

    public String getCurrentUrl() {
        if (this.lastKnownUrl == null) {
            this.logger.error(LogDomain.BROWSER, "Internal error: loadUrl() was not called", new Object[0]);
        }
        return this.lastKnownUrl;
    }

    public void start() {
        this.smaatoCookieManager.startSync();
    }

    public void resume() {
        ((WebView) Objects.requireNonNull(this.webView)).onResume();
    }

    public void pause() {
        ((WebView) Objects.requireNonNull(this.webView)).onPause();
    }

    public void stop() {
        this.smaatoCookieManager.stopSync();
        this.smaatoCookieManager.forceCookieSync();
    }
}
