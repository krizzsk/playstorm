package com.applovin.impl.sdk.p050e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.C1497b;
import com.applovin.impl.adview.C1513d;
import com.applovin.impl.adview.C1519e;
import com.applovin.impl.mediation.C1775h;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.q */
public class C1915q extends C1877a implements C1775h.C1776a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1824a f3554a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAdLoadListener f3555c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1513d f3556d;

    /* renamed from: com.applovin.impl.sdk.e.q$a */
    private class C1917a extends C1519e {
        private C1917a(C1959m mVar) {
            super((C1497b) null, mVar);
        }

        /* renamed from: a */
        private boolean m4271a(String str, C1857b<String> bVar) {
            for (String equalsIgnoreCase : C1915q.this.f3467b.mo14344b(bVar)) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo12942a(WebView webView, String str, boolean z) {
            if (C2092v.m5047a()) {
                C1915q qVar = C1915q.this;
                qVar.mo14144b("Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof C1513d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!m4271a(scheme, C1857b.f3202ca)) {
                return true;
            }
            if (m4271a(host, C1857b.f3203cb)) {
                if (C2092v.m5047a()) {
                    C1915q.this.mo14142a("Ad load succeeded");
                }
                if (C1915q.this.f3555c == null) {
                    return true;
                }
                C1915q.this.f3555c.adReceived(C1915q.this.f3554a);
            } else if (m4271a(host, C1857b.f3204cc)) {
                if (C2092v.m5047a()) {
                    C1915q.this.mo14142a("Ad load failed");
                }
                if (C1915q.this.f3555c == null) {
                    return true;
                }
                C1915q.this.f3555c.failedToReceiveAd(204);
            } else if (!C2092v.m5047a()) {
                return true;
            } else {
                C1915q.this.mo14147d("Unrecognized webview event");
                return true;
            }
            AppLovinAdLoadListener unused = C1915q.this.f3555c = null;
            return true;
        }
    }

    public C1915q(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super("TaskProcessJavaScriptTagAd", mVar);
        this.f3554a = new C1824a(jSONObject, jSONObject2, bVar, mVar);
        this.f3555c = appLovinAdLoadListener;
        mVar.mo14293H().mo13718a((C1775h.C1776a) this);
    }

    /* renamed from: a */
    public void mo13720a(C1573a aVar) {
        if (aVar.mo13142f().equalsIgnoreCase(this.f3554a.mo13951N())) {
            this.f3467b.mo14293H().mo13719b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f3555c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f3554a);
                this.f3555c = null;
            }
        }
    }

    public void run() {
        if (C2092v.m5047a()) {
            mo14142a("Rendering AppLovin ad #" + this.f3554a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    C1513d unused = C1915q.this.f3556d = new C1513d(new C1917a(C1915q.this.f3467b), C1915q.this.f3467b, C1915q.this.mo14149f());
                    C1915q.this.f3556d.loadDataWithBaseURL(C1915q.this.f3554a.mo14002aw(), C1915q.this.f3554a.mo12621b(), "text/html", (String) null, "");
                } catch (Throwable th) {
                    C1915q.this.f3467b.mo14293H().mo13719b(C1915q.this);
                    if (C2092v.m5047a()) {
                        C1915q.this.mo14143a("Failed to initialize WebView", th);
                    }
                    if (C1915q.this.f3555c != null) {
                        C1915q.this.f3555c.failedToReceiveAd(-1);
                        AppLovinAdLoadListener unused2 = C1915q.this.f3555c = null;
                    }
                }
            }
        });
    }
}
