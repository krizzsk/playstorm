package com.ogury.p375cm.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.ogury.core.OguryError;
import com.ogury.p375cm.ConsentActivity;
import com.ogury.p375cm.internal.aacaa;
import com.ogury.p375cm.internal.aacab;
import com.ogury.p375cm.internal.bbacb;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Typography;

/* renamed from: com.ogury.cm.internal.abaac */
public final class abaac {

    /* renamed from: a */
    public static final aaaaa f25688a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.abaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abaac f25689a;

        /* renamed from: b */
        final /* synthetic */ WebView f25690b;

        /* renamed from: c */
        final /* synthetic */ abbbb f25691c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(abaac abaac, WebView webView, abbbb abbbb) {
            super(0);
            this.f25689a = abaac;
            this.f25690b = webView;
            this.f25691c = abbbb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f25924a = "";
            final bbacb.aaaab aaaab2 = new bbacb.aaaab();
            aaaab2.f25924a = "";
            baaba.f25874a.setQueryProductDetailsListener(new baacc() {
                /* renamed from: a */
                public final void mo66547a(String str, String str2) {
                    bbabc.m30943b(str, "status");
                    bbabc.m30943b(str2, "skuDetailsJson");
                    aaaab.f25924a = str;
                    aaaab2.f25924a = str2;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            baaba.f25874a.setQueryProductDetailsListener((baacc) null);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ aaaab f25695a;

                {
                    this.f25695a = r1;
                }

                public final void run() {
                    if (bbabc.m30942a((Object) (String) aaaab.f25924a, (Object) "ok")) {
                        abaac.m30688a(this.f25695a.f25690b, (String) aaaab2.f25924a);
                        this.f25695a.f25691c.mo66486a("ready");
                        return;
                    }
                    this.f25695a.f25691c.mo66485a(new OguryError(1005, aacaa.aaaaa.m30667e((String) aaaab.f25924a)));
                }
            });
            if (!bbabc.m30942a((Object) (String) aaaab.f25924a, (Object) "ok")) {
                new abcba();
                abcba.m30797a((String) aaaab.f25924a, (acabb) new acabb(this) {

                    /* renamed from: a */
                    final /* synthetic */ aaaab f25698a;

                    {
                        this.f25698a = r1;
                    }

                    /* renamed from: a */
                    public final void mo66498a(int i, String str) {
                        OguryError oguryError;
                        bbabc.m30943b(str, "error");
                        if (i == 0 || (500 <= i && 599 >= i)) {
                            oguryError = new OguryError(3, str);
                        } else {
                            aacab.aaaaa aaaaa = aacab.f25670a;
                            oguryError = aacab.aaaaa.m30668a(str);
                        }
                        this.f25698a.f25691c.mo66485a(oguryError);
                    }

                    /* renamed from: a */
                    public final void mo66499a(String str) {
                        bbabc.m30943b(str, "response");
                        this.f25698a.f25691c.mo66486a(str);
                    }
                });
            }
            return babcc.f25908a;
        }
    }

    /* renamed from: com.ogury.cm.internal.abaac$aaaac */
    public static final class aaaac implements baaaa {

        /* renamed from: a */
        final /* synthetic */ abaac f25699a;

        /* renamed from: b */
        final /* synthetic */ WebView f25700b;

        aaaac(abaac abaac, WebView webView) {
            this.f25699a = abaac;
            this.f25700b = webView;
        }

        /* renamed from: a */
        public final void mo66549a(String str) {
            bbabc.m30943b(str, "jsonResult");
            abaac.m30690a(str, this.f25700b);
            baaba.f25874a.setBillingFinishedListener((baaaa) null);
        }
    }

