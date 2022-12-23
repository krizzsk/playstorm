package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.g */
/* compiled from: FeedPauseModel */
public class C3142g implements C3138c {

    /* renamed from: a */
    private long f7408a;

    /* renamed from: b */
    private long f7409b;

    /* renamed from: a */
    public void mo18692a(long j) {
        this.f7408a = j;
    }

    /* renamed from: b */
    public void mo18693b(long j) {
        this.f7409b = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7408a);
                jSONObject.put("total_duration", this.f7409b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
