package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dh */
public final class C11512dh {

    /* renamed from: a */
    private static C11512dh f27863a = new C11512dh();

    private C11512dh() {
    }

    /* renamed from: a */
    public static final C11512dh m33412a() {
        return f27863a;
    }

    /* renamed from: a */
    private void m33413a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public final void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m33414a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append(Typography.quote);
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append(Typography.quote);
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(Typography.quote);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public static boolean m33415a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: a */
    public final void mo72304a(WebView webView, float f) {
        mo72307a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo72305a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo72307a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo72307a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public final void mo72306a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo72307a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public final void mo72307a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m33414a(sb, objArr);
            sb.append(")}");
            m33413a(webView, sb);
            return;
        }
        C11523dp.m33443a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* renamed from: b */
    public final void mo72308b(WebView webView, String str) {
        mo72307a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    public final void mo72309c(WebView webView, String str) {
        mo72307a(webView, "setState", str);
    }
}
