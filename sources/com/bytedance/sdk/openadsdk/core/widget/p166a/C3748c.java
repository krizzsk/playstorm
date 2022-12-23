package com.bytedance.sdk.openadsdk.core.widget.p166a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.utils.C3999i;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.c */
/* compiled from: TTWebChromeClient */
public class C3748c extends WebChromeClient {

    /* renamed from: a */
    private static final String f9735a = WebChromeClient.class.getSimpleName();

    /* renamed from: b */
    private final C3728w f9736b;

    /* renamed from: c */
    private C3171n f9737c;

    public C3748c(C3728w wVar, C3171n nVar) {
        this.f9736b = wVar;
        this.f9737c = nVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m12306a(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !m12306a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m12306a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"bytedance".equals(parse.getScheme().toLowerCase())) {
                return false;
            }
            C3999i.m13114a(parse, this.f9736b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C3171n nVar = this.f9737c;
        if (nVar != null) {
            nVar.mo18780a(webView, i);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
