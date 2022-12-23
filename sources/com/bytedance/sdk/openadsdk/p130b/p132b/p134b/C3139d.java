package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.d */
/* compiled from: FeedBreakModel */
public class C3139d implements C3138c {

    /* renamed from: a */
    public long f7399a;

    /* renamed from: b */
    public long f7400b;

    /* renamed from: c */
    public int f7401c;

    /* renamed from: d */
    public int f7402d = 0;

    /* renamed from: a */
    public void mo18684a(long j) {
        this.f7399a = j;
    }

    /* renamed from: b */
    public void mo18686b(long j) {
        this.f7400b = j;
    }

    /* renamed from: a */
    public void mo18683a(int i) {
        this.f7401c = i;
    }

    /* renamed from: b */
    public void mo18685b(int i) {
        this.f7402d = i;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f7399a);
                jSONObject.put("buffers_time", this.f7400b);
                jSONObject.put("break_reason", this.f7401c);
                jSONObject.put("video_backup", this.f7402d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
