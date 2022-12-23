package com.iab.omid.library.adcolony.p221b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.p223d.C7605c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.b.e */
public class C7593e {

    /* renamed from: a */
    private static C7593e f18099a = new C7593e();

    private C7593e() {
    }

    /* renamed from: a */
    public static final C7593e m20959a() {
        return f18099a;
    }

    /* renamed from: a */
    public void mo54234a(WebView webView) {
        mo54240a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo54235a(WebView webView, float f) {
        mo54240a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo54236a(WebView webView, ErrorType errorType, String str) {
        mo54240a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo54237a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo54244a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo54238a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo54240a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo54240a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo54239a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo54240a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54240a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo54243a(sb, objArr);
            sb.append(")}");
            mo54241a(webView, sb);
            return;
        }
        C7605c.m21024a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54241a(final WebView webView, StringBuilder sb) {
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
    public void mo54242a(WebView webView, JSONObject jSONObject) {
        mo54240a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54243a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo54244a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo54245b(WebView webView) {
        mo54240a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo54246b(WebView webView, String str) {
        mo54240a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo54247b(WebView webView, JSONObject jSONObject) {
        mo54240a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo54248c(WebView webView) {
        mo54240a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo54249c(WebView webView, String str) {
        mo54240a(webView, "setState", str);
    }
}
