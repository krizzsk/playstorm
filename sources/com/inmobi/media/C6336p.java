package com.inmobi.media;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.p */
/* compiled from: NetworkBlocker */
public final class C6336p implements Runnable {

    /* renamed from: a */
    private WeakReference<WebView> f16048a;

    public C6336p(WebView webView) {
        this.f16048a = new WeakReference<>(webView);
    }

    public final void run() {
        WebView webView = (WebView) this.f16048a.get();
        if (webView != null) {
            webView.getSettings().setBlockNetworkLoads(true);
        }
    }
}
