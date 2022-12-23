package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.h */
/* compiled from: FeedPlayModel */
public class C3143h implements C3138c {

    /* renamed from: a */
    private long f7410a;

    /* renamed from: b */
    private long f7411b;

    /* renamed from: c */
    private int f7412c;

    /* renamed from: a */
    public void mo18695a(long j) {
        this.f7410a = j;
    }

    /* renamed from: b */
    public void mo18696b(long j) {
        this.f7411b = j;
    }

    /* renamed from: a */
    public void mo18694a(int i) {
        this.f7412c = i;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("video_start_duration", this.f7410a);
                jSONObject.put("video_cache_size", this.f7411b);
                jSONObject.put("is_auto_play", this.f7412c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
