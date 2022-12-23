package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.C9822l3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.m */
public class C9833m extends C9635c<C9962t1> {

    /* renamed from: a */
    public final int f24260a;

    public C9833m(int i) {
        this.f24260a = i;
    }

    /* renamed from: a */
    public static C9635c<C9962t1> m28606a(int i) {
        return new C9833m(i);
    }

    /* renamed from: a */
    public C9962t1 mo63651a(String str, C9915q1 q1Var, C9962t1 t1Var, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject a = C9635c.m27712a(str, aVar2, l3Var);
        if (a == null || (optJSONObject = a.optJSONObject(aVar.getFormat())) == null || (optJSONArray = optJSONObject.optJSONArray("banners")) == null || optJSONArray.length() <= 0 || (optJSONObject2 = optJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        C9944s1 newBanner = C9944s1.newBanner();
        String optString = optJSONObject2.optString("id");
        if (TextUtils.isEmpty(optString)) {
            optString = optJSONObject2.optString("bannerID", newBanner.getId());
        }
        newBanner.setId(optString);
        String optString2 = optJSONObject2.optString("type");
        if (!TextUtils.isEmpty(optString2)) {
            newBanner.setType(optString2);
        }
        if (optJSONObject2.optJSONArray("statistics") != null) {
            C9677e4.m27903b(q1Var, aVar, context).mo64167a(newBanner.getStatHolder(), optJSONObject2, optString, (float) this.f24260a);
        }
        if (!newBanner.getStatHolder().mo63684e()) {
            return null;
        }
        C9962t1 d = C9962t1.m29321d();
        d.mo65444a(newBanner);
        return d;
    }
}
