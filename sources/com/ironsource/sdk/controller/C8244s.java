package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.s */
final class C8244s {

    /* renamed from: a */
    private C8245t f19714a;

    /* renamed from: b */
    private boolean f19715b = false;

    C8244s(C8245t tVar) {
        this.f19714a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f19715b) {
            return "";
        }
        this.f19715b = true;
        return this.f19714a.f19716a;
    }
}
