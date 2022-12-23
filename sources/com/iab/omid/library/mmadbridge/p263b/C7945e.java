package com.iab.omid.library.mmadbridge.p263b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.p265d.C7957c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.b.e */
public class C7945e {

    /* renamed from: a */
    private static C7945e f18907a = new C7945e();

    private C7945e() {
    }

    /* renamed from: a */
    public static final C7945e m22548a() {
        return f18907a;
    }

    /* renamed from: a */
    public void mo55604a(WebView webView) {
        mo55610a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55605a(WebView webView, float f) {
        mo55610a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55606a(WebView webView, ErrorType errorType, String str) {
        mo55610a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55607a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55614a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55608a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55610a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55610a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55609a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55610a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55610a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55613a(sb, objArr);
            sb.append(")}");
            mo55611a(webView, sb);
            return;
        }
        C7957c.m22613a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55611a(final WebView webView, StringBuilder sb) {
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
    public void mo55612a(WebView webView, JSONObject jSONObject) {
        mo55610a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55613a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55614a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55615b(WebView webView) {
        mo55610a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55616b(WebView webView, String str) {
        mo55610a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55617b(WebView webView, JSONObject jSONObject) {
        mo55610a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55618c(WebView webView) {
        mo55610a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55619c(WebView webView, String str) {
        mo55610a(webView, "setState", str);
    }
}
