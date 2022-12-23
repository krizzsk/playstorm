package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.l */
/* compiled from: LoadVideoSuccessModel */
public class C3147l implements C3138c {

    /* renamed from: a */
    private String f7423a;

    /* renamed from: b */
    private long f7424b;

    /* renamed from: c */
    private long f7425c;

    /* renamed from: d */
    private long f7426d;

    /* renamed from: a */
    public void mo18704a(String str) {
        this.f7423a = str;
    }

    /* renamed from: a */
    public void mo18703a(long j) {
        this.f7424b = j;
    }

    /* renamed from: b */
    public void mo18705b(long j) {
        this.f7425c = j;
    }

    /* renamed from: c */
    public void mo18706c(long j) {
        this.f7426d = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7423a);
                jSONObject.put("preload_size", this.f7424b);
                jSONObject.put("load_time", this.f7425c);
                jSONObject.put("local_cache", this.f7426d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
