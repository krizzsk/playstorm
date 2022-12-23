package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.utils.k */
/* compiled from: LoadUrlUtils */
public class C2971k {

    /* renamed from: a */
    private static final C2973a f6738a;

    /* renamed from: com.bytedance.sdk.component.utils.k$a */
    /* compiled from: LoadUrlUtils */
    private static class C2973a {
        private C2973a() {
        }

        /* renamed from: a */
        public void mo17894a(WebView webView, String str) {
            if (webView != null) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.k$b */
    /* compiled from: LoadUrlUtils */
    private static class C2974b extends C2973a {
        private C2974b() {
            super();
        }

        /* renamed from: a */
        public void mo17894a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, (ValueCallback) null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        webView.loadUrl(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f6738a = new C2974b();
        } else {
            f6738a = new C2973a();
        }
    }

    /* renamed from: a */
    public static void m8372a(WebView webView, String str) {
        f6738a.mo17894a(webView, str);
    }
}
