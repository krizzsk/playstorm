package com.iab.omid.library.smaato.p275b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.p277d.C8058c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.b.e */
public class C8046e {

    /* renamed from: a */
    private static C8046e f19144a = new C8046e();

    private C8046e() {
    }

    /* renamed from: a */
    public static final C8046e m23005a() {
        return f19144a;
    }

    /* renamed from: a */
    public void mo56013a(WebView webView) {
        mo56019a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo56014a(WebView webView, float f) {
        mo56019a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo56015a(WebView webView, ErrorType errorType, String str) {
        mo56019a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo56016a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo56023a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo56017a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo56019a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo56019a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo56018a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo56019a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56019a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo56022a(sb, objArr);
            sb.append(")}");
            mo56020a(webView, sb);
            return;
        }
        C8058c.m23068a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56020a(final WebView webView, StringBuilder sb) {
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
    public void mo56021a(WebView webView, JSONObject jSONObject) {
        mo56019a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56022a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo56023a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo56024b(WebView webView) {
        mo56019a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo56025b(WebView webView, String str) {
        mo56019a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo56026b(WebView webView, JSONObject jSONObject) {
        mo56019a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo56027c(WebView webView) {
        mo56019a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo56028c(WebView webView, String str) {
        mo56019a(webView, "setState", str);
    }
}
