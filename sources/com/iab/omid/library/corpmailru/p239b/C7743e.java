package com.iab.omid.library.corpmailru.p239b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.p241d.C7755c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.b.e */
public class C7743e {

    /* renamed from: a */
    private static C7743e f18449a = new C7743e();

    private C7743e() {
    }

    /* renamed from: a */
    public static final C7743e m21647a() {
        return f18449a;
    }

    /* renamed from: a */
    public void mo54827a(WebView webView) {
        mo54833a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54828a(WebView webView, float f) {
        mo54833a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54829a(WebView webView, ErrorType errorType, String str) {
        mo54833a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54830a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54837a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54831a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54833a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54833a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54832a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54833a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public void mo54833a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54836a(sb, objArr);
            sb.append(")}");
            mo54834a(webView, sb);
            return;
        }
        C7755c.m21710a("The WebView is null for " + str);
    }

    /* renamed from: a */
    public void mo54834a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo54835a(WebView webView, JSONObject jSONObject) {
        mo54833a(webView, "init", jSONObject);
    }

    /* renamed from: a */
    public void mo54836a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54837a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54838b(WebView webView) {
        mo54833a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54839b(WebView webView, String str) {
        mo54833a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54840b(WebView webView, JSONObject jSONObject) {
        mo54833a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54841c(WebView webView) {
        mo54833a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54842c(WebView webView, String str) {
        mo54833a(webView, "setState", str);
    }
}
