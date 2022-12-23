package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2713b;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.p125f.C2952e;
import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.h */
/* compiled from: DynamicNativeParser */
public class C2705h implements C2707i {

    /* renamed from: a */
    private C2713b f5948a;

    /* renamed from: a */
    public void mo17198a(C2713b bVar) {
        this.f5948a = bVar;
    }

    /* renamed from: a */
    public void mo17197a(final C2633l lVar) {
        if (lVar.mo16761m() == 1) {
            m7335b(lVar);
        } else {
            C2952e.m8304a().execute(new Runnable() {
                public void run() {
                    C2705h.this.m7335b(lVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7335b(C2633l lVar) {
        try {
            JSONObject a = lVar.mo16749a();
            JSONObject jSONObject = new JSONObject(a.optString("template_Plugin"));
            JSONObject optJSONObject = a.optJSONObject(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
            C2688h a2 = new C2703g(jSONObject, optJSONObject, a.optJSONObject("AdSize"), new JSONObject(a.optString("diff_template_Plugin"))).mo17204a();
            a2.mo17142a(new JSONObject(optJSONObject.optString("dynamic_creative")).optString("color"));
            this.f5948a.mo16874a(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
