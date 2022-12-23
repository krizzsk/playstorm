package com.tapjoy.internal;

import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.du */
public abstract class C11528du {

    /* renamed from: a */
    public C11488cl f27882a;

    /* renamed from: b */
    public C11502cz f27883b;

    /* renamed from: c */
    public int f27884c;

    /* renamed from: d */
    public long f27885d;

    /* renamed from: e */
    private C11527dt f27886e = new C11527dt((WebView) null);

    /* renamed from: com.tapjoy.internal.du$a */
    public enum C11529a {
        ;
        

        /* renamed from: a */
        public static final int f27887a = 1;

        /* renamed from: b */
        public static final int f27888b = 2;

        /* renamed from: c */
        public static final int f27889c = 3;

        static {
            f27890d = new int[]{1, 2, 3};
        }
    }

    public C11528du() {
        mo72324d();
    }

    /* renamed from: e */
    private boolean m33453e() {
        return this.f27886e.get() != null;
    }

    /* renamed from: a */
    public void mo72314a() {
    }

    /* renamed from: a */
    public final void mo72315a(float f) {
        C11512dh.m33412a().mo72304a(mo72323c(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72316a(WebView webView) {
        this.f27886e = new C11527dt(webView);
    }

    /* renamed from: a */
    public void mo72317a(C11500cx cxVar, C11491co coVar) {
        mo72318a(cxVar, coVar, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo72319a(String str) {
        C11512dh.m33412a().mo72305a(mo72323c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo72320a(String str, JSONObject jSONObject) {
        C11512dh.m33412a().mo72305a(mo72323c(), str, jSONObject);
    }

    /* renamed from: a */
    public final void mo72321a(boolean z) {
        if (m33453e()) {
            C11512dh.m33412a().mo72309c(mo72323c(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo72322b() {
        this.f27886e.clear();
    }

    /* renamed from: c */
    public final WebView mo72323c() {
        return (WebView) this.f27886e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72318a(C11500cx cxVar, C11491co coVar, JSONObject jSONObject) {
        String str = cxVar.f27822f;
        JSONObject jSONObject2 = new JSONObject();
        C11521do.m33438a(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        C11521do.m33438a(jSONObject2, "adSessionType", coVar.f27774h);
        C11521do.m33438a(jSONObject2, "deviceInfo", C11520dn.m33432a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11521do.m33438a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11521do.m33438a(jSONObject3, "partnerName", coVar.f27767a.f27811a);
        C11521do.m33438a(jSONObject3, "partnerVersion", coVar.f27767a.f27812b);
        C11521do.m33438a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11521do.m33438a(jSONObject4, "libraryVersion", "1.3.16-tapjoy");
        C11521do.m33438a(jSONObject4, "appId", C11511dg.m33411a().f27862a.getApplicationContext().getPackageName());
        C11521do.m33438a(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (coVar.f27773g != null) {
            C11521do.m33438a(jSONObject2, "contentUrl", coVar.f27773g);
        }
        if (coVar.f27772f != null) {
            C11521do.m33438a(jSONObject2, "customReferenceData", coVar.f27772f);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (T t : Collections.unmodifiableList(coVar.f27769c)) {
            C11521do.m33438a(jSONObject5, t.f27813a, t.f27815c);
        }
        C11512dh.m33412a().mo72306a(mo72323c(), str, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: d */
    public final void mo72324d() {
        this.f27885d = System.nanoTime();
        this.f27884c = C11529a.f27887a;
    }
}
