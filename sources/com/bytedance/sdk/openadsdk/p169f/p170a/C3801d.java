package com.bytedance.sdk.openadsdk.p169f.p170a;

import com.bytedance.sdk.component.p090a.C2561e;
import com.bytedance.sdk.component.p090a.C2562f;
import com.bytedance.sdk.component.p090a.C2582r;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.d */
/* compiled from: InteractiveFinishMethod */
public class C3801d extends C2561e<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C3728w> f9873a;

    /* renamed from: a */
    public static void m12490a(C2582r rVar, C3728w wVar) {
        rVar.mo16603a("interactiveFinish", (C2561e<?, ?>) new C3801d(wVar));
    }

    /* renamed from: a */
    public JSONObject mo16564a(JSONObject jSONObject, C2562f fVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<C3728w> weakReference = this.f9873a;
        if (!(weakReference == null || weakReference.get() == null)) {
            C3728w wVar = (C3728w) this.f9873a.get();
            C3498n c = wVar.mo20448c();
            boolean z = true;
            try {
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int aA = c != null ? c.mo19647aA() : 0;
                if (optInt >= 0 && aA >= 0) {
                    optInt = Math.min(optInt, aA);
                } else if (optInt < 0) {
                    optInt = aA >= 0 ? aA : 0;
                }
                if (z) {
                    wVar.mo20451c(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public C3801d(C3728w wVar) {
        this.f9873a = new WeakReference<>(wVar);
    }
}