    /* renamed from: a */
    private static String m30686a(String str) {
        String str2;
        if (str != null) {
            str2 = ", \"" + aacaa.aaaaa.m30665c(str) + Typography.quote;
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("javascript:(function(){ogFormBridge.init(\"");
        abbba abbba = abbba.f25716a;
        sb.append(aacaa.aaaaa.m30665c(abbba.m30733j()));
        sb.append(Typography.quote);
        sb.append(str2);
        sb.append(")})()");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m30687a(Context context) {
        if (context instanceof ConsentActivity) {
            ((ConsentActivity) context).finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m30688a(WebView webView, String str) {
        webView.setVisibility(0);
        webView.loadUrl(m30686a(str));
    }

    /* renamed from: a */
    public static void m30690a(String str, WebView webView) {
        bbabc.m30943b(str, "jsonResult");
        bbabc.m30943b(webView, "webView");
        webView.loadUrl("javascript:(function(){ogFormBridge.purchase(\"" + aacaa.aaaaa.m30665c(str) + "\")})()");
    }

    /* renamed from: a */
    public final void mo66546a(String str, Context context, abbbb abbbb, WebView webView) {
        String str2 = str;
        Context context2 = context;
        abbbb abbbb2 = abbbb;
        WebView webView2 = webView;
        bbabc.m30943b(str2, "url");
        bbabc.m30943b(context2, "context");
        bbabc.m30943b(abbbb2, "callback");
        bbabc.m30943b(webView2, "webView");
        Locale locale = Locale.US;
        bbabc.m30940a((Object) locale, "Locale.US");
        String lowerCase = str2.toLowerCase(locale);
        bbabc.m30940a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (bbcbc.m30981a(lowerCase, "https://ogyconsent", false, 2, (Object) null)) {
            String substring = str2.substring(20);
            bbabc.m30940a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            if (bbcbc.m30981a(substring, "consent=", false, 2, (Object) null)) {
                abbba abbba = abbba.f25716a;
                abbba.m30728f().mo66627a(substring, false);
                abbba abbba2 = abbba.f25716a;
                if (abbba.m30740q()) {
                    StringBuilder sb = new StringBuilder("parsedConfig=");
                    abbba abbba3 = abbba.f25716a;
                    sb.append(abbba.m30732i());
                    abbbb2.mo66486a(sb.toString());
                } else {
                    abbba abbba4 = abbba.f25716a;
                    abbbb2.mo66485a(abbba.m30732i().mo66630b());
                }
                m30687a(context);
                baaba.f25874a.endDataSourceConnections();
            } else if (bbcbc.m30981a(substring, "ogyRedirect=", false, 2, (Object) null)) {
                try {
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bbcbc.m30987a(substring, "ogyRedirect=", (String) null, 2, (Object) null))));
                } catch (ActivityNotFoundException unused) {
                } catch (Exception e) {
                    abbbc abbbc = abbbc.f25732a;
                    abbbc.m30747a((Throwable) e);
                }
            } else if (!bbcbc.m30981a(substring, "error=", false, 2, (Object) null)) {
            } else {
                if (substring != null) {
                    String substring2 = substring.substring(6);
                    bbabc.m30940a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    abbbb2.mo66485a(new OguryError(1003, bbcbc.m30976a(bbcbc.m30976a(substring2, "%20", " ", false, 4, (Object) null), "%22", "\"", false, 4, (Object) null)));
                    m30687a(context);
                    return;
                }
                throw new babca("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            CharSequence charSequence = str2;
            if (bbcbc.m30990a(charSequence, (CharSequence) "?ready", false, 2, (Object) null)) {
                if (baaba.f25874a.isProductActivated()) {
                    bacbb.m30926a(false, false, (ClassLoader) null, (String) null, 0, new aaaab(this, webView2, abbbb2), 31, (Object) null);
                    return;
                }
                m30688a(webView2, (String) null);
                abbbb2.mo66486a("ready");
            } else if (bbcbc.m30990a(charSequence, (CharSequence) "?success", false, 2, (Object) null)) {
                abbbb2.mo66486a("success");
            } else if (bbcbc.m30990a(charSequence, (CharSequence) "?purchase", false, 2, (Object) null)) {
                baaba.f25874a.setBillingFinishedListener(new aaaac(this, webView2));
                baaba baaba = baaba.f25874a;
                if (context2 != null) {
                    baaba.launchBillingFlow((Activity) context2);
                    return;
                }
                throw new babca("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
