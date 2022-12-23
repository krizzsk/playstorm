package com.bytedance.sdk.openadsdk.core.p147c.p148a;

import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.common.C3225a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.b */
/* compiled from: DynamicAppInfo */
public class C3458b {
    /* renamed from: b */
    private List<String> m10364b() {
        return Arrays.asList(new String[]{C2933b.b1655274989200dc("aqrJjci"), C2933b.b1655274989200dc("aeKmbj"), C2933b.b1655274989200dc("gdvWahvki}oBbka")});
    }

    /* renamed from: a */
    public JSONObject mo19464a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String put : m10364b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put(C2933b.b1655274989200dc("aqrMehc"), C3225a.m9409a());
            jSONObject.put(C2975l.l1655274989215dc("iolfvDvwFhgn"), C3225a.m9414e());
            jSONObject.put(C2975l.l1655274989215dc("ahf"), C3225a.m9411b());
            jSONObject.put(C2975l.l1655274989215dc("seiF`lrngg"), C3225a.m9412c());
            jSONObject.put(C2975l.l1655274989215dc("aqrUawungg"), C3225a.m9413d());
            jSONObject.put(C2975l.l1655274989215dc("ndvW}uc"), C3225a.m9415f());
            jSONObject.put(C2975l.l1655274989215dc("strskwrKaz~"), jSONArray);
            jSONObject.put(C2975l.l1655274989215dc("ddtjg`Oc"), C3225a.m9410a(C3578m.m11231a()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
