package com.bytedance.sdk.openadsdk.p169f.p170a;

import com.bytedance.sdk.component.p090a.C2558d;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3728w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.b */
/* compiled from: DoInterstitialWebViewCloseMethod */
public class C3797b extends C2558d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3728w> f9869a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16558d() {
    }

    /* renamed from: a */
    public static void m12480a(C2582r rVar, final C3728w wVar) {
        rVar.mo16602a("interstitial_webview_close", (C2558d.C2560b) new C2558d.C2560b() {
            /* renamed from: a */
            public C2558d mo16563a() {
                return new C3797b(wVar);
            }
        });
    }

    public C3797b(C3728w wVar) {
        this.f9869a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16554a(JSONObject jSONObject, C2562f fVar) throws Exception {
        if (C3524h.m10852d().mo19869s()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[JSB-REQ] version: 3 data=");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C2975l.m8384b("DoInterstitialWebViewCloseMethod", sb.toString());
        }
        C2975l.m8391e("DoInterstitialWebViewCloseMethod", "DoInterstitialWebViewCloseMethod invoke ");
        C3728w wVar = (C3728w) this.f9869a.get();
        if (wVar == null) {
            C2975l.m8391e("DoInterstitialWebViewCloseMethod", "invoke error");
            mo16557c();
            return;
        }
        wVar.mo20461g();
    }
}
