package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.b */
/* compiled from: EndcardSkipModel */
public class C3137b implements C3138c {

    /* renamed from: a */
    private long f7395a;

    /* renamed from: b */
    private long f7396b;

    /* renamed from: c */
    private int f7397c;

    /* renamed from: d */
    private int f7398d;

    /* renamed from: a */
    public void mo18679a(long j) {
        this.f7395a = j;
    }

    /* renamed from: b */
    public void mo18682b(long j) {
        this.f7396b = j;
    }

    /* renamed from: a */
    public void mo18678a(int i) {
        this.f7397c = i;
    }

    /* renamed from: b */
    public void mo18681b(int i) {
        this.f7398d = i;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7395a);
                jSONObject.put("total_duration", this.f7396b);
                jSONObject.put("vbtt_skip_type", this.f7397c);
                jSONObject.put("skip_reason", this.f7398d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
