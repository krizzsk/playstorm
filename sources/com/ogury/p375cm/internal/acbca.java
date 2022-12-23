package com.ogury.p375cm.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbca */
public final class acbca {

    /* renamed from: a */
    public static final aaaaa f25851a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static acbcb m30845a(String str) {
        bbabc.m30943b(str, "response");
        try {
            Object obj = new JSONObject(str).get("status");
            return bbabc.m30942a(obj, (Object) "NOOP") ? acbcb.NOOP : bbabc.m30942a(obj, (Object) "CREATED") ? acbcb.CREATED : bbabc.m30942a(obj, (Object) "UPDATED") ? acbcb.UPDATED : acbcb.UNKNOWN;
        } catch (JSONException unused) {
            return acbcb.UNKNOWN;
        }
    }
}
