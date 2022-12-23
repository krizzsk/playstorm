package com.ogury.p375cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p375cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accab */
public abstract class accab implements acbbc {

    /* renamed from: a */
    public static final aaaaa f25860a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo66634a();

    /* renamed from: a */
    public boolean mo66628a(JSONObject jSONObject) {
        bbabc.m30943b(jSONObject, "jsonResponse");
        if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has("response") && jSONObject.optJSONObject("response").has(mo66634a())) {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            if (optJSONObject.has("lastOpt")) {
                abbba abbba = abbba.f25716a;
                abbcb c = abbba.m30722c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m30940a((Object) optString, "responseObject.optString(LAST_OPT)");
                c.mo66557a(aacaa.aaaaa.m30666d(optString));
            }
            return true;
        }
        abbba abbba2 = abbba.f25716a;
        abbba.m30715a(new acbcc(false, new OguryError(1004, "Json not valid")));
        return false;
    }
}
