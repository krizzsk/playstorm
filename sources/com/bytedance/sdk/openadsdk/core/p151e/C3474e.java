package com.bytedance.sdk.openadsdk.core.p151e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.e */
/* compiled from: AutoTestModel */
public class C3474e {

    /* renamed from: a */
    private String f8429a = "";

    /* renamed from: b */
    private List<String> f8430b = new ArrayList();

    public C3474e(String str) {
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : m10436a(str);
        try {
            this.f8429a = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.f8430b = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f8430b.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo19508a() {
        return this.f8429a;
    }

    /* renamed from: b */
    public List<String> mo19509b() {
        return this.f8430b;
    }

    /* renamed from: a */
    private static final HashMap<String, Object> m10436a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString("value"));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
