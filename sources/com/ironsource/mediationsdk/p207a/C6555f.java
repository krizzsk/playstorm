package com.ironsource.mediationsdk.p207a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.f */
final class C6555f extends C6543a {

    /* renamed from: d */
    private final String f16962d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    C6555f(int i) {
        this.f16890b = i;
    }

    /* renamed from: a */
    public final String mo36354a(ArrayList<C6552c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f16889a = jSONObject;
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
        return mo36355a(jSONArray);
    }

    /* renamed from: b */
    public final String mo36356b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    /* renamed from: c */
    public final String mo36357c() {
        return "outcome";
    }
}
