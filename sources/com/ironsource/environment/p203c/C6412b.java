package com.ironsource.environment.p203c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c.b */
public final class C6412b {
    static {
        new C6412b();
    }

    /* renamed from: a */
    public static HashMap<String, Object> m19255a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object a;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            if (next.getValue() instanceof JSONObject) {
                a = m19259b((JSONObject) next.getValue());
            } else if (next.getValue() instanceof JSONArray) {
                a = m19257a((JSONArray) next.getValue());
            } else if (next.getValue() instanceof Map) {
                a = m19256a((Map<String, Object>) (Map) next.getValue());
            } else {
                hashMap.put(next.getKey(), next.getValue());
            }
            hashMap.put(next.getKey(), a);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, Object> m19256a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            hashMap.put(next, map.get(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    private static JSONArray m19257a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m19258a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m19259b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}
