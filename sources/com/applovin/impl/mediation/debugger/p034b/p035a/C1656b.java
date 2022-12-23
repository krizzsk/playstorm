package com.applovin.impl.mediation.debugger.p034b.p035a;

import com.applovin.impl.mediation.debugger.p033a.C1653b;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.b */
public class C1656b {

    /* renamed from: a */
    private final C1658d f2331a;

    /* renamed from: b */
    private final C1659e f2332b;

    /* renamed from: c */
    private final List<C1659e> f2333c;

    /* renamed from: d */
    private final List<C1653b> f2334d;

    public C1656b(JSONObject jSONObject, MaxAdFormat maxAdFormat, C1661b bVar, C1959m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f2332b = new C1659e(jSONObject2, mVar);
        } else {
            this.f2332b = null;
        }
        this.f2331a = new C1658d(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        this.f2334d = bVar.mo13453x() ? new ArrayList() : null;
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f2333c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f2333c.add(new C1659e(jSONObject3, mVar));
            }
            List<C1653b> list = this.f2334d;
            if (list != null) {
                list.add(new C1653b(JsonUtils.getString(jSONObject3, "id", ""), JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null), maxAdFormat));
            }
        }
    }

    /* renamed from: a */
    public C1658d mo13406a() {
        return this.f2331a;
    }

    /* renamed from: b */
    public C1659e mo13407b() {
        return this.f2332b;
    }

    /* renamed from: c */
    public boolean mo13408c() {
        return this.f2332b != null;
    }

    /* renamed from: d */
    public List<C1659e> mo13409d() {
        return this.f2333c;
    }

    /* renamed from: e */
    public List<C1653b> mo13410e() {
        return this.f2334d;
    }
}
