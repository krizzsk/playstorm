package com.ogury.p376ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ogury.p376ed.internal.C10641iu;
import com.ogury.p376ed.internal.C10654jd;

/* renamed from: com.ogury.ed.internal.jh */
public final class C10660jh extends WebView {

    /* renamed from: a */
    private C10483eb f26903a;

    /* renamed from: b */
    private MutableContextWrapper f26904b;

    /* renamed from: c */
    private boolean f26905c;

    /* renamed from: d */
    private C10664jl f26906d;

    /* renamed from: e */
    private String f26907e;

    /* renamed from: f */
    private C10580hb f26908f;

    /* renamed from: g */
    private boolean f26909g;

    /* renamed from: h */
    private C10589hj f26910h;

    /* renamed from: i */
    private C10662jj f26911i;

    /* renamed from: j */
    private boolean f26912j;

    /* renamed from: k */
    private boolean f26913k;

    /* renamed from: l */
    private C10661ji f26914l;

    /* renamed from: m */
    private C10618id f26915m;

    /* renamed from: n */
    private C10560gm f26916n;

    /* renamed from: o */
    private C10654jd f26917o;

    /* renamed from: p */
    private final C10810ob f26918p;

    public /* synthetic */ C10660jh(Context context, C10483eb ebVar) {
        this(context, ebVar, new MutableContextWrapper(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10660jh(Context context, C10483eb ebVar, MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ebVar, "ad");
        C10765mq.m32773b(mutableContextWrapper, "mutableContext");
        this.f26903a = ebVar;
        this.f26904b = mutableContextWrapper;
        this.f26905c = true;
        this.f26907e = "loading";
        this.f26908f = new C10580hb(this);
        this.f26910h = new C10638is(this);
        this.f26911i = new C10662jj(this);
        this.f26915m = C10618id.f26806a;
        this.f26916n = C10560gm.f26679a;
        C10654jd.C10655a aVar = C10654jd.f26893a;
        this.f26917o = C10654jd.C10655a.m32568a(context, this.f26903a);
        this.f26918p = new C10810ob("bunaZiua");
        setAdUnit(this.f26903a.mo67249m());
        setWebViewClient(this.f26911i);
    }

    public final boolean getShowSdkCloseButton() {
        return this.f26905c;
    }

    public final void setShowSdkCloseButton(boolean z) {
        this.f26905c = z;
    }

    public final C10664jl getVisibilityChangedListener() {
        return this.f26906d;
    }

    public final void setVisibilityChangedListener(C10664jl jlVar) {
        this.f26906d = jlVar;
    }

    public final String getAdState() {
        return this.f26907e;
    }

    public final void setAdState(String str) {
        C10765mq.m32773b(str, "<set-?>");
        this.f26907e = str;
    }

    public final C10580hb getMraidCommandExecutor() {
        C10580hb hbVar = this.f26908f;
        return hbVar == null ? new C10580hb(this) : hbVar;
    }

    public final boolean getContainsMraid() {
        return this.f26909g;
    }

    public final void setContainsMraid(boolean z) {
        this.f26909g = z;
    }

    public final C10589hj getMraidUrlHandler() {
        return this.f26910h;
    }

    public final void setMraidUrlHandler(C10589hj hjVar) {
        C10765mq.m32773b(hjVar, "<set-?>");
        this.f26910h = hjVar;
    }

    /* renamed from: a */
    public final boolean mo67687a() {
        return this.f26912j;
    }

    public final void setResumed(boolean z) {
        this.f26912j = z;
    }

    /* renamed from: b */
    public final boolean mo67689b() {
        return this.f26913k;
    }

    public final void setMultiBrowserOpened(boolean z) {
        this.f26913k = z;
    }

    public final C10661ji getClientAdapter() {
        return this.f26914l;
    }

    public final void setClientAdapter(C10661ji jiVar) {
        this.f26914l = jiVar;
        C10662jj jjVar = this.f26911i;
        if (jjVar != null) {
            jjVar.mo67724a(jiVar);
        }
    }

    public final void setTestTopActivityMonitor(C10560gm gmVar) {
        C10765mq.m32773b(gmVar, "topActivityMonitor");
        this.f26916n = gmVar;
    }

    public final void setTestMraidLifecycle(C10654jd jdVar) {
        C10765mq.m32773b(jdVar, "mraidLifecycle");
        this.f26917o = jdVar;
    }

    public final void setMraidCommandExecutor(C10580hb hbVar) {
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        this.f26908f = hbVar;
    }

    public final void setTestCacheStore(C10618id idVar) {
        C10765mq.m32773b(idVar, "mraidCacheStore");
        this.f26915m = idVar;
    }

    public final void setTestMraidViewClientWrapper(C10662jj jjVar) {
        C10765mq.m32773b(jjVar, "mraidWebViewClientWrapper");
        this.f26911i = jjVar;
    }

    public final C10662jj getMraidWebViewClient() {
        return this.f26911i;
    }

    private final void setAdUnit(C10493ek ekVar) {
        C10662jj jjVar = this.f26911i;
        if (jjVar != null) {
            jjVar.mo67543a(ekVar);
        }
    }

    /* renamed from: c */
    public final void mo67690c() {
        this.f26917o.mo67682a(this);
    }

    /* renamed from: j */
    private final void m32577j() {
        this.f26917o.mo67683b(this);
    }

    /* renamed from: d */
    public final void mo67691d() {
        this.f26917o.mo67684c(this);
    }

    /* renamed from: e */
    public final void mo67692e() {
        this.f26917o.mo67685d(this);
    }

    public final void setOnVisibilityChangedListener(C10664jl jlVar) {
        C10765mq.m32773b(jlVar, "visibilityListener");
        this.f26906d = jlVar;
    }

    /* renamed from: a */
    public final void mo67686a(String str) {
        C10765mq.m32773b(str, "url");
        if (this.f26918p.mo67883a(str)) {
            this.f26909g = true;
            m32577j();
            C10661ji jiVar = this.f26914l;
            if (jiVar != null) {
                jiVar.mo67079a((WebView) this);
            }
        }
        this.f26910h.mo67541a(str, this, this.f26903a);
    }

    /* renamed from: b */
    public final void mo67688b(String str) {
        C10765mq.m32773b(str, "url");
        getMraidCommandExecutor().mo67536c(str);
    }

    /* renamed from: f */
    public final void mo67693f() {
        getMraidCommandExecutor().mo67533c();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C10765mq.m32773b(view, "changedView");
        C10664jl jlVar = this.f26906d;
        if (jlVar != null) {
            jlVar.mo67075a();
        }
        super.onVisibilityChanged(view, i);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient != null && !C10765mq.m32772a((Object) this.f26911i, (Object) webViewClient)) {
            new IllegalAccessError("Cannot change the webview client for MraidWebView");
        }
        super.setWebViewClient(webViewClient);
    }

    /* renamed from: g */
    public final void mo67694g() {
        C10618id.m32367a(this.f26903a.mo67222b());
        C10661ji jiVar = this.f26914l;
        if (jiVar != null) {
            jiVar.mo67631a();
        }
    }

    /* renamed from: h */
    public final boolean mo67703h() {
        return this.f26912j && !this.f26913k;
    }

    public final String toString() {
        return C10765mq.m32765a("MraidWebView>> ", (Object) Integer.toHexString(System.identityHashCode(this)));
    }

    /* renamed from: i */
    public final void mo67704i() {
        this.f26906d = null;
        setClientAdapter((C10661ji) null);
        C10641iu.C10642a aVar = C10641iu.f26855a;
        this.f26910h = C10641iu.C10642a.m32500a();
        this.f26908f = null;
        setWebViewClient((WebViewClient) null);
        this.f26911i = null;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity a = C10560gm.m32095a();
        if (a != null) {
            this.f26904b.setBaseContext(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MutableContextWrapper mutableContextWrapper = this.f26904b;
        mutableContextWrapper.setBaseContext(mutableContextWrapper.getBaseContext().getApplicationContext());
    }
}
