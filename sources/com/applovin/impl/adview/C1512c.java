package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;

/* renamed from: com.applovin.impl.adview.c */
class C1512c extends WebChromeClient {

    /* renamed from: a */
    private final C2092v f1876a;

    /* renamed from: b */
    private final C1497b f1877b;

    public C1512c(C1497b bVar, C1959m mVar) {
        this.f1876a = mVar.mo14286A();
        this.f1877b = bVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1876a;
            vVar.mo14792d("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (!C2092v.m5047a()) {
            return true;
        }
        this.f1876a.mo14789b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2092v.m5047a()) {
            return true;
        }
        C2092v vVar = this.f1876a;
        vVar.mo14792d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2092v.m5047a()) {
            return true;
        }
        C2092v vVar = this.f1876a;
        vVar.mo14792d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C2092v.m5047a()) {
            return true;
        }
        C2092v vVar = this.f1876a;
        vVar.mo14792d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        C1497b bVar;
        if (i == 100 && (bVar = this.f1877b) != null) {
            bVar.mo12876a(webView);
        }
    }
}
