package com.bytedance.sdk.openadsdk.p169f.p170a;

import com.bytedance.sdk.component.p090a.C2558d;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p171g.C3805c;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.a */
/* compiled from: DoGetAdsFromNetworkAsyncMethod */
public class C3794a extends C2558d<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3728w> f9866a;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo16558d() {
    }

    /* renamed from: a */
    public static void m12472a(C2582r rVar, final C3728w wVar) {
        rVar.mo16602a("getNetworkData", (C2558d.C2560b) new C2558d.C2560b() {
            /* renamed from: a */
            public C2558d mo16563a() {
                return new C3794a(wVar);
            }
        });
    }

    public C3794a(C3728w wVar) {
        this.f9866a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16554a(JSONObject jSONObject, C2562f fVar) throws Exception {
        C3728w wVar = (C3728w) this.f9866a.get();
        if (wVar == null) {
            mo16557c();
        } else {
            wVar.mo20440a(jSONObject, (C3805c) new C3805c() {
                /* renamed from: a */
                public void mo20474a(boolean z, List<C3498n> list) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z) {
                            jSONObject.put("creatives", C3728w.m12175b(list));
                            C3794a.this.mo16553a(jSONObject);
                            return;
                        }
                        C3794a.this.mo16553a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
