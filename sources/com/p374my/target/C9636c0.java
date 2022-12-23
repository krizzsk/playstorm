package com.p374my.target;

import android.content.Context;
import com.p374my.target.C10068z3;
import com.p374my.target.C9822l3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.c0 */
public class C9636c0 extends C9635c<C10029x2> implements C10068z3.C10069a {

    /* renamed from: a */
    public String f23695a;

    /* renamed from: a */
    public static C9635c<C10029x2> m27716a() {
        return new C9636c0();
    }

    /* renamed from: a */
    public C9916q2 mo63652a(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("banners", jSONArray);
            new JSONObject().put(aVar.getFormat(), jSONObject2);
            C10029x2 e = C10029x2.m29689e();
            C9821l2 b = mo63655b(jSONObject, q1Var, aVar, context);
            if (b == null) {
                return null;
            }
            e.mo65697a(b);
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C10029x2 mo63651a(String str, C9915q1 q1Var, C10029x2 x2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        JSONObject optJSONObject;
        C9821l2 b;
        JSONObject optJSONObject2;
        C9839m2 b2;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null) {
            return null;
        }
        if (x2Var == null) {
            x2Var = C10029x2.m29689e();
        }
        this.f23695a = a.optString("mraid.js");
        JSONObject a2 = mo63654a(a, aVar.getFormat());
        if (a2 != null) {
            JSONArray optJSONArray = a2.optJSONArray("banners");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                C9713g4.m28068a().mo64094a(a2, x2Var);
                if (!(optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (b = mo63655b(optJSONObject, q1Var, aVar, context)) == null)) {
                    x2Var.mo65697a(b);
                    return x2Var;
                }
            }
            return null;
        } else if (!aVar.isMediationEnabled() || (optJSONObject2 = a.optJSONObject("mediation")) == null || (b2 = C10068z3.m29875a(this, q1Var, aVar, context).mo65863b(optJSONObject2)) == null) {
            return null;
        } else {
            x2Var.mo65293a(b2);
            return x2Var;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo63654a(org.json.JSONObject r8, java.lang.String r9) {
        /*
            r7 = this;
            r9.hashCode()
            int r0 = r9.hashCode()
            r1 = -1292723836(0xffffffffb2f29984, float:-2.8242319E-8)
            r2 = 2
            r3 = 1
            java.lang.String r4 = "standard_728x90"
            java.lang.String r5 = "standard_320x50"
            java.lang.String r6 = "standard"
            if (r0 == r1) goto L_0x0031
            r1 = -1177968780(0xffffffffb9c99f74, float:-3.845651E-4)
            if (r0 == r1) goto L_0x0028
            r1 = 1312628413(0x4e3d1ebd, float:7.9322707E8)
            if (r0 == r1) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r0 = r2
            goto L_0x003a
        L_0x0028:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            r0 = r3
            goto L_0x003a
        L_0x0031:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x0039
        L_0x0037:
            r0 = -1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0063
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0045
            org.json.JSONObject r8 = r8.optJSONObject(r9)
            return r8
        L_0x0045:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 != 0) goto L_0x004f
            org.json.JSONObject r9 = r8.optJSONObject(r5)
        L_0x004f:
            if (r9 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            org.json.JSONObject r9 = r8.optJSONObject(r4)
        L_0x0056:
            return r9
        L_0x0057:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            org.json.JSONObject r9 = r8.optJSONObject(r4)
        L_0x0062:
            return r9
        L_0x0063:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            org.json.JSONObject r9 = r8.optJSONObject(r5)
        L_0x006e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9636c0.mo63654a(org.json.JSONObject, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: b */
    public final C9821l2 mo63655b(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context) {
        C9699f4 a = C9699f4.m28021a(q1Var, aVar, context);
        C9821l2 newBanner = C9821l2.newBanner();
        if (!a.mo64019a(jSONObject, newBanner, this.f23695a)) {
            return null;
        }
        return newBanner;
    }
}
