package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.k */
/* compiled from: LoadVideoStartModel */
public class C3146k implements C3138c {

    /* renamed from: a */
    private String f7421a;

    /* renamed from: b */
    private long f7422b;

    public C3146k(String str, long j) {
        this.f7421a = str;
        this.f7422b = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7421a);
                jSONObject.put("preload_size", this.f7422b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
