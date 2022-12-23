package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2683d;
import com.tapjoy.TJAdUnitConstants;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.b */
/* compiled from: CustomComponentManager */
public class C2695b {
    /* renamed from: a */
    public JSONObject mo17188a(List<C2683d.C2684a> list, int i, JSONObject jSONObject) {
        C2683d.C2684a aVar;
        JSONObject jSONObject2;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<C2683d.C2684a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar != null && aVar.f5808a == i) {
                break;
            }
        }
        if (aVar == null || (jSONObject2 = aVar.f5809b) == null) {
            return null;
        }
        return m7292a(jSONObject2, jSONObject);
    }

    /* renamed from: a */
    private static JSONObject m7292a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.put(next, optJSONObject2.opt(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (!TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (TextUtils.equals(next2, TJAdUnitConstants.String.USAGE_TRACKER_VALUES)) {
                        jSONObject3.put(next2, optJSONObject);
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                    }
                }
            }
            jSONObject3.put("type", "vessel");
            JSONObject optJSONObject3 = jSONObject2.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
            JSONObject optJSONObject4 = jSONObject3.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
            if (!(optJSONObject3 == null || optJSONObject4 == null)) {
                Iterator<String> keys3 = optJSONObject3.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    optJSONObject4.put(next3, optJSONObject3.opt(next3));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }
}
