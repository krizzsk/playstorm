package com.ogury.p375cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p375cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accaa */
public final class accaa implements acbbc {

    /* renamed from: a */
    public static final aaaaa f25859a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo66628a(JSONObject jSONObject) {
        bbabc.m30943b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("CCPAF")) {
            if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has("ccpaResponse") && jSONObject.optJSONObject("ccpaResponse").has("userConsent")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ccpaResponse");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("userConsent");
                abbba abbba2 = abbba.f25716a;
                abbcb c = abbba.m30722c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m30940a((Object) optString, "ccpaResponse.optString(LAST_OPT)");
                c.mo66557a(aacaa.aaaaa.m30666d(optString));
                abbba abbba3 = abbba.f25716a;
                abcaa d = abbba.m30722c().mo66561d();
                String optString2 = optJSONObject.optString("uspString");
                bbabc.m30940a((Object) optString2, "ccpaResponse.optString(USP_STRING)");
                d.mo66569a(optString2);
                abbba abbba4 = abbba.f25716a;
                abbba.m30722c().mo66561d().mo66575d(optJSONObject.optBoolean("ccpaApplies"));
                abbba abbba5 = abbba.f25716a;
                abbba.m30722c().mo66561d().mo66570a(optJSONObject2.optBoolean("explicitNotice"));
                abbba abbba6 = abbba.f25716a;
                abbba.m30722c().mo66561d().mo66571b(optJSONObject2.optBoolean("optOutSale"));
                abbba abbba7 = abbba.f25716a;
                abbba.m30722c().mo66561d().mo66573c(optJSONObject2.optBoolean("lspa"));
            } else {
                abbba abbba8 = abbba.f25716a;
                abbba.m30715a(new acbcc(false, new OguryError(1004, "Json not valid")));
            }
        }
        return false;
    }
}
