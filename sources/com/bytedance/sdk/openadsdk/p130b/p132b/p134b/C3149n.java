package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.n */
/* compiled from: PlayErrorModel */
public class C3149n implements C3138c {

    /* renamed from: a */
    private long f7430a;

    /* renamed from: b */
    private long f7431b;

    /* renamed from: c */
    private int f7432c;

    /* renamed from: d */
    private int f7433d;

    /* renamed from: e */
    private String f7434e;

    /* renamed from: a */
    public void mo18711a(long j) {
        this.f7430a = j;
    }

    /* renamed from: b */
    public void mo18713b(long j) {
        this.f7431b = j;
    }

    /* renamed from: a */
    public void mo18710a(int i) {
        this.f7432c = i;
    }

    /* renamed from: b */
    public void mo18712b(int i) {
        this.f7433d = i;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7430a);
                jSONObject.put("total_duration", this.f7431b);
                jSONObject.put("error_code", this.f7432c);
                jSONObject.put("extra_error_code", this.f7433d);
                jSONObject.put("error_message", this.f7434e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
