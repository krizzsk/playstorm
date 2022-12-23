package com.ogury.p376ed.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.ogury.ed.internal.gq */
public abstract class C10565gq extends WebViewClient {
    /* renamed from: a */
    public WebResourceResponse mo67497a(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        return null;
    }

    /* renamed from: b */
    public boolean mo67499b(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        return mo67497a(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C10765mq.m32770a((Object) uri, "request.url.toString()");
        return mo67497a(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        C10765mq.m32770a((Object) uri, "request.url.toString()");
        return mo67499b(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        return mo67499b(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        mo67498a(i, str, str2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(webResourceRequest, "request");
        C10765mq.m32773b(webResourceError, "error");
        mo67498a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    /* renamed from: a */
    public void mo67498a(int i, String str, String str2) {
        String str3 = "onReceivedError: " + i + " description: " + str + " failingUrl: " + str2;
        C10548ga gaVar = C10548ga.f26676a;
        C10548ga.m32072a(str3);
    }
}
