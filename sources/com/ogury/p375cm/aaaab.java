package com.ogury.p375cm;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p375cm.internal.aabcc;
import com.ogury.p375cm.internal.aacaa;
import com.ogury.p375cm.internal.babca;
import com.ogury.p375cm.internal.bbabc;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f25542a = new aaaab();

    private aaaab() {
    }

    /* renamed from: a */
    public static int m30531a(String str, int i, JSONObject jSONObject) {
        bbabc.m30943b(str, SDKConstants.PARAM_KEY);
        bbabc.m30943b(str, SDKConstants.PARAM_KEY);
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
        if (optJSONObject == null) {
            return 0;
        }
        bbabc.m30943b(optJSONObject, "jsonObject");
        Iterator<String> keys = optJSONObject.keys();
        bbabc.m30940a((Object) keys, "keysInJson");
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            bbabc.m30940a((Object) optString, "jsonObject.optString(key)");
            Object[] array = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(optString)).toArray(new Integer[0]);
            if (array != null) {
                aabcc aabcc = aabcc.f25668a;
                if (aabcc.m30659a((Integer[]) array, i)) {
                    bbabc.m30940a((Object) next, SDKConstants.PARAM_KEY);
                    i2 += (int) Math.pow(2.0d, (double) Integer.parseInt(next));
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return i2;
    }
}
