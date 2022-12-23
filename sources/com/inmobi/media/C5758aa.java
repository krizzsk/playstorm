package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.aa */
/* compiled from: BaseWebViewClient */
public class C5758aa extends WebViewClient {

    /* renamed from: a */
    private boolean f14519a;

    /* renamed from: b */
    public int f14520b = -1;

    /* renamed from: c */
    public boolean f14521c = false;
    /* access modifiers changed from: package-private */

    /* renamed from: d */
    public AtomicBoolean f14522d = new AtomicBoolean(false);

    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        StringBuilder sb = new StringBuilder("Loading error. Error code: ");
        sb.append(webResourceError.getErrorCode());
        sb.append(" Error msg:");
        sb.append(webResourceError.getDescription());
        sb.append(" Failing url:");
        sb.append(webResourceRequest.getUrl());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            m16985a(webView);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        m16985a(webView);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26 || !(webView instanceof C6337q)) {
            return false;
        }
        C6238hu.m18605a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        webView.destroy();
        return true;
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f14521c) {
            this.f14521c = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34425a(View view) {
        this.f14522d.set(true);
        view.postDelayed(new Runnable() {
            public final void run() {
                C5758aa.this.f14522d.set(false);
            }
        }, 1000);
    }

    /* renamed from: a */
    private void m16985a(WebView webView) {
        int i = this.f14520b;
        if (-1 == i) {
            return;
        }
        if (i > 0) {
            this.f14520b = i - 1;
        } else if (!this.f14519a) {
            new Handler(Looper.getMainLooper()).post(new C6336p(webView));
            this.f14519a = true;
            if (webView instanceof C6337q) {
                ((C6337q) webView).mo35625g();
            }
        }
    }
}
