package com.iab.omid.library.vungle.p281b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.p283d.C8108c;
import kotlin.text.Typography;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.b.e */
public class C8096e {

    /* renamed from: a */
    private static C8096e f19257a = new C8096e();

    private C8096e() {
    }

    /* renamed from: a */
    public static final C8096e m23229a() {
        return f19257a;
    }

    /* renamed from: a */
    public void mo56207a(WebView webView) {
        mo56213a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo56208a(WebView webView, float f) {
        mo56213a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo56209a(WebView webView, ErrorType errorType, String str) {
        mo56213a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo56210a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo56217a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo56211a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo56213a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo56213a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo56212a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo56213a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56213a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo56216a(sb, objArr);
            sb.append(")}");
            mo56214a(webView, sb);
            return;
        }
        C8108c.m23292a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56214a(final WebView webView, StringBuilder sb) {
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
    public void mo56215a(WebView webView, JSONObject jSONObject) {
        mo56213a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56216a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo56217a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo56218b(WebView webView) {
        mo56213a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo56219b(WebView webView, String str) {
        mo56213a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo56220b(WebView webView, JSONObject jSONObject) {
        mo56213a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo56221c(WebView webView) {
        mo56213a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo56222c(WebView webView, String str) {
        mo56213a(webView, "setState", str);
    }
}
