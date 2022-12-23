package com.ogury.p376ed.internal;

import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.AdSessionConfiguration;
import com.iab.omid.library.oguryco.adsession.AdSessionContext;
import com.iab.omid.library.oguryco.adsession.CreativeType;
import com.iab.omid.library.oguryco.adsession.ImpressionType;
import com.iab.omid.library.oguryco.adsession.Owner;
import com.iab.omid.library.oguryco.adsession.Partner;

/* renamed from: com.ogury.ed.internal.jm */
public final class C10665jm {

    /* renamed from: a */
    public static final C10665jm f26921a = new C10665jm();

    private C10665jm() {
    }

    /* renamed from: a */
    public static C10666jn m32611a(WebView webView, boolean z) {
        C10765mq.m32773b(webView, "adWebView");
        C10666jn jnVar = new C10666jn();
        Partner a = m32610a();
        if (a == null) {
            return null;
        }
        jnVar.mo67729a(m32609a(a, webView));
        jnVar.mo67728a(m32608a(z));
        return jnVar;
    }

    /* renamed from: a */
    private static Partner m32610a() {
        try {
            return Partner.createPartner("Ogury", "4.2.0");
        } catch (IllegalArgumentException e) {
            C10667jo joVar = C10667jo.f26924a;
            C10667jo.m32616a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionContext m32609a(Partner partner, WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, webView, "", (String) null);
        } catch (IllegalArgumentException e) {
            C10667jo joVar = C10667jo.f26924a;
            C10667jo.m32616a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static AdSessionConfiguration m32608a(boolean z) {
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        Owner owner2 = Owner.NONE;
        if (z) {
            owner2 = Owner.JAVASCRIPT;
        }
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner2, false);
        } catch (IllegalArgumentException e) {
            C10667jo joVar = C10667jo.f26924a;
            C10667jo.m32616a(e);
            return null;
        }
    }
}
