package com.bytedance.sdk.openadsdk.p130b;

import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.p130b.C3161h;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.t */
/* compiled from: StatsEventThread */
public class C3184t extends C3161h<C3837c.C3840a> {

    /* renamed from: l */
    private C3581n<C3126a> f7545l = C3578m.m11239f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18763a() {
        return false;
    }

    public C3184t(String str, String str2, C3159f fVar, C3581n nVar, C3161h.C3164b bVar, C3161h.C3163a aVar) {
        super(str, str2, fVar, nVar, bVar, aVar);
    }

    /* renamed from: a */
    public C3166i mo18762a(List<C3837c.C3840a> list) {
        if (this.f7545l == null) {
            this.f7545l = C3578m.m11239f();
        }
        if (list == null || list.size() == 0 || !C3536e.m10968a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C3837c.C3840a aVar : list) {
                jSONArray.put(aVar.f9948b);
            }
            jSONObject.put("stats_list", jSONArray);
        } catch (Exception unused) {
        }
        return this.f7545l.mo20078b(jSONObject);
    }
}
