package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.m */
/* compiled from: PlayBufferModel */
public class C3148m implements C3138c {

    /* renamed from: a */
    public long f7427a;

    /* renamed from: b */
    public int f7428b;

    /* renamed from: c */
    public long f7429c;

    /* renamed from: a */
    public void mo18708a(long j) {
        this.f7427a = j;
    }

    /* renamed from: a */
    public void mo18707a(int i) {
        this.f7428b = i;
    }

    /* renamed from: b */
    public void mo18709b(long j) {
        this.f7429c = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7427a);
                jSONObject.put("buffers_count", this.f7428b);
                jSONObject.put("total_duration", this.f7429c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
