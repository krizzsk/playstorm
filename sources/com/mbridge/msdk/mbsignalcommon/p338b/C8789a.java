package com.mbridge.msdk.mbsignalcommon.p338b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.C8819b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.a */
/* compiled from: DefaultRVWebViewListener */
public class C8789a implements C8819b {
    /* renamed from: a */
    public void mo58185a(Object obj) {
        C8608u.m24880a("RVWindVaneWebView", "getEndScreenInfo");
    }

    /* renamed from: a */
    public void mo58184a(WebView webView, String str, String str2, int i, int i2) {
        C8608u.m24880a("RVWindVaneWebView", "loadAds");
    }

    /* renamed from: a */
    public void mo58186a(Object obj, String str) {
        C8608u.m24880a("RVWindVaneWebView", "operateComponent");
    }

    /* renamed from: a */
    public final void mo57903a(WebView webView, String str, Bitmap bitmap) {
        C8608u.m24880a("RVWindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo57905b(WebView webView, String str) {
        C8608u.m24880a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo57900a(WebView webView, int i, String str, String str2) {
        C8608u.m24880a("RVWindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C8608u.m24880a("RVWindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo57902a(WebView webView, String str) {
        C8608u.m24880a("RVWindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo57904b(WebView webView, int i) {
        C8608u.m24880a("RVWindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo57899a(WebView webView, int i) {
        C8608u.m24880a("RVWindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public final void mo57906c(WebView webView, int i) {
        C8608u.m24880a("RVWindVaneWebView", "loadingResourceStatus");
    }
}
