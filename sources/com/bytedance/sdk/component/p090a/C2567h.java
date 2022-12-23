package com.bytedance.sdk.component.p090a;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.h */
/* compiled from: DataConverterActual */
class C2567h {

    /* renamed from: a */
    private C2574l f5482a;

    /* renamed from: a */
    static C2567h m6518a(C2574l lVar) {
        return new C2567h(lVar);
    }

    private C2567h(C2574l lVar) {
        this.f5482a = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T mo16569a(String str, Type type) throws JSONException {
        m6519a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f5482a.mo16585a(str, type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> String mo16570a(T t) {
        String str;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f5482a.mo16586a(t);
        }
        m6519a(str);
        return str;
    }

    /* renamed from: a */
    private static void m6519a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C2568i.m6522a((RuntimeException) new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n " + str));
        }
    }
}
