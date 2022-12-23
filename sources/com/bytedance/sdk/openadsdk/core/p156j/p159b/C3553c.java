package com.bytedance.sdk.openadsdk.core.p156j.p159b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3548a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3550b;
import com.bytedance.sdk.openadsdk.core.p156j.p160c.C3565c;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c */
/* compiled from: VastTracker */
public class C3553c {

    /* renamed from: a */
    private String f8923a;

    /* renamed from: b */
    private C3556b f8924b;

    /* renamed from: c */
    private boolean f8925c;

    /* renamed from: d */
    private boolean f8926d;

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$b */
    /* compiled from: VastTracker */
    enum C3556b {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    protected C3553c(String str, C3556b bVar, Boolean bool) {
        this.f8923a = str;
        this.f8924b = bVar;
        this.f8925c = bool.booleanValue();
    }

    /* renamed from: c */
    public String mo20018c() {
        return this.f8923a;
    }

    /* renamed from: d */
    public boolean mo20019d() {
        return this.f8925c;
    }

    /* renamed from: f_ */
    public void mo20016f_() {
        this.f8926d = true;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$a */
    /* compiled from: VastTracker */
    public static class C3555a {

        /* renamed from: a */
        private String f8927a;

        /* renamed from: b */
        private C3556b f8928b = C3556b.TRACKING_URL;

        /* renamed from: c */
        private boolean f8929c = false;

        public C3555a(String str) {
            this.f8927a = str;
        }

        /* renamed from: a */
        public C3555a mo20021a(boolean z) {
            this.f8929c = z;
            return this;
        }

        /* renamed from: a */
        public C3553c mo20022a() {
            return new C3553c(this.f8927a, this.f8928b, Boolean.valueOf(this.f8929c));
        }
    }

    /* renamed from: e */
    public boolean mo20020e() {
        return this.f8926d;
    }

    /* renamed from: a */
    public static List<String> m11114a(List<C3553c> list, C3540a aVar, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C3553c next : list) {
            if (next != null && (!next.mo20020e() || next.mo20019d())) {
                arrayList.add(next.mo20018c());
                next.mo20016f_();
            }
        }
        return new C3565c(arrayList).mo20031a(aVar).mo20030a(j).mo20032a(str).mo20033a();
    }

    /* renamed from: b */
    public static void m11120b(List<C3553c> list, C3540a aVar, long j, String str) {
        m11117a(m11114a(list, aVar, j, str));
    }

    /* renamed from: a */
    public static void m11117a(List<String> list) {
        C2916b c;
        for (String next : list) {
            if (!(next == null || (c = C3854d.m12660a().mo20705b().mo17762c()) == null)) {
                c.mo17789a(next);
                c.mo17786a(new C2912a() {
                    /* renamed from: a */
                    public void mo17771a(C2918c cVar, C2913b bVar) {
                    }

                    /* renamed from: a */
                    public void mo17772a(C2918c cVar, IOException iOException) {
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public static JSONArray m11119b(List<C3553c> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).mo20018c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static List<C3553c> m11115a(JSONArray jSONArray) {
        return m11116a(jSONArray, false);
    }

    /* renamed from: a */
    public static List<C3553c> m11116a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C3555a(optString).mo20021a(z).mo20022a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C3550b> m11118b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C3550b.C3552a(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).mo20017a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<C3548a> m11121c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C3548a.C3549a(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0)).mo20011a());
                }
            }
        }
        return arrayList;
    }
}
