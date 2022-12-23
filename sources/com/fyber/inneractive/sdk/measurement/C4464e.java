package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.measurement.e */
public class C4464e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4465f f11006a;

    public C4464e(C4465f fVar) {
        this.f11006a = fVar;
    }

    public void run() {
        IAlog.m16699a("clearing webview", new Object[0]);
        WebView webView = this.f11006a.f11011e;
        if (webView != null) {
            webView.destroy();
            this.f11006a.f11011e = null;
        }
    }
}
