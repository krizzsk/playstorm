package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.vungle.warren.model.SessionDataDBAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.f */
public class C4253f {

    /* renamed from: a */
    public HashMap<C4251b, C4249e> f10523a = new C4254a(this);

    /* renamed from: com.fyber.inneractive.sdk.cache.session.f$a */
    public class C4254a extends HashMap<C4251b, C4249e> {
        public C4254a(C4253f fVar) {
            for (C4251b bVar : C4251b.values()) {
                if (bVar != C4251b.NONE) {
                    put(bVar, new C4249e());
                }
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo24255a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f10523a.entrySet()) {
                C4251b bVar = (C4251b) next.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", bVar.f10520a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put(SessionDataDBAdapter.SessionDataColumns.TABLE_NAME, ((C4249e) next.getValue()).mo24254a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
