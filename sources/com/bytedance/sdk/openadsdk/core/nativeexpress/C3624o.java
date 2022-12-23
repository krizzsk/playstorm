package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.sdk.component.adexpress.C2598a;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2616b;
import com.bytedance.sdk.component.adexpress.p095b.C2626f;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p097d.C2645a;
import com.bytedance.sdk.component.adexpress.p097d.C2647b;
import com.bytedance.sdk.component.adexpress.p097d.C2650e;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3747b;
import com.bytedance.sdk.openadsdk.core.widget.p166a.C3748c;
import com.bytedance.sdk.openadsdk.p130b.C3171n;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import com.bytedance.sdk.openadsdk.utils.C3972a;
import com.bytedance.sdk.openadsdk.utils.C3999i;
import com.bytedance.sdk.openadsdk.utils.C4012s;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.o */
/* compiled from: WebViewRender */
public class C3624o extends C2645a {

    /* renamed from: e */
    C3972a f9179e;

    /* renamed from: f */
    private Context f9180f;

    /* renamed from: g */
    private String f9181g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3498n f9182h;

    /* renamed from: i */
    private JSONObject f9183i;

    /* renamed from: j */
    private C3185u f9184j;

    /* renamed from: k */
    private String f9185k;

    /* renamed from: l */
    private C3171n f9186l;

    /* renamed from: m */
    private final Map<String, C4026c> f9187m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private C3728w f9188n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2626f f9189o;

    /* renamed from: p */
    private C3498n.C3499a f9190p;

    /* renamed from: q */
    private final Runnable f9191q = new Runnable() {
        public void run() {
            if (!C3624o.this.f5706d.get()) {
                if (!(C3624o.this.f9182h == null || C3624o.this.f9182h.mo19604G() == null)) {
                    C3624o oVar = C3624o.this;
                    C2616b unused = oVar.f5705c = C2603a.m6644c(oVar.f9182h.mo19604G().mo19762b());
                }
                C3568k.m11192d().post(C3624o.this.f9192r);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f9192r = new Runnable() {
        public void run() {
            if (!C3624o.this.f5706d.get() && C3624o.this.f9189o != null) {
                C3624o oVar = C3624o.this;
                C3624o.super.mo16719a(oVar.f9189o);
            }
        }
    };

    /* renamed from: s */
    private int f9193s = 8;

    public C3624o(Context context, C2633l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C3185u uVar, C3498n nVar) {
        super(context, lVar, themeStatusBroadcastReceiver);
        if (this.f5703a != null && this.f5703a.getWebView() != null) {
            this.f9180f = context;
            this.f9181g = lVar.mo16750b();
            this.f9182h = nVar;
            this.f9184j = uVar;
            this.f9183i = lVar.mo16749a();
            String e = C2603a.m6647e();
            this.f9185k = e;
            mo16816a(C4012s.m13172b(e));
            themeStatusBroadcastReceiver.mo17315a(this);
            mo20197n();
            mo20196m();
            mo20198o();
        }
    }

    /* renamed from: m */
    public void mo20196m() {
        if (this.f5703a != null && this.f5703a.getWebView() != null) {
            C3728w wVar = new C3728w(this.f9180f);
            this.f9188n = wVar;
            wVar.mo20443b(this.f5703a).mo20426a(this.f9182h).mo20453d(this.f9182h.mo19622Y()).mo20457e(this.f9182h.mo19659ac()).mo20442b(C4014u.m13176a(this.f9181g)).mo20459f(C4014u.m13239i(this.f9182h)).mo20422a((C2631j) this).mo20436a(this.f9183i).mo20423a(this.f5703a).mo20424a(this.f9184j);
        }
    }

    /* renamed from: n */
    public void mo20197n() {
        C3498n nVar = this.f9182h;
        if (nVar != null && nVar.mo19604G() != null) {
            this.f9190p = this.f9182h.mo19604G();
        }
    }

    /* renamed from: o */
    public void mo20198o() {
        if (this.f5703a != null && this.f5703a.getWebView() != null) {
            this.f5703a.setBackgroundColor(0);
            this.f5703a.setBackgroundResource(17170445);
            m11474a(this.f5703a);
            if (mo16813a() != null) {
                this.f9186l = new C3171n(this.f9180f, this.f9182h, mo16813a().getWebView()).mo18777a(false);
            }
            this.f9186l.mo18786a(this.f9184j);
            this.f5703a.setWebViewClient(new C3612g(this.f9180f, this.f9188n, this.f9182h, this.f9186l));
            this.f5703a.setWebChromeClient(new C3748c(this.f9188n, this.f9186l));
            if (Build.VERSION.SDK_INT >= 17) {
                C2650e.m6932a().mo16860a(this.f5703a, (C2647b) this.f9188n);
            }
        }
    }

    /* renamed from: a */
    public void mo16719a(C2626f fVar) {
        this.f9189o = fVar;
        C2952e.m8304a().execute(this.f9191q);
    }

    /* renamed from: a */
    private void m11474a(SSWebView sSWebView) {
        if (sSWebView != null) {
            try {
                C3747b.m12300a(this.f9180f).mo20536a(false).mo20537a(sSWebView.getWebView());
                sSWebView.setVerticalScrollBarEnabled(false);
                sSWebView.setHorizontalScrollBarEnabled(false);
                sSWebView.mo17929a(true);
                sSWebView.mo17950j();
                sSWebView.setUserAgentString(C3999i.m13113a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setAllowFileAccess(false);
                sSWebView.setSupportZoom(true);
                sSWebView.setBuiltInZoomControls(true);
                sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                sSWebView.setUseWideViewPort(true);
            } catch (Exception e) {
                C2975l.m8391e("WebViewRender", e.toString());
            }
        }
    }

    /* renamed from: a */
    public SSWebView mo16813a() {
        return this.f5703a;
    }

    /* renamed from: d */
    public void mo16819d() {
        if (!this.f5706d.get()) {
            C3728w wVar = this.f9188n;
            if (wVar != null) {
                wVar.mo20446b();
                this.f9188n = null;
            }
            super.mo16819d();
            C3568k.m11192d().removeCallbacks(this.f9192r);
            this.f9187m.clear();
        }
    }

    /* renamed from: f */
    public void mo16820f() {
        if (mo16813a() != null) {
            try {
                mo16813a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public void mo16824j() {
        super.mo16824j();
        if (this.f9188n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expressShow", true);
                this.f9188n.mo20439a("expressShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo16825k() {
        C3972a c = C3524h.m10852d().mo19843c();
        this.f9179e = c;
        if (c != null) {
            c.mo20886a((C2598a) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo16826l() {
        super.mo16826l();
        C3972a aVar = this.f9179e;
        if (aVar != null) {
            aVar.mo20888b(this);
        }
    }

    /* renamed from: g */
    public void mo16821g() {
        C3728w wVar = this.f9188n;
        if (wVar != null) {
            wVar.mo20439a("expressWebviewRecycle", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public void mo16814a(int i) {
        if (i != this.f9193s) {
            this.f9193s = i;
            m11477b(i == 0);
        }
    }

    /* renamed from: b */
    private void m11477b(boolean z) {
        if (this.f9188n != null && this.f5703a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z);
                this.f9188n.mo20439a("expressAdShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public C3728w mo20199p() {
        return this.f9188n;
    }

    /* renamed from: b */
    public void mo17262b(int i) {
        if (this.f9188n != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f9188n.mo20439a("themeChange", jSONObject);
        }
    }

    /* renamed from: b */
    public static boolean m11478b(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }
}
