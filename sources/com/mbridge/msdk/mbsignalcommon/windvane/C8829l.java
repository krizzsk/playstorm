package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p301c.C8424a;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.mbsignalcommon.base.C8794b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.l */
/* compiled from: WindVaneWebViewClient */
public final class C8829l extends C8794b {

    /* renamed from: b */
    public static boolean f21485b = true;

    /* renamed from: a */
    protected String f21486a = null;

    /* renamed from: c */
    private int f21487c = 0;

    /* renamed from: d */
    private C8821d f21488d;

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f21486a = str;
        C8821d dVar = this.f21488d;
        if (dVar != null) {
            dVar.mo57903a(webView, str, bitmap);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = m25686a(str);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* renamed from: a */
    private WebResourceResponse m25686a(String str) {
        Bitmap a;
        try {
            if (TextUtils.isEmpty(str) || !C8827j.m25682d(str) || (a = C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57503a(str)) == null || a.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(C8827j.m25683e(str), "utf-8", C8424a.m24338a(a));
        } catch (Throwable unused) {
            return null;
        }
    }
}
