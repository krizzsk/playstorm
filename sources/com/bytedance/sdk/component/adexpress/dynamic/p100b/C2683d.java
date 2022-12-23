package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d */
/* compiled from: DynamicDiffPlugin */
public class C2683d {

    /* renamed from: a */
    public List<C2684a> f5804a;

    /* renamed from: b */
    public String f5805b;

    /* renamed from: c */
    public String f5806c;

    /* renamed from: d */
    public String f5807d;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d$a */
    /* compiled from: DynamicDiffPlugin */
    public static class C2684a {

        /* renamed from: a */
        public int f5808a;

        /* renamed from: b */
        public JSONObject f5809b;
    }

    /* renamed from: a */
    public static C2683d m7036a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2683d dVar = new C2683d();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C2684a aVar = new C2684a();
                    aVar.f5808a = optJSONObject.optInt("id");
                    aVar.f5809b = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(aVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dVar.f5804a = arrayList;
        dVar.f5805b = jSONObject.optString("diff_data");
        dVar.f5806c = jSONObject.optString("style_diff");
        dVar.f5807d = jSONObject.optString("tag_diff");
        return dVar;
    }
}
