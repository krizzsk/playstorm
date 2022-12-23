package com.bytedance.sdk.openadsdk.core.p147c;

import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p147c.p148a.C3457a;
import com.bytedance.sdk.openadsdk.core.p147c.p148a.C3458b;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a */
/* compiled from: DynamicUtils */
public class C3456a {
    /* renamed from: a */
    public static String m10360a(C2633l lVar, C3498n nVar) {
        return m10361a(lVar.mo16749a(), lVar.mo16753e(), lVar.mo16754f(), lVar.mo16755g(), lVar.mo16756h(), lVar.mo16757i(), nVar);
    }

    /* renamed from: a */
    public static String m10361a(JSONObject jSONObject, String str, String str2, String str3, boolean z, int i, C3498n nVar) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject.put("setting", m10362a(str3, z, i, nVar));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("templateInfo", jSONObject);
        jSONObject2.put("adInfo", new C3457a(str, str3, str2).mo19463a());
        jSONObject2.put("appInfo", new C3458b().mo19464a());
        return jSONObject2.toString();
    }

    /* renamed from: a */
    private static JSONObject m10362a(String str, boolean z, int i, C3498n nVar) {
        JSONObject jSONObject = new JSONObject();
        if (C3578m.m11241h() != null) {
            try {
                int f = C4014u.m13223f(nVar);
                int f2 = C3578m.m11241h().mo19941f(String.valueOf(f));
                boolean c = C3578m.m11241h().mo19933c(String.valueOf(f));
                jSONObject.put("voice_control", C3578m.m11241h().mo19929b(f));
                jSONObject.put("rv_skip_time", f2);
                jSONObject.put("fv_skip_show", c);
                jSONObject.put("show_dislike", z);
                jSONObject.put("video_adaptation", i);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
