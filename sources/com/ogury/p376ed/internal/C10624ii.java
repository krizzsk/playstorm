package com.ogury.p376ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ii */
public final class C10624ii {

    /* renamed from: a */
    public static final C10625a f26821a = new C10625a((byte) 0);

    /* renamed from: b */
    private String f26822b = "";

    /* renamed from: c */
    private int f26823c = -1;

    /* renamed from: com.ogury.ed.internal.ii$a */
    public static final class C10625a {
        public /* synthetic */ C10625a(byte b) {
            this();
        }

        private C10625a() {
        }
    }

    /* renamed from: a */
    public final void mo67624a(WebView webView) {
        C10765mq.m32773b(webView, "webView");
        if (this.f26822b.length() == 0) {
            String userAgentString = webView.getSettings().getUserAgentString();
            C10765mq.m32770a((Object) userAgentString, "webView.settings.userAgentString");
            this.f26822b = userAgentString;
            m32387b();
        }
    }

    /* renamed from: b */
    private final void m32387b() {
        int a = C10814oc.m32847a((CharSequence) this.f26822b, "chrome/", 0, true);
        if (a != -1) {
            int i = a + 7;
            try {
                String str = this.f26822b;
                int i2 = i + 2;
                if (str != null) {
                    String substring = str.substring(i, i2);
                    C10765mq.m32770a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    this.f26823c = Integer.parseInt(substring);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                C10559gl.m32093a(th);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo67625a() {
        return this.f26823c <= 57;
    }
}
