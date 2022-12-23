package com.ogury.p376ed.internal;

import android.os.Build;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.io.File;

/* renamed from: com.ogury.ed.internal.gr */
public final class C10566gr {
    /* renamed from: a */
    public static final void m32105a(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        webView.getSettings().setAppCacheEnabled(true);
        File cacheDir = webView.getContext().getCacheDir();
        String absolutePath = cacheDir == null ? null : cacheDir.getAbsolutePath();
        if (absolutePath != null) {
            webView.getSettings().setAppCachePath(absolutePath);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
    }

    /* renamed from: b */
    public static final void m32108b(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setScrollContainer(false);
    }

    /* renamed from: c */
    public static final void m32109c(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    /* renamed from: d */
    public static final void m32110d(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.setWebChromeClient(new C10567a());
    }

    /* renamed from: com.ogury.ed.internal.gr$a */
    public static final class C10567a extends WebChromeClient {
        C10567a() {
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C10765mq.m32773b(webView, "view");
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            CharSequence extra = hitTestResult == null ? null : hitTestResult.getExtra();
            if (!(extra == null || C10814oc.m32840a(extra))) {
                webView.loadUrl(webView.getHitTestResult().getExtra());
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m32106a(WebView webView, C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(webView, "<this>");
        C10765mq.m32773b(ljVar, "callback");
        if (webView.getHeight() > 0 || webView.getWidth() > 0) {
            ljVar.mo67074a();
        } else {
            webView.post(new Runnable() {
                public final void run() {
                    C10566gr.m32107a(C10729lj.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m32107a(C10729lj ljVar) {
        C10765mq.m32773b(ljVar, "$callback");
        ljVar.mo67074a();
    }

    /* renamed from: e */
    public static final boolean m32111e(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        if (Build.VERSION.SDK_INT >= 19) {
            return webView.isAttachedToWindow();
        }
        return webView.getParent() != null;
    }

    /* renamed from: f */
    public static final void m32112f(WebView webView) {
        C10765mq.m32773b(webView, "<this>");
        if (!m32111e(webView)) {
            webView.destroy();
        }
    }
}
