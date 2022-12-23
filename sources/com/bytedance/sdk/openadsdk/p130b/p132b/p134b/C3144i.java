package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.i */
/* compiled from: LoadVideoCancelModel */
public class C3144i implements C3138c {

    /* renamed from: a */
    private String f7413a;

    /* renamed from: b */
    private long f7414b;

    public C3144i(String str, long j) {
        this.f7413a = str;
        this.f7414b = j;
    }

    /* renamed from: a */
    public void mo18680a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7413a);
                jSONObject.put("preload_size", this.f7414b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
