package com.bytedance.sdk.component.p090a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p090a.C2563g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.a */
/* compiled from: AbstractBridge */
public abstract class C2554a {

    /* renamed from: a */
    protected Context f5446a;

    /* renamed from: b */
    protected C2575m f5447b;

    /* renamed from: c */
    protected C2567h f5448c;

    /* renamed from: d */
    protected Handler f5449d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    protected String f5450e;

    /* renamed from: f */
    protected volatile boolean f5451f = false;

    /* renamed from: g */
    C2563g f5452g;

    /* renamed from: h */
    private final Map<String, C2563g> f5453h = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo16538a(C2569j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo16539a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16542a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16545b(C2569j jVar);

    protected C2554a() {
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f5451f) {
            C2568i.m6523a("Received call: " + str);
            this.f5449d.post(new Runnable() {
                public void run() {
                    if (!C2554a.this.f5451f) {
                        C2579q qVar = null;
                        try {
                            qVar = C2554a.this.m6473a(new JSONObject(str));
                        } catch (JSONException e) {
                            C2568i.m6527b("Exception thrown while parsing function.", e);
                        }
                        if (C2579q.m6554a(qVar)) {
                            C2568i.m6523a("By pass invalid call: " + qVar);
                            if (qVar != null) {
                                C2554a.this.mo16546b(C2595y.m6599a((Throwable) new C2583s(qVar.f5501a, "Failed to parse invocation.")), qVar);
                                return;
                            }
                            return;
                        }
                        C2554a.this.mo16541a(qVar);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16543a(String str, C2579q qVar) {
        mo16542a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16544b() {
        this.f5452g.mo16566a();
        for (C2563g a : this.f5453h.values()) {
            a.mo16566a();
        }
        this.f5449d.removeCallbacksAndMessages((Object) null);
        this.f5451f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16541a(C2579q qVar) {
        String a;
        if (!this.f5451f && (a = mo16539a()) != null) {
            C2563g b = m6474b(qVar.f5507g);
            if (b == null) {
                C2568i.m6526b("Received call with unknown namespace, " + qVar);
                C2575m mVar = this.f5447b;
                if (mVar != null) {
                    mVar.mo16588a(mo16539a(), qVar.f5504d, 2);
                }
                mo16546b(C2595y.m6599a((Throwable) new C2583s(-4, "Namespace " + qVar.f5507g + " unknown.")), qVar);
                return;
            }
            C2562f fVar = new C2562f();
            fVar.f5462b = a;
            fVar.f5461a = this.f5446a;
            fVar.f5463c = b;
            try {
                C2563g.C2566a a2 = b.mo16565a(qVar, fVar);
                if (a2 == null) {
                    C2568i.m6526b("Received call but not registered, " + qVar);
                    if (this.f5447b != null) {
                        this.f5447b.mo16588a(mo16539a(), qVar.f5504d, 2);
                    }
                    mo16546b(C2595y.m6599a((Throwable) new C2583s(-2, "Function " + qVar.f5504d + " is not registered.")), qVar);
                    return;
                }
                if (a2.f5480a) {
                    mo16546b(a2.f5481b, qVar);
                }
                if (this.f5447b != null) {
                    this.f5447b.mo16587a(mo16539a(), qVar.f5504d);
                }
            } catch (Exception e) {
                C2568i.m6524a("call finished with error, " + qVar, e);
                mo16546b(C2595y.m6599a((Throwable) e), qVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16540a(C2569j jVar, C2587v vVar) {
        this.f5446a = mo16538a(jVar);
        this.f5448c = jVar.f5487d;
        this.f5447b = jVar.f5492i;
        this.f5452g = new C2563g(jVar, this, vVar);
        this.f5450e = jVar.f5494k;
        mo16545b(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16546b(String str, C2579q qVar) {
        JSONObject jSONObject;
        if (!this.f5451f) {
            if (TextUtils.isEmpty(qVar.f5506f)) {
                C2568i.m6523a("By passing js callback due to empty callback: " + str);
                return;
            }
            if (!str.startsWith("{") || !str.endsWith("}")) {
                C2568i.m6522a((RuntimeException) new IllegalArgumentException("Illegal callback data: " + str));
            }
            C2568i.m6523a("Invoking js callback: " + qVar.f5506f);
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            mo16543a(C2578p.m6549a().mo16591a("__msg_type", "callback").mo16591a("__callback_id", qVar.f5506f).mo16591a("__params", jSONObject).mo16592b(), qVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = r9.optString("params");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.p090a.C2579q m6473a(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            boolean r1 = r8.f5451f
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = "__callback_id"
            java.lang.String r1 = r9.optString(r1)
            java.lang.String r3 = "func"
            java.lang.String r3 = r9.optString(r3)
            java.lang.String r4 = r8.mo16539a()
            if (r4 != 0) goto L_0x0023
            com.bytedance.sdk.component.a.m r9 = r8.f5447b
            if (r9 == 0) goto L_0x0022
            r0 = 3
            r9.mo16588a(r2, r2, r0)
        L_0x0022:
            return r2
        L_0x0023:
            java.lang.String r2 = "__msg_type"
            java.lang.String r2 = r9.getString(r2)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r5 = ""
            java.lang.Object r6 = r9.opt(r0)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x004d
            boolean r5 = r6 instanceof org.json.JSONObject     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x003c
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x003c:
            boolean r5 = r6 instanceof java.lang.String     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0044
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0044:
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            java.lang.String r5 = r9.optString(r0)     // Catch:{ JSONException -> 0x0084 }
        L_0x004d:
            java.lang.String r0 = "JSSDK"
            java.lang.String r0 = r9.getString(r0)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r6 = "namespace"
            java.lang.String r6 = r9.optString(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r7 = "__iframe_url"
            java.lang.String r9 = r9.optString(r7)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r7 = com.bytedance.sdk.component.p090a.C2579q.m6552a()     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r7.mo16594a((java.lang.String) r0)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16596b((java.lang.String) r2)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16597c((java.lang.String) r3)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16598d((java.lang.String) r5)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16599e((java.lang.String) r1)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r0 = r0.mo16600f((java.lang.String) r6)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q$a r9 = r0.mo16601g((java.lang.String) r9)     // Catch:{ JSONException -> 0x0084 }
            com.bytedance.sdk.component.a.q r9 = r9.mo16595a()     // Catch:{ JSONException -> 0x0084 }
            return r9
        L_0x0084:
            r9 = move-exception
            java.lang.String r0 = "Failed to create call."
            com.bytedance.sdk.component.p090a.C2568i.m6527b(r0, r9)
            com.bytedance.sdk.component.a.m r9 = r8.f5447b
            if (r9 == 0) goto L_0x0092
            r0 = 1
            r9.mo16588a(r4, r3, r0)
        L_0x0092:
            r9 = -1
            com.bytedance.sdk.component.a.q r9 = com.bytedance.sdk.component.p090a.C2579q.m6553a(r1, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p090a.C2554a.m6473a(org.json.JSONObject):com.bytedance.sdk.component.a.q");
    }

    /* renamed from: b */
    private C2563g m6474b(String str) {
        if (TextUtils.equals(str, this.f5450e) || TextUtils.isEmpty(str)) {
            return this.f5452g;
        }
        return this.f5453h.get(str);
    }
}
