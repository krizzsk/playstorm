package com.iab.omid.library.inmobi.p251b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.p253d.C7857c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.b.e */
public class C7845e {

    /* renamed from: a */
    private static C7845e f18679a = new C7845e();

    private C7845e() {
    }

    /* renamed from: a */
    public static final C7845e m22101a() {
        return f18679a;
    }

    /* renamed from: a */
    public void mo55220a(WebView webView) {
        mo55226a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo55221a(WebView webView, float f) {
        mo55226a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo55222a(WebView webView, ErrorType errorType, String str) {
        mo55226a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo55223a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo55230a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo55224a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo55226a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo55226a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo55225a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo55226a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55226a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo55229a(sb, objArr);
            sb.append(")}");
            mo55227a(webView, sb);
            return;
        }
        C7857c.m22164a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55227a(final WebView webView, StringBuilder sb) {
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
    public void mo55228a(WebView webView, JSONObject jSONObject) {
        mo55226a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55229a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo55230a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo55231b(WebView webView) {
        mo55226a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo55232b(WebView webView, String str) {
        mo55226a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo55233b(WebView webView, JSONObject jSONObject) {
        mo55226a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo55234c(WebView webView) {
        mo55226a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo55235c(WebView webView, String str) {
        mo55226a(webView, "setState", str);
    }
}
