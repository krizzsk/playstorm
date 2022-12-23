package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.mbsignalcommon.windvane.C8821d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.b */
/* compiled from: BaseWebViewClient */
public class C8794b extends WebViewClient {

    /* renamed from: a */
    private C8793a f21388a;

    /* renamed from: b */
    private C8821d f21389b;

    /* renamed from: a */
    public final void mo58207a(C8793a aVar) {
        this.f21388a = aVar;
    }

    /* renamed from: b */
    public final C8793a mo58209b() {
        return this.f21388a;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C8793a aVar = this.f21388a;
        if (aVar != null && aVar.mo58206a(str)) {
            return true;
        }
        C8821d dVar = this.f21389b;
        if (dVar != null) {
            dVar.mo57905b(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C8821d dVar = this.f21389b;
        if (dVar != null) {
            dVar.mo57900a(webView, i, str, str2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C8821d dVar = this.f21389b;
        if (dVar != null) {
            dVar.mo57901a(webView, sslErrorHandler, sslError);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C8821d dVar = this.f21389b;
        if (dVar != null) {
            dVar.mo57902a(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo58208a(C8821d dVar) {
        this.f21389b = dVar;
    }
}
