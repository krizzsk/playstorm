package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0817e0;
import com.adcolony.sdk.C0848j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.adcolony.sdk.l */
public final class C0890l extends C0848j {

    /* renamed from: G */
    public static final C0896f f589G = new C0896f((DefaultConstructorMarker) null);

    /* renamed from: H */
    public static boolean f590H;

    /* renamed from: com.adcolony.sdk.l$a */
    private final class C0891a extends C0848j.C0849a {
        public C0891a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0897g().mo10878a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    private final class C0892b extends C0848j.C0850b {
        public C0892b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0897g().mo10878a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    private final class C0893c extends C0848j.C0851c {
        public C0893c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0897g().mo10878a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$d */
    private final class C0894d extends C0848j.C0852d {
        public C0894d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0897g().mo10878a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$e */
    private final class C0895e extends C0848j.C0853e {
        public C0895e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C0897g().mo10878a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$f */
    public static final class C0896f {
        private C0896f() {
        }

        public /* synthetic */ C0896f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0890l mo10877a(Context context, C0841h0 h0Var) {
            C0890l lVar = new C0890l(context, h0Var, (DefaultConstructorMarker) null);
            lVar.mo10533i();
            return lVar;
        }
    }

    /* renamed from: com.adcolony.sdk.l$g */
    private final class C0897g {
        public C0897g() {
        }

        /* renamed from: a */
        public final void mo10878a() {
            if (!C0890l.this.getModuleInitialized()) {
                C0819e1 e1Var = new C0819e1();
                for (AdColonyInterstitial adColonyInterstitial : C0714a.m136b().mo10827c().mo10662g()) {
                    C0823f1 f1Var = new C0823f1();
                    C0764c0.m319a(f1Var, "ad_session_id", adColonyInterstitial.mo10375b());
                    C0764c0.m319a(f1Var, "ad_id", adColonyInterstitial.mo10366a());
                    C0764c0.m319a(f1Var, "zone_id", adColonyInterstitial.getZoneID());
                    C0764c0.m319a(f1Var, "ad_request_id", adColonyInterstitial.mo10387g());
                    e1Var.mo10686a(f1Var);
                }
                C0764c0.m317a(C0890l.this.getInfo(), "ads_to_restore", e1Var);
            }
        }
    }

    private C0890l(Context context, C0841h0 h0Var) {
        super(context, 1, h0Var);
    }

    public /* synthetic */ C0890l(Context context, C0841h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, h0Var);
    }

    @JvmStatic
    /* renamed from: b */
    public static final C0890l m743b(Context context, C0841h0 h0Var) {
        return f589G.mo10877a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10504a(C0823f1 f1Var, String str) {
        if (super.mo10504a(f1Var, str)) {
            return true;
        }
        new C0817e0.C0818a().mo10684a("Unable to communicate with controller, disabling AdColony.").mo10685a(C0817e0.f433h);
        AdColony.disable();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo10608c(C0823f1 f1Var) {
        if (f590H) {
            return "android_asset/ADCController.js";
        }
        return super.mo10608c(f1Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0892b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0893c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0894d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0895e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0891a();
    }
}
