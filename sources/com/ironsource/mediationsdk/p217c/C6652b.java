package com.ironsource.mediationsdk.p217c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6695e;
import com.ironsource.mediationsdk.utils.C6765c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c.b */
public class C6652b {

    /* renamed from: a */
    private String f17279a;

    /* renamed from: b */
    private String f17280b;

    /* renamed from: c */
    private C6695e f17281c;

    public C6652b(String str, String str2, C6695e eVar) {
        this.f17279a = str;
        this.f17280b = str2;
        this.f17281c = eVar;
    }

    /* renamed from: a */
    private static Object m20269a(Object obj) {
        return obj instanceof JSONObject ? m20271a((JSONObject) obj) : obj instanceof JSONArray ? m20270a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private static List<Object> m20270a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m20269a(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e.getMessage()}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m20271a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m20269a(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e.getMessage()}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m20272a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), m20274b(next.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", new Object[]{next.getKey(), next.getValue()}));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20273a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static Object m20274b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(Arrays.asList(new Object[]{obj}));
            } else if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj instanceof Enum) {
                    return obj.toString();
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo36649a() {
        return this.f17279a;
    }

    /* renamed from: b */
    public String mo36650b() {
        return this.f17280b;
    }

    /* renamed from: c */
    public boolean mo36651c() {
        return this.f17281c.f17494g.f17673e > 0;
    }

    /* renamed from: d */
    public long mo36652d() {
        return this.f17281c.f17494g.f17677i;
    }

    /* renamed from: e */
    public int mo36653e() {
        return this.f17281c.f17493f;
    }

    /* renamed from: f */
    public long mo36654f() {
        return this.f17281c.f17489b;
    }

    /* renamed from: g */
    public int mo36655g() {
        return this.f17281c.f17492e;
    }

    /* renamed from: h */
    public C6765c mo36656h() {
        return this.f17281c.f17494g;
    }
}
