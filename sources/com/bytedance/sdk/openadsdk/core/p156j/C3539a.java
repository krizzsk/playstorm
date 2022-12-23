package com.bytedance.sdk.openadsdk.core.p156j;

import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a */
/* compiled from: VastAdConfig */
public class C3539a {

    /* renamed from: a */
    C3567d f8879a = new C3567d(this);

    /* renamed from: b */
    C3547b f8880b;

    /* renamed from: c */
    C3557c f8881c;

    /* renamed from: d */
    private String f8882d;

    /* renamed from: e */
    private String f8883e;

    /* renamed from: f */
    private String f8884f;

    /* renamed from: g */
    private String f8885g;

    /* renamed from: h */
    private double f8886h;

    /* renamed from: i */
    private String f8887i;

    /* renamed from: j */
    private String f8888j;

    /* renamed from: a */
    public C3567d mo19977a() {
        return this.f8879a;
    }

    /* renamed from: b */
    public C3547b mo19983b() {
        return this.f8880b;
    }

    /* renamed from: c */
    public C3557c mo19985c() {
        return this.f8881c;
    }

    /* renamed from: d */
    public String mo19987d() {
        return this.f8882d;
    }

    /* renamed from: e */
    public String mo19989e() {
        return this.f8883e;
    }

    /* renamed from: f */
    public String mo19991f() {
        return this.f8884f;
    }

    /* renamed from: g */
    public String mo19993g() {
        return this.f8885g;
    }

    /* renamed from: a */
    public void mo19980a(C3547b bVar) {
        if (bVar != null) {
            bVar.mo20024a(this.f8885g);
        }
        this.f8880b = bVar;
    }

    /* renamed from: a */
    public void mo19981a(C3557c cVar) {
        if (cVar != null) {
            cVar.mo20024a(this.f8885g);
        }
        this.f8881c = cVar;
    }

    /* renamed from: a */
    public void mo19982a(String str) {
        this.f8882d = str;
    }

    /* renamed from: b */
    public void mo19984b(String str) {
        this.f8883e = str;
    }

    /* renamed from: c */
    public void mo19986c(String str) {
        this.f8884f = str;
    }

    /* renamed from: d */
    public void mo19988d(String str) {
        this.f8885g = str;
    }

    /* renamed from: h */
    public double mo19994h() {
        return this.f8886h;
    }

    /* renamed from: a */
    public void mo19978a(double d) {
        this.f8886h = d;
    }

    /* renamed from: i */
    public String mo19995i() {
        String str = this.f8888j;
        if (str == null) {
            return this.f8884f;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -360520052) {
            if (hashCode == 519982247 && str.equals("VAST_END_CARD")) {
                c = 1;
            }
        } else if (str.equals("VAST_ICON")) {
            c = 0;
        }
        if (c == 0) {
            C3547b bVar = this.f8880b;
            return bVar != null ? bVar.f8940h : this.f8884f;
        } else if (c != 1) {
            return this.f8884f;
        } else {
            C3557c cVar = this.f8881c;
            return cVar != null ? cVar.f8940h : this.f8884f;
        }
    }

    /* renamed from: e */
    public void mo19990e(String str) {
        this.f8888j = str;
    }

    /* renamed from: j */
    public JSONObject mo19996j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f8879a.mo20035a());
        C3547b bVar = this.f8880b;
        if (bVar != null) {
            jSONObject.put("vastIcon", bVar.mo20006a());
        }
        C3557c cVar = this.f8881c;
        if (cVar != null) {
            jSONObject.put("endCard", cVar.mo20006a());
        }
        jSONObject.put("title", this.f8882d);
        jSONObject.put("description", this.f8883e);
        jSONObject.put("clickThroughUrl", this.f8884f);
        jSONObject.put("videoUrl", this.f8885g);
        jSONObject.put("videDuration", this.f8886h);
        jSONObject.put("tag", this.f8887i);
        return jSONObject;
    }

    /* renamed from: a */
    public static C3539a m11052a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3539a aVar = new C3539a();
        aVar.f8879a.mo20045a(jSONObject.optJSONObject("videoTrackers"));
        aVar.f8880b = C3547b.m11102a(jSONObject.optJSONObject("vastIcon"));
        aVar.f8881c = C3557c.m11132b(jSONObject.optJSONObject("endCard"));
        aVar.f8882d = jSONObject.optString("title");
        aVar.f8883e = jSONObject.optString("description");
        aVar.f8884f = jSONObject.optString("clickThroughUrl");
        aVar.f8885g = jSONObject.optString("videoUrl");
        aVar.f8886h = jSONObject.optDouble("videDuration");
        aVar.f8887i = jSONObject.optString("tag");
        return aVar;
    }

    /* renamed from: a */
    public void mo19979a(C3498n nVar) {
        this.f8879a.mo20038a(nVar);
    }

    /* renamed from: k */
    public String mo19997k() {
        return this.f8887i;
    }

    /* renamed from: f */
    public void mo19992f(String str) {
        this.f8887i = str;
        this.f8879a.mo20041a(str);
    }
}
