package com.iab.omid.library.oguryco.p269b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.oguryco.adsession.ErrorType;
import com.iab.omid.library.oguryco.p271d.C8008c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.b.e */
public class C7996e {

    /* renamed from: a */
    private static C7996e f19031a = new C7996e();

    private C7996e() {
    }

    /* renamed from: a */
    public static C7996e m22781a() {
        return f19031a;
    }

    /* renamed from: a */
    public void mo55819a(WebView webView) {
        mo55825a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55820a(WebView webView, float f) {
        mo55825a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55821a(WebView webView, ErrorType errorType, String str) {
        mo55825a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55822a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55829a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55823a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55825a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55825a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55824a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55825a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55825a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55828a(sb, objArr);
            sb.append(")}");
            mo55826a(webView, sb);
            return;
        }
        C8008c.m22844a("The WebView is null for ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55826a(final WebView webView, StringBuilder sb) {
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
    public void mo55827a(WebView webView, JSONObject jSONObject) {
        mo55825a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55828a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55829a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }

    /* renamed from: b */
    public void mo55830b(WebView webView) {
        mo55825a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55831b(WebView webView, String str) {
        mo55825a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55832b(WebView webView, JSONObject jSONObject) {
        mo55825a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55833c(WebView webView) {
        mo55825a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55834c(WebView webView, String str) {
        mo55825a(webView, "setState", str);
    }
}
