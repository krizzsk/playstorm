package com.inmobi.media;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: com.inmobi.media.ab */
/* compiled from: EmbeddedBrowserViewClient */
public final class C5760ab extends C5758aa {
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        String uri = webResourceRequest.getUrl().toString();
        if (webView != null) {
            return m16989a(webView, uri);
        }
        return false;
    }

    /* renamed from: a */
    private static void m16988a(String str) {
        if (C6236hs.m18598a(Uri.parse(str))) {
            try {
                Thread.sleep(1000);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m16987a(C6363y yVar) {
        C6358t userLeftApplicationListener;
        ViewParent parent = yVar.getParent();
        if ((parent instanceof C6359u) && (userLeftApplicationListener = ((C6359u) parent).getUserLeftApplicationListener()) != null) {
            userLeftApplicationListener.mo34495a_();
        }
    }

    /* renamed from: b */
    private static void m16990b(C6363y yVar) {
        ViewParent parent = yVar.getParent();
        if (parent instanceof C6359u) {
            ((C6359u) parent).mo35725a();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null) {
            return false;
        }
        return m16989a(webView, str);
    }

    /* renamed from: a */
    private boolean m16989a(WebView webView, String str) {
        boolean z = true;
        if (this.f14522d.get()) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        C6223hk.m18526a();
        if (!C6223hk.m18528a(webView.getContext(), str)) {
            if (C6236hs.m18598a(parse)) {
                return false;
            }
            C6224hl.m18530a();
            if (!C6224hl.m18531a(webView.getContext(), str)) {
                m16988a(str);
                z = false;
            }
        }
        if (z) {
            mo34425a((View) webView);
            boolean z2 = webView instanceof C6363y;
            if (z2) {
                m16987a((C6363y) webView);
            }
            if (!C6236hs.m18599a(str)) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else if (z2) {
                    m16990b((C6363y) webView);
                }
            }
        }
        return z;
    }
}
