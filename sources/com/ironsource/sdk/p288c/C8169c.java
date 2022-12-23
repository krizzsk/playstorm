package com.ironsource.sdk.p288c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.environment.p205e.C6421a;
import com.ironsource.sdk.C8149a;
import com.ironsource.sdk.p286a.C8150a;
import com.ironsource.sdk.p286a.C8154d;
import com.ironsource.sdk.p286a.C8156f;
import com.ironsource.sdk.p287b.C8159a;
import com.ironsource.sdk.p287b.C8160b;
import com.ironsource.sdk.p287b.C8162c;
import com.ironsource.sdk.p288c.C8175e;
import com.ironsource.sdk.utils.C8395d;
import com.ironsource.sdk.utils.Logger;
import com.vungle.warren.model.Advertisement;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.c */
public class C8169c implements C8175e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f19478f = C8169c.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final String f19479a;

    /* renamed from: b */
    public String f19480b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public WebView f19481c;

    /* renamed from: d */
    public C8160b f19482d;

    /* renamed from: e */
    public C8149a f19483e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Activity f19484g;

    public C8169c(C8159a aVar, Activity activity, String str, C8149a aVar2) {
        this.f19484g = activity;
        C8160b bVar = new C8160b();
        this.f19482d = bVar;
        bVar.f19453d = str;
        this.f19479a = str;
        this.f19482d.f19450a = aVar;
        this.f19483e = aVar2;
    }

    /* renamed from: a */
    static /* synthetic */ void m23480a(C8169c cVar, final String str) {
        Logger.m24028i(f19478f, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f19484g);
        cVar.f19481c = webView;
        webView.addJavascriptInterface(new C8168b(cVar), "containerMsgHandler");
        cVar.f19481c.setWebViewClient(new C8162c(new C8175e.C8176a() {
            /* renamed from: a */
            public final void mo56454a(String str) {
                String a = C8169c.f19478f;
                Logger.m24028i(a, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                C8169c.this.mo56450b(str, str);
            }

            /* renamed from: b */
            public final void mo56455b(String str) {
                String a = C8169c.f19478f;
                Logger.m24028i(a, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) C8169c.this.f19481c.getParent()).removeView(C8169c.this.f19481c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C8169c.this.m23484c();
            }
        }));
        C8395d.m24055a(cVar.f19481c);
        cVar.f19482d.f19452c = cVar.f19481c;
    }

    /* renamed from: b */
    static /* synthetic */ String m23482b(C8169c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(Advertisement.FILE_SCHEME);
        sb.append(cVar.f19480b);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m23484c() {
        mo56439a("", "");
    }

    /* renamed from: a */
    public final synchronized void mo56439a(final String str, final String str2) {
        if (this.f19484g != null) {
            Logger.m24028i(f19478f, "performCleanup");
            C6421a.f16325a.mo35928a(new Runnable() {
                public final void run() {
                    try {
                        if (C8169c.this.f19481c != null) {
                            C8169c.this.f19481c.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", C8169c.this.f19479a);
                        if (C8169c.this.f19482d != null) {
                            C8169c.this.f19482d.mo56428a(str, jSONObject);
                            C8160b c = C8169c.this.f19482d;
                            c.f19450a = null;
                            c.f19451b = null;
                        }
                        C8160b unused = C8169c.this.f19482d = null;
                        Activity unused2 = C8169c.this.f19484g = null;
                    } catch (Exception e) {
                        String a = C8169c.f19478f;
                        Log.e(a, "performCleanup | could not destroy ISNAdView webView ID: " + C8169c.this.f19479a);
                        C8154d.m23442a(C8156f.f19433o, (Map<String, Object>) new C8150a().mo56415a("callfailreason", e.getMessage()).f19410a);
                        C8169c.this.mo56450b(str2, e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo56440a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            mo56450b(str3, "action parameter empty");
            return;
        }
        String str4 = f19478f;
        Logger.m24028i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f19481c.onPause();
            } else if (str.equals("onResume")) {
                this.f19481c.onResume();
            } else {
                mo56450b(str3, "action not supported");
                return;
            }
            this.f19482d.mo56424a(str2);
        } catch (Exception unused) {
            mo56450b(str3, "failed to perform action");
        }
    }

    /* renamed from: a */
    public final void mo56441a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f19482d.mo56429b(str);
        } catch (Exception e) {
            String str3 = f19478f;
            Logger.m24028i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final WebView mo56442b() {
        return this.f19481c;
    }

    /* renamed from: b */
    public final void mo56450b(String str, String str2) {
        C8160b bVar = this.f19482d;
        if (bVar != null) {
            bVar.mo56426a(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo56443b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f19482d.mo56427a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            String str3 = f19478f;
            Logger.m24028i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        C8160b bVar = this.f19482d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.mo56430c(optString)) {
                bVar.mo56428a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.mo56427a(bVar.mo56423a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f19454e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
