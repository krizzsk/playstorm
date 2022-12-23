package com.ogury.p376ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSession;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;

/* renamed from: com.ogury.ed.internal.jr */
public final class C10670jr {
    /* renamed from: a */
    public static AdSession m32622a(WebView webView, boolean z) {
        AdSessionConfiguration adSessionConfiguration;
        C10765mq.m32773b(webView, "adWebView");
        try {
            C10665jm jmVar = C10665jm.f26921a;
            C10666jn a = C10665jm.m32611a(webView, z);
            if (a == null) {
                adSessionConfiguration = null;
            } else {
                adSessionConfiguration = a.mo67730b();
            }
            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, a == null ? null : a.mo67727a());
            createAdSession.registerAdView(webView);
            return createAdSession;
        } catch (Exception e) {
            C10667jo joVar = C10667jo.f26924a;
            C10667jo.m32616a(e);
            return null;
        }
    }
}
