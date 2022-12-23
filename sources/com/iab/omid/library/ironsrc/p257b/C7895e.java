package com.iab.omid.library.ironsrc.p257b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.p259d.C7907c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.b.e */
public class C7895e {

    /* renamed from: a */
    private static C7895e f18793a = new C7895e();

    private C7895e() {
    }

    /* renamed from: a */
    public static C7895e m22323a() {
        return f18793a;
    }

    /* renamed from: a */
    public void mo55406a(WebView webView) {
        mo55412a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55407a(WebView webView, float f) {
        mo55412a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55408a(WebView webView, ErrorType errorType, String str) {
        mo55412a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55409a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55416a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55410a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55412a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55412a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55411a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55412a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55412a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55415a(sb, objArr);
            sb.append(")}");
            mo55413a(webView, sb);
            return;
        }
        C7907c.m22385a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55413a(final WebView webView, StringBuilder sb) {
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
    public void mo55414a(WebView webView, JSONObject jSONObject) {
        mo55412a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55415a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55416a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55417b(WebView webView) {
        mo55412a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55418b(WebView webView, String str) {
        mo55412a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55419b(WebView webView, JSONObject jSONObject) {
        mo55412a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55420c(WebView webView) {
        mo55412a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55421c(WebView webView, String str) {
        mo55412a(webView, "setState", str);
    }
}
