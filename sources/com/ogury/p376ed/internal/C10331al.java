package com.ogury.p376ed.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.al */
public final class C10331al {

    /* renamed from: a */
    public static final C10332a f26194a = new C10332a((byte) 0);

    /* renamed from: b */
    private final C10618id f26195b;

    /* renamed from: c */
    private final C10589hj f26196c;

    /* renamed from: d */
    private final C10643iv f26197d;

    /* renamed from: e */
    private C10660jh f26198e;

    public /* synthetic */ C10331al(C10618id idVar, C10589hj hjVar, C10643iv ivVar, byte b) {
        this(idVar, hjVar, ivVar);
    }

    private C10331al(C10618id idVar, C10589hj hjVar, C10643iv ivVar) {
        this.f26195b = idVar;
        this.f26196c = hjVar;
        this.f26197d = ivVar;
    }

    /* renamed from: com.ogury.ed.internal.al$a */
    public static final class C10332a {
        public /* synthetic */ C10332a(byte b) {
            this();
        }

        private C10332a() {
        }

        /* renamed from: a */
        public static C10331al m31284a(C10595ho hoVar, C10643iv ivVar) {
            C10765mq.m32773b(hoVar, "multiWebViewBrowser");
            C10765mq.m32773b(ivVar, "foregroundHandlerFactory");
            return new C10331al(C10618id.f26806a, hoVar.mo67547a(), ivVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C10660jh mo67078a(C10483eb ebVar) {
        C10765mq.m32773b(ebVar, "ad");
        C10660jh b = m31281b(ebVar);
        if (b == null) {
            return null;
        }
        this.f26198e = b;
        m31278a();
        m31280a(this.f26198e);
        m31282b();
        return this.f26198e;
    }

    /* renamed from: b */
    private static C10660jh m31281b(C10483eb ebVar) {
        return C10618id.m32368b(ebVar.mo67214a());
    }

    /* renamed from: a */
    private final void m31278a() {
        C10660jh jhVar = this.f26198e;
        if (jhVar != null) {
            jhVar.setMraidUrlHandler(new C10641iu(new C10589hj[]{this.f26196c, this.f26197d.mo67656a(jhVar)}));
            WebSettings settings = jhVar.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView = jhVar;
            C10566gr.m32109c(webView);
            C10566gr.m32108b(webView);
        }
    }

    /* renamed from: com.ogury.ed.internal.al$b */
    public static final class C10333b extends C10661ji {

        /* renamed from: a */
        final /* synthetic */ C10331al f26199a;

        C10333b(C10331al alVar) {
            this.f26199a = alVar;
        }

        /* renamed from: a */
        public final void mo67079a(WebView webView) {
            C10765mq.m32773b(webView, "webView");
            this.f26199a.m31282b();
        }
    }

    /* renamed from: a */
    private final void m31280a(C10660jh jhVar) {
        if (jhVar != null) {
            jhVar.setClientAdapter(new C10333b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31282b() {
        C10660jh jhVar = this.f26198e;
        if (jhVar != null) {
            jhVar.mo67690c();
        }
    }
}
