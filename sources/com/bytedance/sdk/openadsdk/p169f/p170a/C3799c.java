package com.bytedance.sdk.openadsdk.p169f.p170a;

import com.bytedance.sdk.component.p090a.C2558d;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.openadsdk.core.C3728w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.c */
/* compiled from: DoNewClickEventMethod */
public class C3799c extends C2558d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3728w> f9871a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16558d() {
    }

    /* renamed from: a */
    public static void m12485a(C2582r rVar, final C3728w wVar) {
        rVar.mo16602a("newClickEvent", (C2558d.C2560b) new C2558d.C2560b() {
            /* renamed from: a */
            public C2558d mo16563a() {
                return new C3799c(wVar);
            }
        });
    }

    public C3799c(C3728w wVar) {
        this.f9871a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16554a(JSONObject jSONObject, C2562f fVar) throws Exception {
        C3728w wVar = (C3728w) this.f9871a.get();
        if (wVar == null) {
            mo16557c();
        } else {
            wVar.mo20454d(jSONObject);
        }
    }
}
