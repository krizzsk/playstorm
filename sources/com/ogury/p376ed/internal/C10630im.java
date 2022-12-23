package com.ogury.p376ed.internal;

import android.webkit.WebView;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.im */
public final class C10630im implements C10635iq {

    /* renamed from: a */
    private final C10660jh f26833a;

    /* renamed from: b */
    private final C10483eb f26834b;

    /* renamed from: c */
    private C10629il f26835c;

    /* renamed from: d */
    private final Pattern f26836d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f26837e;

    public C10630im(C10660jh jhVar, C10483eb ebVar) {
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        this.f26833a = jhVar;
        this.f26834b = ebVar;
        this.f26836d = Pattern.compile(ebVar.mo67261t());
        m32419c();
    }

    /* renamed from: com.ogury.ed.internal.im$a */
    public static final class C10631a extends C10623ih {

        /* renamed from: a */
        final /* synthetic */ C10630im f26838a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10631a(C10630im imVar, Pattern pattern) {
            super(pattern);
            this.f26838a = imVar;
            C10765mq.m32770a((Object) pattern, "whitelistPattern");
        }

        /* renamed from: a */
        public final void mo67631a() {
            this.f26838a.m32420d();
        }

        /* renamed from: b */
        public final void mo67560b(WebView webView, String str) {
            C10765mq.m32773b(webView, "webView");
            C10765mq.m32773b(str, "url");
            this.f26838a.f26837e = true;
            this.f26838a.m32420d();
        }

        /* renamed from: b */
        public final void mo67632b() {
            this.f26838a.m32420d();
        }
    }

    /* renamed from: c */
    private final void m32419c() {
        this.f26833a.setClientAdapter(new C10631a(this, this.f26836d));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32420d() {
        C10629il ilVar = this.f26835c;
        if (ilVar != null) {
            ilVar.mo67633a();
        }
        m32421e();
        C10566gr.m32112f(this.f26833a);
    }

    /* renamed from: e */
    private final void m32421e() {
        C10660jh jhVar = this.f26833a;
        Pattern pattern = this.f26836d;
        C10765mq.m32770a((Object) pattern, "whitelistPattern");
        jhVar.setClientAdapter(new C10623ih(pattern));
    }

    /* renamed from: a */
    public final void mo67628a(C10629il ilVar) {
        C10765mq.m32773b(ilVar, "loadCallback");
        this.f26835c = ilVar;
        if (this.f26834b.mo67260s()) {
            this.f26833a.getSettings().setJavaScriptEnabled(false);
        }
        this.f26833a.loadUrl(this.f26834b.mo67259r());
    }

    /* renamed from: b */
    public final void mo67630b() {
        this.f26835c = null;
        m32421e();
        C10566gr.m32112f(this.f26833a);
    }

    /* renamed from: a */
    public final boolean mo67629a() {
        return this.f26837e;
    }
}
