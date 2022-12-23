package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.f */
/* compiled from: FeedOverModel */
public class C3141f implements C3138c {

    /* renamed from: a */
    private long f7405a;

    /* renamed from: b */
    private long f7406b;

    /* renamed from: c */
    private int f7407c = 0;

    /* renamed from: a */
    public void mo18690a(long j) {
        this.f7405a = j;
    }

    /* renamed from: b */
    public void mo18691b(long j) {
        this.f7406b = j;
    }

    /* renamed from: a */
    public void mo18689a(int i) {
        this.f7407c = i;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f7405a);
                jSONObject.put("buffers_time", this.f7406b);
                jSONObject.put("video_backup", this.f7407c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
