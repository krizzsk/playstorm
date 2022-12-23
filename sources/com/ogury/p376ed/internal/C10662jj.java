package com.ogury.p376ed.internal;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.jj */
public final class C10662jj extends C10590hk {

    /* renamed from: b */
    private final C10660jh f26919b;

    /* renamed from: c */
    private C10661ji f26920c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10662jj(C10660jh jhVar) {
        super((byte) 0);
        C10765mq.m32773b(jhVar, "mraidWebView");
        this.f26919b = jhVar;
    }

    /* renamed from: a */
    public final void mo67724a(C10661ji jiVar) {
        this.f26920c = jiVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        C10661ji jiVar = this.f26920c;
        if (jiVar != null) {
            jiVar.mo67559a(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        C10661ji jiVar = this.f26920c;
        if (jiVar != null) {
            jiVar.mo67560b(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo67498a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onReceivedError ");
        sb.append(i);
        sb.append(" description ");
        sb.append(str);
        sb.append(" ulr ");
        sb.append(str2);
        C10661ji jiVar = this.f26920c;
        if (jiVar != null) {
            jiVar.mo67632b();
        }
    }

    /* renamed from: b */
    public final boolean mo67499b(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        this.f26919b.mo67688b(str);
        C10661ji jiVar = this.f26920c;
        Boolean valueOf = jiVar == null ? null : Boolean.valueOf(jiVar.mo67562d(webView, str));
        if (valueOf == null) {
            return super.mo67499b(webView, str);
        }
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public final void mo67544a(String str) {
        C10765mq.m32773b(str, "url");
        this.f26919b.mo67686a(str);
    }

    /* renamed from: a */
    public final WebResourceResponse mo67497a(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        C10661ji jiVar = this.f26920c;
        if (jiVar != null) {
            jiVar.mo67561c(webView, str);
        }
        C10661ji jiVar2 = this.f26920c;
        boolean z = true;
        if (jiVar2 == null || !jiVar2.mo67623a(str)) {
            z = false;
        }
        if (z) {
            return m32597b();
        }
        return super.mo67497a(webView, str);
    }

    /* renamed from: a */
    public final void mo67542a() {
        C10661ji jiVar = this.f26920c;
        if (jiVar != null) {
            jiVar.mo67632b();
        }
    }

    /* renamed from: b */
    private static WebResourceResponse m32597b() {
        byte[] bytes = "".getBytes(C10804nz.f27018a);
        C10765mq.m32770a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }
}
