package com.mbridge.msdk.videocommon.p371b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.c */
/* compiled from: Reward */
public final class C9541c {

    /* renamed from: a */
    private String f23389a;

    /* renamed from: b */
    private int f23390b;

    public C9541c(String str, int i) {
        this.f23389a = str;
        this.f23390b = i;
    }

    /* renamed from: a */
    public final String mo63097a() {
        return this.f23389a;
    }

    /* renamed from: a */
    public final void mo63099a(String str) {
        this.f23389a = str;
    }

    /* renamed from: b */
    public final int mo63100b() {
        return this.f23390b;
    }

    /* renamed from: a */
    public final void mo63098a(int i) {
        this.f23390b = i;
    }

    /* renamed from: c */
    private static C9541c m27265c() {
        return new C9541c("Virtual Item", 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.videocommon.p371b.C9541c m27264b(java.lang.String r3) {
        /*
            r0 = 0
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x002f }
            com.mbridge.msdk.videocommon.d.a r1 = r1.mo63129b()     // Catch:{ Exception -> 0x002f }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x0015
            com.mbridge.msdk.videocommon.b.c r3 = m27265c()     // Catch:{ Exception -> 0x002f }
        L_0x0013:
            r0 = r3
            goto L_0x0028
        L_0x0015:
            if (r1 == 0) goto L_0x0028
            java.util.Map r2 = r1.mo63121i()     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x0028
            java.util.Map r1 = r1.mo63121i()     // Catch:{ Exception -> 0x002f }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x002f }
            com.mbridge.msdk.videocommon.b.c r3 = (com.mbridge.msdk.videocommon.p371b.C9541c) r3     // Catch:{ Exception -> 0x002f }
            goto L_0x0013
        L_0x0028:
            if (r0 != 0) goto L_0x0033
            com.mbridge.msdk.videocommon.b.c r0 = m27265c()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p371b.C9541c.m27264b(java.lang.String):com.mbridge.msdk.videocommon.b.c");
    }

    /* renamed from: a */
    public static Map<String, C9541c> m27263a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new C9541c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C9541c m27262a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new C9541c(optString, optInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String toString() {
        return "Reward{name='" + this.f23389a + '\'' + ", amount=" + this.f23390b + '}';
    }
}
