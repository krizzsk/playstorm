package com.bytedance.sdk.openadsdk.core.nativeexpress.p161a;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.a.a */
/* compiled from: TemplateUtils */
public class C3594a {

    /* renamed from: a */
    private static String f9101a = "";

    /* renamed from: a */
    public static boolean m11343a(C3498n nVar) {
        return true;
    }

    /* renamed from: a */
    public static boolean m11342a(C3498n.C3499a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.mo19762b()) || TextUtils.isEmpty(aVar.mo19768e())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m11340a(float f, float f2, boolean z, C3498n nVar) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!m11342a(nVar.mo19604G())) {
                f9101a = "";
            }
            jSONObject.put(TapjoyConstants.TJC_PLATFORM, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, m11341a(false, nVar));
            if (nVar.mo19604G() != null) {
                str2 = nVar.mo19604G().mo19768e();
                str = nVar.mo19604G().mo19770f();
            } else {
                str2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                f9101a = str2;
            } else if (!(nVar == null || nVar.mo19604G() == null || C2603a.m6644c(nVar.mo19604G().mo19762b()) == null)) {
                f9101a = C2603a.m6644c(nVar.mo19604G().mo19762b()).mo16699e();
            }
            jSONObject.put("template_Plugin", f9101a);
            jSONObject.put("diff_template_Plugin", str);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m11341a(boolean z, C3498n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nVar.mo19620W());
            if (nVar.mo19610M() != null) {
                if (nVar.mo19610M() != null) {
                    if (!TextUtils.isEmpty(nVar.mo19610M().mo19559a())) {
                        jSONObject.put(RewardPlus.ICON, nVar.mo19610M().mo19559a());
                    }
                }
                jSONObject.put(RewardPlus.ICON, "");
            }
            JSONArray jSONArray = new JSONArray();
            if (nVar.mo19613P() != null) {
                for (int i = 0; i < nVar.mo19613P().size(); i++) {
                    C3484k kVar = nVar.mo19613P().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", kVar.mo19566c());
                    jSONObject2.put("width", kVar.mo19563b());
                    jSONObject2.put("url", kVar.mo19559a());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nVar.mo19660ad());
            jSONObject.put("interaction_type", nVar.mo19609L());
            jSONObject.put("interaction_method", nVar.mo19708g());
            jSONObject.put("is_compliance_template", m11343a(nVar));
            jSONObject.put("title", nVar.mo19618U());
            jSONObject.put("description", nVar.mo19619V());
            jSONObject.put("source", nVar.mo19608K());
            if (nVar.mo19657aa() != null) {
                jSONObject.put("comment_num", nVar.mo19657aa().mo19501e());
                jSONObject.put("score", nVar.mo19657aa().mo19500d());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, nVar.mo19657aa().mo19502f());
                jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, nVar.mo19657aa().mo19503g());
            }
            if (nVar.mo19607J() != null) {
                jSONObject.put("video", nVar.mo19607J().mo16368p());
            }
            if (nVar.mo19604G() != null) {
                jSONObject.put("dynamic_creative", nVar.mo19604G().mo19772g());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11339a(C3498n nVar, String str) {
        List<C3484k> P;
        if (!(nVar == null || (P = nVar.mo19613P()) == null || P.size() <= 0)) {
            for (C3484k next : P) {
                if (next != null && TextUtils.equals(str, next.mo19559a())) {
                    return next.mo19570g();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m11344b(C3498n nVar) {
        HashMap hashMap = null;
        if (nVar == null) {
            return null;
        }
        List<C3484k> P = nVar.mo19613P();
        if (P != null && P.size() > 0) {
            hashMap = new HashMap();
            for (C3484k next : P) {
                if (next != null) {
                    hashMap.put(next.mo19559a(), next.mo19570g());
                }
            }
        }
        return hashMap;
    }
}
