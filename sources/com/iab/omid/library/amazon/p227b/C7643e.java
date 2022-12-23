package com.iab.omid.library.amazon.p227b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.p229d.C7655c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.b.e */
public class C7643e {

    /* renamed from: a */
    private static C7643e f18216a = new C7643e();

    private C7643e() {
    }

    /* renamed from: a */
    public static final C7643e m21189a() {
        return f18216a;
    }

    /* renamed from: a */
    public void mo54433a(WebView webView) {
        mo54439a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54434a(WebView webView, float f) {
        mo54439a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54435a(WebView webView, ErrorType errorType, String str) {
        mo54439a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54436a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54443a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54437a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54439a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54439a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54438a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54439a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54439a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54442a(sb, objArr);
            sb.append(")}");
            mo54440a(webView, sb);
            return;
        }
        C7655c.m21254a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54440a(final WebView webView, StringBuilder sb) {
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
    public void mo54441a(WebView webView, JSONObject jSONObject) {
        mo54439a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54442a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54443a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54444b(WebView webView) {
        mo54439a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54445b(WebView webView, String str) {
        mo54439a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54446b(WebView webView, JSONObject jSONObject) {
        mo54439a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54447c(WebView webView) {
        mo54439a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54448c(WebView webView, String str) {
        mo54439a(webView, "setState", str);
    }
}
