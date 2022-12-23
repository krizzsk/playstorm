package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2682c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2683d;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2685e;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2698e;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g */
/* compiled from: DynamicLayoutInflater */
public class C2703g {

    /* renamed from: g */
    private static HashMap<String, String> f5938g;

    /* renamed from: a */
    private JSONObject f5939a;

    /* renamed from: b */
    private JSONObject f5940b;

    /* renamed from: c */
    private C2682c f5941c;

    /* renamed from: d */
    private C2704a f5942d;

    /* renamed from: e */
    private C2695b f5943e;

    /* renamed from: f */
    private C2683d f5944f;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f5938g = hashMap;
        hashMap.put("subtitle", "description");
        f5938g.put("source", "source|app.app_name");
        f5938g.put("screenshot", "dynamic_creative.screenshot");
    }

    public C2703g(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f5939a = jSONObject;
        this.f5940b = jSONObject2;
        this.f5941c = new C2682c(jSONObject2);
        this.f5942d = C2704a.m7333a(jSONObject3);
        this.f5944f = C2683d.m7036a(jSONObject4);
    }

    /* renamed from: a */
    public C2688h mo17204a() {
        JSONObject jSONObject;
        this.f5941c.mo16949a();
        try {
            jSONObject = new JSONObject(this.f5944f.f5805b);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C2688h a = mo17206a(C2697d.m7298a(this.f5939a, jSONObject), (C2688h) null);
        m7328a(a);
        C2698e eVar = new C2698e();
        C2698e.C2699a aVar = new C2698e.C2699a();
        aVar.f5927a = this.f5942d.f5945a;
        aVar.f5928b = this.f5942d.f5946b;
        aVar.f5929c = 0.0f;
        eVar.mo17195a(aVar);
        eVar.mo17194a(a, 0.0f, 0.0f);
        eVar.mo17192a();
        if (eVar.f5923a.f5795d == 65536.0f) {
            return null;
        }
        return eVar.f5923a.f5797f;
    }

    /* renamed from: a */
    private void m7328a(C2688h hVar) {
        float f;
        if (hVar != null) {
            int b = C2642b.m6898b(C2640c.m6890a(), (float) C2642b.m6896a(C2640c.m6890a()));
            if (this.f5942d.f5947c) {
                f = this.f5942d.f5945a;
            } else {
                f = Math.min(this.f5942d.f5945a, (float) b);
            }
            if (this.f5942d.f5946b == 0.0f) {
                hVar.mo17154e(f);
                hVar.mo17160i().mo16960e().mo17051i(TtmlNode.TEXT_EMPHASIS_AUTO);
                hVar.mo17156f(0.0f);
                return;
            }
            hVar.mo17154e(f);
            hVar.mo17156f(this.f5942d.f5947c ? this.f5942d.f5946b : Math.min(this.f5942d.f5946b, (float) C2642b.m6898b(C2640c.m6890a(), (float) C2642b.m6900c(C2640c.m6890a()))));
            hVar.mo17160i().mo16960e().mo17051i("fixed");
        }
    }

    /* renamed from: a */
    public C2688h mo17206a(JSONObject jSONObject, C2688h hVar) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f5944f != null) {
                C2695b bVar = new C2695b();
                this.f5943e = bVar;
                JSONObject a = bVar.mo17188a(this.f5944f.f5804a, optInt, jSONObject);
                if (a != null) {
                    jSONObject = a;
                }
            }
        }
        C2688h a2 = mo17205a(jSONObject);
        a2.mo17146b(hVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            a2.mo17143a((List<C2688h>) null);
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i2);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    i = a2.mo17160i().mo16960e().mo16979Q();
                } else {
                    i = optJSONArray2.length();
                }
                for (int i3 = 0; i3 < i; i3++) {
                    C2688h a3 = mo17206a(optJSONArray2.optJSONObject(i3), a2);
                    arrayList.add(a3);
                    arrayList3.add(a3);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            a2.mo17143a((List<C2688h>) arrayList);
        }
        if (arrayList2.size() > 0) {
            a2.mo17148b((List<List<C2688h>>) arrayList2);
        }
        return a2;
    }

    /* renamed from: a */
    public C2688h mo17205a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        C2708j.m7344a(optString, optJSONObject);
        JSONObject a = C2708j.m7341a(optString, C2708j.m7342a(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        C2688h hVar = new C2688h();
        if (TextUtils.isEmpty(optString2)) {
            hVar.mo17147b(String.valueOf(hVar.hashCode()));
        } else {
            hVar.mo17147b(optString2);
        }
        if (optJSONObject != null) {
            hVar.mo17150c((float) optJSONObject.optDouble("x"));
            hVar.mo17152d((float) optJSONObject.optDouble("y"));
            hVar.mo17154e((float) optJSONObject.optDouble("width"));
            hVar.mo17156f((float) optJSONObject.optDouble("height"));
            hVar.mo17158g((float) optJSONObject.optInt("remainWidth"));
            C2685e eVar = new C2685e();
            eVar.mo16953a(optString);
            eVar.mo16956b(optJSONObject.optString("data"));
            eVar.mo16958c(optJSONObject.optString("dataExtraInfo"));
            C2686f c = C2686f.m7050c(optJSONObject);
            eVar.mo16952a(c);
            C2686f c2 = C2686f.m7050c(a);
            if (c2 == null) {
                eVar.mo16955b(c);
            } else {
                eVar.mo16955b(c2);
            }
            m7327a(c);
            m7327a(c2);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f5940b) != null) {
                m7326a(eVar, jSONObject2.optInt("image_mode"));
            }
            String b = eVar.mo16954b();
            C2686f e = eVar.mo16960e();
            if (f5938g.containsKey(b) && !e.mo16969G()) {
                e.mo17083r(f5938g.get(b));
            }
            if (e.mo16969G()) {
                str = eVar.mo16957c();
            } else {
                str = m7325a(eVar.mo16957c());
            }
            if (C2640c.m6891b()) {
                if (TextUtils.equals(b, "star") || TextUtils.equals(b, "text_star")) {
                    str = m7325a("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(b, "score-count") || TextUtils.equals(b, "score-count-type-1") || TextUtils.equals(b, "score-count-type-2")) {
                    str = m7325a("dynamic_creative.comment_num_i18n|");
                }
            }
            if (TextUtils.isEmpty(m7329b()) || (!TextUtils.equals("logo-union", optString) && !TextUtils.equals("logo", optString))) {
                eVar.mo16956b(str);
            } else {
                eVar.mo16956b(str + "adx:" + m7329b());
            }
            hVar.mo17140a(eVar);
        }
        return hVar;
    }

    /* renamed from: a */
    private void m7326a(C2685e eVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            eVar.mo16953a("video");
            String a = C2708j.m7340a("video");
            eVar.mo16960e().mo17083r(a);
            eVar.mo16961f().mo17083r(a);
            eVar.mo16956b(a);
            eVar.mo16960e().mo17008al();
            return;
        }
        eVar.mo16953a("image");
        String a2 = C2708j.m7340a("image");
        eVar.mo16960e().mo17083r(a2);
        eVar.mo16961f().mo17083r(a2);
        eVar.mo16956b(a2);
        if (a2 != null && (lastIndexOf = a2.lastIndexOf(".")) > 0) {
            String substring = a2.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", m7325a(substring + ".width"));
                jSONObject.put("height", m7325a(substring + ".height"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            eVar.mo16958c(jSONObject.toString());
        }
        eVar.mo16960e().mo17009am();
    }

    /* renamed from: a */
    private String m7325a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f5941c.mo16950b(str2)) {
                String valueOf = String.valueOf(this.f5941c.mo16948a(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    private String m7329b() {
        C2682c cVar = this.f5941c;
        if (cVar == null) {
            return "";
        }
        return String.valueOf(cVar.mo16948a("adx_name"));
    }

    /* renamed from: a */
    private void m7327a(C2686f fVar) {
        if (fVar != null) {
            String s = fVar.mo17084s();
            if (!TextUtils.isEmpty(s)) {
                int indexOf = s.indexOf("{{");
                int indexOf2 = s.indexOf("}}");
                if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
                    String a = m7325a(s.substring(indexOf + 1, indexOf2));
                    if (!TextUtils.isEmpty(a)) {
                        fVar.mo17059k((s.substring(0, indexOf) + s.substring(indexOf2 + 2)) + a);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.g$a */
    /* compiled from: DynamicLayoutInflater */
    static class C2704a {

        /* renamed from: a */
        float f5945a;

        /* renamed from: b */
        float f5946b;

        /* renamed from: c */
        boolean f5947c;

        /* renamed from: a */
        public static C2704a m7333a(JSONObject jSONObject) {
            C2704a aVar = new C2704a();
            if (jSONObject != null) {
                aVar.f5945a = (float) jSONObject.optDouble("width");
                aVar.f5946b = (float) jSONObject.optDouble("height");
                aVar.f5947c = jSONObject.optBoolean("isLandscape");
            }
            return aVar;
        }
    }
}
