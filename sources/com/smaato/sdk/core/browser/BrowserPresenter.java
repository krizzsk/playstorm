package com.smaato.sdk.core.browser;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.smaato.sdk.core.browser.BrowserModel;
import com.smaato.sdk.core.browser.BrowserPresenter;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

class BrowserPresenter {
    private final BrowserModel browserModel;
    private final BrowserModel.Callback browserModelCallback;
    /* access modifiers changed from: private */
    public BrowserView browserView;
    private final ClipboardManager clipboardManager;
    /* access modifiers changed from: private */
    public final LinkHandler linkHandler;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final UrlCreator urlCreator;

    BrowserPresenter(Logger logger2, BrowserModel browserModel2, UrlCreator urlCreator2, LinkHandler linkHandler2, ClipboardManager clipboardManager2) {
        C109581 r0 = new BrowserModel.Callback() {
            public void onGeneralError(int i, String str, String str2) {
            }

            public void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            }

            public boolean shouldOverrideUrlLoading(String str) {
                Either<Intent, String> findExternalAppForUrl = BrowserPresenter.this.linkHandler.findExternalAppForUrl(str);
                if (findExternalAppForUrl == null) {
                    return false;
                }
                Objects.onNotNull(findExternalAppForUrl.left(), new Consumer() {
                    public final void accept(Object obj) {
                        BrowserPresenter.C109581.this.lambda$shouldOverrideUrlLoading$1$BrowserPresenter$1((Intent) obj);
                    }
                });
                Objects.onNotNull(findExternalAppForUrl.right(), new Consumer() {
                    public final void accept(Object obj) {
                        BrowserPresenter.C109581.this.lambda$shouldOverrideUrlLoading$3$BrowserPresenter$1((String) obj);
                    }
                });
                return true;
            }

            public /* synthetic */ void lambda$shouldOverrideUrlLoading$1$BrowserPresenter$1(Intent intent) {
                Objects.onNotNull(BrowserPresenter.this.browserView, new Consumer(intent) {
                    public final /* synthetic */ Intent f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        BrowserPresenter.C109581.this.lambda$shouldOverrideUrlLoading$0$BrowserPresenter$1(this.f$1, (BrowserView) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$shouldOverrideUrlLoading$0$BrowserPresenter$1(Intent intent, BrowserView browserView) {
                BrowserPresenter.this.logger.debug(LogDomain.BROWSER, "Redirecting to the external app: %s", intent.toString());
                browserView.redirectToExternalApp(intent);
            }

            public /* synthetic */ void lambda$shouldOverrideUrlLoading$3$BrowserPresenter$1(String str) {
                Objects.onNotNull(BrowserPresenter.this.browserView, new Consumer(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        BrowserPresenter.C109581.this.lambda$shouldOverrideUrlLoading$2$BrowserPresenter$1(this.f$1, (BrowserView) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$shouldOverrideUrlLoading$2$BrowserPresenter$1(String str, BrowserView browserView) {
                BrowserPresenter.this.logger.debug(LogDomain.BROWSER, "Redirecting to other url: %s", str);
                BrowserPresenter.this.loadUrl(str);
            }

            public void onUrlLoadingStarted(String str) {
                BrowserPresenter.this.updateHostnameAndSchemeControls(str);
            }

            public void onPageNavigationStackChanged(boolean z, boolean z2) {
                BrowserPresenter.this.updateNavigationUiControls(z, z2);
            }

            public void onProgressChanged(int i) {
                if (BrowserPresenter.this.browserView != null) {
                    if (i == 100) {
                        BrowserPresenter.this.browserView.hideProgressIndicator();
                        return;
                    }
                    BrowserPresenter.this.browserView.updateProgressIndicator(i);
                    BrowserPresenter.this.browserView.showProgressIndicator();
                }
            }

            public void onRenderProcessGone() {
                Objects.onNotNull(BrowserPresenter.this.browserView, $$Lambda$DaQydZ6XkRTJg5P6T_WjSqSHomg.INSTANCE);
            }
        };
        this.browserModelCallback = r0;
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for BrowserPresenter::new");
        this.browserModel = (BrowserModel) Objects.requireNonNull(browserModel2, "Parameter browserModel cannot be null for BrowserPresenter::new");
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2, "Parameter urlCreator cannot be null for BrowserPresenter::new");
        this.linkHandler = (LinkHandler) Objects.requireNonNull(linkHandler2, "Parameter linkHandler cannot be null for BrowserPresenter::new");
        this.clipboardManager = (ClipboardManager) Objects.requireNonNull(clipboardManager2, "Parameter clipboardManager cannot be null for BrowserPresenter::new");
        browserModel2.setBrowserModelCallback(r0);
    }

    public void initWithView(BrowserView browserView2, WebView webView) {
        this.browserView = (BrowserView) Objects.requireNonNull(browserView2, "Parameter browserView cannot be null for BrowserPresenter::initWithView");
        Objects.requireNonNull(webView, "Parameter webView cannot be null for BrowserPresenter::initWithView");
        this.browserModel.setWebView(webView);
    }

    public void onStart() {
        this.browserModel.start();
    }

    public void onResume() {
        this.browserModel.resume();
    }

    public void onPause() {
        this.browserModel.pause();
    }

    public void onStop() {
        this.browserModel.stop();
    }

    public void dropView() {
        this.browserView = null;
    }

    public void loadUrl(String str) {
        this.browserModel.load(str);
    }

    public void onReloadClicked() {
        this.browserModel.reload();
    }

    public void onPageNavigationBackClicked() {
        this.browserModel.goBack();
    }

    public void onPageNavigationForwardClicked() {
        this.browserModel.goForward();
    }

    public void onOpenExternalBrowserClicked() {
        String currentUrl;
        if (this.browserView != null && (currentUrl = this.browserModel.getCurrentUrl()) != null) {
            this.linkHandler.handleUrl(currentUrl);
            this.browserView.closeBrowser();
        }
    }

    public void onCopyHostnameClicked() {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence) null, this.browserModel.getCurrentUrl()));
        this.logger.debug(LogDomain.BROWSER, "Link copied", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void updateHostnameAndSchemeControls(String str) {
        if (this.browserView != null) {
            this.browserView.showHostname(this.urlCreator.extractHostname(str));
            this.browserView.showConnectionSecure(this.urlCreator.isSecureScheme(this.urlCreator.extractScheme(str)));
        }
    }

    /* access modifiers changed from: private */
    public void updateNavigationUiControls(boolean z, boolean z2) {
        BrowserView browserView2 = this.browserView;
        if (browserView2 != null) {
            browserView2.setPageNavigationBackEnabled(z);
            this.browserView.setPageNavigationForwardEnabled(z2);
        }
    }
}
