package com.p374my.target;

import android.content.Context;
import android.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.c4 */
public class C9642c4 {
    public C9642c4(C9915q1 q1Var, C9596a aVar, Context context) {
    }

    /* renamed from: a */
    public static C9642c4 m27750a(C9915q1 q1Var, C9596a aVar, Context context) {
        return new C9642c4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public void mo63685a(JSONObject jSONObject, C10016w2 w2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            mo63686b(optJSONObject, w2Var);
        }
    }

    /* renamed from: b */
    public final void mo63686b(JSONObject jSONObject, C10016w2 w2Var) {
        w2Var.mo65661h(jSONObject.optString("title", w2Var.mo65665l()));
        w2Var.mo65655e(jSONObject.optString("icon_hd", w2Var.mo65656f()));
        w2Var.mo65651c(jSONObject.optString("bubble_icon_hd", w2Var.mo65652d()));
        w2Var.mo65659g(jSONObject.optString("label_icon_hd", w2Var.mo65660h()));
        w2Var.mo65653d(jSONObject.optString("goto_app_icon_hd", w2Var.mo65654e()));
        w2Var.mo65657f(jSONObject.optString("item_highlight_icon", w2Var.mo65658g()));
        JSONArray optJSONArray = jSONObject.optJSONArray("icon_status");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    w2Var.mo65664k().add(new Pair(optJSONObject.optString("value"), optJSONObject.optString("icon_hd")));
                }
            }
        }
    }
}
