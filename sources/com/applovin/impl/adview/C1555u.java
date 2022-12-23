package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.u */
public class C1555u extends WebViewClient {

    /* renamed from: a */
    private final C2092v f1972a;

    /* renamed from: b */
    private WeakReference<C1556a> f1973b;

    /* renamed from: com.applovin.impl.adview.u$a */
    public interface C1556a {
        /* renamed from: a */
        void mo12838a(C1554t tVar);

        /* renamed from: b */
        void mo12839b(C1554t tVar);

        /* renamed from: c */
        void mo12840c(C1554t tVar);
    }

    public C1555u(C1959m mVar) {
        this.f1972a = mVar.mo14286A();
    }

    /* renamed from: a */
    private void m2877a(WebView webView, String str) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1972a;
            vVar.mo14791c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof C1554t)) {
            C1554t tVar = (C1554t) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            C1556a aVar = (C1556a) this.f1973b.get();
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.mo12838a(tVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.mo12839b(tVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.mo12840c(tVar);
                } else if (C2092v.m5047a()) {
                    C2092v vVar2 = this.f1972a;
                    vVar2.mo14792d("WebViewButtonClient", "Unknown URL: " + str);
                    C2092v vVar3 = this.f1972a;
                    vVar3.mo14792d("WebViewButtonClient", "Path: " + path);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13021a(WeakReference<C1556a> weakReference) {
        this.f1973b = weakReference;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m2877a(webView, str);
        return true;
    }
}
