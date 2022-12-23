package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C0765c1;
import com.tapjoy.TJAdUnitConstants;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.adcolony.sdk.j */
public class C0848j extends C0765c1 {

    /* renamed from: F */
    public static final C0854f f499F = new C0854f((DefaultConstructorMarker) null);

    /* renamed from: com.adcolony.sdk.j$a */
    protected class C0849a extends C0765c1.C0768c {
        public C0849a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0855g().mo10800a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$b */
    protected class C0850b extends C0765c1.C0769d {
        public C0850b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0855g().mo10800a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$c */
    protected class C0851c extends C0765c1.C0770e {
        public C0851c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0855g().mo10800a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$d */
    protected class C0852d extends C0765c1.C0771f {
        public C0852d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0855g().mo10800a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$e */
    protected class C0853e extends C0765c1.C0772g {
        public C0853e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C0855g().mo10800a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$f */
    public static final class C0854f {
        private C0854f() {
        }

        public /* synthetic */ C0854f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C0848j mo10799a(Context context, C0841h0 h0Var) {
            C0848j jVar;
            int e = C0714a.m136b().mo10847r().mo10790e();
            if (Intrinsics.areEqual((Object) C0764c0.m336h(h0Var.mo10772a(), "type"), (Object) "aurora")) {
                jVar = new C0815e(context, e, h0Var);
            } else {
                jVar = new C0848j(context, e, h0Var);
            }
            jVar.mo10533i();
            return jVar;
        }
    }

    /* renamed from: com.adcolony.sdk.j$g */
    private final class C0855g {
        public C0855g() {
        }

        /* renamed from: a */
        public final void mo10800a() {
            C0841h0 a;
            if (!(C0848j.this instanceof C0890l)) {
                C0823f1 b = C0764c0.m322b();
                C0848j jVar = C0848j.this;
                C0764c0.m328b(b, "success", true);
                C0764c0.m326b(b, "id", jVar.getAdc3ModuleId());
                C0841h0 message = C0848j.this.getMessage();
                if (message != null && (a = message.mo10773a(b)) != null) {
                    a.mo10776c();
                }
            }
        }
    }

    protected C0848j(Context context, int i, C0841h0 h0Var) {
        super(context, i, h0Var);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C0848j m601a(Context context, C0841h0 h0Var) {
        return f499F.mo10799a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C0850b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C0851c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C0852d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C0853e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C0849a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo10533i() {
        C0841h0 message = getMessage();
        C0823f1 a = message == null ? null : message.mo10772a();
        if (a == null) {
            a = C0764c0.m322b();
        }
        setMraidFilepath(C0764c0.m336h(a, "mraid_filepath"));
        setBaseUrl(C0764c0.m336h(a, "base_url"));
        setIab(C0764c0.m334f(a, "iab"));
        setInfo(C0764c0.m334f(a, TJAdUnitConstants.String.VIDEO_INFO));
        setAdSessionId(C0764c0.m336h(a, "ad_session_id"));
        setMUrl(mo10610d(a));
        super.mo10533i();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C0841h0 h0Var) {
        super.setBounds(h0Var);
        C0823f1 b = C0764c0.m322b();
        C0764c0.m328b(b, "success", true);
        C0764c0.m326b(b, "id", getAdc3ModuleId());
        h0Var.mo10773a(b).mo10776c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C0841h0 h0Var) {
        super.setVisible(h0Var);
        C0823f1 b = C0764c0.m322b();
        C0764c0.m328b(b, "success", true);
        C0764c0.m326b(b, "id", getAdc3ModuleId());
        h0Var.mo10773a(b).mo10776c();
    }
}
