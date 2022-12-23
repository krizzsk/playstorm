package com.ogury.p376ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ge */
public final class C10552ge {
    /* renamed from: a */
    public static final int m32077a(JSONObject jSONObject, String str, int i) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? i : jSONObject.optInt(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = r1.optString(r2, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m32079a(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "key"
            com.ogury.p376ed.internal.C10765mq.m32773b(r2, r0)
            java.lang.String r0 = "defaultValue"
            com.ogury.p376ed.internal.C10765mq.m32773b(r3, r0)
            if (r1 != 0) goto L_0x000d
            return r3
        L_0x000d:
            java.lang.String r1 = r1.optString(r2, r3)
            if (r1 != 0) goto L_0x0014
            return r3
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10552ge.m32079a(org.json.JSONObject, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static final boolean m32081a(JSONObject jSONObject, String str, boolean z) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    /* renamed from: a */
    public static final long m32078a(JSONObject jSONObject, String str, long j) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? j : jSONObject.optLong(str, j);
    }

    /* renamed from: a */
    public static final boolean m32080a(JSONObject jSONObject) {
        C10765mq.m32773b(jSONObject, "<this>");
        return jSONObject.length() == 0;
    }
}
