package com.bytedance.sdk.component.adexpress.p097d;

import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2601c;
import com.bytedance.sdk.component.p090a.C2596z;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.d.e */
/* compiled from: WebViewPool */
public class C2650e {

    /* renamed from: d */
    private static final byte[] f5724d = new byte[0];

    /* renamed from: e */
    private static int f5725e = 10;

    /* renamed from: g */
    private static volatile C2650e f5726g;

    /* renamed from: a */
    private List<SSWebView> f5727a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, C2648c> f5728b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C2649d> f5729c = new HashMap();

    /* renamed from: f */
    private final AtomicBoolean f5730f = new AtomicBoolean(false);

    private C2650e() {
        C2601c c = C2599a.m6611a().mo16628c();
        if (c != null) {
            f5725e = c.mo16644j();
        }
    }

    /* renamed from: a */
    public static C2650e m6932a() {
        if (f5726g == null) {
            synchronized (C2650e.class) {
                if (f5726g == null) {
                    f5726g = new C2650e();
                }
            }
        }
        return f5726g;
    }

    /* renamed from: b */
    public SSWebView mo16861b() {
        SSWebView remove;
        if (mo16865d() <= 0 || (remove = this.f5727a.remove(0)) == null) {
            return null;
        }
        C2975l.m8384b("WebViewPool", "get WebView from pool; current available count: " + mo16865d());
        return remove;
    }

    /* renamed from: a */
    public void mo16859a(SSWebView sSWebView) {
        if (sSWebView != null) {
            m6933e(sSWebView);
            sSWebView.mo17931b("SDK_INJECT_GLOBAL");
            mo16866d(sSWebView);
            mo16862b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo16862b(SSWebView sSWebView) {
        if (sSWebView != null) {
            if (this.f5727a.size() >= f5725e) {
                C2975l.m8384b("WebViewPool", "WebView pool is full，destroy webview");
                sSWebView.mo17952l();
            } else if (!this.f5727a.contains(sSWebView)) {
                this.f5727a.add(sSWebView);
                C2975l.m8384b("WebViewPool", "recycle WebView，current available count: " + mo16865d());
            }
        }
    }

    /* renamed from: c */
    public boolean mo16864c(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        C2975l.m8384b("WebViewPool", "WebView render fail and abandon");
        sSWebView.mo17952l();
        return true;
    }

    /* renamed from: c */
    public void mo16863c() {
        for (SSWebView next : this.f5727a) {
            if (next != null) {
                next.mo17952l();
            }
        }
        this.f5727a.clear();
    }

    /* renamed from: d */
    public int mo16865d() {
        return this.f5727a.size();
    }

    /* renamed from: e */
    public int mo16867e() {
        return this.f5727a.size();
    }

    /* renamed from: e */
    private void m6933e(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.mo17932c();
        sSWebView.setWebChromeClient((WebChromeClient) null);
        sSWebView.setWebViewClient((WebViewClient) null);
        sSWebView.setDownloadListener((DownloadListener) null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setUserAgentString("android_client");
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    /* renamed from: a */
    public void mo16860a(SSWebView sSWebView, C2647b bVar) {
        if (sSWebView != null && bVar != null) {
            C2648c cVar = this.f5728b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo16841a(bVar);
            } else {
                cVar = new C2648c(bVar);
                this.f5728b.put(Integer.valueOf(sSWebView.hashCode()), cVar);
            }
            sSWebView.mo17924a((Object) cVar, "SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: d */
    public void mo16866d(SSWebView sSWebView) {
        if (sSWebView != null) {
            C2648c cVar = this.f5728b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo16841a((C2647b) null);
            }
            sSWebView.mo17931b("SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: a */
    public void mo16857a(WebView webView, C2596z zVar, String str) {
        if (webView != null && zVar != null && !TextUtils.isEmpty(str)) {
            C2649d dVar = this.f5729c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo16855a(zVar);
            } else {
                dVar = new C2649d(zVar);
                this.f5729c.put(Integer.valueOf(webView.hashCode()), dVar);
            }
            webView.addJavascriptInterface(dVar, str);
        }
    }

    /* renamed from: a */
    public void mo16858a(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            C2649d dVar = this.f5729c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo16855a((C2596z) null);
            }
            webView.removeJavascriptInterface(str);
        }
    }
}
