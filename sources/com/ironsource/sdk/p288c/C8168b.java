package com.ironsource.sdk.p288c;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.c.b */
public final class C8168b {

    /* renamed from: a */
    private C8169c f19477a;

    C8168b(C8169c cVar) {
        this.f19477a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f19477a.handleMessageFromAd(str);
    }
}
