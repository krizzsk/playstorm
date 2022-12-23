package com.p374my.target;

import android.content.Context;
import com.p374my.target.C10068z3;
import com.p374my.target.C9822l3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.t */
public class C9958t extends C9635c<C9997v2> implements C10068z3.C10069a {
    /* renamed from: a */
    public static C9635c<C9997v2> m29276a() {
        return new C9958t();
    }

    /* renamed from: a */
    public C9916q2 mo63652a(JSONObject jSONObject, C9915q1 q1Var, C9596a aVar, Context context) {
        C9997v2 f = C9997v2.m29554f();
        C9602a4 a = C9602a4.m27591a(q1Var, aVar, context);
        C9733h2 newBanner = C9733h2.newBanner();
        a.mo63453a(jSONObject, newBanner);
        f.mo65602a(newBanner);
        return f;
    }

    /* renamed from: a */
    public C9997v2 mo63651a(String str, C9915q1 q1Var, C9997v2 v2Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        JSONObject optJSONObject;
        C9839m2 b;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null) {
            return null;
        }
        if (v2Var == null) {
            v2Var = C9997v2.m29554f();
        }
        JSONObject optJSONObject2 = a.optJSONObject(aVar.getFormat());
        if (optJSONObject2 != null) {
            JSONArray optJSONArray = optJSONObject2.optJSONArray("banners");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                C9602a4 a2 = C9602a4.m27591a(q1Var, aVar, context);
                int bannersCount = aVar.getBannersCount();
                if (bannersCount > 0) {
                    int length = optJSONArray.length();
                    if (bannersCount > length) {
                        bannersCount = length;
                    }
                } else {
                    bannersCount = 1;
                }
                for (int i = 0; i < bannersCount; i++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                    if (optJSONObject3 != null) {
                        C9733h2 newBanner = C9733h2.newBanner();
                        a2.mo63453a(optJSONObject3, newBanner);
                        v2Var.mo65602a(newBanner);
                    }
                }
                if (v2Var.mo65292a() > 0) {
                    return v2Var;
                }
            }
            return null;
        } else if (!aVar.isMediationEnabled() || (optJSONObject = a.optJSONObject("mediation")) == null || (b = C10068z3.m29875a(this, q1Var, aVar, context).mo65863b(optJSONObject)) == null) {
            return null;
        } else {
            v2Var.mo65293a(b);
            return v2Var;
        }
    }
}
