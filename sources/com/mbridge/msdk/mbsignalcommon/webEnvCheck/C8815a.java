package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a */
/* compiled from: MBWebViewChecker */
public final class C8815a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile Boolean f21425a;

    /* renamed from: b */
    private static volatile Handler f21426b;

    /* renamed from: c */
    private static Boolean f21427c;

    /* renamed from: a */
    public static boolean m25647a(final Context context) {
        C2278a aVar;
        try {
            aVar = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
        } catch (Exception unused) {
            aVar = null;
        }
        if (aVar != null) {
            f21427c = Boolean.valueOf(aVar.mo15513i());
        } else {
            f21427c = false;
        }
        Boolean bool = f21427c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f21425a == null) {
                try {
                    f21425a = Boolean.valueOf(m25649c(context));
                } catch (Exception unused2) {
                    f21425a = false;
                }
            }
            if (f21425a == null) {
                f21425a = new Boolean(false);
            }
            return f21425a.booleanValue();
        }
        if (f21425a == null && f21426b == null) {
            f21426b = new Handler(Looper.getMainLooper());
            f21426b.post(new Runnable() {
                public final void run() {
                    if (C8815a.f21425a == null) {
                        try {
                            Boolean unused = C8815a.f21425a = Boolean.valueOf(C8815a.m25649c(context));
                        } catch (Exception unused2) {
                            Boolean unused3 = C8815a.f21425a = false;
                        }
                    }
                }
            });
        }
        if (f21425a == null) {
            return true;
        }
        return f21425a.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m25649c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
        } catch (Exception unused) {
            webView = null;
        }
        return webView != null;
    }
}
