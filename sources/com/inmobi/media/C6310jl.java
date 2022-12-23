package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jl */
/* compiled from: UnifiedIDUtils */
public final class C6310jl {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18872a(org.json.JSONObject r9) {
        /*
            java.lang.String r0 = "ufids"
            r1 = 0
            r2 = 1
            boolean r3 = r9.has(r0)     // Catch:{ JSONException -> 0x0037 }
            if (r3 == 0) goto L_0x0037
            org.json.JSONArray r9 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x0037 }
            if (r9 == 0) goto L_0x0037
            int r0 = r9.length()     // Catch:{ JSONException -> 0x0037 }
            if (r0 == 0) goto L_0x0037
            r0 = r1
            r3 = r2
        L_0x0018:
            int r4 = r9.length()     // Catch:{ JSONException -> 0x0038 }
            if (r0 >= r4) goto L_0x0038
            org.json.JSONObject r4 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x0038 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0038 }
            java.lang.String r7 = "expiry"
            long r7 = r4.getLong(r7)     // Catch:{ JSONException -> 0x0038 }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0032
            r4 = r2
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            r3 = r3 & r4
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0037:
            r3 = r2
        L_0x0038:
            if (r3 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6310jl.m18872a(org.json.JSONObject):boolean");
    }

    /* renamed from: b */
    public static boolean m18874b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        JSONArray jSONArray = null;
        try {
            if (jSONObject.has("ufids")) {
                jSONArray = jSONObject.getJSONArray("ufids");
            }
            if (jSONObject == null || jSONArray == null || jSONArray.length() == 0) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static C5926ci m18869a() {
        if (m18876c()) {
            return new C5926ci();
        }
        if (m18873b()) {
            return new C5926ci();
        }
        HashMap hashMap = new HashMap();
        JSONObject b = C6309jk.m18864b();
        if (b != null) {
            Iterator<String> keys = b.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (b.get(next) != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("src", next);
                        jSONObject.put("envelope", b.get(next));
                        hashMap.put(next, jSONObject);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        JSONObject a = C6309jk.m18862a();
        boolean z = false;
        if (a != null) {
            try {
                if (a.has("ufids")) {
                    JSONArray jSONArray = a.getJSONArray("ufids");
                    int i = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i < jSONArray.length()) {
                        try {
                            String string = jSONArray.getJSONObject(i).getString("src");
                            String string2 = jSONArray.getJSONObject(i).getString("envelope");
                            if (System.currentTimeMillis() > jSONArray.getJSONObject(i).getLong("expiry")) {
                                z2 = true;
                            } else if (!(string == null || string2 == null)) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                hashMap.put(string, jSONObject2);
                                z3 = true;
                            }
                            i++;
                        } catch (JSONException unused2) {
                        }
                    }
                    if (z2) {
                        InMobiUnifiedIdService.m19161a((InMobiUnifiedIdInterface) null);
                    }
                    z = z3;
                }
            } catch (JSONException unused3) {
            }
        }
        if (hashMap.size() <= 0) {
            return new C5926ci();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (JSONObject put : hashMap.values()) {
            jSONArray2.put(put);
        }
        return new C5926ci(jSONArray2.toString(), z);
    }

    /* renamed from: b */
    public static boolean m18873b() {
        Boolean g = C6269iq.m18729a().mo35480g();
        boolean z = g == null || g.booleanValue();
        if (z) {
            InMobiUnifiedIdService.reset();
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m18876c() {
        C6281iw.m18775a();
        boolean z = !C6281iw.m18778f().enabled;
        if (z) {
            InMobiUnifiedIdService.reset();
        }
        return z;
    }

    /* renamed from: a */
    public static void m18871a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        byte a = m18868a(error);
        if (a >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(a));
            C6218hh.m18506a().mo35424a("FetchCallbackFailure ", (Map<String, Object>) hashMap);
        }
        if (inMobiUnifiedIdInterface != null) {
            C6306ji.m18854a().mo35541a(new Runnable() {
                public final void run() {
                    InMobiUnifiedIdInterface.this.onFetchCompleted(jSONObject, error);
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m18868a(java.lang.Error r4) {
        /*
            r0 = -1
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = r4.getMessage()
            int r1 = r4.hashCode()
            r2 = -783021760(0xffffffffd1540940, float:-5.6918016E10)
            r3 = 1
            if (r1 == r2) goto L_0x0021
            r2 = 2016561529(0x78324979, float:1.446436E34)
            if (r1 == r2) goto L_0x0017
            goto L_0x002b
        L_0x0017:
            java.lang.String r1 = "No local data present"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x002b
            r4 = r3
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x002b
            r4 = 0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            if (r4 == 0) goto L_0x0034
            if (r4 == r3) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            r4 = 94
            return r4
        L_0x0034:
            r4 = 93
            return r4
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6310jl.m18868a(java.lang.Error):byte");
    }

    /* renamed from: d */
    public static JSONArray m18877d() {
        JSONArray jSONArray = new JSONArray();
        JSONObject a = C6309jk.m18862a();
        if (a != null && a.has("ufids")) {
            try {
                JSONArray jSONArray2 = a.getJSONArray("ufids");
                if (jSONArray2 != null) {
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        String string = jSONArray2.getJSONObject(i).getString("src");
                        String string2 = jSONArray2.getJSONObject(i).getString(InAppPurchaseMetaData.KEY_SIGNATURE);
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (!(string == null || string2 == null)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static JSONObject m18875c(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int i = 0;
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(i, jSONObject3);
                            i++;
                        }
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m18870a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        HashMap hashMap = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids") && (jSONArray2 = jSONObject2.getJSONArray("ufids")) != null) {
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        hashMap.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (!(jSONObject == null || !jSONObject.has("ufids") || (jSONArray = jSONObject.getJSONArray("ufids")) == null)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                hashMap.put(jSONArray.getJSONObject(i2).getString("src"), jSONArray.getJSONObject(i2));
            }
        }
        for (JSONObject put : hashMap.values()) {
            jSONArray3.put(put);
        }
        jSONObject3.put("ufids", jSONArray3);
        return jSONObject3;
    }
}
