package com.iab.omid.library.applovin.p233b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.p235d.C7705c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.b.e */
public class C7693e {

    /* renamed from: a */
    private static C7693e f18333a = new C7693e();

    private C7693e() {
    }

    /* renamed from: a */
    public static final C7693e m21419a() {
        return f18333a;
    }

    /* renamed from: a */
    public void mo54632a(WebView webView) {
        mo54638a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54633a(WebView webView, float f) {
        mo54638a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54634a(WebView webView, ErrorType errorType, String str) {
        mo54638a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54635a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54642a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54636a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54638a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54638a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54637a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54638a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54638a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54641a(sb, objArr);
            sb.append(")}");
            mo54639a(webView, sb);
            return;
        }
        C7705c.m21484a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54639a(final WebView webView, StringBuilder sb) {
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
    public void mo54640a(WebView webView, JSONObject jSONObject) {
        mo54638a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54641a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54642a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54643b(WebView webView) {
        mo54638a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54644b(WebView webView, String str) {
        mo54638a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54645b(WebView webView, JSONObject jSONObject) {
        mo54638a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54646c(WebView webView) {
        mo54638a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54647c(WebView webView, String str) {
        mo54638a(webView, "setState", str);
    }
}
