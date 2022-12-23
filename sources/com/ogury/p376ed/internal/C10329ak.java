package com.ogury.p376ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ak */
public final class C10329ak {

    /* renamed from: a */
    public static final C10330a f26192a = new C10330a((byte) 0);

    /* renamed from: b */
    private final C10671js f26193b;

    public C10329ak(C10671js jsVar) {
        C10765mq.m32773b(jsVar, "omidTracker");
        this.f26193b = jsVar;
    }

    /* renamed from: com.ogury.ed.internal.ak$a */
    public static final class C10330a {
        public /* synthetic */ C10330a(byte b) {
            this();
        }

        private C10330a() {
        }

        /* renamed from: a */
        public static C10329ak m31277a() {
            return new C10329ak(new C10671js());
        }
    }

    /* renamed from: a */
    public final void mo67077a(C10530fm fmVar, C10483eb ebVar, WebView webView) {
        C10765mq.m32773b(fmVar, "profig");
        C10765mq.m32773b(ebVar, "ad");
        C10765mq.m32773b(webView, "webView");
        if (fmVar.mo67420c() && ebVar.mo67254o()) {
            this.f26193b.mo67734a(ebVar.mo67256p(), webView);
        }
    }

    /* renamed from: a */
    public final void mo67076a() {
        this.f26193b.mo67733a();
    }
}
