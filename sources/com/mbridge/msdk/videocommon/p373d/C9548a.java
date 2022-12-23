package com.mbridge.msdk.videocommon.p373d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.a */
/* compiled from: RewardSetting */
public class C9548a {

    /* renamed from: a */
    private Map<String, Integer> f23401a;

    /* renamed from: b */
    private Map<String, C9541c> f23402b;

    /* renamed from: c */
    private long f23403c;

    /* renamed from: d */
    private long f23404d;

    /* renamed from: e */
    private long f23405e;

    /* renamed from: f */
    private long f23406f;

    /* renamed from: g */
    private long f23407g;

    /* renamed from: h */
    private long f23408h;

    /* renamed from: i */
    private String f23409i;

    /* renamed from: j */
    private int f23410j = 0;

    /* renamed from: a */
    public final String mo63105a() {
        return this.f23409i;
    }

    /* renamed from: b */
    public final long mo63109b() {
        return this.f23403c * 1000;
    }

    /* renamed from: a */
    public final void mo63107a(long j) {
        this.f23403c = j;
    }

    /* renamed from: c */
    public final long mo63112c() {
        return this.f23404d * 1000;
    }

    /* renamed from: b */
    public final void mo63110b(long j) {
        this.f23404d = j;
    }

    /* renamed from: d */
    public final long mo63114d() {
        return this.f23405e * 1000;
    }

    /* renamed from: c */
    public final void mo63113c(long j) {
        this.f23405e = j;
    }

    /* renamed from: e */
    public final long mo63116e() {
        return this.f23406f;
    }

    /* renamed from: d */
    public final void mo63115d(long j) {
        this.f23406f = j;
    }

    /* renamed from: f */
    public final long mo63118f() {
        return this.f23407g;
    }

    /* renamed from: e */
    public final void mo63117e(long j) {
        this.f23407g = j;
    }

    /* renamed from: a */
    public final void mo63106a(int i) {
        this.f23410j = i;
    }

    /* renamed from: g */
    public final long mo63119g() {
        return this.f23408h;
    }

    /* renamed from: h */
    public final Map<String, Integer> mo63120h() {
        if (this.f23401a == null) {
            HashMap hashMap = new HashMap();
            this.f23401a = hashMap;
            hashMap.put("1", 1000);
            this.f23401a.put("9", 1000);
            this.f23401a.put("8", 1000);
        }
        return this.f23401a;
    }

    /* renamed from: a */
    public final void mo63108a(Map<String, Integer> map) {
        this.f23401a = map;
    }

    /* renamed from: i */
    public final Map<String, C9541c> mo63121i() {
        return this.f23402b;
    }

    /* renamed from: b */
    public final void mo63111b(Map<String, C9541c> map) {
        this.f23402b = map;
    }

    /* renamed from: a */
    public static C9548a m27280a(String str) {
        C9548a aVar;
        C9548a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new C9548a();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return aVar2;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                aVar.f23409i = jSONObject.optString("ab_id", "");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                        if (!TextUtils.isEmpty(next)) {
                            if (TextUtils.isEmpty(next) || intValue != 0) {
                                hashMap.put(next, Integer.valueOf(intValue));
                            } else {
                                hashMap.put(next, 1000);
                            }
                        }
                    }
                    aVar.f23401a = hashMap;
                }
                aVar.f23402b = C9541c.m27263a(jSONObject.optJSONArray("reward"));
                aVar.f23403c = jSONObject.optLong("getpf", 43200);
                aVar.f23404d = jSONObject.optLong("ruct", 5400);
                aVar.f23405e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600);
                aVar.f23406f = jSONObject.optLong("dlct", 3600);
                aVar.f23407g = jSONObject.optLong("vcct", 5);
                aVar.f23408h = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e2) {
                e = e2;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }

    /* renamed from: j */
    public final JSONObject mo63122j() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f23401a != null && this.f23401a.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : this.f23401a.entrySet()) {
                        jSONObject2.put((String) next.getKey(), ((Integer) next.getValue()).intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f23402b != null && this.f23402b.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry next2 : this.f23402b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String str = (String) next2.getKey();
                        C9541c cVar = (C9541c) next2.getValue();
                        if (cVar != null) {
                            jSONObject3.put("name", cVar.mo63097a());
                            jSONObject3.put("amount", cVar.mo63100b());
                            jSONObject3.put("id", str);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f23403c);
            jSONObject.put("ruct", this.f23404d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f23405e);
            jSONObject.put("dlct", this.f23406f);
            jSONObject.put("vcct", this.f23407g);
            jSONObject.put("current_time", this.f23408h);
            jSONObject.put("isDefault", this.f23410j);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
