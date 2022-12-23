package com.iab.omid.library.fyber.p245b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.p247d.C7806c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.b.e */
public class C7794e {

    /* renamed from: a */
    private static C7794e f18563a = new C7794e();

    private C7794e() {
    }

    /* renamed from: a */
    public static final C7794e m21873a() {
        return f18563a;
    }

    /* renamed from: a */
    public void mo55025a(WebView webView) {
        mo55031a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55026a(WebView webView, float f) {
        mo55031a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55027a(WebView webView, ErrorType errorType, String str) {
        mo55031a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55028a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55035a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55029a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55031a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55031a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55030a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55031a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55031a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55034a(sb, objArr);
            sb.append(")}");
            mo55032a(webView, sb);
            return;
        }
        C7806c.m21938a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55032a(final WebView webView, StringBuilder sb) {
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
    public void mo55033a(WebView webView, JSONObject jSONObject) {
        mo55031a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55034a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55035a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55036b(WebView webView) {
        mo55031a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55037b(WebView webView, String str) {
        mo55031a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55038b(WebView webView, JSONObject jSONObject) {
        mo55031a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55039c(WebView webView) {
        mo55031a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55040c(WebView webView, String str) {
        mo55031a(webView, "setState", str);
    }
}
