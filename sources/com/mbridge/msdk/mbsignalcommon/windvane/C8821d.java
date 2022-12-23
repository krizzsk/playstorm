package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.d */
/* compiled from: IWebViewListener */
public interface C8821d {
    /* renamed from: a */
    void mo57899a(WebView webView, int i);

    /* renamed from: a */
    void mo57900a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo57901a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo57902a(WebView webView, String str);

    /* renamed from: a */
    void mo57903a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    void mo57904b(WebView webView, int i);

    /* renamed from: b */
    boolean mo57905b(WebView webView, String str);

    /* renamed from: c */
    void mo57906c(WebView webView, int i);
}
