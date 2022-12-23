package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.config.global.features.C4287e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.g */
public class C4297g {
    /* renamed from: a */
    public static JSONArray m13500a(Map<Class, C4287e> map, boolean z) {
        C4280d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4287e next : map.values()) {
                List<C4278b> list = next.f10626c;
                Map<String, C4301k> map2 = next.f10627d;
                for (C4278b next2 : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", next2.f10613a);
                    if (map2.containsKey(next2.f10613a)) {
                        jSONObject.put("v", map2.get(next2.f10613a).f10646b);
                    } else {
                        jSONObject.put("v", SessionDescription.ATTR_CONTROL);
                    }
                    if (z) {
                        Class<C4279c> cls = C4279c.class;
                        Iterator<C4280d> it = next2.f10616d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dVar = null;
                                break;
                            }
                            dVar = it.next();
                            if (cls.equals(dVar.getClass())) {
                                break;
                            }
                        }
                        if (dVar != null && ((C4279c) dVar).f10618b) {
                            Set<Long> set = ((C4279c) dVar).f10617a;
                            JSONArray jSONArray2 = new JSONArray();
                            for (Long put : set) {
                                jSONArray2.put(put);
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put("d", jSONArray2);
                            }
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m16699a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f14137a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
