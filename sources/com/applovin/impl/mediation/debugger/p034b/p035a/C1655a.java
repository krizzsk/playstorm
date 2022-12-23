package com.applovin.impl.mediation.debugger.p034b.p035a;

import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.a */
public class C1655a implements Comparable<C1655a> {

    /* renamed from: a */
    private final String f2326a;

    /* renamed from: b */
    private final String f2327b;

    /* renamed from: c */
    private final MaxAdFormat f2328c;

    /* renamed from: d */
    private final C1657c f2329d;

    /* renamed from: e */
    private final List<C1657c> f2330e;

    public C1655a(JSONObject jSONObject, Map<String, C1661b> map, C1959m mVar) {
        this.f2326a = JsonUtils.getString(jSONObject, "name", "");
        this.f2327b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f2328c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", (String) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f2330e = new ArrayList(jSONArray.length());
        C1657c cVar = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C1657c cVar2 = new C1657c(jSONObject2, map, this.f2328c, mVar);
                this.f2330e.add(cVar2);
                if (cVar == null && cVar2.mo13413c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f2329d = cVar;
    }

    /* renamed from: g */
    private C1657c m3343g() {
        if (!this.f2330e.isEmpty()) {
            return this.f2330e.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public int compareTo(C1655a aVar) {
        return this.f2327b.compareToIgnoreCase(aVar.f2327b);
    }

    /* renamed from: a */
    public String mo13399a() {
        return this.f2326a;
    }

    /* renamed from: b */
    public String mo13400b() {
        return this.f2327b;
    }

    /* renamed from: c */
    public String mo13401c() {
        MaxAdFormat maxAdFormat = this.f2328c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    /* renamed from: d */
    public MaxAdFormat mo13403d() {
        return this.f2328c;
    }

    /* renamed from: e */
    public C1657c mo13404e() {
        C1657c cVar = this.f2329d;
        return cVar != null ? cVar : m3343g();
    }

    /* renamed from: f */
    public String mo13405f() {
        return "\n---------- " + this.f2327b + " ----------" + "\nIdentifier - " + this.f2326a + "\nFormat     - " + mo13401c();
    }
}
