package com.ogury.p375cm.internal;

import com.ogury.p375cm.internal.aacaa;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accac */
public final class accac extends accab {

    /* renamed from: b */
    public static final aaaaa f25861b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f25862c = "userConsent";

    /* renamed from: com.ogury.cm.internal.accac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo66634a() {
        return this.f25862c;
    }

    /* renamed from: a */
    public final boolean mo66628a(JSONObject jSONObject) {
        bbabc.m30943b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f25716a;
        if (!abbba.m30729f("TCF")) {
            return false;
        }
        boolean a = super.mo66628a(jSONObject);
        if (a) {
            abbba abbba2 = abbba.f25716a;
            abcac abcac = (abcac) abcab.m30772d();
            abcac.mo66584a(jSONObject.optJSONObject("iabResponse"));
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(this.f25862c);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("sdk");
            bbabc.m30940a((Object) optJSONObject3, "jsonResponse.optJSONObject(SDK)");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("unifiedVendors");
            bbabc.m30940a((Object) optJSONObject4, "sdkObject.optJSONObject(UNIFIED_VENDORS)");
            abbba abbba3 = abbba.f25716a;
            abbba.m30722c().mo66558a(optJSONObject.optBoolean("hasPaid"));
            abcac.mo66580a(optJSONObject.optBoolean("gdprApplies", true));
            abcac.mo66583a(optJSONObject2.optInt("purposes"));
            abcac.mo66589c(optJSONObject2.optInt("specialFeatures"));
            String optString = optJSONObject2.optString(TJAdUnitConstants.String.VENDORS, "");
            bbabc.m30940a((Object) optString, "userConsent.optString(VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(optString)).toArray(new Integer[0]);
            if (array != null) {
                abcac.mo66585a((Integer[]) array);
                String optString2 = optJSONObject2.optString("vendorsLI", "");
                bbabc.m30940a((Object) optString2, "userConsent.optString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(optString2)).toArray(new Integer[0]);
                if (array2 != null) {
                    abcac.mo66588b((Integer[]) array2);
                    abcac.mo66586b(optJSONObject2.optInt("purposesLI"));
                    abcac.mo66587b(optJSONObject4.optJSONObject(TJAdUnitConstants.String.VENDORS));
                    abcac.mo66590d(optJSONObject2.optInt("maxVendorId"));
                    String optString3 = optJSONObject.optString("iabString", "");
                    bbabc.m30940a((Object) optString3, "responseObject.optString(IAB_STRING, \"\")");
                    abcac.mo66579a(optString3);
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return a;
    }
}
