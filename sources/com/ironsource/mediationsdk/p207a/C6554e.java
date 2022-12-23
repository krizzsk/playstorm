package com.ironsource.mediationsdk.p207a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.e */
final class C6554e extends C6543a {

    /* renamed from: d */
    private final String f16958d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e */
    private final String f16959e = "super.dwh.mediation_events";

    /* renamed from: f */
    private final String f16960f = "table";

    /* renamed from: g */
    private final String f16961g = "data";

    C6554e(int i) {
        this.f16890b = i;
    }

    /* renamed from: a */
    public final String mo36354a(ArrayList<C6552c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f16889a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C6552c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a = m19878a(it.next());
                    if (a != null) {
                        jSONArray.put(a);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", mo36355a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo36356b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    /* renamed from: c */
    public final String mo36357c() {
        return "ironbeast";
    }
}
