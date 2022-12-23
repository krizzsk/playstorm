package com.p374my.target;

import com.p374my.target.common.models.VideoData;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.my.target.u3 */
public class C9985u3 {
    /* renamed from: a */
    public static C9985u3 m29461a() {
        return new C9985u3();
    }

    /* renamed from: a */
    public void mo65541a(JSONObject jSONObject, C9930r2 r2Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            Iterator<C9984u2<VideoData>> it = r2Var.mo65322c().iterator();
            while (it.hasNext()) {
                C9984u2 next = it.next();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(next.mo65538h());
                if (optJSONObject2 != null) {
                    mo65542a(optJSONObject2, next);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65542a(JSONObject jSONObject, C9984u2 u2Var) {
        u2Var.mo65527a(jSONObject.optInt("connectionTimeout", u2Var.mo65535e()));
        int optInt = jSONObject.optInt("maxBannersShow", u2Var.mo65536f());
        if (optInt == 0) {
            optInt = -1;
        }
        u2Var.mo65532b(optInt);
    }
}
