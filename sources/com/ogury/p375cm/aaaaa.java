package com.ogury.p375cm;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.core.OguryError;
import com.ogury.p375cm.internal.abaac;
import com.ogury.p375cm.internal.abbbb;
import com.ogury.p375cm.internal.babca;
import com.ogury.p375cm.internal.bbabc;

/* renamed from: com.ogury.cm.aaaaa */
public final class aaaaa extends WebViewClient {

    /* renamed from: a */
    private abaac f25538a = new abaac();

    /* renamed from: b */
    private boolean f25539b;

    /* renamed from: c */
    private Context f25540c;

    /* renamed from: d */
    private final abbbb f25541d;

    public aaaaa(Context context, abbbb abbbb) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(abbbb, "consentCallback");
        this.f25540c = context;
        this.f25541d = abbbb;
    }

    /* renamed from: a */
    private final void m30528a(String str) {
        if (!this.f25539b) {
            this.f25539b = true;
            abbbb abbbb = this.f25541d;
            if (str == null) {
                str = "";
            }
            abbbb.mo66485a(new OguryError(1003, str));
            Context context = this.f25540c;
            if (!(context instanceof ConsentActivity)) {
                return;
            }
            if (context != null) {
                ((ConsentActivity) context).finish();
                return;
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.ConsentActivity");
        }
    }

    /* renamed from: a */
    private final boolean m30529a(String str, WebView webView) {
        if (this.f25539b) {
            return true;
        }
        this.f25538a.mo66546a(str, this.f25540c, this.f25541d, webView);
        return true;
    }

    /* renamed from: a */
    public final void mo66478a(Context context) {
        bbabc.m30943b(context, "context");
        this.f25540c = context;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m30528a(str);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        bbabc.m30943b(webView, "view");
        bbabc.m30943b(webResourceRequest, "request");
        bbabc.m30943b(webResourceError, "error");
        m30528a(webResourceError.getDescription().toString());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m30943b(webView, "view");
        bbabc.m30943b(webResourceRequest, "request");
        return null;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        bbabc.m30943b(webView, "view");
        bbabc.m30943b(str, "url");
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m30943b(webView, "view");
        bbabc.m30943b(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        bbabc.m30940a((Object) uri, "request.url.toString()");
        return m30529a(uri, webView);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        bbabc.m30943b(webView, "view");
        bbabc.m30943b(str, "url");
        return m30529a(str, webView);
    }
}
