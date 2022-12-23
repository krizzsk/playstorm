package com.bytedance.sdk.component.adexpress.p091a.p094c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2700f;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.c.a */
/* compiled from: TempPkgModel */
public class C2614a {

    /* renamed from: a */
    private String f5594a;

    /* renamed from: b */
    private String f5595b;

    /* renamed from: c */
    private String f5596c;

    /* renamed from: d */
    private String f5597d;

    /* renamed from: e */
    private List<C2615a> f5598e;

    /* renamed from: a */
    public String mo16670a() {
        return this.f5594a;
    }

    /* renamed from: a */
    public void mo16671a(String str) {
        this.f5594a = str;
    }

    /* renamed from: b */
    public String mo16673b() {
        return this.f5595b;
    }

    /* renamed from: b */
    public void mo16674b(String str) {
        this.f5595b = str;
    }

    /* renamed from: c */
    public String mo16675c() {
        return this.f5596c;
    }

    /* renamed from: c */
    public void mo16676c(String str) {
        this.f5596c = str;
    }

    /* renamed from: d */
    public String mo16677d() {
        return this.f5597d;
    }

    /* renamed from: d */
    public void mo16678d(String str) {
        this.f5597d = str;
    }

    /* renamed from: e */
    public List<C2615a> mo16679e() {
        if (this.f5598e == null) {
            this.f5598e = new ArrayList();
        }
        return this.f5598e;
    }

    /* renamed from: a */
    public void mo16672a(List<C2615a> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f5598e = list;
    }

    /* renamed from: f */
    public boolean mo16680f() {
        return !TextUtils.isEmpty(mo16675c()) && !TextUtils.isEmpty(mo16673b()) && !TextUtils.isEmpty(mo16670a());
    }

    /* renamed from: g */
    public String mo16681g() {
        if (!mo16680f()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", mo16670a());
            jSONObject.putOpt("version", mo16673b());
            jSONObject.putOpt("main", mo16675c());
            jSONObject.putOpt("fallback", mo16677d());
            JSONArray jSONArray = new JSONArray();
            if (mo16679e() != null) {
                for (C2615a next : mo16679e()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", next.mo16682a());
                    jSONObject2.putOpt(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, next.mo16685b());
                    jSONObject2.putOpt("level", Integer.valueOf(next.mo16687c()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.a.c.a$a */
    /* compiled from: TempPkgModel */
    public static class C2615a {

        /* renamed from: a */
        private String f5599a;

        /* renamed from: b */
        private String f5600b;

        /* renamed from: c */
        private int f5601c;

        public boolean equals(Object obj) {
            if (!(obj instanceof C2615a)) {
                return super.equals(obj);
            }
            String str = this.f5599a;
            return str != null && str.equals(((C2615a) obj).mo16682a());
        }

        /* renamed from: a */
        public String mo16682a() {
            return this.f5599a;
        }

        /* renamed from: a */
        public void mo16684a(String str) {
            this.f5599a = str;
        }

        /* renamed from: b */
        public String mo16685b() {
            return this.f5600b;
        }

        /* renamed from: b */
        public void mo16686b(String str) {
            this.f5600b = str;
        }

        /* renamed from: c */
        public int mo16687c() {
            return this.f5601c;
        }

        /* renamed from: a */
        public void mo16683a(int i) {
            this.f5601c = i;
        }
    }

    /* renamed from: e */
    public static C2614a m6694e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m6693a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C2614a m6693a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2614a aVar = new C2614a();
        aVar.mo16671a(jSONObject.optString("name"));
        aVar.mo16674b(jSONObject.optString("version"));
        aVar.mo16676c(jSONObject.optString("main"));
        String optString = jSONObject.optString("fallback_optimize");
        aVar.mo16678d(optString);
        C2700f.m7310a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C2615a aVar2 = new C2615a();
                aVar2.mo16684a(optJSONObject.optString("url"));
                aVar2.mo16686b(optJSONObject.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5));
                aVar2.mo16683a(optJSONObject.optInt("level"));
                arrayList.add(aVar2);
            }
        }
        aVar.mo16672a((List<C2615a>) arrayList);
        if (!aVar.mo16680f()) {
            return null;
        }
        return aVar;
    }
}
