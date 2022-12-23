package com.ogury.p376ed.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ik */
public final class C10627ik implements C10635iq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10660jh f26825a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10483eb f26826b;

    /* renamed from: c */
    private final C10618id f26827c;

    /* renamed from: d */
    private final C10622ig f26828d;

    /* renamed from: e */
    private C10629il f26829e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f26830f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f26831g;

    public C10627ik(C10660jh jhVar, C10483eb ebVar, C10618id idVar, C10622ig igVar) {
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        C10765mq.m32773b(idVar, "webViewCache");
        C10765mq.m32773b(igVar, "presageAdGateway");
        this.f26825a = jhVar;
        this.f26826b = ebVar;
        this.f26827c = idVar;
        this.f26828d = igVar;
        m32396c();
    }

    /* renamed from: com.ogury.ed.internal.ik$a */
    public static final class C10628a extends C10661ji {

        /* renamed from: a */
        final /* synthetic */ C10627ik f26832a;

        C10628a(C10627ik ikVar) {
            this.f26832a = ikVar;
        }

        /* renamed from: a */
        public final void mo67631a() {
            C10627ik.m32395b(this.f26832a.f26825a, this.f26832a.f26826b);
            this.f26832a.m32398d();
        }

        /* renamed from: b */
        public final void mo67560b(WebView webView, String str) {
            C10765mq.m32773b(webView, "webView");
            C10765mq.m32773b(str, "url");
            this.f26832a.f26830f = true;
            this.f26832a.m32404g();
        }

        /* renamed from: b */
        public final void mo67632b() {
            if (!this.f26832a.f26830f) {
                this.f26832a.m32400e();
            }
        }

        /* renamed from: a */
        public final void mo67079a(WebView webView) {
            C10765mq.m32773b(webView, "webView");
            this.f26832a.f26831g = true;
            this.f26832a.m32404g();
        }
    }

    /* renamed from: c */
    private final void m32396c() {
        this.f26825a.setClientAdapter(new C10628a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32398d() {
        C10629il ilVar = this.f26829e;
        if (ilVar != null) {
            ilVar.mo67634a(this.f26826b);
        }
        m32402f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m32400e() {
        C10445di diVar = C10445di.f26411a;
        C10445di.m31608a((C10444dh) new C10455dl("loaded_error", this.f26826b));
        C10629il ilVar = this.f26829e;
        if (ilVar != null) {
            ilVar.mo67635b();
        }
        m32402f();
    }

    /* renamed from: f */
    private final void m32402f() {
        this.f26825a.setWebViewClient((WebViewClient) null);
        this.f26825a.setClientAdapter((C10661ji) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m32404g() {
        if (this.f26831g && this.f26830f) {
            C10445di diVar = C10445di.f26411a;
            C10445di.m31608a((C10444dh) new C10455dl(TJAdUnitConstants.String.VIDEO_LOADED, this.f26826b));
            C10618id.m32365a(new C10617ic(new WeakReference(this.f26828d), this.f26825a, this.f26826b));
            C10629il ilVar = this.f26829e;
            if (ilVar != null) {
                ilVar.mo67633a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m32395b(WebView webView, C10483eb ebVar) {
        C10566gr.m32112f(webView);
        C10445di diVar = C10445di.f26411a;
        C10445di.m31608a((C10444dh) new C10455dl("loaded_error", ebVar));
    }

    /* renamed from: a */
    public final void mo67628a(C10629il ilVar) {
        C10765mq.m32773b(ilVar, "loadCallback");
        this.f26829e = ilVar;
        C10663jk.m32605a(this.f26825a, this.f26826b);
    }

    /* renamed from: a */
    public final boolean mo67629a() {
        return this.f26830f;
    }

    /* renamed from: b */
    public final void mo67630b() {
        this.f26829e = null;
        m32402f();
        C10566gr.m32112f(this.f26825a);
    }
}
