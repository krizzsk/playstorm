package com.ogury.p376ed.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.ogury.p376ed.internal.C10505ev;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.hh */
public final class C10587hh {

    /* renamed from: a */
    public static final C10587hh f26714a = new C10587hh();

    /* renamed from: b */
    private static C10583hd f26715b = C10583hd.f26708a;

    private C10587hh() {
    }

    /* renamed from: a */
    private static WebResourceResponse m32207a(String str, String str2) {
        String str3 = "javascript:" + str2 + str;
        Charset charset = C10804nz.f27018a;
        if (str3 != null) {
            byte[] bytes = str3.getBytes(charset);
            C10765mq.m32770a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static WebResourceResponse m32206a(Context context, C10493ek ekVar) {
        C10765mq.m32773b(context, "context");
        String a = C10583hd.m32198a(ekVar);
        C10505ev.C10506a aVar = C10505ev.f26560a;
        String b = C10505ev.C10506a.m31852a(context).mo67334b();
        if (b.length() > 0) {
            return m32207a(b, a);
        }
        return null;
    }
}
