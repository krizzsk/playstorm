package com.bytedance.sdk.component.p090a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.a.z */
/* compiled from: WebViewBridge */
public class C2596z extends C2554a {

    /* renamed from: j */
    static final /* synthetic */ boolean f5556j = (!C2596z.class.desiredAssertionStatus());

    /* renamed from: h */
    protected String f5557h;

    /* renamed from: i */
    protected WebView f5558i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Context mo16538a(C2569j jVar) {
        if (jVar.f5488e != null) {
            return jVar.f5488e;
        }
        if (jVar.f5484a != null) {
            return jVar.f5484a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16539a() {
        return this.f5558i.getUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16545b(C2569j jVar) {
        this.f5558i = jVar.f5484a;
        this.f5557h = jVar.f5486c;
        if (Build.VERSION.SDK_INT >= 17 && !jVar.f5497n) {
            mo16619c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16619c() {
        if (f5556j || this.f5558i != null) {
            this.f5558i.addJavascriptInterface(this, this.f5557h);
            return;
        }
        throw new AssertionError();
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16544b() {
        super.mo16544b();
        mo16620d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16620d() {
        this.f5558i.removeJavascriptInterface(this.f5557h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16543a(String str, C2579q qVar) {
        if (qVar == null || TextUtils.isEmpty(qVar.f5508h)) {
            super.mo16543a(str, qVar);
            return;
        }
        String str2 = qVar.f5508h;
        m6601a(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(String.format("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16542a(String str) {
        m6601a(str, "javascript:" + this.f5557h + "._handleMessageFromToutiao(" + str + ")");
    }

    /* renamed from: a */
    private void m6601a(String str, final String str2) {
        if (!this.f5451f && !TextUtils.isEmpty(str2)) {
            C25971 r3 = new Runnable() {
                public void run() {
                    if (!C2596z.this.f5451f) {
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                C2568i.m6523a("Invoking Jsb using evaluateJavascript: " + str2);
                                C2596z.this.f5558i.evaluateJavascript(str2, (ValueCallback) null);
                                return;
                            }
                            C2568i.m6523a("Invoking Jsb using loadUrl: " + str2);
                            C2596z.this.f5558i.loadUrl(str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C2568i.m6523a("Received call on sub-thread, posting to main thread: " + str2);
                this.f5449d.post(r3);
                return;
            }
            r3.run();
        }
    }
}
