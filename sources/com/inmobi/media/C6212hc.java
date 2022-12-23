package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.inmobi.media.hc */
/* compiled from: WebViewNetworkTask */
public class C6212hc {

    /* renamed from: d */
    private static final String f15735d = C6212hc.class.getSimpleName();

    /* renamed from: a */
    public C6206gx f15736a;

    /* renamed from: b */
    public WebViewClient f15737b;

    /* renamed from: c */
    public C6213a f15738c;

    public C6212hc(C6206gx gxVar, WebViewClient webViewClient) {
        this.f15737b = webViewClient;
        this.f15736a = gxVar;
    }

    /* renamed from: com.inmobi.media.hc$a */
    /* compiled from: WebViewNetworkTask */
    public class C6213a extends WebView {

        /* renamed from: a */
        public boolean f15739a;

        public C6213a(Context context) {
            super(context);
        }

        public final void destroy() {
            this.f15739a = true;
            super.destroy();
        }
    }
}
