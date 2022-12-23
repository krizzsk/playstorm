package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.trusted.sharing.ShareTarget;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5319d;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.web.n */
public class C5428n extends WebViewClient {

    /* renamed from: a */
    public final boolean f14375a;

    /* renamed from: b */
    public final int f14376b;

    /* renamed from: c */
    public final int f14377c;

    /* renamed from: d */
    public final int f14378d;

    /* renamed from: e */
    public C5404b f14379e;

    public C5428n(C5404b bVar, boolean z, int i, int i2, int i3) {
        this.f14379e = bVar;
        this.f14375a = z;
        this.f14376b = i;
        this.f14377c = i2;
        this.f14378d = i3;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m16702d("Resources to load: %s", str);
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s %s", "RESOURCES", str);
        C5404b bVar = this.f14379e;
        if (bVar != null) {
            C5396a aVar = (C5396a) bVar;
            aVar.getClass();
            if (!TextUtils.isEmpty(str) && str.startsWith("http://") && !C5368r.m16780a()) {
                IAlog.m16699a("%s Found a portential unsecure resource url: %s", IAlog.m16696a((Object) aVar), str);
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.m16702d("onPageFinished - url: %s", str);
        C5404b bVar = this.f14379e;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.m16702d("onPageStarted - url: %s", str);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.m16699a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.m16699a("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        C5396a aVar = (C5396a) this.f14379e;
        L l = aVar.f14285g;
        if (l != null) {
            l.mo24962a();
        }
        aVar.mo26504a(true);
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.f14375a && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.m16702d("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            C5433r rVar = C5433r.f14386c;
            int i = this.f14376b;
            int i2 = this.f14377c;
            int i3 = this.f14378d;
            rVar.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), ShareTarget.METHOD_GET)) {
                C5434s sVar = (C5434s) rVar.f14387a.get(new C5435t(webResourceRequest));
                if (sVar != null) {
                    webResourceResponse = sVar.mo26593b();
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer b = C5319d.f14156b.mo26442b();
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                C5433r.m16887a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            C5434s sVar2 = null;
                            while (i3 > 0) {
                                try {
                                    sVar2 = C5433r.m16886a(httpURLConnection, b);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (sVar2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (sVar2 != null) {
                                try {
                                    if (sVar2.mo26592a()) {
                                        rVar.f14387a.put(new C5435t(webResourceRequest), sVar2);
                                    }
                                    webResourceResponse = sVar2.mo26593b();
                                    httpURLConnection.disconnect();
                                    C5319d.f14156b.f14157a.offer(b);
                                } catch (Throwable unused6) {
                                }
                            }
                            httpURLConnection.disconnect();
                            C5319d.f14156b.f14157a.offer(b);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.m16702d("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        C5404b bVar = this.f14379e;
        return bVar != null && ((IAmraidWebViewController) bVar).mo26417a(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m16702d("%sError: code = %d text = %s WebView = %s", IAlog.m16696a((Object) this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
        C5404b bVar = this.f14379e;
        if (bVar != null) {
            bVar.getClass();
        }
    }
}
