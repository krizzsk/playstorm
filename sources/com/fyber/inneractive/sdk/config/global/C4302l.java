package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.l */
public class C4302l {

    /* renamed from: a */
    public final Map<String, C4307q> f10648a = new HashMap();

    /* renamed from: a */
    public C4307q mo24331a(String str) {
        return this.f10648a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4302l.class != obj.getClass()) {
            return false;
        }
        return this.f10648a.equals(((C4302l) obj).f10648a);
    }

    public int hashCode() {
        return this.f10648a.hashCode();
    }

    public String toString() {
        return String.format("remoteConfig - features: %s", new Object[]{this.f10648a.values()});
    }

    /* renamed from: a */
    public static C4302l m13504a(JSONObject jSONObject) throws Exception {
        C4302l lVar = new C4302l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        int i = 0;
        int i2 = 0;
        while (i2 < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            C4307q qVar = new C4307q();
            qVar.f10651b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.f10650a = new C4305o(optJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i] = qVar.f10651b;
                IAlog.m16699a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                int i3 = i;
                while (i3 < optJSONArray2.length()) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    C4278b bVar = new C4278b();
                    bVar.f10613a = jSONObject3.getString("id");
                    bVar.f10614b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i4 = i; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        C4301k kVar = new C4301k();
                        kVar.f10646b = jSONObject4.getString("id");
                        kVar.f10647c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.f10650a = new C4305o(optJSONObject2);
                        }
                        bVar.f10615c.add(kVar);
                    }
                    C4278b.m13469a(bVar, jSONObject3.optJSONObject("include"), true);
                    C4278b.m13469a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f10652c.put(bVar.f10613a, bVar);
                    i3++;
                    i = 0;
                }
            }
            lVar.f10648a.put(qVar.f10651b, qVar);
            i2++;
            i = i;
        }
        return lVar;
    }
}
