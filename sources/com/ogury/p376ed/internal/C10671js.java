package com.ogury.p376ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.js */
public final class C10671js {

    /* renamed from: a */
    private final C10668jp f26929a;

    /* renamed from: b */
    private C10669jq f26930b;

    public /* synthetic */ C10671js() {
        this(C10668jp.f26926a);
    }

    private C10671js(C10668jp jpVar) {
        C10765mq.m32773b(jpVar, "omidSdk");
        this.f26929a = jpVar;
    }

    /* renamed from: a */
    public final void mo67734a(boolean z, WebView webView) {
        C10765mq.m32773b(webView, "webView");
        if (C10668jp.m32618a()) {
            C10669jq b = C10668jp.m32619b();
            this.f26930b = b;
            if (b != null) {
                b.mo67732a(webView, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo67733a() {
        C10669jq jqVar;
        if (C10668jp.m32618a() && (jqVar = this.f26930b) != null) {
            jqVar.mo67731a();
        }
    }
}
