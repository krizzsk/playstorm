package com.applovin.impl.mediation.debugger.p034b.p035a;

import com.applovin.impl.mediation.debugger.p033a.C1653b;
import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.c */
public class C1657c {

    /* renamed from: a */
    private final String f2335a;

    /* renamed from: b */
    private final boolean f2336b;

    /* renamed from: c */
    private final List<C1656b> f2337c;

    /* renamed from: d */
    private final List<C1656b> f2338d;

    /* renamed from: e */
    private final List<C1653b> f2339e;

    C1657c(JSONObject jSONObject, Map<String, C1661b> map, MaxAdFormat maxAdFormat, C1959m mVar) {
        List<C1653b> list;
        C1656b bVar;
        this.f2335a = JsonUtils.getString(jSONObject, "name", "");
        this.f2336b = JsonUtils.getBoolean(jSONObject, "default", false).booleanValue();
        JSONObject jSONObject2 = jSONObject;
        Map<String, C1661b> map2 = map;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        C1959m mVar2 = mVar;
        this.f2337c = m3356a("bidders", jSONObject2, map2, maxAdFormat2, mVar2);
        List<C1656b> a = m3356a("waterfall", jSONObject2, map2, maxAdFormat2, mVar2);
        this.f2338d = a;
        Iterator<C1656b> it = a.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.mo13406a().mo13418c().mo13453x()) {
                break;
            }
        }
        this.f2339e = bVar != null ? bVar.mo13410e() : list;
    }

    /* renamed from: a */
    private List<C1656b> m3356a(String str, JSONObject jSONObject, Map<String, C1661b> map, MaxAdFormat maxAdFormat, C1959m mVar) {
        C1661b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (!(jSONObject2 == null || (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) == null)) {
                arrayList.add(new C1656b(jSONObject2, maxAdFormat, bVar, mVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C1656b> mo13411a() {
        return this.f2337c;
    }

    /* renamed from: b */
    public List<C1656b> mo13412b() {
        return this.f2338d;
    }

    /* renamed from: c */
    public boolean mo13413c() {
        return this.f2336b;
    }

    /* renamed from: d */
    public List<C1653b> mo13414d() {
        return this.f2339e;
    }
}
