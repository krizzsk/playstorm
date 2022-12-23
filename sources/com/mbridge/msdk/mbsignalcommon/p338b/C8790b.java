package com.mbridge.msdk.mbsignalcommon.p338b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.C8821d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.b */
/* compiled from: DefaultWebViewListener */
public class C8790b implements C8821d {
    /* renamed from: a */
    public final void mo57903a(WebView webView, String str, Bitmap bitmap) {
        C8608u.m24880a("WindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo57905b(WebView webView, String str) {
        C8608u.m24880a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo57900a(WebView webView, int i, String str, String str2) {
        C8608u.m24880a("WindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C8608u.m24880a("WindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo57902a(WebView webView, String str) {
        C8608u.m24880a("WindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo57904b(WebView webView, int i) {
        C8608u.m24880a("WindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo57899a(WebView webView, int i) {
        C8608u.m24880a("WindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public void mo57906c(WebView webView, int i) {
        C8608u.m24880a("WindVaneWebView", "loadingResourceStatus");
    }
}
