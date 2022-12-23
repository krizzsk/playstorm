package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.adcolony.sdk.C0817e0;
import com.facebook.share.internal.ShareInternalUtility;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* renamed from: com.adcolony.sdk.b1 */
public class C0733b1 extends WebView {

    /* renamed from: u */
    public static final C0740g f264u = new C0740g((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f265a;

    /* renamed from: b */
    private final C0841h0 f266b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f267c;

    /* renamed from: d */
    private String f268d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f269e = "";

    /* renamed from: f */
    private String f270f = "";

    /* renamed from: g */
    private String f271g = "";

    /* renamed from: h */
    private String f272h = "";

    /* renamed from: i */
    private String f273i = "";

    /* renamed from: j */
    private C0823f1 f274j = C0764c0.m322b();

    /* renamed from: k */
    private boolean f275k;

    /* renamed from: l */
    private C0752c f276l;

    /* renamed from: m */
    private int f277m;

    /* renamed from: n */
    private int f278n;

    /* renamed from: o */
    private int f279o;

    /* renamed from: p */
    private int f280p;

    /* renamed from: q */
    private int f281q;

    /* renamed from: r */
    private int f282r;

    /* renamed from: s */
    private int f283s;

    /* renamed from: t */
    private int f284t;

    /* renamed from: com.adcolony.sdk.b1$a */
    private final class C0734a extends WebChromeClient {
        public C0734a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
            if (r3 != false) goto L_0x0064;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0056 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 != 0) goto L_0x0005
                r1 = r0
                goto L_0x0009
            L_0x0005:
                android.webkit.ConsoleMessage$MessageLevel r1 = r9.messageLevel()
            L_0x0009:
                if (r9 != 0) goto L_0x000d
                r9 = r0
                goto L_0x0011
            L_0x000d:
                java.lang.String r9 = r9.message()
            L_0x0011:
                r2 = 2
                r3 = 0
                r4 = 1
                if (r9 != 0) goto L_0x0017
                goto L_0x0021
            L_0x0017:
                java.lang.String r5 = "Viewport target-densitydpi is not supported."
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0021
                r5 = r4
                goto L_0x0022
            L_0x0021:
                r5 = r3
            L_0x0022:
                if (r5 != 0) goto L_0x0037
                if (r9 != 0) goto L_0x0027
                goto L_0x0031
            L_0x0027:
                java.lang.String r5 = "Viewport argument key \"shrink-to-fit\" not recognized and ignored"
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0031
                r5 = r4
                goto L_0x0032
            L_0x0031:
                r5 = r3
            L_0x0032:
                if (r5 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r5 = r3
                goto L_0x0038
            L_0x0037:
                r5 = r4
            L_0x0038:
                android.webkit.ConsoleMessage$MessageLevel r6 = android.webkit.ConsoleMessage.MessageLevel.ERROR
                if (r1 != r6) goto L_0x003e
                r6 = r4
                goto L_0x003f
            L_0x003e:
                r6 = r3
            L_0x003f:
                android.webkit.ConsoleMessage$MessageLevel r7 = android.webkit.ConsoleMessage.MessageLevel.WARNING
                if (r1 != r7) goto L_0x0045
                r1 = r4
                goto L_0x0046
            L_0x0045:
                r1 = r3
            L_0x0046:
                if (r9 != 0) goto L_0x0049
                goto L_0x0053
            L_0x0049:
                java.lang.String r7 = "ADC3_update is not defined"
                boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r7 != r4) goto L_0x0053
                r7 = r4
                goto L_0x0054
            L_0x0053:
                r7 = r3
            L_0x0054:
                if (r7 != 0) goto L_0x0064
                if (r9 != 0) goto L_0x0059
                goto L_0x0062
            L_0x0059:
                java.lang.String r7 = "NativeLayer.dispatch_messages is not a function"
                boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r2 != r4) goto L_0x0062
                r3 = r4
            L_0x0062:
                if (r3 == 0) goto L_0x007d
            L_0x0064:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C0733b1.this
                com.adcolony.sdk.h0 r3 = r2.getMessage()
                if (r3 != 0) goto L_0x006d
                goto L_0x0071
            L_0x006d:
                com.adcolony.sdk.f1 r0 = r3.mo10772a()
            L_0x0071:
                if (r0 != 0) goto L_0x0078
                com.adcolony.sdk.f1 r0 = new com.adcolony.sdk.f1
                r0.<init>()
            L_0x0078:
                java.lang.String r3 = "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device."
                r2.mo10504a((com.adcolony.sdk.C0823f1) r0, (java.lang.String) r3)
            L_0x007d:
                if (r5 != 0) goto L_0x00c0
                if (r1 != 0) goto L_0x0083
                if (r6 == 0) goto L_0x00c0
            L_0x0083:
                com.adcolony.sdk.b1 r0 = com.adcolony.sdk.C0733b1.this
                com.adcolony.sdk.AdColonyInterstitial r0 = r0.getInterstitial()
                if (r0 != 0) goto L_0x008c
                goto L_0x0092
            L_0x008c:
                java.lang.String r0 = r0.mo10366a()
                if (r0 != 0) goto L_0x0094
            L_0x0092:
                java.lang.String r0 = "unknown"
            L_0x0094:
                com.adcolony.sdk.e0$a r1 = new com.adcolony.sdk.e0$a
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onConsoleMessage: "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r9 = " with ad id: "
                r2.append(r9)
                r2.append(r0)
                java.lang.String r9 = r2.toString()
                com.adcolony.sdk.e0$a r9 = r1.mo10684a((java.lang.String) r9)
                if (r6 == 0) goto L_0x00bb
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0817e0.f434i
                goto L_0x00bd
            L_0x00bb:
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0817e0.f432g
            L_0x00bd:
                r9.mo10685a((com.adcolony.sdk.C0817e0) r0)
            L_0x00c0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0733b1.C0734a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$b */
    protected class C0735b extends WebViewClient {
        public C0735b() {
        }

        public void onPageFinished(WebView webView, String str) {
            Unit unit;
            C0823f1 b = C0764c0.m322b();
            C0764c0.m326b(b, "id", C0733b1.this.f267c);
            C0764c0.m319a(b, "url", str);
            C0752c parentContainer = C0733b1.this.getParentContainer();
            if (parentContainer == null) {
                unit = null;
            } else {
                C0764c0.m319a(b, "ad_session_id", C0733b1.this.getAdSessionId());
                C0764c0.m326b(b, "container_id", parentContainer.mo10572c());
                new C0841h0("WebView.on_load", parentContainer.mo10591k(), b).mo10776c();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                new C0841h0("WebView.on_load", C0733b1.this.getWebViewModuleId(), b).mo10776c();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C0733b1.this.m226a(i, str, str2);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z = true;
            if (str == null || !StringsKt.endsWith$default(str, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C0733b1.this.f269e;
            Charset charset = C0840h.f478a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$c */
    protected class C0736c extends C0735b {
        public C0736c() {
            super();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            boolean z = true;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null || !StringsKt.endsWith$default(uri, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C0733b1.this.f269e;
            Charset charset = C0840h.f478a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$d */
    protected class C0737d extends C0736c {
        public C0737d() {
            super();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r3 = r3.getUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            /*
                r1 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C0733b1.this
                int r0 = r4.getErrorCode()
                java.lang.CharSequence r4 = r4.getDescription()
                java.lang.String r4 = r4.toString()
                if (r3 != 0) goto L_0x0014
                goto L_0x001a
            L_0x0014:
                android.net.Uri r3 = r3.getUrl()
                if (r3 != 0) goto L_0x001c
            L_0x001a:
                r3 = 0
                goto L_0x0020
            L_0x001c:
                java.lang.String r3 = r3.toString()
            L_0x0020:
                r2.m226a((int) r0, (java.lang.String) r4, (java.lang.String) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0733b1.C0737d.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$e */
    protected class C0738e extends C0737d {
        public C0738e(C0733b1 b1Var) {
            super();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$f */
    protected class C0739f extends C0738e {
        public C0739f() {
            super(C0733b1.this);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                C0733b1.this.mo10504a(C0764c0.m322b(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$g */
    public static final class C0740g {
        private C0740g() {
        }

        public /* synthetic */ C0740g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0733b1 mo10553a(Context context, C0841h0 h0Var, int i, C0752c cVar) {
            C0733b1 b1Var;
            int e = C0714a.m136b().mo10847r().mo10790e();
            C0823f1 a = h0Var.mo10772a();
            if (C0764c0.m325b(a, "use_mraid_module")) {
                b1Var = new C0898l0(context, e, h0Var, C0714a.m136b().mo10847r().mo10790e());
            } else if (C0764c0.m325b(a, "enable_messages")) {
                b1Var = new C0765c1(context, e, h0Var);
            } else {
                b1Var = new C0733b1(context, e, h0Var);
            }
            b1Var.mo10502a(h0Var, i, cVar);
            b1Var.mo10533i();
            return b1Var;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$h */
    public static final class C0741h implements C0856j0 {

        /* renamed from: a */
        final /* synthetic */ C0733b1 f290a;

        /* renamed from: com.adcolony.sdk.b1$h$a */
        static final class C0742a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0733b1 f291a;

            /* renamed from: b */
            final /* synthetic */ C0841h0 f292b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0742a(C0733b1 b1Var, C0841h0 h0Var) {
                super(0);
                this.f291a = b1Var;
                this.f292b = h0Var;
            }

            /* renamed from: a */
            public final void mo10554a() {
                this.f291a.mo10503a(C0764c0.m336h(this.f292b.mo10772a(), "custom_js"));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10554a();
                return Unit.INSTANCE;
            }
        }

        C0741h(C0733b1 b1Var) {
            this.f290a = b1Var;
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            this.f290a.m230a(h0Var, (Function0<Unit>) new C0742a(this.f290a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$i */
    public static final class C0743i implements C0856j0 {

        /* renamed from: a */
        final /* synthetic */ C0733b1 f293a;

        /* renamed from: com.adcolony.sdk.b1$i$a */
        static final class C0744a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0733b1 f294a;

            /* renamed from: b */
            final /* synthetic */ C0841h0 f295b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0744a(C0733b1 b1Var, C0841h0 h0Var) {
                super(0);
                this.f294a = b1Var;
                this.f295b = h0Var;
            }

            /* renamed from: a */
            public final void mo10556a() {
                this.f294a.setVisible(this.f295b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10556a();
                return Unit.INSTANCE;
            }
        }

        C0743i(C0733b1 b1Var) {
            this.f293a = b1Var;
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            this.f293a.m230a(h0Var, (Function0<Unit>) new C0744a(this.f293a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$j */
    public static final class C0745j implements C0856j0 {

        /* renamed from: a */
        final /* synthetic */ C0733b1 f296a;

        /* renamed from: com.adcolony.sdk.b1$j$a */
        static final class C0746a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0733b1 f297a;

            /* renamed from: b */
            final /* synthetic */ C0841h0 f298b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0746a(C0733b1 b1Var, C0841h0 h0Var) {
                super(0);
                this.f297a = b1Var;
                this.f298b = h0Var;
            }

            /* renamed from: a */
            public final void mo10557a() {
                this.f297a.setBounds(this.f298b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10557a();
                return Unit.INSTANCE;
            }
        }

        C0745j(C0733b1 b1Var) {
            this.f296a = b1Var;
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            this.f296a.m230a(h0Var, (Function0<Unit>) new C0746a(this.f296a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$k */
    public static final class C0747k implements C0856j0 {

        /* renamed from: a */
        final /* synthetic */ C0733b1 f299a;

        /* renamed from: com.adcolony.sdk.b1$k$a */
        static final class C0748a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C0733b1 f300a;

            /* renamed from: b */
            final /* synthetic */ C0841h0 f301b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0748a(C0733b1 b1Var, C0841h0 h0Var) {
                super(0);
                this.f300a = b1Var;
                this.f301b = h0Var;
            }

            /* renamed from: a */
            public final void mo10558a() {
                this.f300a.setTransparent(C0764c0.m325b(this.f301b.mo10772a(), TJAdUnitConstants.String.TRANSPARENT));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo10558a();
                return Unit.INSTANCE;
            }
        }

        C0747k(C0733b1 b1Var) {
            this.f299a = b1Var;
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            this.f299a.m230a(h0Var, (Function0<Unit>) new C0748a(this.f299a, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$l */
    static final class C0749l implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ Function0 f302a;

        C0749l(Function0 function0) {
            this.f302a = function0;
        }

        public final /* synthetic */ void run() {
            this.f302a.invoke();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$m */
    static final class C0750m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0733b1 f303a;

        /* renamed from: com.adcolony.sdk.b1$m$a */
        public static final class C0751a extends WebViewClient {

            /* renamed from: a */
            final /* synthetic */ C0733b1 f304a;

            C0751a(C0733b1 b1Var) {
                this.f304a = b1Var;
            }

            public void onPageFinished(WebView webView, String str) {
                this.f304a.destroy();
            }
        }

        C0750m(C0733b1 b1Var) {
            this.f303a = b1Var;
        }

        public final void run() {
            this.f303a.setWebChromeClient((WebChromeClient) null);
            this.f303a.setWebViewClient(new C0751a(this.f303a));
            this.f303a.clearCache(true);
            this.f303a.removeAllViews();
            this.f303a.loadUrl("about:blank");
        }
    }

    protected C0733b1(Context context, int i, C0841h0 h0Var) {
        super(context);
        this.f265a = i;
        this.f266b = h0Var;
    }

    @JvmStatic
    /* renamed from: a */
    public static final C0733b1 m224a(Context context, C0841h0 h0Var, int i, C0752c cVar) {
        return f264u.mo10553a(context, h0Var, i, cVar);
    }

    /* renamed from: d */
    private final void m233d() {
        ArrayList<String> j;
        ArrayList<C0856j0> i;
        C0752c cVar = this.f276l;
        if (!(cVar == null || (i = cVar.mo10587i()) == null)) {
            i.add(C0714a.m130a("WebView.execute_js", (C0856j0) new C0741h(this), true));
            i.add(C0714a.m130a("WebView.set_visible", (C0856j0) new C0743i(this), true));
            i.add(C0714a.m130a("WebView.set_bounds", (C0856j0) new C0745j(this), true));
            i.add(C0714a.m130a("WebView.set_transparent", (C0856j0) new C0747k(this), true));
        }
        C0752c cVar2 = this.f276l;
        if (cVar2 != null && (j = cVar2.mo10589j()) != null) {
            j.add("WebView.execute_js");
            j.add("WebView.set_visible");
            j.add("WebView.set_bounds");
            j.add("WebView.set_transparent");
        }
    }

    /* renamed from: g */
    private final WebViewClient m234g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return getWebViewClientApi26();
        }
        if (i >= 24) {
            return getWebViewClientApi24();
        }
        if (i >= 23) {
            return getWebViewClientApi23();
        }
        if (i >= 21) {
            return getWebViewClientApi21();
        }
        return getWebViewClientDefault();
    }

    /* access modifiers changed from: private */
    public final void setTransparent(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo10506e() {
        m233d();
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f279o, this.f280p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        C0752c cVar = this.f276l;
        if (cVar != null) {
            cVar.addView(this, layoutParams);
        }
    }

    /* renamed from: f */
    public final void mo10507f() {
        C0714a.m136b().mo10827c().mo10648a(this, this.f272h, this.f276l);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getAdSessionId() {
        return this.f272h;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyAdView getAdView() {
        return C0714a.m136b().mo10827c().mo10658d().get(this.f272h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getBaseUrl() {
        return this.f271g;
    }

    public final int getCurrentHeight() {
        return this.f280p;
    }

    public final int getCurrentWidth() {
        return this.f279o;
    }

    public final int getCurrentX() {
        return this.f277m;
    }

    public final int getCurrentY() {
        return this.f278n;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getDestroyed() {
        return this.f275k;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0823f1 getInfo() {
        return this.f274j;
    }

    public final int getInitialHeight() {
        return this.f284t;
    }

    public final int getInitialWidth() {
        return this.f283s;
    }

    public final int getInitialX() {
        return this.f281q;
    }

    public final int getInitialY() {
        return this.f282r;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyInterstitial getInterstitial() {
        return C0714a.m136b().mo10827c().mo10661f().get(this.f272h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMUrl() {
        return this.f270f;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0841h0 getMessage() {
        return this.f266b;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMraidFilepath() {
        return this.f273i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0752c getParentContainer() {
        return this.f276l;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0736c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0737d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0738e(this);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0739f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0735b();
    }

    public final int getWebViewModuleId() {
        return this.f265a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ String mo10532h() {
        AdColonyInterstitial interstitial = getInterstitial();
        if (interstitial != null) {
            String str = interstitial.mo10366a() + " : " + interstitial.getZoneID();
            return str == null ? "unknown" : str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10533i() {
        boolean z = true;
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        setWebChromeClient(new C0734a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        setWebViewClient(m234g());
        mo10534j();
        if (!(this instanceof C0848j)) {
            mo10506e();
        }
        if (this.f268d.length() <= 0) {
            z = false;
        }
        if (z) {
            mo10503a(this.f268d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public /* synthetic */ void mo10534j() {
        if (!StringsKt.startsWith$default(this.f270f, "http", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f270f, ShareInternalUtility.STAGING_PARAM, false, 2, (Object) null)) {
            loadDataWithBaseURL(this.f271g, this.f270f, "text/html", (String) null, (String) null);
        } else if (StringsKt.contains$default((CharSequence) this.f270f, (CharSequence) ".html", false, 2, (Object) null) || !StringsKt.startsWith$default(this.f270f, ShareInternalUtility.STAGING_PARAM, false, 2, (Object) null)) {
            loadUrl(this.f270f);
        } else {
            String str = this.f270f;
            loadDataWithBaseURL(str, "<html><script src=\"" + this.f270f + "\"></script></html>", "text/html", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo10535k() {
        if (this.f273i.length() > 0) {
            try {
                this.f269e = C0714a.m136b().mo10845p().mo11100a(this.f273i, false).toString();
                Regex regex = new Regex("bridge.os_name\\s*=\\s*\"\"\\s*;");
                this.f269e = regex.replaceFirst(this.f269e, "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f274j + ";\n");
            } catch (IOException e) {
                m231a((Exception) e);
            } catch (IllegalArgumentException e2) {
                m231a((Exception) e2);
            } catch (IndexOutOfBoundsException e3) {
                m231a((Exception) e3);
            }
        }
    }

    /* renamed from: l */
    public final void mo10536l() {
        if (!this.f275k) {
            this.f275k = true;
            C1038z0.m1202b((Runnable) new C0750m(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AdColonyAdView adView = getAdView();
            if (adView != null && !adView.mo10270c()) {
                C0823f1 b = C0764c0.m322b();
                C0764c0.m319a(b, "ad_session_id", getAdSessionId());
                new C0841h0("WebView.on_first_click", 1, b).mo10776c();
                adView.setUserInteraction(true);
            }
            AdColonyInterstitial interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.mo10377b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setAdSessionId(String str) {
        this.f272h = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setBaseUrl(String str) {
        this.f271g = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f277m = C0764c0.m332d(a, "x");
        this.f278n = C0764c0.m332d(a, "y");
        this.f279o = C0764c0.m332d(a, "width");
        this.f280p = C0764c0.m332d(a, "height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
            layoutParams2.width = getCurrentWidth();
            layoutParams2.height = getCurrentHeight();
            Unit unit = Unit.INSTANCE;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setInfo(C0823f1 f1Var) {
        this.f274j = f1Var;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMUrl(String str) {
        this.f270f = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f273i = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C0841h0 h0Var) {
        setVisibility(C0764c0.m325b(h0Var.mo10772a(), TJAdUnitConstants.String.VISIBLE) ? 0 : 4);
    }

    /* renamed from: b */
    public final void mo10505b(C0841h0 h0Var, int i, C0752c cVar) {
        mo10502a(h0Var, i, cVar);
        mo10506e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10502a(C0841h0 h0Var, int i, C0752c cVar) {
        this.f267c = i;
        this.f276l = cVar;
        C0823f1 a = h0Var.mo10772a();
        String i2 = C0764c0.m337i(a, "url");
        if (i2 == null) {
            i2 = C0764c0.m336h(a, "data");
        }
        this.f270f = i2;
        this.f271g = C0764c0.m336h(a, "base_url");
        this.f268d = C0764c0.m336h(a, "custom_js");
        this.f272h = C0764c0.m336h(a, "ad_session_id");
        this.f274j = C0764c0.m334f(a, TJAdUnitConstants.String.VIDEO_INFO);
        this.f273i = C0764c0.m336h(a, "mraid_filepath");
        this.f279o = C0764c0.m332d(a, "width");
        this.f280p = C0764c0.m332d(a, "height");
        this.f277m = C0764c0.m332d(a, "x");
        int d = C0764c0.m332d(a, "y");
        this.f278n = d;
        this.f283s = this.f279o;
        this.f284t = this.f280p;
        this.f281q = this.f277m;
        this.f282r = d;
        mo10535k();
        mo10507f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo10503a(String str) {
        if (this.f275k) {
            new C0817e0.C0818a().mo10684a("Ignoring call to execute_js as WebView has been destroyed.").mo10685a(C0817e0.f428c);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C0817e0.C0818a().mo10684a("Device reporting incorrect OS version, evaluateJavascript ").mo10684a("is not available. Disabling AdColony.").mo10685a(C0817e0.f433h);
                AdColony.disable();
            }
        } else {
            loadUrl(Intrinsics.stringPlus("javascript:", str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo10504a(C0823f1 f1Var, String str) {
        Context a = C0714a.m129a();
        C0730b bVar = a instanceof C0730b ? (C0730b) a : null;
        if (bVar == null) {
            return false;
        }
        C0714a.m136b().mo10827c().mo10647a((Context) bVar, f1Var, str);
        return true;
    }

    /* renamed from: a */
    private final void m231a(Exception exc) {
        new C0817e0.C0818a().mo10684a(exc.getClass().toString()).mo10684a(" during metadata injection w/ metadata = ").mo10684a(C0764c0.m336h(this.f274j, "metadata")).mo10685a(C0817e0.f434i);
        C0752c cVar = this.f276l;
        if (cVar != null) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m319a(b, "id", getAdSessionId());
            new C0841h0("AdSession.on_error", cVar.mo10591k(), b).mo10776c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m226a(int i, String str, String str2) {
        C0752c cVar = this.f276l;
        if (cVar != null) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m326b(b, "id", this.f267c);
            C0764c0.m319a(b, "ad_session_id", getAdSessionId());
            C0764c0.m326b(b, "container_id", cVar.mo10572c());
            C0764c0.m326b(b, "code", i);
            C0764c0.m319a(b, "error", str);
            C0764c0.m319a(b, "url", str2);
            new C0841h0("WebView.on_error", cVar.mo10591k(), b).mo10776c();
        }
        C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        a.mo10684a(str).mo10685a(C0817e0.f434i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m230a(C0841h0 h0Var, Function0<Unit> function0) {
        C0823f1 a = h0Var.mo10772a();
        if (C0764c0.m332d(a, "id") == this.f267c) {
            int d = C0764c0.m332d(a, "container_id");
            C0752c cVar = this.f276l;
            if (cVar != null && d == cVar.mo10572c()) {
                String h = C0764c0.m336h(a, "ad_session_id");
                C0752c cVar2 = this.f276l;
                if (Intrinsics.areEqual((Object) h, (Object) cVar2 == null ? null : cVar2.mo10563a())) {
                    C1038z0.m1202b((Runnable) new C0749l(function0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10501a(C0841h0 h0Var) {
        setBounds(h0Var);
    }
}
