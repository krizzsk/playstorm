package com.applovin.impl.mediation.debugger.p034b.p036b;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.a */
public class C1660a {

    /* renamed from: a */
    private final String f2346a;

    /* renamed from: b */
    private final String f2347b;

    /* renamed from: c */
    private final boolean f2348c;

    C1660a(JSONObject jSONObject, C1959m mVar) {
        this.f2346a = JsonUtils.getString(jSONObject, "name", "");
        this.f2347b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", (List) null);
        this.f2348c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    /* renamed from: a */
    public static boolean m3367a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    /* renamed from: a */
    public String mo13424a() {
        return this.f2346a;
    }

    /* renamed from: b */
    public String mo13425b() {
        return this.f2347b;
    }

    /* renamed from: c */
    public boolean mo13426c() {
        return this.f2348c;
    }
}
