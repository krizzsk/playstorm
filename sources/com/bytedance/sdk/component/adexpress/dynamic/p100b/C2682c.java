package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.c */
/* compiled from: DynamicCreative */
public class C2682c {

    /* renamed from: a */
    private HashMap<String, Object> f5802a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f5803b;

    public C2682c(JSONObject jSONObject) {
        this.f5803b = jSONObject;
    }

    /* renamed from: a */
    public Object mo16948a(String str) {
        if (this.f5802a.containsKey(str)) {
            return this.f5802a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo16950b(String str) {
        return this.f5802a.containsKey(str);
    }

    /* renamed from: a */
    public void mo16949a() {
        Iterator<String> keys = this.f5803b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.f5803b.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                Object opt2 = optJSONObject.opt(next2);
                                this.f5802a.put(next + "." + i + "." + next2, opt2);
                            }
                        }
                        i++;
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if (!(opt3 instanceof JSONArray) || TextUtils.equals(next3, "short_phrase") || TextUtils.equals(next3, "long_phrase")) {
                                this.f5802a.put(next + "." + next3, opt3);
                            } else {
                                for (int i2 = 0; i2 < ((JSONArray) opt3).length(); i2++) {
                                    this.f5802a.put(next + "." + next3 + "." + i2, ((JSONArray) opt3).opt(i2));
                                }
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.f5802a.put(next, opt);
                if (opt instanceof String) {
                    this.f5802a.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys4 = jSONObject2.keys();
                while (keys4.hasNext()) {
                    String next4 = keys4.next();
                    Object opt4 = jSONObject2.opt(next4);
                    this.f5802a.put(next + "." + next4, opt4);
                }
            }
        }
    }
}
