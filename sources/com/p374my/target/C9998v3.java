package com.p374my.target;

import com.p374my.target.common.models.AudioData;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.v3 */
public class C9998v3 {
    /* renamed from: a */
    public static C9998v3 m29559a() {
        return new C9998v3();
    }

    /* renamed from: a */
    public void mo65605a(JSONObject jSONObject, C9945s2 s2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator<C9984u2<AudioData>> it = s2Var.mo65356c().iterator();
            while (it.hasNext()) {
                C9984u2 next = it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next.mo65538h());
                if (optJSONObject2 != null) {
                    mo65606a(optJSONObject2, next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65606a(JSONObject jSONObject, C9984u2 u2Var) {
        u2Var.mo65527a(jSONObject.optInt("connectionTimeout", u2Var.mo65535e()));
        int optInt = jSONObject.optInt("maxBannersShow", u2Var.mo65536f());
        if (optInt == 0) {
            optInt = -1;
        }
        u2Var.mo65532b(optInt);
    }
}
