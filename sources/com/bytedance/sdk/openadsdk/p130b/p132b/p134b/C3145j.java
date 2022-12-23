package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.j */
/* compiled from: LoadVideoErrorModel */
public class C3145j implements C3138c {

    /* renamed from: a */
    private String f7415a;

    /* renamed from: b */
    private long f7416b;

    /* renamed from: c */
    private long f7417c;

    /* renamed from: d */
    private int f7418d;

    /* renamed from: e */
    private String f7419e;

    /* renamed from: f */
    private String f7420f;

    /* renamed from: a */
    public void mo18699a(String str) {
        this.f7415a = str;
    }

    /* renamed from: a */
    public void mo18698a(long j) {
        this.f7416b = j;
    }

    /* renamed from: b */
    public void mo18700b(long j) {
        this.f7417c = j;
    }

    /* renamed from: a */
    public void mo18697a(int i) {
        this.f7418d = i;
    }

    /* renamed from: b */
    public void mo18701b(String str) {
        this.f7419e = str;
    }

    /* renamed from: c */
    public void mo18702c(String str) {
        this.f7420f = str;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7415a);
                jSONObject.put("preload_size", this.f7416b);
                jSONObject.put("load_time", this.f7417c);
                jSONObject.put("error_code", this.f7418d);
                jSONObject.put("error_message", this.f7419e);
                jSONObject.put("error_message_server", this.f7420f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
