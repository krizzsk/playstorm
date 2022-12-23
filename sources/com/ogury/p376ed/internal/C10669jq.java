package com.ogury.p376ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;

/* renamed from: com.ogury.ed.internal.jq */
public final class C10669jq {

    /* renamed from: a */
    private AdSession f26927a;

    /* renamed from: b */
    private C10670jr f26928b = new C10670jr();

    /* renamed from: a */
    public final void mo67732a(WebView webView, boolean z) {
        C10765mq.m32773b(webView, "adWebView");
        AdSession a = C10670jr.m32622a(webView, z);
        this.f26927a = a;
        if (a != null) {
            a.start();
        }
    }

    /* renamed from: a */
    public final void mo67731a() {
        AdSession adSession = this.f26927a;
        if (adSession != null) {
            adSession.finish();
        }
    }
}
