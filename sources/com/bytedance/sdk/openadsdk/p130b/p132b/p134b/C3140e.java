package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.e */
/* compiled from: FeedContinueModel */
public class C3140e implements C3138c {

    /* renamed from: a */
    private long f7403a;

    /* renamed from: b */
    private long f7404b;

    /* renamed from: a */
    public void mo18687a(long j) {
        this.f7403a = j;
    }

    /* renamed from: b */
    public void mo18688b(long j) {
        this.f7404b = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7403a);
                jSONObject.put("total_duration", this.f7404b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
