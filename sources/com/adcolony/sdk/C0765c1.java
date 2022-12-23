package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0733b1;
import com.adcolony.sdk.C0817e0;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.adcolony.ScriptInjector;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.adcolony.sdk.c1 */
public class C0765c1 extends C0733b1 implements C0889k0 {

    /* renamed from: A */
    private C0774i f345A;

    /* renamed from: B */
    private boolean f346B = true;

    /* renamed from: C */
    private C0823f1 f347C = C0764c0.m322b();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f348D;

    /* renamed from: E */
    private boolean f349E;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f350v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f351w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Object f352x = new Object();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0819e1 f353y = C0764c0.m308a();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public String f354z = "";

    /* renamed from: com.adcolony.sdk.c1$a */
    private class C0766a {
        public C0766a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C0765c1.this.f354z)) {
                C0765c1.this.m351c(str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C0765c1.this.f354z)) {
                C0765c1.this.f350v = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            if (!Intrinsics.areEqual((Object) str, (Object) C0765c1.this.f354z)) {
                return "[]";
            }
            String str2 = "[]";
            Object d = C0765c1.this.f352x;
            C0765c1 c1Var = C0765c1.this;
            synchronized (d) {
                if (c1Var.f353y.mo10690b() > 0) {
                    if (c1Var.getEnableMessages()) {
                        str2 = c1Var.f353y.toString();
                    }
                    c1Var.f353y = C0764c0.m308a();
                }
                Unit unit = Unit.INSTANCE;
            }
            return str2;
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C0765c1.this.f354z)) {
                C0765c1.this.m351c(str);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$b */
    private final class C0767b extends C0766a {
        public C0767b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C0765c1.this.f354z)) {
                C0765c1.this.f351w = true;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$c */
    protected class C0768c extends C0733b1.C0735b {
        public C0768c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0777l().mo10639a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0777l().mo10641b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0777l().mo10640a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$d */
    protected class C0769d extends C0733b1.C0736c {
        public C0769d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0777l().mo10639a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0777l().mo10641b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0777l().mo10640a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$e */
    protected class C0770e extends C0733b1.C0737d {
        public C0770e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0775j().mo10637a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0777l().mo10641b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C0777l().mo10640a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$f */
    protected class C0771f extends C0733b1.C0738e {
        public C0771f() {
            super(C0765c1.this);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0775j().mo10637a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0777l().mo10641b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C0776k().mo10638a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$g */
    protected class C0772g extends C0733b1.C0739f {
        public C0772g() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0775j().mo10637a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C0777l().mo10641b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C0776k().mo10638a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$h */
    public static final class C0773h {
        private C0773h() {
        }

        public /* synthetic */ C0773h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.c1$i */
    private static final class C0774i {

        /* renamed from: a */
        private final WebMessagePort[] f362a;

        public C0774i(WebMessagePort[] webMessagePortArr) {
            this.f362a = webMessagePortArr;
        }

        /* renamed from: a */
        public final WebMessagePort mo10635a() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f362a, 1);
        }

        /* renamed from: b */
        public final WebMessagePort mo10636b() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f362a, 0);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$j */
    private final class C0775j {
        public C0775j() {
        }

        /* renamed from: a */
        public final void mo10637a(String str) {
            new C0777l().mo10639a();
            if (str != null) {
                C0765c1.this.m354d(str);
            } else {
                new C0817e0.C0818a().mo10684a("ADCWebViewModule: initializeEventMessaging failed due to url = null").mo10685a(C0817e0.f432g);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$k */
    private final class C0776k {
        public C0776k() {
        }

        /* renamed from: a */
        public final boolean mo10638a(WebResourceRequest webResourceRequest) {
            int i = 0;
            if (C0765c1.this.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    String a = C0765c1.this.getClickOverride();
                    Uri parse = a == null ? null : Uri.parse(a);
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        C1038z0.m1183a(new Intent("android.intent.action.VIEW", parse));
                        C0823f1 b = C0764c0.m322b();
                        C0765c1 c1Var = C0765c1.this;
                        C0764c0.m319a(b, "url", parse.toString());
                        C0764c0.m319a(b, "ad_session_id", c1Var.getAdSessionId());
                        C0752c parentContainer = C0765c1.this.getParentContainer();
                        if (parentContainer != null) {
                            i = parentContainer.mo10591k();
                        }
                        new C0841h0("WebView.redirect_detected", i, b).mo10776c();
                        C1005x0 A = C0714a.m136b().mo10801A();
                        C0765c1 c1Var2 = C0765c1.this;
                        A.mo11120a(c1Var2.getAdSessionId());
                        A.mo11122c(c1Var2.getAdSessionId());
                    } else {
                        new C0817e0.C0818a().mo10684a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C0765c1.this.mo10532h())).mo10685a(C0817e0.f434i);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.adcolony.sdk.c1$m */
    public static final class C0778m extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ C0765c1 f366a;

        C0778m(C0765c1 c1Var) {
            this.f366a = c1Var;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data;
            if (webMessage != null && (data = webMessage.getData()) != null) {
                C0765c1 c1Var = this.f366a;
                List<String> split = new Regex(CertificateUtil.DELIMITER).split(data, 2);
                if (split.size() == 2 && Intrinsics.areEqual((Object) split.get(0), (Object) c1Var.f354z)) {
                    c1Var.m347b(split.get(1));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$n */
    static final class C0779n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0765c1 f367a;

        C0779n(C0765c1 c1Var) {
            this.f367a = c1Var;
        }

        public final void run() {
            this.f367a.removeJavascriptInterface("NativeLayer");
        }
    }

    /* renamed from: com.adcolony.sdk.c1$o */
    static final class C0780o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0765c1 f368a;

        /* renamed from: b */
        final /* synthetic */ String f369b;

        C0780o(C0765c1 c1Var, String str) {
            this.f368a = c1Var;
            this.f369b = str;
        }

        public final void run() {
            if (this.f368a.getEnableMessages()) {
                C0765c1 c1Var = this.f368a;
                c1Var.mo10503a("NativeLayer.dispatch_messages(ADC3_update(" + this.f369b + "), '" + this.f368a.f354z + "');");
            }
        }
    }

    static {
        new C0773h((DefaultConstructorMarker) null);
    }

    public C0765c1(Context context, int i, C0841h0 h0Var) {
        super(context, i, h0Var);
    }

    /* renamed from: e */
    private final void m355e(C0823f1 f1Var) {
        WebMessagePort webMessagePort;
        if (this.f346B) {
            C0774i iVar = this.f345A;
            if (iVar == null || (webMessagePort = iVar.mo10636b()) == null) {
                webMessagePort = null;
            } else {
                C0819e1 a = C0764c0.m308a();
                a.mo10686a(f1Var);
                webMessagePort.postMessage(new WebMessage(a.toString()));
            }
            if (webMessagePort == null) {
                new C0817e0.C0818a().mo10684a("Sending message before event messaging is initialized").mo10685a(C0817e0.f432g);
            }
        }
    }

    /* access modifiers changed from: private */
    public final String getClickOverride() {
        AdColonyInterstitial interstitial = getInterstitial();
        String c = interstitial == null ? null : interstitial.mo10378c();
        if (c != null) {
            return c;
        }
        AdColonyAdView adView = getAdView();
        if (adView == null) {
            return null;
        }
        return adView.getClickOverride();
    }

    /* renamed from: m */
    private final C0766a m356m() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C0767b();
        }
        return new C0766a();
    }

    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getEnableMessages() {
        return this.f346B;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0823f1 getIab() {
        return this.f347C;
    }

    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getModuleInitialized() {
        return this.f348D;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0769d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0770e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0771f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0772g();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0768c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10533i() {
        addJavascriptInterface(m356m(), "NativeLayer");
        C0714a.m136b().mo10847r().mo10781a((C0889k0) this);
        super.mo10533i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ boolean mo10617n() {
        return this.f349E;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setEnableMessages(boolean z) {
        this.f346B = z;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setIab(C0823f1 f1Var) {
        this.f347C = f1Var;
    }

    /* renamed from: o */
    private final void m357o() {
        String str = "";
        synchronized (this.f352x) {
            if (this.f353y.mo10690b() > 0) {
                if (getEnableMessages()) {
                    str = this.f353y.toString();
                }
                this.f353y = C0764c0.m308a();
            }
            Unit unit = Unit.INSTANCE;
        }
        C1038z0.m1202b((Runnable) new C0780o(this, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ String mo10610d(C0823f1 f1Var) {
        return Intrinsics.stringPlus("file:///", mo10608c(f1Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m354d(String str) {
        if (this.f345A == null) {
            C0774i iVar = new C0774i(createWebMessageChannel());
            WebMessagePort b = iVar.mo10636b();
            if (b != null) {
                b.setWebMessageCallback(new C0778m(this));
            }
            postWebMessage(new WebMessage("", new WebMessagePort[]{iVar.mo10635a()}), Uri.parse(str));
            Unit unit = Unit.INSTANCE;
            this.f345A = iVar;
        }
    }

    /* renamed from: b */
    public void mo10606b() {
        if (C0714a.m138c() && this.f348D && !this.f350v && !this.f351w) {
            m357o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo10608c(C0823f1 f1Var) {
        return C0764c0.m336h(f1Var, "filepath");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10502a(C0841h0 h0Var, int i, C0752c cVar) {
        C0823f1 a = h0Var.mo10772a();
        this.f346B = C0764c0.m325b(a, "enable_messages");
        if (this.f347C.mo10729b()) {
            this.f347C = C0764c0.m334f(a, "iab");
        }
        super.mo10502a(h0Var, i, cVar);
    }

    /* renamed from: c */
    public void mo10609c() {
        if (!getDestroyed()) {
            mo10536l();
            C1038z0.m1202b((Runnable) new C0779n(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m347b(String str) {
        m346b(C0764c0.m323b(str));
    }

    /* renamed from: com.adcolony.sdk.c1$l */
    private final class C0777l {
        public C0777l() {
        }

        /* renamed from: a */
        public final void mo10639a() {
            if (C0765c1.this.getEnableMessages() && !C0765c1.this.getModuleInitialized()) {
                C0765c1.this.f354z = C1038z0.m1178a();
                C0823f1 a = C0764c0.m313a(C0764c0.m322b(), C0765c1.this.getInfo());
                C0764c0.m319a(a, "message_key", C0765c1.this.f354z);
                C0765c1 c1Var = C0765c1.this;
                c1Var.mo10503a("ADC3_init(" + C0765c1.this.getAdcModuleId() + ',' + a + ");");
                C0765c1.this.f348D = true;
            }
        }

        /* renamed from: b */
        public final void mo10641b() {
            C0765c1.this.f348D = false;
        }

        /* renamed from: a */
        public final boolean mo10640a(String str) {
            int i = 0;
            if (!C0765c1.this.getModuleInitialized()) {
                return false;
            }
            String a = C0765c1.this.getClickOverride();
            if (a != null) {
                str = a;
            }
            if (str != null) {
                C1038z0.m1183a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                C0823f1 b = C0764c0.m322b();
                C0765c1 c1Var = C0765c1.this;
                C0764c0.m319a(b, "url", str);
                C0764c0.m319a(b, "ad_session_id", c1Var.getAdSessionId());
                C0752c parentContainer = C0765c1.this.getParentContainer();
                if (parentContainer != null) {
                    i = parentContainer.mo10591k();
                }
                new C0841h0("WebView.redirect_detected", i, b).mo10776c();
                C1005x0 A = C0714a.m136b().mo10801A();
                C0765c1 c1Var2 = C0765c1.this;
                A.mo11120a(c1Var2.getAdSessionId());
                A.mo11122c(c1Var2.getAdSessionId());
                return true;
            }
            new C0817e0.C0818a().mo10684a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C0765c1.this.mo10532h())).mo10685a(C0817e0.f434i);
            return true;
        }
    }

    /* renamed from: b */
    private final void m346b(C0823f1 f1Var) {
        C0714a.m136b().mo10847r().mo10788c(f1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m351c(String str) {
        for (C0823f1 b : C0764c0.m310a(str).mo10694c()) {
            m346b(b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* synthetic */ void mo10607b(Exception exc) {
        new C0817e0.C0818a().mo10684a(exc.getClass().toString()).mo10684a(" during metadata injection w/ metadata = ").mo10684a(C0764c0.m336h(getInfo(), "metadata")).mo10685a(C0817e0.f434i);
    }

    /* renamed from: a */
    public void mo10604a(C0823f1 f1Var) {
        synchronized (this.f352x) {
            if (this.f351w) {
                m355e(f1Var);
                Unit unit = Unit.INSTANCE;
            } else {
                this.f353y.mo10686a(f1Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo10605a() {
        return !this.f350v && !this.f351w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ String mo10603a(String str, String str2) {
        C0930p0 p0Var;
        if (!this.f347C.mo10729b()) {
            AdColonyInterstitial interstitial = getInterstitial();
            C0930p0 p0Var2 = null;
            if (interstitial != null && !Intrinsics.areEqual((Object) C0764c0.m336h(getIab(), "ad_type"), (Object) "video")) {
                interstitial.mo10371a(getIab());
                p0Var = interstitial.mo10384e();
            } else {
                p0Var = null;
            }
            if (p0Var == null) {
                AdColonyAdViewListener adColonyAdViewListener = C0714a.m136b().mo10827c().mo10659e().get(getAdSessionId());
                if (adColonyAdViewListener != null) {
                    adColonyAdViewListener.mo10308a(new C0930p0(getIab(), getAdSessionId()));
                    p0Var2 = adColonyAdViewListener.f116c;
                }
            } else {
                p0Var2 = p0Var;
            }
            if (p0Var2 != null && p0Var2.mo10944d() == 2) {
                boolean z = true;
                this.f349E = true;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        return ScriptInjector.injectScriptContentIntoHtml(C0714a.m136b().mo10845p().mo11100a(str2, false).toString(), str);
                    } catch (IOException e) {
                        mo10607b((Exception) e);
                    }
                }
            }
        }
        return str;
    }
}
