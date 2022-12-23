package com.ogury.p376ed.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.hk */
public abstract class C10590hk extends C10565gq {

    /* renamed from: a */
    public static final C10591a f26717a = new C10591a((byte) 0);

    /* renamed from: e */
    private static final WebResourceResponse f26718e;

    /* renamed from: b */
    private C10493ek f26719b;

    /* renamed from: c */
    private final Handler f26720c;

    /* renamed from: d */
    private C10587hh f26721d;

    /* renamed from: a */
    public abstract void mo67542a();

    /* renamed from: a */
    public abstract void mo67544a(String str);

    /* renamed from: b */
    public boolean mo67499b(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        return true;
    }

    private C10590hk() {
        this.f26719b = null;
        this.f26720c = new Handler(Looper.getMainLooper());
        this.f26721d = C10587hh.f26714a;
    }

    public /* synthetic */ C10590hk(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo67543a(C10493ek ekVar) {
        this.f26719b = ekVar;
    }

    /* renamed from: com.ogury.ed.internal.hk$a */
    public static final class C10591a {
        public /* synthetic */ C10591a(byte b) {
            this();
        }

        private C10591a() {
        }
    }

    static {
        byte[] bytes = "".getBytes(C10804nz.f27018a);
        C10765mq.m32770a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f26718e = new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }

    /* renamed from: a */
    public WebResourceResponse mo67497a(WebView webView, String str) {
        C10765mq.m32773b(webView, "view");
        C10765mq.m32773b(str, "url");
        if (C10592hl.m32219a(str)) {
            this.f26720c.post(new Runnable(str, this) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ C10590hk f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C10590hk.m32212a(this.f$0, this.f$1);
                }
            });
            return f26718e;
        } else if (m32213b(str)) {
            return m32210a(webView);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m32212a(String str, C10590hk hkVar) {
        C10765mq.m32773b(str, "$url");
        C10765mq.m32773b(hkVar, "this$0");
        C10562gn.m32098a(str);
        hkVar.mo67544a(str);
    }

    /* renamed from: a */
    private final WebResourceResponse m32210a(WebView webView) {
        Context context = webView.getContext();
        C10765mq.m32770a((Object) context, "view.context");
        WebResourceResponse a = C10587hh.m32206a(context, this.f26719b);
        if (a != null) {
            return a;
        }
        this.f26720c.post(new Runnable() {
            public final void run() {
                C10590hk.m32211a(C10590hk.this);
            }
        });
        return f26718e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m32211a(C10590hk hkVar) {
        C10765mq.m32773b(hkVar, "this$0");
        hkVar.mo67542a();
    }

    /* renamed from: b */
    private static boolean m32213b(String str) {
        return C10765mq.m32772a((Object) "mraid.js", (Object) Uri.parse(str).getLastPathSegment());
    }
}
