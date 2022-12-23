package com.ironsource.sdk.p287b;

import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.environment.p205e.C6421a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.b */
public class C8160b {

    /* renamed from: a */
    public C8159a f19450a;

    /* renamed from: b */
    public C8163d f19451b = new C8163d();

    /* renamed from: c */
    public WebView f19452c;

    /* renamed from: d */
    public String f19453d;

    /* renamed from: e */
    public String f19454e = C8160b.class.getSimpleName();

    /* renamed from: f */
    private String[] f19455f = {"handleGetViewVisibility"};

    /* renamed from: g */
    private final String[] f19456g = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    /* renamed from: d */
    private static String m23454d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    /* renamed from: e */
    private void m23455e(final String str) {
        final String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
        C6421a.f16325a.mo35928a(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        C8160b.this.f19452c.evaluateJavascript(str2, (ValueCallback) null);
                    } else {
                        C8160b.this.f19452c.loadUrl(str2);
                    }
                } catch (Throwable unused) {
                    String a = C8160b.this.f19454e;
                    Log.e(a, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
                }
            }
        });
    }

    /* renamed from: a */
    public final JSONObject mo56422a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f19451b.mo56436a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f19453d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public JSONObject mo56423a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f19451b.mo56436a());
        } catch (Exception e) {
            String str = this.f19454e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo56424a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f19453d);
            mo56428a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo56425a(String str, int i, boolean z) {
        C8163d dVar = this.f19451b;
        boolean z2 = true;
        if (dVar.f19462a.containsKey(str)) {
            dVar.f19462a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f19462a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f19462a.get("isWindowVisible").booleanValue() && !dVar.f19462a.get("isVisible").booleanValue()) || !dVar.f19462a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f19462a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f19450a != null && this.f19451b != null) {
            mo56428a("containerIsVisible", mo56422a());
        }
    }

    /* renamed from: a */
    public final void mo56426a(String str, String str2) {
        C8159a aVar = this.f19450a;
        if (aVar != null) {
            aVar.mo56420a(str, str2, this.f19453d);
        }
    }

    /* renamed from: a */
    public final void mo56427a(String str, String str2, String str3) {
        if (this.f19452c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f19454e, str4);
            this.f19450a.mo56420a(str3, str4, this.f19453d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        m23455e(m23454d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f19453d);
        mo56428a(str2, jSONObject);
    }

    /* renamed from: a */
    public final void mo56428a(String str, JSONObject jSONObject) {
        C8159a aVar = this.f19450a;
        if (aVar != null) {
            aVar.mo56421a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo56429b(String str) {
        JSONObject a = this.f19451b.mo56436a();
        a.put("adViewId", this.f19453d);
        mo56428a(str, a);
    }

    /* renamed from: c */
    public boolean mo56430c(String str) {
        for (String equalsIgnoreCase : this.f19455f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
