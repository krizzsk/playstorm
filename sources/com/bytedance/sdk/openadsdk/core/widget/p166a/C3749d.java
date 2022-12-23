package com.bytedance.sdk.openadsdk.core.widget.p166a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.d */
/* compiled from: TTWebViewClient */
public class C3749d extends SSWebView.C2992a {

    /* renamed from: i */
    private static final HashSet<String> f9738i;

    /* renamed from: a */
    private boolean f9739a = false;

    /* renamed from: b */
    private AtomicBoolean f9740b = new AtomicBoolean(false);

    /* renamed from: c */
    protected final C3728w f9741c;

    /* renamed from: d */
    protected final Context f9742d;

    /* renamed from: e */
    protected final String f9743e;

    /* renamed from: f */
    protected C3171n f9744f;

    /* renamed from: g */
    protected boolean f9745g = true;

    /* renamed from: h */
    protected boolean f9746h = true;

    public C3749d(Context context, C3728w wVar, String str, C3171n nVar, boolean z) {
        this.f9742d = context;
        this.f9741c = wVar;
        this.f9743e = str;
        this.f9744f = nVar;
        this.f9739a = z;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C3171n nVar = this.f9744f;
        if (nVar != null) {
            nVar.mo18782a(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C2975l.m8384b("WebChromeClient", "shouldOverrideUrlLoading " + str);
        try {
            Uri parse = Uri.parse(str);
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                C3999i.m13114a(parse, this.f9741c);
                return true;
            } else if (mo20542a(str)) {
                return true;
            } else {
                if (!C2979o.m8407a(str)) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.f9742d.startActivity(intent);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        } catch (Throwable th) {
            C2975l.m8385b("WebChromeClient", "shouldOverrideUrlLoading", th);
            C3728w wVar = this.f9741c;
            if (wVar != null && wVar.mo20456d()) {
                return true;
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (C2975l.m8381a()) {
            C2975l.m8378a("WebChromeClient", "onPageFinished " + str);
        }
        C3171n nVar = this.f9744f;
        if (nVar != null) {
            nVar.mo18784a(webView, str, this.f9739a);
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C3171n nVar = this.f9744f;
        if (nVar != null) {
            nVar.mo18783a(webView, str, bitmap);
        }
        if (this.f9746h) {
            C3747b.m12300a(this.f9742d).mo20536a(Build.VERSION.SDK_INT >= 19).mo20538b(webView.getSettings().getBuiltInZoomControls()).mo20537a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C3171n nVar = this.f9744f;
        if (nVar != null) {
            nVar.mo18781a(webView, i, str, str2, m12307b(str2));
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f9744f != null && webResourceError != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f9744f.mo18781a(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f9744f != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f9744f.mo18781a(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f9744f != null) {
            int i = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i = sslError.getPrimaryError();
                    str = "SslError: " + String.valueOf(sslError);
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f9744f.mo18781a(webView, i, str, str3, m12307b(str3));
        }
    }

    /* renamed from: a */
    public boolean mo20542a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.f9742d.startActivity(intent);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f9738i = hashSet;
        hashSet.add("png");
        f9738i.add("ico");
        f9738i.add("jpg");
        f9738i.add("gif");
        f9738i.add("svg");
        f9738i.add("jpeg");
    }

    /* renamed from: b */
    protected static String m12307b(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !f9738i.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/" + substring;
    }
}
